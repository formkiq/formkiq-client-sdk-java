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
import com.formkiq.client.model.AddDocumentFulltextRequest;
import com.formkiq.client.model.AddDocumentFulltextResponse;
import com.formkiq.client.model.DeleteFulltextResponse;
import com.formkiq.client.model.DocumentFulltextRequest;
import com.formkiq.client.model.DocumentFulltextResponse;
import com.formkiq.client.model.GetDocumentFulltextResponse;
import com.formkiq.client.model.QueryFulltextResponse;
import com.formkiq.client.model.SetDocumentFulltextRequest;
import com.formkiq.client.model.SetDocumentFulltextResponse;
import com.formkiq.client.model.UpdateDocumentFulltextRequest;
import com.formkiq.client.model.UpdateDocumentFulltextResponse;
import com.formkiq.client.model.ValidationErrorsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdvancedDocumentSearchApi
 */
@Disabled
public class AdvancedDocumentSearchApiTest {

  private final AdvancedDocumentSearchApi api = new AdvancedDocumentSearchApi();

  /**
   * Add document&#39;s full-text
   *
   * Adde a document to OpenSearch; ONLY available with FormKiQ Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addDocumentFulltextTest() throws ApiException {
    String documentId = null;
    String siteId = null;
    AddDocumentFulltextRequest addDocumentFulltextRequest = null;
    AddDocumentFulltextResponse response =
        api.addDocumentFulltext(documentId, siteId, addDocumentFulltextRequest);
    // TODO: test validations
  }

  /**
   * Delete document full-text
   *
   * Remove full text search for a document from OpenSearch; ONLY available with FormKiQ Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteDocumentFulltextTest() throws ApiException {
    String documentId = null;
    String siteId = null;
    DeleteFulltextResponse response = api.deleteDocumentFulltext(documentId, siteId);
    // TODO: test validations
  }

  /**
   * Delete document full-text tag
   *
   * Remove document tags from OpenSearch; ONLY available with FormKiQ Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteDocumentFulltextTagTest() throws ApiException {
    String documentId = null;
    String tagKey = null;
    String siteId = null;
    String shareKey = null;
    api.deleteDocumentFulltextTag(documentId, tagKey, siteId, shareKey);
    // TODO: test validations
  }

  /**
   * Delete document full-text tag/value
   *
   * Remove document tag/value from OpenSearch; ONLY available with FormKiQ Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteDocumentFulltextTagAndValueTest() throws ApiException {
    String documentId = null;
    String tagKey = null;
    String tagValue = null;
    String siteId = null;
    String shareKey = null;
    api.deleteDocumentFulltextTagAndValue(documentId, tagKey, tagValue, siteId, shareKey);
    // TODO: test validations
  }

  /**
   * Get document&#39;s full-text
   *
   * Retrieve an OpenSearch document&#39;s details, i.e., metadata
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getDocumentFulltextTest() throws ApiException {
    String documentId = null;
    String siteId = null;
    String shareKey = null;
    GetDocumentFulltextResponse response = api.getDocumentFulltext(documentId, siteId, shareKey);
    // TODO: test validations
  }

  /**
   * Direct opensearch search API
   *
   * Endpoint for allowing custom, complex queries using the OpenSearch search API
   * (https://opensearch.org/docs/latest/opensearch/rest-api/search/); ONLY available with FormKiQ
   * Enterprise Example Request Body: { \&quot;query\&quot;: { \&quot;match_all\&quot;: {} }}
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void queryFulltextTest() throws ApiException {
    Object body = null;
    String siteId = null;
    QueryFulltextResponse response = api.queryFulltext(body, siteId);
    // TODO: test validations
  }

  /**
   * Document full-text search
   *
   * Document full-text search (and more robust multi-tag search queries, powered by OpenSearch);
   * ONLY available with FormKiQ Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void searchFulltextTest() throws ApiException {
    DocumentFulltextRequest documentFulltextRequest = null;
    String siteId = null;
    String limit = null;
    DocumentFulltextResponse response = api.searchFulltext(documentFulltextRequest, siteId, limit);
    // TODO: test validations
  }

  /**
   * Set document&#39;s full-text
   *
   * Set all text/tags found within a document to OpenSearch; ONLY available with FormKiQ Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void setDocumentFulltextTest() throws ApiException {
    String documentId = null;
    String siteId = null;
    SetDocumentFulltextRequest setDocumentFulltextRequest = null;
    SetDocumentFulltextResponse response =
        api.setDocumentFulltext(documentId, siteId, setDocumentFulltextRequest);
    // TODO: test validations
  }

  /**
   * Update document&#39;s full-text
   *
   * Update a document in OpenSearch; ONLY available with FormKiQ Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void updateDocumentFulltextTest() throws ApiException {
    String documentId = null;
    String siteId = null;
    UpdateDocumentFulltextRequest updateDocumentFulltextRequest = null;
    UpdateDocumentFulltextResponse response =
        api.updateDocumentFulltext(documentId, siteId, updateDocumentFulltextRequest);
    // TODO: test validations
  }

}
