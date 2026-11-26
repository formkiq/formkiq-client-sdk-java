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
| [**getDocusignEnvelopeAuditEvents**](ESignatureApi.md#getDocusignEnvelopeAuditEvents) | **GET** /esignature/docusign/{documentId}/envelopes/{envelopeId}/auditEvents | Get DocuSign envelope audit events |
| [**voidDocusignEnvelope**](ESignatureApi.md#voidDocusignEnvelope) | **POST** /esignature/docusign/{documentId}/envelopes/{envelopeId}/void | Void a DocuSign envelope |


<a id="addDocusignEnvelopeReminders"></a>
# **addDocusignEnvelopeReminders**
> AddDocusignEnvelopeRemindersResponse addDocusignEnvelopeReminders(documentId, envelopeId, siteId, artifactId, environment, addDocusignEnvelopeRemindersRequest)

Request DocuSign signing reminders

Resends signing notifications for an in-progress DocuSign envelope; available as an Add-On Module. With no request body or an empty object, DocuSign reminds all eligible recipients at the current routing step. Supply recipientIds to remind only the selected eligible signers. Obtain IDs from recipients.signers[].recipientId in GET /esignature/docusign/{documentId}/envelopes/{envelopeId}. Every selected signer must still be awaiting action at the current routing step when this request is processed. Validate the entire selection before issuing a resend. Completed and future-step signers cannot be targeted. Invalid targeted requests never fall back to reminding all recipients. Recipient notification settings are respected; this operation does not send FormKiQ notifications to embedded-only or email-suppressed signers. Requires write access to the selected document or artifact and a matching stored envelope ID. The operation resends the existing invitation without changing recipients, documents, routing, or automatic reminder settings. Targeted responses report each selected recipient&#39;s acceptance or failure, with no overall status. Acceptance does not confirm notification delivery. Do not automatically retry after a timeout because the reminder may already have been requested. Uses the envelope&#39;s stored account, environment, connection identity, and API base URI when available; changes to the site&#39;s default account do not reroute an envelope with a stored association. Envelopes without a stored association continue using the existing docusign configuration.

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
    DocusignEnvironment environment = DocusignEnvironment.fromValue("PRODUCTION"); // DocusignEnvironment | DocuSign environment. When the envelope has a stored account association, defaults to its stored environment and rejects conflicting explicit values. Otherwise, preserves existing behavior: an explicit environment is used, or defaults to the site's docusign environment when omitted. Required when neither the request nor configuration supplies an environment.
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
| **environment** | [**DocusignEnvironment**](.md)| DocuSign environment. When the envelope has a stored account association, defaults to its stored environment and rejects conflicting explicit values. Otherwise, preserves existing behavior: an explicit environment is used, or defaults to the site&#39;s docusign environment when omitted. Required when neither the request nor configuration supplies an environment. | [optional] [enum: PRODUCTION, DEVELOPMENT] |
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
> AddDocusignEnvelopesResponse addDocusignEnvelopes(documentId, addDocusignEnvelopesRequest, siteId, artifactId, accountId)

Create Docusign Envelope request

Create a DocuSign envelope for the selected document or artifact; available as an Add-On Module. Recipient tabs support signatures, initials, automatic signing dates, recipient-entered dates, and single-line or multiline text. See DocusignSigningTabs for the supported collections and validation rules. Use the accountId query parameter to select the site&#39;s default docusign account or an additionalDocusignAccounts entry. When omitted, uses the default docusign configuration, preserving existing single-account behavior. The selected account&#39;s DocuSign settings control automatic Date Signed formatting. The account ID, environment, connection identity, and API base URI are stored with the document or artifact envelope association for all subsequent operations. Account selection does not modify a returned DocuSign signing URL. For example, POST /esignature/docusign/{documentId}/envelopes?siteId&#x3D;contracts&amp;accountId&#x3D;a1111111-b222-4333-8444-e55555555555 selects that configured account.

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
    String accountId = "a1111111-b222-4333-8444-e55555555555"; // String | DocuSign API account GUID configured in the site's docusign or additionalDocusignAccounts settings. On envelope creation, selects that account and its API base URI. When omitted, uses docusign.accountId, or the first account returned for the default DocuSign identity when that setting is absent. For an existing envelope, the stored account association is authoritative when present; otherwise uses the existing docusign configuration. Omit this parameter or supply the matching account ID. Malformed, unconfigured, inaccessible, or mismatching IDs are rejected before an envelope or view request is sent to DocuSign, without fallback. Account selection does not grant access to a site, document, or artifact.
    try {
      AddDocusignEnvelopesResponse result = apiInstance.addDocusignEnvelopes(documentId, addDocusignEnvelopesRequest, siteId, artifactId, accountId);
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
| **accountId** | **String**| DocuSign API account GUID configured in the site&#39;s docusign or additionalDocusignAccounts settings. On envelope creation, selects that account and its API base URI. When omitted, uses docusign.accountId, or the first account returned for the default DocuSign identity when that setting is absent. For an existing envelope, the stored account association is authoritative when present; otherwise uses the existing docusign configuration. Omit this parameter or supply the matching account ID. Malformed, unconfigured, inaccessible, or mismatching IDs are rejected before an envelope or view request is sent to DocuSign, without fallback. Account selection does not grant access to a site, document, or artifact. | [optional] |

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
| **400** | Invalid envelope request, malformed, unconfigured, or inaccessible accountId, or an environment conflicting with the selected account. |  -  |
| **403** | Access to the selected document, artifact, or configured DocuSign account is denied |  -  |

<a id="addDocusignRecipientView"></a>
# **addDocusignRecipientView**
> AddDocusignRecipientViewResponse addDocusignRecipientView(documentId, envelopeId, addDocusignRecipientViewRequest, siteId, artifactId, accountId)

Create Docusign Recipient View request

Creates a DocuSign recipient view for the selected document or artifact; available as an Add-On Module. Uses the envelope&#39;s stored account, environment, connection identity, and API base URI when available, otherwise using the existing docusign configuration. The optional accountId must match the envelope&#39;s stored account or, when no association is stored, the account resolved through docusign. Mismatches fail before contacting DocuSign. The returned signing URL belongs to that envelope and account.

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
    String accountId = "a1111111-b222-4333-8444-e55555555555"; // String | DocuSign API account GUID configured in the site's docusign or additionalDocusignAccounts settings. On envelope creation, selects that account and its API base URI. When omitted, uses docusign.accountId, or the first account returned for the default DocuSign identity when that setting is absent. For an existing envelope, the stored account association is authoritative when present; otherwise uses the existing docusign configuration. Omit this parameter or supply the matching account ID. Malformed, unconfigured, inaccessible, or mismatching IDs are rejected before an envelope or view request is sent to DocuSign, without fallback. Account selection does not grant access to a site, document, or artifact.
    try {
      AddDocusignRecipientViewResponse result = apiInstance.addDocusignRecipientView(documentId, envelopeId, addDocusignRecipientViewRequest, siteId, artifactId, accountId);
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
| **accountId** | **String**| DocuSign API account GUID configured in the site&#39;s docusign or additionalDocusignAccounts settings. On envelope creation, selects that account and its API base URI. When omitted, uses docusign.accountId, or the first account returned for the default DocuSign identity when that setting is absent. For an existing envelope, the stored account association is authoritative when present; otherwise uses the existing docusign configuration. Omit this parameter or supply the matching account ID. Malformed, unconfigured, inaccessible, or mismatching IDs are rejected before an envelope or view request is sent to DocuSign, without fallback. Account selection does not grant access to a site, document, or artifact. | [optional] |

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
| **400** | Invalid view request, malformed or mismatching accountId, unavailable account configuration, or an environment conflicting with the envelope. |  -  |
| **403** | Access to the selected document, artifact, or configured DocuSign account is denied |  -  |

<a id="addDocusignSenderView"></a>
# **addDocusignSenderView**
> AddDocusignSenderViewResponse addDocusignSenderView(documentId, envelopeId, addDocusignSenderViewRequest, siteId, artifactId, accountId)

Create Docusign Sender View request

Creates a DocuSign sender view for the selected document or artifact; available as an Add-On Module. Uses the envelope&#39;s stored account, environment, connection identity, and API base URI when available, otherwise using the existing docusign configuration. The optional accountId must match the envelope&#39;s stored account or, when no association is stored, the account resolved through docusign. Mismatches fail before contacting DocuSign. The returned view URL belongs to that envelope and account.

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
    String accountId = "a1111111-b222-4333-8444-e55555555555"; // String | DocuSign API account GUID configured in the site's docusign or additionalDocusignAccounts settings. On envelope creation, selects that account and its API base URI. When omitted, uses docusign.accountId, or the first account returned for the default DocuSign identity when that setting is absent. For an existing envelope, the stored account association is authoritative when present; otherwise uses the existing docusign configuration. Omit this parameter or supply the matching account ID. Malformed, unconfigured, inaccessible, or mismatching IDs are rejected before an envelope or view request is sent to DocuSign, without fallback. Account selection does not grant access to a site, document, or artifact.
    try {
      AddDocusignSenderViewResponse result = apiInstance.addDocusignSenderView(documentId, envelopeId, addDocusignSenderViewRequest, siteId, artifactId, accountId);
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
| **accountId** | **String**| DocuSign API account GUID configured in the site&#39;s docusign or additionalDocusignAccounts settings. On envelope creation, selects that account and its API base URI. When omitted, uses docusign.accountId, or the first account returned for the default DocuSign identity when that setting is absent. For an existing envelope, the stored account association is authoritative when present; otherwise uses the existing docusign configuration. Omit this parameter or supply the matching account ID. Malformed, unconfigured, inaccessible, or mismatching IDs are rejected before an envelope or view request is sent to DocuSign, without fallback. Account selection does not grant access to a site, document, or artifact. | [optional] |

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
| **400** | Invalid view request, malformed or mismatching accountId, unavailable account configuration, or an environment conflicting with the envelope. |  -  |
| **403** | Access to the selected document, artifact, or configured DocuSign account is denied |  -  |

<a id="addEsignatureDocusignEvents"></a>
# **addEsignatureDocusignEvents**
> AddResponse addEsignatureDocusignEvents()

Add E-signature event

DocuSign callback URL handler; available as an Add-On Module. Uses the document or artifact envelope&#39;s stored account association when available, otherwise using the existing docusign configuration. Validates the site, document, artifact, envelope, and account before processing. HMAC verification uses that account configuration&#39;s hmacSignature when configured. Callback account identity alone does not authorize processing. Signed-document retrieval uses the stored account, environment, connection identity, and API base URI, regardless of changes to the site&#39;s default. Credential rotation must preserve access to in-flight and historical envelopes; an unavailable account must not cause fallback to another account.

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

Retrieves the DocuSign envelope using include&#x3D;recipients and returns the DocuSign response directly, including envelope status and recipient routing information. No FormKiQ fields or wrapper are added. The envelope must be associated with the selected document or artifact. This read-only operation does not update document attributes or download the signed document. Available as an Add-On Module. Repeated status polling must be at least 15 minutes apart. Use recipients.signers[].recipientId from this response as entries in the optional recipientIds array in POST /esignature/docusign/{documentId}/envelopes/{envelopeId}/reminders to request reminders for selected signers. Uses the envelope&#39;s stored account, environment, connection identity, and API base URI when available; changes to the site&#39;s default account do not reroute an envelope with a stored association. Envelopes without a stored association continue using the existing docusign configuration.

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
    DocusignEnvironment environment = DocusignEnvironment.fromValue("PRODUCTION"); // DocusignEnvironment | DocuSign environment. When the envelope has a stored account association, defaults to its stored environment and rejects conflicting explicit values. Otherwise, preserves existing behavior: an explicit environment is used, or defaults to the site's docusign environment when omitted. Required when neither the request nor configuration supplies an environment.
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
| **environment** | [**DocusignEnvironment**](.md)| DocuSign environment. When the envelope has a stored account association, defaults to its stored environment and rejects conflicting explicit values. Otherwise, preserves existing behavior: an explicit environment is used, or defaults to the site&#39;s docusign environment when omitted. Required when neither the request nor configuration supplies an environment. | [optional] [enum: PRODUCTION, DEVELOPMENT] |

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

<a id="getDocusignEnvelopeAuditEvents"></a>
# **getDocusignEnvelopeAuditEvents**
> GetDocusignEnvelopeAuditEventsResponse getDocusignEnvelopeAuditEvents(documentId, envelopeId, siteId, artifactId, environment)

Get DocuSign envelope audit events

Retrieves the audit history recorded by DocuSign for an associated envelope; available as an Add-On Module. Requires read access to the selected document or artifact and validates its stored envelope association before contacting DocuSign. Calls GET /restapi/v2.1/accounts/{accountId}/envelopes/{envelopeId}/audit_events, resolving the account, environment, API base URI, and connection identity through the stored envelope association when available, otherwise using the site&#39;s existing docusign configuration. Returns DocuSign&#39;s JSON unchanged, including auditEvents, paymentEvents, and any additional fields, without a FormKiQ wrapper. Includes reminder and resend events when recorded by DocuSign; this history does not guarantee that every reminder is recorded or confirm inbox delivery. Reminder and resend webhook subscriptions are separate from this operation.

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
    DocusignEnvironment environment = DocusignEnvironment.fromValue("PRODUCTION"); // DocusignEnvironment | DocuSign environment. When the envelope has a stored account association, defaults to its stored environment and rejects conflicting explicit values. Otherwise, preserves existing behavior: an explicit environment is used, or defaults to the site's docusign environment when omitted. Required when neither the request nor configuration supplies an environment.
    try {
      GetDocusignEnvelopeAuditEventsResponse result = apiInstance.getDocusignEnvelopeAuditEvents(documentId, envelopeId, siteId, artifactId, environment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ESignatureApi#getDocusignEnvelopeAuditEvents");
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
| **environment** | [**DocusignEnvironment**](.md)| DocuSign environment. When the envelope has a stored account association, defaults to its stored environment and rejects conflicting explicit values. Otherwise, preserves existing behavior: an explicit environment is used, or defaults to the site&#39;s docusign environment when omitted. Required when neither the request nor configuration supplies an environment. | [optional] [enum: PRODUCTION, DEVELOPMENT] |

### Return type

[**GetDocusignEnvelopeAuditEventsResponse**](GetDocusignEnvelopeAuditEventsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | DocuSign envelope audit history returned unchanged |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  * Cache-Control - Prevents caching of the envelope audit history <br>  |
| **400** | Invalid parameters or missing DocuSign configuration |  -  |
| **401** | Authentication required |  -  |
| **403** | Read access to the selected document or artifact is denied |  -  |
| **404** | Document, artifact, or associated DocuSign envelope not found |  -  |
| **429** | DocuSign rate limit exceeded |  * Retry-After - Seconds to wait before another lookup <br>  |
| **502** | DocuSign authentication failure, upstream error, or invalid response |  -  |
| **504** | DocuSign request timed out |  -  |

<a id="voidDocusignEnvelope"></a>
# **voidDocusignEnvelope**
> VoidDocusignEnvelopeResponse voidDocusignEnvelope(documentId, envelopeId, voidDocusignEnvelopeRequest, siteId, artifactId, environment)

Void a DocuSign envelope

Cancels an in-progress DocuSign envelope; available as an Add-On Module. Requires write access to the selected document or artifact and a matching stored envelope ID. Calls DocuSign&#39;s envelope update API, PUT /restapi/v2.1/accounts/{accountId}/envelopes/{envelopeId}, with status set to voided and the supplied voidedReason. DocuSign notifies recipients that the envelope was voided, including the supplied reason. Only sent or delivered envelopes can be voided. If the envelope is already voided, returns its current state without another update or changing its original reason. Voiding cannot be undone. The existing envelope-voided callback updates the stored FormKiQ status. After a timeout, the outcome is unknown; check the existing GET envelope status endpoint before attempting the operation again. Uses the envelope&#39;s stored account, environment, connection identity, and API base URI when available; changes to the site&#39;s default account do not reroute an envelope with a stored association. Envelopes without a stored association continue using the existing docusign configuration.

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
    VoidDocusignEnvelopeRequest voidDocusignEnvelopeRequest = new VoidDocusignEnvelopeRequest(); // VoidDocusignEnvelopeRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    String artifactId = "artifactId_example"; // String | Artifact Document Identifier
    DocusignEnvironment environment = DocusignEnvironment.fromValue("PRODUCTION"); // DocusignEnvironment | DocuSign environment. When the envelope has a stored account association, defaults to its stored environment and rejects conflicting explicit values. Otherwise, preserves existing behavior: an explicit environment is used, or defaults to the site's docusign environment when omitted. Required when neither the request nor configuration supplies an environment.
    try {
      VoidDocusignEnvelopeResponse result = apiInstance.voidDocusignEnvelope(documentId, envelopeId, voidDocusignEnvelopeRequest, siteId, artifactId, environment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ESignatureApi#voidDocusignEnvelope");
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
| **voidDocusignEnvelopeRequest** | [**VoidDocusignEnvelopeRequest**](VoidDocusignEnvelopeRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |
| **artifactId** | **String**| Artifact Document Identifier | [optional] |
| **environment** | [**DocusignEnvironment**](.md)| DocuSign environment. When the envelope has a stored account association, defaults to its stored environment and rejects conflicting explicit values. Otherwise, preserves existing behavior: an explicit environment is used, or defaults to the site&#39;s docusign environment when omitted. Required when neither the request nor configuration supplies an environment. | [optional] [enum: PRODUCTION, DEVELOPMENT] |

### Return type

[**VoidDocusignEnvelopeResponse**](VoidDocusignEnvelopeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | DocuSign envelope voided successfully |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | Invalid parameters, missing, blank, or overlong voidedReason, missing DocuSign configuration, or an envelope that is not eligible to be voided. |  -  |
| **401** | Authentication required |  -  |
| **403** | Write access to the selected document or artifact is denied |  -  |
| **404** | Document, artifact, or associated DocuSign envelope not found |  -  |
| **429** | DocuSign rate limit exceeded |  -  |
| **502** | DocuSign authentication failure, upstream error, or invalid response |  -  |
| **504** | DocuSign request timed out; the void operation outcome is unknown |  -  |

