# DocumentSearchApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**documentSearch**](DocumentSearchApi.md#documentSearch) | **POST** /search | Document search |


<a id="documentSearch"></a>
# **documentSearch**
> DocumentSearchResponse documentSearch(documentSearchRequest, siteId, limit, next, previous)

Document search

Document search query request; documents are searched primarily using a document tag key and optional tag value, or if Typesense is enabled, searches on the document path and versioned metadata is also available. An optional documentIds parameter is also available in the DocumentSearchBody to filter, with up to 100 documentIds accepted.

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

