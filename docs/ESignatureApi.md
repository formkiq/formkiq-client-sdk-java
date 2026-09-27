# ESignatureApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDocusignEnvelopeReminders**](ESignatureApi.md#addDocusignEnvelopeReminders) | **POST** /esignature/docusign/{documentId}/envelopes/{envelopeId}/reminders | Request DocuSign signing reminders |
| [**addDocusignEnvelopes**](ESignatureApi.md#addDocusignEnvelopes) | **POST** /esignature/docusign/{documentId}/envelopes | Create Docusign Envelope request |
| [**addDocusignRecipientView**](ESignatureApi.md#addDocusignRecipientView) | **POST** /esignature/docusign/{documentId}/envelopes/{envelopeId}/views/recipient | Create Docusign Recipient View request |
| [**addDocusignSenderView**](ESignatureApi.md#addDocusignSenderView) | **POST** /esignature/docusign/{documentId}/envelopes/{envelopeId}/views/sender | Create Docusign Sender View request |
| [**addEsignatureDocusignEvents**](ESignatureApi.md#addEsignatureDocusignEvents) | **POST** /esignature/docusign/events | Add E-signature event |
| [**getDocusignEnvelope**](ESignatureApi.md#getDocusignEnvelope) | **GET** /esignature/docusign/{documentId}/envelopes/{envelopeId} | Get Docusign envelope and recipient status |


<a id="addDocusignEnvelopeReminders"></a>
# **addDocusignEnvelopeReminders**
> AddDocusignEnvelopeRemindersResponse addDocusignEnvelopeReminders(documentId, envelopeId, siteId, artifactId, environment, addDocusignEnvelopeRemindersRequest)

Request DocuSign signing reminders

Resends signing notifications for an in-progress DocuSign envelope; available as an Add-On Module. With no request body or an empty object, DocuSign reminds all eligible recipients at the current routing step. Supply recipientIds to remind only the selected eligible signers. Obtain IDs from recipients.signers[].recipientId in GET /esignature/docusign/{documentId}/envelopes/{envelopeId}. Every selected signer must still be awaiting action at the current routing step when this request is processed. Validate the entire selection before issuing a resend. Completed and future-step signers cannot be targeted. Invalid targeted requests never fall back to reminding all recipients. Recipient notification settings are respected; this operation does not send FormKiQ notifications to embedded-only or email-suppressed signers. Requires write access to the selected document or artifact and a matching stored envelope ID. The operation resends the existing invitation without changing recipients, documents, routing, or automatic reminder settings. Targeted responses report each selected recipient&#39;s acceptance or failure, with no overall status. Acceptance does not confirm notification delivery. Do not automatically retry after a timeout because the reminder may already have been requested.

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
    String siteId = "siteId_example"; // String | Site Identifier
    String artifactId = "artifactId_example"; // String | Artifact Document Identifier
    DocusignEnvironment environment = DocusignEnvironment.fromValue("PRODUCTION"); // DocusignEnvironment | DocuSign environment. Defaults to the site's docusignEnvironment; required when the site has no default. Use the environment in which the envelope was created.
    AddDocusignEnvelopeRemindersRequest addDocusignEnvelopeRemindersRequest = new AddDocusignEnvelopeRemindersRequest(); // AddDocusignEnvelopeRemindersRequest | 
    try {
      AddDocusignEnvelopeRemindersResponse result = apiInstance.addDocusignEnvelopeReminders(documentId, envelopeId, siteId, artifactId, environment, addDocusignEnvelopeRemindersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ESignatureApi#addDocusignEnvelopeReminders");
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
| **siteId** | **String**| Site Identifier | [optional] |
| **artifactId** | **String**| Artifact Document Identifier | [optional] |
| **environment** | [**DocusignEnvironment**](.md)| DocuSign environment. Defaults to the site&#39;s docusignEnvironment; required when the site has no default. Use the environment in which the envelope was created. | [optional] [enum: PRODUCTION, DEVELOPMENT] |
| **addDocusignEnvelopeRemindersRequest** | [**AddDocusignEnvelopeRemindersRequest**](AddDocusignEnvelopeRemindersRequest.md)|  | [optional] |

### Return type

[**AddDocusignEnvelopeRemindersResponse**](AddDocusignEnvelopeRemindersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Reminder request processed. For targeted requests, inspect each entry in recipients for acceptance or failure; HTTP 200 does not mean all selected recipients succeeded. An envelope-wide request returns an empty object when DocuSign accepts it, because individual recipient outcomes are not returned. Acceptance does not confirm delivery. |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | Invalid parameters, missing DocuSign configuration, ineligible envelope state, or unknown or ineligible signers. Null or empty recipientIds arrays, duplicate IDs, and null, blank, or non-string entries are rejected. The singular recipientId field is not accepted. Draft and terminal envelopes cannot be reminded. |  -  |
| **401** | Authentication required |  -  |
| **403** | Write access to the selected document or artifact is denied |  -  |
| **404** | Document, artifact, or associated DocuSign envelope not found |  -  |
| **429** | DocuSign rate limit exceeded |  -  |
| **502** | DocuSign authentication failure, upstream error, or invalid response |  -  |
| **504** | DocuSign request timed out; reminder delivery outcome is unknown |  -  |

<a id="addDocusignEnvelopes"></a>
# **addDocusignEnvelopes**
> AddDocusignEnvelopesResponse addDocusignEnvelopes(documentId, addDocusignEnvelopesRequest, siteId, artifactId)

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
    String artifactId = "artifactId_example"; // String | Artifact Document Identifier
    try {
      AddDocusignEnvelopesResponse result = apiInstance.addDocusignEnvelopes(documentId, addDocusignEnvelopesRequest, siteId, artifactId);
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
| **artifactId** | **String**| Artifact Document Identifier | [optional] |

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
> AddDocusignRecipientViewResponse addDocusignRecipientView(documentId, envelopeId, addDocusignRecipientViewRequest, siteId, artifactId)

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
    String artifactId = "artifactId_example"; // String | Artifact Document Identifier
    try {
      AddDocusignRecipientViewResponse result = apiInstance.addDocusignRecipientView(documentId, envelopeId, addDocusignRecipientViewRequest, siteId, artifactId);
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
| **artifactId** | **String**| Artifact Document Identifier | [optional] |

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

<a id="addDocusignSenderView"></a>
# **addDocusignSenderView**
> AddDocusignSenderViewResponse addDocusignSenderView(documentId, envelopeId, addDocusignSenderViewRequest, siteId, artifactId)

Create Docusign Sender View request

DocuSign create Docusign Sender View request; available as an Add-On Module

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
    AddDocusignSenderViewRequest addDocusignSenderViewRequest = new AddDocusignSenderViewRequest(); // AddDocusignSenderViewRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    String artifactId = "artifactId_example"; // String | Artifact Document Identifier
    try {
      AddDocusignSenderViewResponse result = apiInstance.addDocusignSenderView(documentId, envelopeId, addDocusignSenderViewRequest, siteId, artifactId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ESignatureApi#addDocusignSenderView");
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
| **addDocusignSenderViewRequest** | [**AddDocusignSenderViewRequest**](AddDocusignSenderViewRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |
| **artifactId** | **String**| Artifact Document Identifier | [optional] |

### Return type

[**AddDocusignSenderViewResponse**](AddDocusignSenderViewResponse.md)

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

<a id="getDocusignEnvelope"></a>
# **getDocusignEnvelope**
> GetDocusignEnvelopeResponse getDocusignEnvelope(documentId, envelopeId, siteId, artifactId, environment)

Get Docusign envelope and recipient status

Retrieves the DocuSign envelope using include&#x3D;recipients and returns the DocuSign response directly, including envelope status and recipient routing information. No FormKiQ fields or wrapper are added. The envelope must be associated with the selected document or artifact. This read-only operation does not update document attributes or download the signed document. Available as an Add-On Module. Repeated status polling must be at least 15 minutes apart. Use recipients.signers[].recipientId from this response as entries in the optional recipientIds array in POST /esignature/docusign/{documentId}/envelopes/{envelopeId}/reminders to request reminders for selected signers.

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
    String siteId = "siteId_example"; // String | Site Identifier
    String artifactId = "artifactId_example"; // String | Artifact Document Identifier
    DocusignEnvironment environment = DocusignEnvironment.fromValue("PRODUCTION"); // DocusignEnvironment | DocuSign environment. Defaults to the site's docusignEnvironment; required when the site has no default. Use the environment in which the envelope was created.
    try {
      GetDocusignEnvelopeResponse result = apiInstance.getDocusignEnvelope(documentId, envelopeId, siteId, artifactId, environment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ESignatureApi#getDocusignEnvelope");
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
| **siteId** | **String**| Site Identifier | [optional] |
| **artifactId** | **String**| Artifact Document Identifier | [optional] |
| **environment** | [**DocusignEnvironment**](.md)| DocuSign environment. Defaults to the site&#39;s docusignEnvironment; required when the site has no default. Use the environment in which the envelope was created. | [optional] [enum: PRODUCTION, DEVELOPMENT] |

### Return type

[**GetDocusignEnvelopeResponse**](GetDocusignEnvelopeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | DocuSign envelope with recipients |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | Invalid parameters or missing DocuSign configuration |  -  |
| **401** | Authentication required |  -  |
| **403** | Access to the selected document or artifact is denied |  -  |
| **404** | Document, artifact, or associated DocuSign envelope not found |  -  |
| **429** | Envelope polling or DocuSign rate limit exceeded |  * Retry-After - Seconds to wait before another lookup <br>  |
| **502** | DocuSign authentication failure, upstream error, or invalid response |  -  |
| **504** | DocuSign request timed out |  -  |

