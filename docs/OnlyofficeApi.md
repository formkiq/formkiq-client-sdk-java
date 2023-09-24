# OnlyofficeApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**onlyOfficeDocumentEdit**](OnlyofficeApi.md#onlyOfficeDocumentEdit) | **POST** /onlyoffice/{documentId}/edit | Edit onlyoffice document |
| [**onlyOfficeDocumentNew**](OnlyofficeApi.md#onlyOfficeDocumentNew) | **POST** /onlyoffice/new | Create onlyoffice document |
| [**onlyOfficeDocumentSave**](OnlyofficeApi.md#onlyOfficeDocumentSave) | **POST** /onlyoffice/{documentId}/save | Save onlyoffice document |


<a id="onlyOfficeDocumentEdit"></a>
# **onlyOfficeDocumentEdit**
> OnlyOfficeDocumentResponse onlyOfficeDocumentEdit(documentId, body, siteId)

Edit onlyoffice document

Provide ONLYOFFICE integration for editing documents; ONLY available with FormKiQ Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.OnlyofficeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    OnlyofficeApi apiInstance = new OnlyofficeApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    Object body = null; // Object | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      OnlyOfficeDocumentResponse result = apiInstance.onlyOfficeDocumentEdit(documentId, body, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnlyofficeApi#onlyOfficeDocumentEdit");
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
| **body** | **Object**|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**OnlyOfficeDocumentResponse**](OnlyOfficeDocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="onlyOfficeDocumentNew"></a>
# **onlyOfficeDocumentNew**
> OnlyOfficeDocumentResponse onlyOfficeDocumentNew(onlyOfficeDocumentNewRequest, siteId)

Create onlyoffice document

Provide ONLYOFFICE integration for the creation of new documents; ONLY available with FormKiQ Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.OnlyofficeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    OnlyofficeApi apiInstance = new OnlyofficeApi(defaultClient);
    OnlyOfficeDocumentNewRequest onlyOfficeDocumentNewRequest = new OnlyOfficeDocumentNewRequest(); // OnlyOfficeDocumentNewRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      OnlyOfficeDocumentResponse result = apiInstance.onlyOfficeDocumentNew(onlyOfficeDocumentNewRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnlyofficeApi#onlyOfficeDocumentNew");
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
| **onlyOfficeDocumentNewRequest** | [**OnlyOfficeDocumentNewRequest**](OnlyOfficeDocumentNewRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**OnlyOfficeDocumentResponse**](OnlyOfficeDocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="onlyOfficeDocumentSave"></a>
# **onlyOfficeDocumentSave**
> OnlyOfficeDocumentSaveResponse onlyOfficeDocumentSave(documentId, siteId)

Save onlyoffice document

Save an updated document for ONLYOFFICE integration. ONLY available with FormKiQ Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.OnlyofficeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")

    OnlyofficeApi apiInstance = new OnlyofficeApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      OnlyOfficeDocumentSaveResponse result = apiInstance.onlyOfficeDocumentSave(documentId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnlyofficeApi#onlyOfficeDocumentSave");
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

[**OnlyOfficeDocumentSaveResponse**](OnlyOfficeDocumentSaveResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

