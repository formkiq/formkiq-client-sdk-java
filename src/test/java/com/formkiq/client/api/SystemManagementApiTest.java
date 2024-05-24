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
import com.formkiq.client.model.AddApiKeyRequest;
import com.formkiq.client.model.AddApiKeyResponse;
import com.formkiq.client.model.DeleteApiKeyResponse;
import com.formkiq.client.model.DeleteOpenSearchIndexResponse;
import com.formkiq.client.model.GetApiKeysResponse;
import com.formkiq.client.model.GetConfigurationResponse;
import com.formkiq.client.model.GetOpenSearchIndexResponse;
import com.formkiq.client.model.GetSitesResponse;
import com.formkiq.client.model.GetVersionResponse;
import com.formkiq.client.model.SetOpenSearchIndexRequest;
import com.formkiq.client.model.SetOpenSearchIndexResponse;
import com.formkiq.client.model.UpdateConfigurationRequest;
import com.formkiq.client.model.UpdateConfigurationResponse;
import com.formkiq.client.model.ValidationErrorsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SystemManagementApi
 */
@Disabled
public class SystemManagementApiTest {

  private final SystemManagementApi api = new SystemManagementApi();

  /**
   * Add API Key
   *
   * Adds a new API Key
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addApiKeyTest() throws ApiException {
    String siteId = null;
    AddApiKeyRequest addApiKeyRequest = null;
    AddApiKeyResponse response = api.addApiKey(siteId, addApiKeyRequest);
    // TODO: test validations
  }

  /**
   * Delete API Key
   *
   * Adds a new API Key
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteApiKeyTest() throws ApiException {
    String siteId = null;
    String apiKey = null;
    DeleteApiKeyResponse response = api.deleteApiKey(siteId, apiKey);
    // TODO: test validations
  }

  /**
   * Deletst site(s) OpenSearch index
   *
   * Deletes the OpenSearch index
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteOpensearchIndexTest() throws ApiException {
    String siteId = null;
    DeleteOpenSearchIndexResponse response = api.deleteOpensearchIndex(siteId);
    // TODO: test validations
  }

  /**
   * Get API Keys
   *
   * Returns the list of ApiKeys
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getApiKeysTest() throws ApiException {
    String siteId = null;
    GetApiKeysResponse response = api.getApiKeys(siteId);
    // TODO: test validations
  }

  /**
   * Get site configuration
   *
   * Returns the list of sites that the user has access to
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getConfigurationTest() throws ApiException {
    String siteId = null;
    GetConfigurationResponse response = api.getConfiguration(siteId);
    // TODO: test validations
  }

  /**
   * Get site(s) OpenSearch index settings
   *
   * Returns the OpenSearch index settings
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getOpensearchIndexTest() throws ApiException {
    String siteId = null;
    GetOpenSearchIndexResponse response = api.getOpensearchIndex(siteId);
    // TODO: test validations
  }

  /**
   * Get site(s) access
   *
   * Returns the list of sites that the user has access to
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getSitesTest() throws ApiException {
    GetSitesResponse response = api.getSites();
    // TODO: test validations
  }

  /**
   * Get FormKiQ version
   *
   * Return the version of FormKiQ
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getVersionTest() throws ApiException {
    GetVersionResponse response = api.getVersion();
    // TODO: test validations
  }

  /**
   * Set site(s) OpenSearch index settings
   *
   * Sets the OpenSearch index settings
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void setOpensearchIndexTest() throws ApiException {
    String siteId = null;
    SetOpenSearchIndexRequest setOpenSearchIndexRequest = null;
    SetOpenSearchIndexResponse response = api.setOpensearchIndex(siteId, setOpenSearchIndexRequest);
    // TODO: test validations
  }

  /**
   * Update site configuration
   *
   * Update the System Management configuration
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void updateConfigurationTest() throws ApiException {
    String siteId = null;
    UpdateConfigurationRequest updateConfigurationRequest = null;
    UpdateConfigurationResponse response =
        api.updateConfiguration(siteId, updateConfigurationRequest);
    // TODO: test validations
  }

}
