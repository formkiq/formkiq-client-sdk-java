# DocumentActionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDocumentActions**](DocumentActionsApi.md#addDocumentActions) | **POST** /documents/{documentId}/actions | Add document action |
| [**addDocumentRetryAction**](DocumentActionsApi.md#addDocumentRetryAction) | **POST** /documents/{documentId}/actions/retry | Retries failed document action(s) |
| [**getDocumentActions**](DocumentActionsApi.md#getDocumentActions) | **GET** /documents/{documentId}/actions | Get document actions |


<a id="addDocumentActions"></a>
# **addDocumentActions**
> AddDocumentActionsResponse addDocumentActions(documentId, siteId, addDocumentActionsRequest)

Add document action

Add one or more actions to a document; this appends actions and does not replace previous actions  ### Action Parameters  | ActionType | Parameter | Description | | -------- | ------- | ------- | | OCR  | ocrParseTypes | Ocr Parsing strategy to use | | OCR | ocrEngine     | Ocr Engine to use | | OCR    | addPdfDetectedCharactersAsText | PDF Documents convert images to text | | FULLTEXT    | characterMax    | Maximum number of characters to add to Fulltext destination | | DOCUMENTTAGGING    | engine    | Tagging Engine to use | | DOCUMENTTAGGING    | tags    | Comma-deliminted list of keywords | | WEBHOOK    | url    | Webhook URL | | NOTIFICATION    | notificationType | Type of Notification | | NOTIFICATION    | notificationToCc    | Notification Carbon Copy | | NOTIFICATION    | notificationToBcc    | Notification Blind Carbon Copy | | NOTIFICATION    | notificationSubject    | Notification Subject | | NOTIFICATION    | notificationText    | Notification as Text | | NOTIFICATION    | notificationHtml    | Notification as Html | | QUEUE    | queueName    | Name of Queue |

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentActionsApi apiInstance = new DocumentActionsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    AddDocumentActionsRequest addDocumentActionsRequest = new AddDocumentActionsRequest(); // AddDocumentActionsRequest | 
    try {
      AddDocumentActionsResponse result = apiInstance.addDocumentActions(documentId, siteId, addDocumentActionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentActionsApi#addDocumentActions");
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
| **addDocumentActionsRequest** | [**AddDocumentActionsRequest**](AddDocumentActionsRequest.md)|  | [optional] |

### Return type

[**AddDocumentActionsResponse**](AddDocumentActionsResponse.md)

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

<a id="addDocumentRetryAction"></a>
# **addDocumentRetryAction**
> AddDocumentActionsRetryResponse addDocumentRetryAction(documentId, siteId)

Retries failed document action(s)

Retries all failed document action(s). Failed action status changes to \&quot;FAILED_RETRY\&quot; and a new \&quot;PENDING\&quot; action is created.

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentActionsApi apiInstance = new DocumentActionsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      AddDocumentActionsRetryResponse result = apiInstance.addDocumentRetryAction(documentId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentActionsApi#addDocumentRetryAction");
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

[**AddDocumentActionsRetryResponse**](AddDocumentActionsRetryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | 400 OK |  -  |

<a id="getDocumentActions"></a>
# **getDocumentActions**
> GetDocumentActionsResponse getDocumentActions(documentId, siteId, shareKey)

Get document actions

Get document actions and their status

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentActionsApi apiInstance = new DocumentActionsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    String shareKey = "shareKey_example"; // String | Share Identifier
    try {
      GetDocumentActionsResponse result = apiInstance.getDocumentActions(documentId, siteId, shareKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentActionsApi#getDocumentActions");
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

[**GetDocumentActionsResponse**](GetDocumentActionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

