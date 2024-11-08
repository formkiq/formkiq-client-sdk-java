/*
 * FormKiQ API JWT Formkiq API: Document Management Platform API using OAuth(JWT) Authentication You
 * can find out more about FormKiQ at [https://formkiq.com](http://formkiq.com). ## Introduction
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
 * The version of the OpenAPI document: 1.16.0 Contact: support@formkiq.com
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


import com.formkiq.client.model.AddReindexDocumentRequest;
import com.formkiq.client.model.AddResponse;
import com.formkiq.client.model.ValidationErrorsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReindexApi {
  private ApiClient localVarApiClient;
  private int localHostIndex;
  private String localCustomBaseUrl;

  public ReindexApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReindexApi(ApiClient apiClient) {
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
   * Build call for addReindexDocument
   * 
   * @param documentId Document Identifier (required)
   * @param addReindexDocumentRequest (required)
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
   *                        <td>201</td>
   *                        <td>201 CREATED</td>
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
  public okhttp3.Call addReindexDocumentCall(String documentId,
      AddReindexDocumentRequest addReindexDocumentRequest, String siteId,
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

    Object localVarPostBody = addReindexDocumentRequest;

    // create path and map variables
    String localVarPath = "/reindex/documents/{documentId}".replace("{" + "documentId" + "}",
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
  private okhttp3.Call addReindexDocumentValidateBeforeCall(String documentId,
      AddReindexDocumentRequest addReindexDocumentRequest, String siteId,
      final ApiCallback _callback) throws ApiException {
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(
          "Missing the required parameter 'documentId' when calling addReindexDocument(Async)");
    }

    // verify the required parameter 'addReindexDocumentRequest' is set
    if (addReindexDocumentRequest == null) {
      throw new ApiException(
          "Missing the required parameter 'addReindexDocumentRequest' when calling addReindexDocument(Async)");
    }

    return addReindexDocumentCall(documentId, addReindexDocumentRequest, siteId, _callback);

  }

  /**
   * Reindex metadata on a document The API allows for the reindexing of a document&#39;s metadata
   * determined by the target. ATTRIBUTE target will regenerate the composite keys for a document
   * based on the Classification / SiteSchema
   * 
   * @param documentId Document Identifier (required)
   * @param addReindexDocumentRequest (required)
   * @param siteId Site Identifier (optional)
   * @return AddResponse
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
   *                        <tr>
   *                        <td>400</td>
   *                        <td>400 OK</td>
   *                        <td>-</td>
   *                        </tr>
   *                        </table>
   */
  public AddResponse addReindexDocument(String documentId,
      AddReindexDocumentRequest addReindexDocumentRequest, String siteId) throws ApiException {
    ApiResponse<AddResponse> localVarResp =
        addReindexDocumentWithHttpInfo(documentId, addReindexDocumentRequest, siteId);
    return localVarResp.getData();
  }

  /**
   * Reindex metadata on a document The API allows for the reindexing of a document&#39;s metadata
   * determined by the target. ATTRIBUTE target will regenerate the composite keys for a document
   * based on the Classification / SiteSchema
   * 
   * @param documentId Document Identifier (required)
   * @param addReindexDocumentRequest (required)
   * @param siteId Site Identifier (optional)
   * @return ApiResponse&lt;AddResponse&gt;
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
   *                        <tr>
   *                        <td>400</td>
   *                        <td>400 OK</td>
   *                        <td>-</td>
   *                        </tr>
   *                        </table>
   */
  public ApiResponse<AddResponse> addReindexDocumentWithHttpInfo(String documentId,
      AddReindexDocumentRequest addReindexDocumentRequest, String siteId) throws ApiException {
    okhttp3.Call localVarCall =
        addReindexDocumentValidateBeforeCall(documentId, addReindexDocumentRequest, siteId, null);
    Type localVarReturnType = new TypeToken<AddResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Reindex metadata on a document (asynchronously) The API allows for the reindexing of a
   * document&#39;s metadata determined by the target. ATTRIBUTE target will regenerate the
   * composite keys for a document based on the Classification / SiteSchema
   * 
   * @param documentId Document Identifier (required)
   * @param addReindexDocumentRequest (required)
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
   *                        <td>201</td>
   *                        <td>201 CREATED</td>
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
  public okhttp3.Call addReindexDocumentAsync(String documentId,
      AddReindexDocumentRequest addReindexDocumentRequest, String siteId,
      final ApiCallback<AddResponse> _callback) throws ApiException {

    okhttp3.Call localVarCall = addReindexDocumentValidateBeforeCall(documentId,
        addReindexDocumentRequest, siteId, _callback);
    Type localVarReturnType = new TypeToken<AddResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
}
