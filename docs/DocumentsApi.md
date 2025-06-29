# DocumentsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDocument**](DocumentsApi.md#addDocument) | **POST** /documents | Add new document |
| [**addDocumentSync**](DocumentsApi.md#addDocumentSync) | **POST** /documents/{documentId}/syncs | Add document sync to service |
| [**addDocumentUpload**](DocumentsApi.md#addDocumentUpload) | **POST** /documents/upload | Add large document |
| [**compressDocuments**](DocumentsApi.md#compressDocuments) | **POST** /documents/compress | Compress multiple documents into a .zip file |
| [**deleteDocument**](DocumentsApi.md#deleteDocument) | **DELETE** /documents/{documentId} | Delete document |
| [**deletePublishedDocumentContent**](DocumentsApi.md#deletePublishedDocumentContent) | **DELETE** /publications/{documentId} | Delete published document&#39;s contents |
| [**getDocument**](DocumentsApi.md#getDocument) | **GET** /documents/{documentId} | Get document |
| [**getDocumentContent**](DocumentsApi.md#getDocumentContent) | **GET** /documents/{documentId}/content | Get document&#39;s contents |
| [**getDocumentIdUpload**](DocumentsApi.md#getDocumentIdUpload) | **GET** /documents/{documentId}/upload | Get url to update large document |
| [**getDocumentSyncs**](DocumentsApi.md#getDocumentSyncs) | **GET** /documents/{documentId}/syncs | Get document syncs |
| [**getDocumentUpload**](DocumentsApi.md#getDocumentUpload) | **GET** /documents/upload | Get url to add large document |
| [**getDocumentUrl**](DocumentsApi.md#getDocumentUrl) | **GET** /documents/{documentId}/url | Get document content url |
| [**getDocuments**](DocumentsApi.md#getDocuments) | **GET** /documents | Get Documents listing |
| [**getPublishedDocumentContent**](DocumentsApi.md#getPublishedDocumentContent) | **GET** /publications/{documentId} | Get published document&#39;s contents |
| [**purgeDocument**](DocumentsApi.md#purgeDocument) | **DELETE** /documents/{documentId}/purge | Purge document |
| [**setDocumentRestore**](DocumentsApi.md#setDocumentRestore) | **PUT** /documents/{documentId}/restore | Restore soft deleted document |
| [**updateDocument**](DocumentsApi.md#updateDocument) | **PATCH** /documents/{documentId} | Update document |


<a id="addDocument"></a>
# **addDocument**
> AddDocumentResponse addDocument(addDocumentRequest, siteId, shareKey)

Add new document

Creates a new document; body may include document content if less than 5 MB.  Returns a unique **documentId** used in subsequent operations.  See POST /documents/{documentId}/tags for adding tags to document schema  See POST /documents/{documentId}/actions for adding actions to document schema

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    AddDocumentRequest addDocumentRequest = new AddDocumentRequest(); // AddDocumentRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    String shareKey = "shareKey_example"; // String | Share Identifier
    try {
      AddDocumentResponse result = apiInstance.addDocument(addDocumentRequest, siteId, shareKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#addDocument");
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
| **addDocumentRequest** | [**AddDocumentRequest**](AddDocumentRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |
| **shareKey** | **String**| Share Identifier | [optional] |

### Return type

[**AddDocumentResponse**](AddDocumentResponse.md)

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

<a id="addDocumentSync"></a>
# **addDocumentSync**
> AddResponse addDocumentSync(documentId, siteId, addDocumentSyncRequest)

Add document sync to service

Add a document to a service

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    AddDocumentSyncRequest addDocumentSyncRequest = new AddDocumentSyncRequest(); // AddDocumentSyncRequest | 
    try {
      AddResponse result = apiInstance.addDocumentSync(documentId, siteId, addDocumentSyncRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#addDocumentSync");
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
| **addDocumentSyncRequest** | [**AddDocumentSyncRequest**](AddDocumentSyncRequest.md)|  | [optional] |

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
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="addDocumentUpload"></a>
# **addDocumentUpload**
> GetDocumentUrlResponse addDocumentUpload(addDocumentUploadRequest, siteId, contentLength, duration, shareKey)

Add large document

Returns a URL that can be used to upload document content and create a new document, while allowing metadata to also be sent; this endpoint (whether GET or POST) is required in order to add content that is larger than 5 MB. The POST endpoint allow the adding of document metadata at the same time as the document is created.

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    AddDocumentUploadRequest addDocumentUploadRequest = new AddDocumentUploadRequest(); // AddDocumentUploadRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    Integer contentLength = 56; // Integer | Indicates the size of the entity-body
    Integer duration = 56; // Integer | Indicates the number of hours request is valid for
    String shareKey = "shareKey_example"; // String | Share Identifier
    try {
      GetDocumentUrlResponse result = apiInstance.addDocumentUpload(addDocumentUploadRequest, siteId, contentLength, duration, shareKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#addDocumentUpload");
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
| **addDocumentUploadRequest** | [**AddDocumentUploadRequest**](AddDocumentUploadRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |
| **contentLength** | **Integer**| Indicates the size of the entity-body | [optional] |
| **duration** | **Integer**| Indicates the number of hours request is valid for | [optional] |
| **shareKey** | **String**| Share Identifier | [optional] |

### Return type

[**GetDocumentUrlResponse**](GetDocumentUrlResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 CREATED |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="compressDocuments"></a>
# **compressDocuments**
> DocumentsCompressResponse compressDocuments(documentsCompressRequest, siteId)

Compress multiple documents into a .zip file

Compress documents into an .ZIP archive file, and returns a S3 presigned url for the location of the archive file. The operation is async and processing time depends on the number and size of documents included; a 404 status code is returned until the file is ready.

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    DocumentsCompressRequest documentsCompressRequest = new DocumentsCompressRequest(); // DocumentsCompressRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      DocumentsCompressResponse result = apiInstance.compressDocuments(documentsCompressRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#compressDocuments");
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
| **documentsCompressRequest** | [**DocumentsCompressRequest**](DocumentsCompressRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**DocumentsCompressResponse**](DocumentsCompressResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 CREATED |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="deleteDocument"></a>
# **deleteDocument**
> DeleteResponse deleteDocument(documentId, siteId, softDelete)

Delete document

Delete a document&#39;s details, i.e., metadata, contents, etc  SoftDelete:  The SoftDelete parameter allows for the temporary removal of a document&#39;s metadata, attributes, etc from being retrieved from all API requests.  The document can be permanently deleted by calling the DELETE /documents/{documentId} with softDelete&#x3D;false or restored using the PUT /documents/{documentId}/restore.  Only the GET /documents?deleted&#x3D;true will return all the soft deleted documents.

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    Boolean softDelete = true; // Boolean | Whether to soft delete document
    try {
      DeleteResponse result = apiInstance.deleteDocument(documentId, siteId, softDelete);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#deleteDocument");
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
| **softDelete** | **Boolean**| Whether to soft delete document | [optional] |

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

<a id="deletePublishedDocumentContent"></a>
# **deletePublishedDocumentContent**
> DeleteResponse deletePublishedDocumentContent(documentId, siteId)

Delete published document&#39;s contents

Delete a published document&#39;s contents. Certain content types, text/_*, application/json, and application/x-www-form-urlencoded. return the  \&quot;content\&quot; field, while all other content types return a &#39;contentUrl&#39; for retrieving the content.

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      DeleteResponse result = apiInstance.deletePublishedDocumentContent(documentId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#deletePublishedDocumentContent");
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

<a id="getDocument"></a>
# **getDocument**
> GetDocumentResponse getDocument(documentId, siteId, shareKey)

Get document

Retrieves a document&#39;s details, i.e., metadata

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    String shareKey = "shareKey_example"; // String | Share Identifier
    try {
      GetDocumentResponse result = apiInstance.getDocument(documentId, siteId, shareKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#getDocument");
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

[**GetDocumentResponse**](GetDocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getDocumentContent"></a>
# **getDocumentContent**
> GetDocumentContentResponse getDocumentContent(documentId, siteId, versionKey, shareKey)

Get document&#39;s contents

Retrieves the content of the document with the specified &#x60;documentId&#x60;. - If the content is plain text and under 6 MB, the content will be returned directly. - If the content is plain text but exceeds 6 MB, an error will be returned. - For documents not in plain text format, pre-signed S3 URLs will be returned to download the content from S3. It is recommended to use the &#x60;/documents/{documentId}/url&#x60; endpoint to retrieve pre-signed S3 URLs for downloading the content.  If the document has a Content-Type of text/, application/json, application/x-www-form-urlencoded the content field will be returned.  All other Content-Type, the contentUrl field will be returned, which is a S3 Presigned url. 

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    String versionKey = "versionKey_example"; // String | Version Key (version key required URL encoding)
    String shareKey = "shareKey_example"; // String | Share Identifier
    try {
      GetDocumentContentResponse result = apiInstance.getDocumentContent(documentId, siteId, versionKey, shareKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#getDocumentContent");
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
| **versionKey** | **String**| Version Key (version key required URL encoding) | [optional] |
| **shareKey** | **String**| Share Identifier | [optional] |

### Return type

[**GetDocumentContentResponse**](GetDocumentContentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  * Location -  <br>  |

<a id="getDocumentIdUpload"></a>
# **getDocumentIdUpload**
> GetDocumentUrlResponse getDocumentIdUpload(documentId, siteId, checksumType, checksum, contentLength, duration, shareKey)

Get url to update large document

Returns a URL that can be used to upload documents for a specific documentId; this endpoint is required in order to add content that is larger than 5 MB. If versions are enabled, this will create a new version of the document.

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    String checksumType = "SHA1"; // String | Checksum Type
    String checksum = "checksum_example"; // String | Checksum value
    Integer contentLength = 56; // Integer | Indicates the size of the entity-body
    Integer duration = 56; // Integer | Indicates the number of hours request is valid for
    String shareKey = "shareKey_example"; // String | Share Identifier
    try {
      GetDocumentUrlResponse result = apiInstance.getDocumentIdUpload(documentId, siteId, checksumType, checksum, contentLength, duration, shareKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#getDocumentIdUpload");
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
| **checksumType** | **String**| Checksum Type | [optional] [enum: SHA1, SHA256] |
| **checksum** | **String**| Checksum value | [optional] |
| **contentLength** | **Integer**| Indicates the size of the entity-body | [optional] |
| **duration** | **Integer**| Indicates the number of hours request is valid for | [optional] |
| **shareKey** | **String**| Share Identifier | [optional] |

### Return type

[**GetDocumentUrlResponse**](GetDocumentUrlResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getDocumentSyncs"></a>
# **getDocumentSyncs**
> GetDocumentSyncResponse getDocumentSyncs(documentId, siteId, limit, shareKey)

Get document syncs

Retrieve the document syncs with external services status

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    String limit = "10"; // String | Limit Results
    String shareKey = "shareKey_example"; // String | Share Identifier
    try {
      GetDocumentSyncResponse result = apiInstance.getDocumentSyncs(documentId, siteId, limit, shareKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#getDocumentSyncs");
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

### Return type

[**GetDocumentSyncResponse**](GetDocumentSyncResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getDocumentUpload"></a>
# **getDocumentUpload**
> GetDocumentUrlResponse getDocumentUpload(path, siteId, checksumType, checksum, contentLength, duration, shareKey)

Get url to add large document

Returns a URL that can be used to upload document content and create a new document; this endpoint (whether GET or POST) is required in order to add content that is larger than 5 MB

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String path = "path_example"; // String | The upload file's path
    String siteId = "siteId_example"; // String | Site Identifier
    String checksumType = "SHA1"; // String | Checksum Type
    String checksum = "checksum_example"; // String | Checksum value
    Integer contentLength = 56; // Integer | Indicates the size of the entity-body
    Integer duration = 56; // Integer | Indicates the number of hours request is valid for
    String shareKey = "shareKey_example"; // String | Share Identifier
    try {
      GetDocumentUrlResponse result = apiInstance.getDocumentUpload(path, siteId, checksumType, checksum, contentLength, duration, shareKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#getDocumentUpload");
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
| **path** | **String**| The upload file&#39;s path | [optional] |
| **siteId** | **String**| Site Identifier | [optional] |
| **checksumType** | **String**| Checksum Type | [optional] [enum: SHA1, SHA256] |
| **checksum** | **String**| Checksum value | [optional] |
| **contentLength** | **Integer**| Indicates the size of the entity-body | [optional] |
| **duration** | **Integer**| Indicates the number of hours request is valid for | [optional] |
| **shareKey** | **String**| Share Identifier | [optional] |

### Return type

[**GetDocumentUrlResponse**](GetDocumentUrlResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getDocumentUrl"></a>
# **getDocumentUrl**
> GetDocumentUrlResponse getDocumentUrl(documentId, siteId, versionKey, duration, shareKey, inline, bypassWatermark)

Get document content url

Returns a URL for the document&#39;s contents; this URL will expire (the default is 48 hours)

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    String versionKey = "versionKey_example"; // String | Version Key (version key required URL encoding)
    Integer duration = 56; // Integer | Indicates the number of hours request is valid for
    String shareKey = "shareKey_example"; // String | Share Identifier
    Boolean inline = false; // Boolean | Set the Content-Disposition to inline
    Boolean bypassWatermark = false; // Boolean | Allow the by pass of watermark (only allowed by GOVERN / ADMIN permissions)
    try {
      GetDocumentUrlResponse result = apiInstance.getDocumentUrl(documentId, siteId, versionKey, duration, shareKey, inline, bypassWatermark);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#getDocumentUrl");
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
| **versionKey** | **String**| Version Key (version key required URL encoding) | [optional] |
| **duration** | **Integer**| Indicates the number of hours request is valid for | [optional] |
| **shareKey** | **String**| Share Identifier | [optional] |
| **inline** | **Boolean**| Set the Content-Disposition to inline | [optional] [default to false] |
| **bypassWatermark** | **Boolean**| Allow the by pass of watermark (only allowed by GOVERN / ADMIN permissions) | [optional] [default to false] |

### Return type

[**GetDocumentUrlResponse**](GetDocumentUrlResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getDocuments"></a>
# **getDocuments**
> GetDocumentsResponse getDocuments(siteId, actionStatus, syncStatus, deleted, date, tz, next, previous, limit)

Get Documents listing

Returns a list of the most recent documents added, ordered by inserted, descending

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    String actionStatus = "FAILED"; // String | Fetch documents with an action status
    String syncStatus = "FULLTEXT_METADATA_FAILED"; // String | Fetch documents with an sync status
    Boolean deleted = true; // Boolean | Fetch soft deleted documents
    String date = "date_example"; // String | Fetch documents inserted on a certain date (yyyy-MM-dd)
    String tz = "tz_example"; // String | UTC offset to apply to date parameter (IE: -0600)
    String next = "next_example"; // String | Next page of results token
    String previous = "previous_example"; // String | Previous page of results token
    String limit = "10"; // String | Limit Results
    try {
      GetDocumentsResponse result = apiInstance.getDocuments(siteId, actionStatus, syncStatus, deleted, date, tz, next, previous, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#getDocuments");
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
| **actionStatus** | **String**| Fetch documents with an action status | [optional] [enum: FAILED, IN_QUEUE, PENDING, RUNNING, SKIPPED, FAILED_RETRY] |
| **syncStatus** | **String**| Fetch documents with an sync status | [optional] [enum: FULLTEXT_METADATA_FAILED, FULLTEXT_CONTENT_FAILED] |
| **deleted** | **Boolean**| Fetch soft deleted documents | [optional] |
| **date** | **String**| Fetch documents inserted on a certain date (yyyy-MM-dd) | [optional] |
| **tz** | **String**| UTC offset to apply to date parameter (IE: -0600) | [optional] |
| **next** | **String**| Next page of results token | [optional] |
| **previous** | **String**| Previous page of results token | [optional] |
| **limit** | **String**| Limit Results | [optional] [default to 10] |

### Return type

[**GetDocumentsResponse**](GetDocumentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getPublishedDocumentContent"></a>
# **getPublishedDocumentContent**
> getPublishedDocumentContent(documentId, siteId)

Get published document&#39;s contents

Get a published document&#39;s contents. Certain content types, text/_*, application/json, and application/x-www-form-urlencoded. return the  \&quot;content\&quot; field, while all other content types return a &#39;contentUrl&#39; for retrieving the content.

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      apiInstance.getPublishedDocumentContent(documentId, siteId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#getPublishedDocumentContent");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **307** | Temporary Redirect |  * Location -  <br>  |

<a id="purgeDocument"></a>
# **purgeDocument**
> DeleteResponse purgeDocument(documentId, siteId)

Purge document

Remove all objects from the S3 bucket, including previous versions and current version, and should remove all metadata as well, so that no trace of the document exists outside of the audit logs and any backups. Can only be called be ADMIN or GOVERN.

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      DeleteResponse result = apiInstance.purgeDocument(documentId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#purgeDocument");
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

<a id="setDocumentRestore"></a>
# **setDocumentRestore**
> SetDocumentRestoreResponse setDocumentRestore(documentId, siteId)

Restore soft deleted document

Restores a soft deleted document

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      SetDocumentRestoreResponse result = apiInstance.setDocumentRestore(documentId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#setDocumentRestore");
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

[**SetDocumentRestoreResponse**](SetDocumentRestoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="updateDocument"></a>
# **updateDocument**
> AddDocumentResponse updateDocument(documentId, updateDocumentRequest, siteId, shareKey)

Update document

Update a document&#39;s details, i.e., metadata  If no content is specified, the endpoint will return a S3 Presigned that will allow for the uploading of Large document data.   NOTE: - provided attributes will overwrite existing matching attribute keys in the document. Attributes not included in the request body will remain unchanged.

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    UpdateDocumentRequest updateDocumentRequest = new UpdateDocumentRequest(); // UpdateDocumentRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    String shareKey = "shareKey_example"; // String | Share Identifier
    try {
      AddDocumentResponse result = apiInstance.updateDocument(documentId, updateDocumentRequest, siteId, shareKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#updateDocument");
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
| **updateDocumentRequest** | [**UpdateDocumentRequest**](UpdateDocumentRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |
| **shareKey** | **String**| Share Identifier | [optional] |

### Return type

[**AddDocumentResponse**](AddDocumentResponse.md)

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

