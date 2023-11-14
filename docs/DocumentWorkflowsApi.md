# DocumentWorkflowsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDocumentWorkflow**](DocumentWorkflowsApi.md#addDocumentWorkflow) | **POST** /documents/{documentId}/workflows | Add document workflow |
| [**addDocumentWorkflowDecisions**](DocumentWorkflowsApi.md#addDocumentWorkflowDecisions) | **POST** /documents/{documentId}/workflow/{workflowId}/decisions | Approve/Reject document in approval queue |
| [**addQueue**](DocumentWorkflowsApi.md#addQueue) | **POST** /queues | Add queue |
| [**addWorkflow**](DocumentWorkflowsApi.md#addWorkflow) | **POST** /workflows | Add workflow |
| [**deleteQueue**](DocumentWorkflowsApi.md#deleteQueue) | **DELETE** /queues/{queueId} | Delete queue |
| [**deleteWorkflow**](DocumentWorkflowsApi.md#deleteWorkflow) | **DELETE** /workflows/{workflowId} | Delete workflow |
| [**getDocumentWorkflow**](DocumentWorkflowsApi.md#getDocumentWorkflow) | **GET** /documents/{documentId}/workflows/{workflowId} | Get document workflow |
| [**getDocumentWorkflows**](DocumentWorkflowsApi.md#getDocumentWorkflows) | **GET** /documents/{documentId}/workflows | Get document workflows |
| [**getQueue**](DocumentWorkflowsApi.md#getQueue) | **GET** /queues/{queueId} | Get queue |
| [**getQueues**](DocumentWorkflowsApi.md#getQueues) | **GET** /queues | Get queues |
| [**getWorkflow**](DocumentWorkflowsApi.md#getWorkflow) | **GET** /workflows/{workflowId} | Get workflow |
| [**getWorkflowDocuments**](DocumentWorkflowsApi.md#getWorkflowDocuments) | **GET** /workflows/{workflowId}/documents | Get list of documents in workflow |
| [**getWorkflowQueueDocuments**](DocumentWorkflowsApi.md#getWorkflowQueueDocuments) | **GET** /queues/{queueId}/documents | Get list of documents in queue |
| [**getWorkflows**](DocumentWorkflowsApi.md#getWorkflows) | **GET** /workflows | Get workflows |
| [**setWorkflow**](DocumentWorkflowsApi.md#setWorkflow) | **PUT** /workflows/{workflowId} | Add workflow |


<a id="addDocumentWorkflow"></a>
# **addDocumentWorkflow**
> AddDocumentWorkflowResponse addDocumentWorkflow(documentId, addDocumentWorkflowRequest, siteId)

Add document workflow

Creates a document workflow; ONLY available with FormKiQ Pro and Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentWorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentWorkflowsApi apiInstance = new DocumentWorkflowsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    AddDocumentWorkflowRequest addDocumentWorkflowRequest = new AddDocumentWorkflowRequest(); // AddDocumentWorkflowRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      AddDocumentWorkflowResponse result = apiInstance.addDocumentWorkflow(documentId, addDocumentWorkflowRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentWorkflowsApi#addDocumentWorkflow");
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
| **addDocumentWorkflowRequest** | [**AddDocumentWorkflowRequest**](AddDocumentWorkflowRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**AddDocumentWorkflowResponse**](AddDocumentWorkflowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 CREATED |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | 400 BAD REQUEST |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="addDocumentWorkflowDecisions"></a>
# **addDocumentWorkflowDecisions**
> AddDocumentWorkflowDecisionsResponse addDocumentWorkflowDecisions(documentId, workflowId, addDocumentWorkflowDecisionsRequest, siteId)

Approve/Reject document in approval queue

Approve/Reject document in approval queue; ONLY available with FormKiQ Pro and Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentWorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentWorkflowsApi apiInstance = new DocumentWorkflowsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String workflowId = "workflowId_example"; // String | Workflow Identifier
    AddDocumentWorkflowDecisionsRequest addDocumentWorkflowDecisionsRequest = new AddDocumentWorkflowDecisionsRequest(); // AddDocumentWorkflowDecisionsRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      AddDocumentWorkflowDecisionsResponse result = apiInstance.addDocumentWorkflowDecisions(documentId, workflowId, addDocumentWorkflowDecisionsRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentWorkflowsApi#addDocumentWorkflowDecisions");
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
| **workflowId** | **String**| Workflow Identifier | |
| **addDocumentWorkflowDecisionsRequest** | [**AddDocumentWorkflowDecisionsRequest**](AddDocumentWorkflowDecisionsRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**AddDocumentWorkflowDecisionsResponse**](AddDocumentWorkflowDecisionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 CREATED |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | 400 BAD REQUEST |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="addQueue"></a>
# **addQueue**
> AddQueueResponse addQueue(addQueueRequest, siteId)

Add queue

Creates a new Queue; ONLY available with FormKiQ Pro and Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentWorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentWorkflowsApi apiInstance = new DocumentWorkflowsApi(defaultClient);
    AddQueueRequest addQueueRequest = new AddQueueRequest(); // AddQueueRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      AddQueueResponse result = apiInstance.addQueue(addQueueRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentWorkflowsApi#addQueue");
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
| **addQueueRequest** | [**AddQueueRequest**](AddQueueRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**AddQueueResponse**](AddQueueResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 CREATED |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | 400 BAD REQUEST |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="addWorkflow"></a>
# **addWorkflow**
> AddWorkflowResponse addWorkflow(addWorkflowRequest, siteId)

Add workflow

Creates a new Workflow; ONLY available with FormKiQ Pro and Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentWorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentWorkflowsApi apiInstance = new DocumentWorkflowsApi(defaultClient);
    AddWorkflowRequest addWorkflowRequest = new AddWorkflowRequest(); // AddWorkflowRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      AddWorkflowResponse result = apiInstance.addWorkflow(addWorkflowRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentWorkflowsApi#addWorkflow");
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
| **addWorkflowRequest** | [**AddWorkflowRequest**](AddWorkflowRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**AddWorkflowResponse**](AddWorkflowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 CREATED |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | 400 BAD REQUEST |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="deleteQueue"></a>
# **deleteQueue**
> DeleteQueueResponse deleteQueue(queueId, siteId)

Delete queue

Delete a Queue; ONLY available with FormKiQ Pro and Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentWorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentWorkflowsApi apiInstance = new DocumentWorkflowsApi(defaultClient);
    String queueId = "queueId_example"; // String | Queue Id
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      DeleteQueueResponse result = apiInstance.deleteQueue(queueId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentWorkflowsApi#deleteQueue");
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
| **queueId** | **String**| Queue Id | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**DeleteQueueResponse**](DeleteQueueResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="deleteWorkflow"></a>
# **deleteWorkflow**
> DeleteWorkflowResponse deleteWorkflow(workflowId, siteId)

Delete workflow

Delete a Workflow; ONLY available with FormKiQ Pro and Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentWorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentWorkflowsApi apiInstance = new DocumentWorkflowsApi(defaultClient);
    String workflowId = "workflowId_example"; // String | Workflow Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      DeleteWorkflowResponse result = apiInstance.deleteWorkflow(workflowId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentWorkflowsApi#deleteWorkflow");
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
| **workflowId** | **String**| Workflow Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**DeleteWorkflowResponse**](DeleteWorkflowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getDocumentWorkflow"></a>
# **getDocumentWorkflow**
> GetDocumentWorkflowResponse getDocumentWorkflow(documentId, workflowId, siteId)

Get document workflow

Gets a document workflow; ONLY available with FormKiQ Pro and Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentWorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentWorkflowsApi apiInstance = new DocumentWorkflowsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String workflowId = "workflowId_example"; // String | Workflow Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      GetDocumentWorkflowResponse result = apiInstance.getDocumentWorkflow(documentId, workflowId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentWorkflowsApi#getDocumentWorkflow");
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
| **workflowId** | **String**| Workflow Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**GetDocumentWorkflowResponse**](GetDocumentWorkflowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 CREATED |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | 400 BAD REQUEST |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getDocumentWorkflows"></a>
# **getDocumentWorkflows**
> GetDocumentWorkflowsResponse getDocumentWorkflows(documentId, siteId)

Get document workflows

Gets a document workflows; ONLY available with FormKiQ Pro and Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentWorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentWorkflowsApi apiInstance = new DocumentWorkflowsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      GetDocumentWorkflowsResponse result = apiInstance.getDocumentWorkflows(documentId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentWorkflowsApi#getDocumentWorkflows");
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

[**GetDocumentWorkflowsResponse**](GetDocumentWorkflowsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 CREATED |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | 400 BAD REQUEST |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getQueue"></a>
# **getQueue**
> GetQueueResponse getQueue(queueId, siteId)

Get queue

Get a queue; ONLY available with FormKiQ Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentWorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentWorkflowsApi apiInstance = new DocumentWorkflowsApi(defaultClient);
    String queueId = "queueId_example"; // String | Queue Id
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      GetQueueResponse result = apiInstance.getQueue(queueId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentWorkflowsApi#getQueue");
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
| **queueId** | **String**| Queue Id | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**GetQueueResponse**](GetQueueResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getQueues"></a>
# **getQueues**
> GetQueuesResponse getQueues(siteId, next, limit)

Get queues

Get a listing of queues; ONLY available with FormKiQ Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentWorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentWorkflowsApi apiInstance = new DocumentWorkflowsApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    String next = "next_example"; // String | Next page of results token
    String limit = "10"; // String | Limit Results
    try {
      GetQueuesResponse result = apiInstance.getQueues(siteId, next, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentWorkflowsApi#getQueues");
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
| **next** | **String**| Next page of results token | [optional] |
| **limit** | **String**| Limit Results | [optional] [default to 10] |

### Return type

[**GetQueuesResponse**](GetQueuesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getWorkflow"></a>
# **getWorkflow**
> GetWorkflowResponse getWorkflow(workflowId, siteId)

Get workflow

Get a workflow; ONLY available with FormKiQ Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentWorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentWorkflowsApi apiInstance = new DocumentWorkflowsApi(defaultClient);
    String workflowId = "workflowId_example"; // String | Workflow Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      GetWorkflowResponse result = apiInstance.getWorkflow(workflowId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentWorkflowsApi#getWorkflow");
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
| **workflowId** | **String**| Workflow Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**GetWorkflowResponse**](GetWorkflowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getWorkflowDocuments"></a>
# **getWorkflowDocuments**
> GetWorkflowDocumentsResponse getWorkflowDocuments(workflowId, siteId, limit, next)

Get list of documents in workflow

List documents in Workflow; ONLY available with FormKiQ Pro and Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentWorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentWorkflowsApi apiInstance = new DocumentWorkflowsApi(defaultClient);
    String workflowId = "workflowId_example"; // String | Workflow Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    String limit = "10"; // String | Limit Results
    String next = "next_example"; // String | Next page of results token
    try {
      GetWorkflowDocumentsResponse result = apiInstance.getWorkflowDocuments(workflowId, siteId, limit, next);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentWorkflowsApi#getWorkflowDocuments");
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
| **workflowId** | **String**| Workflow Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |
| **limit** | **String**| Limit Results | [optional] [default to 10] |
| **next** | **String**| Next page of results token | [optional] |

### Return type

[**GetWorkflowDocumentsResponse**](GetWorkflowDocumentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getWorkflowQueueDocuments"></a>
# **getWorkflowQueueDocuments**
> GetWorkflowQueueDocumentsResponse getWorkflowQueueDocuments(queueId, siteId, limit, next)

Get list of documents in queue

List documents in Workflow Queue; ONLY available with FormKiQ Pro and Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentWorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentWorkflowsApi apiInstance = new DocumentWorkflowsApi(defaultClient);
    String queueId = "queueId_example"; // String | Queue Id
    String siteId = "siteId_example"; // String | Site Identifier
    String limit = "10"; // String | Limit Results
    String next = "next_example"; // String | Next page of results token
    try {
      GetWorkflowQueueDocumentsResponse result = apiInstance.getWorkflowQueueDocuments(queueId, siteId, limit, next);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentWorkflowsApi#getWorkflowQueueDocuments");
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
| **queueId** | **String**| Queue Id | |
| **siteId** | **String**| Site Identifier | [optional] |
| **limit** | **String**| Limit Results | [optional] [default to 10] |
| **next** | **String**| Next page of results token | [optional] |

### Return type

[**GetWorkflowQueueDocumentsResponse**](GetWorkflowQueueDocumentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getWorkflows"></a>
# **getWorkflows**
> GetWorkflowsResponse getWorkflows(siteId, next, limit, status)

Get workflows

Get a listing of workflows; ONLY available with FormKiQ Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentWorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentWorkflowsApi apiInstance = new DocumentWorkflowsApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    String next = "next_example"; // String | Next page of results token
    String limit = "10"; // String | Limit Results
    String status = "ACTIVE"; // String | Filters Status
    try {
      GetWorkflowsResponse result = apiInstance.getWorkflows(siteId, next, limit, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentWorkflowsApi#getWorkflows");
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
| **next** | **String**| Next page of results token | [optional] |
| **limit** | **String**| Limit Results | [optional] [default to 10] |
| **status** | **String**| Filters Status | [optional] [enum: ACTIVE, INACTIVE] |

### Return type

[**GetWorkflowsResponse**](GetWorkflowsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="setWorkflow"></a>
# **setWorkflow**
> SetWorkflowResponse setWorkflow(workflowId, setWorkflowRequest, siteId)

Add workflow

Set a Workflow details; ONLY available with FormKiQ Pro and Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentWorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentWorkflowsApi apiInstance = new DocumentWorkflowsApi(defaultClient);
    String workflowId = "workflowId_example"; // String | Workflow Identifier
    SetWorkflowRequest setWorkflowRequest = new SetWorkflowRequest(); // SetWorkflowRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      SetWorkflowResponse result = apiInstance.setWorkflow(workflowId, setWorkflowRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentWorkflowsApi#setWorkflow");
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
| **workflowId** | **String**| Workflow Identifier | |
| **setWorkflowRequest** | [**SetWorkflowRequest**](SetWorkflowRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**SetWorkflowResponse**](SetWorkflowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 20) OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | 400 BAD REQUEST |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

