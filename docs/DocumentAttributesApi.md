# DocumentAttributesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDocumentAttributes**](DocumentAttributesApi.md#addDocumentAttributes) | **POST** /documents/{documentId}/attributes | Add attribute to document |
| [**deleteDocumentAttribute**](DocumentAttributesApi.md#deleteDocumentAttribute) | **DELETE** /documents/{documentId}/attributes/{attributeKey} | Delete document attribute |
| [**deleteDocumentAttributeAndValue**](DocumentAttributesApi.md#deleteDocumentAttributeAndValue) | **DELETE** /documents/{documentId}/attributes/{attributeKey}/{attributeValue} | Delete document&#39;s attribute value |
| [**getDocumentAttribute**](DocumentAttributesApi.md#getDocumentAttribute) | **GET** /documents/{documentId}/attributes/{attributeKey} | Get document attribute by key |
| [**getDocumentAttributeVersions**](DocumentAttributesApi.md#getDocumentAttributeVersions) | **GET** /documents/{documentId}/attributes/{attributeKey}/versions | Get document attribute&#39;s versions |
| [**getDocumentAttributes**](DocumentAttributesApi.md#getDocumentAttributes) | **GET** /documents/{documentId}/attributes | Get document&#39;s attributes |
| [**setDocumentAttributeValue**](DocumentAttributesApi.md#setDocumentAttributeValue) | **PUT** /documents/{documentId}/attributes/{attributeKey} | Set document&#39;s attributes value |
| [**setDocumentAttributes**](DocumentAttributesApi.md#setDocumentAttributes) | **PUT** /documents/{documentId}/attributes | Set document&#39;s attributes |


<a id="addDocumentAttributes"></a>
# **addDocumentAttributes**
> AddResponse addDocumentAttributes(documentId, addDocumentAttributesRequest, siteId)

Add attribute to document

Add multiple attributes to a document; this endpoint also accepts a different body parameter for adding a single attribute

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentAttributesApi apiInstance = new DocumentAttributesApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    AddDocumentAttributesRequest addDocumentAttributesRequest = new AddDocumentAttributesRequest(); // AddDocumentAttributesRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      AddResponse result = apiInstance.addDocumentAttributes(documentId, addDocumentAttributesRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentAttributesApi#addDocumentAttributes");
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
| **addDocumentAttributesRequest** | [**AddDocumentAttributesRequest**](AddDocumentAttributesRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

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
| **201** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="deleteDocumentAttribute"></a>
# **deleteDocumentAttribute**
> DeleteResponse deleteDocumentAttribute(documentId, attributeKey, siteId)

Delete document attribute

Delete a document attribute by using its key

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentAttributesApi apiInstance = new DocumentAttributesApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String attributeKey = "attributeKey_example"; // String | Attribute Key
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      DeleteResponse result = apiInstance.deleteDocumentAttribute(documentId, attributeKey, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentAttributesApi#deleteDocumentAttribute");
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
| **attributeKey** | **String**| Attribute Key | |
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

<a id="deleteDocumentAttributeAndValue"></a>
# **deleteDocumentAttributeAndValue**
> DeleteResponse deleteDocumentAttributeAndValue(documentId, attributeKey, attributeValue, siteId)

Delete document&#39;s attribute value

Delete a specific document attribute key/value combination; the request will be ignored if there is no valid key/value combination found

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentAttributesApi apiInstance = new DocumentAttributesApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String attributeKey = "attributeKey_example"; // String | Attribute Key
    String attributeValue = "attributeValue_example"; // String | Attribute Value
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      DeleteResponse result = apiInstance.deleteDocumentAttributeAndValue(documentId, attributeKey, attributeValue, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentAttributesApi#deleteDocumentAttributeAndValue");
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
| **attributeKey** | **String**| Attribute Key | |
| **attributeValue** | **String**| Attribute Value | |
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

<a id="getDocumentAttribute"></a>
# **getDocumentAttribute**
> GetDocumentAttributeResponse getDocumentAttribute(documentId, attributeKey, siteId)

Get document attribute by key

Get a document attribute by using its key

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentAttributesApi apiInstance = new DocumentAttributesApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String attributeKey = "attributeKey_example"; // String | Attribute Key
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      GetDocumentAttributeResponse result = apiInstance.getDocumentAttribute(documentId, attributeKey, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentAttributesApi#getDocumentAttribute");
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
| **attributeKey** | **String**| Attribute Key | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**GetDocumentAttributeResponse**](GetDocumentAttributeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getDocumentAttributeVersions"></a>
# **getDocumentAttributeVersions**
> GetDocumentAttributeVersionsResponse getDocumentAttributeVersions(documentId, attributeKey, siteId, limit, next)

Get document attribute&#39;s versions

Get a listing of a document&#39;s attribute versions; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentAttributesApi apiInstance = new DocumentAttributesApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String attributeKey = "attributeKey_example"; // String | Attribute Key
    String siteId = "siteId_example"; // String | Site Identifier
    String limit = "10"; // String | Limit Results
    String next = "next_example"; // String | Next page of results token
    try {
      GetDocumentAttributeVersionsResponse result = apiInstance.getDocumentAttributeVersions(documentId, attributeKey, siteId, limit, next);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentAttributesApi#getDocumentAttributeVersions");
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
| **attributeKey** | **String**| Attribute Key | |
| **siteId** | **String**| Site Identifier | [optional] |
| **limit** | **String**| Limit Results | [optional] [default to 10] |
| **next** | **String**| Next page of results token | [optional] |

### Return type

[**GetDocumentAttributeVersionsResponse**](GetDocumentAttributeVersionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getDocumentAttributes"></a>
# **getDocumentAttributes**
> GetDocumentAttributesResponse getDocumentAttributes(documentId, siteId, limit, next)

Get document&#39;s attributes

Get a listing of a document&#39;s attributes

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentAttributesApi apiInstance = new DocumentAttributesApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    String limit = "10"; // String | Limit Results
    String next = "next_example"; // String | Next page of results token
    try {
      GetDocumentAttributesResponse result = apiInstance.getDocumentAttributes(documentId, siteId, limit, next);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentAttributesApi#getDocumentAttributes");
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
| **next** | **String**| Next page of results token | [optional] |

### Return type

[**GetDocumentAttributesResponse**](GetDocumentAttributesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="setDocumentAttributeValue"></a>
# **setDocumentAttributeValue**
> SetResponse setDocumentAttributeValue(documentId, attributeKey, setDocumentAttributeRequest, siteId)

Set document&#39;s attributes value

Set attributes value to a document

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentAttributesApi apiInstance = new DocumentAttributesApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String attributeKey = "attributeKey_example"; // String | Attribute Key
    SetDocumentAttributeRequest setDocumentAttributeRequest = new SetDocumentAttributeRequest(); // SetDocumentAttributeRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      SetResponse result = apiInstance.setDocumentAttributeValue(documentId, attributeKey, setDocumentAttributeRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentAttributesApi#setDocumentAttributeValue");
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
| **attributeKey** | **String**| Attribute Key | |
| **setDocumentAttributeRequest** | [**SetDocumentAttributeRequest**](SetDocumentAttributeRequest.md)|  | |
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

<a id="setDocumentAttributes"></a>
# **setDocumentAttributes**
> SetResponse setDocumentAttributes(documentId, setDocumentAttributesRequest, siteId)

Set document&#39;s attributes

Set multiple attributes to a document; this endpoint also accepts a different body parameter for setting a single attribute  Note: - attributes in the request will overwrite existing attributes.

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentAttributesApi apiInstance = new DocumentAttributesApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    SetDocumentAttributesRequest setDocumentAttributesRequest = new SetDocumentAttributesRequest(); // SetDocumentAttributesRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      SetResponse result = apiInstance.setDocumentAttributes(documentId, setDocumentAttributesRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentAttributesApi#setDocumentAttributes");
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
| **setDocumentAttributesRequest** | [**SetDocumentAttributesRequest**](SetDocumentAttributesRequest.md)|  | |
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

