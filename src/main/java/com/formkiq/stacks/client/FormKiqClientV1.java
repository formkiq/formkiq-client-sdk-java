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
import com.formkiq.stacks.client.models.AddTagSchemaResponse;
import com.formkiq.stacks.client.models.AddWebhookResponse;
import com.formkiq.stacks.client.models.DocumentActions;
import com.formkiq.stacks.client.models.DocumentContent;
import com.formkiq.stacks.client.models.DocumentFulltext;
import com.formkiq.stacks.client.models.DocumentOcr;
import com.formkiq.stacks.client.models.DocumentSearchQuery;
import com.formkiq.stacks.client.models.DocumentTag;
import com.formkiq.stacks.client.models.DocumentTags;
import com.formkiq.stacks.client.models.DocumentUrl;
import com.formkiq.stacks.client.models.DocumentVersions;
import com.formkiq.stacks.client.models.DocumentWithChildren;
import com.formkiq.stacks.client.models.Documents;
import com.formkiq.stacks.client.models.FulltextDocuments;
import com.formkiq.stacks.client.models.Sites;
import com.formkiq.stacks.client.models.TagSchema;
import com.formkiq.stacks.client.models.TagSchemaSummaries;
import com.formkiq.stacks.client.models.UpdateDocumentResponse;
import com.formkiq.stacks.client.models.Version;
import com.formkiq.stacks.client.models.WebhookTags;
import com.formkiq.stacks.client.models.Webhooks;
import com.formkiq.stacks.client.requests.AddDocumentOcrRequest;
import com.formkiq.stacks.client.requests.AddDocumentRequest;
import com.formkiq.stacks.client.requests.AddDocumentTagRequest;
import com.formkiq.stacks.client.requests.AddLargeDocumentRequest;
import com.formkiq.stacks.client.requests.AddTagSchemaRequest;
import com.formkiq.stacks.client.requests.AddWebhookRequest;
import com.formkiq.stacks.client.requests.AddWebhookTagRequest;
import com.formkiq.stacks.client.requests.DeleteDocumentFulltextRequest;
import com.formkiq.stacks.client.requests.DeleteDocumentOcrRequest;
import com.formkiq.stacks.client.requests.DeleteDocumentRequest;
import com.formkiq.stacks.client.requests.DeleteDocumentTagRequest;
import com.formkiq.stacks.client.requests.DeleteFulltextTagsRequest;
import com.formkiq.stacks.client.requests.DeleteTagSchemaRequest;
import com.formkiq.stacks.client.requests.DeleteWebhookRequest;
import com.formkiq.stacks.client.requests.DocumentFormatSearchRequest;
import com.formkiq.stacks.client.requests.GetDocumentActionsRequest;
import com.formkiq.stacks.client.requests.GetDocumentContentRequest;
import com.formkiq.stacks.client.requests.GetDocumentContentUrlRequest;
import com.formkiq.stacks.client.requests.GetDocumentFulltextRequest;
import com.formkiq.stacks.client.requests.GetDocumentOcrRequest;
import com.formkiq.stacks.client.requests.GetDocumentRequest;
import com.formkiq.stacks.client.requests.GetDocumentTagsKeyRequest;
import com.formkiq.stacks.client.requests.GetDocumentTagsRequest;
import com.formkiq.stacks.client.requests.GetDocumentUploadRequest;
import com.formkiq.stacks.client.requests.GetDocumentVersionsRequest;
import com.formkiq.stacks.client.requests.GetDocumentsRequest;
import com.formkiq.stacks.client.requests.GetTagSchemaRequest;
import com.formkiq.stacks.client.requests.GetTagSchemasRequest;
import com.formkiq.stacks.client.requests.GetWebhookTagsRequest;
import com.formkiq.stacks.client.requests.GetWebhooksRequest;
import com.formkiq.stacks.client.requests.OptionsDocumentContentRequest;
import com.formkiq.stacks.client.requests.OptionsDocumentContentUrlRequest;
import com.formkiq.stacks.client.requests.OptionsDocumentFormatRequest;
import com.formkiq.stacks.client.requests.OptionsDocumentRequest;
import com.formkiq.stacks.client.requests.OptionsDocumentTagsKeyRequest;
import com.formkiq.stacks.client.requests.OptionsDocumentTagsRequest;
import com.formkiq.stacks.client.requests.OptionsDocumentUploadRequest;
import com.formkiq.stacks.client.requests.OptionsDocumentVersionsRequest;
import com.formkiq.stacks.client.requests.OptionsWebhookRequest;
import com.formkiq.stacks.client.requests.OptionsWebhookTagsRequest;
import com.formkiq.stacks.client.requests.QueryFulltextRequest;
import com.formkiq.stacks.client.requests.SearchDocumentsRequest;
import com.formkiq.stacks.client.requests.SearchFulltextRequest;
import com.formkiq.stacks.client.requests.SetDocumentAntivirusRequest;
import com.formkiq.stacks.client.requests.SetDocumentFulltextRequest;
import com.formkiq.stacks.client.requests.SetDocumentOcrRequest;
import com.formkiq.stacks.client.requests.SitesRequest;
import com.formkiq.stacks.client.requests.UpdateDocumentFulltextRequest;
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

  /** Date Format. */
  private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ssZ";
  /** Http Status Multiple Choices. */
  private static final int HTTP_STATUS_MULTIPLE_CHOICES = 300;
  /** Http Status OK. */
  private static final int HTTP_STATUS_OK = 200;

  /** FormKiQ Rest API Url. */
  private String apiRestUrl;
  /** {@link HttpService}. */
  private HttpService client;
  /** {@link Gson}. */
  private Gson gson;

  /**
   * constructor.
   * 
   * @param connection {@link FormKiqClientConnection}
   */
  public FormKiqClientV1(final FormKiqClientConnection connection) {
    this.client = connection.build();
    this.apiRestUrl = connection.apiRestUrl().replaceAll("/$", "");
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
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
    return this.client.post(u,
        createHttpHeaders("POST", buildHeaders(request.document().contentType())),
        RequestBody.fromString(body));
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
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
    return this.client.post(u, createHttpHeaders("POST", Optional.empty()),
        RequestBody.fromString(contents));
  }

  /**
   * PUT(Replace) /documents/{documentId}/fulltext.
   * 
   * @param request {@link SetDocumentFulltextRequest}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> addDocumentFulltextAsHttpResponse(
      final SetDocumentFulltextRequest request) throws IOException, InterruptedException {

    final String u = this.apiRestUrl + "/" + request.buildRequestUrl();

    Map<String, Object> map = new HashMap<>();
    map.put("contentType", request.document().contentType());
    map.put("content", request.document().content());
    map.put("contentUrls", request.document().contentUrls());
    map.put("path", request.document().path());
    map.put("tags", request.document().tags());

    String contents = this.gson.toJson(map);
    return this.client.put(u, createHttpHeaders("PUT", Optional.empty()),
        RequestBody.fromString(contents));
  }

  @Override
  public void addDocumentOcr(final AddDocumentOcrRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = addDocumentOcrAsHttpResponse(request);
    checkStatusCode(response);
  }

  /**
   * POST(Add) /documents/{documentId}/ocr.
   * 
   * @param request {@link AddDocumentOcrRequest}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> addDocumentOcrAsHttpResponse(final AddDocumentOcrRequest request)
      throws IOException, InterruptedException {

    Map<String, Object> map = new HashMap<>();

    if (request.parseTypes() != null) {
      map.put("parseTypes", request.parseTypes());
    }

    map.put("addPdfDetectedCharactersAsText",
        Boolean.valueOf(request.addPdfDetectedCharactersAsText()));

    String contents = this.gson.toJson(map);
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
    return this.client.post(u, createHttpHeaders("POST", Optional.empty()),
        RequestBody.fromString(contents));
  }

  /**
   * PUT(Replace) /documents/{documentId}/ocr.
   * 
   * @param request {@link SetDocumentFulltextRequest}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> addDocumentOcrAsHttpResponse(final SetDocumentOcrRequest request)
      throws IOException, InterruptedException {

    String u = this.apiRestUrl + "/" + request.buildRequestUrl();

    Map<String, Object> map = new HashMap<>();
    map.put("contentType", request.document().contentType());
    map.put("content", request.document().content());

    String contents = this.gson.toJson(map);
    return this.client.put(u, createHttpHeaders("PUT", Optional.empty()),
        RequestBody.fromString(contents));
  }


  @Override
  public boolean addDocumentTag(final AddDocumentTagRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = addDocumentTagAsHttpResponse(request);
    return checkStatusCodeBoolean(response);
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

    if (!request.tags().isEmpty()) {
      body.put("tags", request.tags());
    } else {
      body.put("key", request.tagKey());
      body.put("value", request.tagValue());
      body.put("values", request.tagValues());
    }

    String contents = this.gson.toJson(body);
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
    return this.client.post(u, createHttpHeaders("POST", Optional.empty()),
        RequestBody.fromString(contents));
  }

  @Override
  public DocumentUrl addLargeDocument(final AddLargeDocumentRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = addLargeDocumentAsHttpResponse(request);
    checkStatusCode(response);
    return this.gson.fromJson(response.body(), DocumentUrl.class);
  }

  /**
   * POST(Add) /documents/upload.
   * 
   * @param request {@link AddLargeDocumentRequest}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> addLargeDocumentAsHttpResponse(final AddLargeDocumentRequest request)
      throws IOException, InterruptedException {
    String body = this.gson.toJson(request.document());
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
    return this.client.post(u, createHttpHeaders("POST", Optional.empty()),
        RequestBody.fromString(body));
  }

  @Override
  public AddTagSchemaResponse addTagSchema(final AddTagSchemaRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = addTagSchemaAsHttpResponse(request);
    checkStatusCode(response);
    return this.gson.fromJson(response.body(), AddTagSchemaResponse.class);
  }

  /**
   * POST(Add) /tagSchemas.
   * 
   * @param request {@link AddTagSchemaRequest}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> addTagSchemaAsHttpResponse(final AddTagSchemaRequest request)
      throws IOException, InterruptedException {
    String body = this.gson.toJson(request.tagSchema());
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
    return this.client.post(u, createHttpHeaders("POST", Optional.empty()),
        RequestBody.fromString(body));
  }

  @Override
  public AddWebhookResponse addWebhook(final AddWebhookRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = addWebhookAsHttpResponse(request);
    checkStatusCode(response);
    return this.gson.fromJson(response.body(), AddWebhookResponse.class);

  }

  /**
   * POST(Add) /webhooks.
   * 
   * @param request {@link AddWebhookRequest}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> addWebhookAsHttpResponse(final AddWebhookRequest request)
      throws IOException, InterruptedException {
    String body = this.gson.toJson(Map.of("name", request.name(), "enabled", request.enabled()));
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
    return this.client.post(u, Optional.empty(), RequestBody.fromString(body));
  }

  @Override
  public boolean addWebhookTag(final AddWebhookTagRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = addWebhookTagAsHttpResponse(request);
    return checkStatusCodeBoolean(response);
  }

  /**
   * POST /webhook/{webhookId}/tags.
   * 
   * @param request {@link AddWebhookTagRequest}
   * 
   * @return {@link HttpResponse} {@link String}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> addWebhookTagAsHttpResponse(final AddWebhookTagRequest request)
      throws IOException, InterruptedException {

    Map<String, Object> body = new HashMap<>();
    body.put("key", request.tagKey());
    body.put("value", request.tagValue());

    String contents = this.gson.toJson(body);
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
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
    if (response.statusCode() < HTTP_STATUS_OK
        || response.statusCode() >= HTTP_STATUS_MULTIPLE_CHOICES) {
      throw new IOException("unexpected response code: " + response.statusCode());
    }
  }

  /**
   * Check Status Code.
   * 
   * @param response {@link HttpResponse} {@link String}
   * @return boolean
   */
  private boolean checkStatusCodeBoolean(final HttpResponse<String> response) {
    try {
      checkStatusCode(response);
      return true;
    } catch (IOException e) {
      return false;
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
    return checkStatusCodeBoolean(response);
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
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
    return this.client.delete(u, createHttpHeaders("DELETE", Optional.empty()));
  }

  @Override
  public boolean deleteDocumentFulltext(final DeleteDocumentFulltextRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = deleteDocumentFulltextAsHttpResponse(request);
    return checkStatusCodeBoolean(response);
  }

  /**
   * DELETE /documents/{documentId}/fulltext.
   * 
   * @param request {@link DeleteDocumentFulltextRequest}
   * @return {@link HttpResponse}
   * 
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> deleteDocumentFulltextAsHttpResponse(
      final DeleteDocumentFulltextRequest request) throws IOException, InterruptedException {
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
    return this.client.delete(u, createHttpHeaders("DELETE", Optional.empty()));
  }

  @Override
  public boolean deleteDocumentOcr(final DeleteDocumentOcrRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = deleteDocumentOcrAsHttpResponse(request);
    return checkStatusCodeBoolean(response);
  }

  /**
   * DELETE /documents/{documentId}/ocr.
   * 
   * @param request {@link DeleteDocumentOcrRequest}
   * @return {@link HttpResponse}
   * 
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> deleteDocumentOcrAsHttpResponse(
      final DeleteDocumentOcrRequest request) throws IOException, InterruptedException {
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
    return this.client.delete(u, createHttpHeaders("DELETE", Optional.empty()));
  }

  @Override
  public boolean deleteDocumentTag(final DeleteDocumentTagRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = deleteDocumentTagAsHttpResponse(request);
    return checkStatusCodeBoolean(response);
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
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
    return this.client.delete(u, createHttpHeaders("DELETE", Optional.empty()));
  }

  @Override
  public boolean deleteFulltextTags(final DeleteFulltextTagsRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = deleteFulltextTagsAsHttpResponse(request);
    return checkStatusCodeBoolean(response);
  }

  /**
   * DELETE /documents/{documentId}/fulltext/tags.
   * 
   * @param request {@link DeleteFulltextTagsRequest}
   * @return {@link HttpResponse}
   * 
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> deleteFulltextTagsAsHttpResponse(
      final DeleteFulltextTagsRequest request) throws IOException, InterruptedException {
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
    return this.client.delete(u, createHttpHeaders("DELETE", Optional.empty()));
  }

  @Override
  public boolean deleteTagSchema(final DeleteTagSchemaRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = deleteTagSchemaAsHttpResponse(request);
    return checkStatusCodeBoolean(response);
  }

  /**
   * DELETE /tagSchemas/{tagSchemaId}.
   * 
   * @param request {@link DeleteDocumentRequest}
   * @return {@link HttpResponse}
   * 
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> deleteTagSchemaAsHttpResponse(final DeleteTagSchemaRequest request)
      throws IOException, InterruptedException {
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
    return this.client.delete(u, createHttpHeaders("DELETE", Optional.empty()));
  }

  @Override
  public boolean deleteWebhook(final DeleteWebhookRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = deleteWebhookAsHttpResponse(request);
    return checkStatusCodeBoolean(response);
  }

  /**
   * DELETE /webhooks/{/webhooks/{webhookId}}.
   * 
   * @param request {@link DeleteDocumentRequest}
   * @return {@link HttpResponse}
   * 
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> deleteWebhookAsHttpResponse(final DeleteWebhookRequest request)
      throws IOException, InterruptedException {
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
    return this.client.delete(u, createHttpHeaders("DELETE", Optional.empty()));
  }

  @Override
  public DocumentWithChildren getDocument(final GetDocumentRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = getDocumentAsHttpResponse(request);
    checkStatusCode(response);
    return this.gson.fromJson(response.body(), DocumentWithChildren.class);
  }

  @Override
  public DocumentActions getDocumentActions(final GetDocumentActionsRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = getDocumentActionsAsHttpResponse(request);
    checkStatusCode(response);
    return this.gson.fromJson(response.body(), DocumentActions.class);
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
  public HttpResponse<String> getDocumentActionsAsHttpResponse(
      final GetDocumentActionsRequest request) throws IOException, InterruptedException {
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
    return this.client.get(u, createHttpHeaders("GET", request.getHttpHeaders()));
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
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
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
  public DocumentContent getDocumentContent(final GetDocumentContentRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = getDocumentContentAsHttpResponse(request);
    checkStatusCode(response);
    return this.gson.fromJson(response.body(), DocumentContent.class);
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
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
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
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
    return this.client.get(u, createHttpHeaders("GET", Optional.empty()));
  }

  @Override
  public DocumentFulltext getDocumentFulltext(final GetDocumentFulltextRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = getDocumentFulltextAsHttpResponse(request);
    checkStatusCode(response);
    return this.gson.fromJson(response.body(), DocumentFulltext.class);
  }

  /**
   * GET /documents/{documentId}/fulltext.
   * 
   * @param request {@link GetDocumentFulltextRequest}
   * @return {@link HttpResponse}
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  public HttpResponse<String> getDocumentFulltextAsHttpResponse(
      final GetDocumentFulltextRequest request) throws IOException, InterruptedException {
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
    return this.client.get(u, createHttpHeaders("GET", Optional.empty()));
  }

  @Override
  public DocumentOcr getDocumentOcr(final GetDocumentOcrRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = getDocumentOcrAsHttpResponse(request);
    checkStatusCode(response);
    return this.gson.fromJson(response.body(), DocumentOcr.class);
  }

  /**
   * GET /documents/{documentId}/ocr.
   * 
   * @param request {@link GetDocumentOcrRequest}
   * @return {@link HttpResponse}
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  public HttpResponse<String> getDocumentOcrAsHttpResponse(final GetDocumentOcrRequest request)
      throws IOException, InterruptedException {
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
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
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
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
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
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
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
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
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
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
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
    return this.client.get(u, createHttpHeaders("GET", Optional.empty()));
  }

  @Override
  public Sites getSites() throws IOException, InterruptedException {
    HttpResponse<String> response = getSitesAsHttpResponse();
    checkStatusCode(response);
    return this.gson.fromJson(response.body(), Sites.class);
  }

  /**
   * GET /sites.
   * 
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> getSitesAsHttpResponse() throws IOException, InterruptedException {
    String u = this.apiRestUrl + "/" + new SitesRequest().buildRequestUrl();
    return this.client.get(u, createHttpHeaders("GET", Optional.empty()));
  }

  @Override
  public TagSchema getTagSchema(final GetTagSchemaRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = getTagSchemaAsHttpResponse(request);
    checkStatusCode(response);
    return this.gson.fromJson(response.body(), TagSchema.class);
  }

  /**
   * GET /tagSchemas/{tagSchemaId}.
   * 
   * @param request {@link GetTagSchemasRequest}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> getTagSchemaAsHttpResponse(final GetTagSchemaRequest request)
      throws IOException, InterruptedException {
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
    return this.client.get(u, createHttpHeaders("GET", Optional.empty()));
  }

  @Override
  public TagSchemaSummaries getTagSchemas(final GetTagSchemasRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = getTagSchemasAsHttpResponse(request);
    checkStatusCode(response);
    return this.gson.fromJson(response.body(), TagSchemaSummaries.class);
  }

  /**
   * GET /tagSchemas.
   * 
   * @param request {@link GetTagSchemasRequest}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> getTagSchemasAsHttpResponse(final GetTagSchemasRequest request)
      throws IOException, InterruptedException {
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
    return this.client.get(u, createHttpHeaders("GET", Optional.empty()));
  }

  @Override
  public Version getVersion() throws IOException, InterruptedException {
    HttpResponse<String> response = getVersionAsHttpResponse();
    checkStatusCode(response);
    return this.gson.fromJson(response.body(), Version.class);
  }

  /**
   * GET /version.
   * 
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> getVersionAsHttpResponse() throws IOException, InterruptedException {
    String u = this.apiRestUrl + "/" + new VersionRequest().buildRequestUrl();
    return this.client.get(u, createHttpHeaders("GET", Optional.empty()));
  }

  @Override
  public Webhooks getWebhooks(final GetWebhooksRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = getWebhooksAsHttpResponse(request);
    checkStatusCode(response);
    return this.gson.fromJson(response.body(), Webhooks.class);
  }

  /**
   * GET /webhooks.
   * 
   * @param request {@link GetWebhooksRequest}
   * 
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> getWebhooksAsHttpResponse(final GetWebhooksRequest request)
      throws IOException, InterruptedException {
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
    return this.client.get(u, createHttpHeaders("GET", Optional.empty()));
  }

  @Override
  public WebhookTags getWebhookTags(final GetWebhookTagsRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = getWebhookTagsAsHttpResponse(request);
    checkStatusCode(response);
    return this.gson.fromJson(response.body(), WebhookTags.class);
  }

  /**
   * GET /webhooks/{/webhooks/{webhookId}/tags}.
   * 
   * @param request {@link DeleteDocumentRequest}
   * @return {@link HttpResponse}
   * 
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> getWebhookTagsAsHttpResponse(final GetWebhookTagsRequest request)
      throws IOException, InterruptedException {
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
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
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
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
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
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
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
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
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
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
    String u = this.apiRestUrl + "/" + new GetDocumentsRequest().buildRequestUrl();
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
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
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
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
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
    String u = this.apiRestUrl + "/" + new OptionsDocumentUploadRequest().buildRequestUrl();
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
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
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
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
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

    String u = this.apiRestUrl + "/"
        + new SearchDocumentsRequest().query(new DocumentSearchQuery()).buildRequestUrl();
    return this.client.options(u, createHttpHeaders("OPTIONS", Optional.empty()));
  }

  /**
   * OPTIONS /sites.
   * 
   * @return {@link HttpResponse} {@link String}
   * 
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  public HttpResponse<String> optionsSites() throws IOException, InterruptedException {
    String u = this.apiRestUrl + "/" + new SitesRequest().buildRequestUrl();
    return this.client.options(u, createHttpHeaders("OPTIONS", Optional.empty()));
  }

  /**
   * OPTIONS /version.
   * 
   * @return {@link HttpResponse} {@link String}
   * 
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  public HttpResponse<String> optionsVersion() throws IOException, InterruptedException {
    String u = this.apiRestUrl + "/" + new VersionRequest().buildRequestUrl();
    return this.client.options(u, createHttpHeaders("OPTIONS", Optional.empty()));
  }

  /**
   * OPTIONS /webhooks.
   * 
   * @return {@link HttpResponse} {@link String}
   * 
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  public HttpResponse<String> optionsWebhooks() throws IOException, InterruptedException {
    String u = this.apiRestUrl + "/" + new GetWebhooksRequest().buildRequestUrl();
    return this.client.options(u, createHttpHeaders("OPTIONS", Optional.empty()));
  }

  /**
   * OPTIONS /webhooks/{webhookId}.
   * 
   * @param request {@link OptionsWebhookRequest}
   * @return {@link HttpResponse} {@link String}
   * 
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  public HttpResponse<String> optionsWebhooks(final OptionsWebhookRequest request)
      throws IOException, InterruptedException {
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
    return this.client.options(u, createHttpHeaders("OPTIONS", Optional.empty()));
  }

  /**
   * OPTIONS /webhooks/{webhookId}/tags.
   * 
   * @param request {@link OptionsWebhookRequest}
   * @return {@link HttpResponse} {@link String}
   * 
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  public HttpResponse<String> optionsWebhookTags(final OptionsWebhookTagsRequest request)
      throws IOException, InterruptedException {
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
    return this.client.options(u, createHttpHeaders("OPTIONS", Optional.empty()));
  }

  @Override
  public String queryFulltext(final QueryFulltextRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = queryFulltextAsHttpResponse(request);
    checkStatusCode(response);
    return response.body();
  }

  @Override
  public Documents search(final SearchDocumentsRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = searchAsHttpResponse(request);
    checkStatusCode(response);
    return this.gson.fromJson(response.body(), Documents.class);
  }

  /**
   * POST /searchFulltext.
   * 
   * @param request {@link SearchFulltextRequest}
   * @return {@link HttpResponse}
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  public HttpResponse<String> searchFulltextAsHttpResponse(final SearchFulltextRequest request)
      throws IOException, InterruptedException {

    request.validate();

    Map<String, Object> map = new HashMap<>();
    map.put("query", request.query());
    map.put("responseFields", request.responseFields());

    String contents = this.gson.toJson(map);
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
    return this.client.post(u, createHttpHeaders("POST", Optional.empty()),
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
  public HttpResponse<String> searchAsHttpResponse(final SearchDocumentsRequest request)
      throws IOException, InterruptedException {

    Map<String, Object> map = new HashMap<>();
    map.put("query", request.query());
    map.put("responseFields", request.responseFields());

    String contents = this.gson.toJson(map);
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
    return this.client.post(u, createHttpHeaders("POST", Optional.empty()),
        RequestBody.fromString(contents));
  }

  /**
   * POST /queryFulltext.
   * 
   * @param request {@link QueryFulltextRequest}
   * @return {@link HttpResponse}
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  public HttpResponse<String> queryFulltextAsHttpResponse(final QueryFulltextRequest request)
      throws IOException, InterruptedException {

    request.validate();

    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
    return this.client.post(u, createHttpHeaders("POST", Optional.empty()),
        RequestBody.fromString(request.query()));
  }

  @Override
  public FulltextDocuments searchFulltext(final SearchFulltextRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = searchFulltextAsHttpResponse(request);
    checkStatusCode(response);
    return this.gson.fromJson(response.body(), FulltextDocuments.class);
  }

  @Override
  public void setDocumentAntivirus(final SetDocumentAntivirusRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = setDocumentAntivirusAsHttpResponse(request);
    checkStatusCode(response);
  }

  /**
   * PUT /documents/{documentId}/antivirus.
   * 
   * @param request {@link AddDocumentOcrRequest}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  public HttpResponse<String> setDocumentAntivirusAsHttpResponse(
      final SetDocumentAntivirusRequest request) throws IOException, InterruptedException {

    Map<String, Object> map = new HashMap<>();

    String contents = this.gson.toJson(map);
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
    return this.client.put(u, createHttpHeaders("PUT", Optional.empty()),
        RequestBody.fromString(contents));
  }

  @Override
  public void setDocumentFulltext(final SetDocumentFulltextRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = addDocumentFulltextAsHttpResponse(request);
    checkStatusCode(response);
  }

  @Override
  public void setDocumentOcr(final SetDocumentOcrRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = addDocumentOcrAsHttpResponse(request);
    checkStatusCode(response);
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
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
    return this.client.patch(u,
        createHttpHeaders("PATCH", buildHeaders(request.document().contentType())),
        RequestBody.fromString(body));
  }

  @Override
  public boolean updateDocumentFulltext(final UpdateDocumentFulltextRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = updateDocumentFulltextAsHttpResponse(request);
    return checkStatusCodeBoolean(response);
  }

  /**
   * PATCH /documents/{documentId}/fulltext.
   * 
   * @param request {@link UpdateDocumentFulltextRequest}
   * @return {@link HttpResponse} {@link String}
   * 
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  public HttpResponse<String> updateDocumentFulltextAsHttpResponse(
      final UpdateDocumentFulltextRequest request) throws IOException, InterruptedException {

    final String u = this.apiRestUrl + "/" + request.buildRequestUrl();

    String contents = this.gson.toJson(request.document());
    return this.client.patch(u, createHttpHeaders("PATCH", Optional.empty()),
        RequestBody.fromString(contents));
  }

  @Override
  public boolean updateDocumentTag(final UpdateDocumentTagKeyRequest request)
      throws IOException, InterruptedException {
    HttpResponse<String> response = updateDocumentTagAsHttpResponse(request);
    return checkStatusCodeBoolean(response);
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
    String u = this.apiRestUrl + "/" + request.buildRequestUrl();
    return this.client.put(u, createHttpHeaders("PUT", Optional.empty()),
        RequestBody.fromString(contents));
  }
}
