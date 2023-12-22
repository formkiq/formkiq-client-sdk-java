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


package com.formkiq.client.invoker;

import java.util.Map;
import java.util.List;


/**
 * <p>
 * ApiException class.
 * </p>
 */
@SuppressWarnings("serial")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-12-22T14:23:50.813490-06:00[America/Winnipeg]")
public class ApiException extends Exception {
  private int code = 0;
  private Map<String, List<String>> responseHeaders = null;
  private String responseBody = null;

  /**
   * <p>
   * Constructor for ApiException.
   * </p>
   */
  public ApiException() {}

  /**
   * <p>
   * Constructor for ApiException.
   * </p>
   *
   * @param throwable a {@link java.lang.Throwable} object
   */
  public ApiException(Throwable throwable) {
    super(throwable);
  }

  /**
   * <p>
   * Constructor for ApiException.
   * </p>
   *
   * @param message the error message
   */
  public ApiException(String message) {
    super(message);
  }

  /**
   * <p>
   * Constructor for ApiException.
   * </p>
   *
   * @param message the error message
   * @param throwable a {@link java.lang.Throwable} object
   * @param code HTTP status code
   * @param responseHeaders a {@link java.util.Map} of HTTP response headers
   * @param responseBody the response body
   */
  public ApiException(String message, Throwable throwable, int code,
      Map<String, List<String>> responseHeaders, String responseBody) {
    super(message, throwable);
    this.code = code;
    this.responseHeaders = responseHeaders;
    this.responseBody = responseBody;
  }

  /**
   * <p>
   * Constructor for ApiException.
   * </p>
   *
   * @param message the error message
   * @param code HTTP status code
   * @param responseHeaders a {@link java.util.Map} of HTTP response headers
   * @param responseBody the response body
   */
  public ApiException(String message, int code, Map<String, List<String>> responseHeaders,
      String responseBody) {
    this(message, (Throwable) null, code, responseHeaders, responseBody);
  }

  /**
   * <p>
   * Constructor for ApiException.
   * </p>
   *
   * @param message the error message
   * @param throwable a {@link java.lang.Throwable} object
   * @param code HTTP status code
   * @param responseHeaders a {@link java.util.Map} of HTTP response headers
   */
  public ApiException(String message, Throwable throwable, int code,
      Map<String, List<String>> responseHeaders) {
    this(message, throwable, code, responseHeaders, null);
  }

  /**
   * <p>
   * Constructor for ApiException.
   * </p>
   *
   * @param code HTTP status code
   * @param responseHeaders a {@link java.util.Map} of HTTP response headers
   * @param responseBody the response body
   */
  public ApiException(int code, Map<String, List<String>> responseHeaders, String responseBody) {
    this("Response Code: " + code + " Response Body: " + responseBody, (Throwable) null, code,
        responseHeaders, responseBody);
  }

  /**
   * <p>
   * Constructor for ApiException.
   * </p>
   *
   * @param code HTTP status code
   * @param message a {@link java.lang.String} object
   */
  public ApiException(int code, String message) {
    super(message);
    this.code = code;
  }

  /**
   * <p>
   * Constructor for ApiException.
   * </p>
   *
   * @param code HTTP status code
   * @param message the error message
   * @param responseHeaders a {@link java.util.Map} of HTTP response headers
   * @param responseBody the response body
   */
  public ApiException(int code, String message, Map<String, List<String>> responseHeaders,
      String responseBody) {
    this(code, message);
    this.responseHeaders = responseHeaders;
    this.responseBody = responseBody;
  }

  /**
   * Get the HTTP status code.
   *
   * @return HTTP status code
   */
  public int getCode() {
    return code;
  }

  /**
   * Get the HTTP response headers.
   *
   * @return A map of list of string
   */
  public Map<String, List<String>> getResponseHeaders() {
    return responseHeaders;
  }

  /**
   * Get the HTTP response body.
   *
   * @return Response body in the form of string
   */
  public String getResponseBody() {
    return responseBody;
  }

  /**
   * Get the exception message including HTTP response data.
   *
   * @return The exception message
   */
  public String getMessage() {
    return String.format(
        "Message: %s%nHTTP response code: %s%nHTTP response body: %s%nHTTP response headers: %s",
        super.getMessage(), this.getCode(), this.getResponseBody(), this.getResponseHeaders());
  }
}
