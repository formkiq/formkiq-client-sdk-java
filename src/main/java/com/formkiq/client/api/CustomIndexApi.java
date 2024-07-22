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
 * The version of the OpenAPI document: 1.15.1 Contact: support@formkiq.com
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


import com.formkiq.client.model.DeleteIndicesResponse;
import com.formkiq.client.model.IndexFolderMoveRequest;
import com.formkiq.client.model.IndexFolderMoveResponse;
import com.formkiq.client.model.IndexSearchRequest;
import com.formkiq.client.model.IndexSearchResponse;
import com.formkiq.client.model.ValidationErrorsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomIndexApi {
  private ApiClient localVarApiClient;
  private int localHostIndex;
  private String localCustomBaseUrl;

  public CustomIndexApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CustomIndexApi(ApiClient apiClient) {
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
   * Build call for deleteIndex
   * 
   * @param indexKey Index Key Identifier (required)
   * @param indexType Index Type (required)
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
  public okhttp3.Call deleteIndexCall(String indexKey, String indexType, String siteId,
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
    String localVarPath = "/indices/{indexType}/{indexKey}"
        .replace("{" + "indexKey" + "}", localVarApiClient.escapeString(indexKey.toString()))
        .replace("{" + "indexType" + "}", localVarApiClient.escapeString(indexType.toString()));

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
    return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams,
        localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams,
        localVarFormParams, localVarAuthNames, _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call deleteIndexValidateBeforeCall(String indexKey, String indexType,
      String siteId, final ApiCallback _callback) throws ApiException {
    // verify the required parameter 'indexKey' is set
    if (indexKey == null) {
      throw new ApiException(
          "Missing the required parameter 'indexKey' when calling deleteIndex(Async)");
    }

    // verify the required parameter 'indexType' is set
    if (indexType == null) {
      throw new ApiException(
          "Missing the required parameter 'indexType' when calling deleteIndex(Async)");
    }

    return deleteIndexCall(indexKey, indexType, siteId, _callback);

  }

  /**
   * 
   * Perform a delete on the Folder Index
   * 
   * @param indexKey Index Key Identifier (required)
   * @param indexType Index Type (required)
   * @param siteId Site Identifier (optional)
   * @return DeleteIndicesResponse
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
  public DeleteIndicesResponse deleteIndex(String indexKey, String indexType, String siteId)
      throws ApiException {
    ApiResponse<DeleteIndicesResponse> localVarResp =
        deleteIndexWithHttpInfo(indexKey, indexType, siteId);
    return localVarResp.getData();
  }

  /**
   * 
   * Perform a delete on the Folder Index
   * 
   * @param indexKey Index Key Identifier (required)
   * @param indexType Index Type (required)
   * @param siteId Site Identifier (optional)
   * @return ApiResponse&lt;DeleteIndicesResponse&gt;
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
  public ApiResponse<DeleteIndicesResponse> deleteIndexWithHttpInfo(String indexKey,
      String indexType, String siteId) throws ApiException {
    okhttp3.Call localVarCall = deleteIndexValidateBeforeCall(indexKey, indexType, siteId, null);
    Type localVarReturnType = new TypeToken<DeleteIndicesResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) Perform a delete on the Folder Index
   * 
   * @param indexKey Index Key Identifier (required)
   * @param indexType Index Type (required)
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
  public okhttp3.Call deleteIndexAsync(String indexKey, String indexType, String siteId,
      final ApiCallback<DeleteIndicesResponse> _callback) throws ApiException {

    okhttp3.Call localVarCall =
        deleteIndexValidateBeforeCall(indexKey, indexType, siteId, _callback);
    Type localVarReturnType = new TypeToken<DeleteIndicesResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }

  /**
   * Build call for indexFolderMove
   * 
   * @param indexType Index Type (required)
   * @param indexFolderMoveRequest (required)
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
  public okhttp3.Call indexFolderMoveCall(String indexType,
      IndexFolderMoveRequest indexFolderMoveRequest, String siteId, final ApiCallback _callback)
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

    Object localVarPostBody = indexFolderMoveRequest;

    // create path and map variables
    String localVarPath = "/indices/{indexType}/move".replace("{" + "indexType" + "}",
        localVarApiClient.escapeString(indexType.toString()));

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
  private okhttp3.Call indexFolderMoveValidateBeforeCall(String indexType,
      IndexFolderMoveRequest indexFolderMoveRequest, String siteId, final ApiCallback _callback)
      throws ApiException {
    // verify the required parameter 'indexType' is set
    if (indexType == null) {
      throw new ApiException(
          "Missing the required parameter 'indexType' when calling indexFolderMove(Async)");
    }

    // verify the required parameter 'indexFolderMoveRequest' is set
    if (indexFolderMoveRequest == null) {
      throw new ApiException(
          "Missing the required parameter 'indexFolderMoveRequest' when calling indexFolderMove(Async)");
    }

    return indexFolderMoveCall(indexType, indexFolderMoveRequest, siteId, _callback);

  }

  /**
   * 
   * Perform an Folder Index Move
   * 
   * @param indexType Index Type (required)
   * @param indexFolderMoveRequest (required)
   * @param siteId Site Identifier (optional)
   * @return IndexFolderMoveResponse
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
  public IndexFolderMoveResponse indexFolderMove(String indexType,
      IndexFolderMoveRequest indexFolderMoveRequest, String siteId) throws ApiException {
    ApiResponse<IndexFolderMoveResponse> localVarResp =
        indexFolderMoveWithHttpInfo(indexType, indexFolderMoveRequest, siteId);
    return localVarResp.getData();
  }

  /**
   * 
   * Perform an Folder Index Move
   * 
   * @param indexType Index Type (required)
   * @param indexFolderMoveRequest (required)
   * @param siteId Site Identifier (optional)
   * @return ApiResponse&lt;IndexFolderMoveResponse&gt;
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
  public ApiResponse<IndexFolderMoveResponse> indexFolderMoveWithHttpInfo(String indexType,
      IndexFolderMoveRequest indexFolderMoveRequest, String siteId) throws ApiException {
    okhttp3.Call localVarCall =
        indexFolderMoveValidateBeforeCall(indexType, indexFolderMoveRequest, siteId, null);
    Type localVarReturnType = new TypeToken<IndexFolderMoveResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) Perform an Folder Index Move
   * 
   * @param indexType Index Type (required)
   * @param indexFolderMoveRequest (required)
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
  public okhttp3.Call indexFolderMoveAsync(String indexType,
      IndexFolderMoveRequest indexFolderMoveRequest, String siteId,
      final ApiCallback<IndexFolderMoveResponse> _callback) throws ApiException {

    okhttp3.Call localVarCall =
        indexFolderMoveValidateBeforeCall(indexType, indexFolderMoveRequest, siteId, _callback);
    Type localVarReturnType = new TypeToken<IndexFolderMoveResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }

  /**
   * Build call for indexSearch
   * 
   * @param indexSearchRequest (required)
   * @param siteId Site Identifier (optional)
   * @param limit Limit Results (optional, default to 10)
   * @param next Next page of results token (optional)
   * @param previous Previous page of results token (optional)
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
  public okhttp3.Call indexSearchCall(IndexSearchRequest indexSearchRequest, String siteId,
      String limit, String next, String previous, final ApiCallback _callback) throws ApiException {
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

    Object localVarPostBody = indexSearchRequest;

    // create path and map variables
    String localVarPath = "/indices/search";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (siteId != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("siteId", siteId));
    }

    if (limit != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
    }

    if (next != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("next", next));
    }

    if (previous != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("previous", previous));
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
  private okhttp3.Call indexSearchValidateBeforeCall(IndexSearchRequest indexSearchRequest,
      String siteId, String limit, String next, String previous, final ApiCallback _callback)
      throws ApiException {
    // verify the required parameter 'indexSearchRequest' is set
    if (indexSearchRequest == null) {
      throw new ApiException(
          "Missing the required parameter 'indexSearchRequest' when calling indexSearch(Async)");
    }

    return indexSearchCall(indexSearchRequest, siteId, limit, next, previous, _callback);

  }

  /**
   * 
   * Perform a search on a index; this is currently available for both folder and tag indices
   * 
   * @param indexSearchRequest (required)
   * @param siteId Site Identifier (optional)
   * @param limit Limit Results (optional, default to 10)
   * @param next Next page of results token (optional)
   * @param previous Previous page of results token (optional)
   * @return IndexSearchResponse
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
  public IndexSearchResponse indexSearch(IndexSearchRequest indexSearchRequest, String siteId,
      String limit, String next, String previous) throws ApiException {
    ApiResponse<IndexSearchResponse> localVarResp =
        indexSearchWithHttpInfo(indexSearchRequest, siteId, limit, next, previous);
    return localVarResp.getData();
  }

  /**
   * 
   * Perform a search on a index; this is currently available for both folder and tag indices
   * 
   * @param indexSearchRequest (required)
   * @param siteId Site Identifier (optional)
   * @param limit Limit Results (optional, default to 10)
   * @param next Next page of results token (optional)
   * @param previous Previous page of results token (optional)
   * @return ApiResponse&lt;IndexSearchResponse&gt;
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
  public ApiResponse<IndexSearchResponse> indexSearchWithHttpInfo(
      IndexSearchRequest indexSearchRequest, String siteId, String limit, String next,
      String previous) throws ApiException {
    okhttp3.Call localVarCall =
        indexSearchValidateBeforeCall(indexSearchRequest, siteId, limit, next, previous, null);
    Type localVarReturnType = new TypeToken<IndexSearchResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) Perform a search on a index; this is currently available for both folder and
   * tag indices
   * 
   * @param indexSearchRequest (required)
   * @param siteId Site Identifier (optional)
   * @param limit Limit Results (optional, default to 10)
   * @param next Next page of results token (optional)
   * @param previous Previous page of results token (optional)
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
  public okhttp3.Call indexSearchAsync(IndexSearchRequest indexSearchRequest, String siteId,
      String limit, String next, String previous, final ApiCallback<IndexSearchResponse> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        indexSearchValidateBeforeCall(indexSearchRequest, siteId, limit, next, previous, _callback);
    Type localVarReturnType = new TypeToken<IndexSearchResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
}
