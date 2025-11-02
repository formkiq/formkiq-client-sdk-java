# EntitiesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addEntityType**](EntitiesApi.md#addEntityType) | **POST** /entityTypes | Add New EntityType |
| [**getEntityTypes**](EntitiesApi.md#getEntityTypes) | **GET** /entityTypes | Get EntityTypes |


<a id="addEntityType"></a>
# **addEntityType**
> AddEntityTypeResponse addEntityType(addEntityTypeRequest, siteId, namespace)

Add New EntityType

Creates a Entity Type

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.EntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    EntitiesApi apiInstance = new EntitiesApi(defaultClient);
    AddEntityTypeRequest addEntityTypeRequest = new AddEntityTypeRequest(); // AddEntityTypeRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    String namespace = "namespace_example"; // String | Namespace Identifier
    try {
      AddEntityTypeResponse result = apiInstance.addEntityType(addEntityTypeRequest, siteId, namespace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitiesApi#addEntityType");
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
| **addEntityTypeRequest** | [**AddEntityTypeRequest**](AddEntityTypeRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |
| **namespace** | **String**| Namespace Identifier | [optional] |

### Return type

[**AddEntityTypeResponse**](AddEntityTypeResponse.md)

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

<a id="getEntityTypes"></a>
# **getEntityTypes**
> GetEntityTypesResponse getEntityTypes(siteId, namespace, next, limit)

Get EntityTypes

Returns a list of entity types

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.EntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    EntitiesApi apiInstance = new EntitiesApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    String namespace = "namespace_example"; // String | Namespace Identifier
    String next = "next_example"; // String | Next page of results token
    String limit = "10"; // String | Limit Results
    try {
      GetEntityTypesResponse result = apiInstance.getEntityTypes(siteId, namespace, next, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitiesApi#getEntityTypes");
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
| **namespace** | **String**| Namespace Identifier | [optional] |
| **next** | **String**| Next page of results token | [optional] |
| **limit** | **String**| Limit Results | [optional] [default to 10] |

### Return type

[**GetEntityTypesResponse**](GetEntityTypesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

