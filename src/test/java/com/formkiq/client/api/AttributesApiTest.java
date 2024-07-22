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
import com.formkiq.client.model.AddAttributeRequest;
import com.formkiq.client.model.AddAttributeResponse;
import com.formkiq.client.model.DeleteResponse;
import com.formkiq.client.model.GetAttributeResponse;
import com.formkiq.client.model.GetAttributesResponse;
import com.formkiq.client.model.ValidationErrorsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AttributesApi
 */
@Disabled
public class AttributesApiTest {

  private final AttributesApi api = new AttributesApi();

  /**
   * Add new attribute
   *
   * Creates a new attribute
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addAttributeTest() throws ApiException {
    AddAttributeRequest addAttributeRequest = null;
    String siteId = null;
    AddAttributeResponse response = api.addAttribute(addAttributeRequest, siteId);
    // TODO: test validations
  }

  /**
   * Delete attribute
   *
   * Delete a attribute
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteAttributeTest() throws ApiException {
    String key = null;
    String siteId = null;
    DeleteResponse response = api.deleteAttribute(key, siteId);
    // TODO: test validations
  }

  /**
   * Get Attribute
   *
   * Returns a attribute
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getAttributeTest() throws ApiException {
    String key = null;
    String siteId = null;
    GetAttributeResponse response = api.getAttribute(key, siteId);
    // TODO: test validations
  }

  /**
   * Get Attributes listing
   *
   * Returns a list of attributes
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getAttributesTest() throws ApiException {
    String siteId = null;
    String next = null;
    String limit = null;
    GetAttributesResponse response = api.getAttributes(siteId, next, limit);
    // TODO: test validations
  }

}
