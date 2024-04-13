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
 * The version of the OpenAPI document: 1.15.0 Contact: support@formkiq.com
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


import com.formkiq.client.model.GetUserActivitesResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserActivitiesApi {
  private ApiClient localVarApiClient;
  private int localHostIndex;
  private String localCustomBaseUrl;

  public UserActivitiesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UserActivitiesApi(ApiClient apiClient) {
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
   * Build call for getDocumentUserActivities
   * 
   * @param documentId Document Identifier (required)
   * @param siteId Site Identifier (optional)
   * @param next Next page of results token (optional)
   * @param limit Limit Results (optional, default to 10)
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
  public okhttp3.Call getDocumentUserActivitiesCall(String documentId, String siteId, String next,
      String limit, final ApiCallback _callback) throws ApiException {
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
    String localVarPath = "/documents/{documentId}/userActivities".replace("{" + "documentId" + "}",
        localVarApiClient.escapeString(documentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (siteId != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("siteId", siteId));
    }

    if (next != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("next", next));
    }

    if (limit != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
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
  private okhttp3.Call getDocumentUserActivitiesValidateBeforeCall(String documentId, String siteId,
      String next, String limit, final ApiCallback _callback) throws ApiException {
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(
          "Missing the required parameter 'documentId' when calling getDocumentUserActivities(Async)");
    }

    return getDocumentUserActivitiesCall(documentId, siteId, next, limit, _callback);

  }

  /**
   * Get user activities Retrieve a user&#39;s activities
   * 
   * @param documentId Document Identifier (required)
   * @param siteId Site Identifier (optional)
   * @param next Next page of results token (optional)
   * @param limit Limit Results (optional, default to 10)
   * @return GetUserActivitesResponse
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
  public GetUserActivitesResponse getDocumentUserActivities(String documentId, String siteId,
      String next, String limit) throws ApiException {
    ApiResponse<GetUserActivitesResponse> localVarResp =
        getDocumentUserActivitiesWithHttpInfo(documentId, siteId, next, limit);
    return localVarResp.getData();
  }

  /**
   * Get user activities Retrieve a user&#39;s activities
   * 
   * @param documentId Document Identifier (required)
   * @param siteId Site Identifier (optional)
   * @param next Next page of results token (optional)
   * @param limit Limit Results (optional, default to 10)
   * @return ApiResponse&lt;GetUserActivitesResponse&gt;
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
  public ApiResponse<GetUserActivitesResponse> getDocumentUserActivitiesWithHttpInfo(
      String documentId, String siteId, String next, String limit) throws ApiException {
    okhttp3.Call localVarCall =
        getDocumentUserActivitiesValidateBeforeCall(documentId, siteId, next, limit, null);
    Type localVarReturnType = new TypeToken<GetUserActivitesResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Get user activities (asynchronously) Retrieve a user&#39;s activities
   * 
   * @param documentId Document Identifier (required)
   * @param siteId Site Identifier (optional)
   * @param next Next page of results token (optional)
   * @param limit Limit Results (optional, default to 10)
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
  public okhttp3.Call getDocumentUserActivitiesAsync(String documentId, String siteId, String next,
      String limit, final ApiCallback<GetUserActivitesResponse> _callback) throws ApiException {

    okhttp3.Call localVarCall =
        getDocumentUserActivitiesValidateBeforeCall(documentId, siteId, next, limit, _callback);
    Type localVarReturnType = new TypeToken<GetUserActivitesResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }

  /**
   * Build call for getUserActivities
   * 
   * @param siteId Site Identifier (optional)
   * @param next Next page of results token (optional)
   * @param limit Limit Results (optional, default to 10)
   * @param userId Fetch specific user activities (optional)
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
  public okhttp3.Call getUserActivitiesCall(String siteId, String next, String limit, String userId,
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
    String localVarPath = "/userActivities";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (siteId != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("siteId", siteId));
    }

    if (next != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("next", next));
    }

    if (limit != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
    }

    if (userId != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("userId", userId));
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
  private okhttp3.Call getUserActivitiesValidateBeforeCall(String siteId, String next, String limit,
      String userId, final ApiCallback _callback) throws ApiException {
    return getUserActivitiesCall(siteId, next, limit, userId, _callback);

  }

  /**
   * Get user activities Retrieve a user&#39;s activities
   * 
   * @param siteId Site Identifier (optional)
   * @param next Next page of results token (optional)
   * @param limit Limit Results (optional, default to 10)
   * @param userId Fetch specific user activities (optional)
   * @return GetUserActivitesResponse
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
  public GetUserActivitesResponse getUserActivities(String siteId, String next, String limit,
      String userId) throws ApiException {
    ApiResponse<GetUserActivitesResponse> localVarResp =
        getUserActivitiesWithHttpInfo(siteId, next, limit, userId);
    return localVarResp.getData();
  }

  /**
   * Get user activities Retrieve a user&#39;s activities
   * 
   * @param siteId Site Identifier (optional)
   * @param next Next page of results token (optional)
   * @param limit Limit Results (optional, default to 10)
   * @param userId Fetch specific user activities (optional)
   * @return ApiResponse&lt;GetUserActivitesResponse&gt;
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
  public ApiResponse<GetUserActivitesResponse> getUserActivitiesWithHttpInfo(String siteId,
      String next, String limit, String userId) throws ApiException {
    okhttp3.Call localVarCall =
        getUserActivitiesValidateBeforeCall(siteId, next, limit, userId, null);
    Type localVarReturnType = new TypeToken<GetUserActivitesResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Get user activities (asynchronously) Retrieve a user&#39;s activities
   * 
   * @param siteId Site Identifier (optional)
   * @param next Next page of results token (optional)
   * @param limit Limit Results (optional, default to 10)
   * @param userId Fetch specific user activities (optional)
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
  public okhttp3.Call getUserActivitiesAsync(String siteId, String next, String limit,
      String userId, final ApiCallback<GetUserActivitesResponse> _callback) throws ApiException {

    okhttp3.Call localVarCall =
        getUserActivitiesValidateBeforeCall(siteId, next, limit, userId, _callback);
    Type localVarReturnType = new TypeToken<GetUserActivitesResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
}
