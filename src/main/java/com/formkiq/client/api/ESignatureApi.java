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
 * The version of the OpenAPI document: 1.13.0 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.api;

import com.formkiq.client.invoker.ApiCallback;
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.ApiResponse;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.Pair;
import com.formkiq.client.invoker.ProgressRequestBody;
import com.formkiq.client.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.formkiq.client.model.EsignatureDocusignConfigResponse;
import com.formkiq.client.model.EsignatureDocusignRequest;
import com.formkiq.client.model.EsignatureDocusignResponse;
import com.formkiq.client.model.EsignatureSetDocusignConfigRequest;
import com.formkiq.client.model.EsignatureSetDocusignConfigResponse;
import com.formkiq.client.model.ValidationErrorsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ESignatureApi {
  private ApiClient localVarApiClient;
  private int localHostIndex;
  private String localCustomBaseUrl;

  public ESignatureApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ESignatureApi(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return localVarApiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
  }

  public int getHostIndex() {
    return localHostIndex;
  }

  public void setHostIndex(int hostIndex) {
    this.localHostIndex = hostIndex;
  }

  public String getCustomBaseUrl() {
    return localCustomBaseUrl;
  }

  public void setCustomBaseUrl(String customBaseUrl) {
    this.localCustomBaseUrl = customBaseUrl;
  }

  /**
   * Build call for addEsignatureDocusignEvents
   * 
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *                        <table summary="Response Details" border="1">
   *                        <tr>
   *                        <td>Status Code</td>
   *                        <td>Description</td>
   *                        <td>Response Headers</td>
   *                        </tr>
   *                        <tr>
   *                        <td>200</td>
   *                        <td>200 OK</td>
   *                        <td>* Access-Control-Allow-Origin - <br>
   *                        * Access-Control-Allow-Methods - <br>
   *                        * Access-Control-Allow-Headers - <br>
   *                        </td>
   *                        </tr>
   *                        </table>
   */
  public okhttp3.Call addEsignatureDocusignEventsCall(final ApiCallback _callback)
      throws ApiException {
    String basePath = null;
    // Operation Servers
    String[] localBasePaths = new String[] {};

    // Determine Base Path to Use
    if (localCustomBaseUrl != null) {
      basePath = localCustomBaseUrl;
    } else if (localBasePaths.length > 0) {
      basePath = localBasePaths[localHostIndex];
    } else {
      basePath = null;
    }

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/esignature/docusign/events";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};
    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    if (localVarContentType != null) {
      localVarHeaderParams.put("Content-Type", localVarContentType);
    }

    String[] localVarAuthNames = new String[] {"AWS4Auth"};
    return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams,
        localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams,
        localVarFormParams, localVarAuthNames, _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call addEsignatureDocusignEventsValidateBeforeCall(final ApiCallback _callback)
      throws ApiException {
    return addEsignatureDocusignEventsCall(_callback);

  }

  /**
   * Add E-signature event DocuSign callback URL handler; ONLY available with FormKiQ Enterprise
   * 
   * @return EsignatureDocusignResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *         response body
   * @http.response.details
   *                        <table summary="Response Details" border="1">
   *                        <tr>
   *                        <td>Status Code</td>
   *                        <td>Description</td>
   *                        <td>Response Headers</td>
   *                        </tr>
   *                        <tr>
   *                        <td>200</td>
   *                        <td>200 OK</td>
   *                        <td>* Access-Control-Allow-Origin - <br>
   *                        * Access-Control-Allow-Methods - <br>
   *                        * Access-Control-Allow-Headers - <br>
   *                        </td>
   *                        </tr>
   *                        </table>
   */
  public EsignatureDocusignResponse addEsignatureDocusignEvents() throws ApiException {
    ApiResponse<EsignatureDocusignResponse> localVarResp =
        addEsignatureDocusignEventsWithHttpInfo();
    return localVarResp.getData();
  }

  /**
   * Add E-signature event DocuSign callback URL handler; ONLY available with FormKiQ Enterprise
   * 
   * @return ApiResponse&lt;EsignatureDocusignResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *         response body
   * @http.response.details
   *                        <table summary="Response Details" border="1">
   *                        <tr>
   *                        <td>Status Code</td>
   *                        <td>Description</td>
   *                        <td>Response Headers</td>
   *                        </tr>
   *                        <tr>
   *                        <td>200</td>
   *                        <td>200 OK</td>
   *                        <td>* Access-Control-Allow-Origin - <br>
   *                        * Access-Control-Allow-Methods - <br>
   *                        * Access-Control-Allow-Headers - <br>
   *                        </td>
   *                        </tr>
   *                        </table>
   */
  public ApiResponse<EsignatureDocusignResponse> addEsignatureDocusignEventsWithHttpInfo()
      throws ApiException {
    okhttp3.Call localVarCall = addEsignatureDocusignEventsValidateBeforeCall(null);
    Type localVarReturnType = new TypeToken<EsignatureDocusignResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Add E-signature event (asynchronously) DocuSign callback URL handler; ONLY available with
   * FormKiQ Enterprise
   * 
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *                        <table summary="Response Details" border="1">
   *                        <tr>
   *                        <td>Status Code</td>
   *                        <td>Description</td>
   *                        <td>Response Headers</td>
   *                        </tr>
   *                        <tr>
   *                        <td>200</td>
   *                        <td>200 OK</td>
   *                        <td>* Access-Control-Allow-Origin - <br>
   *                        * Access-Control-Allow-Methods - <br>
   *                        * Access-Control-Allow-Headers - <br>
   *                        </td>
   *                        </tr>
   *                        </table>
   */
  public okhttp3.Call addEsignatureDocusignEventsAsync(
      final ApiCallback<EsignatureDocusignResponse> _callback) throws ApiException {

    okhttp3.Call localVarCall = addEsignatureDocusignEventsValidateBeforeCall(_callback);
    Type localVarReturnType = new TypeToken<EsignatureDocusignResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }

  /**
   * Build call for esignatureDocusign
   * 
   * @param documentId Document Identifier (required)
   * @param esignatureDocusignRequest (required)
   * @param siteId Site Identifier (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *                        <table summary="Response Details" border="1">
   *                        <tr>
   *                        <td>Status Code</td>
   *                        <td>Description</td>
   *                        <td>Response Headers</td>
   *                        </tr>
   *                        <tr>
   *                        <td>200</td>
   *                        <td>200 OK</td>
   *                        <td>* Access-Control-Allow-Origin - <br>
   *                        * Access-Control-Allow-Methods - <br>
   *                        * Access-Control-Allow-Headers - <br>
   *                        </td>
   *                        </tr>
   *                        <tr>
   *                        <td>400</td>
   *                        <td>400 OK</td>
   *                        <td>-</td>
   *                        </tr>
   *                        </table>
   */
  public okhttp3.Call esignatureDocusignCall(String documentId,
      EsignatureDocusignRequest esignatureDocusignRequest, String siteId,
      final ApiCallback _callback) throws ApiException {
    String basePath = null;
    // Operation Servers
    String[] localBasePaths = new String[] {};

    // Determine Base Path to Use
    if (localCustomBaseUrl != null) {
      basePath = localCustomBaseUrl;
    } else if (localBasePaths.length > 0) {
      basePath = localBasePaths[localHostIndex];
    } else {
      basePath = null;
    }

    Object localVarPostBody = esignatureDocusignRequest;

    // create path and map variables
    String localVarPath = "/esignature/docusign/{documentId}".replace("{" + "documentId" + "}",
        localVarApiClient.escapeString(documentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (siteId != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("siteId", siteId));
    }

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    if (localVarContentType != null) {
      localVarHeaderParams.put("Content-Type", localVarContentType);
    }

    String[] localVarAuthNames = new String[] {"AWS4Auth"};
    return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams,
        localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams,
        localVarFormParams, localVarAuthNames, _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call esignatureDocusignValidateBeforeCall(String documentId,
      EsignatureDocusignRequest esignatureDocusignRequest, String siteId,
      final ApiCallback _callback) throws ApiException {
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(
          "Missing the required parameter 'documentId' when calling esignatureDocusign(Async)");
    }

    // verify the required parameter 'esignatureDocusignRequest' is set
    if (esignatureDocusignRequest == null) {
      throw new ApiException(
          "Missing the required parameter 'esignatureDocusignRequest' when calling esignatureDocusign(Async)");
    }

    return esignatureDocusignCall(documentId, esignatureDocusignRequest, siteId, _callback);

  }

  /**
   * Create E-signature request Create a DocuSign E-Signature request; ONLY available with FormKiQ
   * Enterprise
   * 
   * @param documentId Document Identifier (required)
   * @param esignatureDocusignRequest (required)
   * @param siteId Site Identifier (optional)
   * @return EsignatureDocusignResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *         response body
   * @http.response.details
   *                        <table summary="Response Details" border="1">
   *                        <tr>
   *                        <td>Status Code</td>
   *                        <td>Description</td>
   *                        <td>Response Headers</td>
   *                        </tr>
   *                        <tr>
   *                        <td>200</td>
   *                        <td>200 OK</td>
   *                        <td>* Access-Control-Allow-Origin - <br>
   *                        * Access-Control-Allow-Methods - <br>
   *                        * Access-Control-Allow-Headers - <br>
   *                        </td>
   *                        </tr>
   *                        <tr>
   *                        <td>400</td>
   *                        <td>400 OK</td>
   *                        <td>-</td>
   *                        </tr>
   *                        </table>
   */
  public EsignatureDocusignResponse esignatureDocusign(String documentId,
      EsignatureDocusignRequest esignatureDocusignRequest, String siteId) throws ApiException {
    ApiResponse<EsignatureDocusignResponse> localVarResp =
        esignatureDocusignWithHttpInfo(documentId, esignatureDocusignRequest, siteId);
    return localVarResp.getData();
  }

  /**
   * Create E-signature request Create a DocuSign E-Signature request; ONLY available with FormKiQ
   * Enterprise
   * 
   * @param documentId Document Identifier (required)
   * @param esignatureDocusignRequest (required)
   * @param siteId Site Identifier (optional)
   * @return ApiResponse&lt;EsignatureDocusignResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *         response body
   * @http.response.details
   *                        <table summary="Response Details" border="1">
   *                        <tr>
   *                        <td>Status Code</td>
   *                        <td>Description</td>
   *                        <td>Response Headers</td>
   *                        </tr>
   *                        <tr>
   *                        <td>200</td>
   *                        <td>200 OK</td>
   *                        <td>* Access-Control-Allow-Origin - <br>
   *                        * Access-Control-Allow-Methods - <br>
   *                        * Access-Control-Allow-Headers - <br>
   *                        </td>
   *                        </tr>
   *                        <tr>
   *                        <td>400</td>
   *                        <td>400 OK</td>
   *                        <td>-</td>
   *                        </tr>
   *                        </table>
   */
  public ApiResponse<EsignatureDocusignResponse> esignatureDocusignWithHttpInfo(String documentId,
      EsignatureDocusignRequest esignatureDocusignRequest, String siteId) throws ApiException {
    okhttp3.Call localVarCall =
        esignatureDocusignValidateBeforeCall(documentId, esignatureDocusignRequest, siteId, null);
    Type localVarReturnType = new TypeToken<EsignatureDocusignResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Create E-signature request (asynchronously) Create a DocuSign E-Signature request; ONLY
   * available with FormKiQ Enterprise
   * 
   * @param documentId Document Identifier (required)
   * @param esignatureDocusignRequest (required)
   * @param siteId Site Identifier (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *                        <table summary="Response Details" border="1">
   *                        <tr>
   *                        <td>Status Code</td>
   *                        <td>Description</td>
   *                        <td>Response Headers</td>
   *                        </tr>
   *                        <tr>
   *                        <td>200</td>
   *                        <td>200 OK</td>
   *                        <td>* Access-Control-Allow-Origin - <br>
   *                        * Access-Control-Allow-Methods - <br>
   *                        * Access-Control-Allow-Headers - <br>
   *                        </td>
   *                        </tr>
   *                        <tr>
   *                        <td>400</td>
   *                        <td>400 OK</td>
   *                        <td>-</td>
   *                        </tr>
   *                        </table>
   */
  public okhttp3.Call esignatureDocusignAsync(String documentId,
      EsignatureDocusignRequest esignatureDocusignRequest, String siteId,
      final ApiCallback<EsignatureDocusignResponse> _callback) throws ApiException {

    okhttp3.Call localVarCall = esignatureDocusignValidateBeforeCall(documentId,
        esignatureDocusignRequest, siteId, _callback);
    Type localVarReturnType = new TypeToken<EsignatureDocusignResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }

  /**
   * Build call for esignatureDocusignConfig
   * 
   * @param siteId Site Identifier (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *                        <table summary="Response Details" border="1">
   *                        <tr>
   *                        <td>Status Code</td>
   *                        <td>Description</td>
   *                        <td>Response Headers</td>
   *                        </tr>
   *                        <tr>
   *                        <td>200</td>
   *                        <td>200 OK</td>
   *                        <td>* Access-Control-Allow-Origin - <br>
   *                        * Access-Control-Allow-Methods - <br>
   *                        * Access-Control-Allow-Headers - <br>
   *                        </td>
   *                        </tr>
   *                        </table>
   */
  public okhttp3.Call esignatureDocusignConfigCall(String siteId, final ApiCallback _callback)
      throws ApiException {
    String basePath = null;
    // Operation Servers
    String[] localBasePaths = new String[] {};

    // Determine Base Path to Use
    if (localCustomBaseUrl != null) {
      basePath = localCustomBaseUrl;
    } else if (localBasePaths.length > 0) {
      basePath = localBasePaths[localHostIndex];
    } else {
      basePath = null;
    }

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/esignature/docusign/config";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (siteId != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("siteId", siteId));
    }

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};
    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    if (localVarContentType != null) {
      localVarHeaderParams.put("Content-Type", localVarContentType);
    }

    String[] localVarAuthNames = new String[] {"AWS4Auth"};
    return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams,
        localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams,
        localVarFormParams, localVarAuthNames, _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call esignatureDocusignConfigValidateBeforeCall(String siteId,
      final ApiCallback _callback) throws ApiException {
    return esignatureDocusignConfigCall(siteId, _callback);

  }

  /**
   * Get E-signature config Get DocuSign configuration info; ONLY available with FormKiQ Enterprise
   * 
   * @param siteId Site Identifier (optional)
   * @return EsignatureDocusignConfigResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *         response body
   * @http.response.details
   *                        <table summary="Response Details" border="1">
   *                        <tr>
   *                        <td>Status Code</td>
   *                        <td>Description</td>
   *                        <td>Response Headers</td>
   *                        </tr>
   *                        <tr>
   *                        <td>200</td>
   *                        <td>200 OK</td>
   *                        <td>* Access-Control-Allow-Origin - <br>
   *                        * Access-Control-Allow-Methods - <br>
   *                        * Access-Control-Allow-Headers - <br>
   *                        </td>
   *                        </tr>
   *                        </table>
   */
  public EsignatureDocusignConfigResponse esignatureDocusignConfig(String siteId)
      throws ApiException {
    ApiResponse<EsignatureDocusignConfigResponse> localVarResp =
        esignatureDocusignConfigWithHttpInfo(siteId);
    return localVarResp.getData();
  }

  /**
   * Get E-signature config Get DocuSign configuration info; ONLY available with FormKiQ Enterprise
   * 
   * @param siteId Site Identifier (optional)
   * @return ApiResponse&lt;EsignatureDocusignConfigResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *         response body
   * @http.response.details
   *                        <table summary="Response Details" border="1">
   *                        <tr>
   *                        <td>Status Code</td>
   *                        <td>Description</td>
   *                        <td>Response Headers</td>
   *                        </tr>
   *                        <tr>
   *                        <td>200</td>
   *                        <td>200 OK</td>
   *                        <td>* Access-Control-Allow-Origin - <br>
   *                        * Access-Control-Allow-Methods - <br>
   *                        * Access-Control-Allow-Headers - <br>
   *                        </td>
   *                        </tr>
   *                        </table>
   */
  public ApiResponse<EsignatureDocusignConfigResponse> esignatureDocusignConfigWithHttpInfo(
      String siteId) throws ApiException {
    okhttp3.Call localVarCall = esignatureDocusignConfigValidateBeforeCall(siteId, null);
    Type localVarReturnType = new TypeToken<EsignatureDocusignConfigResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Get E-signature config (asynchronously) Get DocuSign configuration info; ONLY available with
   * FormKiQ Enterprise
   * 
   * @param siteId Site Identifier (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *                        <table summary="Response Details" border="1">
   *                        <tr>
   *                        <td>Status Code</td>
   *                        <td>Description</td>
   *                        <td>Response Headers</td>
   *                        </tr>
   *                        <tr>
   *                        <td>200</td>
   *                        <td>200 OK</td>
   *                        <td>* Access-Control-Allow-Origin - <br>
   *                        * Access-Control-Allow-Methods - <br>
   *                        * Access-Control-Allow-Headers - <br>
   *                        </td>
   *                        </tr>
   *                        </table>
   */
  public okhttp3.Call esignatureDocusignConfigAsync(String siteId,
      final ApiCallback<EsignatureDocusignConfigResponse> _callback) throws ApiException {

    okhttp3.Call localVarCall = esignatureDocusignConfigValidateBeforeCall(siteId, _callback);
    Type localVarReturnType = new TypeToken<EsignatureDocusignConfigResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }

  /**
   * Build call for esignatureSetDocusignConfig
   * 
   * @param esignatureSetDocusignConfigRequest (required)
   * @param siteId Site Identifier (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *                        <table summary="Response Details" border="1">
   *                        <tr>
   *                        <td>Status Code</td>
   *                        <td>Description</td>
   *                        <td>Response Headers</td>
   *                        </tr>
   *                        <tr>
   *                        <td>200</td>
   *                        <td>200 OK</td>
   *                        <td>* Access-Control-Allow-Origin - <br>
   *                        * Access-Control-Allow-Methods - <br>
   *                        * Access-Control-Allow-Headers - <br>
   *                        </td>
   *                        </tr>
   *                        </table>
   */
  public okhttp3.Call esignatureSetDocusignConfigCall(
      EsignatureSetDocusignConfigRequest esignatureSetDocusignConfigRequest, String siteId,
      final ApiCallback _callback) throws ApiException {
    String basePath = null;
    // Operation Servers
    String[] localBasePaths = new String[] {};

    // Determine Base Path to Use
    if (localCustomBaseUrl != null) {
      basePath = localCustomBaseUrl;
    } else if (localBasePaths.length > 0) {
      basePath = localBasePaths[localHostIndex];
    } else {
      basePath = null;
    }

    Object localVarPostBody = esignatureSetDocusignConfigRequest;

    // create path and map variables
    String localVarPath = "/esignature/docusign/config";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (siteId != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("siteId", siteId));
    }

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    if (localVarContentType != null) {
      localVarHeaderParams.put("Content-Type", localVarContentType);
    }

    String[] localVarAuthNames = new String[] {"AWS4Auth"};
    return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams,
        localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams,
        localVarFormParams, localVarAuthNames, _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call esignatureSetDocusignConfigValidateBeforeCall(
      EsignatureSetDocusignConfigRequest esignatureSetDocusignConfigRequest, String siteId,
      final ApiCallback _callback) throws ApiException {
    // verify the required parameter 'esignatureSetDocusignConfigRequest' is set
    if (esignatureSetDocusignConfigRequest == null) {
      throw new ApiException(
          "Missing the required parameter 'esignatureSetDocusignConfigRequest' when calling esignatureSetDocusignConfig(Async)");
    }

    return esignatureSetDocusignConfigCall(esignatureSetDocusignConfigRequest, siteId, _callback);

  }

  /**
   * Set E-signature config Set DocuSign configuration, required for integration; ONLY available
   * with FormKiQ Enterprise
   * 
   * @param esignatureSetDocusignConfigRequest (required)
   * @param siteId Site Identifier (optional)
   * @return EsignatureSetDocusignConfigResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *         response body
   * @http.response.details
   *                        <table summary="Response Details" border="1">
   *                        <tr>
   *                        <td>Status Code</td>
   *                        <td>Description</td>
   *                        <td>Response Headers</td>
   *                        </tr>
   *                        <tr>
   *                        <td>200</td>
   *                        <td>200 OK</td>
   *                        <td>* Access-Control-Allow-Origin - <br>
   *                        * Access-Control-Allow-Methods - <br>
   *                        * Access-Control-Allow-Headers - <br>
   *                        </td>
   *                        </tr>
   *                        </table>
   */
  public EsignatureSetDocusignConfigResponse esignatureSetDocusignConfig(
      EsignatureSetDocusignConfigRequest esignatureSetDocusignConfigRequest, String siteId)
      throws ApiException {
    ApiResponse<EsignatureSetDocusignConfigResponse> localVarResp =
        esignatureSetDocusignConfigWithHttpInfo(esignatureSetDocusignConfigRequest, siteId);
    return localVarResp.getData();
  }

  /**
   * Set E-signature config Set DocuSign configuration, required for integration; ONLY available
   * with FormKiQ Enterprise
   * 
   * @param esignatureSetDocusignConfigRequest (required)
   * @param siteId Site Identifier (optional)
   * @return ApiResponse&lt;EsignatureSetDocusignConfigResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *         response body
   * @http.response.details
   *                        <table summary="Response Details" border="1">
   *                        <tr>
   *                        <td>Status Code</td>
   *                        <td>Description</td>
   *                        <td>Response Headers</td>
   *                        </tr>
   *                        <tr>
   *                        <td>200</td>
   *                        <td>200 OK</td>
   *                        <td>* Access-Control-Allow-Origin - <br>
   *                        * Access-Control-Allow-Methods - <br>
   *                        * Access-Control-Allow-Headers - <br>
   *                        </td>
   *                        </tr>
   *                        </table>
   */
  public ApiResponse<EsignatureSetDocusignConfigResponse> esignatureSetDocusignConfigWithHttpInfo(
      EsignatureSetDocusignConfigRequest esignatureSetDocusignConfigRequest, String siteId)
      throws ApiException {
    okhttp3.Call localVarCall = esignatureSetDocusignConfigValidateBeforeCall(
        esignatureSetDocusignConfigRequest, siteId, null);
    Type localVarReturnType = new TypeToken<EsignatureSetDocusignConfigResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Set E-signature config (asynchronously) Set DocuSign configuration, required for integration;
   * ONLY available with FormKiQ Enterprise
   * 
   * @param esignatureSetDocusignConfigRequest (required)
   * @param siteId Site Identifier (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *                        <table summary="Response Details" border="1">
   *                        <tr>
   *                        <td>Status Code</td>
   *                        <td>Description</td>
   *                        <td>Response Headers</td>
   *                        </tr>
   *                        <tr>
   *                        <td>200</td>
   *                        <td>200 OK</td>
   *                        <td>* Access-Control-Allow-Origin - <br>
   *                        * Access-Control-Allow-Methods - <br>
   *                        * Access-Control-Allow-Headers - <br>
   *                        </td>
   *                        </tr>
   *                        </table>
   */
  public okhttp3.Call esignatureSetDocusignConfigAsync(
      EsignatureSetDocusignConfigRequest esignatureSetDocusignConfigRequest, String siteId,
      final ApiCallback<EsignatureSetDocusignConfigResponse> _callback) throws ApiException {

    okhttp3.Call localVarCall = esignatureSetDocusignConfigValidateBeforeCall(
        esignatureSetDocusignConfigRequest, siteId, _callback);
    Type localVarReturnType = new TypeToken<EsignatureSetDocusignConfigResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
}
