# DocumentFoldersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addFolder**](DocumentFoldersApi.md#addFolder) | **POST** /folders | Add document folder |
| [**deleteFolder**](DocumentFoldersApi.md#deleteFolder) | **DELETE** /folders/{indexKey} | Delete document folder |
| [**getFolderDocuments**](DocumentFoldersApi.md#getFolderDocuments) | **GET** /folders | Get document folders |
| [**getFolderPermissions**](DocumentFoldersApi.md#getFolderPermissions) | **GET** /folders/{indexKey}/permissions | Get folder permissions |
| [**setFolderPermissions**](DocumentFoldersApi.md#setFolderPermissions) | **PUT** /folders/permissions | Sets Folder Permissions |


<a id="addFolder"></a>
# **addFolder**
> AddFolderResponse addFolder(addFolderRequest, siteId, shareKey)

Add document folder

Creates a new folder

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentFoldersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentFoldersApi apiInstance = new DocumentFoldersApi(defaultClient);
    AddFolderRequest addFolderRequest = new AddFolderRequest(); // AddFolderRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    String shareKey = "shareKey_example"; // String | Share Identifier
    try {
      AddFolderResponse result = apiInstance.addFolder(addFolderRequest, siteId, shareKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentFoldersApi#addFolder");
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
| **addFolderRequest** | [**AddFolderRequest**](AddFolderRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |
| **shareKey** | **String**| Share Identifier | [optional] |

### Return type

[**AddFolderResponse**](AddFolderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 CREATED |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="deleteFolder"></a>
# **deleteFolder**
> DeleteFolderResponse deleteFolder(indexKey, siteId, shareKey)

Delete document folder

Delete a specific folder; folder must be empty

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentFoldersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentFoldersApi apiInstance = new DocumentFoldersApi(defaultClient);
    String indexKey = "indexKey_example"; // String | Index Key Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    String shareKey = "shareKey_example"; // String | Share Identifier
    try {
      DeleteFolderResponse result = apiInstance.deleteFolder(indexKey, siteId, shareKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentFoldersApi#deleteFolder");
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
| **indexKey** | **String**| Index Key Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |
| **shareKey** | **String**| Share Identifier | [optional] |

### Return type

[**DeleteFolderResponse**](DeleteFolderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getFolderDocuments"></a>
# **getFolderDocuments**
> GetFoldersResponse getFolderDocuments(siteId, indexKey, path, limit, shareKey, next)

Get document folders

Get list of documents in a folder

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentFoldersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentFoldersApi apiInstance = new DocumentFoldersApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    String indexKey = "indexKey_example"; // String | Index Key Identifier
    String path = "path_example"; // String | Path query parameter (must be URL Encoded)
    String limit = "10"; // String | Limit Results
    String shareKey = "shareKey_example"; // String | Share Identifier
    String next = "next_example"; // String | Next page of results token
    try {
      GetFoldersResponse result = apiInstance.getFolderDocuments(siteId, indexKey, path, limit, shareKey, next);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentFoldersApi#getFolderDocuments");
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
| **indexKey** | **String**| Index Key Identifier | [optional] |
| **path** | **String**| Path query parameter (must be URL Encoded) | [optional] |
| **limit** | **String**| Limit Results | [optional] [default to 10] |
| **shareKey** | **String**| Share Identifier | [optional] |
| **next** | **String**| Next page of results token | [optional] |

### Return type

[**GetFoldersResponse**](GetFoldersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getFolderPermissions"></a>
# **getFolderPermissions**
> GetFolderPermissionsResponse getFolderPermissions(indexKey, siteId)

Get folder permissions

Get list of permissions for a folder

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentFoldersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentFoldersApi apiInstance = new DocumentFoldersApi(defaultClient);
    String indexKey = "indexKey_example"; // String | Index Key Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      GetFolderPermissionsResponse result = apiInstance.getFolderPermissions(indexKey, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentFoldersApi#getFolderPermissions");
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
| **indexKey** | **String**| Index Key Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**GetFolderPermissionsResponse**](GetFolderPermissionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="setFolderPermissions"></a>
# **setFolderPermissions**
> SetResponse setFolderPermissions(setFolderPermissionsRequest, siteId)

Sets Folder Permissions

Sets a folders permissions  NOTE: Can only be called be ADMIN or GOVERN.

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentFoldersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentFoldersApi apiInstance = new DocumentFoldersApi(defaultClient);
    SetFolderPermissionsRequest setFolderPermissionsRequest = new SetFolderPermissionsRequest(); // SetFolderPermissionsRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      SetResponse result = apiInstance.setFolderPermissions(setFolderPermissionsRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentFoldersApi#setFolderPermissions");
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
| **setFolderPermissionsRequest** | [**SetFolderPermissionsRequest**](SetFolderPermissionsRequest.md)|  | |
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
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

