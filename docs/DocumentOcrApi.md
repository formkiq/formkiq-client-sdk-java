# DocumentOcrApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDocumentOcr**](DocumentOcrApi.md#addDocumentOcr) | **POST** /documents/{documentId}/ocr | Perform document ocr |
| [**deleteDocumentOcr**](DocumentOcrApi.md#deleteDocumentOcr) | **DELETE** /documents/{documentId}/ocr | Delete document ocr |
| [**getDocumentOcr**](DocumentOcrApi.md#getDocumentOcr) | **GET** /documents/{documentId}/ocr | Get document ocr content |
| [**setDocumentOcr**](DocumentOcrApi.md#setDocumentOcr) | **PUT** /documents/{documentId}/ocr | Set document ocr result |


<a id="addDocumentOcr"></a>
# **addDocumentOcr**
> AddDocumentOcrResponse addDocumentOcr(documentId, siteId, addDocumentOcrRequest)

Perform document ocr

Document optical character recognition (OCR) request; extract text and data from a document;   Tesseract available for all editions, but Textract engine and tables and forms options available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentOcrApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentOcrApi apiInstance = new DocumentOcrApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    AddDocumentOcrRequest addDocumentOcrRequest = new AddDocumentOcrRequest(); // AddDocumentOcrRequest | 
    try {
      AddDocumentOcrResponse result = apiInstance.addDocumentOcr(documentId, siteId, addDocumentOcrRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentOcrApi#addDocumentOcr");
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
| **addDocumentOcrRequest** | [**AddDocumentOcrRequest**](AddDocumentOcrRequest.md)|  | [optional] |

### Return type

[**AddDocumentOcrResponse**](AddDocumentOcrResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="deleteDocumentOcr"></a>
# **deleteDocumentOcr**
> DeleteResponse deleteDocumentOcr(documentId, siteId)

Delete document ocr

Delete a document&#39;s optical character recognition (OCR) result, if exists;   Tesseract available for all editions, but Textract engine and tables and forms options available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentOcrApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentOcrApi apiInstance = new DocumentOcrApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      DeleteResponse result = apiInstance.deleteDocumentOcr(documentId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentOcrApi#deleteDocumentOcr");
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

<a id="getDocumentOcr"></a>
# **getDocumentOcr**
> GetDocumentOcrResponse getDocumentOcr(documentId, siteId, outputType, contentUrl, text, shareKey)

Get document ocr content

Get a document&#39;s optical character recognition (OCR) result, if exists;   Tesseract available for all editions, but Textract engine and tables and forms options available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentOcrApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentOcrApi apiInstance = new DocumentOcrApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    String outputType = "TEXT"; // String | Output Format Type
    String contentUrl = "contentUrl_example"; // String | Whether to return a \"contentUrl\", set value to 'true' (deprecated)
    String text = "text_example"; // String | Returns raw 'text' of OCR content. e.g. AWS Textract returns JSON, setting parameter to 'true' converts JSON to Text (deprecated)
    String shareKey = "shareKey_example"; // String | Share Identifier
    try {
      GetDocumentOcrResponse result = apiInstance.getDocumentOcr(documentId, siteId, outputType, contentUrl, text, shareKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentOcrApi#getDocumentOcr");
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
| **outputType** | **String**| Output Format Type | [optional] [enum: TEXT, KEY_VALUE, CONTENT_URL, TABLES] |
| **contentUrl** | **String**| Whether to return a \&quot;contentUrl\&quot;, set value to &#39;true&#39; (deprecated) | [optional] |
| **text** | **String**| Returns raw &#39;text&#39; of OCR content. e.g. AWS Textract returns JSON, setting parameter to &#39;true&#39; converts JSON to Text (deprecated) | [optional] |
| **shareKey** | **String**| Share Identifier | [optional] |

### Return type

[**GetDocumentOcrResponse**](GetDocumentOcrResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="setDocumentOcr"></a>
# **setDocumentOcr**
> AddDocumentOcrResponse setDocumentOcr(documentId, siteId, setDocumentOcrRequest)

Set document ocr result

Set a document&#39;s optical character recognition (OCR) result for a document;   Tesseract available for all editions, but Textract engine and tables and forms options available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentOcrApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentOcrApi apiInstance = new DocumentOcrApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    SetDocumentOcrRequest setDocumentOcrRequest = new SetDocumentOcrRequest(); // SetDocumentOcrRequest | 
    try {
      AddDocumentOcrResponse result = apiInstance.setDocumentOcr(documentId, siteId, setDocumentOcrRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentOcrApi#setDocumentOcr");
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
| **setDocumentOcrRequest** | [**SetDocumentOcrRequest**](SetDocumentOcrRequest.md)|  | [optional] |

### Return type

[**AddDocumentOcrResponse**](AddDocumentOcrResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

