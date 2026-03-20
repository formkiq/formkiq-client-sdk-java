# IntelligentDocumentProcessingApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDocumentMetadataExtractionResult**](IntelligentDocumentProcessingApi.md#addDocumentMetadataExtractionResult) | **POST** /documents/{documentId}/metadataExtractionResults/{llmPromptEntityName} | Add document&#39;s metadata extraction result |
| [**getAllDocumentMetadataExtractionResults**](IntelligentDocumentProcessingApi.md#getAllDocumentMetadataExtractionResults) | **GET** /documents/{documentId}/metadataExtractionResults | Get all document&#39;s metadata extraction results |
| [**getDocumentDataClassification**](IntelligentDocumentProcessingApi.md#getDocumentDataClassification) | **GET** /documents/{documentId}/dataClassification | Get document&#39;s data classification |
| [**getDocumentMetadataExtractionResults**](IntelligentDocumentProcessingApi.md#getDocumentMetadataExtractionResults) | **GET** /documents/{documentId}/metadataExtractionResults/{llmPromptEntityName} | Get document&#39;s metadata extraction results |
| [**setDocumentDataClassification**](IntelligentDocumentProcessingApi.md#setDocumentDataClassification) | **PUT** /documents/{documentId}/dataClassification | Set document&#39;s data classification |


<a id="addDocumentMetadataExtractionResult"></a>
# **addDocumentMetadataExtractionResult**
> AddDocumentMetadataExtractionResponse addDocumentMetadataExtractionResult(documentId, llmPromptEntityName, siteId, artifactId)

Add document&#39;s metadata extraction result

Create a document Metadatq Extraction Result attributes within a document; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.IntelligentDocumentProcessingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    IntelligentDocumentProcessingApi apiInstance = new IntelligentDocumentProcessingApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String llmPromptEntityName = "llmPromptEntityName_example"; // String | LlmPrompt Entity Name
    String siteId = "siteId_example"; // String | Site Identifier
    String artifactId = "artifactId_example"; // String | Artifact Document Identifier
    try {
      AddDocumentMetadataExtractionResponse result = apiInstance.addDocumentMetadataExtractionResult(documentId, llmPromptEntityName, siteId, artifactId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntelligentDocumentProcessingApi#addDocumentMetadataExtractionResult");
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
| **llmPromptEntityName** | **String**| LlmPrompt Entity Name | |
| **siteId** | **String**| Site Identifier | [optional] |
| **artifactId** | **String**| Artifact Document Identifier | [optional] |

### Return type

[**AddDocumentMetadataExtractionResponse**](AddDocumentMetadataExtractionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getAllDocumentMetadataExtractionResults"></a>
# **getAllDocumentMetadataExtractionResults**
> GetDocumentMetadataExtractionResponse getAllDocumentMetadataExtractionResults(documentId, siteId, artifactId, limit, next)

Get all document&#39;s metadata extraction results

Retrieve all document&#39;s metadata extraction; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.IntelligentDocumentProcessingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    IntelligentDocumentProcessingApi apiInstance = new IntelligentDocumentProcessingApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    String artifactId = "artifactId_example"; // String | Artifact Document Identifier
    String limit = "10"; // String | Limit Results
    String next = "next_example"; // String | Next page of results token
    try {
      GetDocumentMetadataExtractionResponse result = apiInstance.getAllDocumentMetadataExtractionResults(documentId, siteId, artifactId, limit, next);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntelligentDocumentProcessingApi#getAllDocumentMetadataExtractionResults");
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
| **artifactId** | **String**| Artifact Document Identifier | [optional] |
| **limit** | **String**| Limit Results | [optional] [default to 10] |
| **next** | **String**| Next page of results token | [optional] |

### Return type

[**GetDocumentMetadataExtractionResponse**](GetDocumentMetadataExtractionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getDocumentDataClassification"></a>
# **getDocumentDataClassification**
> GetDocumentDataClassificationResponse getDocumentDataClassification(documentId, siteId, artifactId, limit, next)

Get document&#39;s data classification

Retrieve an document&#39;s data classification; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.IntelligentDocumentProcessingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    IntelligentDocumentProcessingApi apiInstance = new IntelligentDocumentProcessingApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    String artifactId = "artifactId_example"; // String | Artifact Document Identifier
    String limit = "10"; // String | Limit Results
    String next = "next_example"; // String | Next page of results token
    try {
      GetDocumentDataClassificationResponse result = apiInstance.getDocumentDataClassification(documentId, siteId, artifactId, limit, next);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntelligentDocumentProcessingApi#getDocumentDataClassification");
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
| **artifactId** | **String**| Artifact Document Identifier | [optional] |
| **limit** | **String**| Limit Results | [optional] [default to 10] |
| **next** | **String**| Next page of results token | [optional] |

### Return type

[**GetDocumentDataClassificationResponse**](GetDocumentDataClassificationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getDocumentMetadataExtractionResults"></a>
# **getDocumentMetadataExtractionResults**
> GetDocumentMetadataExtractionResponse getDocumentMetadataExtractionResults(documentId, llmPromptEntityName, siteId, artifactId, limit, next)

Get document&#39;s metadata extraction results

Retrieve an document&#39;s metadata extraction; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.IntelligentDocumentProcessingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    IntelligentDocumentProcessingApi apiInstance = new IntelligentDocumentProcessingApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String llmPromptEntityName = "llmPromptEntityName_example"; // String | LlmPrompt Entity Name
    String siteId = "siteId_example"; // String | Site Identifier
    String artifactId = "artifactId_example"; // String | Artifact Document Identifier
    String limit = "10"; // String | Limit Results
    String next = "next_example"; // String | Next page of results token
    try {
      GetDocumentMetadataExtractionResponse result = apiInstance.getDocumentMetadataExtractionResults(documentId, llmPromptEntityName, siteId, artifactId, limit, next);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntelligentDocumentProcessingApi#getDocumentMetadataExtractionResults");
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
| **llmPromptEntityName** | **String**| LlmPrompt Entity Name | |
| **siteId** | **String**| Site Identifier | [optional] |
| **artifactId** | **String**| Artifact Document Identifier | [optional] |
| **limit** | **String**| Limit Results | [optional] [default to 10] |
| **next** | **String**| Next page of results token | [optional] |

### Return type

[**GetDocumentMetadataExtractionResponse**](GetDocumentMetadataExtractionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="setDocumentDataClassification"></a>
# **setDocumentDataClassification**
> SetDocumentDataClassificationResponse setDocumentDataClassification(documentId, siteId, artifactId, setDocumentDataClassificationRequest)

Set document&#39;s data classification

Generate Data Classfication attributes within a document; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.IntelligentDocumentProcessingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    IntelligentDocumentProcessingApi apiInstance = new IntelligentDocumentProcessingApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    String artifactId = "artifactId_example"; // String | Artifact Document Identifier
    SetDocumentDataClassificationRequest setDocumentDataClassificationRequest = new SetDocumentDataClassificationRequest(); // SetDocumentDataClassificationRequest | 
    try {
      SetDocumentDataClassificationResponse result = apiInstance.setDocumentDataClassification(documentId, siteId, artifactId, setDocumentDataClassificationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntelligentDocumentProcessingApi#setDocumentDataClassification");
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
| **artifactId** | **String**| Artifact Document Identifier | [optional] |
| **setDocumentDataClassificationRequest** | [**SetDocumentDataClassificationRequest**](SetDocumentDataClassificationRequest.md)|  | [optional] |

### Return type

[**SetDocumentDataClassificationResponse**](SetDocumentDataClassificationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

