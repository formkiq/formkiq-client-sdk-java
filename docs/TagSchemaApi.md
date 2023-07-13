# TagSchemaApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addTagSchema**](TagSchemaApi.md#addTagSchema) | **POST** /tagSchemas |  |
| [**deleteTagSchema**](TagSchemaApi.md#deleteTagSchema) | **DELETE** /tagSchemas/{tagSchemaId} |  |
| [**getTagSchema**](TagSchemaApi.md#getTagSchema) | **GET** /tagSchemas/{tagSchemaId} |  |
| [**getTagSchemas**](TagSchemaApi.md#getTagSchemas) | **GET** /tagSchemas |  |


<a id="addTagSchema"></a>
# **addTagSchema**
> TagSchemaPostResponse addTagSchema(addTagSchemaRequest, siteId)



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
    
    // Configure HTTP bearer authorization: ApiAuthorization
    HttpBearerAuth ApiAuthorization = (HttpBearerAuth) defaultClient.getAuthentication("ApiAuthorization");
    ApiAuthorization.setBearerToken("BEARER TOKEN");

    TagSchemaApi apiInstance = new TagSchemaApi(defaultClient);
    AddTagSchemaRequest addTagSchemaRequest = new AddTagSchemaRequest(); // AddTagSchemaRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      TagSchemaPostResponse result = apiInstance.addTagSchema(addTagSchemaRequest, siteId);
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

[**TagSchemaPostResponse**](TagSchemaPostResponse.md)

### Authorization

[ApiAuthorization](../README.md#ApiAuthorization)

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
    
    // Configure HTTP bearer authorization: ApiAuthorization
    HttpBearerAuth ApiAuthorization = (HttpBearerAuth) defaultClient.getAuthentication("ApiAuthorization");
    ApiAuthorization.setBearerToken("BEARER TOKEN");

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

[ApiAuthorization](../README.md#ApiAuthorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getTagSchema"></a>
# **getTagSchema**
> GetTagSchemaRequest getTagSchema(tagSchemaId, siteId)



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
    
    // Configure HTTP bearer authorization: ApiAuthorization
    HttpBearerAuth ApiAuthorization = (HttpBearerAuth) defaultClient.getAuthentication("ApiAuthorization");
    ApiAuthorization.setBearerToken("BEARER TOKEN");

    TagSchemaApi apiInstance = new TagSchemaApi(defaultClient);
    String tagSchemaId = "tagSchemaId_example"; // String | Tag Schema Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      GetTagSchemaRequest result = apiInstance.getTagSchema(tagSchemaId, siteId);
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

[**GetTagSchemaRequest**](GetTagSchemaRequest.md)

### Authorization

[ApiAuthorization](../README.md#ApiAuthorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getTagSchemas"></a>
# **getTagSchemas**
> GetTagSchemasRequest getTagSchemas(siteId, limit, next, previous)



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
    
    // Configure HTTP bearer authorization: ApiAuthorization
    HttpBearerAuth ApiAuthorization = (HttpBearerAuth) defaultClient.getAuthentication("ApiAuthorization");
    ApiAuthorization.setBearerToken("BEARER TOKEN");

    TagSchemaApi apiInstance = new TagSchemaApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    String limit = "10"; // String | Limit Results
    String next = "next_example"; // String | Next page of results token
    String previous = "previous_example"; // String | Previous page of results token
    try {
      GetTagSchemasRequest result = apiInstance.getTagSchemas(siteId, limit, next, previous);
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

[**GetTagSchemasRequest**](GetTagSchemasRequest.md)

### Authorization

[ApiAuthorization](../README.md#ApiAuthorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
