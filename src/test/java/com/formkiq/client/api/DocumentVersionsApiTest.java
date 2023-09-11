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
 * The version of the OpenAPI document: 1.13.0 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.api;

import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.model.GetDocumentVersionsResponse;
import com.formkiq.client.model.SetDocumentVersionRequest;
import com.formkiq.client.model.SetDocumentVersionResponse;
import com.formkiq.client.model.ValidationErrorsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DocumentVersionsApi
 */
@Disabled
public class DocumentVersionsApiTest {

  private final DocumentVersionsApi api = new DocumentVersionsApi();

  /**
   * Delete document version
   *
   * Delete a specific previous document version; ONLY available with FormKiQ Pro and Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteDocumentVersionTest() throws ApiException {
    String documentId = null;
    String versionKey = null;
    String shareKey = null;
    api.deleteDocumentVersion(documentId, versionKey, shareKey);
    // TODO: test validations
  }

  /**
   * Get document&#39;s versions
   *
   * Get a listing of document content and metadata versions; ONLY available with FormKiQ Pro and
   * Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getDocumentVersionsTest() throws ApiException {
    String documentId = null;
    String siteId = null;
    String shareKey = null;
    String next = null;
    GetDocumentVersionsResponse response =
        api.getDocumentVersions(documentId, siteId, shareKey, next);
    // TODO: test validations
  }

  /**
   * Set version of document
   *
   * Set document to a previous document version; ONLY available with FormKiQ Pro and Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void setDocumentVersionTest() throws ApiException {
    String documentId = null;
    SetDocumentVersionRequest setDocumentVersionRequest = null;
    String siteId = null;
    SetDocumentVersionResponse response =
        api.setDocumentVersion(documentId, setDocumentVersionRequest, siteId);
    // TODO: test validations
  }

}
