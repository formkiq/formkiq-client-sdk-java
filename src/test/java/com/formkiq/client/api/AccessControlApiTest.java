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
import com.formkiq.client.model.AddDocumentAccessAttributesRequest;
import com.formkiq.client.model.AddDocumentAccessAttributesResponse;
import com.formkiq.client.model.DeleteDocumentAccessAttributesResponse;
import com.formkiq.client.model.DeleteOpaConfigurationResponse;
import com.formkiq.client.model.GetDocumentAccessAttributesResponse;
import com.formkiq.client.model.GetOpaConfigurationResponse;
import com.formkiq.client.model.SetDocumentAccessAttributesRequest;
import com.formkiq.client.model.SetDocumentAccessAttributesResponse;
import com.formkiq.client.model.SetOpaConfigurationRequest;
import com.formkiq.client.model.SetOpaConfigurationResponse;
import com.formkiq.client.model.ValidationErrorsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccessControlApi
 */
@Disabled
public class AccessControlApiTest {

  private final AccessControlApi api = new AccessControlApi();

  /**
   * Add document access attributes
   *
   * Add a document&#39;s access attributes (only \&quot;admin\&quot; role can call API)
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addDocumentAccessAttributesTest() throws ApiException {
    String documentId = null;
    AddDocumentAccessAttributesRequest addDocumentAccessAttributesRequest = null;
    String siteId = null;
    AddDocumentAccessAttributesResponse response =
        api.addDocumentAccessAttributes(documentId, addDocumentAccessAttributesRequest, siteId);
    // TODO: test validations
  }

  /**
   * Delete document&#39;s access attributes
   *
   * Delete a document&#39;s access attributes
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteDocumentAccessAttributesTest() throws ApiException {
    String documentId = null;
    String siteId = null;
    DeleteDocumentAccessAttributesResponse response =
        api.deleteDocumentAccessAttributes(documentId, siteId);
    // TODO: test validations
  }

  /**
   * Delete OPA Configuration
   *
   * Delete OPA Configuration
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteOpaConfigurationTest() throws ApiException {
    String siteId = null;
    DeleteOpaConfigurationResponse response = api.deleteOpaConfiguration(siteId);
    // TODO: test validations
  }

  /**
   * Get document access attributes
   *
   * Retrieves a document&#39;s access attributes (only \&quot;admin\&quot; role can call API)
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getDocumentAccessAttributesTest() throws ApiException {
    String documentId = null;
    String siteId = null;
    GetDocumentAccessAttributesResponse response =
        api.getDocumentAccessAttributes(documentId, siteId);
    // TODO: test validations
  }

  /**
   * Get OPA Configuration
   *
   * Returns OPA Configuration, can only be requested with ADMIN privileges
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getOpaConfigurationTest() throws ApiException {
    String siteId = null;
    GetOpaConfigurationResponse response = api.getOpaConfiguration(siteId);
    // TODO: test validations
  }

  /**
   * Set document access attributes
   *
   * Set a document&#39;s access attributes (only \&quot;admin\&quot; role can call API)
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void setDocumentAccessAttributesTest() throws ApiException {
    String documentId = null;
    SetDocumentAccessAttributesRequest setDocumentAccessAttributesRequest = null;
    String siteId = null;
    SetDocumentAccessAttributesResponse response =
        api.setDocumentAccessAttributes(documentId, setDocumentAccessAttributesRequest, siteId);
    // TODO: test validations
  }

  /**
   * Set OPA Configuration
   *
   * Set OPA Configuration, can only be requested with ADMIN privileges
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void setOpaConfigurationTest() throws ApiException {
    SetOpaConfigurationRequest setOpaConfigurationRequest = null;
    SetOpaConfigurationResponse response = api.setOpaConfiguration(setOpaConfigurationRequest);
    // TODO: test validations
  }

}
