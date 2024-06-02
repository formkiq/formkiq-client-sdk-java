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

Add one or more actions to a document; this appends actions and does not replace previous actions  Each action type supports a different set of parameters as shown in the table below:  ### Action Parameters  | ActionType | Parameter | Description | Example | | -------- | ------- | ------- | ------- | | OCR  | ocrParseTypes | Ocr Parsing strategy to use | TEXT, FORMS, TABLES | | OCR | ocrEngine     | Ocr Engine to use | tesseract or textract | | OCR | ocrExportToCsv     | Convert OCR result to CSV (textract table only) | true | | OCR | ocrNumberOfPages  | Number of pages to OCR (from start) | -1 | | OCR    | addPdfDetectedCharactersAsText | PDF Documents convert images to text | true or false | | FULLTEXT    | characterMax    | Maximum number of characters to add to Fulltext destination | -1 | | DOCUMENTTAGGING    | engine    | Tagging Engine to use | chatgpt | | DOCUMENTTAGGING    | tags    | Comma-deliminted list of keywords | author,title,description | | WEBHOOK    | url    | Webhook URL | https://yourdomain.com/webhook-endpoint | | NOTIFICATION    | notificationType | Type of Notification | email | | NOTIFICATION    | notificationToCc    | Notification Carbon Copy | &lt;email&gt;@yourdomain.com | | NOTIFICATION    | notificationToBcc    | Notification Blind Carbon Copy | &lt;email&gt;@yourdomain.com | | NOTIFICATION    | notificationSubject    | Notification Subject | Email Subject | | NOTIFICATION    | notificationText    | Notification as Text | Email Text | | NOTIFICATION    | notificationHtml    | Notification as Html | Email HTML Text | | QUEUE    | queueId    | Id of Queue | | | IDP    | mappingId    | Id of Mapping | |

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
> GetDocumentActionsResponse getDocumentActions(documentId, siteId, limit, shareKey, next)

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
    String limit = "10"; // String | Limit Results
    String shareKey = "shareKey_example"; // String | Share Identifier
    String next = "next_example"; // String | Next page of results token
    try {
      GetDocumentActionsResponse result = apiInstance.getDocumentActions(documentId, siteId, limit, shareKey, next);
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
| **limit** | **String**| Limit Results | [optional] [default to 10] |
| **shareKey** | **String**| Share Identifier | [optional] |
| **next** | **String**| Next page of results token | [optional] |

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

