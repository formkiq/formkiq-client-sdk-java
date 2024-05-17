# SchemasApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSitesSchema**](SchemasApi.md#getSitesSchema) | **GET** /sites/{siteId}/schema/document | Get Sites Schema |
| [**setSitesSchema**](SchemasApi.md#setSitesSchema) | **PUT** /sites/{siteId}/schema/document | Set Sites Schema |


<a id="getSitesSchema"></a>
# **getSitesSchema**
> GetSitesSchemaResponse getSitesSchema(siteId, version)

Get Sites Schema

Gets Sites schema

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.SchemasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    SchemasApi apiInstance = new SchemasApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    String version = "version_example"; // String | Version
    try {
      GetSitesSchemaResponse result = apiInstance.getSitesSchema(siteId, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchemasApi#getSitesSchema");
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
| **siteId** | **String**| Site Identifier | |
| **version** | **String**| Version | [optional] |

### Return type

[**GetSitesSchemaResponse**](GetSitesSchemaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="setSitesSchema"></a>
# **setSitesSchema**
> SetResponse setSitesSchema(siteId, setSitesSchemaRequest)

Set Sites Schema

Sets Sites schema

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.SchemasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    SchemasApi apiInstance = new SchemasApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    SetSitesSchemaRequest setSitesSchemaRequest = new SetSitesSchemaRequest(); // SetSitesSchemaRequest | 
    try {
      SetResponse result = apiInstance.setSitesSchema(siteId, setSitesSchemaRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchemasApi#setSitesSchema");
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
| **siteId** | **String**| Site Identifier | |
| **setSitesSchemaRequest** | [**SetSitesSchemaRequest**](SetSitesSchemaRequest.md)|  | |

### Return type

[**SetResponse**](SetResponse.md)

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

