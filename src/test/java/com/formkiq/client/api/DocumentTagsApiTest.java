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
import com.formkiq.client.model.AddDocumentTagsRequest;
import com.formkiq.client.model.GetDocumentTagResponse;
import com.formkiq.client.model.GetDocumentTagsResponse;
import com.formkiq.client.model.SetDocumentTagKeyRequest;
import com.formkiq.client.model.UpdateMatchingDocumentTagsRequest;
import com.formkiq.client.model.UpdateMatchingDocumentTagsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DocumentTagsApi
 */
@Disabled
public class DocumentTagsApiTest {

  private final DocumentTagsApi api = new DocumentTagsApi();

  /**
   * Add tag to document
   *
   * Add multiple tags to a document; this endpoint also accepts a different body parameter for
   * adding a single tag
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addDocumentTagsTest() throws ApiException {
    String documentId = null;
    AddDocumentTagsRequest addDocumentTagsRequest = null;
    String siteId = null;
    String ws = null;
    api.addDocumentTags(documentId, addDocumentTagsRequest, siteId, ws);
    // TODO: test validations
  }

  /**
   * Delete document tag
   *
   * Delete a document tag by using its key
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteDocumentTagTest() throws ApiException {
    String documentId = null;
    String tagKey = null;
    String siteId = null;
    api.deleteDocumentTag(documentId, tagKey, siteId);
    // TODO: test validations
  }

  /**
   * Delete document&#39;s tag value
   *
   * Delete a specific document tag&#39;s key/value combination; the request will be ignored if
   * there is no valid key/value combination found
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteDocumentTagAndValueTest() throws ApiException {
    String documentId = null;
    String tagKey = null;
    String tagValue = null;
    String siteId = null;
    String shareKey = null;
    api.deleteDocumentTagAndValue(documentId, tagKey, tagValue, siteId, shareKey);
    // TODO: test validations
  }

  /**
   * Get document tag by key
   *
   * Get a document tag by using its key
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getDocumentTagTest() throws ApiException {
    String documentId = null;
    String tagKey = null;
    String siteId = null;
    String shareKey = null;
    GetDocumentTagResponse response = api.getDocumentTag(documentId, tagKey, siteId, shareKey);
    // TODO: test validations
  }

  /**
   * Get document&#39;s tags
   *
   * Get a listing of a document&#39;s tags
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getDocumentTagsTest() throws ApiException {
    String documentId = null;
    String siteId = null;
    String limit = null;
    String shareKey = null;
    String next = null;
    String previous = null;
    GetDocumentTagsResponse response =
        api.getDocumentTags(documentId, siteId, limit, shareKey, next, previous);
    // TODO: test validations
  }

  /**
   * Update document tag value(s)
   *
   * Update any and all values of a document tag, by using its key; you can supply one tag value or
   * a list of tag values in the request body
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void setDocumentTagTest() throws ApiException {
    String documentId = null;
    String tagKey = null;
    SetDocumentTagKeyRequest setDocumentTagKeyRequest = null;
    String siteId = null;
    api.setDocumentTag(documentId, tagKey, setDocumentTagKeyRequest, siteId);
    // TODO: test validations
  }

  /**
   * Set document&#39;s tags
   *
   * Set multiple tags to a document; this endpoint also accepts a different body parameter for
   * setting a single tag
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void setDocumentTagsTest() throws ApiException {
    String documentId = null;
    AddDocumentTagsRequest addDocumentTagsRequest = null;
    String siteId = null;
    api.setDocumentTags(documentId, addDocumentTagsRequest, siteId);
    // TODO: test validations
  }

  /**
   * Update document tags
   *
   * Updates multiple tags to a document; this endpoint also accepts a different body parameter for
   * updating a single tag
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void updateDocumentTagsTest() throws ApiException {
    String documentId = null;
    AddDocumentTagsRequest addDocumentTagsRequest = null;
    String siteId = null;
    api.updateDocumentTags(documentId, addDocumentTagsRequest, siteId);
    // TODO: test validations
  }

  /**
   * Mass Update document tag(s)
   *
   * This API request allows the adding/updating of multiple document tag(s) based on document(s)
   * that have the matching tag.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void updateMatchingDocumentTagsTest() throws ApiException {
    UpdateMatchingDocumentTagsRequest updateMatchingDocumentTagsRequest = null;
    String siteId = null;
    UpdateMatchingDocumentTagsResponse response =
        api.updateMatchingDocumentTags(updateMatchingDocumentTagsRequest, siteId);
    // TODO: test validations
  }

}
