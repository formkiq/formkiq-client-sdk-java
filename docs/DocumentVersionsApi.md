# DocumentVersionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteDocumentVersion**](DocumentVersionsApi.md#deleteDocumentVersion) | **DELETE** /documents/{documentId}/versions/{versionKey} | Delete document version |
| [**getDocumentVersions**](DocumentVersionsApi.md#getDocumentVersions) | **GET** /documents/{documentId}/versions | Get document&#39;s versions |
| [**setDocumentVersion**](DocumentVersionsApi.md#setDocumentVersion) | **PUT** /documents/{documentId}/versions | Set version of document |


<a id="deleteDocumentVersion"></a>
# **deleteDocumentVersion**
> DeleteResponse deleteDocumentVersion(documentId, versionKey, siteId, shareKey)

Delete document version

Delete a specific previous document version; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentVersionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentVersionsApi apiInstance = new DocumentVersionsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String versionKey = "versionKey_example"; // String | Version Key (version key required URL encoding)
    String siteId = "siteId_example"; // String | Site Identifier
    String shareKey = "shareKey_example"; // String | Share Identifier
    try {
      DeleteResponse result = apiInstance.deleteDocumentVersion(documentId, versionKey, siteId, shareKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentVersionsApi#deleteDocumentVersion");
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
| **versionKey** | **String**| Version Key (version key required URL encoding) | |
| **siteId** | **String**| Site Identifier | [optional] |
| **shareKey** | **String**| Share Identifier | [optional] |

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

<a id="getDocumentVersions"></a>
# **getDocumentVersions**
> GetDocumentVersionsResponse getDocumentVersions(documentId, siteId, limit, shareKey, next)

Get document&#39;s versions

Get a listing of document content and metadata versions; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentVersionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentVersionsApi apiInstance = new DocumentVersionsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    String limit = "10"; // String | Limit Results
    String shareKey = "shareKey_example"; // String | Share Identifier
    String next = "next_example"; // String | Next page of results token
    try {
      GetDocumentVersionsResponse result = apiInstance.getDocumentVersions(documentId, siteId, limit, shareKey, next);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentVersionsApi#getDocumentVersions");
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
| **limit** | **String**| Limit Results | [optional] [default to 10] |
| **shareKey** | **String**| Share Identifier | [optional] |
| **next** | **String**| Next page of results token | [optional] |

### Return type

[**GetDocumentVersionsResponse**](GetDocumentVersionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="setDocumentVersion"></a>
# **setDocumentVersion**
> SetDocumentVersionResponse setDocumentVersion(documentId, setDocumentVersionRequest, siteId)

Set version of document

Set document to a previous document version; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentVersionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentVersionsApi apiInstance = new DocumentVersionsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    SetDocumentVersionRequest setDocumentVersionRequest = new SetDocumentVersionRequest(); // SetDocumentVersionRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      SetDocumentVersionResponse result = apiInstance.setDocumentVersion(documentId, setDocumentVersionRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentVersionsApi#setDocumentVersion");
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
| **setDocumentVersionRequest** | [**SetDocumentVersionRequest**](SetDocumentVersionRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**SetDocumentVersionResponse**](SetDocumentVersionResponse.md)

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

