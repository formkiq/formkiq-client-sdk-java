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
import com.formkiq.stacks.client.models.AddDocument;
import com.formkiq.stacks.client.models.AddDocumentResponse;
import com.formkiq.stacks.client.models.Document;
import com.formkiq.stacks.client.models.DocumentSearch;
import com.formkiq.stacks.client.models.DocumentSearchQuery;
import com.formkiq.stacks.client.models.DocumentSearchTag;
import com.formkiq.stacks.client.models.DocumentTag;
import com.formkiq.stacks.client.models.DocumentTags;
import com.formkiq.stacks.client.models.DocumentUrl;
import com.formkiq.stacks.client.models.DocumentVersions;
import com.formkiq.stacks.client.models.Documents;
import com.formkiq.stacks.client.models.UpdateDocumentResponse;
import com.formkiq.stacks.client.requests.AddDocumentRequest;
import com.formkiq.stacks.client.requests.AddDocumentTagRequest;
import com.formkiq.stacks.client.requests.DeleteDocumentRequest;
import com.formkiq.stacks.client.requests.DeleteDocumentTagRequest;
import com.formkiq.stacks.client.requests.DocumentFormatSearchRequest;
import com.formkiq.stacks.client.requests.GetDocumentContentRequest;
import com.formkiq.stacks.client.requests.GetDocumentContentUrlRequest;
import com.formkiq.stacks.client.requests.GetDocumentRequest;
import com.formkiq.stacks.client.requests.GetDocumentTagsKeyRequest;
import com.formkiq.stacks.client.requests.GetDocumentTagsRequest;
import com.formkiq.stacks.client.requests.GetDocumentUploadRequest;
import com.formkiq.stacks.client.requests.GetDocumentVersionsRequest;
import com.formkiq.stacks.client.requests.GetDocumentsRequest;
import com.formkiq.stacks.client.requests.OptionsDocumentContentRequest;
import com.formkiq.stacks.client.requests.OptionsDocumentContentUrlRequest;
import com.formkiq.stacks.client.requests.OptionsDocumentFormatRequest;
import com.formkiq.stacks.client.requests.OptionsDocumentRequest;
import com.formkiq.stacks.client.requests.OptionsDocumentTagsKeyRequest;
import com.formkiq.stacks.client.requests.OptionsDocumentTagsRequest;
import com.formkiq.stacks.client.requests.OptionsDocumentUploadRequest;
import com.formkiq.stacks.client.requests.OptionsDocumentVersionsRequest;
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
public class FormKiqClientV1 implements FormKiqClient {

  /** {@link Gson}. */
  private Gson gson;
  /** FormKiQ Rest API Url. */
  private String apiRestUrl;
  /** {@link HttpService}. */
  private HttpService client;

  /**
   * constructor.
   * 
   * @param connection {@link FormKiqClientConnection}
   */
  public FormKiqClientV1(final FormKiqClientConnection connection) {
    this.client = connection.build();
    this.apiRestUrl = connection.apiRestUrl();
    this.gson = new GsonBuilder().disableHtmlEscaping().setDateFormat(DATE_FORMAT).create();
  }

  @Override
  public AddDocumentResponse addDocument(final AddDocumentRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = addDocumentAsHttpResponse(request);
    checkStatusCode(response);
    return this.gson.fromJson(response.body(), AddDocumentResponse.class);
  }

  /**
   * POST(Add) /documents.
   * 
   * @param request {@link AddDocumentRequest}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> addDocumentAsHttpResponse(final AddDocumentRequest request)
      throws IOException, InterruptedException {
    String body = this.gson.toJson(request.document());
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.post(u,
        createHttpHeaders("POST", buildHeaders(request.document().contentType())),
        RequestBody.fromString(body));
  }

  @Override
  public boolean addDocumentTag(final AddDocumentTagRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = addDocumentTagAsHttpResponse(request);
    checkStatusCode(response);
    return true;
  }

  /**
   * POST /documents/{documentId}/tags.
   * 
   * @param request {@link AddDocumentTagRequest}
   * 
   * @return {@link HttpResponse} {@link String}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> addDocumentTagAsHttpResponse(final AddDocumentTagRequest request)
      throws IOException, InterruptedException {

    Map<String, Object> body = new HashMap<>();
    body.put("key", request.tagKey());
    body.put("value", request.tagValue());

    String contents = this.gson.toJson(body);
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.post(u, createHttpHeaders("POST", Optional.empty()),
        RequestBody.fromString(contents));
  }

  /**
   * Create HTTP Headers from {@link AddDocument}.
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
   * Checks {@link HttpResponse} for a 200 or 201.
   * 
   * @param response {@link HttpResponse}
   * @throws IOException Received unexpected StatusCode.
   */
  private void checkStatusCode(final HttpResponse<?> response) throws IOException {
    if (response.statusCode() != HTTP_STATUS_OK && response.statusCode() != HTTP_STATUS_CREATED) {
      throw new IOException("unexpected response code: " + response.statusCode());
    }
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

  @Override
  public boolean deleteDocument(final DeleteDocumentRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = deleteDocumentAsHttpResponse(request);
    checkStatusCode(response);
    return true;
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
  public HttpResponse<String> deleteDocumentAsHttpResponse(final DeleteDocumentRequest request)
      throws IOException, InterruptedException {
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.delete(u, createHttpHeaders("DELETE", Optional.empty()));
  }

  @Override
  public boolean deleteDocumentTag(final DeleteDocumentTagRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = deleteDocumentTagAsHttpResponse(request);
    checkStatusCode(response);
    return true;
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
  public HttpResponse<String> deleteDocumentTagAsHttpResponse(
      final DeleteDocumentTagRequest request) throws IOException, InterruptedException {
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.delete(u, createHttpHeaders("DELETE", Optional.empty()));
  }

  @Override
  public Document getDocument(final GetDocumentRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = getDocumentAsHttpResponse(request);
    checkStatusCode(response);
    return this.gson.fromJson(response.body(), Document.class);
  }

  /**
   * GET /documents/{documentId}.
   * 
   * @param request {@link GetDocumentRequest}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> getDocumentAsHttpResponse(final GetDocumentRequest request)
      throws IOException, InterruptedException {
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.get(u, createHttpHeaders("GET", Optional.empty()));
  }

  /**
   * GET /documents/{documentId}/content.
   * 
   * @param request {@link GetDocumentContentRequest}
   * @return {@link HttpResponse} {@link String}
   * 
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  public HttpResponse<String> getDocumentContentAsHttpResponse(
      final GetDocumentContentRequest request) throws IOException, InterruptedException {
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.get(u, createHttpHeaders("GET", request.getHttpHeaders()));
  }

  @Override
  public DocumentUrl getDocumentContentUrl(final GetDocumentContentUrlRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = getDocumentContentUrlAsHttpResponse(request);
    checkStatusCode(response);
    return this.gson.fromJson(response.body(), DocumentUrl.class);
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
  public HttpResponse<String> getDocumentContentUrlAsHttpResponse(
      final GetDocumentContentUrlRequest request) throws IOException, InterruptedException {
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.get(u, createHttpHeaders("GET", Optional.empty()));
  }

  @Override
  public Documents getDocuments(final GetDocumentsRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = getDocumentsAsHttpResponse(request);
    checkStatusCode(response);
    return this.gson.fromJson(response.body(), Documents.class);
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
  public HttpResponse<String> getDocumentsAsHttpResponse(final GetDocumentsRequest request)
      throws IOException, InterruptedException {
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.get(u, createHttpHeaders("GET", Optional.empty()));
  }

  @Override
  public DocumentTag getDocumentTag(final GetDocumentTagsKeyRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = getDocumentTagAsHttpResponse(request);
    checkStatusCode(response);
    return this.gson.fromJson(response.body(), DocumentTag.class);
  }

  /**
   * GET /documents/{documentId}/tags/{tagKey}.
   * 
   * @param request {@link GetDocumentTagsKeyRequest}
   * @return {@link HttpResponse}
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  public HttpResponse<String> getDocumentTagAsHttpResponse(final GetDocumentTagsKeyRequest request)
      throws IOException, InterruptedException {
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.get(u, createHttpHeaders("GET", Optional.empty()));
  }

  @Override
  public DocumentTags getDocumentTags(final GetDocumentTagsRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = getDocumentTagsAsHttpResponse(request);
    checkStatusCode(response);
    return this.gson.fromJson(response.body(), DocumentTags.class);
  }

  /**
   * GET /documents/{documentId}/tags.
   * 
   * @param request {@link GetDocumentTagsRequest}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> getDocumentTagsAsHttpResponse(final GetDocumentTagsRequest request)
      throws IOException, InterruptedException {
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.get(u, createHttpHeaders("GET", Optional.empty()));
  }

  @Override
  public DocumentUrl getDocumentUpload(final GetDocumentUploadRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = getDocumentUploadAsHttpResponse(request);
    checkStatusCode(response);
    return this.gson.fromJson(response.body(), DocumentUrl.class);
  }

  /**
   * GET /documents/upload or /documents/{documentId}/upload.
   * 
   * @param request {@link GetDocumentUploadRequest}
   * @return {@link HttpResponse}
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  public HttpResponse<String> getDocumentUploadAsHttpResponse(
      final GetDocumentUploadRequest request) throws IOException, InterruptedException {
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.get(u, createHttpHeaders("GET", Optional.empty()));
  }

  @Override
  public DocumentVersions getDocumentVersions(final GetDocumentVersionsRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = getDocumentVersionsAsHttpResponse(request);
    checkStatusCode(response);
    return this.gson.fromJson(response.body(), DocumentVersions.class);
  }

  /**
   * GET /documents/{documentId}/versions.
   * 
   * @param request {@link GetDocumentVersionsRequest}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> getDocumentVersionsAsHttpResponse(
      final GetDocumentVersionsRequest request) throws IOException, InterruptedException {
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.get(u, createHttpHeaders("GET", Optional.empty()));
  }

  @Override
  @SuppressWarnings("unchecked")
  public String getVersion() throws IOException, InterruptedException {
    HttpResponse<String> response = getVersionAsHttpResponse();
    checkStatusCode(response);
    Map<String, Object> map = this.gson.fromJson(response.body(), Map.class);
    return map.get("message").toString();
  }

  /**
   * GET /version.
   * 
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> getVersionAsHttpResponse() throws IOException, InterruptedException {
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
   * OPTIONS /documents/{documentId}/content.
   * 
   * @param request {@link OptionsDocumentContentRequest}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> optionsDocumentContent(final OptionsDocumentContentRequest request)
      throws IOException, InterruptedException {
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.options(u, createHttpHeaders("OPTIONS", Optional.empty()));
  }

  /**
   * OPTIONS /documents/{documentId}/formats.
   * 
   * @param request {@link OptionsDocumentFormatRequest}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> optionsDocumentFormats(final OptionsDocumentFormatRequest request)
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
   * OPTIONS /documents/{documentId}/versions.
   * 
   * @param request {@link OptionsDocumentVersionsRequest}
   * @return {@link HttpResponse} {@link String}
   * 
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  public HttpResponse<String> optionsDocumentVersions(final OptionsDocumentVersionsRequest request)
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
    String u = this.apiRestUrl + new SearchDocumentsRequest().tagKey("").buildRequestUrl();
    return this.client.options(u, createHttpHeaders("OPTIONS", Optional.empty()));
  }

  @Override
  public Documents search(final SearchDocumentsRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = searchAsHttpResponse(request);
    checkStatusCode(response);
    return this.gson.fromJson(response.body(), Documents.class);
  }

  /**
   * POST /search.
   * 
   * @param request {@link SearchDocumentsRequest}
   * @return {@link HttpResponse}
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  public HttpResponse<String> searchAsHttpResponse(final SearchDocumentsRequest request)
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
   * POST /documents/{documentId}/formats.
   * 
   * @param request {@link DocumentFormatSearchRequest}
   * @return {@link HttpResponse}
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  public HttpResponse<String> addDocumentFormatAsHttpResponse(
      final DocumentFormatSearchRequest request) throws IOException, InterruptedException {

    Map<String, String> map = new HashMap<>();
    map.put("mime", request.mime());

    if (request.versionId() != null) {
      map.put("versionId", request.versionId());
    }

    String contents = this.gson.toJson(map);
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.post(u, createHttpHeaders("POST", Optional.empty()),
        RequestBody.fromString(contents));
  }

  @Override
  public UpdateDocumentResponse updateDocument(final UpdateDocumentRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = updateDocumentAsHttpResponse(request);
    checkStatusCode(response);
    return this.gson.fromJson(response.body(), UpdateDocumentResponse.class);
  }

  /**
   * PATCH(Update) /documents/{documentId}.
   * 
   * @param request {@link UpdateDocumentRequest}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> updateDocumentAsHttpResponse(final UpdateDocumentRequest request)
      throws IOException, InterruptedException {
    String body = this.gson.toJson(request.document());
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.patch(u,
        createHttpHeaders("PATCH", buildHeaders(request.document().contentType())),
        RequestBody.fromString(body));
  }

  @Override
  public boolean updateDocumentTag(final UpdateDocumentTagKeyRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = updateDocumentTagAsHttpResponse(request);
    checkStatusCode(response);
    return true;
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
  public HttpResponse<String> updateDocumentTagAsHttpResponse(
      final UpdateDocumentTagKeyRequest request) throws IOException, InterruptedException {

    Map<String, Object> body = new HashMap<>();
    body.put("value", request.tagValue());

    String contents = this.gson.toJson(body);
    String u = this.apiRestUrl + request.buildRequestUrl();
    return this.client.put(u, createHttpHeaders("PUT", Optional.empty()),
        RequestBody.fromString(contents));
  }
}
