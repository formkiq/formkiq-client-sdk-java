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
 * The version of the OpenAPI document: 1.17.0 Contact: support@formkiq.com
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


import com.formkiq.client.model.DocumentSearchRequest;
import com.formkiq.client.model.DocumentSearchResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentSearchApi {
  private ApiClient localVarApiClient;
  private int localHostIndex;
  private String localCustomBaseUrl;

  public DocumentSearchApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DocumentSearchApi(ApiClient apiClient) {
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
   * Build call for documentSearch
   * 
   * @param documentSearchRequest (required)
   * @param siteId Site Identifier (optional)
   * @param limit Limit Results (optional, default to 10)
   * @param next Next page of results token (optional)
   * @param previous Previous page of results token (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *                        <table border="1">
   *                        <caption>Response Details</caption>
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
  public okhttp3.Call documentSearchCall(DocumentSearchRequest documentSearchRequest, String siteId,
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

    Object localVarPostBody = documentSearchRequest;

    // create path and map variables
    String localVarPath = "/search";

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
  private okhttp3.Call documentSearchValidateBeforeCall(DocumentSearchRequest documentSearchRequest,
      String siteId, String limit, String next, String previous, final ApiCallback _callback)
      throws ApiException {
    // verify the required parameter 'documentSearchRequest' is set
    if (documentSearchRequest == null) {
      throw new ApiException(
          "Missing the required parameter 'documentSearchRequest' when calling documentSearch(Async)");
    }

    return documentSearchCall(documentSearchRequest, siteId, limit, next, previous, _callback);

  }

  /**
   * Document search Document search query request; Supports searching DynamoDB for document(s) by a
   * single TAG key and/or value. Value can be \&quot;exacted\&quot; or \&quot;begins_with\&quot;
   * matched. Search can be filtered to only check certain documentIds (up to 100 documentIds
   * accepted). If using Enteprise Composite Keys feature then multiple tag(s) can be searched for.
   * If Typesense is enabled, full text search is supported through the \&quot;text\&quot;
   * parameter. Full text search will look for the text in the \&quot;content\&quot; and/or document
   * \&quot;metadata\&quot;. DocumentIds parameter allows you to filter your results to a specific
   * set of documents. See requestBody examples below for commmon examples.
   * 
   * @param documentSearchRequest (required)
   * @param siteId Site Identifier (optional)
   * @param limit Limit Results (optional, default to 10)
   * @param next Next page of results token (optional)
   * @param previous Previous page of results token (optional)
   * @return DocumentSearchResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *         response body
   * @http.response.details
   *                        <table border="1">
   *                        <caption>Response Details</caption>
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
  public DocumentSearchResponse documentSearch(DocumentSearchRequest documentSearchRequest,
      String siteId, String limit, String next, String previous) throws ApiException {
    ApiResponse<DocumentSearchResponse> localVarResp =
        documentSearchWithHttpInfo(documentSearchRequest, siteId, limit, next, previous);
    return localVarResp.getData();
  }

  /**
   * Document search Document search query request; Supports searching DynamoDB for document(s) by a
   * single TAG key and/or value. Value can be \&quot;exacted\&quot; or \&quot;begins_with\&quot;
   * matched. Search can be filtered to only check certain documentIds (up to 100 documentIds
   * accepted). If using Enteprise Composite Keys feature then multiple tag(s) can be searched for.
   * If Typesense is enabled, full text search is supported through the \&quot;text\&quot;
   * parameter. Full text search will look for the text in the \&quot;content\&quot; and/or document
   * \&quot;metadata\&quot;. DocumentIds parameter allows you to filter your results to a specific
   * set of documents. See requestBody examples below for commmon examples.
   * 
   * @param documentSearchRequest (required)
   * @param siteId Site Identifier (optional)
   * @param limit Limit Results (optional, default to 10)
   * @param next Next page of results token (optional)
   * @param previous Previous page of results token (optional)
   * @return ApiResponse&lt;DocumentSearchResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *         response body
   * @http.response.details
   *                        <table border="1">
   *                        <caption>Response Details</caption>
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
  public ApiResponse<DocumentSearchResponse> documentSearchWithHttpInfo(
      DocumentSearchRequest documentSearchRequest, String siteId, String limit, String next,
      String previous) throws ApiException {
    okhttp3.Call localVarCall = documentSearchValidateBeforeCall(documentSearchRequest, siteId,
        limit, next, previous, null);
    Type localVarReturnType = new TypeToken<DocumentSearchResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Document search (asynchronously) Document search query request; Supports searching DynamoDB for
   * document(s) by a single TAG key and/or value. Value can be \&quot;exacted\&quot; or
   * \&quot;begins_with\&quot; matched. Search can be filtered to only check certain documentIds (up
   * to 100 documentIds accepted). If using Enteprise Composite Keys feature then multiple tag(s)
   * can be searched for. If Typesense is enabled, full text search is supported through the
   * \&quot;text\&quot; parameter. Full text search will look for the text in the
   * \&quot;content\&quot; and/or document \&quot;metadata\&quot;. DocumentIds parameter allows you
   * to filter your results to a specific set of documents. See requestBody examples below for
   * commmon examples.
   * 
   * @param documentSearchRequest (required)
   * @param siteId Site Identifier (optional)
   * @param limit Limit Results (optional, default to 10)
   * @param next Next page of results token (optional)
   * @param previous Previous page of results token (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *                        <table border="1">
   *                        <caption>Response Details</caption>
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
  public okhttp3.Call documentSearchAsync(DocumentSearchRequest documentSearchRequest,
      String siteId, String limit, String next, String previous,
      final ApiCallback<DocumentSearchResponse> _callback) throws ApiException {

    okhttp3.Call localVarCall = documentSearchValidateBeforeCall(documentSearchRequest, siteId,
        limit, next, previous, _callback);
    Type localVarReturnType = new TypeToken<DocumentSearchResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
}
