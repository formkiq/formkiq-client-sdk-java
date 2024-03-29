# PublicApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**publicAddDocument**](PublicApi.md#publicAddDocument) | **POST** /public/documents | Public add document |
| [**publicAddWebhook**](PublicApi.md#publicAddWebhook) | **POST** /public/webhooks/{webhooks+} | Public add webhook |


<a id="publicAddDocument"></a>
# **publicAddDocument**
> AddDocumentResponse publicAddDocument(addDocumentRequest, siteId)

Public add document

Allow unauthenticated creation of new documents; must be enabled during installation (disabled by default)  See POST /documents/{documentId}/tags for adding tags to document schema  See POST /documents/{documentId}/actions for adding actions to document schema

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")

    PublicApi apiInstance = new PublicApi(defaultClient);
    AddDocumentRequest addDocumentRequest = new AddDocumentRequest(); // AddDocumentRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      AddDocumentResponse result = apiInstance.publicAddDocument(addDocumentRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#publicAddDocument");
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

<a id="publicAddWebhook"></a>
# **publicAddWebhook**
> DocumentId publicAddWebhook(webhooksPlus, body, siteId)

Public add webhook

Receive an incoming public post to a specified webhook and creates a document based on the data sent; must be enabled during installation (disabled by default)

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")

    PublicApi apiInstance = new PublicApi(defaultClient);
    String webhooksPlus = "webhooksPlus_example"; // String | Web Hook Param
    Object body = null; // Object | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      DocumentId result = apiInstance.publicAddWebhook(webhooksPlus, body, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#publicAddWebhook");
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
| **webhooksPlus** | **String**| Web Hook Param | |
| **body** | **Object**|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**DocumentId**](DocumentId.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

