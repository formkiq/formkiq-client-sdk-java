# ESignatureApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addEsignatureDocusign**](ESignatureApi.md#addEsignatureDocusign) | **POST** /esignature/docusign/{documentId} | Create E-signature request |
| [**addEsignatureDocusignEvents**](ESignatureApi.md#addEsignatureDocusignEvents) | **POST** /esignature/docusign/events | Add E-signature event |


<a id="addEsignatureDocusign"></a>
# **addEsignatureDocusign**
> AddDocusignResponse addEsignatureDocusign(documentId, addDocusignRequest, siteId)

Create E-signature request

Create a DocuSign E-Signature request; ONLY available with FormKiQ Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.ESignatureApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    ESignatureApi apiInstance = new ESignatureApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    AddDocusignRequest addDocusignRequest = new AddDocusignRequest(); // AddDocusignRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      AddDocusignResponse result = apiInstance.addEsignatureDocusign(documentId, addDocusignRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ESignatureApi#addEsignatureDocusign");
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
| **addDocusignRequest** | [**AddDocusignRequest**](AddDocusignRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**AddDocusignResponse**](AddDocusignResponse.md)

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

<a id="addEsignatureDocusignEvents"></a>
# **addEsignatureDocusignEvents**
> AddDocusignResponse addEsignatureDocusignEvents()

Add E-signature event

DocuSign callback URL handler; ONLY available with FormKiQ Enterprise

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.ESignatureApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")

    ESignatureApi apiInstance = new ESignatureApi(defaultClient);
    try {
      AddDocusignResponse result = apiInstance.addEsignatureDocusignEvents();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ESignatureApi#addEsignatureDocusignEvents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AddDocusignResponse**](AddDocusignResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

