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

import java.util.Map;

/**
 * Representing a Server configuration.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-10-10T21:27:48.499768-05:00[America/Winnipeg]",
    comments = "Generator version: 7.9.0")
public class ServerConfiguration {
  public String URL;
  public String description;
  public Map<String, ServerVariable> variables;

  /**
   * @param URL A URL to the target host.
   * @param description A description of the host designated by the URL.
   * @param variables A map between a variable name and its value. The value is used for
   *        substitution in the server's URL template.
   */
  public ServerConfiguration(String URL, String description,
      Map<String, ServerVariable> variables) {
    this.URL = URL;
    this.description = description;
    this.variables = variables;
  }

  /**
   * Format URL template using given variables.
   *
   * @param variables A map between a variable name and its value.
   * @return Formatted URL.
   */
  public String URL(Map<String, String> variables) {
    String url = this.URL;

    // go through variables and replace placeholders
    for (Map.Entry<String, ServerVariable> variable : this.variables.entrySet()) {
      String name = variable.getKey();
      ServerVariable serverVariable = variable.getValue();
      String value = serverVariable.defaultValue;

      if (variables != null && variables.containsKey(name)) {
        value = variables.get(name);
        if (serverVariable.enumValues.size() > 0 && !serverVariable.enumValues.contains(value)) {
          throw new IllegalArgumentException(
              "The variable " + name + " in the server URL has invalid value " + value + ".");
        }
      }
      url = url.replace("{" + name + "}", value);
    }
    return url;
  }

  /**
   * Format URL template using default server variables.
   *
   * @return Formatted URL.
   */
  public String URL() {
    return URL(null);
  }
}
