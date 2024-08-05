# SchemasApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addClassification**](SchemasApi.md#addClassification) | **POST** /sites/{siteId}/classifications | Add Classification |
| [**deleteClassification**](SchemasApi.md#deleteClassification) | **DELETE** /sites/{siteId}/classifications/{classificationId} | Delete Classification |
| [**getClassification**](SchemasApi.md#getClassification) | **GET** /sites/{siteId}/classifications/{classificationId} | Get Classification |
| [**getClassificationAttributeAllowedValues**](SchemasApi.md#getClassificationAttributeAllowedValues) | **GET** /sites/{siteId}/classifications/{classificationId}/attributes/{key}/allowedValues | Get Classification&#39;s Attribute Allowed Values |
| [**getSitesClassifications**](SchemasApi.md#getSitesClassifications) | **GET** /sites/{siteId}/classifications | Get Sites Classifications |
| [**getSitesSchema**](SchemasApi.md#getSitesSchema) | **GET** /sites/{siteId}/schema/document | Get Sites Schema |
| [**getSitesSchemaAttributeAllowedValues**](SchemasApi.md#getSitesSchemaAttributeAllowedValues) | **GET** /sites/{siteId}/schema/document/attributes/{key}/allowedValues | Get Attribute Allowed Values |
| [**setClassification**](SchemasApi.md#setClassification) | **PUT** /sites/{siteId}/classifications/{classificationId} | Set Classification |
| [**setSitesSchema**](SchemasApi.md#setSitesSchema) | **PUT** /sites/{siteId}/schema/document | Set Sites Schema |


<a id="addClassification"></a>
# **addClassification**
> AddClassificationResponse addClassification(siteId, addClassificationRequest)

Add Classification

Add Classification

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.SchemasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    SchemasApi apiInstance = new SchemasApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    AddClassificationRequest addClassificationRequest = new AddClassificationRequest(); // AddClassificationRequest | 
    try {
      AddClassificationResponse result = apiInstance.addClassification(siteId, addClassificationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchemasApi#addClassification");
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
| **addClassificationRequest** | [**AddClassificationRequest**](AddClassificationRequest.md)|  | |

### Return type

[**AddClassificationResponse**](AddClassificationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | 400 OK |  -  |

<a id="deleteClassification"></a>
# **deleteClassification**
> DeleteResponse deleteClassification(siteId, classificationId)

Delete Classification

Delete Classification

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.SchemasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    SchemasApi apiInstance = new SchemasApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    String classificationId = "classificationId_example"; // String | Classification Identifier
    try {
      DeleteResponse result = apiInstance.deleteClassification(siteId, classificationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchemasApi#deleteClassification");
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

<a id="getClassification"></a>
# **getClassification**
> GetClassificationResponse getClassification(siteId, classificationId)

Get Classification

Get Classification

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.SchemasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    SchemasApi apiInstance = new SchemasApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    String classificationId = "classificationId_example"; // String | Classification Identifier
    try {
      GetClassificationResponse result = apiInstance.getClassification(siteId, classificationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchemasApi#getClassification");
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

### Return type

[**GetClassificationResponse**](GetClassificationResponse.md)

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
import com.formkiq.client.api.SchemasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    SchemasApi apiInstance = new SchemasApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    String classificationId = "classificationId_example"; // String | Classification Identifier
    String key = "key_example"; // String | Key Identifier
    try {
      GetAttributeAllowedValuesResponse result = apiInstance.getClassificationAttributeAllowedValues(siteId, classificationId, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchemasApi#getClassificationAttributeAllowedValues");
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

<a id="getSitesClassifications"></a>
# **getSitesClassifications**
> GetClassificationsResponse getSitesClassifications(siteId, limit, next)

Get Sites Classifications

Gets Sites Classifications

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.SchemasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    SchemasApi apiInstance = new SchemasApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    String limit = "10"; // String | Limit Results
    String next = "next_example"; // String | Next page of results token
    try {
      GetClassificationsResponse result = apiInstance.getSitesClassifications(siteId, limit, next);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchemasApi#getSitesClassifications");
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
| **limit** | **String**| Limit Results | [optional] [default to 10] |
| **next** | **String**| Next page of results token | [optional] |

### Return type

[**GetClassificationsResponse**](GetClassificationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getSitesSchema"></a>
# **getSitesSchema**
> GetSitesSchemaResponse getSitesSchema(siteId)

Get Sites Schema

Gets Sites schema

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.SchemasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    SchemasApi apiInstance = new SchemasApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      GetSitesSchemaResponse result = apiInstance.getSitesSchema(siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchemasApi#getSitesSchema");
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

### Return type

[**GetSitesSchemaResponse**](GetSitesSchemaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getSitesSchemaAttributeAllowedValues"></a>
# **getSitesSchemaAttributeAllowedValues**
> GetAttributeAllowedValuesResponse getSitesSchemaAttributeAllowedValues(siteId, key)

Get Attribute Allowed Values

Returns an attribute&#39;s allowed values from the site schema

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.SchemasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    SchemasApi apiInstance = new SchemasApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    String key = "key_example"; // String | Key Identifier
    try {
      GetAttributeAllowedValuesResponse result = apiInstance.getSitesSchemaAttributeAllowedValues(siteId, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchemasApi#getSitesSchemaAttributeAllowedValues");
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

<a id="setClassification"></a>
# **setClassification**
> SetResponse setClassification(siteId, classificationId, setClassificationRequest)

Set Classification

Sets Classification

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.SchemasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    SchemasApi apiInstance = new SchemasApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    String classificationId = "classificationId_example"; // String | Classification Identifier
    SetClassificationRequest setClassificationRequest = new SetClassificationRequest(); // SetClassificationRequest | 
    try {
      SetResponse result = apiInstance.setClassification(siteId, classificationId, setClassificationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchemasApi#setClassification");
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
| **setClassificationRequest** | [**SetClassificationRequest**](SetClassificationRequest.md)|  | |

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
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | 400 OK |  -  |

<a id="setSitesSchema"></a>
# **setSitesSchema**
> SetResponse setSitesSchema(siteId, setSitesSchemaRequest)

Set Sites Schema

Sets Sites schema

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.SchemasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    SchemasApi apiInstance = new SchemasApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    SetSitesSchemaRequest setSitesSchemaRequest = new SetSitesSchemaRequest(); // SetSitesSchemaRequest | 
    try {
      SetResponse result = apiInstance.setSitesSchema(siteId, setSitesSchemaRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchemasApi#setSitesSchema");
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
| **setSitesSchemaRequest** | [**SetSitesSchemaRequest**](SetSitesSchemaRequest.md)|  | |

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
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | 400 OK |  -  |

