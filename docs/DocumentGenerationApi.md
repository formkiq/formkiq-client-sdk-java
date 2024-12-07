# DocumentGenerationApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDocumentGenerate**](DocumentGenerationApi.md#addDocumentGenerate) | **POST** /documents/{documentId}/generate | Add Document Generate |


<a id="addDocumentGenerate"></a>
# **addDocumentGenerate**
> AddDocumentGenerateResponse addDocumentGenerate(documentId, addDocumentGenerateRequest, siteId)

Add Document Generate

Generates a new document using a specified template file and data sources. This operation allows users to merge data from multiple documents into a template to create a new document in the desired output format (e.g., DOCX).  By Default data source must include a &#x60;data&#x60; object, which contains key-value pairs that will be merged into the template. The value can be any valid JSON object. { \&quot;data\&quot;:{}}. The data path can be adjusted via the \&quot;dataRoot\&quot; field.  ; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentGenerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentGenerationApi apiInstance = new DocumentGenerationApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    AddDocumentGenerateRequest addDocumentGenerateRequest = new AddDocumentGenerateRequest(); // AddDocumentGenerateRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      AddDocumentGenerateResponse result = apiInstance.addDocumentGenerate(documentId, addDocumentGenerateRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentGenerationApi#addDocumentGenerate");
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
| **addDocumentGenerateRequest** | [**AddDocumentGenerateRequest**](AddDocumentGenerateRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**AddDocumentGenerateResponse**](AddDocumentGenerateResponse.md)

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

