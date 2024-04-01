# ExamineObjectsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getExaminePdf**](ExamineObjectsApi.md#getExaminePdf) | **GET** /objects/examine/{id}/pdf | Add Examine Pdf |
| [**getExaminePdfUrl**](ExamineObjectsApi.md#getExaminePdfUrl) | **GET** /objects/examine/pdf | Add Examine Pdf |


<a id="getExaminePdf"></a>
# **getExaminePdf**
> GetExaminePdfResponse getExaminePdf(id, siteId)

Add Examine Pdf

Get PDF details  File must have been uploaded previously using the GET /objects/examine/pdf API.

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.ExamineObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    ExamineObjectsApi apiInstance = new ExamineObjectsApi(defaultClient);
    String id = "id_example"; // String | Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      GetExaminePdfResponse result = apiInstance.getExaminePdf(id, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExamineObjectsApi#getExaminePdf");
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
| **id** | **String**| Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**GetExaminePdfResponse**](GetExaminePdfResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getExaminePdfUrl"></a>
# **getExaminePdfUrl**
> GetExaminePdfUrlResponse getExaminePdfUrl(siteId)

Add Examine Pdf

Get Signed URL for PDF Object Upload of a document to be examined by calling GET /objects/examine/{id}/pdf

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.ExamineObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    ExamineObjectsApi apiInstance = new ExamineObjectsApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      GetExaminePdfUrlResponse result = apiInstance.getExaminePdfUrl(siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExamineObjectsApi#getExaminePdfUrl");
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
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**GetExaminePdfUrlResponse**](GetExaminePdfUrlResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

