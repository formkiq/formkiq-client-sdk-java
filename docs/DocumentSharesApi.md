# DocumentSharesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addFolderShare**](DocumentSharesApi.md#addFolderShare) | **POST** /shares/folders/{indexKey} |  |
| [**deleteShare**](DocumentSharesApi.md#deleteShare) | **DELETE** /shares/{shareKey} |  |
| [**getUserShares**](DocumentSharesApi.md#getUserShares) | **GET** /shares/me |  |


<a id="addFolderShare"></a>
# **addFolderShare**
> AddFolderShareResponse addFolderShare(indexKey, addFolderShareRequest, siteId)



Creates a new folder share; ONLY available with FormKiQ Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentSharesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: ApiAuthorization
    HttpBearerAuth ApiAuthorization = (HttpBearerAuth) defaultClient.getAuthentication("ApiAuthorization");
    ApiAuthorization.setBearerToken("BEARER TOKEN");

    DocumentSharesApi apiInstance = new DocumentSharesApi(defaultClient);
    String indexKey = "indexKey_example"; // String | Index Key Identifier
    AddFolderShareRequest addFolderShareRequest = new AddFolderShareRequest(); // AddFolderShareRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      AddFolderShareResponse result = apiInstance.addFolderShare(indexKey, addFolderShareRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentSharesApi#addFolderShare");
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
| **indexKey** | **String**| Index Key Identifier | |
| **addFolderShareRequest** | [**AddFolderShareRequest**](AddFolderShareRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**AddFolderShareResponse**](AddFolderShareResponse.md)

### Authorization

[ApiAuthorization](../README.md#ApiAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 CREATED |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="deleteShare"></a>
# **deleteShare**
> DeleteShareResponse deleteShare(shareKey)



Delete a specific document share; ONLY available with FormKiQ Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentSharesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: ApiAuthorization
    HttpBearerAuth ApiAuthorization = (HttpBearerAuth) defaultClient.getAuthentication("ApiAuthorization");
    ApiAuthorization.setBearerToken("BEARER TOKEN");

    DocumentSharesApi apiInstance = new DocumentSharesApi(defaultClient);
    String shareKey = "shareKey_example"; // String | Share Identifier
    try {
      DeleteShareResponse result = apiInstance.deleteShare(shareKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentSharesApi#deleteShare");
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
| **shareKey** | **String**| Share Identifier | |

### Return type

[**DeleteShareResponse**](DeleteShareResponse.md)

### Authorization

[ApiAuthorization](../README.md#ApiAuthorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getUserShares"></a>
# **getUserShares**
> GetUserShares getUserShares()



Get a listing of user folder/document shares; ONLY available with FormKiQ Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentSharesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: ApiAuthorization
    HttpBearerAuth ApiAuthorization = (HttpBearerAuth) defaultClient.getAuthentication("ApiAuthorization");
    ApiAuthorization.setBearerToken("BEARER TOKEN");

    DocumentSharesApi apiInstance = new DocumentSharesApi(defaultClient);
    try {
      GetUserShares result = apiInstance.getUserShares();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentSharesApi#getUserShares");
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

[**GetUserShares**](GetUserShares.md)

### Authorization

[ApiAuthorization](../README.md#ApiAuthorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

