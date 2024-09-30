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
import com.formkiq.client.model.AddDocumentAttributesRequest;
import com.formkiq.client.model.AddResponse;
import com.formkiq.client.model.DeleteResponse;
import com.formkiq.client.model.GetDocumentAttributeResponse;
import com.formkiq.client.model.GetDocumentAttributeVersionsResponse;
import com.formkiq.client.model.GetDocumentAttributesResponse;
import com.formkiq.client.model.SetDocumentAttributeRequest;
import com.formkiq.client.model.SetDocumentAttributesRequest;
import com.formkiq.client.model.SetResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DocumentAttributesApi
 */
@Disabled
public class DocumentAttributesApiTest {

  private final DocumentAttributesApi api = new DocumentAttributesApi();

  /**
   * Add attribute to document
   *
   * Add multiple attributes to a document; this endpoint also accepts a different body parameter
   * for adding a single attribute
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addDocumentAttributesTest() throws ApiException {
    String documentId = null;
    AddDocumentAttributesRequest addDocumentAttributesRequest = null;
    String siteId = null;
    String ws = null;
    AddResponse response =
        api.addDocumentAttributes(documentId, addDocumentAttributesRequest, siteId, ws);
    // TODO: test validations
  }

  /**
   * Delete document attribute
   *
   * Delete a document attribute by using its key
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteDocumentAttributeTest() throws ApiException {
    String documentId = null;
    String attributeKey = null;
    String siteId = null;
    DeleteResponse response = api.deleteDocumentAttribute(documentId, attributeKey, siteId);
    // TODO: test validations
  }

  /**
   * Delete document&#39;s attribute value
   *
   * Delete a specific document attribute key/value combination; the request will be ignored if
   * there is no valid key/value combination found
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteDocumentAttributeAndValueTest() throws ApiException {
    String documentId = null;
    String attributeKey = null;
    String attributeValue = null;
    String siteId = null;
    DeleteResponse response =
        api.deleteDocumentAttributeAndValue(documentId, attributeKey, attributeValue, siteId);
    // TODO: test validations
  }

  /**
   * Get document attribute by key
   *
   * Get a document attribute by using its key
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getDocumentAttributeTest() throws ApiException {
    String documentId = null;
    String attributeKey = null;
    String siteId = null;
    GetDocumentAttributeResponse response =
        api.getDocumentAttribute(documentId, attributeKey, siteId);
    // TODO: test validations
  }

  /**
   * Get document attribute&#39;s versions
   *
   * Get a listing of a document&#39;s attribute versions; ONLY available with FormKiQ Pro and
   * Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getDocumentAttributeVersionsTest() throws ApiException {
    String documentId = null;
    String attributeKey = null;
    String siteId = null;
    String limit = null;
    String next = null;
    GetDocumentAttributeVersionsResponse response =
        api.getDocumentAttributeVersions(documentId, attributeKey, siteId, limit, next);
    // TODO: test validations
  }

  /**
   * Get document&#39;s attributes
   *
   * Get a listing of a document&#39;s attributes
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getDocumentAttributesTest() throws ApiException {
    String documentId = null;
    String siteId = null;
    String limit = null;
    String next = null;
    GetDocumentAttributesResponse response =
        api.getDocumentAttributes(documentId, siteId, limit, next);
    // TODO: test validations
  }

  /**
   * Set document&#39;s attributes value
   *
   * Set attributes value to a document
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void setDocumentAttributeValueTest() throws ApiException {
    String documentId = null;
    String attributeKey = null;
    SetDocumentAttributeRequest setDocumentAttributeRequest = null;
    String siteId = null;
    SetResponse response = api.setDocumentAttributeValue(documentId, attributeKey,
        setDocumentAttributeRequest, siteId);
    // TODO: test validations
  }

  /**
   * Set document&#39;s attributes
   *
   * Set multiple attributes to a document; this endpoint also accepts a different body parameter
   * for setting a single attribute Note: - attributes in the request will overwrite existing
   * attributes.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void setDocumentAttributesTest() throws ApiException {
    String documentId = null;
    SetDocumentAttributesRequest setDocumentAttributesRequest = null;
    String siteId = null;
    SetResponse response =
        api.setDocumentAttributes(documentId, setDocumentAttributesRequest, siteId);
    // TODO: test validations
  }

}
