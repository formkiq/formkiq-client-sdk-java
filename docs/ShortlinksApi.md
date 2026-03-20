# ShortlinksApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addShortlink**](ShortlinksApi.md#addShortlink) | **POST** /shortlinks | Add shortlink |


<a id="addShortlink"></a>
# **addShortlink**
> AddShortlinkResponse addShortlink(addShortlinkRequest)

Add shortlink

Create a shortlink for a target URL

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.ShortlinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    ShortlinksApi apiInstance = new ShortlinksApi(defaultClient);
    AddShortlinkRequest addShortlinkRequest = new AddShortlinkRequest(); // AddShortlinkRequest | 
    try {
      AddShortlinkResponse result = apiInstance.addShortlink(addShortlinkRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShortlinksApi#addShortlink");
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
| **addShortlinkRequest** | [**AddShortlinkRequest**](AddShortlinkRequest.md)|  | |

### Return type

[**AddShortlinkResponse**](AddShortlinkResponse.md)

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

