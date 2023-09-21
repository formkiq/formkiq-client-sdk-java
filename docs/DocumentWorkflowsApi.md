# DocumentWorkflowsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDocumentWorkflow**](DocumentWorkflowsApi.md#addDocumentWorkflow) | **POST** /documents/{documentId}/workflow/{workflowId} | Add document workflow |
| [**addWorkflow**](DocumentWorkflowsApi.md#addWorkflow) | **POST** /workflows | Add workflow |
| [**deleteWorkflow**](DocumentWorkflowsApi.md#deleteWorkflow) | **DELETE** /workflows/{workflowId} | Delete workflow |
| [**documentWorkflow**](DocumentWorkflowsApi.md#documentWorkflow) | **GET** /documents/{documentId}/workflow/{workflowId} | Document search |
| [**getWorkflow**](DocumentWorkflowsApi.md#getWorkflow) | **GET** /workflows/{workflowId} | Get workflow |
| [**getWorkflows**](DocumentWorkflowsApi.md#getWorkflows) | **GET** /workflows | Get workflows |
| [**workflowQueueDocuments**](DocumentWorkflowsApi.md#workflowQueueDocuments) | **GET** /workflows/queue/{queueName}/documents | Document search |


<a id="addDocumentWorkflow"></a>
# **addDocumentWorkflow**
> AddDocumentWorkflowResponse addDocumentWorkflow(documentId, workflowId, addDocumentWorkflowRequest, siteId)

Add document workflow

Creates a document workflow step status; ONLY available with FormKiQ Pro and Enterprise

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
    AddDocumentWorkflowRequest addDocumentWorkflowRequest = new AddDocumentWorkflowRequest(); // AddDocumentWorkflowRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      AddDocumentWorkflowResponse result = apiInstance.addDocumentWorkflow(documentId, workflowId, addDocumentWorkflowRequest, siteId);
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

<a id="documentWorkflow"></a>
# **documentWorkflow**
> DocumentWorkflowResponse documentWorkflow(documentId, workflowId, siteId)

Document search

Get document workflow status; ONLY available with FormKiQ Pro and Enterprise

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
      DocumentWorkflowResponse result = apiInstance.documentWorkflow(documentId, workflowId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentWorkflowsApi#documentWorkflow");
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

[**DocumentWorkflowResponse**](DocumentWorkflowResponse.md)

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

<a id="workflowQueueDocuments"></a>
# **workflowQueueDocuments**
> WorkflowQueueDocumentsResponse workflowQueueDocuments(queueName, siteId, limit, next)

Document search

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
      WorkflowQueueDocumentsResponse result = apiInstance.workflowQueueDocuments(queueName, siteId, limit, next);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentWorkflowsApi#workflowQueueDocuments");
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

