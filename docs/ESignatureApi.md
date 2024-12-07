# ESignatureApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDocusignEnvelopes**](ESignatureApi.md#addDocusignEnvelopes) | **POST** /esignature/docusign/{documentId}/envelopes | Create Docusign Envelope request |
| [**addDocusignRecipientView**](ESignatureApi.md#addDocusignRecipientView) | **POST** /esignature/docusign/{documentId}/envelopes/{envelopeId}/views/recipient | Create Docusign Recipient View request |
| [**addEsignatureDocusignEvents**](ESignatureApi.md#addEsignatureDocusignEvents) | **POST** /esignature/docusign/events | Add E-signature event |


<a id="addDocusignEnvelopes"></a>
# **addDocusignEnvelopes**
> AddDocusignEnvelopesResponse addDocusignEnvelopes(documentId, addDocusignEnvelopesRequest, siteId)

Create Docusign Envelope request

DocuSign create Docusign Envelope request; available as an Add-On Module

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
    AddDocusignEnvelopesRequest addDocusignEnvelopesRequest = new AddDocusignEnvelopesRequest(); // AddDocusignEnvelopesRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      AddDocusignEnvelopesResponse result = apiInstance.addDocusignEnvelopes(documentId, addDocusignEnvelopesRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ESignatureApi#addDocusignEnvelopes");
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
| **addDocusignEnvelopesRequest** | [**AddDocusignEnvelopesRequest**](AddDocusignEnvelopesRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**AddDocusignEnvelopesResponse**](AddDocusignEnvelopesResponse.md)

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

<a id="addDocusignRecipientView"></a>
# **addDocusignRecipientView**
> AddDocusignRecipientViewResponse addDocusignRecipientView(documentId, envelopeId, addDocusignRecipientViewRequest, siteId)

Create Docusign Recipient View request

DocuSign create Docusign Recipient View request; available as an Add-On Module

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
    String envelopeId = "envelopeId_example"; // String | Docusign Envelope Id
    AddDocusignRecipientViewRequest addDocusignRecipientViewRequest = new AddDocusignRecipientViewRequest(); // AddDocusignRecipientViewRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      AddDocusignRecipientViewResponse result = apiInstance.addDocusignRecipientView(documentId, envelopeId, addDocusignRecipientViewRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ESignatureApi#addDocusignRecipientView");
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
| **envelopeId** | **String**| Docusign Envelope Id | |
| **addDocusignRecipientViewRequest** | [**AddDocusignRecipientViewRequest**](AddDocusignRecipientViewRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**AddDocusignRecipientViewResponse**](AddDocusignRecipientViewResponse.md)

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
> AddResponse addEsignatureDocusignEvents()

Add E-signature event

DocuSign callback URL handler; available as an Add-On Module

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
      AddResponse result = apiInstance.addEsignatureDocusignEvents();
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

[**AddResponse**](AddResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

