# DocumentSearchApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**documentSearch**](DocumentSearchApi.md#documentSearch) | **POST** /search | Document search |


<a id="documentSearch"></a>
# **documentSearch**
> DocumentSearchResponse documentSearch(documentSearchRequest, siteId, limit, next, previous, projection)

Document search

Document search query request;   Supports searching DynamoDB for document(s) by a single TAG key and/or value. Value can be \&quot;exacted\&quot; or \&quot;begins_with\&quot; matched. Search can be filtered to only check certain documentIds (up to 100 documentIds accepted).  If using Enteprise Composite Keys feature then multiple tag(s) can be searched for.  For attributes defined with dataType JSON, use an attribute criterion&#39;s json filter with a path to compare a nested field. Equality values inside json retain their JSON string, number, or boolean type. Numeric bounds inside json use gt, gte, lt, and lte. Existing attribute eq and eqOr operators continue to accept strings. Paths support object properties and explicit array positions; wildcard, recursive, and array any-element matching are not supported. Multiple conditions on different paths under the same attribute key are supported. All conditions must match the same document or artifact.  JSON path filtering is applied after candidate records are read and does not reduce read capacity consumed for those candidates. A stored JSON value does not automatically create an index for its nested fields. Continue through empty filtered pages until the next token is absent; candidate and time-budget limits still apply.  If Typesense is enabled, full text search is supported through the \&quot;text\&quot; parameter. Full text search will look for the text in the \&quot;content\&quot; and/or document \&quot;metadata\&quot;.  When &#x60;documentIds&#x60; is supplied, all supplied IDs are checked against the search criteria and all matching documents are returned. The &#x60;limit&#x60; query parameter is ignored. Up to 100 document IDs are accepted.  Use the &#x60;projection&#x60; parameter to return matching documents or a count of matching documents. Count responses are capped at 10,000 and indicate when the count was truncated. Multi-attribute searches requiring additional attribute filtering use a 25-second processing budget for index batches, attribute filtering, and document loading. The budget starts after index selection and empty-index prechecks. Searches with explicit &#x60;documentIds&#x60; or a composite key covering every search attribute are exempt. The budget is checked before starting each read; an in-flight read is allowed to finish. If the budget expires, document searches return completed matches with &#x60;truncated&#x3D;true&#x60; and a &#x60;next&#x60; token; count searches return a partial lower bound with &#x60;truncated&#x3D;true&#x60;.  See requestBody examples below for commmon examples.

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentSearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentSearchApi apiInstance = new DocumentSearchApi(defaultClient);
    DocumentSearchRequest documentSearchRequest = new DocumentSearchRequest(); // DocumentSearchRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    String limit = "10"; // String | Limit Results
    String next = "next_example"; // String | Next page of results token
    String previous = "previous_example"; // String | Previous page of results token
    String projection = "DOCUMENTS"; // String | Controls the search response projection. `DOCUMENTS` returns matching documents and pagination tokens. `COUNT` returns `count` and `truncated`, and omits `documents`, `next`, and `previous`.
    try {
      DocumentSearchResponse result = apiInstance.documentSearch(documentSearchRequest, siteId, limit, next, previous, projection);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentSearchApi#documentSearch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentSearchRequest** | [**DocumentSearchRequest**](DocumentSearchRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |
| **limit** | **String**| Limit Results | [optional] [default to 10] |
| **next** | **String**| Next page of results token | [optional] |
| **previous** | **String**| Previous page of results token | [optional] |
| **projection** | **String**| Controls the search response projection. &#x60;DOCUMENTS&#x60; returns matching documents and pagination tokens. &#x60;COUNT&#x60; returns &#x60;count&#x60; and &#x60;truncated&#x60;, and omits &#x60;documents&#x60;, &#x60;next&#x60;, and &#x60;previous&#x60;. | [optional] [default to DOCUMENTS] [enum: DOCUMENTS, COUNT] |

### Return type

[**DocumentSearchResponse**](DocumentSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | Invalid attribute search value, JSON path, or operator combination. |  -  |

