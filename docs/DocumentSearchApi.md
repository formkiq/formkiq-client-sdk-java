# DocumentSearchApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**documentSearch**](DocumentSearchApi.md#documentSearch) | **POST** /search | Document search |


<a id="documentSearch"></a>
# **documentSearch**
> DocumentSearchResponse documentSearch(documentSearchRequest, siteId, limit, next, previous)

Document search

Document search query request;   Supports searching DynamoDB for document(s) by a single TAG key and/or value. Value can be \&quot;exacted\&quot; or \&quot;begins_with\&quot; matched. Search can be filtered to only check certain documentIds (up to 100 documentIds accepted).  If using Enteprise Composite Keys feature then multiple tag(s) can be searched for.  If Typesense is enabled, full text search is supported through the \&quot;text\&quot; parameter. Full text search will look for the text in the \&quot;content\&quot; and/or document \&quot;metadata\&quot;.  DocumentIds parameter allows you to filter your results to a specific set of documents.   See requestBody examples below for commmon examples.

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
    try {
      DocumentSearchResponse result = apiInstance.documentSearch(documentSearchRequest, siteId, limit, next, previous);
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

