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
 * The version of the OpenAPI document: 1.15.1 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.api;

import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.model.DocumentSearchRequest;
import com.formkiq.client.model.DocumentSearchResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DocumentSearchApi
 */
@Disabled
public class DocumentSearchApiTest {

  private final DocumentSearchApi api = new DocumentSearchApi();

  /**
   * Document search
   *
   * Document search query request; Supports searching DynamoDB for document(s) by a single TAG key
   * and/or value. Value can be \&quot;exacted\&quot; or \&quot;begins_with\&quot; matched. Search
   * can be filtered to only check certain documentIds (up to 100 documentIds accepted). If using
   * Enteprise TagSchema Composite Keys feature then multiple tag(s) can be searched for. If
   * Typesense is enabled, full text search is supported through the \&quot;text\&quot; parameter.
   * Full text search will look for the text in the \&quot;content\&quot; and/or document
   * \&quot;metadata\&quot;. DocumentIds parameter allows you to filter your results to a specific
   * set of documents. See requestBody examples below for commmon examples.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void documentSearchTest() throws ApiException {
    DocumentSearchRequest documentSearchRequest = null;
    String siteId = null;
    String limit = null;
    String next = null;
    String previous = null;
    DocumentSearchResponse response =
        api.documentSearch(documentSearchRequest, siteId, limit, next, previous);
    // TODO: test validations
  }

}
