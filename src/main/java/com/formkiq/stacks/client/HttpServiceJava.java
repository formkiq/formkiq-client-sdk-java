/**
 * Copyright [2020] FormKiQ Inc. Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You may obtain a copy of the License
 * at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.formkiq.stacks.client;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpRequest.Builder;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Pattern;
import org.apache.commons.io.IOUtils;
import software.amazon.awssdk.auth.credentials.AwsCredentials;
import software.amazon.awssdk.auth.signer.Aws4Signer;
import software.amazon.awssdk.auth.signer.params.Aws4SignerParams;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.http.SdkHttpFullRequest;
import software.amazon.awssdk.http.SdkHttpMethod;
import software.amazon.awssdk.regions.Region;

/**
 * Java {@link HttpClient} Implemenation.
 *
 */
public class HttpServiceJava {

  /** Headers that are not allowed to be added to {@link HttpClient}. */
  private static final Set<String> NOT_ALLOWED_HEADERS = Set.of("connection", "content-length",
      "date", "expect", "from", "host", "upgrade", "via", "warning");

  /**
   * Decode Encoded {@link String}.
   * 
   * @param encoded {@link String}
   * @return {@link String}
   */
  private static String decode(final String encoded) {
    try {
      return encoded == null ? null : URLDecoder.decode(encoded, "UTF-8");
    } catch (final UnsupportedEncodingException e) {
      throw new RuntimeException("Impossible: UTF-8 is a required encoding", e);
    }
  }

  /** {@link HttpClient}. */
  private HttpClient client;
  /** AWS {@link Region}. */
  private Optional<Region> signingRegion = Optional.empty();

  /** AWS Credentials. */
  private Optional<AwsCredentials> credentials = Optional.empty();
  /** Static HTTP Headers for all requests. */
  private Map<String, List<String>> defaultHeaders = new HashMap<>();

  /**
   * constructor.
   */
  public HttpServiceJava() {
    this.client = HttpClient.newHttpClient();
  }

  /**
   * Build a {@link SdkHttpFullRequest.Builder}.
   * 
   * @param uri URI
   * @param method {@link SdkHttpMethod}
   * @param headers {@link HttpHeaders}
   * @param payload {@link RequestBody}
   * @return {@link SdkHttpFullRequest.Builder}
   * @throws IOException IOException
   */
  private SdkHttpFullRequest.Builder buildRequest(final String uri, final SdkHttpMethod method,
      final Optional<HttpHeaders> headers, final Optional<RequestBody> payload) throws IOException {

    SdkHttpFullRequest.Builder requestBuilder =
        SdkHttpFullRequest.builder().uri(toUri(uri)).method(method);

    if (headers.isPresent()) {
      for (Map.Entry<String, List<String>> e : headers.get().map().entrySet()) {
        requestBuilder = requestBuilder.appendHeader(e.getKey(), String.join(",", e.getValue()));
      }
    }

    for (Map.Entry<String, List<String>> e : this.defaultHeaders.entrySet()) {
      requestBuilder = requestBuilder.appendHeader(e.getKey(), String.join(",", e.getValue()));
    }

    URL url = new URL(uri);
    if (url.getQuery() != null) {
      Map<String, List<String>> queryParams = Pattern.compile("&")
          .splitAsStream(new URL(uri).getQuery()).map(s -> Arrays.copyOf(s.split("="), 2))
          .collect(groupingBy(s -> decode(s[0]), mapping(s -> decode(s[1]), toList())));

      for (Map.Entry<String, List<String>> e : queryParams.entrySet()) {
        requestBuilder =
            requestBuilder.appendRawQueryParameter(e.getKey(), String.join(",", e.getValue()));
      }
    }

    if (payload.isPresent()) {
      requestBuilder = requestBuilder.contentStreamProvider(payload.get().contentStreamProvider());
    }

    return requestBuilder;
  }

  /**
   * Gets {@link AwsCredentials}.
   * 
   * @return {@link AwsCredentials}
   */
  public Optional<AwsCredentials> credentials() {
    return this.credentials;
  }

  /**
   * Set {@link AwsCredentials}.
   * 
   * @param cred {@link AwsCredentials}
   * @return {@link HttpServiceJava}
   */
  public HttpServiceJava credentials(final AwsCredentials cred) {
    this.credentials = cred != null ? Optional.of(cred) : Optional.empty();
    return this;
  }

  /**
   * Perform 'DELETE' Request.
   * 
   * @param uri {@link String}
   * @param headers {@link Optional} {@link HttpHeaders}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> delete(final String uri, final Optional<HttpHeaders> headers)
      throws IOException, InterruptedException {
    SdkHttpFullRequest.Builder request =
        buildRequest(uri, SdkHttpMethod.DELETE, headers, Optional.empty());
    SdkHttpFullRequest req = sign(request);
    return execute(req);
  }

  private HttpResponse<String> execute(final SdkHttpFullRequest request)
      throws IOException, InterruptedException {

    Builder builder = HttpRequest.newBuilder().uri(request.getUri()).timeout(Duration.ofMinutes(1));

    Map<String, List<String>> headers = request.headers();
    for (Map.Entry<String, List<String>> e : headers.entrySet()) {

      if (!NOT_ALLOWED_HEADERS.contains(e.getKey().toLowerCase())) {
        String value = String.join(",", e.getValue());
        builder = builder.setHeader(e.getKey(), value);
      }
    }

    switch (request.method()) {
      case GET:
        builder = builder.GET();
        break;
      case POST:
      case PUT:
      case PATCH:
        InputStream is = request.contentStreamProvider().get().newStream();
        byte[] bytes = IOUtils.toByteArray(is);
        builder = builder.method(request.method().name(), BodyPublishers.ofByteArray(bytes));
        break;
      case DELETE:
        builder = builder.DELETE();
        break;
      default:
        builder = builder.method(request.method().name(), HttpRequest.BodyPublishers.noBody());
    }

    return this.client.send(builder.build(), BodyHandlers.ofString());
  }

  /**
   * Perform 'GET' Request.
   * 
   * @param uri {@link String}
   * @param headers {@link HttpHeaders}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> get(final String uri, final Optional<HttpHeaders> headers)
      throws IOException, InterruptedException {
    SdkHttpFullRequest.Builder request =
        buildRequest(uri, SdkHttpMethod.GET, headers, Optional.empty());
    SdkHttpFullRequest req = sign(request);
    return execute(req);
  }

  /**
   * Set Headers sent with all Requests.
   * 
   * @param headers {@link Map}
   * @return {@link HttpServiceJava}
   */
  public HttpServiceJava headers(final Map<String, List<String>> headers) {
    this.defaultHeaders = headers;
    return this;
  }

  /**
   * Perform 'OPTIONS' Request.
   * 
   * @param uri {@link String}
   * @param headers {@link HttpHeaders}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> options(final String uri, final Optional<HttpHeaders> headers)
      throws IOException, InterruptedException {
    SdkHttpFullRequest.Builder request =
        buildRequest(uri, SdkHttpMethod.OPTIONS, headers, Optional.empty());
    SdkHttpFullRequest req = sign(request);
    return execute(req);
  }

  /**
   * Perform 'PATCH' Request.
   * 
   * @param uri {@link String}
   * @param headers {@link HttpHeaders}
   * @param payload {@link RequestBody}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> patch(final String uri, final Optional<HttpHeaders> headers,
      final RequestBody payload) throws IOException, InterruptedException {

    SdkHttpFullRequest.Builder request =
        buildRequest(uri, SdkHttpMethod.PATCH, headers, Optional.of(payload));
    SdkHttpFullRequest req = sign(request);
    return execute(req);
  }

  /**
   * Perform 'POST' Request.
   * 
   * @param uri {@link String}
   * @param headers {@link HttpHeaders}
   * @param payload {@link RequestBody}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> post(final String uri, final Optional<HttpHeaders> headers,
      final RequestBody payload) throws IOException, InterruptedException {
    SdkHttpFullRequest.Builder request =
        buildRequest(uri, SdkHttpMethod.POST, headers, Optional.of(payload));
    SdkHttpFullRequest req = sign(request);
    return execute(req);
  }

  /**
   * Perform 'PUT' Request.
   * 
   * @param uri {@link String}
   * @param headers {@link HttpHeaders}
   * @param payload {@link RequestBody}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> put(final String uri, final Optional<HttpHeaders> headers,
      final RequestBody payload) throws IOException, InterruptedException {
    SdkHttpFullRequest.Builder request =
        buildRequest(uri, SdkHttpMethod.PUT, headers, Optional.of(payload));
    SdkHttpFullRequest req = sign(request);
    return execute(req);
  }

  /**
   * AWS Signature Version 4 signing.
   * 
   * @param request {@link SdkHttpFullRequest.Builder}
   * @return {@link SdkHttpFullRequest}
   */
  private SdkHttpFullRequest sign(final SdkHttpFullRequest.Builder request) {

    SdkHttpFullRequest req = request.build();

    if (this.signingRegion.isPresent() && this.credentials.isPresent()) {
      Aws4SignerParams params = Aws4SignerParams.builder().signingName("execute-api")
          .signingRegion(this.signingRegion.get()).awsCredentials(this.credentials.get()).build();

      Aws4Signer signer = Aws4Signer.create();

      req = signer.sign(req, params);
    }

    return req;
  }

  /**
   * Gets Signing Region.
   * 
   * @return {@link Region}
   */
  public Optional<Region> signingRegion() {
    return this.signingRegion;
  }

  /**
   * Set Aws {@link Region}.
   * 
   * @param region {@link Region}
   * @return {@link HttpServiceJava}
   */
  public HttpServiceJava signingRegion(final Region region) {
    this.signingRegion = region != null ? Optional.of(region) : Optional.empty();
    return this;
  }

  /**
   * Convert {@link String} to {@link URI}.
   * 
   * @param uri {@link String}
   * @return {@link URI}
   * @throws IOException IOException
   */
  private URI toUri(final String uri) throws IOException {
    try {
      return new URI(uri);
    } catch (URISyntaxException e) {
      throw new IOException(e);
    }
  }
}
