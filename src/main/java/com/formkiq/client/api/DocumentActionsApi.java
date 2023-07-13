/*
 * FormKiQ HTTP API
 * FormKiQ HTTP API
 *
 * The version of the OpenAPI document: 1.12.0
 * Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
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


import com.formkiq.client.model.AddDocumentActionsRequest;
import com.formkiq.client.model.AddDocumentActionsResponse;
import com.formkiq.client.model.GetDocumentActionsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class DocumentActionsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DocumentActionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DocumentActionsApi(ApiClient apiClient) {
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
     * Build call for addDocumentActions
     * @param documentId Document Identifier (required)
     * @param siteId Site Identifier (optional)
     * @param addDocumentActionsRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 OK </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call addDocumentActionsCall(String documentId, String siteId, AddDocumentActionsRequest addDocumentActionsRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = addDocumentActionsRequest;

        // create path and map variables
        String localVarPath = "/documents/{documentId}/actions"
            .replace("{" + "documentId" + "}", localVarApiClient.escapeString(documentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (siteId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("siteId", siteId));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiAuthorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addDocumentActionsValidateBeforeCall(String documentId, String siteId, AddDocumentActionsRequest addDocumentActionsRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new ApiException("Missing the required parameter 'documentId' when calling addDocumentActions(Async)");
        }

        return addDocumentActionsCall(documentId, siteId, addDocumentActionsRequest, _callback);

    }

    /**
     * 
     * Add one or more actions to a document; this appends actions and does not replace previous actions
     * @param documentId Document Identifier (required)
     * @param siteId Site Identifier (optional)
     * @param addDocumentActionsRequest  (optional)
     * @return AddDocumentActionsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 OK </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public AddDocumentActionsResponse addDocumentActions(String documentId, String siteId, AddDocumentActionsRequest addDocumentActionsRequest) throws ApiException {
        ApiResponse<AddDocumentActionsResponse> localVarResp = addDocumentActionsWithHttpInfo(documentId, siteId, addDocumentActionsRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Add one or more actions to a document; this appends actions and does not replace previous actions
     * @param documentId Document Identifier (required)
     * @param siteId Site Identifier (optional)
     * @param addDocumentActionsRequest  (optional)
     * @return ApiResponse&lt;AddDocumentActionsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 OK </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<AddDocumentActionsResponse> addDocumentActionsWithHttpInfo(String documentId, String siteId, AddDocumentActionsRequest addDocumentActionsRequest) throws ApiException {
        okhttp3.Call localVarCall = addDocumentActionsValidateBeforeCall(documentId, siteId, addDocumentActionsRequest, null);
        Type localVarReturnType = new TypeToken<AddDocumentActionsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Add one or more actions to a document; this appends actions and does not replace previous actions
     * @param documentId Document Identifier (required)
     * @param siteId Site Identifier (optional)
     * @param addDocumentActionsRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 OK </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call addDocumentActionsAsync(String documentId, String siteId, AddDocumentActionsRequest addDocumentActionsRequest, final ApiCallback<AddDocumentActionsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = addDocumentActionsValidateBeforeCall(documentId, siteId, addDocumentActionsRequest, _callback);
        Type localVarReturnType = new TypeToken<AddDocumentActionsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDocumentActions
     * @param documentId Document Identifier (required)
     * @param siteId Site Identifier (optional)
     * @param shareKey Share Identifier (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 OK </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getDocumentActionsCall(String documentId, String siteId, String shareKey, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/documents/{documentId}/actions"
            .replace("{" + "documentId" + "}", localVarApiClient.escapeString(documentId.toString()));

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

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiAuthorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getDocumentActionsValidateBeforeCall(String documentId, String siteId, String shareKey, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new ApiException("Missing the required parameter 'documentId' when calling getDocumentActions(Async)");
        }

        return getDocumentActionsCall(documentId, siteId, shareKey, _callback);

    }

    /**
     * 
     * Get document actions and their status
     * @param documentId Document Identifier (required)
     * @param siteId Site Identifier (optional)
     * @param shareKey Share Identifier (optional)
     * @return GetDocumentActionsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 OK </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public GetDocumentActionsResponse getDocumentActions(String documentId, String siteId, String shareKey) throws ApiException {
        ApiResponse<GetDocumentActionsResponse> localVarResp = getDocumentActionsWithHttpInfo(documentId, siteId, shareKey);
        return localVarResp.getData();
    }

    /**
     * 
     * Get document actions and their status
     * @param documentId Document Identifier (required)
     * @param siteId Site Identifier (optional)
     * @param shareKey Share Identifier (optional)
     * @return ApiResponse&lt;GetDocumentActionsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 OK </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<GetDocumentActionsResponse> getDocumentActionsWithHttpInfo(String documentId, String siteId, String shareKey) throws ApiException {
        okhttp3.Call localVarCall = getDocumentActionsValidateBeforeCall(documentId, siteId, shareKey, null);
        Type localVarReturnType = new TypeToken<GetDocumentActionsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get document actions and their status
     * @param documentId Document Identifier (required)
     * @param siteId Site Identifier (optional)
     * @param shareKey Share Identifier (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 OK </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getDocumentActionsAsync(String documentId, String siteId, String shareKey, final ApiCallback<GetDocumentActionsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDocumentActionsValidateBeforeCall(documentId, siteId, shareKey, _callback);
        Type localVarReturnType = new TypeToken<GetDocumentActionsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}