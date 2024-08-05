# AttributesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addAttribute**](AttributesApi.md#addAttribute) | **POST** /attributes | Add new attribute |
| [**deleteAttribute**](AttributesApi.md#deleteAttribute) | **DELETE** /attributes/{key} | Delete attribute |
| [**getAttribute**](AttributesApi.md#getAttribute) | **GET** /attributes/{key} | Get Attribute |
| [**getAttributeAllowedValues**](AttributesApi.md#getAttributeAllowedValues) | **GET** /attributes/{key}/allowedValues | Get Attribute Allowed Values |
| [**getAttributes**](AttributesApi.md#getAttributes) | **GET** /attributes | Get Attributes listing |
| [**getClassificationAttributeAllowedValues**](AttributesApi.md#getClassificationAttributeAllowedValues) | **GET** /sites/{siteId}/classifications/{classificationId}/attributes/{key}/allowedValues | Get Classification&#39;s Attribute Allowed Values |


<a id="addAttribute"></a>
# **addAttribute**
> AddAttributeResponse addAttribute(addAttributeRequest, siteId)

Add new attribute

Creates a new attribute

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.AttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    AttributesApi apiInstance = new AttributesApi(defaultClient);
    AddAttributeRequest addAttributeRequest = new AddAttributeRequest(); // AddAttributeRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      AddAttributeResponse result = apiInstance.addAttribute(addAttributeRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttributesApi#addAttribute");
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
| **addAttributeRequest** | [**AddAttributeRequest**](AddAttributeRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**AddAttributeResponse**](AddAttributeResponse.md)

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

<a id="deleteAttribute"></a>
# **deleteAttribute**
> DeleteResponse deleteAttribute(key, siteId)

Delete attribute

Delete a attribute

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.AttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    AttributesApi apiInstance = new AttributesApi(defaultClient);
    String key = "key_example"; // String | Key Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      DeleteResponse result = apiInstance.deleteAttribute(key, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttributesApi#deleteAttribute");
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
| **key** | **String**| Key Identifier | |
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
| **400** | 400 OK |  -  |

<a id="getAttribute"></a>
# **getAttribute**
> GetAttributeResponse getAttribute(key, siteId)

Get Attribute

Returns a attribute

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.AttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    AttributesApi apiInstance = new AttributesApi(defaultClient);
    String key = "key_example"; // String | Key Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      GetAttributeResponse result = apiInstance.getAttribute(key, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttributesApi#getAttribute");
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
| **key** | **String**| Key Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**GetAttributeResponse**](GetAttributeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getAttributeAllowedValues"></a>
# **getAttributeAllowedValues**
> GetAttributeAllowedValuesResponse getAttributeAllowedValues(key, siteId)

Get Attribute Allowed Values

Returns an attribute&#39;s allowed values that spans across all classifications and site schema

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.AttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    AttributesApi apiInstance = new AttributesApi(defaultClient);
    String key = "key_example"; // String | Key Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      GetAttributeAllowedValuesResponse result = apiInstance.getAttributeAllowedValues(key, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttributesApi#getAttributeAllowedValues");
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
| **key** | **String**| Key Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**GetAttributeAllowedValuesResponse**](GetAttributeAllowedValuesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getAttributes"></a>
# **getAttributes**
> GetAttributesResponse getAttributes(siteId, next, limit)

Get Attributes listing

Returns a list of attributes

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.AttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    AttributesApi apiInstance = new AttributesApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    String next = "next_example"; // String | Next page of results token
    String limit = "10"; // String | Limit Results
    try {
      GetAttributesResponse result = apiInstance.getAttributes(siteId, next, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttributesApi#getAttributes");
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
| **next** | **String**| Next page of results token | [optional] |
| **limit** | **String**| Limit Results | [optional] [default to 10] |

### Return type

[**GetAttributesResponse**](GetAttributesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getClassificationAttributeAllowedValues"></a>
# **getClassificationAttributeAllowedValues**
> GetAttributeAllowedValuesResponse getClassificationAttributeAllowedValues(siteId, classificationId, key)

Get Classification&#39;s Attribute Allowed Values

Returns an attribute&#39;s allowed values that spans for a specific classifications and site schema

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.AttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    AttributesApi apiInstance = new AttributesApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    String classificationId = "classificationId_example"; // String | Classification Identifier
    String key = "key_example"; // String | Key Identifier
    try {
      GetAttributeAllowedValuesResponse result = apiInstance.getClassificationAttributeAllowedValues(siteId, classificationId, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttributesApi#getClassificationAttributeAllowedValues");
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
| **siteId** | **String**| Site Identifier | |
| **classificationId** | **String**| Classification Identifier | |
| **key** | **String**| Key Identifier | |

### Return type

[**GetAttributeAllowedValuesResponse**](GetAttributeAllowedValuesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

