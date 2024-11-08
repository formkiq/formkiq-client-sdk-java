# ReindexApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addReindexDocument**](ReindexApi.md#addReindexDocument) | **POST** /reindex/documents/{documentId} | Reindex metadata on a document |


<a id="addReindexDocument"></a>
# **addReindexDocument**
> AddResponse addReindexDocument(documentId, addReindexDocumentRequest, siteId)

Reindex metadata on a document

The API allows for the reindexing of a document&#39;s metadata determined by the target.  ATTRIBUTE target will regenerate the composite keys for a document based on the Classification / SiteSchema

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.ReindexApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    ReindexApi apiInstance = new ReindexApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    AddReindexDocumentRequest addReindexDocumentRequest = new AddReindexDocumentRequest(); // AddReindexDocumentRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      AddResponse result = apiInstance.addReindexDocument(documentId, addReindexDocumentRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReindexApi#addReindexDocument");
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
| **documentId** | **String**| Document Identifier | |
| **addReindexDocumentRequest** | [**AddReindexDocumentRequest**](AddReindexDocumentRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**AddResponse**](AddResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 CREATED |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | 400 OK |  -  |

