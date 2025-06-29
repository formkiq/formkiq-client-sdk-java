/*
 * FormKiQ API JWT Formkiq API: Document Management Platform API using OAuth(JWT) Authentication You
 * can find out more about FormKiQ at [https://formkiq.com](http://formkiq.com). ## Introduction
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
 * The version of the OpenAPI document: 1.17.1 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.api;

import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.model.AddApiKeyRequest;
import com.formkiq.client.model.AddApiKeyResponse;
import com.formkiq.client.model.AddLocaleRequest;
import com.formkiq.client.model.AddLocaleResourceItemRequest;
import com.formkiq.client.model.AddLocaleResourceItemResponse;
import com.formkiq.client.model.AddResponse;
import com.formkiq.client.model.AddSiteRequest;
import com.formkiq.client.model.DeleteApiKeyResponse;
import com.formkiq.client.model.DeleteResponse;
import com.formkiq.client.model.GetApiKeysResponse;
import com.formkiq.client.model.GetConfigurationResponse;
import com.formkiq.client.model.GetLocaleResourceItemResponse;
import com.formkiq.client.model.GetLocaleResourceItemsResponse;
import com.formkiq.client.model.GetLocalesResponse;
import com.formkiq.client.model.GetOpenSearchIndexResponse;
import com.formkiq.client.model.GetSiteGroupResponse;
import com.formkiq.client.model.GetSiteGroupsResponse;
import com.formkiq.client.model.GetSitesResponse;
import com.formkiq.client.model.GetVersionResponse;
import com.formkiq.client.model.SetGroupPermissionsRequest;
import com.formkiq.client.model.SetLocaleResourceItemRequest;
import com.formkiq.client.model.SetOpenSearchIndexRequest;
import com.formkiq.client.model.SetOpenSearchIndexResponse;
import com.formkiq.client.model.SetResponse;
import com.formkiq.client.model.SiteStatus;
import com.formkiq.client.model.UpdateConfigurationRequest;
import com.formkiq.client.model.UpdateConfigurationResponse;
import com.formkiq.client.model.UpdateResponse;
import com.formkiq.client.model.UpdateSiteRequest;
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
   * Add Locale
   *
   * Adds a new locale to the specified site
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addLocaleTest() throws ApiException {
    String siteId = null;
    AddLocaleRequest addLocaleRequest = null;
    AddResponse response = api.addLocale(siteId, addLocaleRequest);
    // TODO: test validations
  }

  /**
   * Add Locale Resource Item
   *
   * Adds a new localized resource item for a given locale
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addLocaleResourceItemTest() throws ApiException {
    String siteId = null;
    String locale = null;
    AddLocaleResourceItemRequest addLocaleResourceItemRequest = null;
    AddLocaleResourceItemResponse response =
        api.addLocaleResourceItem(siteId, locale, addLocaleResourceItemRequest);
    // TODO: test validations
  }

  /**
   * Add Site
   *
   * Add Site
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addSiteTest() throws ApiException {
    AddSiteRequest addSiteRequest = null;
    AddResponse response = api.addSite(addSiteRequest);
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
   * Delete Locale
   *
   * Delete Locale
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteLocaleTest() throws ApiException {
    String siteId = null;
    String locale = null;
    DeleteResponse response = api.deleteLocale(siteId, locale);
    // TODO: test validations
  }

  /**
   * Delete Local Resource Item
   *
   * Delete Local Resource Item
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteLocaleResourceItemTest() throws ApiException {
    String siteId = null;
    String locale = null;
    String itemKey = null;
    DeleteResponse response = api.deleteLocaleResourceItem(siteId, locale, itemKey);
    // TODO: test validations
  }

  /**
   * Deletes site(s) OpenSearch index
   *
   * Deletes the OpenSearch index
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteOpensearchIndexTest() throws ApiException {
    String siteId = null;
    DeleteResponse response = api.deleteOpensearchIndex(siteId);
    // TODO: test validations
  }

  /**
   * Deletes Site Group and permissions
   *
   * Deletes Site Group and permissions
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteSiteGroupTest() throws ApiException {
    String siteId = null;
    String groupName = null;
    DeleteResponse response = api.deleteSiteGroup(siteId, groupName);
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
    String next = null;
    String limit = null;
    GetApiKeysResponse response = api.getApiKeys(siteId, next, limit);
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
   * Get Resource Item by Locale
   *
   * Returns the resource item
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getLocaleResourceItemTest() throws ApiException {
    String siteId = null;
    String locale = null;
    String itemKey = null;
    GetLocaleResourceItemResponse response = api.getLocaleResourceItem(siteId, locale, itemKey);
    // TODO: test validations
  }

  /**
   * Get Resource Items by Locale
   *
   * Returns the list resource items
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getLocaleResourceItemsTest() throws ApiException {
    String siteId = null;
    String locale = null;
    String next = null;
    String limit = null;
    GetLocaleResourceItemsResponse response =
        api.getLocaleResourceItems(siteId, locale, next, limit);
    // TODO: test validations
  }

  /**
   * Get Locales
   *
   * Returns a list of locale(s) in a specified site
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getLocalesTest() throws ApiException {
    String siteId = null;
    String next = null;
    String limit = null;
    GetLocalesResponse response = api.getLocales(siteId, next, limit);
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
   * Get group and permissions belonging to site
   *
   * Returns details of a group and permissions belonging to site
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getSiteGroupTest() throws ApiException {
    String siteId = null;
    String groupName = null;
    GetSiteGroupResponse response = api.getSiteGroup(siteId, groupName);
    // TODO: test validations
  }

  /**
   * Get group(s) and permissions belonging to site
   *
   * Returns list of groups and permissions belonging to site
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getSiteGroupsTest() throws ApiException {
    String siteId = null;
    GetSiteGroupsResponse response = api.getSiteGroups(siteId);
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
    SiteStatus status = null;
    GetSitesResponse response = api.getSites(status);
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
   * Set Locale Resource Item
   *
   * Set a new Locale Resource Item
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void setLocaleResourceItemTest() throws ApiException {
    String siteId = null;
    String locale = null;
    String itemKey = null;
    SetLocaleResourceItemRequest setLocaleResourceItemRequest = null;
    SetResponse response =
        api.setLocaleResourceItem(siteId, locale, itemKey, setLocaleResourceItemRequest);
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
   * Set Site&#39;s Group Permissions
   *
   * Set Site&#39;s Group Permissions
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void setSiteGroupPermissionsTest() throws ApiException {
    String siteId = null;
    String groupName = null;
    SetGroupPermissionsRequest setGroupPermissionsRequest = null;
    SetResponse response =
        api.setSiteGroupPermissions(siteId, groupName, setGroupPermissionsRequest);
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

  /**
   * Update Site
   *
   * Update Site
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void updateSiteTest() throws ApiException {
    String siteId = null;
    UpdateSiteRequest updateSiteRequest = null;
    UpdateResponse response = api.updateSite(siteId, updateSiteRequest);
    // TODO: test validations
  }

}
