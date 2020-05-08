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

import java.io.IOException;
import java.net.http.HttpHeaders;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiPredicate;
import com.formkiq.stacks.client.models.DocumentSearch;
import com.formkiq.stacks.client.models.DocumentSearchQuery;
import com.formkiq.stacks.client.models.DocumentSearchTag;
import com.formkiq.stacks.client.models.NewDocument;
import com.formkiq.stacks.client.requests.AddDocumentRequest;
import com.formkiq.stacks.client.requests.AddDocumentTagRequest;
import com.formkiq.stacks.client.requests.DeleteDocumentRequest;
import com.formkiq.stacks.client.requests.DeleteDocumentTagRequest;
import com.formkiq.stacks.client.requests.GetDocumentContentUrlRequest;
import com.formkiq.stacks.client.requests.GetDocumentRequest;
import com.formkiq.stacks.client.requests.GetDocumentTagsKeyRequest;
import com.formkiq.stacks.client.requests.GetDocumentTagsRequest;
import com.formkiq.stacks.client.requests.GetDocumentUploadRequest;
import com.formkiq.stacks.client.requests.GetDocumentsRequest;
import com.formkiq.stacks.client.requests.OptionsDocumentContentUrlRequest;
import com.formkiq.stacks.client.requests.OptionsDocumentRequest;
import com.formkiq.stacks.client.requests.OptionsDocumentTagsKeyRequest;
import com.formkiq.stacks.client.requests.OptionsDocumentTagsRequest;
import com.formkiq.stacks.client.requests.OptionsDocumentUploadRequest;
import com.formkiq.stacks.client.requests.SearchDocumentsRequest;
import com.formkiq.stacks.client.requests.UpdateDocumentRequest;
import com.formkiq.stacks.client.requests.UpdateDocumentTagKeyRequest;
import com.formkiq.stacks.client.requests.VersionRequest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import software.amazon.awssdk.core.sync.RequestBody;

/**
 * Http Client for interacting with the FormKiQ API.
 *
 */
public class FormKiqHttpClient {

  /** Date Format. */
  private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ssZ";
  /** {@link Gson}. */
  private Gson gson;
  /** FormKiQ Rest API Url. */
  private String apiRestUrl;
  /** {@link FormKiqHttpClient}. */
  private HttpServiceJava client;

  /**
   * constructor.
   * 
   * @param connection {@link FormKiqHttpClientConnection}
   */
  public FormKiqHttpClient(final FormKiqHttpClientConnection connection) {
    this.client = connection.build();
    this.apiRestUrl = connection.apiRestUrl();
    this.gson = new GsonBuilder().disableHtmlEscaping().setDateFormat(DATE_FORMAT).create();
  }

  /**
   * POST(Add) /documents.
   * 
   * @param request {@link AddDocumentRequest}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> addDocument(final AddDocumentRequest request)
      throws IOException, InterruptedException {
    String body = this.gson.toJson(request.document());
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.post(u,
        createHttpHeaders("POST", buildHeaders(request.document().contentType())),
        RequestBody.fromString(body));
  }

  /**
   * Create HTTP Headers from {@link NewDocument}.
   * 
   * @param contentType {@link String}
   * @return {@link Optional} {@link Map}
   */
  private Optional<Map<String, List<String>>> buildHeaders(final String contentType) {
    Map<String, List<String>> headers = new HashMap<>();

    if (contentType != null) {
      headers.put("Content-Type", Arrays.asList(contentType));
    }

    return !headers.isEmpty() ? Optional.of(headers) : Optional.empty();
  }

  /**
   * Creates HttpHeaders.
   * 
   * @param method {@link String}
   * @param additionalHeaders {@link Optional} {@link Map}
   * @return {@link Optional} {@link HttpHeaders}
   */
  private Optional<HttpHeaders> createHttpHeaders(final String method,
      final Optional<Map<String, List<String>>> additionalHeaders) {

    final Map<String, List<String>> headers = new HashMap<>();

    additionalHeaders
        .ifPresent(h -> h.entrySet().forEach(e -> headers.put(e.getKey(), e.getValue())));

    return headers.size() > 0
        ? Optional.of(HttpHeaders.of(headers, new BiPredicate<String, String>() {
          @Override
          public boolean test(final String t, final String u) {
            return true;
          }
        }))
        : Optional.empty();
  }

  /**
   * DELETE /documents/{documentId}.
   * 
   * @param request {@link DeleteDocumentRequest}
   * @return {@link HttpResponse}
   * 
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> deleteDocument(final DeleteDocumentRequest request)
      throws IOException, InterruptedException {
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.delete(u, createHttpHeaders("DELETE", Optional.empty()));
  }

  /**
   * DELETE /documents/{documentId}/tags/{tagKey}.
   * 
   * @param request {@link DeleteDocumentTagRequest}
   * @return {@link HttpResponse} {@link String}
   * 
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  public HttpResponse<String> deleteDocumentTag(final DeleteDocumentTagRequest request)
      throws IOException, InterruptedException {
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.delete(u, createHttpHeaders("DELETE", Optional.empty()));
  }

  /**
   * GET /documents/{documentId}.
   * 
   * @param request {@link GetDocumentRequest}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> getDocument(final GetDocumentRequest request)
      throws IOException, InterruptedException {
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.get(u, createHttpHeaders("GET", Optional.empty()));
  }

  /**
   * GET /documents/{documentId}/url.
   * 
   * @param request {@link GetDocumentContentUrlRequest}
   * @return {@link HttpResponse} {@link String}
   * 
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  public HttpResponse<String> getDocumentContentUrl(final GetDocumentContentUrlRequest request)
      throws IOException, InterruptedException {
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.get(u, createHttpHeaders("GET", Optional.empty()));
  }

  /**
   * GET /documents.
   * 
   * @param request {@link GetDocumentsRequest}
   * 
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> getDocuments(final GetDocumentsRequest request)
      throws IOException, InterruptedException {
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.get(u, createHttpHeaders("GET", Optional.empty()));
  }

  /**
   * GET /documents/{documentId}/tags/{tagKey}.
   * 
   * @param request {@link GetDocumentTagsKeyRequest}
   * @return {@link HttpResponse}
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  public HttpResponse<String> getDocumentTag(final GetDocumentTagsKeyRequest request)
      throws IOException, InterruptedException {
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.get(u, createHttpHeaders("GET", Optional.empty()));
  }

  /**
   * GET /documents/{documentId}/tags.
   * 
   * @param request {@link GetDocumentTagsRequest}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> getDocumentTags(final GetDocumentTagsRequest request)
      throws IOException, InterruptedException {
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.get(u, createHttpHeaders("GET", Optional.empty()));
  }

  /**
   * GET /documents/upload or /documents/{documentId}/upload.
   * 
   * @param request {@link GetDocumentUploadRequest}
   * @return {@link HttpResponse}
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  public HttpResponse<String> getDocumentUpload(final GetDocumentUploadRequest request)
      throws IOException, InterruptedException {
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.get(u, createHttpHeaders("GET", Optional.empty()));
  }

  /**
   * GET /version.
   * 
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> getVersion() throws IOException, InterruptedException {
    String u = this.apiRestUrl + new VersionRequest().buildRequestUrl();
    return this.client.get(u, createHttpHeaders("GET", Optional.empty()));
  }

  /**
   * OPTIONS /documents/{documentId}.
   * 
   * @param request {@link OptionsDocumentRequest}
   * @return {@link HttpResponse}
   * 
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> optionsDocument(final OptionsDocumentRequest request)
      throws IOException, InterruptedException {
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.options(u, createHttpHeaders("OPTIONS", Optional.empty()));
  }

  /**
   * OPTIONS /documents/{documentId}/url.
   * 
   * @param request {@link OptionsDocumentContentUrlRequest}
   * @return {@link HttpResponse} {@link String}
   * 
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  public HttpResponse<String> optionsDocumentContentUrl(
      final OptionsDocumentContentUrlRequest request) throws IOException, InterruptedException {
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.options(u, createHttpHeaders("OPTIONS", Optional.empty()));
  }

  /**
   * OPTIONS /documents.
   * 
   * @return {@link HttpResponse}
   * 
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> optionsDocuments() throws IOException, InterruptedException {
    String u = this.apiRestUrl + new GetDocumentsRequest().buildRequestUrl();
    return this.client.options(u, createHttpHeaders("OPTIONS", Optional.empty()));
  }

  /**
   * OPTIONS /documents/{documentId}/tags/{tagKey}.
   * 
   * @param request {@link OptionsDocumentTagsKeyRequest}
   * @return {@link HttpResponse} {@link String}
   * 
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  public HttpResponse<String> optionsDocumentTag(final OptionsDocumentTagsKeyRequest request)
      throws IOException, InterruptedException {
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.options(u, createHttpHeaders("OPTIONS", Optional.empty()));
  }

  /**
   * OPTIONS /documents/{documentId}/tags.
   * 
   * @param request {@link OptionsDocumentTagsRequest}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> optionsDocumentTags(final OptionsDocumentTagsRequest request)
      throws IOException, InterruptedException {
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.options(u, createHttpHeaders("OPTIONS", Optional.empty()));
  }

  /**
   * OPTIONS /documents/upload.
   * 
   * @return {@link HttpResponse} {@link String}
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  public HttpResponse<String> optionsDocumentUpload() throws IOException, InterruptedException {
    String u = this.apiRestUrl + new OptionsDocumentUploadRequest().buildRequestUrl();
    return this.client.options(u, createHttpHeaders("OPTIONS", Optional.empty()));
  }

  /**
   * OPTIONS /documents/{documentId}/upload.
   * 
   * @param request {@link GetDocumentUploadRequest}
   * @return {@link HttpResponse} {@link String}
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  public HttpResponse<String> optionsDocumentUpload(final OptionsDocumentUploadRequest request)
      throws IOException, InterruptedException {
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.options(u, createHttpHeaders("OPTIONS", Optional.empty()));
  }

  /**
   * OPTIONS /search.
   * 
   * @return {@link HttpResponse} {@link String}
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  public HttpResponse<String> optionsSearch() throws IOException, InterruptedException {
    String u = this.apiRestUrl + new SearchDocumentsRequest().buildRequestUrl();
    return this.client.options(u, createHttpHeaders("OPTIONS", Optional.empty()));
  }

  /**
   * POST /documents/{documentId}/tags.
   * 
   * @param request {@link AddDocumentTagRequest}
   * @param key {@link String}
   * @param value {@link String}
   * @return {@link HttpResponse} {@link String}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> addDocumentTag(final AddDocumentTagRequest request, final String key,
      final String value) throws IOException, InterruptedException {

    Map<String, Object> body = new HashMap<>();
    body.put("key", key);
    body.put("value", value);

    String contents = this.gson.toJson(body);
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.post(u, createHttpHeaders("POST", Optional.empty()),
        RequestBody.fromString(contents));
  }

  /**
   * PUT /documents/{documentId}/tags/{tagKey}.
   * 
   * @param request {@link UpdateDocumentTagKeyRequest}
   * @return {@link HttpResponse} {@link String}
   * 
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  public HttpResponse<String> updateDocumentTag(final UpdateDocumentTagKeyRequest request)
      throws IOException, InterruptedException {

    Map<String, Object> body = new HashMap<>();
    body.put("value", request.tagValue());

    String contents = this.gson.toJson(body);
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.put(u, createHttpHeaders("PUT", Optional.empty()),
        RequestBody.fromString(contents));
  }

  /**
   * POST /search.
   * 
   * @param request {@link SearchDocumentsRequest}
   * @return {@link HttpResponse}
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  public HttpResponse<String> search(final SearchDocumentsRequest request)
      throws IOException, InterruptedException {

    DocumentSearchTag tag = new DocumentSearchTag();
    tag.key(request.tagKey());
    tag.eq(request.eq());
    tag.beginsWith(request.beginsWith());

    DocumentSearchQuery q = new DocumentSearchQuery();
    q.tag(tag);

    DocumentSearch search = new DocumentSearch();
    search.query(q);

    String contents = this.gson.toJson(search);
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.post(u, createHttpHeaders("POST", Optional.empty()),
        RequestBody.fromString(contents));
  }

  /**
   * PATCH(Update) /documents/{documentId}.
   * 
   * @param request {@link UpdateDocumentRequest}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> updateDocument(final UpdateDocumentRequest request)
      throws IOException, InterruptedException {
    String body = this.gson.toJson(request.document());
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.patch(u,
        createHttpHeaders("PATCH", buildHeaders(request.document().contentType())),
        RequestBody.fromString(body));
  }
}
