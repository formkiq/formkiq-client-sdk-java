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

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.apache.commons.io.IOUtils.resourceToString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockserver.integration.ClientAndServer.startClientAndServer;
import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;
import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockserver.integration.ClientAndServer;
import com.formkiq.stacks.client.models.AddDocument;
import com.formkiq.stacks.client.models.AddDocumentAction;
import com.formkiq.stacks.client.models.AddDocumentResponse;
import com.formkiq.stacks.client.models.AddDocumentTag;
import com.formkiq.stacks.client.models.AddDocusign;
import com.formkiq.stacks.client.models.AddDocusignResponse;
import com.formkiq.stacks.client.models.AddLargeDocument;
import com.formkiq.stacks.client.models.AddTagSchemaResponse;
import com.formkiq.stacks.client.models.AddWebhookResponse;
import com.formkiq.stacks.client.models.ApiKey;
import com.formkiq.stacks.client.models.ApiKeys;
import com.formkiq.stacks.client.models.Config;
import com.formkiq.stacks.client.models.DeleteFulltextTag;
import com.formkiq.stacks.client.models.Document;
import com.formkiq.stacks.client.models.DocumentAction;
import com.formkiq.stacks.client.models.DocumentActionType;
import com.formkiq.stacks.client.models.DocumentActions;
import com.formkiq.stacks.client.models.DocumentContent;
import com.formkiq.stacks.client.models.DocumentFulltext;
import com.formkiq.stacks.client.models.DocumentOcr;
import com.formkiq.stacks.client.models.DocumentSearchQuery;
import com.formkiq.stacks.client.models.DocumentSearchTag;
import com.formkiq.stacks.client.models.DocumentSync;
import com.formkiq.stacks.client.models.DocumentSyncs;
import com.formkiq.stacks.client.models.DocumentTag;
import com.formkiq.stacks.client.models.DocumentTags;
import com.formkiq.stacks.client.models.DocumentUrl;
import com.formkiq.stacks.client.models.DocumentVersions;
import com.formkiq.stacks.client.models.Documents;
import com.formkiq.stacks.client.models.DocusignConfig;
import com.formkiq.stacks.client.models.FulltextDocuments;
import com.formkiq.stacks.client.models.FulltextSearchQuery;
import com.formkiq.stacks.client.models.FulltextSearchTag;
import com.formkiq.stacks.client.models.SetDocumentFulltext;
import com.formkiq.stacks.client.models.SetDocumentOcr;
import com.formkiq.stacks.client.models.SetDocusignConfig;
import com.formkiq.stacks.client.models.Sites;
import com.formkiq.stacks.client.models.TagSchema;
import com.formkiq.stacks.client.models.TagSchemaSummaries;
import com.formkiq.stacks.client.models.TagSchemaSummary;
import com.formkiq.stacks.client.models.TagSchemaTags;
import com.formkiq.stacks.client.models.UpdateDocument;
import com.formkiq.stacks.client.models.UpdateDocumentResponse;
import com.formkiq.stacks.client.models.UpdateFulltext;
import com.formkiq.stacks.client.models.WebhookTags;
import com.formkiq.stacks.client.models.Webhooks;
import com.formkiq.stacks.client.requests.AddApiKeyRequest;
import com.formkiq.stacks.client.requests.AddDocumentActionRequest;
import com.formkiq.stacks.client.requests.AddDocumentOcrRequest;
import com.formkiq.stacks.client.requests.AddDocumentRequest;
import com.formkiq.stacks.client.requests.AddDocumentTagRequest;
import com.formkiq.stacks.client.requests.AddDocusignRequest;
import com.formkiq.stacks.client.requests.AddLargeDocumentRequest;
import com.formkiq.stacks.client.requests.AddTagSchemaRequest;
import com.formkiq.stacks.client.requests.AddWebhookRequest;
import com.formkiq.stacks.client.requests.AddWebhookTagRequest;
import com.formkiq.stacks.client.requests.DeleteApiKeyRequest;
import com.formkiq.stacks.client.requests.DeleteDocumentFulltextRequest;
import com.formkiq.stacks.client.requests.DeleteDocumentOcrRequest;
import com.formkiq.stacks.client.requests.DeleteDocumentRequest;
import com.formkiq.stacks.client.requests.DeleteDocumentTagRequest;
import com.formkiq.stacks.client.requests.DeleteDocumentVersionRequest;
import com.formkiq.stacks.client.requests.DeleteFulltextTagsRequest;
import com.formkiq.stacks.client.requests.DeleteIndicesRequest;
import com.formkiq.stacks.client.requests.DeleteTagSchemaRequest;
import com.formkiq.stacks.client.requests.DeleteWebhookRequest;
import com.formkiq.stacks.client.requests.DocumentFormatSearchRequest;
import com.formkiq.stacks.client.requests.GetDocumentActionsRequest;
import com.formkiq.stacks.client.requests.GetDocumentContentRequest;
import com.formkiq.stacks.client.requests.GetDocumentContentUrlRequest;
import com.formkiq.stacks.client.requests.GetDocumentFulltextRequest;
import com.formkiq.stacks.client.requests.GetDocumentOcrRequest;
import com.formkiq.stacks.client.requests.GetDocumentRequest;
import com.formkiq.stacks.client.requests.GetDocumentSyncsRequest;
import com.formkiq.stacks.client.requests.GetDocumentTagsKeyRequest;
import com.formkiq.stacks.client.requests.GetDocumentTagsRequest;
import com.formkiq.stacks.client.requests.GetDocumentUploadRequest;
import com.formkiq.stacks.client.requests.GetDocumentVersionsRequest;
import com.formkiq.stacks.client.requests.GetDocumentsRequest;
import com.formkiq.stacks.client.requests.GetDocusignRequest;
import com.formkiq.stacks.client.requests.GetTagSchemaRequest;
import com.formkiq.stacks.client.requests.GetTagSchemasRequest;
import com.formkiq.stacks.client.requests.GetWebhookTagsRequest;
import com.formkiq.stacks.client.requests.GetWebhooksRequest;
import com.formkiq.stacks.client.requests.OcrParseType;
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
import com.formkiq.stacks.client.requests.SetDocumentVersionRequest;
import com.formkiq.stacks.client.requests.SetDocusignConfigRequest;
import com.formkiq.stacks.client.requests.UpdateConfigsRequest;
import com.formkiq.stacks.client.requests.UpdateDocumentFulltextRequest;
import com.formkiq.stacks.client.requests.UpdateDocumentRequest;
import com.formkiq.stacks.client.requests.UpdateDocumentTagKeyRequest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.regions.Region;

/**
 * 
 * Unit Test for {@link FormKiqClient}.
 *
 */
public class FormKiqClientV1Test {

  /** Date Format. */
  private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ssZ";
  /** {@link DateFormat}. */
  private static DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
  /** Random Document Identifier. */
  private static String documentId = UUID.randomUUID().toString();
  /** {@link Gson}. */
  private static Gson gson;
  /** Http Status Created. */
  private static final int HTTP_STATUS_CREATED = 201;
  /** Http Status OK. */
  private static final int HTTP_STATUS_OK = 200;
  /** {@link ClientAndServer}. */
  private static ClientAndServer mockServer;
  /** Port to run Test server. */
  private static final int PORT = 8080;
  /** Random Site Identifier. */
  private static String siteId = UUID.randomUUID().toString();
  /** Test server URL. */
  private static final String URL = "http://localhost:" + PORT;
  /** Random Version Identifier. */
  private static String versionKey = UUID.randomUUID().toString();
  /** Year 2020. */
  private static final int YEAR = 2020;
  /** {@link Date}. */
  private static final Date YEAR_DATE =
      Date.from(LocalDate.of(YEAR, 2, 1).atStartOfDay(ZoneId.systemDefault()).toInstant());

  /**
   * Add Url to Mock server.
   * 
   * @param method {@link String}
   * @param path {@link String}
   * @param file {@link String}
   * @throws IOException IOException
   */
  private static void add(final String method, final String path, final String file)
      throws IOException {
    mockServer.when(request().withMethod(method).withPath(path))
        .respond(response(resourceToString(file, UTF_8)));
  }

  /**
   * Add Basic Urls.
   * 
   * @throws IOException IOException
   */
  private static void addBasics() throws IOException {
    add("get", "/version", "/get_version.json");
    add("options", "/version", "/id.json");

    add("get", "/sites", "/get_sites.json");
    add("get", "/configs", "/get_configs.json");
    add("get", "/configs/apiKey", "/get_configs_apikey.json");
    add("post", "/configs/apiKey", "/post_apiKey.json");
    add("delete", "/configs/apiKey/" + documentId, "/id.json");
    add("patch", "/configs", "/id.json");
    add("options", "/sites", "/id.json");
    add("delete", "/indices/tags/category", "/documentsId.json");
  }

  private static void addDocumentOthers() throws IOException {
    add("get", "/documents/" + documentId + "/content", "/get_documents_content.json");
    add("get", "/documents/" + documentId + "/actions", "/get_documents_actions.json");
    add("post", "/documents/" + documentId + "/actions", "/documentsId.json");
    add("get", "/documents/" + documentId + "/syncs", "/get_documents_syncs.json");
    add("delete", "/documents/" + documentId + "/versions/abc", "/documentsId.json");
  }

  private static void addEsignature() throws IOException {
    add("get", "/esignature/docusign/config", "/get_docusign_config.json");
    add("put", "/esignature/docusign/config", "/documentsId.json");
    add("post", "/esignature/docusign/" + documentId, "/post_docusign.json");
  }

  private static void addFulltextUrls() throws IOException {
    add("post", "/searchFulltext", "/searchFulltext.json");
    add("post", "/queryFulltext", "/documentsId.json");
    add("get", "/documents/" + documentId + "/fulltext", "/get_documents_fulltext.json");
    add("put", "/documents/" + documentId + "/fulltext", "/documentsId.json");
    add("delete", "/documents/" + documentId + "/fulltext", "/documentsId.json");
    add("delete", "/documents/" + documentId + "/fulltext/tags/{tagKey}", "/documentsId.json");
    add("delete", "/documents/" + documentId + "/fulltext/tags/somekey/somevalue",
        "/documentsId.json");
    add("patch", "/documents/" + documentId + "/fulltext", "/documentsId.json");
  }

  private static void addOcr() throws IOException {
    add("get", "/documents/" + documentId + "/ocr", "/get_documents_ocr.json");
    add("post", "/documents/" + documentId + "/ocr", "/documentsId.json");
    add("put", "/documents/" + documentId + "/ocr", "/documentsId.json");
    add("delete", "/documents/" + documentId + "/ocr", "/documentsId.json");
  }

  /**
   * Add /webhooks urls.
   * 
   * @throws IOException IOException
   */
  private static void addWebhooks() throws IOException {
    mockServer.when(request().withMethod("post").withPath("/webhooks/" + documentId + "/tags"))
        .respond(response(resourceToString("/documentsId.json", UTF_8))
            .withStatusCode(Integer.valueOf(HTTP_STATUS_CREATED)));

    add("get", "/webhooks", "/get_webhooks.json");
    add("post", "/webhooks", "/id.json");
    add("options", "/webhooks", "/id.json");
    add("options", "/webhooks/" + documentId, "/id.json");
    add("delete", "/webhooks/" + documentId, "/id.json");

    add("options", "/webhooks/" + documentId + "/tags", "/documentsId.json");
    add("get", "/webhooks/" + documentId + "/tags", "/get_webhooks_tags.json");
  }

  /**
   * Initialize BeforeClass.
   * 
   * @throws IOException IOException
   */
  @BeforeClass
  public static void startServer() throws IOException {

    df.setTimeZone(TimeZone.getTimeZone("GMT"));
    mockServer = startClientAndServer(Integer.valueOf(PORT));

    gson = new GsonBuilder().disableHtmlEscaping().setDateFormat(DATE_FORMAT).create();

    addBasics();
    addWebhooks();
    addFulltextUrls();
    addOcr();
    addEsignature();

    add("put", "/documents/" + documentId + "/antivirus", "/documentsId.json");

    add("get", "/documents", "/get_documents.json");
    add("post", "/documents", "/documentsId.json");
    add("post", "/public/documents", "/documentsId.json");
    add("options", "/documents", "/documentsId.json");
    add("patch", "/documents/" + documentId, "/documentsId.json");
    add("get", "/documents/" + documentId, "/get_document.json");
    add("delete", "/documents/" + documentId, "/documentsId.json");
    add("get", "/documents/" + documentId + "/tags", "/get_documents_tags.json");
    add("get", "/documents/" + documentId + "/versions", "/get_documents_versions.json");
    add("put", "/documents/" + documentId + "/versions", "/get_documents_versions.json");
    add("options", "/documents/" + documentId + "/versions", "/get_documents_versions.json");
    mockServer.when(request().withMethod("post").withPath("/documents/" + documentId + "/tags"))
        .respond(response(resourceToString("/documentsId.json", UTF_8))
            .withStatusCode(Integer.valueOf(HTTP_STATUS_CREATED)));
    add("options", "/documents/" + documentId + "/tags", "/documentsId.json");
    add("options", "/documents/" + documentId + "/content", "/documentsId.json");
    add("options", "/documents/" + documentId, "/documentsId.json");
    add("get", "/documents/" + documentId + "/tags/category", "/get_documents_tag.json");
    add("put", "/documents/" + documentId + "/tags/category", "/documentsId.json");
    add("options", "/documents/" + documentId + "/tags/category", "/documentsId.json");
    add("delete", "/documents/" + documentId + "/tags/category/person", "/documentsId.json");
    add("delete", "/documents/" + documentId + "/tags/category", "/documentsId.json");
    add("get", "/documents/" + documentId + "/url", "/get_documents_url.json");
    add("options", "/documents/" + documentId + "/url", "/documentsId.json");
    add("post", "/documents/upload", "/get_documents_url.json");
    add("get", "/documents/upload", "/get_documents_url.json");
    add("options", "/documents/upload", "/documentsId.json");
    add("get", "/documents/" + documentId + "/upload", "/get_documents_url.json");
    add("options", "/documents/" + documentId + "/upload", "/documentsId.json");
    add("post", "/documents/" + documentId + "/formats", "/get_documents_url.json");
    add("options", "/documents/" + documentId + "/formats", "/documentsId.json");
    add("post", "/search", "/search.json");
    add("options", "/search", "/search.json");
    add("get", "/tagSchemas", "/get_tagschemas.json");
    add("post", "/tagSchemas", "/post_tagschemas.json");
    add("get", "/tagSchemas/" + documentId, "/get_tagschema.json");
    add("delete", "/tagSchemas/" + documentId, "/post_tagschemas.json");

    addDocumentOthers();
  }

  /**
   * After Class.
   */
  @AfterClass
  public static void stopServer() {
    mockServer.stop();
  }

  /** {@link FormKiqClientConnection}. */
  private FormKiqClientConnection c0 = new FormKiqClientConnection(URL).region(Region.US_EAST_1)
      .credentials(AwsBasicCredentials.create("123", "444"))
      .header("origin", Arrays.asList("http://localhost")).cognitoIdToken("AAAA");

  /** {@link FormKiqClientConnection}. */
  private FormKiqClientConnection c1 = new FormKiqClientConnection(URL + "/")
      .region(Region.US_EAST_1).credentials(AwsBasicCredentials.create("123", "444"))
      .header("origin", Arrays.asList("http://localhost")).cognitoIdToken("AAAA");

  /** {@link FormKiqClient}. */
  private FormKiqClientV1 client0 = new FormKiqClientV1(this.c0);

  /** {@link FormKiqClient}. */
  private FormKiqClientV1 client1 = new FormKiqClientV1(this.c1);

  /**
   * Test POST /configs/apiKey.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testAddApiKey01() throws Exception {
    Config config = new Config();
    config.chatGptApiKey("ABC");
    AddApiKeyRequest request = new AddApiKeyRequest().name("My API").siteId(siteId);
    ApiKey apiKey = this.client0.addApiKey(request);
    assertEquals("My API", apiKey.name());
    assertEquals("VvgwtPnb9kVJc26j7JFAfUiHcf5KTscZTMtl4pIYIyuNWIB3v6U", apiKey.apiKey());
  }

  /**
   * Test POST /configs/apiKey.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testAddApiKeyAsHttpResponse() throws Exception {
    AddApiKeyRequest request = new AddApiKeyRequest().name("My API").siteId(siteId);
    HttpResponse<String> response = this.client0.addApiKeyAsHttpResponse(request);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals("POST", response.request().method());
    assertEquals(URL + "/configs/apiKey?siteId=" + siteId, response.request().uri().toString());
  }

  /**
   * Test POST /documents.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testAddDocument01() throws Exception {
    AddDocument post =
        gson.fromJson(resourceToString("/post_documents.json", UTF_8), AddDocument.class);
    AddDocumentRequest req = new AddDocumentRequest().document(post).siteId(siteId);
    AddDocumentResponse response = this.client0.addDocument(req);

    assertEquals("3de5c199-0537-4bb3-a035-aa2367a8bddc", response.documentId());
  }

  /**
   * Test POST /documents.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testAddDocument02() throws Exception {
    AddDocument post =
        gson.fromJson(resourceToString("/post_documents.json", UTF_8), AddDocument.class);
    AddDocumentRequest req = new AddDocumentRequest().document(post).siteId(siteId);
    AddDocumentResponse response = this.client1.addDocument(req);

    assertEquals("3de5c199-0537-4bb3-a035-aa2367a8bddc", response.documentId());
  }

  /**
   * Test POST /documents. Missing Content
   * 
   * @throws Exception Exception
   */
  @Test
  public void testAddDocument03() throws Exception {
    AddDocumentRequest req = new AddDocumentRequest();

    try {
      this.client0.addDocument(req);
      fail();
    } catch (NullPointerException e) {
      assertEquals("Document is required.", e.getMessage());
    }
  }

  /**
   * Test POST /documents.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testAddDocumentAsHttpResponse01() throws Exception {
    AddDocument post =
        gson.fromJson(resourceToString("/post_documents.json", UTF_8), AddDocument.class);
    AddDocumentRequest req = new AddDocumentRequest().document(post).siteId(siteId).webnotify(true);
    HttpResponse<String> response = this.client0.addDocumentAsHttpResponse(req);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/documents?siteId=" + siteId + "&webnotify=true",
        response.request().uri().toString());
    assertEquals("POST", response.request().method());

    assertEquals("3de5c199-0537-4bb3-a035-aa2367a8bddc",
        gson.fromJson(response.body(), Map.class).get("documentId").toString());
    HttpRequest request = response.request();
    assertEquals("[plan/text]", request.headers().map().get("Content-Type").toString());
  }

  /**
   * Test POST /documents without ContentType.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testAddDocumentAsHttpResponse02() throws Exception {
    AddDocument post =
        gson.fromJson(resourceToString("/post_documents.json", UTF_8), AddDocument.class);
    post.contentType(null);
    AddDocumentRequest req = new AddDocumentRequest().document(post);
    HttpResponse<String> response = this.client0.addDocumentAsHttpResponse(req);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/documents", response.request().uri().toString());
    assertEquals("POST", response.request().method());

    assertEquals("3de5c199-0537-4bb3-a035-aa2367a8bddc",
        gson.fromJson(response.body(), Map.class).get("documentId").toString());
    HttpRequest request = response.request();
    assertNull(request.headers().map().get("Content-Type"));
  }

  /**
   * Test POST /public/documents.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testAddDocumentAsHttpResponse03() throws Exception {
    AddDocument post =
        gson.fromJson(resourceToString("/post_documents.json", UTF_8), AddDocument.class);
    AddDocumentRequest req =
        new AddDocumentRequest().enablePublicEndpoint(true).document(post).siteId(siteId);
    HttpResponse<String> response = this.client0.addDocumentAsHttpResponse(req);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/public/documents?siteId=" + siteId, response.request().uri().toString());
    assertEquals("POST", response.request().method());

    assertEquals("3de5c199-0537-4bb3-a035-aa2367a8bddc",
        gson.fromJson(response.body(), Map.class).get("documentId").toString());
    HttpRequest request = response.request();
    assertEquals("[plan/text]", request.headers().map().get("Content-Type").toString());
  }

  /**
   * Test POST /documents/{documentId}/tags.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testAddDocumentTag01() throws Exception {
    AddDocumentTagRequest req = new AddDocumentTagRequest().siteId(siteId).documentId(documentId)
        .tagKey("category").tagValue("person");
    assertTrue(this.client0.addDocumentTag(req));
  }

  /**
   * Test POST /documents/{documentId}/tags with TagKey.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testAddDocumentTag02() throws Exception {
    AddDocumentTagRequest req =
        new AddDocumentTagRequest().siteId(siteId).documentId(documentId).tagKey("category");
    assertTrue(this.client0.addDocumentTag(req));
  }

  /**
   * Test POST /documents/{documentId}/tags. Missing content.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testAddDocumentTag03() throws Exception {
    AddDocumentTagRequest req = new AddDocumentTagRequest();

    try {
      this.client0.addDocumentTag(req);
      fail();
    } catch (NullPointerException e) {
      assertEquals("DocumentId is required.", e.getMessage());
    }
  }

  /**
   * Test POST /documents/{documentId}/tags. Missing tagKey.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testAddDocumentTag04() throws Exception {
    AddDocumentTagRequest req = new AddDocumentTagRequest().siteId(siteId).documentId(documentId);

    try {
      this.client0.addDocumentTag(req);
      fail();
    } catch (NullPointerException e) {
      assertEquals("TagKey is required.", e.getMessage());
    }
  }

  /**
   * Test POST /documents/{documentId}/tags. Missing tagValue.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testAddDocumentTag05() throws Exception {
    AddDocumentTagRequest req =
        new AddDocumentTagRequest().siteId(siteId).documentId(documentId).tagKey("category");
    assertTrue(this.client0.addDocumentTag(req));
  }

  /**
   * Test POST /documents/{documentId}/tags with TagValues.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testAddDocumentTag06() throws Exception {
    AddDocumentTagRequest req = new AddDocumentTagRequest().siteId(siteId).documentId(documentId)
        .tagKey("category").tagValues(Arrays.asList("person"));
    assertTrue(this.client0.addDocumentTag(req));
  }

  /**
   * Test POST /documents/{documentId}/tags with tags.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testAddDocumentTag07() throws Exception {
    AddDocumentTag tag = new AddDocumentTag().key("category");
    AddDocumentTagRequest req =
        new AddDocumentTagRequest().siteId(siteId).documentId(documentId).tags(Arrays.asList(tag));
    assertTrue(this.client0.addDocumentTag(req));
  }

  /**
   * Test POST /documents/{documentId}/tags. Using Tags Missing tagkey.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testAddDocumentTag08() throws Exception {
    AddDocumentTag tag = new AddDocumentTag();
    AddDocumentTagRequest req =
        new AddDocumentTagRequest().siteId(siteId).documentId(documentId).tags(Arrays.asList(tag));

    try {
      this.client0.addDocumentTag(req);
      fail();
    } catch (NullPointerException e) {
      assertEquals("TagKey is required.", e.getMessage());
    }
  }

  /**
   * Test POST /documents/{documentId}/tags VALUE.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testAddDocumentTagAsHttpResponse01() throws Exception {
    AddDocumentTagRequest req = new AddDocumentTagRequest().siteId(siteId).documentId(documentId)
        .tagKey("category").tagValue("person").webnotify(true);
    HttpResponse<String> response = this.client0.addDocumentTagAsHttpResponse(req);
    assertEquals(HTTP_STATUS_CREATED, response.statusCode());
    assertEquals("POST", response.request().method());
    assertEquals(URL + "/documents/" + documentId + "/tags?siteId=" + siteId + "&webnotify=true",
        response.request().uri().toString());
  }

  /**
   * Test POST /documents/{documentId}/tags VALUES.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testAddDocumentTagAsHttpResponse02() throws Exception {
    AddDocumentTagRequest req = new AddDocumentTagRequest().siteId(siteId).documentId(documentId)
        .tagKey("category").tagValues(Arrays.asList("person")).webnotify(true);
    HttpResponse<String> response = this.client0.addDocumentTagAsHttpResponse(req);
    assertEquals(HTTP_STATUS_CREATED, response.statusCode());
    assertEquals("POST", response.request().method());
    assertEquals(URL + "/documents/" + documentId + "/tags?siteId=" + siteId + "&webnotify=true",
        response.request().uri().toString());
  }

  /**
   * Test POST /esignature/docusign/{documentId}.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testAddDocusign01() throws Exception {
    AddDocusignRequest req = new AddDocusignRequest().siteId(siteId).documentId(documentId)
        .docusign(new AddDocusign().emailSubject("test"));
    AddDocusignResponse response = this.client0.addDocusign(req);
    assertEquals("all good", response.message());
    assertEquals("http://localhost", response.url());
  }

  /**
   * Test POST /esignature/docusign/{documentId}.
   * 
   * @throws Exception Exception
   */
  @SuppressWarnings("unchecked")
  @Test
  public void testAddDocusign01AsHttpResponse01() throws Exception {
    AddDocusignRequest req = new AddDocusignRequest().siteId(siteId).documentId(documentId)
        .docusign(new AddDocusign().emailSubject("test"));
    HttpResponse<String> response = this.client0.addDocusignAsHttpResponse(req);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/esignature/docusign/" + documentId + "?siteId=" + siteId,
        response.request().uri().toString());
    assertEquals("POST", response.request().method());

    Map<String, Object> map = gson.fromJson(response.body(), Map.class);
    assertEquals("all good", map.get("message").toString());
    assertEquals("http://localhost", map.get("url").toString());
  }

  /**
   * Test POST /documents/upload.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testAddLargeDocument01() throws Exception {
    AddLargeDocument post =
        gson.fromJson(resourceToString("/post_documents.json", UTF_8), AddLargeDocument.class);
    AddLargeDocumentRequest req = new AddLargeDocumentRequest().document(post).siteId(siteId);
    DocumentUrl response = this.client0.addLargeDocument(req);

    assertEquals("3c39bb05-9c7a-4afa-8497-6935a1e8dbae", response.documentId());
  }

  /**
   * Test POST /documents. Missing Content
   * 
   * @throws Exception Exception
   */
  @Test
  public void testAddLargeDocument02() throws Exception {
    AddLargeDocumentRequest req = new AddLargeDocumentRequest();

    try {
      this.client0.addLargeDocument(req);
      fail();
    } catch (NullPointerException e) {
      assertEquals("Document is required.", e.getMessage());
    }
  }

  /**
   * Test POST /documents/upload.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testAddLargeDocumentAsHttpResponse01() throws Exception {
    AddLargeDocument post =
        gson.fromJson(resourceToString("/post_documents.json", UTF_8), AddLargeDocument.class);
    AddLargeDocumentRequest req = new AddLargeDocumentRequest().document(post).siteId(siteId);
    HttpResponse<String> response = this.client0.addLargeDocumentAsHttpResponse(req);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/documents/upload?siteId=" + siteId, response.request().uri().toString());
    assertEquals("POST", response.request().method());

    assertEquals("3c39bb05-9c7a-4afa-8497-6935a1e8dbae",
        gson.fromJson(response.body(), Map.class).get("documentId").toString());
  }

  /**
   * Test POST /tagSchemas.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testAddTagSchemas01() throws Exception {
    AddTagSchemaRequest req = new AddTagSchemaRequest().siteId(siteId)
        .tagSchema(new TagSchema().tags(new TagSchemaTags()));
    AddTagSchemaResponse response = this.client0.addTagSchema(req);
    assertEquals("3c39bb05-9c7a-4afa-8497-6935a1e8dbae", response.tagSchemaId());
  }

  /**
   * Test POST /webhooks.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testAddWebhookAsHttpResponse01() throws Exception {
    AddWebhookRequest req = new AddWebhookRequest().name("test").siteId(siteId).webnotify(true);
    HttpResponse<String> response = this.client0.addWebhookAsHttpResponse(req);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/webhooks?siteId=" + siteId + "&webnotify=true",
        response.request().uri().toString());
    assertEquals("POST", response.request().method());
    assertEquals("3de5c199-0537-4bb3-a035-aa2367a8bddc",
        gson.fromJson(response.body(), Map.class).get("id").toString());
  }

  /**
   * Test POST /webhooks.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testAddWebhooks01() throws Exception {
    AddWebhookRequest req = new AddWebhookRequest().name("test").siteId(siteId);
    AddWebhookResponse response = this.client0.addWebhook(req);

    assertEquals("3de5c199-0537-4bb3-a035-aa2367a8bddc", response.id());
    assertEquals("default", response.siteId());
  }

  /**
   * Test POST /webhooks/{webhookId}/tags.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testAddWebhookTag01() throws Exception {
    AddWebhookTagRequest req = new AddWebhookTagRequest().siteId(siteId).webhookId(documentId)
        .tagKey("category").tagValue("person");
    assertTrue(this.client0.addWebhookTag(req));
  }

  /**
   * Test POST /webhooks/{webhookId}/tags. Missing content.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testAddWebhookTag02() throws Exception {
    AddWebhookTagRequest req = new AddWebhookTagRequest();

    try {
      this.client0.addWebhookTag(req);
      fail();
    } catch (NullPointerException e) {
      assertEquals("WebhookId is required.", e.getMessage());
    }
  }

  /**
   * Test POST /webhooks/{webhookId}/tags.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testAddWebhookTagAsHttpResponse() throws Exception {
    AddWebhookTagRequest req = new AddWebhookTagRequest().siteId(siteId).webhookId(documentId)
        .tagKey("category").tagValue("person").webnotify(true);
    HttpResponse<String> response = this.client0.addWebhookTagAsHttpResponse(req);
    assertEquals(HTTP_STATUS_CREATED, response.statusCode());
    assertEquals("POST", response.request().method());
    assertEquals(URL + "/webhooks/" + documentId + "/tags?siteId=" + siteId + "&webnotify=true",
        response.request().uri().toString());
  }

  /**
   * Test DELETE /configs/apiKey.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testDeleteApiKey01() throws Exception {
    DeleteApiKeyRequest request = new DeleteApiKeyRequest().apiKey(documentId).siteId(siteId);
    assertTrue(this.client0.deleteApiKey(request));
  }

  /**
   * Test DELETE /configs/apiKey. Missing Data.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testDeleteApiKey02() throws Exception {
    DeleteApiKeyRequest request = new DeleteApiKeyRequest();
    try {
      this.client0.deleteApiKey(request);
      fail();
    } catch (NullPointerException e) {
      assertEquals("Api Key is required.", e.getMessage());
    }
  }

  /**
   * Test DELETE /configs/apiKey.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testDeleteApiKeyAsHttpResponse() throws Exception {
    DeleteApiKeyRequest request = new DeleteApiKeyRequest().apiKey(documentId).siteId(siteId);
    HttpResponse<String> response = this.client0.deleteApiKeyAsHttpResponse(request);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/configs/apiKey/" + documentId + "?siteId=" + siteId,
        response.request().uri().toString());
    assertEquals("DELETE", response.request().method());
  }

  /**
   * Test DELETE /documents/{documentid}.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testDeleteDocument01() throws Exception {
    DeleteDocumentRequest request =
        new DeleteDocumentRequest().documentId(documentId).siteId(siteId);
    assertTrue(this.client0.deleteDocument(request));
  }

  /**
   * Test DELETE /documents/{documentid}. Missing Data.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testDeleteDocument02() throws Exception {
    DeleteDocumentRequest request = new DeleteDocumentRequest();
    try {
      this.client0.deleteDocument(request);
      fail();
    } catch (NullPointerException e) {
      assertEquals("DocumentId is required.", e.getMessage());
    }
  }

  /**
   * Test DELETE /documents/{documentid}.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testDeleteDocumentAsHttpResponse() throws Exception {
    DeleteDocumentRequest request =
        new DeleteDocumentRequest().documentId(documentId).siteId(siteId).webnotify(true);
    HttpResponse<String> response = this.client0.deleteDocumentAsHttpResponse(request);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/documents/" + documentId + "?siteId=" + siteId + "&webnotify=true",
        response.request().uri().toString());
    assertEquals("DELETE", response.request().method());
  }

  /**
   * Test DELETE /documents/{documentid}/fulltext.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testDeleteDocumentFulltext01() throws Exception {
    DeleteDocumentFulltextRequest request =
        new DeleteDocumentFulltextRequest().documentId(documentId).siteId(siteId);
    assertTrue(this.client0.deleteDocumentFulltext(request));
  }

  /**
   * Test DELETE /documents/{documentid}/Fulltext. Missing Data.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testDeleteDocumentFulltext02() throws Exception {
    DeleteDocumentFulltextRequest request = new DeleteDocumentFulltextRequest();
    try {
      this.client0.deleteDocumentFulltext(request);
      fail();
    } catch (NullPointerException e) {
      assertEquals("DocumentId is required.", e.getMessage());
    }
  }

  /**
   * Test DELETE /documents/{documentid}/fulltext.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testDeleteDocumentFulltextAsHttpResponse() throws Exception {
    DeleteDocumentFulltextRequest request =
        new DeleteDocumentFulltextRequest().documentId(documentId).siteId(siteId);
    HttpResponse<String> response = this.client0.deleteDocumentFulltextAsHttpResponse(request);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/documents/" + documentId + "/fulltext?siteId=" + siteId,
        response.request().uri().toString());
    assertEquals("DELETE", response.request().method());
  }

  /**
   * Test DELETE /documents/{documentid}/ocr.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testDeleteDocumentOcr01() throws Exception {
    DeleteDocumentOcrRequest request =
        new DeleteDocumentOcrRequest().documentId(documentId).siteId(siteId);
    assertTrue(this.client0.deleteDocumentOcr(request));
  }


  /**
   * Test DELETE /documents/{documentid}/ocr. Missing Data.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testDeleteDocumentOcr02() throws Exception {
    DeleteDocumentOcrRequest request = new DeleteDocumentOcrRequest();
    try {
      this.client0.deleteDocumentOcr(request);
      fail();
    } catch (NullPointerException e) {
      assertEquals("DocumentId is required.", e.getMessage());
    }
  }

  /**
   * Test DELETE /documents/{documentid}/ocr.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testDeleteDocumentOcrAsHttpResponse() throws Exception {
    DeleteDocumentOcrRequest request =
        new DeleteDocumentOcrRequest().documentId(documentId).siteId(siteId);
    HttpResponse<String> response = this.client0.deleteDocumentOcrAsHttpResponse(request);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/documents/" + documentId + "/ocr?siteId=" + siteId,
        response.request().uri().toString());
    assertEquals("DELETE", response.request().method());
  }

  /**
   * Test DELETE /documents/{documentId}/tags/{tagKey}.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testDeleteDocumentTag01() throws Exception {
    DeleteDocumentTagRequest request =
        new DeleteDocumentTagRequest().documentId(documentId).tagKey("category").siteId(siteId);
    assertTrue(this.client0.deleteDocumentTag(request));
  }

  /**
   * Test DELETE /documents/{documentId}/tags/{tagKey}. Missing Data.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testDeleteDocumentTag02() throws Exception {
    DeleteDocumentTagRequest request = new DeleteDocumentTagRequest();
    try {
      this.client0.deleteDocumentTag(request);
      fail();
    } catch (NullPointerException e) {
      assertEquals("DocumentId is required.", e.getMessage());
    }
  }

  /**
   * Test DELETE /documents/{documentId}/tags/{tagKey}.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testDeleteDocumentTagAsHttpResponse01() throws Exception {
    DeleteDocumentTagRequest request = new DeleteDocumentTagRequest().documentId(documentId)
        .tagKey("category").siteId(siteId).webnotify(true);
    HttpResponse<String> response = this.client0.deleteDocumentTagAsHttpResponse(request);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals("DELETE", response.request().method());
    assertEquals(
        URL + "/documents/" + documentId + "/tags/category?siteId=" + siteId + "&webnotify=true",
        response.request().uri().toString());
  }

  /**
   * Test DELETE /documents/{documentId}/tags/{tagKey}/{tagValue}.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testDeleteDocumentTagAsHttpResponse02() throws Exception {
    DeleteDocumentTagRequest request = new DeleteDocumentTagRequest().documentId(documentId)
        .tagKey("category").tagValue("person").siteId(siteId).webnotify(true);
    HttpResponse<String> response = this.client0.deleteDocumentTagAsHttpResponse(request);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals("DELETE", response.request().method());
    assertEquals(URL + "/documents/" + documentId + "/tags/category/person?siteId=" + siteId
        + "&webnotify=true", response.request().uri().toString());
  }

  /**
   * Test DELETE /documents/{documentId}/versions/{versionKey}.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testDeleteDocumentVersion01() throws Exception {
    DeleteDocumentVersionRequest request =
        new DeleteDocumentVersionRequest().documentId(documentId).siteId(siteId).versionKey("abc");
    assertTrue(this.client0.deleteDocumentVersion(request));
  }

  /**
   * Test DELETE /documents/{documentId}/versions/{versionKey}. Missing Data.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testDeleteDocumentVersion02() throws Exception {
    DeleteDocumentVersionRequest request = new DeleteDocumentVersionRequest();
    try {
      this.client0.deleteDocumentVersion(request);
      fail();
    } catch (NullPointerException e) {
      assertEquals("DocumentId is required.", e.getMessage());
    }
  }

  /**
   * Test DELETE /documents/{documentId}/versions/{versionKey}.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testDeleteDocumentVersionAsHttpResponse() throws Exception {
    DeleteDocumentVersionRequest request =
        new DeleteDocumentVersionRequest().documentId(documentId).siteId(siteId).versionKey("abc");
    HttpResponse<String> response = this.client0.deleteDocumentVersionAsHttpResponse(request);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/documents/" + documentId + "/versions/abc?siteId=" + siteId,
        response.request().uri().toString());
    assertEquals("DELETE", response.request().method());
  }

  /**
   * Test DELETE /documents/{documentid}/fulltext/tags.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testDeleteFulltextTags01() throws Exception {
    DeleteFulltextTagsRequest request = new DeleteFulltextTagsRequest().documentId(documentId)
        .siteId(siteId).tag(new DeleteFulltextTag().key("somekey").value("somevalue"));
    assertTrue(this.client0.deleteFulltextTags(request));
  }

  /**
   * Test DELETE /documents/{documentid}/fulltext/tags. Missing Data.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testDeleteFulltextTags02() throws Exception {
    DeleteFulltextTagsRequest request = new DeleteFulltextTagsRequest();
    try {
      this.client0.deleteFulltextTags(request);
      fail();
    } catch (NullPointerException e) {
      assertEquals("DocumentId is required.", e.getMessage());
    }
  }

  /**
   * Test DELETE /documents/{documentid}/fulltext/{tagKey/{tagValue}.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testDeleteFulltextTagsAsHttpResponse() throws Exception {
    DeleteFulltextTagsRequest request = new DeleteFulltextTagsRequest().documentId(documentId)
        .siteId(siteId).tag(new DeleteFulltextTag().key("somekey").value("somevalue"));
    HttpResponse<String> response = this.client0.deleteFulltextTagsAsHttpResponse(request);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(
        URL + "/documents/" + documentId + "/fulltext/tags/somekey/somevalue?siteId=" + siteId,
        response.request().uri().toString());
    assertEquals("DELETE", response.request().method());
  }

  /**
   * Test DELETE /indices/{indexType}/{indexKey}.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testDeleteIndices01() throws Exception {
    DeleteIndicesRequest request =
        new DeleteIndicesRequest().indexType("tags").indexKey("category");
    assertTrue(this.client0.deleteIndices(request));
  }

  /**
   * Test DELETE /indices/{indexType}/{indexKey}. Missing Data.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testDeleteIndices02() throws Exception {
    DeleteIndicesRequest request = new DeleteIndicesRequest();
    try {
      this.client0.deleteIndices(request);
      fail();
    } catch (NullPointerException e) {
      assertEquals("IndexType is required.", e.getMessage());
    }
  }

  /**
   * Test DELETE /indices/{indexType}/{indexKey}.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testDeleteIndicesAsHttpResponse() throws Exception {
    DeleteIndicesRequest request =
        new DeleteIndicesRequest().indexType("tags").indexKey("category").siteId(siteId);
    HttpResponse<String> response = this.client0.deleteIndicesAsHttpResponse(request);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/indices/tags/category?siteId=" + siteId,
        response.request().uri().toString());
    assertEquals("DELETE", response.request().method());
  }

  /**
   * Test DELETE /tagSchemas/{tagSchemaId}.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testDeleteTagSchema01() throws Exception {
    DeleteTagSchemaRequest request =
        new DeleteTagSchemaRequest().tagSchemaId(documentId).siteId(siteId);
    assertTrue(this.client0.deleteTagSchema(request));
  }

  /**
   * Test DELETE /documents/{documentid}. Missing Data.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testDeleteTagSchema02() throws Exception {
    DeleteTagSchemaRequest request = new DeleteTagSchemaRequest();
    try {
      this.client0.deleteTagSchema(request);
      fail();
    } catch (NullPointerException e) {
      assertEquals("TagSchemaId is required.", e.getMessage());
    }
  }

  /**
   * Test DELETE /webhooks/{webhookId}.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testDeleteWebhook01() throws Exception {
    DeleteWebhookRequest request = new DeleteWebhookRequest().webhookId(documentId).siteId(siteId);
    assertTrue(this.client0.deleteWebhook(request));
  }

  /**
   * Test GET /configs/apiKey.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetApiKeys() throws Exception {
    ApiKeys apiKeys = this.client0.getApiKeys();
    assertEquals(1, apiKeys.apiKeys().size());
    assertEquals("1235363453", apiKeys.apiKeys().get(0).apiKey());
    assertEquals("My Api", apiKeys.apiKeys().get(0).name());
  }

  /**
   * Test GET /configs/apiKey.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetApiKeysAsHttpResponse() throws Exception {
    HttpResponse<String> response = this.client0.getApiKeysAsHttpResponse();
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    HttpRequest request = response.request();
    assertEquals(URL + "/configs/apiKey", request.uri().toString());
    assertEquals("GET", request.method());
    assertEquals("http://localhost", request.headers().firstValue("Origin").get());
    assertTrue(request.headers().firstValue("Authorization").get()
        .startsWith("AWS4-HMAC-SHA256 Credential=123"));
  }

  /**
   * Test GET /configs.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetConfigs() throws Exception {
    Config configs = this.client0.getConfigs();
    assertEquals("ABC", configs.chatGptApiKey());
  }

  /**
   * Test GET /configs.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetConfigsAsHttpResponse() throws Exception {
    HttpResponse<String> response = this.client0.getConfigsAsHttpResponse();
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    HttpRequest request = response.request();
    assertEquals(URL + "/configs", request.uri().toString());
    assertEquals("GET", request.method());
    assertEquals("http://localhost", request.headers().firstValue("Origin").get());
    assertTrue(request.headers().firstValue("Authorization").get()
        .startsWith("AWS4-HMAC-SHA256 Credential=123"));
  }

  /**
   * Test GET /documents/{documentid}.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocument01() throws Exception {
    GetDocumentRequest req = new GetDocumentRequest().documentId(documentId).siteId(siteId);
    Document doc = this.client0.getDocument(req);
    assertEquals("1000", "" + doc.contentLength());
    assertEquals("text/plain", doc.contentType());
    assertEquals("3c39bb05-9c7a-4afa-8497-6935a1e8dbae", doc.documentId());
    assertEquals("efjsdkfhds", doc.checksum());
    assertEquals("2020/05/05 17:31:06", df.format(doc.insertedDate()));
    assertEquals("sample/test.txt", doc.path());
    assertEquals("6981181a-bbb1-4228-a65d-6dc947f036ac@formkiq.com", doc.userId());
  }

  /**
   * Test GET /documents/{documentid}.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocument02() throws Exception {
    GetDocumentRequest req = new GetDocumentRequest();
    try {
      this.client0.getDocument(req);
      fail();
    } catch (NullPointerException e) {
      assertEquals("DocumentId is required.", e.getMessage());
    }
  }

  /**
   * Test GET /documents/{documentid}/actions.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocumentActions01() throws Exception {
    GetDocumentActionsRequest req =
        new GetDocumentActionsRequest().documentId(documentId).siteId(siteId);
    DocumentActions actions = this.client0.getDocumentActions(req);
    DocumentAction action = actions.actions().get(0);
    assertEquals("joe", action.userId());
    assertEquals("{parseTypes=TEXT}", action.parameters().toString());
    assertEquals("PENDING", action.status().toString());
    assertEquals("OCR", action.type().toString());
  }

  /**
   * Test GET /documents/{documentid}/actions.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocumentActions02() throws Exception {
    GetDocumentActionsRequest req = new GetDocumentActionsRequest();
    try {
      this.client0.getDocumentActions(req);
      fail();
    } catch (NullPointerException e) {
      assertEquals("DocumentId is required.", e.getMessage());
    }
  }

  /**
   * Test GET /documents/{documentid}/actions.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocumentActionsAsHttpResponse() throws Exception {
    GetDocumentActionsRequest req =
        new GetDocumentActionsRequest().documentId(documentId).siteId(siteId);
    HttpResponse<String> response = this.client0.getDocumentActionsAsHttpResponse(req);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/documents/" + documentId + "/actions?siteId=" + siteId,
        response.request().uri().toString());
    assertEquals("GET", response.request().method());

    DocumentActions actions = gson.fromJson(response.body(), DocumentActions.class);
    DocumentAction action = actions.actions().get(0);
    assertEquals("joe", action.userId());
    assertEquals("{parseTypes=TEXT}", action.parameters().toString());
    assertEquals("PENDING", action.status().toString());
    assertEquals("OCR", action.type().toString());
  }

  /**
   * Test GET /documents/{documentid}.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocumentAsHttpResponse() throws Exception {
    GetDocumentRequest req = new GetDocumentRequest().documentId(documentId).siteId(siteId);
    HttpResponse<String> response = this.client0.getDocumentAsHttpResponse(req);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/documents/" + documentId + "?siteId=" + siteId,
        response.request().uri().toString());
    assertEquals("GET", response.request().method());

    Document doc = gson.fromJson(response.body(), Document.class);
    assertEquals("1000", "" + doc.contentLength());
    assertEquals("text/plain", doc.contentType());
    assertEquals("3c39bb05-9c7a-4afa-8497-6935a1e8dbae", doc.documentId());
    assertEquals("efjsdkfhds", doc.checksum());
    assertEquals("2020/05/05 17:31:06", df.format(doc.insertedDate()));
    assertEquals("sample/test.txt", doc.path());
    assertEquals("6981181a-bbb1-4228-a65d-6dc947f036ac@formkiq.com", doc.userId());
  }

  /**
   * Test GET /documents/{documentId}/content.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocumentContent() throws Exception {
    GetDocumentContentRequest request =
        new GetDocumentContentRequest().documentId(documentId).versionKey("100").siteId("123");
    DocumentContent response = this.client0.getDocumentContent(request);
    assertEquals("this is a test", response.content());
    assertEquals("text/plain", response.contentType());
    assertEquals("http://www.google.com", response.contentUrl());
    assertFalse("", response.isBase64());
  }

  /**
   * Test GET /documents/{documentId}/content.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocumentContentAsHttpResponse() throws Exception {
    GetDocumentContentRequest request =
        new GetDocumentContentRequest().documentId(documentId).versionKey("101").siteId("123");
    HttpResponse<String> response = this.client0.getDocumentContentAsHttpResponse(request);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals("GET", response.request().method());
    assertEquals(URL + "/documents/" + documentId + "/content?siteId=123&versionKey=101",
        response.request().uri().toString());
  }

  /**
   * Test GET /documents/{documentId}/url.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocumentContentUrl01() throws Exception {
    GetDocumentContentUrlRequest req =
        new GetDocumentContentUrlRequest().documentId(documentId).duration(1).siteId(siteId);
    DocumentUrl url = this.client0.getDocumentContentUrl(req);
    assertEquals("3c39bb05-9c7a-4afa-8497-6935a1e8dbae", url.documentId());
    assertEquals("https://www.google.com", url.url());
  }

  /**
   * Test GET /documents/{documentId}/url. No Data.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocumentContentUrl02() throws Exception {
    GetDocumentContentUrlRequest req = new GetDocumentContentUrlRequest();
    try {
      this.client0.getDocumentContentUrl(req);
      fail();
    } catch (NullPointerException e) {
      assertEquals("DocumentId is required.", e.getMessage());
    }
  }

  /**
   * Test GET /documents/{documentId}/url.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocumentContentUrlAsHttpResponse() throws Exception {
    GetDocumentContentUrlRequest req = new GetDocumentContentUrlRequest().documentId(documentId)
        .duration(1).siteId(siteId).versionKey(versionKey);
    HttpResponse<String> response = this.client0.getDocumentContentUrlAsHttpResponse(req);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/documents/" + documentId + "/url?duration=1&siteId=" + siteId
        + "&versionKey=" + versionKey, response.request().uri().toString());
    assertEquals("GET", response.request().method());

    DocumentUrl url = gson.fromJson(response.body(), DocumentUrl.class);
    assertEquals("3c39bb05-9c7a-4afa-8497-6935a1e8dbae", url.documentId());
    assertEquals("https://www.google.com", url.url());
  }

  /**
   * Test GET /documents.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocuments() throws Exception {
    GetDocumentsRequest request = new GetDocumentsRequest().date(YEAR_DATE).limit(1).next("nnnn")
        .previous("ppp").siteId(siteId).tz("0500");
    Documents docs = this.client0.getDocuments(request);
    assertEquals("123", docs.next());
    assertEquals("555", docs.previous());
    assertEquals(1, docs.documents().size());
    assertEquals("1000", "" + docs.documents().get(0).contentLength());
    assertEquals("text/plain", docs.documents().get(0).contentType());
    assertEquals("3c39bb05-9c7a-4afa-8497-6935a1e8dbae", docs.documents().get(0).documentId());
    assertEquals("efjsdkfhds", docs.documents().get(0).checksum());
    assertEquals("2020/05/05 17:31:06", df.format(docs.documents().get(0).insertedDate()));
    assertEquals("sample/test.txt", docs.documents().get(0).path());
    assertEquals("6981181a-bbb1-4228-a65d-6dc947f036ac@formkiq.com",
        docs.documents().get(0).userId());
  }

  /**
   * Test GET /documents.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocumentsAsHttpResponse() throws Exception {
    GetDocumentsRequest request = new GetDocumentsRequest().date(YEAR_DATE).limit(1).next("nnnn")
        .previous("ppp").siteId(siteId).tz("0500");
    HttpResponse<String> response = this.client0.getDocumentsAsHttpResponse(request);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(
        URL + "/documents?next=nnnn&date=2020-02-01&previous=ppp&tz=0500&limit=1&siteId=" + siteId,
        response.request().uri().toString());
    assertEquals("GET", response.request().method());

    Documents docs = gson.fromJson(response.body(), Documents.class);
    assertEquals("123", docs.next());
    assertEquals("555", docs.previous());
    assertEquals(1, docs.documents().size());
    assertEquals("1000", "" + docs.documents().get(0).contentLength());
    assertEquals("text/plain", docs.documents().get(0).contentType());
    assertEquals("3c39bb05-9c7a-4afa-8497-6935a1e8dbae", docs.documents().get(0).documentId());
    assertEquals("efjsdkfhds", docs.documents().get(0).checksum());
    assertEquals("2020/05/05 17:31:06", df.format(docs.documents().get(0).insertedDate()));
    assertEquals("sample/test.txt", docs.documents().get(0).path());
    assertEquals("6981181a-bbb1-4228-a65d-6dc947f036ac@formkiq.com",
        docs.documents().get(0).userId());
  }

  /**
   * Test GET /documents/{documentid}/fulltext.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocumentsFulltext01() throws Exception {
    GetDocumentFulltextRequest req =
        new GetDocumentFulltextRequest().documentId(documentId).siteId(siteId);
    DocumentFulltext fulltext = this.client0.getDocumentFulltext(req);
    assertEquals("73482", fulltext.documentId());
    assertEquals("2022/09/01 02:26:08", df.format(fulltext.insertedDate()));
    assertEquals("this is data", fulltext.content());
    assertEquals("joe", fulltext.createdBy());
    assertEquals("test.txt", fulltext.path());
    assertEquals("{playerId=123}", fulltext.tags().toString());
  }

  /**
   * Test GET /documents/{documentid}/fulltext.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocumentsFulltextAsHttpResponse() throws Exception {
    GetDocumentFulltextRequest req =
        new GetDocumentFulltextRequest().documentId(documentId).siteId(siteId);
    HttpResponse<String> response = this.client0.getDocumentFulltextAsHttpResponse(req);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/documents/" + documentId + "/fulltext?siteId=" + siteId,
        response.request().uri().toString());
    DocumentFulltext fulltext = gson.fromJson(response.body(), DocumentFulltext.class);
    assertEquals("73482", fulltext.documentId());
    assertEquals("2022/09/01 02:26:08", df.format(fulltext.insertedDate()));
    assertEquals("this is data", fulltext.content());
    assertEquals("joe", fulltext.createdBy());
    assertEquals("test.txt", fulltext.path());
    assertEquals("{playerId=123}", fulltext.tags().toString());
  }

  /**
   * Test GET /documents/{documentid}/ocr.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocumentsOcr01() throws Exception {
    GetDocumentOcrRequest req = new GetDocumentOcrRequest().documentId(documentId).siteId(siteId);
    DocumentOcr ocr = this.client0.getDocumentOcr(req);
    assertEquals("999", ocr.documentId());
    assertEquals("2020/05/05 18:11:36", df.format(ocr.insertedDate()));
    assertEquals("text/plain", ocr.contentType());
    assertEquals("textract", ocr.ocrEngine());
    assertEquals("pending", ocr.ocrStatus());
    assertEquals("joe", ocr.userId());
    assertEquals("This is a test", ocr.data());
  }

  /**
   * Test GET /documents/{documentid}/ocr.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocumentsOcrAsHttpResponse() throws Exception {
    GetDocumentOcrRequest req = new GetDocumentOcrRequest().documentId(documentId).siteId(siteId);
    req.addQueryParameter("some", "thing");
    HttpResponse<String> response = this.client0.getDocumentOcrAsHttpResponse(req);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/documents/" + documentId + "/ocr?some=thing&siteId=" + siteId,
        response.request().uri().toString());
    DocumentOcr ocr = gson.fromJson(response.body(), DocumentOcr.class);
    assertEquals("999", ocr.documentId());
    assertEquals("2020/05/05 18:11:36", df.format(ocr.insertedDate()));
    assertEquals("text/plain", ocr.contentType());
    assertEquals("textract", ocr.ocrEngine());
    assertEquals("pending", ocr.ocrStatus());
    assertEquals("joe", ocr.userId());
    assertEquals("This is a test", ocr.data());
  }

  /**
   * Test GET /documents/{documentid}/tags.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocumentsTags01() throws Exception {
    GetDocumentTagsRequest req = new GetDocumentTagsRequest().documentId(documentId).limit(1)
        .next("nn").previous("pp").siteId(siteId);
    DocumentTags tags = this.client0.getDocumentTags(req);
    assertEquals("123", tags.next());
    assertEquals("555", tags.previous());
    assertEquals(1, tags.tags().size());
    assertEquals("999", tags.tags().get(0).documentId());
    assertEquals("2020/05/05 18:11:36", df.format(tags.tags().get(0).insertedDate()));
    assertEquals("category", tags.tags().get(0).key());
    assertEquals("userdefined", tags.tags().get(0).type());
    assertEquals("jsmith", tags.tags().get(0).userId());
    assertEquals("9eb6a07a-08c0-44e0-9d02-a8c6bebb1408", tags.tags().get(0).value());
  }

  /**
   * Test GET /documents/{documentid}/tags.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocumentsTags02() throws Exception {
    GetDocumentTagsRequest req = new GetDocumentTagsRequest();
    try {
      this.client0.getDocumentTags(req);
      fail();
    } catch (NullPointerException e) {
      assertEquals("DocumentId is required.", e.getMessage());
    }
  }

  /**
   * Test GET /documents/{documentid}/tags.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocumentsTagsAsHttpResponse() throws Exception {
    GetDocumentTagsRequest req = new GetDocumentTagsRequest().documentId(documentId).limit(1)
        .next("nn").previous("pp").siteId(siteId);
    HttpResponse<String> response = this.client0.getDocumentTagsAsHttpResponse(req);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(
        URL + "/documents/" + documentId + "/tags?next=nn&previous=pp&limit=1&siteId=" + siteId,
        response.request().uri().toString());

    DocumentTags tags = gson.fromJson(response.body(), DocumentTags.class);
    assertEquals("123", tags.next());
    assertEquals("555", tags.previous());
    assertEquals(1, tags.tags().size());
    assertEquals("999", tags.tags().get(0).documentId());
    assertEquals("2020/05/05 18:11:36", df.format(tags.tags().get(0).insertedDate()));
    assertEquals("category", tags.tags().get(0).key());
    assertEquals("userdefined", tags.tags().get(0).type());
    assertEquals("jsmith", tags.tags().get(0).userId());
    assertEquals("9eb6a07a-08c0-44e0-9d02-a8c6bebb1408", tags.tags().get(0).value());
  }

  /**
   * Test GET /documents/{documentid}/versions.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocumentsVersions01() throws Exception {
    GetDocumentVersionsRequest req = new GetDocumentVersionsRequest().documentId(documentId)
        .next("nn").tz("-0600").siteId(siteId);
    DocumentVersions versions = this.client0.getDocumentVersions(req);
    assertEquals("123", versions.next());
    assertEquals(1, versions.documents().size());
    assertEquals("9eb6a07a-08c0-44e0-9d02-a8c6bebb1408", versions.documents().get(0).version());
    assertEquals("2020/05/05 18:11:36", df.format(versions.documents().get(0).lastModifiedDate()));
  }

  /**
   * Test GET /documents/{documentid}/versions.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocumentsVersions02() throws Exception {
    GetDocumentVersionsRequest req = new GetDocumentVersionsRequest();
    try {
      this.client0.getDocumentVersions(req);
      fail();
    } catch (NullPointerException e) {
      assertEquals("DocumentId is required.", e.getMessage());
    }
  }

  /**
   * Test GET /documents/{documentid}/versions.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocumentsVersionsAsHttpResponse() throws Exception {
    GetDocumentVersionsRequest req = new GetDocumentVersionsRequest().documentId(documentId)
        .next("nn").tz("-0600").siteId(siteId);
    HttpResponse<String> response = this.client0.getDocumentVersionsAsHttpResponse(req);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/documents/" + documentId + "/versions?next=nn&tz=-0600&siteId=" + siteId,
        response.request().uri().toString());

    DocumentVersions versions = gson.fromJson(response.body(), DocumentVersions.class);
    assertEquals("123", versions.next());
    assertEquals("9eb6a07a-08c0-44e0-9d02-a8c6bebb1408", versions.documents().get(0).version());
    assertEquals("2020/05/05 18:11:36", df.format(versions.documents().get(0).lastModifiedDate()));
  }

  /**
   * Test GET /documents/{documentid}/syncs.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocumentSyncs01() throws Exception {
    GetDocumentSyncsRequest req =
        new GetDocumentSyncsRequest().documentId(documentId).siteId(siteId);
    DocumentSyncs syncs = this.client0.getDocumentSyncs(req);
    DocumentSync sync = syncs.syncs().get(0);
    assertEquals("joe", sync.userId());
    assertEquals("1234", sync.documentId());
    assertEquals("COMPLETE", sync.status());
    assertEquals("METADATA", sync.type());
    assertEquals("TYPESENSE", sync.service());
    assertNotNull(sync.syncDate());
  }

  /**
   * Test GET /documents/{documentid}/syncs.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocumentSyncs02() throws Exception {
    GetDocumentSyncsRequest req = new GetDocumentSyncsRequest();
    try {
      this.client0.getDocumentSyncs(req);
      fail();
    } catch (NullPointerException e) {
      assertEquals("DocumentId is required.", e.getMessage());
    }
  }

  /**
   * Test GET /documents/{documentid}/syncs.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocumentSyncsAsHttpResponse() throws Exception {
    GetDocumentSyncsRequest req =
        new GetDocumentSyncsRequest().documentId(documentId).siteId(siteId);
    HttpResponse<String> response = this.client0.getDocumentSyncsAsHttpResponse(req);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/documents/" + documentId + "/syncs?siteId=" + siteId,
        response.request().uri().toString());
    assertEquals("GET", response.request().method());

    DocumentSyncs syncs = gson.fromJson(response.body(), DocumentSyncs.class);
    DocumentSync sync = syncs.syncs().get(0);
    assertEquals("joe", sync.userId());
    assertEquals("1234", sync.documentId());
    assertEquals("COMPLETE", sync.status());
    assertEquals("METADATA", sync.type());
    assertEquals("TYPESENSE", sync.service());
    assertNotNull(sync.syncDate());
  }


  /**
   * Test GET /documents/{documentId}/tags/{tagKey}.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocumentTag01() throws Exception {
    GetDocumentTagsKeyRequest request =
        new GetDocumentTagsKeyRequest().documentId(documentId).tagKey("category").siteId(siteId);
    DocumentTag tag = this.client0.getDocumentTag(request);
    assertEquals("2020/05/05 18:11:36", df.format(tag.insertedDate()));
    assertEquals("category", tag.key());
    assertEquals("userdefined", tag.type());
    assertEquals("jsmith", tag.userId());
    assertEquals("9eb6a07a-08c0-44e0-9d02-a8c6bebb1408", tag.value());
    assertEquals("999", tag.documentId());
  }

  /**
   * Test GET /documents/{documentId}/tags/{tagKey}.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocumentTag02() throws Exception {
    GetDocumentTagsKeyRequest request = new GetDocumentTagsKeyRequest();
    try {
      this.client0.getDocumentTag(request);
      fail();
    } catch (NullPointerException e) {
      assertEquals("DocumentId is required.", e.getMessage());
    }
  }

  /**
   * Test GET /documents/{documentId}/tags/{tagKey}.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocumentTagAsHttpResponse() throws Exception {
    GetDocumentTagsKeyRequest request =
        new GetDocumentTagsKeyRequest().documentId(documentId).tagKey("category").siteId(siteId);
    HttpResponse<String> response = this.client0.getDocumentTagAsHttpResponse(request);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals("GET", response.request().method());
    assertEquals(URL + "/documents/" + documentId + "/tags/category?siteId=" + siteId,
        response.request().uri().toString());

    DocumentTag tag = gson.fromJson(response.body(), DocumentTag.class);
    assertEquals("2020/05/05 18:11:36", df.format(tag.insertedDate()));
    assertEquals("category", tag.key());
    assertEquals("userdefined", tag.type());
    assertEquals("jsmith", tag.userId());
    assertEquals("9eb6a07a-08c0-44e0-9d02-a8c6bebb1408", tag.value());
    assertEquals("999", tag.documentId());
  }

  /**
   * Test GET /documents/upload.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocumentUpload() throws Exception {
    DocumentUrl url = this.client0.getDocumentUpload(new GetDocumentUploadRequest().contentLength(1)
        .documentId(null).duration(2).path("test.txt"));
    assertEquals("3c39bb05-9c7a-4afa-8497-6935a1e8dbae", url.documentId());
    assertEquals("https://www.google.com", url.url());
  }

  /**
   * Test GET /documents/upload.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocumentUploadAsHttpResponse01() throws Exception {
    HttpResponse<String> response =
        this.client0.getDocumentUploadAsHttpResponse(new GetDocumentUploadRequest().contentLength(1)
            .documentId(null).duration(2).path("test.txt"));
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/documents/upload?duration=2&path=test.txt&contentLength=1",
        response.request().uri().toString());
    assertEquals("GET", response.request().method());

    DocumentUrl url = gson.fromJson(response.body(), DocumentUrl.class);
    assertEquals("3c39bb05-9c7a-4afa-8497-6935a1e8dbae", url.documentId());
    assertEquals("https://www.google.com", url.url());
  }

  /**
   * Test GET /documents/{documentId}/upload.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocumentUploadAsHttpResponse02() throws Exception {
    GetDocumentUploadRequest req = new GetDocumentUploadRequest().documentId(documentId)
        .siteId(siteId).contentLength(1).duration(2).path("test.txt");
    HttpResponse<String> response = this.client0.getDocumentUploadAsHttpResponse(req);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals("GET", response.request().method());
    assertEquals(URL + "/documents/" + documentId + "/upload?duration=2&path=test.txt&siteId="
        + siteId + "&contentLength=1", response.request().uri().toString());

    DocumentUrl url = gson.fromJson(response.body(), DocumentUrl.class);
    assertEquals("3c39bb05-9c7a-4afa-8497-6935a1e8dbae", url.documentId());
    assertEquals("https://www.google.com", url.url());
  }

  /**
   * Test GET /esignature/docusign/config.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocusignConfig() throws Exception {
    DocusignConfig config = this.client0.getDocusignConfig(new GetDocusignRequest());
    assertEquals("555", config.clientId());
    assertEquals("123", config.userId());
    assertTrue(config.configured());
  }

  /**
   * Test GET /esignature/docusign/config.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetDocusignConfigAsHttpResponse01() throws Exception {
    HttpResponse<String> response =
        this.client0.getDocusignConfigAsHttpResponse(new GetDocusignRequest());
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/esignature/docusign/config", response.request().uri().toString());
    assertEquals("GET", response.request().method());

    DocusignConfig config = gson.fromJson(response.body(), DocusignConfig.class);
    assertEquals("555", config.clientId());
    assertEquals("123", config.userId());
    assertTrue(config.configured());
  }

  /**
   * Test GET /sites.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetSites() throws Exception {
    Sites sites = this.client0.getSites();
    assertEquals(1, sites.sites().size());
    assertEquals("test@formkiq.com", sites.sites().get(0).uploadEmail());
    assertEquals("adadsad", sites.sites().get(0).siteId());
  }

  /**
   * Test GET /sites.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetSitesAsHttpResponse() throws Exception {
    HttpResponse<String> response = this.client0.getSitesAsHttpResponse();
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    HttpRequest request = response.request();
    assertEquals(URL + "/sites", request.uri().toString());
    assertEquals("GET", request.method());
    assertEquals("http://localhost", request.headers().firstValue("Origin").get());
    assertTrue(request.headers().firstValue("Authorization").get()
        .startsWith("AWS4-HMAC-SHA256 Credential=123"));
  }

  /**
   * Test GET /tagSchema/{tagSchemaId}.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetTagSchema01() throws Exception {
    GetTagSchemaRequest req = new GetTagSchemaRequest().siteId(siteId).tagSchemaId(documentId);
    TagSchema doc = this.client0.getTagSchema(req);
    assertEquals("test", doc.name());
    assertEquals("123", doc.tagSchemaId());
    assertEquals("joe", doc.userId());
    assertEquals("2022/06/07 03:44:23", df.format(doc.insertedDate()));
  }

  /**
   * Test GET /tagSchema/{tagSchemaId}. Missing tagSchemaId.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetTagSchema02() throws Exception {
    GetTagSchemaRequest req = new GetTagSchemaRequest();

    try {
      this.client0.getTagSchema(req);
      fail();
    } catch (NullPointerException e) {
      assertEquals("TagSchemaId is required.", e.getMessage());
    }
  }

  /**
   * Test GET /tagSchema/{tagSchemaId}.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetTagSchemaAsHttpResponse() throws Exception {
    GetTagSchemasRequest req =
        new GetTagSchemasRequest().siteId(siteId).next("bbb").previous("aaa").limit(0);
    HttpResponse<String> response = this.client0.getTagSchemasAsHttpResponse(req);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/tagSchemas?next=bbb&previous=aaa&limit=0&siteId=" + siteId,
        response.request().uri().toString());
    assertEquals("GET", response.request().method());

    TagSchemaSummaries summaries = gson.fromJson(response.body(), TagSchemaSummaries.class);
    assertEquals(1, summaries.schemas().size());
    TagSchemaSummary doc = summaries.schemas().get(0);
    assertEquals("testschema", doc.name());
    assertEquals("3c39bb05-9c7a-4afa-8497-6935a1e8dbae", doc.tagSchemaId());
    assertEquals("6981181a-bbb1-4228-a65d-6dc947f036ac@formkiq.com", doc.userId());
    assertEquals("2020/05/05 17:31:06", df.format(doc.insertedDate()));
  }

  /**
   * Test GET /tagSchemas.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetTagSchemas() throws Exception {
    GetTagSchemasRequest req = new GetTagSchemasRequest().siteId(siteId);
    TagSchemaSummaries summaries = this.client0.getTagSchemas(req);
    assertEquals(1, summaries.schemas().size());
    TagSchemaSummary doc = summaries.schemas().get(0);
    assertEquals("testschema", doc.name());
    assertEquals("3c39bb05-9c7a-4afa-8497-6935a1e8dbae", doc.tagSchemaId());
    assertEquals("6981181a-bbb1-4228-a65d-6dc947f036ac@formkiq.com", doc.userId());
    assertEquals("2020/05/05 17:31:06", df.format(doc.insertedDate()));
  }

  /**
   * Test GET /tagSchemas.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetTagSchemasAsHttpResponse() throws Exception {
    GetTagSchemasRequest req = new GetTagSchemasRequest().siteId(siteId);
    HttpResponse<String> response = this.client0.getTagSchemasAsHttpResponse(req);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/tagSchemas?siteId=" + siteId, response.request().uri().toString());
    assertEquals("GET", response.request().method());

    TagSchemaSummaries summaries = gson.fromJson(response.body(), TagSchemaSummaries.class);
    assertEquals(1, summaries.schemas().size());
    TagSchemaSummary doc = summaries.schemas().get(0);
    assertEquals("testschema", doc.name());
    assertEquals("3c39bb05-9c7a-4afa-8497-6935a1e8dbae", doc.tagSchemaId());
    assertEquals("6981181a-bbb1-4228-a65d-6dc947f036ac@formkiq.com", doc.userId());
    assertEquals("2020/05/05 17:31:06", df.format(doc.insertedDate()));
  }

  /**
   * Test GET /version.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetVersion() throws Exception {
    assertEquals("0.0.45", this.client0.getVersion().version());
    assertEquals("core", this.client0.getVersion().type());
    assertEquals("[ocr]", this.client0.getVersion().modules().toString());
  }

  /**
   * Test GET /version.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetVersionAsHttpResponse() throws Exception {
    HttpResponse<String> response = this.client0.getVersionAsHttpResponse();
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals("0.0.45", gson.fromJson(response.body(), Map.class).get("version").toString());
    assertEquals("core", gson.fromJson(response.body(), Map.class).get("type").toString());
    assertEquals("[ocr]", gson.fromJson(response.body(), Map.class).get("modules").toString());
    HttpRequest request = response.request();
    assertEquals(URL + "/version", request.uri().toString());
    assertEquals("GET", request.method());
    assertEquals("http://localhost", request.headers().firstValue("Origin").get());
    assertTrue(request.headers().firstValue("Authorization").get()
        .startsWith("AWS4-HMAC-SHA256 Credential=123"));
  }

  /**
   * Test GET /webhooks.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetWebhooks01() throws Exception {
    GetWebhooksRequest req = new GetWebhooksRequest().siteId(siteId);
    Webhooks doc = this.client0.getWebhooks(req);

    assertEquals(1, doc.webhooks().size());
    assertEquals("werwer", "" + doc.webhooks().get(0).id());
    assertEquals("foo", "" + doc.webhooks().get(0).name());
    assertEquals("test", "" + doc.webhooks().get(0).siteId());
    assertEquals("http://localhost:8080/webhooks", "" + doc.webhooks().get(0).url());
    assertEquals("joe", "" + doc.webhooks().get(0).userId());
  }


  /**
   * Test GET /webhooks.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetWebhooksAsHttpResponse() throws Exception {
    GetWebhooksRequest req = new GetWebhooksRequest().siteId(siteId);
    HttpResponse<String> response = this.client0.getWebhooksAsHttpResponse(req);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/webhooks?siteId=" + siteId, response.request().uri().toString());
    assertEquals("GET", response.request().method());

    Webhooks doc = gson.fromJson(response.body(), Webhooks.class);
    assertEquals(1, doc.webhooks().size());
    assertEquals("werwer", "" + doc.webhooks().get(0).id());
    assertEquals("foo", "" + doc.webhooks().get(0).name());
    assertEquals("test", "" + doc.webhooks().get(0).siteId());
    assertEquals("http://localhost:8080/webhooks", "" + doc.webhooks().get(0).url());
    assertEquals("joe", "" + doc.webhooks().get(0).userId());
  }

  /**
   * Test GET /webhooks/{webhookId}/tags.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetWebhookTags01() throws Exception {
    GetWebhookTagsRequest req = new GetWebhookTagsRequest().siteId(siteId).webhookId(documentId);
    WebhookTags doc = this.client0.getWebhookTags(req);

    assertEquals(1, doc.tags().size());
    assertEquals("category", doc.tags().get(0).key());
    assertEquals("userdefined", doc.tags().get(0).type());
    assertEquals("jsmith", doc.tags().get(0).userId());
    assertEquals("9eb6a07a-08c0-44e0-9d02-a8c6bebb1408", doc.tags().get(0).value());
    assertEquals("999", "" + doc.tags().get(0).webhookId());
    assertNotNull(doc.tags().get(0).insertedDate());
  }

  /**
   * Test GET /webhooks/{webhookId}/tags.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testGetWebhookTagsAsHttpResponse() throws Exception {
    GetWebhookTagsRequest req = new GetWebhookTagsRequest().siteId(siteId).webhookId(documentId);
    HttpResponse<String> response = this.client0.getWebhookTagsAsHttpResponse(req);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/webhooks/" + documentId + "/tags?siteId=" + siteId,
        response.request().uri().toString());
    assertEquals("GET", response.request().method());

    WebhookTags doc = gson.fromJson(response.body(), WebhookTags.class);
    assertEquals(1, doc.tags().size());
    assertEquals("category", doc.tags().get(0).key());
    assertEquals("userdefined", doc.tags().get(0).type());
    assertEquals("jsmith", doc.tags().get(0).userId());
    assertEquals("9eb6a07a-08c0-44e0-9d02-a8c6bebb1408", doc.tags().get(0).value());
    assertEquals("999", "" + doc.tags().get(0).webhookId());
    assertNotNull(doc.tags().get(0).insertedDate());
  }

  /**
   * Test OPTIONS /documents/{documentid}.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testOptionsDocument() throws Exception {
    OptionsDocumentRequest req = new OptionsDocumentRequest().documentId(documentId);
    HttpResponse<String> response = this.client0.optionsDocument(req);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/documents/" + documentId, response.request().uri().toString());
    assertEquals("OPTIONS", response.request().method());
  }

  /**
   * Test OPTIONS /documents/{documentId}/content.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testOptionsDocumentContent() throws Exception {
    OptionsDocumentContentRequest request =
        new OptionsDocumentContentRequest().documentId(documentId);
    HttpResponse<String> response = this.client0.optionsDocumentContent(request);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals("OPTIONS", response.request().method());
    assertEquals(URL + "/documents/" + documentId + "/content",
        response.request().uri().toString());
  }

  /**
   * Test Options /documents/{documentId}/url.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testOptionsDocumentContentsUrl() throws Exception {
    OptionsDocumentContentUrlRequest req =
        new OptionsDocumentContentUrlRequest().documentId(documentId);
    HttpResponse<String> response = this.client0.optionsDocumentContentUrl(req);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/documents/" + documentId + "/url", response.request().uri().toString());
    assertEquals("OPTIONS", response.request().method());
  }

  /**
   * Test OPTIONS /documents/{documentId}/formats.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testOptionsDocumentFormats() throws Exception {
    OptionsDocumentFormatRequest request =
        new OptionsDocumentFormatRequest().documentId(documentId);
    HttpResponse<String> response = this.client0.optionsDocumentFormats(request);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/documents/" + documentId + "/formats",
        response.request().uri().toString());
    assertEquals("OPTIONS", response.request().method());
  }

  /**
   * Test OPTIONS /documents.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testOptionsDocuments() throws Exception {
    HttpResponse<String> response = this.client0.optionsDocuments();
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/documents", response.request().uri().toString());
    assertEquals("OPTIONS", response.request().method());
  }

  /**
   * Test OPTIONS /documents/{documentid}/tags.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testOptionsDocumentsTags() throws Exception {
    OptionsDocumentTagsRequest req = new OptionsDocumentTagsRequest().documentId(documentId);
    HttpResponse<String> response = this.client0.optionsDocumentTags(req);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals("OPTIONS", response.request().method());
    assertEquals(URL + "/documents/" + documentId + "/tags", response.request().uri().toString());
  }

  /**
   * Test OPTIONS /documents/{documentId}/tags/{tagKey}.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testOptionsDocumentTag() throws Exception {
    OptionsDocumentTagsKeyRequest request =
        new OptionsDocumentTagsKeyRequest().documentId(documentId).tagKey("category");
    HttpResponse<String> response = this.client0.optionsDocumentTag(request);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals("OPTIONS", response.request().method());
    assertEquals(URL + "/documents/" + documentId + "/tags/category",
        response.request().uri().toString());
  }

  /**
   * Test Options /documents/upload.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testOptionsDocumentUpload01() throws Exception {
    HttpResponse<String> response = this.client0.optionsDocumentUpload();
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/documents/upload", response.request().uri().toString());
    assertEquals("OPTIONS", response.request().method());
  }

  /**
   * Test Options /documents/{documentId}/upload.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testOptionsDocumentUploadWithDocumentId() throws Exception {
    OptionsDocumentUploadRequest req = new OptionsDocumentUploadRequest().documentId(documentId);
    HttpResponse<String> response = this.client0.optionsDocumentUpload(req);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals("OPTIONS", response.request().method());
    assertEquals(URL + "/documents/" + documentId + "/upload", response.request().uri().toString());
  }

  /**
   * Test Options /documents/{documentId}/versions.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testOptionsDocumentVersions() throws Exception {
    OptionsDocumentVersionsRequest req =
        new OptionsDocumentVersionsRequest().documentId(documentId);
    HttpResponse<String> response = this.client0.optionsDocumentVersions(req);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/documents/" + documentId + "/versions",
        response.request().uri().toString());
    assertEquals("OPTIONS", response.request().method());
  }

  /**
   * Test OPTIONS /search.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testOptionsSearch() throws Exception {
    HttpResponse<String> response = this.client0.optionsSearch();
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/search", response.request().uri().toString());
    assertEquals("OPTIONS", response.request().method());
  }

  /**
   * Test OPTIONS /sites.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testOptionsSites() throws Exception {
    HttpResponse<String> response = this.client0.optionsSites();
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/sites", response.request().uri().toString());
    assertEquals("OPTIONS", response.request().method());
  }

  /**
   * Test OPTIONS /version.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testOptionsVersion() throws Exception {
    HttpResponse<String> response = this.client0.optionsVersion();
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/version", response.request().uri().toString());
    assertEquals("OPTIONS", response.request().method());
  }

  /**
   * Test Options /webhooks.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testOptionsWebhooks01() throws Exception {
    HttpResponse<String> response = this.client0.optionsWebhooks();
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/webhooks", response.request().uri().toString());
    assertEquals("OPTIONS", response.request().method());
  }

  /**
   * Test Options /webhooks/{webhookId}.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testOptionsWebhooksId01() throws Exception {
    OptionsWebhookRequest req = new OptionsWebhookRequest().webhookId(documentId).siteId(siteId);
    HttpResponse<String> response = this.client0.optionsWebhooks(req);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/webhooks/" + documentId + "?siteId=" + siteId,
        response.request().uri().toString());
    assertEquals("OPTIONS", response.request().method());
  }

  /**
   * Test Options /webhooks/{webhookId}/tags.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testOptionsWebhookTags01() throws Exception {
    OptionsWebhookTagsRequest req =
        new OptionsWebhookTagsRequest().webhookId(documentId).siteId(siteId);
    HttpResponse<String> response = this.client0.optionsWebhookTags(req);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/webhooks/" + documentId + "/tags?siteId=" + siteId,
        response.request().uri().toString());
    assertEquals("OPTIONS", response.request().method());
  }

  /**
   * Test POST /documents/{documentId}/actions.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testPostDocumentAction() throws Exception {
    AddDocumentActionRequest req =
        new AddDocumentActionRequest().documentId(documentId).siteId(siteId)
            .actions(Arrays.asList(new AddDocumentAction().type(DocumentActionType.OCR)));
    this.client0.addDocumentAction(req);
  }

  /**
   * Test POST /documents/{documentId}/formats.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testPostDocumentFormats() throws Exception {
    DocumentFormatSearchRequest req = new DocumentFormatSearchRequest().documentId(documentId)
        .mime("bleh").siteId(siteId).siteId("10").versionId("2");
    HttpResponse<String> response = this.client0.addDocumentFormatAsHttpResponse(req);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/documents/" + documentId + "/formats?siteId=10",
        response.request().uri().toString());
    assertEquals("POST", response.request().method());
  }

  /**
   * Test POST /documents/{documentId}/ocr.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testPostDocumentOcr() throws Exception {
    AddDocumentOcrRequest req = new AddDocumentOcrRequest().documentId(documentId).siteId(siteId)
        .parseTypes(Arrays.asList(OcrParseType.FORMS));
    this.client0.addDocumentOcr(req);
  }

  /**
   * Test PUT /documents/{documentId}/antivirus.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testPutDocumentAntivirus01() throws Exception {
    SetDocumentAntivirusRequest req =
        new SetDocumentAntivirusRequest().documentId(documentId).siteId(siteId);
    this.client0.setDocumentAntivirus(req);
  }

  /**
   * Test PUT /documents/{documentId}/antivirus.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testPutDocumentAntivirusAsHttpResponse01() throws Exception {

    SetDocumentAntivirusRequest req =
        new SetDocumentAntivirusRequest().documentId(documentId).siteId(siteId);

    HttpResponse<String> response = this.client0.setDocumentAntivirusAsHttpResponse(req);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/documents/" + documentId + "/antivirus?siteId=" + siteId,
        response.request().uri().toString());
    assertEquals("PUT", response.request().method());
  }

  /**
   * Test PUT /documents/{documentId}/fulltext.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testPutDocumentFulltext01() throws Exception {
    SetDocumentFulltextRequest req =
        new SetDocumentFulltextRequest().documentId(documentId).siteId(siteId)
            .document(new SetDocumentFulltext().content("this").contentType("text/plain"));
    this.client0.setDocumentFulltext(req);
  }

  /**
   * Test PUT /documents/{documentId}/ocr.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testPutDocumentOcr01() throws Exception {
    SetDocumentOcrRequest req = new SetDocumentOcrRequest().documentId(documentId).siteId(siteId)
        .document(new SetDocumentOcr().content("test").contentType("text/plain"));
    this.client0.setDocumentOcr(req);
  }

  /**
   * Test PUT /documents/{documentId}/versions.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testPutDocumentVersion01() throws Exception {
    SetDocumentVersionRequest req =
        new SetDocumentVersionRequest().documentId(documentId).siteId(siteId).versionKey("test");
    this.client0.setDocumentVersion(req);
  }

  /**
   * Test PUT /esignature/docusign/config.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testPutDocusignConfig01() throws Exception {
    SetDocusignConfigRequest request = new SetDocusignConfigRequest()
        .config(new SetDocusignConfig().clientId("1").privateKey("123").clientId("2"));
    this.client0.setDocusignConfig(request);
  }

  /**
   * Test PUT /esignature/docusign/config.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testPutDocusignConfig02() throws Exception {
    SetDocusignConfigRequest request = new SetDocusignConfigRequest();
    try {
      this.client0.setDocusignConfig(request);
      fail();
    } catch (NullPointerException e) {
      assertEquals("Config is required.", e.getMessage());
    }
  }

  /**
   * Test PUT /esignature/docusign/config.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testPutDocusignConfigAsHttpResponse() throws Exception {
    SetDocusignConfigRequest request = new SetDocusignConfigRequest().siteId(siteId)
        .config(new SetDocusignConfig().clientId("1").privateKey("123").clientId("2"));
    HttpResponse<String> response = this.client0.setDocusignConfigAsHttpResponse(request);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals("PUT", response.request().method());
    assertEquals(URL + "/esignature/docusign/config?siteId=" + siteId,
        response.request().uri().toString());
  }

  /**
   * Test POST /queryFulltext.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testQueryFulltext01() throws Exception {
    QueryFulltextRequest req = new QueryFulltextRequest().query("").siteId(siteId);
    String text = this.client0.queryFulltext(req);
    assertEquals("{\n" + "  \"documentId\": \"3de5c199-0537-4bb3-a035-aa2367a8bddc\"\n" + "}",
        text);
  }

  /**
   * Test POST /search.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testSearch01() throws Exception {
    SearchDocumentsRequest req = new SearchDocumentsRequest()
        .query(new DocumentSearchQuery()
            .tag(new DocumentSearchTag().key("category").eq("value").beginsWith("bbb")))
        .limit(1).next("nnn").previous("ppp").siteId(siteId);

    Documents docs = this.client0.search(req);
    assertEquals("123", docs.next());
    assertEquals("345345", docs.previous());
    assertEquals(1, docs.documents().size());
    assertEquals("1000", "" + docs.documents().get(0).contentLength());
    assertEquals("text/plain", docs.documents().get(0).contentType());
    assertEquals("3fa85f64-5717-4562-b3fc-2c963f66afa6", docs.documents().get(0).documentId());
    assertEquals("jkldfkdsjfksdj", docs.documents().get(0).checksum());
    assertEquals("2020/05/05 19:09:09", df.format(docs.documents().get(0).insertedDate()));
    assertEquals("sample/test.txt", docs.documents().get(0).path());
    assertEquals("jtest", docs.documents().get(0).userId());
  }

  /**
   * Test POST /search.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testSearch02() throws Exception {
    SearchDocumentsRequest req = new SearchDocumentsRequest();
    try {
      this.client0.search(req);
      fail();
    } catch (NullPointerException e) {
      assertEquals("Query is required.", e.getMessage());
    }
  }

  /**
   * Test POST /search.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testSearchAsHttpResponse() throws Exception {

    SearchDocumentsRequest req = new SearchDocumentsRequest()
        .query(new DocumentSearchQuery()
            .tag(new DocumentSearchTag().key("category").eq("value").beginsWith("bbb")))
        .limit(1).next("nnn").previous("ppp").siteId(siteId);

    HttpResponse<String> response = this.client0.searchAsHttpResponse(req);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/search?next=nnn&previous=ppp&limit=1&siteId=" + siteId,
        response.request().uri().toString());
    assertEquals("POST", response.request().method());

    Documents docs = gson.fromJson(response.body(), Documents.class);
    assertEquals("123", docs.next());
    assertEquals("345345", docs.previous());
    assertEquals(1, docs.documents().size());
    assertEquals("1000", "" + docs.documents().get(0).contentLength());
    assertEquals("text/plain", docs.documents().get(0).contentType());
    assertEquals("3fa85f64-5717-4562-b3fc-2c963f66afa6", docs.documents().get(0).documentId());
    assertEquals("jkldfkdsjfksdj", docs.documents().get(0).checksum());
    assertEquals("2020/05/05 19:09:09", df.format(docs.documents().get(0).insertedDate()));
    assertEquals("sample/test.txt", docs.documents().get(0).path());
    assertEquals("jtest", docs.documents().get(0).userId());
  }

  /**
   * Test POST /searchFulltext.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testSearchFulltext01() throws Exception {
    SearchFulltextRequest req = new SearchFulltextRequest()
        .query(new FulltextSearchQuery()
            .tags(Arrays.asList(new FulltextSearchTag().key("category").eq("value"))))
        .limit(1).siteId(siteId);

    FulltextDocuments docs = this.client0.searchFulltext(req);
    assertEquals(1, docs.documents().size());
    assertEquals("3fa85f64-5717-4562-b3fc-2c963f66afa6", docs.documents().get(0).documentId());
    assertEquals("2020/05/05 19:09:09", df.format(docs.documents().get(0).insertedDate()));
    assertEquals("sample/test.txt", docs.documents().get(0).path());
    assertEquals("jtest", docs.documents().get(0).createdBy());
  }

  /**
   * Test POST /searchFulltext.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testSearchFulltext02() throws Exception {
    SearchFulltextRequest req = new SearchFulltextRequest();
    try {
      this.client0.searchFulltext(req);
      fail();
    } catch (NullPointerException e) {
      e.printStackTrace();
      assertEquals("Query is required.", e.getMessage());
    }
  }

  /**
   * Test POST /searchFulltext.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testSearchFulltextAsHttpResponse() throws Exception {

    SearchFulltextRequest req = new SearchFulltextRequest()
        .query(new FulltextSearchQuery()
            .tags(Arrays.asList(new FulltextSearchTag().key("category").eq("value"))))
        .limit(1).siteId(siteId);

    HttpResponse<String> response = this.client0.searchFulltextAsHttpResponse(req);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/searchFulltext?limit=1&siteId=" + siteId,
        response.request().uri().toString());
    assertEquals("POST", response.request().method());

    FulltextDocuments docs = gson.fromJson(response.body(), FulltextDocuments.class);
    assertEquals(1, docs.documents().size());
    assertEquals("3fa85f64-5717-4562-b3fc-2c963f66afa6", docs.documents().get(0).documentId());
    assertEquals("2020/05/05 19:09:09", df.format(docs.documents().get(0).insertedDate()));
    assertEquals("sample/test.txt", docs.documents().get(0).path());
    assertEquals("jtest", docs.documents().get(0).createdBy());
  }

  /**
   * Test POST /tagSchemas.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testTagSchemasAsHttpResponse01() throws Exception {
    AddTagSchemaRequest req = new AddTagSchemaRequest().siteId(siteId)
        .tagSchema(new TagSchema().tags(new TagSchemaTags()));
    HttpResponse<String> response = this.client0.addTagSchemaAsHttpResponse(req);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals(URL + "/tagSchemas?siteId=" + siteId, response.request().uri().toString());
    assertEquals("POST", response.request().method());

    assertEquals("3c39bb05-9c7a-4afa-8497-6935a1e8dbae",
        gson.fromJson(response.body(), Map.class).get("tagSchemaId").toString());
  }

  /**
   * Test PATCH /configs.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testUpdateConfigs01() throws Exception {
    Config config = new Config();
    config.chatGptApiKey("ABC");
    UpdateConfigsRequest request = new UpdateConfigsRequest().config(config).siteId(siteId);
    this.client0.updateConfigs(request);
  }

  /**
   * Test PATCH /configs.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testUpdateConfigsAsHttpResponse() throws Exception {
    Config config = new Config();
    UpdateConfigsRequest request = new UpdateConfigsRequest().config(config).siteId(siteId);
    HttpResponse<String> response = this.client0.updateConfigsAsHttpResponse(request);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals("PATCH", response.request().method());
    assertEquals(URL + "/configs?siteId=" + siteId, response.request().uri().toString());
  }

  /**
   * Test PATCH /documents/{documentId}/fulltext.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testUpdateDocumentFulltext01() throws Exception {
    UpdateDocumentFulltextRequest request = new UpdateDocumentFulltextRequest()
        .documentId(documentId).siteId(siteId).document(new UpdateFulltext().content("test"));
    assertTrue(this.client0.updateDocumentFulltext(request));
  }

  /**
   * Test PATCH /documents/{documentId}/fulltext.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testUpdateDocumentFulltext02() throws Exception {
    UpdateDocumentFulltextRequest request = new UpdateDocumentFulltextRequest();
    try {
      this.client0.updateDocumentFulltext(request);
      fail();
    } catch (NullPointerException e) {
      assertEquals("DocumentId is required.", e.getMessage());
    }
  }

  /**
   * Test PATCH /documents/{documentId}/fulltext.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testUpdateDocumentFulltextTagAsHttpResponse() throws Exception {
    UpdateDocumentFulltextRequest request = new UpdateDocumentFulltextRequest()
        .documentId(documentId).siteId(siteId).document(new UpdateFulltext());
    HttpResponse<String> response = this.client0.updateDocumentFulltextAsHttpResponse(request);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals("PATCH", response.request().method());
    assertEquals(URL + "/documents/" + documentId + "/fulltext?siteId=" + siteId,
        response.request().uri().toString());
  }

  /**
   * Test PATCH /documents.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testUpdateDocuments01() throws Exception {
    UpdateDocument post =
        gson.fromJson(resourceToString("/post_documents.json", UTF_8), UpdateDocument.class);
    UpdateDocumentRequest request =
        new UpdateDocumentRequest().document(post).documentId(documentId).siteId(siteId);
    UpdateDocumentResponse response = this.client0.updateDocument(request);
    assertEquals("3de5c199-0537-4bb3-a035-aa2367a8bddc", response.documentId());
  }

  /**
   * Test PATCH /documents. Missing Data.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testUpdateDocuments02() throws Exception {
    UpdateDocumentRequest request = new UpdateDocumentRequest();
    try {
      this.client0.updateDocument(request);
      fail();
    } catch (NullPointerException e) {
      assertEquals("DocumentId is required.", e.getMessage());
    }
  }

  /**
   * Test PATCH /documents.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testUpdateDocumentsAsHttpResponse() throws Exception {
    UpdateDocument post =
        gson.fromJson(resourceToString("/post_documents.json", UTF_8), UpdateDocument.class);
    UpdateDocumentRequest request = new UpdateDocumentRequest().document(post)
        .documentId(documentId).siteId(siteId).webnotify(true);
    HttpResponse<String> response = this.client0.updateDocumentAsHttpResponse(request);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals("PATCH", response.request().method());
    assertEquals(URL + "/documents/" + documentId + "?siteId=" + siteId + "&webnotify=true",
        response.request().uri().toString());
    assertEquals("3de5c199-0537-4bb3-a035-aa2367a8bddc",
        gson.fromJson(response.body(), Map.class).get("documentId").toString());
  }

  /**
   * Test PUT /documents/{documentId}/tags/{tagKey}.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testUpdateDocumentTag01() throws Exception {
    UpdateDocumentTagKeyRequest request = new UpdateDocumentTagKeyRequest().documentId(documentId)
        .tagKey("category").siteId(siteId).tagValue("food");
    assertTrue(this.client0.updateDocumentTag(request));
  }

  /**
   * Test PUT /documents/{documentId}/tags/{tagKey}.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testUpdateDocumentTag02() throws Exception {
    UpdateDocumentTagKeyRequest request = new UpdateDocumentTagKeyRequest();
    try {
      this.client0.updateDocumentTag(request);
      fail();
    } catch (NullPointerException e) {
      assertEquals("DocumentId is required.", e.getMessage());
    }
  }

  /**
   * Test PUT /documents/{documentId}/tags/{tagKey}.
   * 
   * @throws Exception Exception
   */
  @Test
  public void testUpdateDocumentTagAsHttpResponse() throws Exception {
    UpdateDocumentTagKeyRequest request = new UpdateDocumentTagKeyRequest().documentId(documentId)
        .tagKey("category").siteId(siteId).tagValue("food").webnotify(true);
    HttpResponse<String> response = this.client0.updateDocumentTagAsHttpResponse(request);
    assertEquals(HTTP_STATUS_OK, response.statusCode());
    assertEquals("PUT", response.request().method());
    assertEquals(
        URL + "/documents/" + documentId + "/tags/category?siteId=" + siteId + "&webnotify=true",
        response.request().uri().toString());
  }

}
