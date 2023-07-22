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


import com.formkiq.client.model.SetAntivirusResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AntivirusApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AntivirusApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AntivirusApi(ApiClient apiClient) {
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
     * Build call for setAntivirus
     * @param documentId Document Identifier (required)
     * @param siteId Site Identifier (optional)
     * @param shareKey Share Identifier (optional)
     * @param body  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 OK </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call setAntivirusCall(String documentId, String siteId, String shareKey, Object body, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/documents/{documentId}/antivirus"
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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiAuthorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call setAntivirusValidateBeforeCall(String documentId, String siteId, String shareKey, Object body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new ApiException("Missing the required parameter 'documentId' when calling setAntivirus(Async)");
        }

        return setAntivirusCall(documentId, siteId, shareKey, body, _callback);

    }

    /**
     * 
     * Perform an Anti-Malware / Antivirus scan on a document; ONLY available with FormKiQ Pro and Enterprise
     * @param documentId Document Identifier (required)
     * @param siteId Site Identifier (optional)
     * @param shareKey Share Identifier (optional)
     * @param body  (optional)
     * @return SetAntivirusResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 OK </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public SetAntivirusResponse setAntivirus(String documentId, String siteId, String shareKey, Object body) throws ApiException {
        ApiResponse<SetAntivirusResponse> localVarResp = setAntivirusWithHttpInfo(documentId, siteId, shareKey, body);
        return localVarResp.getData();
    }

    /**
     * 
     * Perform an Anti-Malware / Antivirus scan on a document; ONLY available with FormKiQ Pro and Enterprise
     * @param documentId Document Identifier (required)
     * @param siteId Site Identifier (optional)
     * @param shareKey Share Identifier (optional)
     * @param body  (optional)
     * @return ApiResponse&lt;SetAntivirusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 OK </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<SetAntivirusResponse> setAntivirusWithHttpInfo(String documentId, String siteId, String shareKey, Object body) throws ApiException {
        okhttp3.Call localVarCall = setAntivirusValidateBeforeCall(documentId, siteId, shareKey, body, null);
        Type localVarReturnType = new TypeToken<SetAntivirusResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Perform an Anti-Malware / Antivirus scan on a document; ONLY available with FormKiQ Pro and Enterprise
     * @param documentId Document Identifier (required)
     * @param siteId Site Identifier (optional)
     * @param shareKey Share Identifier (optional)
     * @param body  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 OK </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call setAntivirusAsync(String documentId, String siteId, String shareKey, Object body, final ApiCallback<SetAntivirusResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = setAntivirusValidateBeforeCall(documentId, siteId, shareKey, body, _callback);
        Type localVarReturnType = new TypeToken<SetAntivirusResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
