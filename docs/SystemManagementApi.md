# SystemManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addApiKey**](SystemManagementApi.md#addApiKey) | **POST** /sites/{siteId}/apiKeys | Add API Key |
| [**deleteApiKey**](SystemManagementApi.md#deleteApiKey) | **DELETE** /sites/{siteId}/apiKeys/{apiKey} | Delete API Key |
| [**deleteOpensearchIndex**](SystemManagementApi.md#deleteOpensearchIndex) | **DELETE** /sites/{siteId}/opensearch/index | Deletst site(s) OpenSearch index |
| [**getApiKeys**](SystemManagementApi.md#getApiKeys) | **GET** /sites/{siteId}/apiKeys | Get API Keys |
| [**getConfiguration**](SystemManagementApi.md#getConfiguration) | **GET** /sites/{siteId}/configuration | Get site configuration |
| [**getOpensearchIndex**](SystemManagementApi.md#getOpensearchIndex) | **GET** /sites/{siteId}/opensearch/index | Get site(s) OpenSearch index settings |
| [**getSites**](SystemManagementApi.md#getSites) | **GET** /sites | Get site(s) access |
| [**getVersion**](SystemManagementApi.md#getVersion) | **GET** /version | Get FormKiQ version |
| [**setOpensearchIndex**](SystemManagementApi.md#setOpensearchIndex) | **PUT** /sites/{siteId}/opensearch/index | Set site(s) OpenSearch index settings |
| [**updateConfiguration**](SystemManagementApi.md#updateConfiguration) | **PATCH** /sites/{siteId}/configuration | Update site configuration |


<a id="addApiKey"></a>
# **addApiKey**
> AddApiKeyResponse addApiKey(siteId, addApiKeyRequest)

Add API Key

Adds a new API Key

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.SystemManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    SystemManagementApi apiInstance = new SystemManagementApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    AddApiKeyRequest addApiKeyRequest = new AddApiKeyRequest(); // AddApiKeyRequest | 
    try {
      AddApiKeyResponse result = apiInstance.addApiKey(siteId, addApiKeyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#addApiKey");
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
| **addApiKeyRequest** | [**AddApiKeyRequest**](AddApiKeyRequest.md)|  | |

### Return type

[**AddApiKeyResponse**](AddApiKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="deleteApiKey"></a>
# **deleteApiKey**
> DeleteApiKeyResponse deleteApiKey(siteId, apiKey)

Delete API Key

Adds a new API Key

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.SystemManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    SystemManagementApi apiInstance = new SystemManagementApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    String apiKey = "apiKey_example"; // String | API Key
    try {
      DeleteApiKeyResponse result = apiInstance.deleteApiKey(siteId, apiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#deleteApiKey");
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
| **apiKey** | **String**| API Key | |

### Return type

[**DeleteApiKeyResponse**](DeleteApiKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="deleteOpensearchIndex"></a>
# **deleteOpensearchIndex**
> DeleteOpenSearchIndexResponse deleteOpensearchIndex(siteId)

Deletst site(s) OpenSearch index

Deletes the OpenSearch index

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.SystemManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    SystemManagementApi apiInstance = new SystemManagementApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      DeleteOpenSearchIndexResponse result = apiInstance.deleteOpensearchIndex(siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#deleteOpensearchIndex");
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

[**DeleteOpenSearchIndexResponse**](DeleteOpenSearchIndexResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getApiKeys"></a>
# **getApiKeys**
> GetApiKeysResponse getApiKeys(siteId)

Get API Keys

Returns the list of ApiKeys

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.SystemManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    SystemManagementApi apiInstance = new SystemManagementApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      GetApiKeysResponse result = apiInstance.getApiKeys(siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#getApiKeys");
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

[**GetApiKeysResponse**](GetApiKeysResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getConfiguration"></a>
# **getConfiguration**
> GetConfigurationResponse getConfiguration(siteId)

Get site configuration

Returns the list of sites that the user has access to

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.SystemManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    SystemManagementApi apiInstance = new SystemManagementApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      GetConfigurationResponse result = apiInstance.getConfiguration(siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#getConfiguration");
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

[**GetConfigurationResponse**](GetConfigurationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getOpensearchIndex"></a>
# **getOpensearchIndex**
> GetOpenSearchIndexResponse getOpensearchIndex(siteId)

Get site(s) OpenSearch index settings

Returns the OpenSearch index settings

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.SystemManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    SystemManagementApi apiInstance = new SystemManagementApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      GetOpenSearchIndexResponse result = apiInstance.getOpensearchIndex(siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#getOpensearchIndex");
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

[**GetOpenSearchIndexResponse**](GetOpenSearchIndexResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getSites"></a>
# **getSites**
> GetSitesResponse getSites()

Get site(s) access

Returns the list of sites that the user has access to

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.SystemManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    SystemManagementApi apiInstance = new SystemManagementApi(defaultClient);
    try {
      GetSitesResponse result = apiInstance.getSites();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#getSites");
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

[**GetSitesResponse**](GetSitesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getVersion"></a>
# **getVersion**
> GetVersionResponse getVersion()

Get FormKiQ version

Return the version of FormKiQ

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.SystemManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    SystemManagementApi apiInstance = new SystemManagementApi(defaultClient);
    try {
      GetVersionResponse result = apiInstance.getVersion();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#getVersion");
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

[**GetVersionResponse**](GetVersionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="setOpensearchIndex"></a>
# **setOpensearchIndex**
> SetOpenSearchIndexResponse setOpensearchIndex(siteId, setOpenSearchIndexRequest)

Set site(s) OpenSearch index settings

Sets the OpenSearch index settings

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.SystemManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    SystemManagementApi apiInstance = new SystemManagementApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    SetOpenSearchIndexRequest setOpenSearchIndexRequest = new SetOpenSearchIndexRequest(); // SetOpenSearchIndexRequest | 
    try {
      SetOpenSearchIndexResponse result = apiInstance.setOpensearchIndex(siteId, setOpenSearchIndexRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#setOpensearchIndex");
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
| **setOpenSearchIndexRequest** | [**SetOpenSearchIndexRequest**](SetOpenSearchIndexRequest.md)|  | |

### Return type

[**SetOpenSearchIndexResponse**](SetOpenSearchIndexResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="updateConfiguration"></a>
# **updateConfiguration**
> UpdateConfigurationResponse updateConfiguration(siteId, updateConfigurationRequest)

Update site configuration

Update the System Management configuration

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.SystemManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    SystemManagementApi apiInstance = new SystemManagementApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    UpdateConfigurationRequest updateConfigurationRequest = new UpdateConfigurationRequest(); // UpdateConfigurationRequest | 
    try {
      UpdateConfigurationResponse result = apiInstance.updateConfiguration(siteId, updateConfigurationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#updateConfiguration");
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
| **updateConfigurationRequest** | [**UpdateConfigurationRequest**](UpdateConfigurationRequest.md)|  | |

### Return type

[**UpdateConfigurationResponse**](UpdateConfigurationResponse.md)

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

