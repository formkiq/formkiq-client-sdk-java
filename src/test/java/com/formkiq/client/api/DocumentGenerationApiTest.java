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
 * The version of the OpenAPI document: 1.16.0 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.api;

import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.model.AddDocumentGenerateRequest;
import com.formkiq.client.model.AddDocumentGenerateResponse;
import com.formkiq.client.model.ValidationErrorsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DocumentGenerationApi
 */
@Disabled
public class DocumentGenerationApiTest {

  private final DocumentGenerationApi api = new DocumentGenerationApi();

  /**
   * Add Document Generate
   *
   * Generates a document based from a template file; ONLY available with FormKiQ Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addDocumentGenerateTest() throws ApiException {
    String documentId = null;
    AddDocumentGenerateRequest addDocumentGenerateRequest = null;
    String siteId = null;
    AddDocumentGenerateResponse response =
        api.addDocumentGenerate(documentId, addDocumentGenerateRequest, siteId);
    // TODO: test validations
  }

}
