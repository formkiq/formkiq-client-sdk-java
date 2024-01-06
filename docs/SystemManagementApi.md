# SystemManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addApiKey**](SystemManagementApi.md#addApiKey) | **POST** /configuration/apiKeys | Add API Key |
| [**deleteApiKey**](SystemManagementApi.md#deleteApiKey) | **DELETE** /configuration/apiKeys/{apiKey} | Delete API Key |
| [**getApiKeys**](SystemManagementApi.md#getApiKeys) | **GET** /configuration/apiKeys | Get API Keys |
| [**getConfiguration**](SystemManagementApi.md#getConfiguration) | **GET** /configuration | Get site configuration |
| [**getSites**](SystemManagementApi.md#getSites) | **GET** /sites | Get site(s) access |
| [**getVersion**](SystemManagementApi.md#getVersion) | **GET** /version | Get FormKiQ version |
| [**updateConfiguration**](SystemManagementApi.md#updateConfiguration) | **PATCH** /configuration | Update site configuration |


<a id="addApiKey"></a>
# **addApiKey**
> AddApiKeyResponse addApiKey(addApiKeyRequest, siteId)

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
    AddApiKeyRequest addApiKeyRequest = new AddApiKeyRequest(); // AddApiKeyRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      AddApiKeyResponse result = apiInstance.addApiKey(addApiKeyRequest, siteId);
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
| **addApiKeyRequest** | [**AddApiKeyRequest**](AddApiKeyRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

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
> DeleteApiKeyResponse deleteApiKey(apiKey, siteId)

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
    String apiKey = "apiKey_example"; // String | API Key
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      DeleteApiKeyResponse result = apiInstance.deleteApiKey(apiKey, siteId);
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
| **apiKey** | **String**| API Key | |
| **siteId** | **String**| Site Identifier | [optional] |

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
| **siteId** | **String**| Site Identifier | [optional] |

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
| **siteId** | **String**| Site Identifier | [optional] |

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

<a id="updateConfiguration"></a>
# **updateConfiguration**
> UpdateConfigurationResponse updateConfiguration(updateConfigurationRequest, siteId)

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
    UpdateConfigurationRequest updateConfigurationRequest = new UpdateConfigurationRequest(); // UpdateConfigurationRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      UpdateConfigurationResponse result = apiInstance.updateConfiguration(updateConfigurationRequest, siteId);
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
| **updateConfigurationRequest** | [**UpdateConfigurationRequest**](UpdateConfigurationRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

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

