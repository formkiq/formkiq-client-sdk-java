# DocumentWorkflowsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDocumentWorkflow**](DocumentWorkflowsApi.md#addDocumentWorkflow) | **POST** /documents/{documentId}/workflow/{workflowId} | Add document workflow |
| [**addDocumentWorkflowApproval**](DocumentWorkflowsApi.md#addDocumentWorkflowApproval) | **POST** /documents/{documentId}/workflow/{workflowId}/approve/{queueName} | Approve document in approval queue |
| [**addDocumentWorkflowReject**](DocumentWorkflowsApi.md#addDocumentWorkflowReject) | **POST** /documents/{documentId}/workflow/{workflowId}/reject/{queueName} | Reject document in approval queue |
| [**addWorkflow**](DocumentWorkflowsApi.md#addWorkflow) | **POST** /workflows | Add workflow |
| [**deleteWorkflow**](DocumentWorkflowsApi.md#deleteWorkflow) | **DELETE** /workflows/{workflowId} | Delete workflow |
| [**getWorkflow**](DocumentWorkflowsApi.md#getWorkflow) | **GET** /workflows/{workflowId} | Get workflow |
| [**getWorkflowQueueDocuments**](DocumentWorkflowsApi.md#getWorkflowQueueDocuments) | **GET** /workflows/queue/{queueName}/documents | Get list of documents in queue |
| [**getWorkflows**](DocumentWorkflowsApi.md#getWorkflows) | **GET** /workflows | Get workflows |


<a id="addDocumentWorkflow"></a>
# **addDocumentWorkflow**
> AddDocumentWorkflowResponse addDocumentWorkflow(documentId, workflowId, siteId)

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
    String workflowId = "workflowId_example"; // String | Workflow Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      AddDocumentWorkflowResponse result = apiInstance.addDocumentWorkflow(documentId, workflowId, siteId);
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
| **workflowId** | **String**| Workflow Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**AddDocumentWorkflowResponse**](AddDocumentWorkflowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 CREATED |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | 400 BAD REQUEST |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="addDocumentWorkflowApproval"></a>
# **addDocumentWorkflowApproval**
> AddDocumentWorkflowApprovalResponse addDocumentWorkflowApproval(documentId, workflowId, queueName, siteId)

Approve document in approval queue

Approve document in approval queue; ONLY available with FormKiQ Pro and Enterprise

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
    String queueName = "queueName_example"; // String | Queue Name
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      AddDocumentWorkflowApprovalResponse result = apiInstance.addDocumentWorkflowApproval(documentId, workflowId, queueName, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentWorkflowsApi#addDocumentWorkflowApproval");
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
| **queueName** | **String**| Queue Name | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**AddDocumentWorkflowApprovalResponse**](AddDocumentWorkflowApprovalResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 CREATED |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | 400 BAD REQUEST |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="addDocumentWorkflowReject"></a>
# **addDocumentWorkflowReject**
> AddDocumentWorkflowRejectResponse addDocumentWorkflowReject(documentId, workflowId, queueName, siteId)

Reject document in approval queue

Reject document in approval queue; ONLY available with FormKiQ Pro and Enterprise

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
    String queueName = "queueName_example"; // String | Queue Name
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      AddDocumentWorkflowRejectResponse result = apiInstance.addDocumentWorkflowReject(documentId, workflowId, queueName, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentWorkflowsApi#addDocumentWorkflowReject");
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
| **queueName** | **String**| Queue Name | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**AddDocumentWorkflowRejectResponse**](AddDocumentWorkflowRejectResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
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

<a id="getWorkflowQueueDocuments"></a>
# **getWorkflowQueueDocuments**
> WorkflowQueueDocumentsResponse getWorkflowQueueDocuments(queueName, siteId, limit, next)

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
    String queueName = "queueName_example"; // String | Queue Name
    String siteId = "siteId_example"; // String | Site Identifier
    String limit = "10"; // String | Limit Results
    String next = "next_example"; // String | Next page of results token
    try {
      WorkflowQueueDocumentsResponse result = apiInstance.getWorkflowQueueDocuments(queueName, siteId, limit, next);
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
| **queueName** | **String**| Queue Name | |
| **siteId** | **String**| Site Identifier | [optional] |
| **limit** | **String**| Limit Results | [optional] [default to 10] |
| **next** | **String**| Next page of results token | [optional] |

### Return type

[**WorkflowQueueDocumentsResponse**](WorkflowQueueDocumentsResponse.md)

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
> GetWorkflowsResponse getWorkflows(siteId, next, limit)

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
    try {
      GetWorkflowsResponse result = apiInstance.getWorkflows(siteId, next, limit);
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

