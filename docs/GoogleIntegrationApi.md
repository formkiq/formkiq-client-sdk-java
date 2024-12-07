# GoogleIntegrationApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addGoogleDocumentExport**](GoogleIntegrationApi.md#addGoogleDocumentExport) | **POST** /integrations/google/drive/documents/{documentId}/export | Add Google Document Export |


<a id="addGoogleDocumentExport"></a>
# **addGoogleDocumentExport**
> AddGoogleDocumentExportResponse addGoogleDocumentExport(documentId, addGoogleDocumentExportRequest, siteId)

Add Google Document Export

Exports a Google Document; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.GoogleIntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    GoogleIntegrationApi apiInstance = new GoogleIntegrationApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    AddGoogleDocumentExportRequest addGoogleDocumentExportRequest = new AddGoogleDocumentExportRequest(); // AddGoogleDocumentExportRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      AddGoogleDocumentExportResponse result = apiInstance.addGoogleDocumentExport(documentId, addGoogleDocumentExportRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GoogleIntegrationApi#addGoogleDocumentExport");
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
| **addGoogleDocumentExportRequest** | [**AddGoogleDocumentExportRequest**](AddGoogleDocumentExportRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**AddGoogleDocumentExportResponse**](AddGoogleDocumentExportResponse.md)

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

