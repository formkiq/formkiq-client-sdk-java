# DocumentTagsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDocumentTags**](DocumentTagsApi.md#addDocumentTags) | **POST** /documents/{documentId}/tags |  |
| [**deleteDocumentTag**](DocumentTagsApi.md#deleteDocumentTag) | **DELETE** /documents/{documentId}/tags/{tagKey} |  |
| [**deleteDocumentTagAndValue**](DocumentTagsApi.md#deleteDocumentTagAndValue) | **DELETE** /documents/{documentId}/tags/{tagKey}/{tagValue} |  |
| [**getDocumentTag**](DocumentTagsApi.md#getDocumentTag) | **GET** /documents/{documentId}/tags/{tagKey} |  |
| [**getDocumentTags**](DocumentTagsApi.md#getDocumentTags) | **GET** /documents/{documentId}/tags |  |
| [**setDocumentTag**](DocumentTagsApi.md#setDocumentTag) | **PUT** /documents/{documentId}/tags/{tagKey} |  |
| [**setDocumentTags**](DocumentTagsApi.md#setDocumentTags) | **PUT** /documents/{documentId}/tags |  |
| [**updateDocumentTags**](DocumentTagsApi.md#updateDocumentTags) | **PATCH** /documents/{documentId}/tags |  |
| [**updateMatchingDocumentTags**](DocumentTagsApi.md#updateMatchingDocumentTags) | **PATCH** /documents/tags |  |


<a id="addDocumentTags"></a>
# **addDocumentTags**
> addDocumentTags(documentId, addDocumentTagsRequest, siteId)



Add multiple tags to a document; this endpoint also accepts a different body parameter for adding a single tag

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentTagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    DocumentTagsApi apiInstance = new DocumentTagsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    AddDocumentTagsRequest addDocumentTagsRequest = new AddDocumentTagsRequest(); // AddDocumentTagsRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      apiInstance.addDocumentTags(documentId, addDocumentTagsRequest, siteId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentTagsApi#addDocumentTags");
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
| **addDocumentTagsRequest** | [**AddDocumentTagsRequest**](AddDocumentTagsRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="deleteDocumentTag"></a>
# **deleteDocumentTag**
> deleteDocumentTag(documentId, tagKey, siteId)



Delete a document tag by using its key

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentTagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    DocumentTagsApi apiInstance = new DocumentTagsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String tagKey = "tagKey_example"; // String | Tag Key
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      apiInstance.deleteDocumentTag(documentId, tagKey, siteId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentTagsApi#deleteDocumentTag");
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
| **tagKey** | **String**| Tag Key | |
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

<a id="deleteDocumentTagAndValue"></a>
# **deleteDocumentTagAndValue**
> deleteDocumentTagAndValue(documentId, tagKey, tagValue, siteId, shareKey)



Delete a specific document tag&#39;s key/value combination; the request will be ignored if there is no valid key/value combination found

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentTagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    DocumentTagsApi apiInstance = new DocumentTagsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String tagKey = "tagKey_example"; // String | Tag Key
    String tagValue = "tagValue_example"; // String | Tag Key Value
    String siteId = "siteId_example"; // String | Site Identifier
    String shareKey = "shareKey_example"; // String | Share Identifier
    try {
      apiInstance.deleteDocumentTagAndValue(documentId, tagKey, tagValue, siteId, shareKey);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentTagsApi#deleteDocumentTagAndValue");
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
| **tagKey** | **String**| Tag Key | |
| **tagValue** | **String**| Tag Key Value | |
| **siteId** | **String**| Site Identifier | [optional] |
| **shareKey** | **String**| Share Identifier | [optional] |

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

<a id="getDocumentTag"></a>
# **getDocumentTag**
> GetDocumentTagResponse getDocumentTag(documentId, tagKey, siteId, shareKey)



Get a document tag by using its key

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentTagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    DocumentTagsApi apiInstance = new DocumentTagsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String tagKey = "tagKey_example"; // String | Tag Key
    String siteId = "siteId_example"; // String | Site Identifier
    String shareKey = "shareKey_example"; // String | Share Identifier
    try {
      GetDocumentTagResponse result = apiInstance.getDocumentTag(documentId, tagKey, siteId, shareKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentTagsApi#getDocumentTag");
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
| **tagKey** | **String**| Tag Key | |
| **siteId** | **String**| Site Identifier | [optional] |
| **shareKey** | **String**| Share Identifier | [optional] |

### Return type

[**GetDocumentTagResponse**](GetDocumentTagResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getDocumentTags"></a>
# **getDocumentTags**
> GetDocumentTagsResponse getDocumentTags(documentId, siteId, limit, shareKey, next, previous)



Get a listing of a document&#39;s tags

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentTagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    DocumentTagsApi apiInstance = new DocumentTagsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    String limit = "10"; // String | Limit Results
    String shareKey = "shareKey_example"; // String | Share Identifier
    String next = "next_example"; // String | Next page of results token
    String previous = "previous_example"; // String | Previous page of results token
    try {
      GetDocumentTagsResponse result = apiInstance.getDocumentTags(documentId, siteId, limit, shareKey, next, previous);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentTagsApi#getDocumentTags");
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
| **previous** | **String**| Previous page of results token | [optional] |

### Return type

[**GetDocumentTagsResponse**](GetDocumentTagsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="setDocumentTag"></a>
# **setDocumentTag**
> setDocumentTag(documentId, tagKey, setDocumentTagKeyRequest, siteId)



Update any and all values of a document tag, by using its key; you can supply one tag value or a list of tag values in the request body

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentTagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    DocumentTagsApi apiInstance = new DocumentTagsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String tagKey = "tagKey_example"; // String | Tag Key
    SetDocumentTagKeyRequest setDocumentTagKeyRequest = new SetDocumentTagKeyRequest(); // SetDocumentTagKeyRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      apiInstance.setDocumentTag(documentId, tagKey, setDocumentTagKeyRequest, siteId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentTagsApi#setDocumentTag");
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
| **tagKey** | **String**| Tag Key | |
| **setDocumentTagKeyRequest** | [**SetDocumentTagKeyRequest**](SetDocumentTagKeyRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="setDocumentTags"></a>
# **setDocumentTags**
> setDocumentTags(documentId, addDocumentTagsRequest, siteId)



Set multiple tags to a document; this endpoint also accepts a different body parameter for setting a single tag

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentTagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    DocumentTagsApi apiInstance = new DocumentTagsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    AddDocumentTagsRequest addDocumentTagsRequest = new AddDocumentTagsRequest(); // AddDocumentTagsRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      apiInstance.setDocumentTags(documentId, addDocumentTagsRequest, siteId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentTagsApi#setDocumentTags");
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
| **addDocumentTagsRequest** | [**AddDocumentTagsRequest**](AddDocumentTagsRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="updateDocumentTags"></a>
# **updateDocumentTags**
> updateDocumentTags(documentId, addDocumentTagsRequest, siteId)



Updates multiple tags to a document; this endpoint also accepts a different body parameter for updating a single tag

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentTagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    DocumentTagsApi apiInstance = new DocumentTagsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    AddDocumentTagsRequest addDocumentTagsRequest = new AddDocumentTagsRequest(); // AddDocumentTagsRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      apiInstance.updateDocumentTags(documentId, addDocumentTagsRequest, siteId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentTagsApi#updateDocumentTags");
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
| **addDocumentTagsRequest** | [**AddDocumentTagsRequest**](AddDocumentTagsRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="updateMatchingDocumentTags"></a>
# **updateMatchingDocumentTags**
> UpdateMatchingDocumentTagsResponse updateMatchingDocumentTags(updateMatchingDocumentTagsRequest, siteId)



This API request allows the adding/updating of multiple document tag(s) based on document(s) that have the matching tag.

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentTagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    DocumentTagsApi apiInstance = new DocumentTagsApi(defaultClient);
    UpdateMatchingDocumentTagsRequest updateMatchingDocumentTagsRequest = new UpdateMatchingDocumentTagsRequest(); // UpdateMatchingDocumentTagsRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      UpdateMatchingDocumentTagsResponse result = apiInstance.updateMatchingDocumentTags(updateMatchingDocumentTagsRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentTagsApi#updateMatchingDocumentTags");
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
| **updateMatchingDocumentTagsRequest** | [**UpdateMatchingDocumentTagsRequest**](UpdateMatchingDocumentTagsRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**UpdateMatchingDocumentTagsResponse**](UpdateMatchingDocumentTagsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

