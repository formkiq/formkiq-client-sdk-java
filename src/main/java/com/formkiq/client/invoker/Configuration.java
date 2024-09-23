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


package com.formkiq.client.invoker;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-09-20T20:52:06.379355-05:00[America/Winnipeg]",
    comments = "Generator version: 7.8.0")
public class Configuration {
  public static final String VERSION = "1.16.0";

  private static ApiClient defaultApiClient = new ApiClient();

  /**
   * Get the default API client, which would be used when creating API instances without providing
   * an API client.
   *
   * @return Default API client
   */
  public static ApiClient getDefaultApiClient() {
    return defaultApiClient;
  }

  /**
   * Set the default API client, which would be used when creating API instances without providing
   * an API client.
   *
   * @param apiClient API client
   */
  public static void setDefaultApiClient(ApiClient apiClient) {
    defaultApiClient = apiClient;
  }
}
