# DocumentDataClassificationApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDocumentDataClassification**](DocumentDataClassificationApi.md#getDocumentDataClassification) | **GET** /documents/{documentId}/dataClassification | Get document&#39;s data classification |
| [**setDocumentDataClassification**](DocumentDataClassificationApi.md#setDocumentDataClassification) | **PUT** /documents/{documentId}/dataClassification | Set document&#39;s data classification |


<a id="getDocumentDataClassification"></a>
# **getDocumentDataClassification**
> GetDocumentDataClassificationResponse getDocumentDataClassification(documentId, siteId, limit, next)

Get document&#39;s data classification

Retrieve an document&#39;s data classification; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentDataClassificationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentDataClassificationApi apiInstance = new DocumentDataClassificationApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    String limit = "10"; // String | Limit Results
    String next = "next_example"; // String | Next page of results token
    try {
      GetDocumentDataClassificationResponse result = apiInstance.getDocumentDataClassification(documentId, siteId, limit, next);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentDataClassificationApi#getDocumentDataClassification");
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
| **limit** | **String**| Limit Results | [optional] [default to 10] |
| **next** | **String**| Next page of results token | [optional] |

### Return type

[**GetDocumentDataClassificationResponse**](GetDocumentDataClassificationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="setDocumentDataClassification"></a>
# **setDocumentDataClassification**
> SetDocumentDataClassificationResponse setDocumentDataClassification(documentId, siteId, setDocumentDataClassificationRequest)

Set document&#39;s data classification

Generate Data Classfication attributes within a document; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentDataClassificationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentDataClassificationApi apiInstance = new DocumentDataClassificationApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    SetDocumentDataClassificationRequest setDocumentDataClassificationRequest = new SetDocumentDataClassificationRequest(); // SetDocumentDataClassificationRequest | 
    try {
      SetDocumentDataClassificationResponse result = apiInstance.setDocumentDataClassification(documentId, siteId, setDocumentDataClassificationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentDataClassificationApi#setDocumentDataClassification");
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
| **setDocumentDataClassificationRequest** | [**SetDocumentDataClassificationRequest**](SetDocumentDataClassificationRequest.md)|  | [optional] |

### Return type

[**SetDocumentDataClassificationResponse**](SetDocumentDataClassificationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

