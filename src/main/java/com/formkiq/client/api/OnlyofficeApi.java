/*
 * FormKiQ HTTP API
 * Formkiq API: Document Management Platform API using JWT Authentication
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


import com.formkiq.client.model.OnlyOfficeDocumentNewRequest;
import com.formkiq.client.model.OnlyOfficeDocumentResponse;
import com.formkiq.client.model.OnlyOfficeDocumentSaveResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class OnlyofficeApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public OnlyofficeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OnlyofficeApi(ApiClient apiClient) {
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
     * Build call for onlyOfficeDocumentEdit
     * @param documentId Document Identifier (required)
     * @param body  (required)
     * @param siteId Site Identifier (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 OK </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call onlyOfficeDocumentEditCall(String documentId, Object body, String siteId, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/onlyoffice/{documentId}/edit"
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
    private okhttp3.Call onlyOfficeDocumentEditValidateBeforeCall(String documentId, Object body, String siteId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new ApiException("Missing the required parameter 'documentId' when calling onlyOfficeDocumentEdit(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling onlyOfficeDocumentEdit(Async)");
        }

        return onlyOfficeDocumentEditCall(documentId, body, siteId, _callback);

    }

    /**
     * 
     * Provide ONLYOFFICE integration for editing documents; ONLY available with FormKiQ Enterprise
     * @param documentId Document Identifier (required)
     * @param body  (required)
     * @param siteId Site Identifier (optional)
     * @return OnlyOfficeDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 OK </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public OnlyOfficeDocumentResponse onlyOfficeDocumentEdit(String documentId, Object body, String siteId) throws ApiException {
        ApiResponse<OnlyOfficeDocumentResponse> localVarResp = onlyOfficeDocumentEditWithHttpInfo(documentId, body, siteId);
        return localVarResp.getData();
    }

    /**
     * 
     * Provide ONLYOFFICE integration for editing documents; ONLY available with FormKiQ Enterprise
     * @param documentId Document Identifier (required)
     * @param body  (required)
     * @param siteId Site Identifier (optional)
     * @return ApiResponse&lt;OnlyOfficeDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 OK </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<OnlyOfficeDocumentResponse> onlyOfficeDocumentEditWithHttpInfo(String documentId, Object body, String siteId) throws ApiException {
        okhttp3.Call localVarCall = onlyOfficeDocumentEditValidateBeforeCall(documentId, body, siteId, null);
        Type localVarReturnType = new TypeToken<OnlyOfficeDocumentResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Provide ONLYOFFICE integration for editing documents; ONLY available with FormKiQ Enterprise
     * @param documentId Document Identifier (required)
     * @param body  (required)
     * @param siteId Site Identifier (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 OK </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call onlyOfficeDocumentEditAsync(String documentId, Object body, String siteId, final ApiCallback<OnlyOfficeDocumentResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = onlyOfficeDocumentEditValidateBeforeCall(documentId, body, siteId, _callback);
        Type localVarReturnType = new TypeToken<OnlyOfficeDocumentResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for onlyOfficeDocumentNew
     * @param onlyOfficeDocumentNewRequest  (required)
     * @param siteId Site Identifier (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 OK </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call onlyOfficeDocumentNewCall(OnlyOfficeDocumentNewRequest onlyOfficeDocumentNewRequest, String siteId, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = onlyOfficeDocumentNewRequest;

        // create path and map variables
        String localVarPath = "/onlyoffice/new";

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
    private okhttp3.Call onlyOfficeDocumentNewValidateBeforeCall(OnlyOfficeDocumentNewRequest onlyOfficeDocumentNewRequest, String siteId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'onlyOfficeDocumentNewRequest' is set
        if (onlyOfficeDocumentNewRequest == null) {
            throw new ApiException("Missing the required parameter 'onlyOfficeDocumentNewRequest' when calling onlyOfficeDocumentNew(Async)");
        }

        return onlyOfficeDocumentNewCall(onlyOfficeDocumentNewRequest, siteId, _callback);

    }

    /**
     * 
     * Provide ONLYOFFICE integration for the creation of new documents; ONLY available with FormKiQ Enterprise
     * @param onlyOfficeDocumentNewRequest  (required)
     * @param siteId Site Identifier (optional)
     * @return OnlyOfficeDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 OK </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public OnlyOfficeDocumentResponse onlyOfficeDocumentNew(OnlyOfficeDocumentNewRequest onlyOfficeDocumentNewRequest, String siteId) throws ApiException {
        ApiResponse<OnlyOfficeDocumentResponse> localVarResp = onlyOfficeDocumentNewWithHttpInfo(onlyOfficeDocumentNewRequest, siteId);
        return localVarResp.getData();
    }

    /**
     * 
     * Provide ONLYOFFICE integration for the creation of new documents; ONLY available with FormKiQ Enterprise
     * @param onlyOfficeDocumentNewRequest  (required)
     * @param siteId Site Identifier (optional)
     * @return ApiResponse&lt;OnlyOfficeDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 OK </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<OnlyOfficeDocumentResponse> onlyOfficeDocumentNewWithHttpInfo(OnlyOfficeDocumentNewRequest onlyOfficeDocumentNewRequest, String siteId) throws ApiException {
        okhttp3.Call localVarCall = onlyOfficeDocumentNewValidateBeforeCall(onlyOfficeDocumentNewRequest, siteId, null);
        Type localVarReturnType = new TypeToken<OnlyOfficeDocumentResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Provide ONLYOFFICE integration for the creation of new documents; ONLY available with FormKiQ Enterprise
     * @param onlyOfficeDocumentNewRequest  (required)
     * @param siteId Site Identifier (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 OK </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call onlyOfficeDocumentNewAsync(OnlyOfficeDocumentNewRequest onlyOfficeDocumentNewRequest, String siteId, final ApiCallback<OnlyOfficeDocumentResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = onlyOfficeDocumentNewValidateBeforeCall(onlyOfficeDocumentNewRequest, siteId, _callback);
        Type localVarReturnType = new TypeToken<OnlyOfficeDocumentResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for onlyOfficeDocumentSave
     * @param documentId Document Identifier (required)
     * @param siteId Site Identifier (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 OK </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call onlyOfficeDocumentSaveCall(String documentId, String siteId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/onlyoffice/{documentId}/save"
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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call onlyOfficeDocumentSaveValidateBeforeCall(String documentId, String siteId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new ApiException("Missing the required parameter 'documentId' when calling onlyOfficeDocumentSave(Async)");
        }

        return onlyOfficeDocumentSaveCall(documentId, siteId, _callback);

    }

    /**
     * 
     * Save an updated document for ONLYOFFICE integration. ONLY available with FormKiQ Enterprise
     * @param documentId Document Identifier (required)
     * @param siteId Site Identifier (optional)
     * @return OnlyOfficeDocumentSaveResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 OK </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public OnlyOfficeDocumentSaveResponse onlyOfficeDocumentSave(String documentId, String siteId) throws ApiException {
        ApiResponse<OnlyOfficeDocumentSaveResponse> localVarResp = onlyOfficeDocumentSaveWithHttpInfo(documentId, siteId);
        return localVarResp.getData();
    }

    /**
     * 
     * Save an updated document for ONLYOFFICE integration. ONLY available with FormKiQ Enterprise
     * @param documentId Document Identifier (required)
     * @param siteId Site Identifier (optional)
     * @return ApiResponse&lt;OnlyOfficeDocumentSaveResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 OK </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<OnlyOfficeDocumentSaveResponse> onlyOfficeDocumentSaveWithHttpInfo(String documentId, String siteId) throws ApiException {
        okhttp3.Call localVarCall = onlyOfficeDocumentSaveValidateBeforeCall(documentId, siteId, null);
        Type localVarReturnType = new TypeToken<OnlyOfficeDocumentSaveResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Save an updated document for ONLYOFFICE integration. ONLY available with FormKiQ Enterprise
     * @param documentId Document Identifier (required)
     * @param siteId Site Identifier (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 OK </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call onlyOfficeDocumentSaveAsync(String documentId, String siteId, final ApiCallback<OnlyOfficeDocumentSaveResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = onlyOfficeDocumentSaveValidateBeforeCall(documentId, siteId, _callback);
        Type localVarReturnType = new TypeToken<OnlyOfficeDocumentSaveResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
