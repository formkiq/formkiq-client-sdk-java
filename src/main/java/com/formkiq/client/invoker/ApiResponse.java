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
 * The version of the OpenAPI document: 1.12.1 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.invoker;

import java.util.List;
import java.util.Map;

/**
 * API response returned by API call.
 */
public class ApiResponse<T> {
  final private int statusCode;
  final private Map<String, List<String>> headers;
  final private T data;

  /**
   * <p>
   * Constructor for ApiResponse.
   * </p>
   *
   * @param statusCode The status code of HTTP response
   * @param headers The headers of HTTP response
   */
  public ApiResponse(int statusCode, Map<String, List<String>> headers) {
    this(statusCode, headers, null);
  }

  /**
   * <p>
   * Constructor for ApiResponse.
   * </p>
   *
   * @param statusCode The status code of HTTP response
   * @param headers The headers of HTTP response
   * @param data The object deserialized from response bod
   */
  public ApiResponse(int statusCode, Map<String, List<String>> headers, T data) {
    this.statusCode = statusCode;
    this.headers = headers;
    this.data = data;
  }

  /**
   * <p>
   * Get the <code>status code</code>.
   * </p>
   *
   * @return the status code
   */
  public int getStatusCode() {
    return statusCode;
  }

  /**
   * <p>
   * Get the <code>headers</code>.
   * </p>
   *
   * @return a {@link java.util.Map} of headers
   */
  public Map<String, List<String>> getHeaders() {
    return headers;
  }

  /**
   * <p>
   * Get the <code>data</code>.
   * </p>
   *
   * @return the data
   */
  public T getData() {
    return data;
  }
}
