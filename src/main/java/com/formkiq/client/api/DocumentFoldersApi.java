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


import com.formkiq.client.model.AddFolderRequest;
import com.formkiq.client.model.AddFolderResponse;
import com.formkiq.client.model.DeleteFolderResponse;
import com.formkiq.client.model.GetFoldersResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentFoldersApi {
  private ApiClient localVarApiClient;
  private int localHostIndex;
  private String localCustomBaseUrl;

  public DocumentFoldersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DocumentFoldersApi(ApiClient apiClient) {
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
   * Build call for addFolder
   * 
   * @param addFolderRequest (required)
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
   *                        <td>201</td>
   *                        <td>201 CREATED</td>
   *                        <td>* Access-Control-Allow-Origin - <br>
   *                        * Access-Control-Allow-Methods - <br>
   *                        * Access-Control-Allow-Headers - <br>
   *                        </td>
   *                        </tr>
   *                        </table>
   */
  public okhttp3.Call addFolderCall(AddFolderRequest addFolderRequest, String siteId,
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

    Object localVarPostBody = addFolderRequest;

    // create path and map variables
    String localVarPath = "/folders";

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
  private okhttp3.Call addFolderValidateBeforeCall(AddFolderRequest addFolderRequest, String siteId,
      String shareKey, final ApiCallback _callback) throws ApiException {
    // verify the required parameter 'addFolderRequest' is set
    if (addFolderRequest == null) {
      throw new ApiException(
          "Missing the required parameter 'addFolderRequest' when calling addFolder(Async)");
    }

    return addFolderCall(addFolderRequest, siteId, shareKey, _callback);

  }

  /**
   * Add document folder Creates a new folder
   * 
   * @param addFolderRequest (required)
   * @param siteId Site Identifier (optional)
   * @param shareKey Share Identifier (optional)
   * @return AddFolderResponse
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
   *                        <td>201</td>
   *                        <td>201 CREATED</td>
   *                        <td>* Access-Control-Allow-Origin - <br>
   *                        * Access-Control-Allow-Methods - <br>
   *                        * Access-Control-Allow-Headers - <br>
   *                        </td>
   *                        </tr>
   *                        </table>
   */
  public AddFolderResponse addFolder(AddFolderRequest addFolderRequest, String siteId,
      String shareKey) throws ApiException {
    ApiResponse<AddFolderResponse> localVarResp =
        addFolderWithHttpInfo(addFolderRequest, siteId, shareKey);
    return localVarResp.getData();
  }

  /**
   * Add document folder Creates a new folder
   * 
   * @param addFolderRequest (required)
   * @param siteId Site Identifier (optional)
   * @param shareKey Share Identifier (optional)
   * @return ApiResponse&lt;AddFolderResponse&gt;
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
   *                        <td>201</td>
   *                        <td>201 CREATED</td>
   *                        <td>* Access-Control-Allow-Origin - <br>
   *                        * Access-Control-Allow-Methods - <br>
   *                        * Access-Control-Allow-Headers - <br>
   *                        </td>
   *                        </tr>
   *                        </table>
   */
  public ApiResponse<AddFolderResponse> addFolderWithHttpInfo(AddFolderRequest addFolderRequest,
      String siteId, String shareKey) throws ApiException {
    okhttp3.Call localVarCall =
        addFolderValidateBeforeCall(addFolderRequest, siteId, shareKey, null);
    Type localVarReturnType = new TypeToken<AddFolderResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Add document folder (asynchronously) Creates a new folder
   * 
   * @param addFolderRequest (required)
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
   *                        <td>201</td>
   *                        <td>201 CREATED</td>
   *                        <td>* Access-Control-Allow-Origin - <br>
   *                        * Access-Control-Allow-Methods - <br>
   *                        * Access-Control-Allow-Headers - <br>
   *                        </td>
   *                        </tr>
   *                        </table>
   */
  public okhttp3.Call addFolderAsync(AddFolderRequest addFolderRequest, String siteId,
      String shareKey, final ApiCallback<AddFolderResponse> _callback) throws ApiException {

    okhttp3.Call localVarCall =
        addFolderValidateBeforeCall(addFolderRequest, siteId, shareKey, _callback);
    Type localVarReturnType = new TypeToken<AddFolderResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }

  /**
   * Build call for deleteFolder
   * 
   * @param indexKey Index Key Identifier (required)
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
  public okhttp3.Call deleteFolderCall(String indexKey, String siteId, String shareKey,
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

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/folders/{indexKey}".replace("{" + "indexKey" + "}",
        localVarApiClient.escapeString(indexKey.toString()));

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
    return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams,
        localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams,
        localVarFormParams, localVarAuthNames, _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call deleteFolderValidateBeforeCall(String indexKey, String siteId,
      String shareKey, final ApiCallback _callback) throws ApiException {
    // verify the required parameter 'indexKey' is set
    if (indexKey == null) {
      throw new ApiException(
          "Missing the required parameter 'indexKey' when calling deleteFolder(Async)");
    }

    return deleteFolderCall(indexKey, siteId, shareKey, _callback);

  }

  /**
   * Delete document folder Delete a specific folder; folder must be empty
   * 
   * @param indexKey Index Key Identifier (required)
   * @param siteId Site Identifier (optional)
   * @param shareKey Share Identifier (optional)
   * @return DeleteFolderResponse
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
  public DeleteFolderResponse deleteFolder(String indexKey, String siteId, String shareKey)
      throws ApiException {
    ApiResponse<DeleteFolderResponse> localVarResp =
        deleteFolderWithHttpInfo(indexKey, siteId, shareKey);
    return localVarResp.getData();
  }

  /**
   * Delete document folder Delete a specific folder; folder must be empty
   * 
   * @param indexKey Index Key Identifier (required)
   * @param siteId Site Identifier (optional)
   * @param shareKey Share Identifier (optional)
   * @return ApiResponse&lt;DeleteFolderResponse&gt;
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
  public ApiResponse<DeleteFolderResponse> deleteFolderWithHttpInfo(String indexKey, String siteId,
      String shareKey) throws ApiException {
    okhttp3.Call localVarCall = deleteFolderValidateBeforeCall(indexKey, siteId, shareKey, null);
    Type localVarReturnType = new TypeToken<DeleteFolderResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Delete document folder (asynchronously) Delete a specific folder; folder must be empty
   * 
   * @param indexKey Index Key Identifier (required)
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
  public okhttp3.Call deleteFolderAsync(String indexKey, String siteId, String shareKey,
      final ApiCallback<DeleteFolderResponse> _callback) throws ApiException {

    okhttp3.Call localVarCall =
        deleteFolderValidateBeforeCall(indexKey, siteId, shareKey, _callback);
    Type localVarReturnType = new TypeToken<DeleteFolderResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }

  /**
   * Build call for getFolderDocuments
   * 
   * @param siteId Site Identifier (optional)
   * @param indexKey Index Key Identifier (optional)
   * @param limit Limit Results (optional, default to 10)
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
  public okhttp3.Call getFolderDocumentsCall(String siteId, String indexKey, String limit,
      String shareKey, String next, final ApiCallback _callback) throws ApiException {
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
    String localVarPath = "/folders";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (siteId != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("siteId", siteId));
    }

    if (indexKey != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("indexKey", indexKey));
    }

    if (limit != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
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
  private okhttp3.Call getFolderDocumentsValidateBeforeCall(String siteId, String indexKey,
      String limit, String shareKey, String next, final ApiCallback _callback) throws ApiException {
    return getFolderDocumentsCall(siteId, indexKey, limit, shareKey, next, _callback);

  }

  /**
   * Get document folders Get list of documents in a folder
   * 
   * @param siteId Site Identifier (optional)
   * @param indexKey Index Key Identifier (optional)
   * @param limit Limit Results (optional, default to 10)
   * @param shareKey Share Identifier (optional)
   * @param next Next page of results token (optional)
   * @return GetFoldersResponse
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
  public GetFoldersResponse getFolderDocuments(String siteId, String indexKey, String limit,
      String shareKey, String next) throws ApiException {
    ApiResponse<GetFoldersResponse> localVarResp =
        getFolderDocumentsWithHttpInfo(siteId, indexKey, limit, shareKey, next);
    return localVarResp.getData();
  }

  /**
   * Get document folders Get list of documents in a folder
   * 
   * @param siteId Site Identifier (optional)
   * @param indexKey Index Key Identifier (optional)
   * @param limit Limit Results (optional, default to 10)
   * @param shareKey Share Identifier (optional)
   * @param next Next page of results token (optional)
   * @return ApiResponse&lt;GetFoldersResponse&gt;
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
  public ApiResponse<GetFoldersResponse> getFolderDocumentsWithHttpInfo(String siteId,
      String indexKey, String limit, String shareKey, String next) throws ApiException {
    okhttp3.Call localVarCall =
        getFolderDocumentsValidateBeforeCall(siteId, indexKey, limit, shareKey, next, null);
    Type localVarReturnType = new TypeToken<GetFoldersResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Get document folders (asynchronously) Get list of documents in a folder
   * 
   * @param siteId Site Identifier (optional)
   * @param indexKey Index Key Identifier (optional)
   * @param limit Limit Results (optional, default to 10)
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
  public okhttp3.Call getFolderDocumentsAsync(String siteId, String indexKey, String limit,
      String shareKey, String next, final ApiCallback<GetFoldersResponse> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        getFolderDocumentsValidateBeforeCall(siteId, indexKey, limit, shareKey, next, _callback);
    Type localVarReturnType = new TypeToken<GetFoldersResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
}
