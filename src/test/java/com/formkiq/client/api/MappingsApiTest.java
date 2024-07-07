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
 * The version of the OpenAPI document: 1.15.0 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.api;

import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.model.AddMappingRequest;
import com.formkiq.client.model.AddMappingResponse;
import com.formkiq.client.model.DeleteResponse;
import com.formkiq.client.model.GetMappingResponse;
import com.formkiq.client.model.GetMappingsResponse;
import com.formkiq.client.model.SetMappingRequest;
import com.formkiq.client.model.SetResponse;
import com.formkiq.client.model.ValidationErrorsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MappingsApi
 */
@Disabled
public class MappingsApiTest {

  private final MappingsApi api = new MappingsApi();

  /**
   * Add New Mapping
   *
   * Creates a new mapping; ONLY available with FormKiQ Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addMappingTest() throws ApiException {
    AddMappingRequest addMappingRequest = null;
    String siteId = null;
    AddMappingResponse response = api.addMapping(addMappingRequest, siteId);
    // TODO: test validations
  }

  /**
   * Delete Mapping
   *
   * Delete Mapping; ONLY available with FormKiQ Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteMappingTest() throws ApiException {
    String mappingId = null;
    String siteId = null;
    DeleteResponse response = api.deleteMapping(mappingId, siteId);
    // TODO: test validations
  }

  /**
   * Get Mapping
   *
   * Get a mapping; ONLY available with FormKiQ Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getMappingTest() throws ApiException {
    String mappingId = null;
    String siteId = null;
    GetMappingResponse response = api.getMapping(mappingId, siteId);
    // TODO: test validations
  }

  /**
   * Get Mappings
   *
   * Returns a list of mappings; ONLY available with FormKiQ Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getMappingsTest() throws ApiException {
    String siteId = null;
    String limit = null;
    String next = null;
    GetMappingsResponse response = api.getMappings(siteId, limit, next);
    // TODO: test validations
  }

  /**
   * Set Mapping
   *
   * Sets an mapping; ONLY available with FormKiQ Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void setMappingTest() throws ApiException {
    String mappingId = null;
    SetMappingRequest setMappingRequest = null;
    String siteId = null;
    SetResponse response = api.setMapping(mappingId, setMappingRequest, siteId);
    // TODO: test validations
  }

}
