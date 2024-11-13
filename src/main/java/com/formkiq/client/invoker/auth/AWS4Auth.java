/*
 * FormKiQ API JWT Formkiq API: Document Management Platform API using OAuth(JWT) Authentication You
 * can find out more about FormKiQ at [https://formkiq.com](http://formkiq.com). ## Introduction
 * FormKiQ is an API-first (head-less), battle-tested document management API. The FormKiQ API
 * provides all the API endpoints to build your Perfect Document Management Platform. FormKiQ API
 * was built on top of [OpenAPI specification](https://www.openapis.org), so it is easy to use the
 * API spec file with any application that supports the OpenAPI specification. Open API OAuth
 * Specification -
 * https://raw.githubusercontent.com/formkiq/formkiq-core/master/docs/openapi/openapi-jwt.yaml Open
 * API IAM Specification -
 * https://raw.githubusercontent.com/formkiq/formkiq-core/master/docs/openapi/openapi-iam.yaml ##
 * Authentication FormKiQ offers three forms of authentication: - OAuth(JWT) - AWS IAM - API Key
 *
 * The version of the OpenAPI document: 1.16.0 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.invoker.auth;

import com.formkiq.client.invoker.Pair;
import com.formkiq.client.invoker.ApiException;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

import software.amazon.awssdk.auth.credentials.AnonymousCredentialsProvider;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.AwsSessionCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentials;
import software.amazon.awssdk.auth.signer.Aws4Signer;
import software.amazon.awssdk.auth.signer.params.Aws4SignerParams;
import software.amazon.awssdk.http.ContentStreamProvider;
import software.amazon.awssdk.http.SdkHttpFullRequest;
import software.amazon.awssdk.http.SdkHttpMethod;
import software.amazon.awssdk.regions.Region;

import okio.Buffer;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-11-12T21:03:32.853177-06:00[America/Winnipeg]",
    comments = "Generator version: 7.9.0")
public class AWS4Auth implements Authentication {

  private AwsCredentials credentials;
  private String region;
  private String service;

  public AWS4Auth() {
    this.credentials = AnonymousCredentialsProvider.create().resolveCredentials();
  }

  public void setCredentials(String accessKey, String secretKey) {
    this.credentials = AwsBasicCredentials.create(accessKey, secretKey);
  }

  public void setCredentials(String accessKey, String secretKey, String sessionToken) {
    this.credentials = AwsSessionCredentials.create(accessKey, secretKey, sessionToken);
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public void setService(String service) {
    this.service = service;
  }

  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams,
      Map<String, String> cookieParams, String payload, String method, URI uri)
      throws ApiException {

    SdkHttpFullRequest.Builder requestBuilder =
        SdkHttpFullRequest.builder().uri(uri).method(SdkHttpMethod.fromValue(method));

    ContentStreamProvider provider = new ContentStreamProvider() {
      @Override
      public InputStream newStream() {
        InputStream is = new ByteArrayInputStream(payload.getBytes(StandardCharsets.UTF_8));
        return is;
      }
    };

    requestBuilder = requestBuilder.contentStreamProvider(provider);

    SdkHttpFullRequest signableRequest = sign(requestBuilder);

    Map<String, String> headers = signableRequest.headers().entrySet().stream()
        .collect(Collectors.toMap(s -> s.getKey(), e -> e.getValue().get(0)));

    headerParams.putAll(headers);
  }

  /**
   * AWS Signature Version 4 signing.
   * 
   * @param request {@link SdkHttpFullRequest.Builder}
   * @return {@link SdkHttpFullRequest}
   */
  private SdkHttpFullRequest sign(final SdkHttpFullRequest.Builder request) {

    SdkHttpFullRequest req = request.build();

    if (this.service != null && this.region != null && this.credentials != null) {
      Aws4SignerParams params = Aws4SignerParams.builder().signingName(this.service)
          .signingRegion(Region.of(this.region)).awsCredentials(this.credentials).build();

      Aws4Signer signer = Aws4Signer.create();

      req = signer.sign(req, params);
    }

    return req;
  }
}
