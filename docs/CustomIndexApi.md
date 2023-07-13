# CustomIndexApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteIndex**](CustomIndexApi.md#deleteIndex) | **DELETE** /indices/{indexType}/{indexKey} |  |
| [**indexFolderMove**](CustomIndexApi.md#indexFolderMove) | **POST** /indices/{indexType}/move |  |
| [**indexSearch**](CustomIndexApi.md#indexSearch) | **POST** /indices/search |  |


<a id="deleteIndex"></a>
# **deleteIndex**
> deleteIndex(indexKey, indexType, siteId)



Perform a delete on the Folder Index

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.CustomIndexApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: ApiAuthorization
    HttpBearerAuth ApiAuthorization = (HttpBearerAuth) defaultClient.getAuthentication("ApiAuthorization");
    ApiAuthorization.setBearerToken("BEARER TOKEN");

    CustomIndexApi apiInstance = new CustomIndexApi(defaultClient);
    String indexKey = "indexKey_example"; // String | Index Key Identifier
    String indexType = "indexType_example"; // String | Index Type
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      apiInstance.deleteIndex(indexKey, indexType, siteId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomIndexApi#deleteIndex");
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
| **indexType** | **String**| Index Type | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

null (empty response body)

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

<a id="indexFolderMove"></a>
# **indexFolderMove**
> IndexFolderMoveResponse indexFolderMove(indexType, indexFolderMoveRequest, siteId)



Perform an Folder Index Move

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.CustomIndexApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: ApiAuthorization
    HttpBearerAuth ApiAuthorization = (HttpBearerAuth) defaultClient.getAuthentication("ApiAuthorization");
    ApiAuthorization.setBearerToken("BEARER TOKEN");

    CustomIndexApi apiInstance = new CustomIndexApi(defaultClient);
    String indexType = "indexType_example"; // String | Index Type
    IndexFolderMoveRequest indexFolderMoveRequest = new IndexFolderMoveRequest(); // IndexFolderMoveRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      IndexFolderMoveResponse result = apiInstance.indexFolderMove(indexType, indexFolderMoveRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomIndexApi#indexFolderMove");
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
| **indexType** | **String**| Index Type | |
| **indexFolderMoveRequest** | [**IndexFolderMoveRequest**](IndexFolderMoveRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**IndexFolderMoveResponse**](IndexFolderMoveResponse.md)

### Authorization

[ApiAuthorization](../README.md#ApiAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | 400 OK |  -  |

<a id="indexSearch"></a>
# **indexSearch**
> IndexSearchResponse indexSearch(indexSearchRequest, siteId, limit, next, previous)



Perform a search on a index; this is currently available for both folder and tag indices

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.CustomIndexApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: ApiAuthorization
    HttpBearerAuth ApiAuthorization = (HttpBearerAuth) defaultClient.getAuthentication("ApiAuthorization");
    ApiAuthorization.setBearerToken("BEARER TOKEN");

    CustomIndexApi apiInstance = new CustomIndexApi(defaultClient);
    IndexSearchRequest indexSearchRequest = new IndexSearchRequest(); // IndexSearchRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    String limit = "10"; // String | Limit Results
    String next = "next_example"; // String | Next page of results token
    String previous = "previous_example"; // String | Previous page of results token
    try {
      IndexSearchResponse result = apiInstance.indexSearch(indexSearchRequest, siteId, limit, next, previous);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomIndexApi#indexSearch");
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
| **indexSearchRequest** | [**IndexSearchRequest**](IndexSearchRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |
| **limit** | **String**| Limit Results | [optional] [default to 10] |
| **next** | **String**| Next page of results token | [optional] |
| **previous** | **String**| Previous page of results token | [optional] |

### Return type

[**IndexSearchResponse**](IndexSearchResponse.md)

### Authorization

[ApiAuthorization](../README.md#ApiAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | 400 OK |  -  |
