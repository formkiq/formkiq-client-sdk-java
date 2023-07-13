# UsersManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getUsersMe**](UsersManagementApi.md#getUsersMe) | **GET** /users/me |  |


<a id="getUsersMe"></a>
# **getUsersMe**
> GetUsersMeRequest getUsersMe()



Return the calling users user information

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.UsersManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: ApiAuthorization
    HttpBearerAuth ApiAuthorization = (HttpBearerAuth) defaultClient.getAuthentication("ApiAuthorization");
    ApiAuthorization.setBearerToken("BEARER TOKEN");

    UsersManagementApi apiInstance = new UsersManagementApi(defaultClient);
    try {
      GetUsersMeRequest result = apiInstance.getUsersMe();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersManagementApi#getUsersMe");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetUsersMeRequest**](GetUsersMeRequest.md)

### Authorization

[ApiAuthorization](../README.md#ApiAuthorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | 400 OK |  -  |

