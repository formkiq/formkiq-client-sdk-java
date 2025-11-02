# SystemManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addApiKey**](SystemManagementApi.md#addApiKey) | **POST** /sites/{siteId}/apiKeys | Add API Key |
| [**addLocale**](SystemManagementApi.md#addLocale) | **POST** /sites/{siteId}/locales | Add Locale |
| [**addLocaleResourceItem**](SystemManagementApi.md#addLocaleResourceItem) | **POST** /sites/{siteId}/locales/{locale}/resourceItems | Add Locale Resource Item |
| [**addOpenSearchRestoreSnapshot**](SystemManagementApi.md#addOpenSearchRestoreSnapshot) | **POST** /sites/{siteId}/opensearch/snapshots/{snapshotName}/restore | Add an OpenSearch Restore Snapshot |
| [**addOpenSearchSnapshot**](SystemManagementApi.md#addOpenSearchSnapshot) | **POST** /sites/{siteId}/opensearch/snapshots/{snapshotName} | Add an OpenSearch Snapshot |
| [**addSite**](SystemManagementApi.md#addSite) | **POST** /sites | Add Site |
| [**deleteApiKey**](SystemManagementApi.md#deleteApiKey) | **DELETE** /sites/{siteId}/apiKeys/{apiKey} | Delete API Key |
| [**deleteLocale**](SystemManagementApi.md#deleteLocale) | **DELETE** /sites/{siteId}/locales/{locale} | Delete Locale |
| [**deleteLocaleResourceItem**](SystemManagementApi.md#deleteLocaleResourceItem) | **DELETE** /sites/{siteId}/locales/{locale}/resourceItems/{itemKey} | Delete Local Resource Item |
| [**deleteOpenSearchIndex**](SystemManagementApi.md#deleteOpenSearchIndex) | **DELETE** /sites/{siteId}/opensearch/index | Deletes site(s) OpenSearch index |
| [**deleteOpenSearchIndexByName**](SystemManagementApi.md#deleteOpenSearchIndexByName) | **DELETE** /sites/global/opensearch/indices/{indexName} | Deletes OpenSearch index by name |
| [**deleteOpenSearchRestoreSnapshot**](SystemManagementApi.md#deleteOpenSearchRestoreSnapshot) | **DELETE** /sites/{siteId}/opensearch/snapshots/{snapshotName}/restore | Deletes site(s) OpenSearch Restore Snapshot |
| [**deleteOpenSearchSnapshot**](SystemManagementApi.md#deleteOpenSearchSnapshot) | **DELETE** /sites/{siteId}/opensearch/snapshots/{snapshotName} | Deletes site(s) OpenSearch Snapshot |
| [**deleteOpenSearchSnapshotRepository**](SystemManagementApi.md#deleteOpenSearchSnapshotRepository) | **DELETE** /sites/{siteId}/opensearch/snapshotRepository | Deletes site(s) OpenSearch Snapshot Repository |
| [**deleteSiteGroup**](SystemManagementApi.md#deleteSiteGroup) | **DELETE** /sites/{siteId}/groups/{groupName} | Deletes Site Group and permissions |
| [**getAllOpenSearchIndices**](SystemManagementApi.md#getAllOpenSearchIndices) | **GET** /sites/global/opensearch/indices | Get all OpenSearch indices |
| [**getApiKeys**](SystemManagementApi.md#getApiKeys) | **GET** /sites/{siteId}/apiKeys | Get API Keys |
| [**getConfiguration**](SystemManagementApi.md#getConfiguration) | **GET** /sites/{siteId}/configuration | Get site configuration |
| [**getLocaleResourceItem**](SystemManagementApi.md#getLocaleResourceItem) | **GET** /sites/{siteId}/locales/{locale}/resourceItems/{itemKey} | Get Resource Item by Locale |
| [**getLocaleResourceItems**](SystemManagementApi.md#getLocaleResourceItems) | **GET** /sites/{siteId}/locales/{locale}/resourceItems | Get Resource Items by Locale |
| [**getLocales**](SystemManagementApi.md#getLocales) | **GET** /sites/{siteId}/locales | Get Locales |
| [**getOpenSearchIndex**](SystemManagementApi.md#getOpenSearchIndex) | **GET** /sites/{siteId}/opensearch/index | Get site(s) OpenSearch index settings |
| [**getOpenSearchIndices**](SystemManagementApi.md#getOpenSearchIndices) | **GET** /sites/{siteId}/opensearch/indices | Get site(s) OpenSearch indices |
| [**getOpenSearchSnapshot**](SystemManagementApi.md#getOpenSearchSnapshot) | **GET** /sites/{siteId}/opensearch/snapshots/{snapshotName} | Get site(s) OpenSearch snapshot |
| [**getOpenSearchSnapshotRepositories**](SystemManagementApi.md#getOpenSearchSnapshotRepositories) | **GET** /sites/global/opensearch/snapshotRepositories | Get site(s) OpenSearch snapshot repositories |
| [**getOpenSearchSnapshotRepository**](SystemManagementApi.md#getOpenSearchSnapshotRepository) | **GET** /sites/{siteId}/opensearch/snapshotRepository | Get site(s) OpenSearch snapshot repository |
| [**getOpenSearchSnapshots**](SystemManagementApi.md#getOpenSearchSnapshots) | **GET** /sites/{siteId}/opensearch/snapshots | Get site(s) OpenSearch snapshots |
| [**getSiteGroup**](SystemManagementApi.md#getSiteGroup) | **GET** /sites/{siteId}/groups/{groupName} | Get group and permissions belonging to site |
| [**getSiteGroups**](SystemManagementApi.md#getSiteGroups) | **GET** /sites/{siteId}/groups | Get group(s) and permissions belonging to site |
| [**getSites**](SystemManagementApi.md#getSites) | **GET** /sites | Get site(s) access |
| [**getVersion**](SystemManagementApi.md#getVersion) | **GET** /version | Get FormKiQ version |
| [**setLocaleResourceItem**](SystemManagementApi.md#setLocaleResourceItem) | **PUT** /sites/{siteId}/locales/{locale}/resourceItems/{itemKey} | Set Locale Resource Item |
| [**setOpenSearchIndex**](SystemManagementApi.md#setOpenSearchIndex) | **PUT** /sites/{siteId}/opensearch/index | Set site(s) OpenSearch index settings |
| [**setOpenSearchIndices**](SystemManagementApi.md#setOpenSearchIndices) | **PUT** /sites/{siteId}/opensearch/indices | Set site(s) OpenSearch index to use for a SiteId |
| [**setSiteGroupPermissions**](SystemManagementApi.md#setSiteGroupPermissions) | **PUT** /sites/{siteId}/groups/{groupName}/permissions | Set Site&#39;s Group Permissions |
| [**updateConfiguration**](SystemManagementApi.md#updateConfiguration) | **PATCH** /sites/{siteId}/configuration | Update site configuration |
| [**updateSite**](SystemManagementApi.md#updateSite) | **PATCH** /sites/{siteId} | Update Site |


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

<a id="addLocale"></a>
# **addLocale**
> AddResponse addLocale(siteId, addLocaleRequest)

Add Locale

Adds a new locale to the specified site

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
    AddLocaleRequest addLocaleRequest = new AddLocaleRequest(); // AddLocaleRequest | 
    try {
      AddResponse result = apiInstance.addLocale(siteId, addLocaleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#addLocale");
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
| **addLocaleRequest** | [**AddLocaleRequest**](AddLocaleRequest.md)|  | |

### Return type

[**AddResponse**](AddResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 CREATED |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="addLocaleResourceItem"></a>
# **addLocaleResourceItem**
> AddLocaleResourceItemResponse addLocaleResourceItem(siteId, locale, addLocaleResourceItemRequest)

Add Locale Resource Item

Adds a new localized resource item for a given locale

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
    String locale = "locale_example"; // String | Site Locale (ISO 639 / ISO 3166)
    AddLocaleResourceItemRequest addLocaleResourceItemRequest = new AddLocaleResourceItemRequest(); // AddLocaleResourceItemRequest | 
    try {
      AddLocaleResourceItemResponse result = apiInstance.addLocaleResourceItem(siteId, locale, addLocaleResourceItemRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#addLocaleResourceItem");
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
| **locale** | **String**| Site Locale (ISO 639 / ISO 3166) | |
| **addLocaleResourceItemRequest** | [**AddLocaleResourceItemRequest**](AddLocaleResourceItemRequest.md)|  | |

### Return type

[**AddLocaleResourceItemResponse**](AddLocaleResourceItemResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 201 CREATED |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="addOpenSearchRestoreSnapshot"></a>
# **addOpenSearchRestoreSnapshot**
> AddResponse addOpenSearchRestoreSnapshot(siteId, snapshotName)

Add an OpenSearch Restore Snapshot

Add an OpenSearch Restore Snapshot

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
    String snapshotName = "snapshotName_example"; // String | Snapshot Name
    try {
      AddResponse result = apiInstance.addOpenSearchRestoreSnapshot(siteId, snapshotName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#addOpenSearchRestoreSnapshot");
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
| **snapshotName** | **String**| Snapshot Name | |

### Return type

[**AddResponse**](AddResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="addOpenSearchSnapshot"></a>
# **addOpenSearchSnapshot**
> AddResponse addOpenSearchSnapshot(siteId, snapshotName)

Add an OpenSearch Snapshot

Add an OpenSearch Snapshot

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
    String snapshotName = "snapshotName_example"; // String | Snapshot Name
    try {
      AddResponse result = apiInstance.addOpenSearchSnapshot(siteId, snapshotName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#addOpenSearchSnapshot");
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
| **snapshotName** | **String**| Snapshot Name | |

### Return type

[**AddResponse**](AddResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="addSite"></a>
# **addSite**
> AddResponse addSite(addSiteRequest)

Add Site

Add Site

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
    AddSiteRequest addSiteRequest = new AddSiteRequest(); // AddSiteRequest | 
    try {
      AddResponse result = apiInstance.addSite(addSiteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#addSite");
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
| **addSiteRequest** | [**AddSiteRequest**](AddSiteRequest.md)|  | |

### Return type

[**AddResponse**](AddResponse.md)

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

<a id="deleteLocale"></a>
# **deleteLocale**
> DeleteResponse deleteLocale(siteId, locale)

Delete Locale

Delete Locale

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
    String locale = "locale_example"; // String | Site Locale (ISO 639 / ISO 3166)
    try {
      DeleteResponse result = apiInstance.deleteLocale(siteId, locale);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#deleteLocale");
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
| **locale** | **String**| Site Locale (ISO 639 / ISO 3166) | |

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

<a id="deleteLocaleResourceItem"></a>
# **deleteLocaleResourceItem**
> DeleteResponse deleteLocaleResourceItem(siteId, locale, itemKey)

Delete Local Resource Item

Delete Local Resource Item

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
    String locale = "locale_example"; // String | Site Locale (ISO 639 / ISO 3166)
    String itemKey = "itemKey_example"; // String | Item Key (MUST be URL‑encoded)
    try {
      DeleteResponse result = apiInstance.deleteLocaleResourceItem(siteId, locale, itemKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#deleteLocaleResourceItem");
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
| **locale** | **String**| Site Locale (ISO 639 / ISO 3166) | |
| **itemKey** | **String**| Item Key (MUST be URL‑encoded) | |

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

<a id="deleteOpenSearchIndex"></a>
# **deleteOpenSearchIndex**
> DeleteResponse deleteOpenSearchIndex(siteId)

Deletes site(s) OpenSearch index

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
      DeleteResponse result = apiInstance.deleteOpenSearchIndex(siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#deleteOpenSearchIndex");
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

<a id="deleteOpenSearchIndexByName"></a>
# **deleteOpenSearchIndexByName**
> DeleteResponse deleteOpenSearchIndexByName(indexName)

Deletes OpenSearch index by name

Deletes the OpenSearch index by name

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
    String indexName = "indexName_example"; // String | IndexName to path
    try {
      DeleteResponse result = apiInstance.deleteOpenSearchIndexByName(indexName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#deleteOpenSearchIndexByName");
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
| **indexName** | **String**| IndexName to path | |

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

<a id="deleteOpenSearchRestoreSnapshot"></a>
# **deleteOpenSearchRestoreSnapshot**
> DeleteResponse deleteOpenSearchRestoreSnapshot(siteId, snapshotName)

Deletes site(s) OpenSearch Restore Snapshot

Deletes the OpenSearch Restore Snapshot

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
    String snapshotName = "snapshotName_example"; // String | Snapshot Name
    try {
      DeleteResponse result = apiInstance.deleteOpenSearchRestoreSnapshot(siteId, snapshotName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#deleteOpenSearchRestoreSnapshot");
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
| **snapshotName** | **String**| Snapshot Name | |

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

<a id="deleteOpenSearchSnapshot"></a>
# **deleteOpenSearchSnapshot**
> DeleteResponse deleteOpenSearchSnapshot(siteId, snapshotName)

Deletes site(s) OpenSearch Snapshot

Deletes the OpenSearch Snapshot

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
    String snapshotName = "snapshotName_example"; // String | Snapshot Name
    try {
      DeleteResponse result = apiInstance.deleteOpenSearchSnapshot(siteId, snapshotName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#deleteOpenSearchSnapshot");
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
| **snapshotName** | **String**| Snapshot Name | |

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

<a id="deleteOpenSearchSnapshotRepository"></a>
# **deleteOpenSearchSnapshotRepository**
> DeleteResponse deleteOpenSearchSnapshotRepository(siteId)

Deletes site(s) OpenSearch Snapshot Repository

Deletes the OpenSearch Snapshot Repository

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
      DeleteResponse result = apiInstance.deleteOpenSearchSnapshotRepository(siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#deleteOpenSearchSnapshotRepository");
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

<a id="deleteSiteGroup"></a>
# **deleteSiteGroup**
> DeleteResponse deleteSiteGroup(siteId, groupName)

Deletes Site Group and permissions

Deletes Site Group and permissions

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
    String groupName = "groupName_example"; // String | Group Name
    try {
      DeleteResponse result = apiInstance.deleteSiteGroup(siteId, groupName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#deleteSiteGroup");
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
| **groupName** | **String**| Group Name | |

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

<a id="getAllOpenSearchIndices"></a>
# **getAllOpenSearchIndices**
> GetOpenSearchIndiceResponse getAllOpenSearchIndices()

Get all OpenSearch indices

Returns all OpenSearch indices

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
      GetOpenSearchIndiceResponse result = apiInstance.getAllOpenSearchIndices();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#getAllOpenSearchIndices");
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

[**GetOpenSearchIndiceResponse**](GetOpenSearchIndiceResponse.md)

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
> GetApiKeysResponse getApiKeys(siteId, next, limit)

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
    String next = "next_example"; // String | Next page of results token
    String limit = "10"; // String | Limit Results
    try {
      GetApiKeysResponse result = apiInstance.getApiKeys(siteId, next, limit);
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
| **next** | **String**| Next page of results token | [optional] |
| **limit** | **String**| Limit Results | [optional] [default to 10] |

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

<a id="getLocaleResourceItem"></a>
# **getLocaleResourceItem**
> GetLocaleResourceItemResponse getLocaleResourceItem(siteId, locale, itemKey)

Get Resource Item by Locale

Returns the resource item

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
    String locale = "locale_example"; // String | Site Locale (ISO 639 / ISO 3166)
    String itemKey = "itemKey_example"; // String | Item Key (MUST be URL‑encoded)
    try {
      GetLocaleResourceItemResponse result = apiInstance.getLocaleResourceItem(siteId, locale, itemKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#getLocaleResourceItem");
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
| **locale** | **String**| Site Locale (ISO 639 / ISO 3166) | |
| **itemKey** | **String**| Item Key (MUST be URL‑encoded) | |

### Return type

[**GetLocaleResourceItemResponse**](GetLocaleResourceItemResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getLocaleResourceItems"></a>
# **getLocaleResourceItems**
> GetLocaleResourceItemsResponse getLocaleResourceItems(siteId, locale, next, limit)

Get Resource Items by Locale

Returns the list resource items

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
    String locale = "locale_example"; // String | Site Locale (ISO 639 / ISO 3166)
    String next = "next_example"; // String | Next page of results token
    String limit = "10"; // String | Limit Results
    try {
      GetLocaleResourceItemsResponse result = apiInstance.getLocaleResourceItems(siteId, locale, next, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#getLocaleResourceItems");
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
| **locale** | **String**| Site Locale (ISO 639 / ISO 3166) | |
| **next** | **String**| Next page of results token | [optional] |
| **limit** | **String**| Limit Results | [optional] [default to 10] |

### Return type

[**GetLocaleResourceItemsResponse**](GetLocaleResourceItemsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getLocales"></a>
# **getLocales**
> GetLocalesResponse getLocales(siteId, next, limit)

Get Locales

Returns a list of locale(s) in a specified site

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
    String next = "next_example"; // String | Next page of results token
    String limit = "10"; // String | Limit Results
    try {
      GetLocalesResponse result = apiInstance.getLocales(siteId, next, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#getLocales");
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
| **next** | **String**| Next page of results token | [optional] |
| **limit** | **String**| Limit Results | [optional] [default to 10] |

### Return type

[**GetLocalesResponse**](GetLocalesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getOpenSearchIndex"></a>
# **getOpenSearchIndex**
> GetOpenSearchIndexResponse getOpenSearchIndex(siteId)

Get site(s) OpenSearch index settings

Returns the OpenSearch index settings   (Deprecated use /sites/{siteId}/opensearch/indices)

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
      GetOpenSearchIndexResponse result = apiInstance.getOpenSearchIndex(siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#getOpenSearchIndex");
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

<a id="getOpenSearchIndices"></a>
# **getOpenSearchIndices**
> GetOpenSearchIndiceResponse getOpenSearchIndices(siteId)

Get site(s) OpenSearch indices

Returns the OpenSearch indices

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
      GetOpenSearchIndiceResponse result = apiInstance.getOpenSearchIndices(siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#getOpenSearchIndices");
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

[**GetOpenSearchIndiceResponse**](GetOpenSearchIndiceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getOpenSearchSnapshot"></a>
# **getOpenSearchSnapshot**
> GetOpenSearchSnapshotResponse getOpenSearchSnapshot(siteId, snapshotName)

Get site(s) OpenSearch snapshot

Returns the OpenSearch Snapshot

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
    String snapshotName = "snapshotName_example"; // String | Snapshot Name
    try {
      GetOpenSearchSnapshotResponse result = apiInstance.getOpenSearchSnapshot(siteId, snapshotName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#getOpenSearchSnapshot");
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
| **snapshotName** | **String**| Snapshot Name | |

### Return type

[**GetOpenSearchSnapshotResponse**](GetOpenSearchSnapshotResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getOpenSearchSnapshotRepositories"></a>
# **getOpenSearchSnapshotRepositories**
> GetOpenSearchSnapshotRepositoryResponse getOpenSearchSnapshotRepositories()

Get site(s) OpenSearch snapshot repositories

Returns the OpenSearch Snapshot Repositories

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
      GetOpenSearchSnapshotRepositoryResponse result = apiInstance.getOpenSearchSnapshotRepositories();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#getOpenSearchSnapshotRepositories");
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

[**GetOpenSearchSnapshotRepositoryResponse**](GetOpenSearchSnapshotRepositoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getOpenSearchSnapshotRepository"></a>
# **getOpenSearchSnapshotRepository**
> GetOpenSearchSnapshotRepositoryResponse getOpenSearchSnapshotRepository(siteId)

Get site(s) OpenSearch snapshot repository

Returns the OpenSearch Snapshot Repository

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
      GetOpenSearchSnapshotRepositoryResponse result = apiInstance.getOpenSearchSnapshotRepository(siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#getOpenSearchSnapshotRepository");
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

[**GetOpenSearchSnapshotRepositoryResponse**](GetOpenSearchSnapshotRepositoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getOpenSearchSnapshots"></a>
# **getOpenSearchSnapshots**
> GetOpenSearchSnapshotResponse getOpenSearchSnapshots(siteId)

Get site(s) OpenSearch snapshots

Returns the OpenSearch Snapshots

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
      GetOpenSearchSnapshotResponse result = apiInstance.getOpenSearchSnapshots(siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#getOpenSearchSnapshots");
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

[**GetOpenSearchSnapshotResponse**](GetOpenSearchSnapshotResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getSiteGroup"></a>
# **getSiteGroup**
> GetSiteGroupResponse getSiteGroup(siteId, groupName)

Get group and permissions belonging to site

Returns details of a group and permissions belonging to site

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
    String groupName = "groupName_example"; // String | Group Name
    try {
      GetSiteGroupResponse result = apiInstance.getSiteGroup(siteId, groupName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#getSiteGroup");
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
| **groupName** | **String**| Group Name | |

### Return type

[**GetSiteGroupResponse**](GetSiteGroupResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getSiteGroups"></a>
# **getSiteGroups**
> GetSiteGroupsResponse getSiteGroups(siteId)

Get group(s) and permissions belonging to site

Returns list of groups and permissions belonging to site

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
      GetSiteGroupsResponse result = apiInstance.getSiteGroups(siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#getSiteGroups");
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

[**GetSiteGroupsResponse**](GetSiteGroupsResponse.md)

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
> GetSitesResponse getSites(status)

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
    SiteStatus status = SiteStatus.fromValue("ACTIVE"); // SiteStatus | Fetch sites with status (only valid when using SitePermissions 'defined'
    try {
      GetSitesResponse result = apiInstance.getSites(status);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **status** | [**SiteStatus**](.md)| Fetch sites with status (only valid when using SitePermissions &#39;defined&#39; | [optional] [enum: ACTIVE, INACTIVE] |

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

<a id="setLocaleResourceItem"></a>
# **setLocaleResourceItem**
> SetResponse setLocaleResourceItem(siteId, locale, itemKey, setLocaleResourceItemRequest)

Set Locale Resource Item

Set a new Locale Resource Item

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
    String locale = "locale_example"; // String | Site Locale (ISO 639 / ISO 3166)
    String itemKey = "itemKey_example"; // String | Item Key (MUST be URL‑encoded)
    SetLocaleResourceItemRequest setLocaleResourceItemRequest = new SetLocaleResourceItemRequest(); // SetLocaleResourceItemRequest | 
    try {
      SetResponse result = apiInstance.setLocaleResourceItem(siteId, locale, itemKey, setLocaleResourceItemRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#setLocaleResourceItem");
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
| **locale** | **String**| Site Locale (ISO 639 / ISO 3166) | |
| **itemKey** | **String**| Item Key (MUST be URL‑encoded) | |
| **setLocaleResourceItemRequest** | [**SetLocaleResourceItemRequest**](SetLocaleResourceItemRequest.md)|  | |

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

<a id="setOpenSearchIndex"></a>
# **setOpenSearchIndex**
> SetOpenSearchIndexResponse setOpenSearchIndex(siteId, setOpenSearchIndexRequest)

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
      SetOpenSearchIndexResponse result = apiInstance.setOpenSearchIndex(siteId, setOpenSearchIndexRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#setOpenSearchIndex");
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

<a id="setOpenSearchIndices"></a>
# **setOpenSearchIndices**
> SetResponse setOpenSearchIndices(siteId, setOpenSearchIndiceRequest)

Set site(s) OpenSearch index to use for a SiteId

Sets the OpenSearch index to use for a SiteId

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
    SetOpenSearchIndiceRequest setOpenSearchIndiceRequest = new SetOpenSearchIndiceRequest(); // SetOpenSearchIndiceRequest | 
    try {
      SetResponse result = apiInstance.setOpenSearchIndices(siteId, setOpenSearchIndiceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#setOpenSearchIndices");
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
| **setOpenSearchIndiceRequest** | [**SetOpenSearchIndiceRequest**](SetOpenSearchIndiceRequest.md)|  | |

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

<a id="setSiteGroupPermissions"></a>
# **setSiteGroupPermissions**
> SetResponse setSiteGroupPermissions(siteId, groupName, setGroupPermissionsRequest)

Set Site&#39;s Group Permissions

Set Site&#39;s Group Permissions

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
    String groupName = "groupName_example"; // String | Group Name
    SetGroupPermissionsRequest setGroupPermissionsRequest = new SetGroupPermissionsRequest(); // SetGroupPermissionsRequest | 
    try {
      SetResponse result = apiInstance.setSiteGroupPermissions(siteId, groupName, setGroupPermissionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#setSiteGroupPermissions");
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
| **groupName** | **String**| Group Name | |
| **setGroupPermissionsRequest** | [**SetGroupPermissionsRequest**](SetGroupPermissionsRequest.md)|  | |

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

<a id="updateSite"></a>
# **updateSite**
> UpdateResponse updateSite(siteId, updateSiteRequest)

Update Site

Update Site

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
    UpdateSiteRequest updateSiteRequest = new UpdateSiteRequest(); // UpdateSiteRequest | 
    try {
      UpdateResponse result = apiInstance.updateSite(siteId, updateSiteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemManagementApi#updateSite");
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
| **updateSiteRequest** | [**UpdateSiteRequest**](UpdateSiteRequest.md)|  | |

### Return type

[**UpdateResponse**](UpdateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

