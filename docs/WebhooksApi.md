# WebhooksApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addWebhook**](WebhooksApi.md#addWebhook) | **POST** /webhooks | Add webhook |
| [**addWebhookDocument**](WebhooksApi.md#addWebhookDocument) | **POST** /private/webhooks/{webhooks+} | Add webhook |
| [**addWebhookTag**](WebhooksApi.md#addWebhookTag) | **POST** /webhooks/{webhookId}/tags | Add webhook tag |
| [**deleteWebhook**](WebhooksApi.md#deleteWebhook) | **DELETE** /webhooks/{webhookId} | Delete webhook |
| [**getWebhook**](WebhooksApi.md#getWebhook) | **GET** /webhooks/{webhookId} | Get webhook |
| [**getWebhookTags**](WebhooksApi.md#getWebhookTags) | **GET** /webhooks/{webhookId}/tags | Get webhook tags |
| [**getWebhooks**](WebhooksApi.md#getWebhooks) | **GET** /webhooks | Get webhooks |
| [**updateWebhook**](WebhooksApi.md#updateWebhook) | **PATCH** /webhooks/{webhookId} | Update webhook |


<a id="addWebhook"></a>
# **addWebhook**
> AddWebhookResponse addWebhook(addWebhookRequest, siteId)

Add webhook

Create a new webhook; once created, a webhook&#39;s id can be provided to an external service, allowing data to be sent, received, and processed via that webhook

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    AddWebhookRequest addWebhookRequest = new AddWebhookRequest(); // AddWebhookRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      AddWebhookResponse result = apiInstance.addWebhook(addWebhookRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#addWebhook");
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
| **addWebhookRequest** | [**AddWebhookRequest**](AddWebhookRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**AddWebhookResponse**](AddWebhookResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 CREATED |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="addWebhookDocument"></a>
# **addWebhookDocument**
> DocumentId addWebhookDocument(webhooksPlus, body, siteId)

Add webhook

Receive an incoming private webhook and creates a document based on the webhook&#39;s body; requires authentication

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    String webhooksPlus = "webhooksPlus_example"; // String | Web Hook Param
    Object body = null; // Object | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      DocumentId result = apiInstance.addWebhookDocument(webhooksPlus, body, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#addWebhookDocument");
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

<a id="addWebhookTag"></a>
# **addWebhookTag**
> addWebhookTag(webhookId, getDocumentTagResponse, siteId)

Add webhook tag

Add a tag to a webhook

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    String webhookId = "webhookId_example"; // String | Web Hook Param
    GetDocumentTagResponse getDocumentTagResponse = new GetDocumentTagResponse(); // GetDocumentTagResponse | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      apiInstance.addWebhookTag(webhookId, getDocumentTagResponse, siteId);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#addWebhookTag");
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
| **webhookId** | **String**| Web Hook Param | |
| **getDocumentTagResponse** | [**GetDocumentTagResponse**](GetDocumentTagResponse.md)|  | |
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

<a id="deleteWebhook"></a>
# **deleteWebhook**
> deleteWebhook(webhookId, siteId)

Delete webhook

Delete a webhook; this will disable sending, receiving, or processing of data from external services to this webhook

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    String webhookId = "webhookId_example"; // String | Web Hook Param
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      apiInstance.deleteWebhook(webhookId, siteId);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#deleteWebhook");
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
| **webhookId** | **String**| Web Hook Param | |
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

<a id="getWebhook"></a>
# **getWebhook**
> GetWebhookResponse getWebhook(webhookId, siteId)

Get webhook

Return a webhook&#39;s details, i.e., its metadata

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    String webhookId = "webhookId_example"; // String | Web Hook Param
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      GetWebhookResponse result = apiInstance.getWebhook(webhookId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#getWebhook");
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
| **webhookId** | **String**| Web Hook Param | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**GetWebhookResponse**](GetWebhookResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getWebhookTags"></a>
# **getWebhookTags**
> GetWebhookTagsResponse getWebhookTags(webhookId, siteId)

Get webhook tags

Get a webhook&#39;s tags

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    String webhookId = "webhookId_example"; // String | Web Hook Param
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      GetWebhookTagsResponse result = apiInstance.getWebhookTags(webhookId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#getWebhookTags");
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
| **webhookId** | **String**| Web Hook Param | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**GetWebhookTagsResponse**](GetWebhookTagsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getWebhooks"></a>
# **getWebhooks**
> GetWebhooksResponse getWebhooks(siteId)

Get webhooks

Return a list of webhooks; each webhook&#39;s id can be provided to an external service, allowing data to be sent, received, and processed via that webhook

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      GetWebhooksResponse result = apiInstance.getWebhooks(siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#getWebhooks");
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

### Return type

[**GetWebhooksResponse**](GetWebhooksResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="updateWebhook"></a>
# **updateWebhook**
> updateWebhook(webhookId, addWebhookRequest, siteId)

Update webhook

Updates a webhook&#39;s details, i.e., its metadata

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    String webhookId = "webhookId_example"; // String | Web Hook Param
    AddWebhookRequest addWebhookRequest = new AddWebhookRequest(); // AddWebhookRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      apiInstance.updateWebhook(webhookId, addWebhookRequest, siteId);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#updateWebhook");
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
| **webhookId** | **String**| Web Hook Param | |
| **addWebhookRequest** | [**AddWebhookRequest**](AddWebhookRequest.md)|  | |
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

