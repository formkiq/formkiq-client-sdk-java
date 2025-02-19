# AntivirusApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**setAntivirus**](AntivirusApi.md#setAntivirus) | **PUT** /documents/{documentId}/antivirus | Antivirus document scan |


<a id="setAntivirus"></a>
# **setAntivirus**
> SetAntivirusResponse setAntivirus(documentId, siteId, shareKey, body)

Antivirus document scan

Perform an Anti-Malware / Antivirus scan on a document; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.AntivirusApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    AntivirusApi apiInstance = new AntivirusApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    String shareKey = "shareKey_example"; // String | Share Identifier
    Object body = null; // Object | 
    try {
      SetAntivirusResponse result = apiInstance.setAntivirus(documentId, siteId, shareKey, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AntivirusApi#setAntivirus");
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
| **siteId** | **String**| Site Identifier | [optional] |
| **shareKey** | **String**| Share Identifier | [optional] |
| **body** | **Object**|  | [optional] |

### Return type

[**SetAntivirusResponse**](SetAntivirusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

