/*
 * FormKiQ HTTP API Formkiq API: Document Management Platform API using OAuth(JWT) Authentication
 * You can find out more about FormKiQ at [https://formkiq.com](http://formkiq.com). ## Introduction
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
 * The version of the OpenAPI document: 1.14.0 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.api;

import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.model.AddDocumentRequest;
import com.formkiq.client.model.AddDocumentResponse;
import com.formkiq.client.model.AddDocumentUploadRequest;
import com.formkiq.client.model.DocumentsCompressRequest;
import com.formkiq.client.model.DocumentsCompressResponse;
import com.formkiq.client.model.GetDocumentContentResponse;
import com.formkiq.client.model.GetDocumentResponse;
import com.formkiq.client.model.GetDocumentSyncResponse;
import com.formkiq.client.model.GetDocumentUrlResponse;
import com.formkiq.client.model.GetDocumentsResponse;
import com.formkiq.client.model.SetDocumentRestoreResponse;
import com.formkiq.client.model.UpdateDocumentRequest;
import com.formkiq.client.model.ValidationErrorsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DocumentsApi
 */
@Disabled
public class DocumentsApiTest {

  private final DocumentsApi api = new DocumentsApi();

  /**
   * Add new document
   *
   * Creates a new document; body may include document content if less than 5 MB See POST
   * /documents/{documentId}/tags for adding tags to document schema See POST
   * /documents/{documentId}/actions for adding actions to document schema
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addDocumentTest() throws ApiException {
    AddDocumentRequest addDocumentRequest = null;
    String siteId = null;
    String shareKey = null;
    AddDocumentResponse response = api.addDocument(addDocumentRequest, siteId, shareKey);
    // TODO: test validations
  }

  /**
   * Add large document
   *
   * Returns a URL that can be used to upload document content and create a new document, while
   * allowing metadata to also be sent; this endpoint (whether GET or POST) is required in order to
   * add content that is larger than 5 MB
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addDocumentUploadTest() throws ApiException {
    AddDocumentUploadRequest addDocumentUploadRequest = null;
    String siteId = null;
    Integer contentLength = null;
    Integer duration = null;
    String shareKey = null;
    GetDocumentUrlResponse response =
        api.addDocumentUpload(addDocumentUploadRequest, siteId, contentLength, duration, shareKey);
    // TODO: test validations
  }

  /**
   * Compress multiple documents into a .zip file
   *
   * Compress documents into an .ZIP archive file, and returns a S3 presigned url for the location
   * of the archive file. The operation is async and processing time depends on the number and size
   * of documents included; a 404 status code is returned until the file is ready.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void compressDocumentsTest() throws ApiException {
    DocumentsCompressRequest documentsCompressRequest = null;
    String siteId = null;
    DocumentsCompressResponse response = api.compressDocuments(documentsCompressRequest, siteId);
    // TODO: test validations
  }

  /**
   * Delete document
   *
   * Delete a document
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteDocumentTest() throws ApiException {
    String documentId = null;
    String siteId = null;
    Boolean softDelete = null;
    api.deleteDocument(documentId, siteId, softDelete);
    // TODO: test validations
  }

  /**
   * Get document
   *
   * Retrieves a document&#39;s details, i.e., metadata
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getDocumentTest() throws ApiException {
    String documentId = null;
    String siteId = null;
    String shareKey = null;
    GetDocumentResponse response = api.getDocument(documentId, siteId, shareKey);
    // TODO: test validations
  }

  /**
   * Get document&#39;s contents
   *
   * Get a document&#39;s contents. Certain content types, text/_*, application/json, and
   * application/x-www-form-urlencoded. return the \&quot;content\&quot; field, while all other
   * content types return a &#39;contentUrl&#39; for retrieving the content.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getDocumentContentTest() throws ApiException {
    String documentId = null;
    String siteId = null;
    String versionKey = null;
    String shareKey = null;
    GetDocumentContentResponse response =
        api.getDocumentContent(documentId, siteId, versionKey, shareKey);
    // TODO: test validations
  }

  /**
   * Get url to update large document
   *
   * Returns a URL that can be used to upload documents for a specific documentId; this endpoint is
   * required in order to add content that is larger than 5 MB. If versions are enabled, this will
   * create a new version of the document.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getDocumentIdUploadTest() throws ApiException {
    String documentId = null;
    String siteId = null;
    Integer contentLength = null;
    Integer duration = null;
    String shareKey = null;
    GetDocumentUrlResponse response =
        api.getDocumentIdUpload(documentId, siteId, contentLength, duration, shareKey);
    // TODO: test validations
  }

  /**
   * Get document syncs
   *
   * Retrieve the document syncs with external services status
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getDocumentSyncsTest() throws ApiException {
    String documentId = null;
    String siteId = null;
    String limit = null;
    String shareKey = null;
    GetDocumentSyncResponse response = api.getDocumentSyncs(documentId, siteId, limit, shareKey);
    // TODO: test validations
  }

  /**
   * Get url to add large document
   *
   * Returns a URL that can be used to upload document content and create a new document; this
   * endpoint (whether GET or POST) is required in order to add content that is larger than 5 MB
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getDocumentUploadTest() throws ApiException {
    String path = null;
    String siteId = null;
    Integer contentLength = null;
    Integer duration = null;
    String shareKey = null;
    GetDocumentUrlResponse response =
        api.getDocumentUpload(path, siteId, contentLength, duration, shareKey);
    // TODO: test validations
  }

  /**
   * Get document content url
   *
   * Returns a URL for the document&#39;s contents; this URL will expire (the default is 48 hours)
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getDocumentUrlTest() throws ApiException {
    String documentId = null;
    String siteId = null;
    String versionKey = null;
    Integer duration = null;
    String shareKey = null;
    Boolean inline = null;
    GetDocumentUrlResponse response =
        api.getDocumentUrl(documentId, siteId, versionKey, duration, shareKey, inline);
    // TODO: test validations
  }

  /**
   * Get Documents listing
   *
   * Returns a list of the most recent documents added, ordered by inserted, descending
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getDocumentsTest() throws ApiException {
    String siteId = null;
    String actionStatus = null;
    Boolean deleted = null;
    String date = null;
    String tz = null;
    String next = null;
    String previous = null;
    String limit = null;
    GetDocumentsResponse response =
        api.getDocuments(siteId, actionStatus, deleted, date, tz, next, previous, limit);
    // TODO: test validations
  }

  /**
   * Restore soft deleted document
   *
   * Restores a soft deleted document
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void setDocumentRestoreTest() throws ApiException {
    String documentId = null;
    String siteId = null;
    SetDocumentRestoreResponse response = api.setDocumentRestore(documentId, siteId);
    // TODO: test validations
  }

  /**
   * Update document
   *
   * Update a document&#39;s details, i.e., metadata
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void updateDocumentTest() throws ApiException {
    String documentId = null;
    UpdateDocumentRequest updateDocumentRequest = null;
    String siteId = null;
    String shareKey = null;
    AddDocumentResponse response =
        api.updateDocument(documentId, updateDocumentRequest, siteId, shareKey);
    // TODO: test validations
  }

}
