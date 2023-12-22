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


import com.formkiq.client.model.GetDocumentVersionsResponse;
import com.formkiq.client.model.SetDocumentVersionRequest;
import com.formkiq.client.model.SetDocumentVersionResponse;
import com.formkiq.client.model.ValidationErrorsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentVersionsApi {
  private ApiClient localVarApiClient;
  private int localHostIndex;
  private String localCustomBaseUrl;

  public DocumentVersionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DocumentVersionsApi(ApiClient apiClient) {
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
   * Build call for deleteDocumentVersion
   * 
   * @param documentId Document Identifier (required)
   * @param versionKey Version Key (required)
   * @param siteId Site Identifier (optional)
   * @param shareKey Share Identifier (optional)
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
  public okhttp3.Call deleteDocumentVersionCall(String documentId, String versionKey, String siteId,
      String shareKey, final ApiCallback _callback) throws ApiException {
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
    String localVarPath = "/documents/{documentId}/versions/{versionKey}"
        .replace("{" + "documentId" + "}", localVarApiClient.escapeString(documentId.toString()))
        .replace("{" + "versionKey" + "}", localVarApiClient.escapeString(versionKey.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (siteId != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("siteId", siteId));
    }

    if (shareKey != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("shareKey", shareKey));
    }

    final String[] localVarAccepts = {};
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
    return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams,
        localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams,
        localVarFormParams, localVarAuthNames, _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call deleteDocumentVersionValidateBeforeCall(String documentId, String versionKey,
      String siteId, String shareKey, final ApiCallback _callback) throws ApiException {
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(
          "Missing the required parameter 'documentId' when calling deleteDocumentVersion(Async)");
    }

    // verify the required parameter 'versionKey' is set
    if (versionKey == null) {
      throw new ApiException(
          "Missing the required parameter 'versionKey' when calling deleteDocumentVersion(Async)");
    }

    return deleteDocumentVersionCall(documentId, versionKey, siteId, shareKey, _callback);

  }

  /**
   * Delete document version Delete a specific previous document version; ONLY available with
   * FormKiQ Pro and Enterprise
   * 
   * @param documentId Document Identifier (required)
   * @param versionKey Version Key (required)
   * @param siteId Site Identifier (optional)
   * @param shareKey Share Identifier (optional)
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
  public void deleteDocumentVersion(String documentId, String versionKey, String siteId,
      String shareKey) throws ApiException {
    deleteDocumentVersionWithHttpInfo(documentId, versionKey, siteId, shareKey);
  }

  /**
   * Delete document version Delete a specific previous document version; ONLY available with
   * FormKiQ Pro and Enterprise
   * 
   * @param documentId Document Identifier (required)
   * @param versionKey Version Key (required)
   * @param siteId Site Identifier (optional)
   * @param shareKey Share Identifier (optional)
   * @return ApiResponse&lt;Void&gt;
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
  public ApiResponse<Void> deleteDocumentVersionWithHttpInfo(String documentId, String versionKey,
      String siteId, String shareKey) throws ApiException {
    okhttp3.Call localVarCall =
        deleteDocumentVersionValidateBeforeCall(documentId, versionKey, siteId, shareKey, null);
    return localVarApiClient.execute(localVarCall);
  }

  /**
   * Delete document version (asynchronously) Delete a specific previous document version; ONLY
   * available with FormKiQ Pro and Enterprise
   * 
   * @param documentId Document Identifier (required)
   * @param versionKey Version Key (required)
   * @param siteId Site Identifier (optional)
   * @param shareKey Share Identifier (optional)
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
  public okhttp3.Call deleteDocumentVersionAsync(String documentId, String versionKey,
      String siteId, String shareKey, final ApiCallback<Void> _callback) throws ApiException {

    okhttp3.Call localVarCall = deleteDocumentVersionValidateBeforeCall(documentId, versionKey,
        siteId, shareKey, _callback);
    localVarApiClient.executeAsync(localVarCall, _callback);
    return localVarCall;
  }

  /**
   * Build call for getDocumentVersions
   * 
   * @param documentId Document Identifier (required)
   * @param siteId Site Identifier (optional)
   * @param shareKey Share Identifier (optional)
   * @param next Next page of results token (optional)
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
  public okhttp3.Call getDocumentVersionsCall(String documentId, String siteId, String shareKey,
      String next, final ApiCallback _callback) throws ApiException {
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
    String localVarPath = "/documents/{documentId}/versions".replace("{" + "documentId" + "}",
        localVarApiClient.escapeString(documentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (siteId != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("siteId", siteId));
    }

    if (shareKey != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("shareKey", shareKey));
    }

    if (next != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("next", next));
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
  private okhttp3.Call getDocumentVersionsValidateBeforeCall(String documentId, String siteId,
      String shareKey, String next, final ApiCallback _callback) throws ApiException {
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(
          "Missing the required parameter 'documentId' when calling getDocumentVersions(Async)");
    }

    return getDocumentVersionsCall(documentId, siteId, shareKey, next, _callback);

  }

  /**
   * Get document&#39;s versions Get a listing of document content and metadata versions; ONLY
   * available with FormKiQ Pro and Enterprise
   * 
   * @param documentId Document Identifier (required)
   * @param siteId Site Identifier (optional)
   * @param shareKey Share Identifier (optional)
   * @param next Next page of results token (optional)
   * @return GetDocumentVersionsResponse
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
  public GetDocumentVersionsResponse getDocumentVersions(String documentId, String siteId,
      String shareKey, String next) throws ApiException {
    ApiResponse<GetDocumentVersionsResponse> localVarResp =
        getDocumentVersionsWithHttpInfo(documentId, siteId, shareKey, next);
    return localVarResp.getData();
  }

  /**
   * Get document&#39;s versions Get a listing of document content and metadata versions; ONLY
   * available with FormKiQ Pro and Enterprise
   * 
   * @param documentId Document Identifier (required)
   * @param siteId Site Identifier (optional)
   * @param shareKey Share Identifier (optional)
   * @param next Next page of results token (optional)
   * @return ApiResponse&lt;GetDocumentVersionsResponse&gt;
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
  public ApiResponse<GetDocumentVersionsResponse> getDocumentVersionsWithHttpInfo(String documentId,
      String siteId, String shareKey, String next) throws ApiException {
    okhttp3.Call localVarCall =
        getDocumentVersionsValidateBeforeCall(documentId, siteId, shareKey, next, null);
    Type localVarReturnType = new TypeToken<GetDocumentVersionsResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Get document&#39;s versions (asynchronously) Get a listing of document content and metadata
   * versions; ONLY available with FormKiQ Pro and Enterprise
   * 
   * @param documentId Document Identifier (required)
   * @param siteId Site Identifier (optional)
   * @param shareKey Share Identifier (optional)
   * @param next Next page of results token (optional)
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
  public okhttp3.Call getDocumentVersionsAsync(String documentId, String siteId, String shareKey,
      String next, final ApiCallback<GetDocumentVersionsResponse> _callback) throws ApiException {

    okhttp3.Call localVarCall =
        getDocumentVersionsValidateBeforeCall(documentId, siteId, shareKey, next, _callback);
    Type localVarReturnType = new TypeToken<GetDocumentVersionsResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }

  /**
   * Build call for setDocumentVersion
   * 
   * @param documentId Document Identifier (required)
   * @param setDocumentVersionRequest (required)
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
  public okhttp3.Call setDocumentVersionCall(String documentId,
      SetDocumentVersionRequest setDocumentVersionRequest, String siteId,
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

    Object localVarPostBody = setDocumentVersionRequest;

    // create path and map variables
    String localVarPath = "/documents/{documentId}/versions".replace("{" + "documentId" + "}",
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
    return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams,
        localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams,
        localVarFormParams, localVarAuthNames, _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call setDocumentVersionValidateBeforeCall(String documentId,
      SetDocumentVersionRequest setDocumentVersionRequest, String siteId,
      final ApiCallback _callback) throws ApiException {
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(
          "Missing the required parameter 'documentId' when calling setDocumentVersion(Async)");
    }

    // verify the required parameter 'setDocumentVersionRequest' is set
    if (setDocumentVersionRequest == null) {
      throw new ApiException(
          "Missing the required parameter 'setDocumentVersionRequest' when calling setDocumentVersion(Async)");
    }

    return setDocumentVersionCall(documentId, setDocumentVersionRequest, siteId, _callback);

  }

  /**
   * Set version of document Set document to a previous document version; ONLY available with
   * FormKiQ Pro and Enterprise
   * 
   * @param documentId Document Identifier (required)
   * @param setDocumentVersionRequest (required)
   * @param siteId Site Identifier (optional)
   * @return SetDocumentVersionResponse
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
  public SetDocumentVersionResponse setDocumentVersion(String documentId,
      SetDocumentVersionRequest setDocumentVersionRequest, String siteId) throws ApiException {
    ApiResponse<SetDocumentVersionResponse> localVarResp =
        setDocumentVersionWithHttpInfo(documentId, setDocumentVersionRequest, siteId);
    return localVarResp.getData();
  }

  /**
   * Set version of document Set document to a previous document version; ONLY available with
   * FormKiQ Pro and Enterprise
   * 
   * @param documentId Document Identifier (required)
   * @param setDocumentVersionRequest (required)
   * @param siteId Site Identifier (optional)
   * @return ApiResponse&lt;SetDocumentVersionResponse&gt;
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
  public ApiResponse<SetDocumentVersionResponse> setDocumentVersionWithHttpInfo(String documentId,
      SetDocumentVersionRequest setDocumentVersionRequest, String siteId) throws ApiException {
    okhttp3.Call localVarCall =
        setDocumentVersionValidateBeforeCall(documentId, setDocumentVersionRequest, siteId, null);
    Type localVarReturnType = new TypeToken<SetDocumentVersionResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Set version of document (asynchronously) Set document to a previous document version; ONLY
   * available with FormKiQ Pro and Enterprise
   * 
   * @param documentId Document Identifier (required)
   * @param setDocumentVersionRequest (required)
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
  public okhttp3.Call setDocumentVersionAsync(String documentId,
      SetDocumentVersionRequest setDocumentVersionRequest, String siteId,
      final ApiCallback<SetDocumentVersionResponse> _callback) throws ApiException {

    okhttp3.Call localVarCall = setDocumentVersionValidateBeforeCall(documentId,
        setDocumentVersionRequest, siteId, _callback);
    Type localVarReturnType = new TypeToken<SetDocumentVersionResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
}
