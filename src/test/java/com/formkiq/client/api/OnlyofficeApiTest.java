/*
 * FormKiQ API Formkiq API: Document Management Platform API using OAuth(JWT) Authentication You can
 * find out more about FormKiQ at [https://formkiq.com](http://formkiq.com). ## Introduction FormKiQ
 * is an API-first (head-less), battle-tested document management API. The FormKiQ API provides all
 * the API endpoints to build your Perfect Document Management Platform. FormKiQ API was built on
 * top of [OpenAPI specification](https://www.openapis.org), so it is easy to use the API spec file
 * with any application that supports the OpenAPI specification. Open API OAuth Specification -
 * https://raw.githubusercontent.com/formkiq/formkiq-core/master/docs/openapi/openapi-jwt.yaml Open
 * API IAM Specification -
 * https://raw.githubusercontent.com/formkiq/formkiq-core/master/docs/openapi/openapi-iam.yaml ##
 * Authentication FormKiQ offers three forms of authentication: - OAuth(JWT) - AWS IAM - API Key
 *
 * The version of the OpenAPI document: 1.14.1 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.api;

import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.model.OnlyOfficeDocumentNewRequest;
import com.formkiq.client.model.OnlyOfficeDocumentResponse;
import com.formkiq.client.model.OnlyOfficeDocumentSaveResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OnlyofficeApi
 */
@Disabled
public class OnlyofficeApiTest {

  private final OnlyofficeApi api = new OnlyofficeApi();

  /**
   * Edit onlyoffice document
   *
   * Provide ONLYOFFICE integration for editing documents; ONLY available with FormKiQ Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void onlyOfficeDocumentEditTest() throws ApiException {
    String documentId = null;
    Object body = null;
    String siteId = null;
    OnlyOfficeDocumentResponse response = api.onlyOfficeDocumentEdit(documentId, body, siteId);
    // TODO: test validations
  }

  /**
   * Create onlyoffice document
   *
   * Provide ONLYOFFICE integration for the creation of new documents; ONLY available with FormKiQ
   * Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void onlyOfficeDocumentNewTest() throws ApiException {
    OnlyOfficeDocumentNewRequest onlyOfficeDocumentNewRequest = null;
    String siteId = null;
    OnlyOfficeDocumentResponse response =
        api.onlyOfficeDocumentNew(onlyOfficeDocumentNewRequest, siteId);
    // TODO: test validations
  }

  /**
   * Save onlyoffice document
   *
   * Save an updated document for ONLYOFFICE integration. ONLY available with FormKiQ Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void onlyOfficeDocumentSaveTest() throws ApiException {
    String documentId = null;
    String siteId = null;
    OnlyOfficeDocumentSaveResponse response = api.onlyOfficeDocumentSave(documentId, siteId);
    // TODO: test validations
  }

}
