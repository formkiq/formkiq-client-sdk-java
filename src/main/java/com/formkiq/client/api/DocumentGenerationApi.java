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


import com.formkiq.client.model.AddDocumentGenerateRequest;
import com.formkiq.client.model.AddDocumentGenerateResponse;
import com.formkiq.client.model.ValidationErrorsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentGenerationApi {
  private ApiClient localVarApiClient;
  private int localHostIndex;
  private String localCustomBaseUrl;

  public DocumentGenerationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DocumentGenerationApi(ApiClient apiClient) {
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
   * Build call for addDocumentGenerate
   * 
   * @param documentId Document Identifier (required)
   * @param addDocumentGenerateRequest (required)
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
  public okhttp3.Call addDocumentGenerateCall(String documentId,
      AddDocumentGenerateRequest addDocumentGenerateRequest, String siteId,
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

    Object localVarPostBody = addDocumentGenerateRequest;

    // create path and map variables
    String localVarPath = "/documents/{documentId}/generate".replace("{" + "documentId" + "}",
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
  private okhttp3.Call addDocumentGenerateValidateBeforeCall(String documentId,
      AddDocumentGenerateRequest addDocumentGenerateRequest, String siteId,
      final ApiCallback _callback) throws ApiException {
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(
          "Missing the required parameter 'documentId' when calling addDocumentGenerate(Async)");
    }

    // verify the required parameter 'addDocumentGenerateRequest' is set
    if (addDocumentGenerateRequest == null) {
      throw new ApiException(
          "Missing the required parameter 'addDocumentGenerateRequest' when calling addDocumentGenerate(Async)");
    }

    return addDocumentGenerateCall(documentId, addDocumentGenerateRequest, siteId, _callback);

  }

  /**
   * Add Document Generate Generates a new document using a specified template file and data
   * sources. This operation allows users to merge data from multiple documents into a template to
   * create a new document in the desired output format (e.g., DOCX). By Default data source must
   * include a &#x60;data&#x60; object, which contains key-value pairs that will be merged into the
   * template. The value can be any valid JSON object. { \&quot;data\&quot;:{}}. The data path can
   * be adjusted via the \&quot;dataRoot\&quot; field. ; ONLY available with FormKiQ Enterprise
   * 
   * @param documentId Document Identifier (required)
   * @param addDocumentGenerateRequest (required)
   * @param siteId Site Identifier (optional)
   * @return AddDocumentGenerateResponse
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
  public AddDocumentGenerateResponse addDocumentGenerate(String documentId,
      AddDocumentGenerateRequest addDocumentGenerateRequest, String siteId) throws ApiException {
    ApiResponse<AddDocumentGenerateResponse> localVarResp =
        addDocumentGenerateWithHttpInfo(documentId, addDocumentGenerateRequest, siteId);
    return localVarResp.getData();
  }

  /**
   * Add Document Generate Generates a new document using a specified template file and data
   * sources. This operation allows users to merge data from multiple documents into a template to
   * create a new document in the desired output format (e.g., DOCX). By Default data source must
   * include a &#x60;data&#x60; object, which contains key-value pairs that will be merged into the
   * template. The value can be any valid JSON object. { \&quot;data\&quot;:{}}. The data path can
   * be adjusted via the \&quot;dataRoot\&quot; field. ; ONLY available with FormKiQ Enterprise
   * 
   * @param documentId Document Identifier (required)
   * @param addDocumentGenerateRequest (required)
   * @param siteId Site Identifier (optional)
   * @return ApiResponse&lt;AddDocumentGenerateResponse&gt;
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
  public ApiResponse<AddDocumentGenerateResponse> addDocumentGenerateWithHttpInfo(String documentId,
      AddDocumentGenerateRequest addDocumentGenerateRequest, String siteId) throws ApiException {
    okhttp3.Call localVarCall =
        addDocumentGenerateValidateBeforeCall(documentId, addDocumentGenerateRequest, siteId, null);
    Type localVarReturnType = new TypeToken<AddDocumentGenerateResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Add Document Generate (asynchronously) Generates a new document using a specified template file
   * and data sources. This operation allows users to merge data from multiple documents into a
   * template to create a new document in the desired output format (e.g., DOCX). By Default data
   * source must include a &#x60;data&#x60; object, which contains key-value pairs that will be
   * merged into the template. The value can be any valid JSON object. { \&quot;data\&quot;:{}}. The
   * data path can be adjusted via the \&quot;dataRoot\&quot; field. ; ONLY available with FormKiQ
   * Enterprise
   * 
   * @param documentId Document Identifier (required)
   * @param addDocumentGenerateRequest (required)
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
  public okhttp3.Call addDocumentGenerateAsync(String documentId,
      AddDocumentGenerateRequest addDocumentGenerateRequest, String siteId,
      final ApiCallback<AddDocumentGenerateResponse> _callback) throws ApiException {

    okhttp3.Call localVarCall = addDocumentGenerateValidateBeforeCall(documentId,
        addDocumentGenerateRequest, siteId, _callback);
    Type localVarReturnType = new TypeToken<AddDocumentGenerateResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
}
