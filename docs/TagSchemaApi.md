# TagSchemaApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addTagSchema**](TagSchemaApi.md#addTagSchema) | **POST** /tagSchemas | Add tag schemas |
| [**deleteTagSchema**](TagSchemaApi.md#deleteTagSchema) | **DELETE** /tagSchemas/{tagSchemaId} | Delete tag schema |
| [**getTagSchema**](TagSchemaApi.md#getTagSchema) | **GET** /tagSchemas/{tagSchemaId} | Get tag schema |
| [**getTagSchemas**](TagSchemaApi.md#getTagSchemas) | **GET** /tagSchemas | Get tag schemas |


<a id="addTagSchema"></a>
# **addTagSchema**
> AddTagSchemaResponse addTagSchema(addTagSchemaRequest, siteId)

Add tag schemas

Creates a new TagSchema; ONLY available with FormKiQ Pro and Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.TagSchemaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    TagSchemaApi apiInstance = new TagSchemaApi(defaultClient);
    AddTagSchemaRequest addTagSchemaRequest = new AddTagSchemaRequest(); // AddTagSchemaRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      AddTagSchemaResponse result = apiInstance.addTagSchema(addTagSchemaRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagSchemaApi#addTagSchema");
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
| **addTagSchemaRequest** | [**AddTagSchemaRequest**](AddTagSchemaRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**AddTagSchemaResponse**](AddTagSchemaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 CREATED |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | 400 BAD REQUEST |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="deleteTagSchema"></a>
# **deleteTagSchema**
> deleteTagSchema(tagSchemaId, siteId)

Delete tag schema

Delete a TagSchema; ONLY available with FormKiQ Pro and Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.TagSchemaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    TagSchemaApi apiInstance = new TagSchemaApi(defaultClient);
    String tagSchemaId = "tagSchemaId_example"; // String | Tag Schema Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      apiInstance.deleteTagSchema(tagSchemaId, siteId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagSchemaApi#deleteTagSchema");
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
| **tagSchemaId** | **String**| Tag Schema Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getTagSchema"></a>
# **getTagSchema**
> GetTagSchemaResponse getTagSchema(tagSchemaId, siteId)

Get tag schema

Retrieves a TagSchema&#39;s details, i.e., metadata; ONLY available with FormKiQ Pro and Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.TagSchemaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    TagSchemaApi apiInstance = new TagSchemaApi(defaultClient);
    String tagSchemaId = "tagSchemaId_example"; // String | Tag Schema Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      GetTagSchemaResponse result = apiInstance.getTagSchema(tagSchemaId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagSchemaApi#getTagSchema");
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
| **tagSchemaId** | **String**| Tag Schema Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**GetTagSchemaResponse**](GetTagSchemaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getTagSchemas"></a>
# **getTagSchemas**
> GetTagSchemasResponse getTagSchemas(siteId, limit, next, previous)

Get tag schemas

Returns the list of tagSchemas; ONLY available with FormKiQ Pro and Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.TagSchemaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    TagSchemaApi apiInstance = new TagSchemaApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    String limit = "10"; // String | Limit Results
    String next = "next_example"; // String | Next page of results token
    String previous = "previous_example"; // String | Previous page of results token
    try {
      GetTagSchemasResponse result = apiInstance.getTagSchemas(siteId, limit, next, previous);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagSchemaApi#getTagSchemas");
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
| **previous** | **String**| Previous page of results token | [optional] |

### Return type

[**GetTagSchemasResponse**](GetTagSchemasResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

