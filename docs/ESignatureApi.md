# ESignatureApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addEsignatureDocusignEvents**](ESignatureApi.md#addEsignatureDocusignEvents) | **POST** /esignature/docusign/events | Add E-signature event |
| [**esignatureDocusign**](ESignatureApi.md#esignatureDocusign) | **POST** /esignature/docusign/{documentId} | Create E-signature request |
| [**esignatureDocusignConfig**](ESignatureApi.md#esignatureDocusignConfig) | **GET** /esignature/docusign/config | Get E-signature config |
| [**esignatureSetDocusignConfig**](ESignatureApi.md#esignatureSetDocusignConfig) | **PUT** /esignature/docusign/config | Set E-signature config |


<a id="addEsignatureDocusignEvents"></a>
# **addEsignatureDocusignEvents**
> EsignatureDocusignResponse addEsignatureDocusignEvents()

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
      EsignatureDocusignResponse result = apiInstance.addEsignatureDocusignEvents();
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

[**EsignatureDocusignResponse**](EsignatureDocusignResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="esignatureDocusign"></a>
# **esignatureDocusign**
> EsignatureDocusignResponse esignatureDocusign(documentId, esignatureDocusignRequest, siteId)

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
    EsignatureDocusignRequest esignatureDocusignRequest = new EsignatureDocusignRequest(); // EsignatureDocusignRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      EsignatureDocusignResponse result = apiInstance.esignatureDocusign(documentId, esignatureDocusignRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ESignatureApi#esignatureDocusign");
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
| **esignatureDocusignRequest** | [**EsignatureDocusignRequest**](EsignatureDocusignRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**EsignatureDocusignResponse**](EsignatureDocusignResponse.md)

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

<a id="esignatureDocusignConfig"></a>
# **esignatureDocusignConfig**
> EsignatureDocusignConfigResponse esignatureDocusignConfig(siteId)

Get E-signature config

Get DocuSign configuration info; ONLY available with FormKiQ Enterprise

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
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      EsignatureDocusignConfigResponse result = apiInstance.esignatureDocusignConfig(siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ESignatureApi#esignatureDocusignConfig");
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

### Return type

[**EsignatureDocusignConfigResponse**](EsignatureDocusignConfigResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="esignatureSetDocusignConfig"></a>
# **esignatureSetDocusignConfig**
> EsignatureSetDocusignConfigResponse esignatureSetDocusignConfig(esignatureSetDocusignConfigRequest, siteId)

Set E-signature config

Set DocuSign configuration, required for integration; ONLY available with FormKiQ Enterprise

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
    EsignatureSetDocusignConfigRequest esignatureSetDocusignConfigRequest = new EsignatureSetDocusignConfigRequest(); // EsignatureSetDocusignConfigRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      EsignatureSetDocusignConfigResponse result = apiInstance.esignatureSetDocusignConfig(esignatureSetDocusignConfigRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ESignatureApi#esignatureSetDocusignConfig");
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
| **esignatureSetDocusignConfigRequest** | [**EsignatureSetDocusignConfigRequest**](EsignatureSetDocusignConfigRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**EsignatureSetDocusignConfigResponse**](EsignatureSetDocusignConfigResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

