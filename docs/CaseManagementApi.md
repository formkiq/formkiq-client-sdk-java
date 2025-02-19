# CaseManagementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCase**](CaseManagementApi.md#addCase) | **POST** /cases | Add New Case |
| [**addNigo**](CaseManagementApi.md#addNigo) | **POST** /cases/{caseId}/nigos | Add New Nigo |
| [**addTask**](CaseManagementApi.md#addTask) | **POST** /cases/{caseId}/tasks | Add New Task |
| [**deleteCase**](CaseManagementApi.md#deleteCase) | **DELETE** /cases/{caseId} | Delete Case |
| [**deleteCaseDocument**](CaseManagementApi.md#deleteCaseDocument) | **DELETE** /cases/{caseId}/documents/{documentId} | Delete Document from Case |
| [**deleteNigo**](CaseManagementApi.md#deleteNigo) | **DELETE** /cases/{caseId}/nigos/{nigoId} | Delete Nigo |
| [**deleteNigoDocument**](CaseManagementApi.md#deleteNigoDocument) | **DELETE** /cases/{caseId}/nigos/{nigoId}/documents/{documentId} | Delete Document from Nigo |
| [**deleteTask**](CaseManagementApi.md#deleteTask) | **DELETE** /cases/{caseId}/tasks/{taskId} | Delete Task |
| [**deleteTaskDocument**](CaseManagementApi.md#deleteTaskDocument) | **DELETE** /cases/{caseId}/tasks/{taskId}/documents/{documentId} | Delete Document from Task |
| [**getCase**](CaseManagementApi.md#getCase) | **GET** /cases/{caseId} | Get Case details |
| [**getCaseDocuments**](CaseManagementApi.md#getCaseDocuments) | **GET** /cases/{caseId}/documents | Get list of document in a case |
| [**getCaseNigo**](CaseManagementApi.md#getCaseNigo) | **GET** /cases/{caseId}/nigos/{nigoId} | Get nigo in a case |
| [**getCaseNigos**](CaseManagementApi.md#getCaseNigos) | **GET** /cases/{caseId}/nigos | Get list of Nigos in a case |
| [**getCaseTask**](CaseManagementApi.md#getCaseTask) | **GET** /cases/{caseId}/tasks/{taskId} | Get task in a case |
| [**getCaseTasks**](CaseManagementApi.md#getCaseTasks) | **GET** /cases/{caseId}/tasks | Get list of tasks in a case |
| [**getCases**](CaseManagementApi.md#getCases) | **GET** /cases | Get Case listing |
| [**getNigoDocuments**](CaseManagementApi.md#getNigoDocuments) | **GET** /cases/{caseId}/nigos/{nigoId}/documents | Get list of document in a task |
| [**getTaskDocuments**](CaseManagementApi.md#getTaskDocuments) | **GET** /cases/{caseId}/tasks/{taskId}/documents | Get list of document in a task |
| [**updateCase**](CaseManagementApi.md#updateCase) | **PATCH** /cases/{caseId} | Update existing Case |
| [**updateNigo**](CaseManagementApi.md#updateNigo) | **PATCH** /cases/{caseId}/nigos/{nigoId} | Update existing Nigo |
| [**updateTask**](CaseManagementApi.md#updateTask) | **PATCH** /cases/{caseId}/tasks/{taskId} | Update existing Task |


<a id="addCase"></a>
# **addCase**
> AddCaseResponse addCase(addCaseRequest, siteId)

Add New Case

Adds new case; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.CaseManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);
    AddCaseRequest addCaseRequest = new AddCaseRequest(); // AddCaseRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      AddCaseResponse result = apiInstance.addCase(addCaseRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#addCase");
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
| **addCaseRequest** | [**AddCaseRequest**](AddCaseRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**AddCaseResponse**](AddCaseResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="addNigo"></a>
# **addNigo**
> AddNigoResponse addNigo(caseId, addNigoRequest, siteId)

Add New Nigo

Adds new nigo; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.CaseManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);
    String caseId = "caseId_example"; // String | Case Identifier
    AddNigoRequest addNigoRequest = new AddNigoRequest(); // AddNigoRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      AddNigoResponse result = apiInstance.addNigo(caseId, addNigoRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#addNigo");
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
| **caseId** | **String**| Case Identifier | |
| **addNigoRequest** | [**AddNigoRequest**](AddNigoRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**AddNigoResponse**](AddNigoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="addTask"></a>
# **addTask**
> AddTaskResponse addTask(caseId, addTaskRequest, siteId)

Add New Task

Adds new task; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.CaseManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);
    String caseId = "caseId_example"; // String | Case Identifier
    AddTaskRequest addTaskRequest = new AddTaskRequest(); // AddTaskRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      AddTaskResponse result = apiInstance.addTask(caseId, addTaskRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#addTask");
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
| **caseId** | **String**| Case Identifier | |
| **addTaskRequest** | [**AddTaskRequest**](AddTaskRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**AddTaskResponse**](AddTaskResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="deleteCase"></a>
# **deleteCase**
> DeleteCaseResponse deleteCase(caseId, siteId)

Delete Case

Delete Case

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.CaseManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);
    String caseId = "caseId_example"; // String | Case Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      DeleteCaseResponse result = apiInstance.deleteCase(caseId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#deleteCase");
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
| **caseId** | **String**| Case Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**DeleteCaseResponse**](DeleteCaseResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="deleteCaseDocument"></a>
# **deleteCaseDocument**
> DeleteCaseDocumentResponse deleteCaseDocument(caseId, documentId, siteId)

Delete Document from Case

Delete Document from Case

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.CaseManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);
    String caseId = "caseId_example"; // String | Case Identifier
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      DeleteCaseDocumentResponse result = apiInstance.deleteCaseDocument(caseId, documentId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#deleteCaseDocument");
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
| **caseId** | **String**| Case Identifier | |
| **documentId** | **String**| Document Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**DeleteCaseDocumentResponse**](DeleteCaseDocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="deleteNigo"></a>
# **deleteNigo**
> DeleteCaseNigoResponse deleteNigo(caseId, nigoId, siteId)

Delete Nigo

Delete Nigo

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.CaseManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);
    String caseId = "caseId_example"; // String | Case Identifier
    String nigoId = "nigoId_example"; // String | Nigo Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      DeleteCaseNigoResponse result = apiInstance.deleteNigo(caseId, nigoId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#deleteNigo");
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
| **caseId** | **String**| Case Identifier | |
| **nigoId** | **String**| Nigo Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**DeleteCaseNigoResponse**](DeleteCaseNigoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="deleteNigoDocument"></a>
# **deleteNigoDocument**
> DeleteCaseNigoDocumentResponse deleteNigoDocument(caseId, nigoId, documentId, siteId)

Delete Document from Nigo

Delete Document from Nigo

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.CaseManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);
    String caseId = "caseId_example"; // String | Case Identifier
    String nigoId = "nigoId_example"; // String | Nigo Identifier
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      DeleteCaseNigoDocumentResponse result = apiInstance.deleteNigoDocument(caseId, nigoId, documentId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#deleteNigoDocument");
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
| **caseId** | **String**| Case Identifier | |
| **nigoId** | **String**| Nigo Identifier | |
| **documentId** | **String**| Document Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**DeleteCaseNigoDocumentResponse**](DeleteCaseNigoDocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="deleteTask"></a>
# **deleteTask**
> DeleteCaseTaskResponse deleteTask(caseId, taskId, siteId)

Delete Task

Delete Task

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.CaseManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);
    String caseId = "caseId_example"; // String | Case Identifier
    String taskId = "taskId_example"; // String | Task Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      DeleteCaseTaskResponse result = apiInstance.deleteTask(caseId, taskId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#deleteTask");
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
| **caseId** | **String**| Case Identifier | |
| **taskId** | **String**| Task Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**DeleteCaseTaskResponse**](DeleteCaseTaskResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="deleteTaskDocument"></a>
# **deleteTaskDocument**
> DeleteCaseTaskDocumentResponse deleteTaskDocument(caseId, taskId, documentId, siteId)

Delete Document from Task

Delete Document from Task

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.CaseManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);
    String caseId = "caseId_example"; // String | Case Identifier
    String taskId = "taskId_example"; // String | Task Identifier
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      DeleteCaseTaskDocumentResponse result = apiInstance.deleteTaskDocument(caseId, taskId, documentId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#deleteTaskDocument");
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
| **caseId** | **String**| Case Identifier | |
| **taskId** | **String**| Task Identifier | |
| **documentId** | **String**| Document Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**DeleteCaseTaskDocumentResponse**](DeleteCaseTaskDocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getCase"></a>
# **getCase**
> GetCaseResponse getCase(caseId, siteId)

Get Case details

Returns a Case; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.CaseManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);
    String caseId = "caseId_example"; // String | Case Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      GetCaseResponse result = apiInstance.getCase(caseId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#getCase");
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
| **caseId** | **String**| Case Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**GetCaseResponse**](GetCaseResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getCaseDocuments"></a>
# **getCaseDocuments**
> GetCaseDocumentsResponse getCaseDocuments(caseId, siteId, next, limit)

Get list of document in a case

Returns documents in a Case; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.CaseManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);
    String caseId = "caseId_example"; // String | Case Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    String next = "next_example"; // String | Next page of results token
    String limit = "10"; // String | Limit Results
    try {
      GetCaseDocumentsResponse result = apiInstance.getCaseDocuments(caseId, siteId, next, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#getCaseDocuments");
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
| **caseId** | **String**| Case Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |
| **next** | **String**| Next page of results token | [optional] |
| **limit** | **String**| Limit Results | [optional] [default to 10] |

### Return type

[**GetCaseDocumentsResponse**](GetCaseDocumentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getCaseNigo"></a>
# **getCaseNigo**
> GetCaseNigoResponse getCaseNigo(caseId, nigoId, siteId)

Get nigo in a case

Returns a Nigo in Case; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.CaseManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);
    String caseId = "caseId_example"; // String | Case Identifier
    String nigoId = "nigoId_example"; // String | Nigo Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      GetCaseNigoResponse result = apiInstance.getCaseNigo(caseId, nigoId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#getCaseNigo");
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
| **caseId** | **String**| Case Identifier | |
| **nigoId** | **String**| Nigo Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**GetCaseNigoResponse**](GetCaseNigoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getCaseNigos"></a>
# **getCaseNigos**
> GetCaseNigosResponse getCaseNigos(caseId, siteId, next, limit)

Get list of Nigos in a case

Returns a Nigos of Case; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.CaseManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);
    String caseId = "caseId_example"; // String | Case Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    String next = "next_example"; // String | Next page of results token
    String limit = "10"; // String | Limit Results
    try {
      GetCaseNigosResponse result = apiInstance.getCaseNigos(caseId, siteId, next, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#getCaseNigos");
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
| **caseId** | **String**| Case Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |
| **next** | **String**| Next page of results token | [optional] |
| **limit** | **String**| Limit Results | [optional] [default to 10] |

### Return type

[**GetCaseNigosResponse**](GetCaseNigosResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getCaseTask"></a>
# **getCaseTask**
> GetCaseTaskResponse getCaseTask(caseId, taskId, siteId)

Get task in a case

Returns a Task in Case; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.CaseManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);
    String caseId = "caseId_example"; // String | Case Identifier
    String taskId = "taskId_example"; // String | Task Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      GetCaseTaskResponse result = apiInstance.getCaseTask(caseId, taskId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#getCaseTask");
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
| **caseId** | **String**| Case Identifier | |
| **taskId** | **String**| Task Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**GetCaseTaskResponse**](GetCaseTaskResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getCaseTasks"></a>
# **getCaseTasks**
> GetCaseTasksResponse getCaseTasks(caseId, siteId, next, limit)

Get list of tasks in a case

Returns a Case; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.CaseManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);
    String caseId = "caseId_example"; // String | Case Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    String next = "next_example"; // String | Next page of results token
    String limit = "10"; // String | Limit Results
    try {
      GetCaseTasksResponse result = apiInstance.getCaseTasks(caseId, siteId, next, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#getCaseTasks");
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
| **caseId** | **String**| Case Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |
| **next** | **String**| Next page of results token | [optional] |
| **limit** | **String**| Limit Results | [optional] [default to 10] |

### Return type

[**GetCaseTasksResponse**](GetCaseTasksResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getCases"></a>
# **getCases**
> GetCasesResponse getCases(siteId, next, limit)

Get Case listing

Returns a list of the Cases; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.CaseManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    String next = "next_example"; // String | Next page of results token
    String limit = "10"; // String | Limit Results
    try {
      GetCasesResponse result = apiInstance.getCases(siteId, next, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#getCases");
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

[**GetCasesResponse**](GetCasesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getNigoDocuments"></a>
# **getNigoDocuments**
> GetCaseDocumentsResponse getNigoDocuments(caseId, nigoId, siteId, next, limit)

Get list of document in a task

Returns a list documents in a Case; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.CaseManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);
    String caseId = "caseId_example"; // String | Case Identifier
    String nigoId = "nigoId_example"; // String | Nigo Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    String next = "next_example"; // String | Next page of results token
    String limit = "10"; // String | Limit Results
    try {
      GetCaseDocumentsResponse result = apiInstance.getNigoDocuments(caseId, nigoId, siteId, next, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#getNigoDocuments");
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
| **caseId** | **String**| Case Identifier | |
| **nigoId** | **String**| Nigo Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |
| **next** | **String**| Next page of results token | [optional] |
| **limit** | **String**| Limit Results | [optional] [default to 10] |

### Return type

[**GetCaseDocumentsResponse**](GetCaseDocumentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getTaskDocuments"></a>
# **getTaskDocuments**
> GetCaseDocumentsResponse getTaskDocuments(caseId, taskId, siteId, next, limit)

Get list of document in a task

Returns a list documents in a Case; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.CaseManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);
    String caseId = "caseId_example"; // String | Case Identifier
    String taskId = "taskId_example"; // String | Task Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    String next = "next_example"; // String | Next page of results token
    String limit = "10"; // String | Limit Results
    try {
      GetCaseDocumentsResponse result = apiInstance.getTaskDocuments(caseId, taskId, siteId, next, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#getTaskDocuments");
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
| **caseId** | **String**| Case Identifier | |
| **taskId** | **String**| Task Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |
| **next** | **String**| Next page of results token | [optional] |
| **limit** | **String**| Limit Results | [optional] [default to 10] |

### Return type

[**GetCaseDocumentsResponse**](GetCaseDocumentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="updateCase"></a>
# **updateCase**
> UpdateCaseResponse updateCase(caseId, updateCaseRequest, siteId)

Update existing Case

Updates existing case; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.CaseManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);
    String caseId = "caseId_example"; // String | Case Identifier
    UpdateCaseRequest updateCaseRequest = new UpdateCaseRequest(); // UpdateCaseRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      UpdateCaseResponse result = apiInstance.updateCase(caseId, updateCaseRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#updateCase");
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
| **caseId** | **String**| Case Identifier | |
| **updateCaseRequest** | [**UpdateCaseRequest**](UpdateCaseRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**UpdateCaseResponse**](UpdateCaseResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="updateNigo"></a>
# **updateNigo**
> UpdateNigoResponse updateNigo(caseId, nigoId, updateNigoRequest, siteId)

Update existing Nigo

Updates existing nigo; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.CaseManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);
    String caseId = "caseId_example"; // String | Case Identifier
    String nigoId = "nigoId_example"; // String | Nigo Identifier
    UpdateNigoRequest updateNigoRequest = new UpdateNigoRequest(); // UpdateNigoRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      UpdateNigoResponse result = apiInstance.updateNigo(caseId, nigoId, updateNigoRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#updateNigo");
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
| **caseId** | **String**| Case Identifier | |
| **nigoId** | **String**| Nigo Identifier | |
| **updateNigoRequest** | [**UpdateNigoRequest**](UpdateNigoRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**UpdateNigoResponse**](UpdateNigoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="updateTask"></a>
# **updateTask**
> UpdateTaskResponse updateTask(caseId, taskId, updateTaskRequest, siteId)

Update existing Task

Updates existing task; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.CaseManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);
    String caseId = "caseId_example"; // String | Case Identifier
    String taskId = "taskId_example"; // String | Task Identifier
    UpdateTaskRequest updateTaskRequest = new UpdateTaskRequest(); // UpdateTaskRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      UpdateTaskResponse result = apiInstance.updateTask(caseId, taskId, updateTaskRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#updateTask");
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
| **caseId** | **String**| Case Identifier | |
| **taskId** | **String**| Task Identifier | |
| **updateTaskRequest** | [**UpdateTaskRequest**](UpdateTaskRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**UpdateTaskResponse**](UpdateTaskResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

