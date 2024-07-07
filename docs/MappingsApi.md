# MappingsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addMapping**](MappingsApi.md#addMapping) | **POST** /mappings | Add New Mapping |
| [**deleteMapping**](MappingsApi.md#deleteMapping) | **DELETE** /mappings/{mappingId} | Delete Mapping |
| [**getMapping**](MappingsApi.md#getMapping) | **GET** /mappings/{mappingId} | Get Mapping |
| [**getMappings**](MappingsApi.md#getMappings) | **GET** /mappings | Get Mappings |
| [**setMapping**](MappingsApi.md#setMapping) | **PUT** /mappings/{mappingId} | Set Mapping |


<a id="addMapping"></a>
# **addMapping**
> AddMappingResponse addMapping(addMappingRequest, siteId)

Add New Mapping

Creates a new mapping; ONLY available with FormKiQ Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.MappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    MappingsApi apiInstance = new MappingsApi(defaultClient);
    AddMappingRequest addMappingRequest = new AddMappingRequest(); // AddMappingRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      AddMappingResponse result = apiInstance.addMapping(addMappingRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MappingsApi#addMapping");
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
| **addMappingRequest** | [**AddMappingRequest**](AddMappingRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**AddMappingResponse**](AddMappingResponse.md)

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

<a id="deleteMapping"></a>
# **deleteMapping**
> DeleteResponse deleteMapping(mappingId, siteId)

Delete Mapping

Delete Mapping; ONLY available with FormKiQ Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.MappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    MappingsApi apiInstance = new MappingsApi(defaultClient);
    String mappingId = "mappingId_example"; // String | Mapping Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      DeleteResponse result = apiInstance.deleteMapping(mappingId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MappingsApi#deleteMapping");
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
| **mappingId** | **String**| Mapping Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**DeleteResponse**](DeleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getMapping"></a>
# **getMapping**
> GetMappingResponse getMapping(mappingId, siteId)

Get Mapping

Get a mapping; ONLY available with FormKiQ Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.MappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    MappingsApi apiInstance = new MappingsApi(defaultClient);
    String mappingId = "mappingId_example"; // String | Mapping Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      GetMappingResponse result = apiInstance.getMapping(mappingId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MappingsApi#getMapping");
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
| **mappingId** | **String**| Mapping Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**GetMappingResponse**](GetMappingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getMappings"></a>
# **getMappings**
> GetMappingsResponse getMappings(siteId, limit, next)

Get Mappings

Returns a list of mappings; ONLY available with FormKiQ Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.MappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    MappingsApi apiInstance = new MappingsApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    String limit = "10"; // String | Limit Results
    String next = "next_example"; // String | Next page of results token
    try {
      GetMappingsResponse result = apiInstance.getMappings(siteId, limit, next);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MappingsApi#getMappings");
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
| **limit** | **String**| Limit Results | [optional] [default to 10] |
| **next** | **String**| Next page of results token | [optional] |

### Return type

[**GetMappingsResponse**](GetMappingsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="setMapping"></a>
# **setMapping**
> SetResponse setMapping(mappingId, setMappingRequest, siteId)

Set Mapping

Sets an mapping; ONLY available with FormKiQ Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.MappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    MappingsApi apiInstance = new MappingsApi(defaultClient);
    String mappingId = "mappingId_example"; // String | Mapping Identifier
    SetMappingRequest setMappingRequest = new SetMappingRequest(); // SetMappingRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      SetResponse result = apiInstance.setMapping(mappingId, setMappingRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MappingsApi#setMapping");
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
| **mappingId** | **String**| Mapping Identifier | |
| **setMappingRequest** | [**SetMappingRequest**](SetMappingRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**SetResponse**](SetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 CREATED |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | 400 OK |  -  |

