# AccessControlApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDocumentAccessAttributes**](AccessControlApi.md#addDocumentAccessAttributes) | **POST** /documents/{documentId}/accessAttributes | Add document access attributes |
| [**deleteDocumentAccessAttributes**](AccessControlApi.md#deleteDocumentAccessAttributes) | **DELETE** /documents/{documentId}/accessAttributes | Delete document&#39;s access attributes |
| [**deleteOpaConfiguration**](AccessControlApi.md#deleteOpaConfiguration) | **DELETE** /sites/{siteId}/opa/accessPolicy | Delete OPA Configuration |
| [**getDocumentAccessAttributes**](AccessControlApi.md#getDocumentAccessAttributes) | **GET** /documents/{documentId}/accessAttributes | Get document access attributes |
| [**getOpaConfiguration**](AccessControlApi.md#getOpaConfiguration) | **GET** /sites/{siteId}/opa/accessPolicy | Get OPA Configuration |
| [**getOpaConfigurations**](AccessControlApi.md#getOpaConfigurations) | **GET** /sites/opa/accessPolicies | Get OPAs Configuration |
| [**setDocumentAccessAttributes**](AccessControlApi.md#setDocumentAccessAttributes) | **PUT** /documents/{documentId}/accessAttributes | Set document access attributes |
| [**setOpaConfiguration**](AccessControlApi.md#setOpaConfiguration) | **PUT** /sites/opa/accessPolicies | Set OPA Configuration |


<a id="addDocumentAccessAttributes"></a>
# **addDocumentAccessAttributes**
> AddDocumentAccessAttributesResponse addDocumentAccessAttributes(documentId, addDocumentAccessAttributesRequest, siteId)

Add document access attributes

Add a document&#39;s access attributes (only \&quot;admin\&quot; role can call API)

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.AccessControlApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    AccessControlApi apiInstance = new AccessControlApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    AddDocumentAccessAttributesRequest addDocumentAccessAttributesRequest = new AddDocumentAccessAttributesRequest(); // AddDocumentAccessAttributesRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      AddDocumentAccessAttributesResponse result = apiInstance.addDocumentAccessAttributes(documentId, addDocumentAccessAttributesRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessControlApi#addDocumentAccessAttributes");
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
| **documentId** | **String**| Document Identifier | |
| **addDocumentAccessAttributesRequest** | [**AddDocumentAccessAttributesRequest**](AddDocumentAccessAttributesRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**AddDocumentAccessAttributesResponse**](AddDocumentAccessAttributesResponse.md)

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

<a id="deleteDocumentAccessAttributes"></a>
# **deleteDocumentAccessAttributes**
> DeleteDocumentAccessAttributesResponse deleteDocumentAccessAttributes(documentId, siteId)

Delete document&#39;s access attributes

Delete a document&#39;s access attributes

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.AccessControlApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    AccessControlApi apiInstance = new AccessControlApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      DeleteDocumentAccessAttributesResponse result = apiInstance.deleteDocumentAccessAttributes(documentId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessControlApi#deleteDocumentAccessAttributes");
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
| **documentId** | **String**| Document Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**DeleteDocumentAccessAttributesResponse**](DeleteDocumentAccessAttributesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="deleteOpaConfiguration"></a>
# **deleteOpaConfiguration**
> DeleteOpaConfigurationResponse deleteOpaConfiguration(siteId)

Delete OPA Configuration

Delete OPA Configuration

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.AccessControlApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    AccessControlApi apiInstance = new AccessControlApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      DeleteOpaConfigurationResponse result = apiInstance.deleteOpaConfiguration(siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessControlApi#deleteOpaConfiguration");
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

[**DeleteOpaConfigurationResponse**](DeleteOpaConfigurationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getDocumentAccessAttributes"></a>
# **getDocumentAccessAttributes**
> GetDocumentAccessAttributesResponse getDocumentAccessAttributes(documentId, siteId)

Get document access attributes

Retrieves a document&#39;s access attributes (only \&quot;admin\&quot; role can call API)

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.AccessControlApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    AccessControlApi apiInstance = new AccessControlApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      GetDocumentAccessAttributesResponse result = apiInstance.getDocumentAccessAttributes(documentId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessControlApi#getDocumentAccessAttributes");
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
| **documentId** | **String**| Document Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**GetDocumentAccessAttributesResponse**](GetDocumentAccessAttributesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getOpaConfiguration"></a>
# **getOpaConfiguration**
> GetOpaConfigurationResponse getOpaConfiguration(siteId)

Get OPA Configuration

Returns OPA Configuration, can only be requested with ADMIN privileges

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.AccessControlApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    AccessControlApi apiInstance = new AccessControlApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      GetOpaConfigurationResponse result = apiInstance.getOpaConfiguration(siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessControlApi#getOpaConfiguration");
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

[**GetOpaConfigurationResponse**](GetOpaConfigurationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getOpaConfigurations"></a>
# **getOpaConfigurations**
> GetOpaConfigurationsResponse getOpaConfigurations()

Get OPAs Configuration

Returns a list of OPA Configuration, can only be requested with ADMIN privileges

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.AccessControlApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    AccessControlApi apiInstance = new AccessControlApi(defaultClient);
    try {
      GetOpaConfigurationsResponse result = apiInstance.getOpaConfigurations();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessControlApi#getOpaConfigurations");
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

[**GetOpaConfigurationsResponse**](GetOpaConfigurationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="setDocumentAccessAttributes"></a>
# **setDocumentAccessAttributes**
> SetDocumentAccessAttributesResponse setDocumentAccessAttributes(documentId, setDocumentAccessAttributesRequest, siteId)

Set document access attributes

Set a document&#39;s access attributes (only \&quot;admin\&quot; role can call API)

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.AccessControlApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    AccessControlApi apiInstance = new AccessControlApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    SetDocumentAccessAttributesRequest setDocumentAccessAttributesRequest = new SetDocumentAccessAttributesRequest(); // SetDocumentAccessAttributesRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      SetDocumentAccessAttributesResponse result = apiInstance.setDocumentAccessAttributes(documentId, setDocumentAccessAttributesRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessControlApi#setDocumentAccessAttributes");
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
| **documentId** | **String**| Document Identifier | |
| **setDocumentAccessAttributesRequest** | [**SetDocumentAccessAttributesRequest**](SetDocumentAccessAttributesRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**SetDocumentAccessAttributesResponse**](SetDocumentAccessAttributesResponse.md)

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

<a id="setOpaConfiguration"></a>
# **setOpaConfiguration**
> SetOpaConfigurationResponse setOpaConfiguration(setOpaConfigurationRequest)

Set OPA Configuration

Set OPA Configuration, can only be requested with ADMIN privileges

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.AccessControlApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    AccessControlApi apiInstance = new AccessControlApi(defaultClient);
    SetOpaConfigurationRequest setOpaConfigurationRequest = new SetOpaConfigurationRequest(); // SetOpaConfigurationRequest | 
    try {
      SetOpaConfigurationResponse result = apiInstance.setOpaConfiguration(setOpaConfigurationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessControlApi#setOpaConfiguration");
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
| **setOpaConfigurationRequest** | [**SetOpaConfigurationRequest**](SetOpaConfigurationRequest.md)|  | |

### Return type

[**SetOpaConfigurationResponse**](SetOpaConfigurationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

