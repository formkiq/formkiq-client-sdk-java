# AdvancedDocumentSearchApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDocumentFulltext**](AdvancedDocumentSearchApi.md#addDocumentFulltext) | **POST** /documents/{documentId}/fulltext | Add document&#39;s full-text |
| [**deleteDocumentFulltext**](AdvancedDocumentSearchApi.md#deleteDocumentFulltext) | **DELETE** /documents/{documentId}/fulltext | Delete document full-text |
| [**deleteDocumentFulltextTag**](AdvancedDocumentSearchApi.md#deleteDocumentFulltextTag) | **DELETE** /documents/{documentId}/fulltext/tags/{tagKey} | Delete document full-text tag |
| [**deleteDocumentFulltextTagAndValue**](AdvancedDocumentSearchApi.md#deleteDocumentFulltextTagAndValue) | **DELETE** /documents/{documentId}/fulltext/tags/{tagKey}/{tagValue} | Delete document full-text tag/value |
| [**getDocumentFulltext**](AdvancedDocumentSearchApi.md#getDocumentFulltext) | **GET** /documents/{documentId}/fulltext | Get document&#39;s full-text |
| [**queryFulltext**](AdvancedDocumentSearchApi.md#queryFulltext) | **POST** /queryFulltext | Direct opensearch search API |
| [**searchFulltext**](AdvancedDocumentSearchApi.md#searchFulltext) | **POST** /searchFulltext | Document full-text search |
| [**setDocumentFulltext**](AdvancedDocumentSearchApi.md#setDocumentFulltext) | **PUT** /documents/{documentId}/fulltext | Set document&#39;s full-text |
| [**updateDocumentFulltext**](AdvancedDocumentSearchApi.md#updateDocumentFulltext) | **PATCH** /documents/{documentId}/fulltext | Update document&#39;s full-text |


<a id="addDocumentFulltext"></a>
# **addDocumentFulltext**
> AddDocumentFulltextResponse addDocumentFulltext(documentId, siteId, addDocumentFulltextRequest)

Add document&#39;s full-text

Adde a document to OpenSearch; ONLY available with FormKiQ Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.AdvancedDocumentSearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    AdvancedDocumentSearchApi apiInstance = new AdvancedDocumentSearchApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    AddDocumentFulltextRequest addDocumentFulltextRequest = new AddDocumentFulltextRequest(); // AddDocumentFulltextRequest | 
    try {
      AddDocumentFulltextResponse result = apiInstance.addDocumentFulltext(documentId, siteId, addDocumentFulltextRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvancedDocumentSearchApi#addDocumentFulltext");
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
| **addDocumentFulltextRequest** | [**AddDocumentFulltextRequest**](AddDocumentFulltextRequest.md)|  | [optional] |

### Return type

[**AddDocumentFulltextResponse**](AddDocumentFulltextResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="deleteDocumentFulltext"></a>
# **deleteDocumentFulltext**
> DeleteFulltextResponse deleteDocumentFulltext(documentId, siteId)

Delete document full-text

Remove full text search for a document from OpenSearch; ONLY available with FormKiQ Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.AdvancedDocumentSearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    AdvancedDocumentSearchApi apiInstance = new AdvancedDocumentSearchApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      DeleteFulltextResponse result = apiInstance.deleteDocumentFulltext(documentId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvancedDocumentSearchApi#deleteDocumentFulltext");
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

[**DeleteFulltextResponse**](DeleteFulltextResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="deleteDocumentFulltextTag"></a>
# **deleteDocumentFulltextTag**
> deleteDocumentFulltextTag(documentId, tagKey, siteId, shareKey)

Delete document full-text tag

Remove document tags from OpenSearch; ONLY available with FormKiQ Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.AdvancedDocumentSearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    AdvancedDocumentSearchApi apiInstance = new AdvancedDocumentSearchApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String tagKey = "tagKey_example"; // String | Tag Key
    String siteId = "siteId_example"; // String | Site Identifier
    String shareKey = "shareKey_example"; // String | Share Identifier
    try {
      apiInstance.deleteDocumentFulltextTag(documentId, tagKey, siteId, shareKey);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvancedDocumentSearchApi#deleteDocumentFulltextTag");
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

<a id="deleteDocumentFulltextTagAndValue"></a>
# **deleteDocumentFulltextTagAndValue**
> deleteDocumentFulltextTagAndValue(documentId, tagKey, tagValue, siteId, shareKey)

Delete document full-text tag/value

Remove document tag/value from OpenSearch; ONLY available with FormKiQ Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.AdvancedDocumentSearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    AdvancedDocumentSearchApi apiInstance = new AdvancedDocumentSearchApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String tagKey = "tagKey_example"; // String | Tag Key
    String tagValue = "tagValue_example"; // String | Tag Key Value
    String siteId = "siteId_example"; // String | Site Identifier
    String shareKey = "shareKey_example"; // String | Share Identifier
    try {
      apiInstance.deleteDocumentFulltextTagAndValue(documentId, tagKey, tagValue, siteId, shareKey);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvancedDocumentSearchApi#deleteDocumentFulltextTagAndValue");
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

<a id="getDocumentFulltext"></a>
# **getDocumentFulltext**
> GetDocumentFulltextResponse getDocumentFulltext(documentId, siteId, shareKey)

Get document&#39;s full-text

Retrieve an OpenSearch document&#39;s details, i.e., metadata

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.AdvancedDocumentSearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    AdvancedDocumentSearchApi apiInstance = new AdvancedDocumentSearchApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    String shareKey = "shareKey_example"; // String | Share Identifier
    try {
      GetDocumentFulltextResponse result = apiInstance.getDocumentFulltext(documentId, siteId, shareKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvancedDocumentSearchApi#getDocumentFulltext");
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
| **shareKey** | **String**| Share Identifier | [optional] |

### Return type

[**GetDocumentFulltextResponse**](GetDocumentFulltextResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="queryFulltext"></a>
# **queryFulltext**
> QueryFulltextResponse queryFulltext(body, siteId)

Direct opensearch search API

Endpoint for allowing custom, complex queries using the OpenSearch search API (https://opensearch.org/docs/latest/opensearch/rest-api/search/); ONLY available with FormKiQ Enterprise  Example Request Body: { \&quot;query\&quot;: { \&quot;match_all\&quot;: {} }}

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.AdvancedDocumentSearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    AdvancedDocumentSearchApi apiInstance = new AdvancedDocumentSearchApi(defaultClient);
    Object body = null; // Object | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      QueryFulltextResponse result = apiInstance.queryFulltext(body, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvancedDocumentSearchApi#queryFulltext");
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
| **body** | **Object**|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**QueryFulltextResponse**](QueryFulltextResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="searchFulltext"></a>
# **searchFulltext**
> DocumentFulltextResponse searchFulltext(documentFulltextRequest, siteId, limit)

Document full-text search

Document full-text search (and more robust multi-tag search queries, powered by OpenSearch); ONLY available with FormKiQ Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.AdvancedDocumentSearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    AdvancedDocumentSearchApi apiInstance = new AdvancedDocumentSearchApi(defaultClient);
    DocumentFulltextRequest documentFulltextRequest = new DocumentFulltextRequest(); // DocumentFulltextRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    String limit = "10"; // String | Limit Results
    try {
      DocumentFulltextResponse result = apiInstance.searchFulltext(documentFulltextRequest, siteId, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvancedDocumentSearchApi#searchFulltext");
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
| **documentFulltextRequest** | [**DocumentFulltextRequest**](DocumentFulltextRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |
| **limit** | **String**| Limit Results | [optional] [default to 10] |

### Return type

[**DocumentFulltextResponse**](DocumentFulltextResponse.md)

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

<a id="setDocumentFulltext"></a>
# **setDocumentFulltext**
> SetDocumentFulltextResponse setDocumentFulltext(documentId, siteId, setDocumentFulltextRequest)

Set document&#39;s full-text

Set all text/tags found within a document to OpenSearch; ONLY available with FormKiQ Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.AdvancedDocumentSearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    AdvancedDocumentSearchApi apiInstance = new AdvancedDocumentSearchApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    SetDocumentFulltextRequest setDocumentFulltextRequest = new SetDocumentFulltextRequest(); // SetDocumentFulltextRequest | 
    try {
      SetDocumentFulltextResponse result = apiInstance.setDocumentFulltext(documentId, siteId, setDocumentFulltextRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvancedDocumentSearchApi#setDocumentFulltext");
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
| **setDocumentFulltextRequest** | [**SetDocumentFulltextRequest**](SetDocumentFulltextRequest.md)|  | [optional] |

### Return type

[**SetDocumentFulltextResponse**](SetDocumentFulltextResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="updateDocumentFulltext"></a>
# **updateDocumentFulltext**
> UpdateDocumentFulltextResponse updateDocumentFulltext(documentId, siteId, updateDocumentFulltextRequest)

Update document&#39;s full-text

Update a document in OpenSearch; ONLY available with FormKiQ Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.AdvancedDocumentSearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    AdvancedDocumentSearchApi apiInstance = new AdvancedDocumentSearchApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    UpdateDocumentFulltextRequest updateDocumentFulltextRequest = new UpdateDocumentFulltextRequest(); // UpdateDocumentFulltextRequest | 
    try {
      UpdateDocumentFulltextResponse result = apiInstance.updateDocumentFulltext(documentId, siteId, updateDocumentFulltextRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvancedDocumentSearchApi#updateDocumentFulltext");
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
| **updateDocumentFulltextRequest** | [**UpdateDocumentFulltextRequest**](UpdateDocumentFulltextRequest.md)|  | [optional] |

### Return type

[**UpdateDocumentFulltextResponse**](UpdateDocumentFulltextResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

