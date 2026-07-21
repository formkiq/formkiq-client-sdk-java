# DocumentNotificationsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDocumentNotification**](DocumentNotificationsApi.md#addDocumentNotification) | **POST** /documents/{documentId}/notifications | Add an ad hoc document notification |
| [**getDocumentNotifications**](DocumentNotificationsApi.md#getDocumentNotifications) | **GET** /documents/{documentId}/notifications | Get document notifications |
| [**getUserNotifications**](DocumentNotificationsApi.md#getUserNotifications) | **GET** /userNotifications | Get user notifications |


<a id="addDocumentNotification"></a>
# **addDocumentNotification**
> AddDocumentNotificationResponse addDocumentNotification(documentId, addDocumentNotificationRequest, siteId, artifactId)

Add an ad hoc document notification

Queue an ad hoc notification for a document or one of its artifacts

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentNotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentNotificationsApi apiInstance = new DocumentNotificationsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    AddDocumentNotificationRequest addDocumentNotificationRequest = new AddDocumentNotificationRequest(); // AddDocumentNotificationRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    String artifactId = "artifactId_example"; // String | Artifact Document Identifier
    try {
      AddDocumentNotificationResponse result = apiInstance.addDocumentNotification(documentId, addDocumentNotificationRequest, siteId, artifactId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentNotificationsApi#addDocumentNotification");
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
| **addDocumentNotificationRequest** | [**AddDocumentNotificationRequest**](AddDocumentNotificationRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |
| **artifactId** | **String**| Artifact Document Identifier | [optional] |

### Return type

[**AddDocumentNotificationResponse**](AddDocumentNotificationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Notification accepted for delivery |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | Invalid notification request |  -  |

<a id="getDocumentNotifications"></a>
# **getDocumentNotifications**
> GetDocumentNotificationsResponse getDocumentNotifications(documentId, siteId, artifactId, limit, next)

Get document notifications

Get notifications attached to a document or one of its artifacts

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentNotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentNotificationsApi apiInstance = new DocumentNotificationsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    String artifactId = "artifactId_example"; // String | Artifact Document Identifier
    String limit = "10"; // String | Limit Results
    String next = "next_example"; // String | Next page of results token
    try {
      GetDocumentNotificationsResponse result = apiInstance.getDocumentNotifications(documentId, siteId, artifactId, limit, next);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentNotificationsApi#getDocumentNotifications");
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

[**GetDocumentNotificationsResponse**](GetDocumentNotificationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getUserNotifications"></a>
# **getUserNotifications**
> GetUserNotificationsResponse getUserNotifications(siteId, limit, next)

Get user notifications

Retrieve notifications where the authenticated user&#39;s email is a CC or BCC recipient

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentNotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentNotificationsApi apiInstance = new DocumentNotificationsApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    String limit = "10"; // String | Limit Results
    String next = "next_example"; // String | Next page of results token
    try {
      GetUserNotificationsResponse result = apiInstance.getUserNotifications(siteId, limit, next);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentNotificationsApi#getUserNotifications");
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
| **limit** | **String**| Limit Results | [optional] [default to 10] |
| **next** | **String**| Next page of results token | [optional] |

### Return type

[**GetUserNotificationsResponse**](GetUserNotificationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

