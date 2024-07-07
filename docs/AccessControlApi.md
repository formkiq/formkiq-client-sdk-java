# AccessControlApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteOpaAccessPolicyItems**](AccessControlApi.md#deleteOpaAccessPolicyItems) | **DELETE** /sites/{siteId}/opa/accessPolicy/policyItems | Delete OPA Access Policy Items |
| [**getOpaAccessPolicies**](AccessControlApi.md#getOpaAccessPolicies) | **GET** /sites/opa/accessPolicies | Get OPAs Access Policies |
| [**getOpaAccessPolicy**](AccessControlApi.md#getOpaAccessPolicy) | **GET** /sites/{siteId}/opa/accessPolicy | Get OPA Access Policy |
| [**getOpaAccessPolicyItems**](AccessControlApi.md#getOpaAccessPolicyItems) | **GET** /sites/{siteId}/opa/accessPolicy/policyItems | Get OPA Access Policy Items |
| [**setOpaAccessPolicyItems**](AccessControlApi.md#setOpaAccessPolicyItems) | **PUT** /sites/{siteId}/opa/accessPolicy/policyItems | Set opa access policy items, can only be requested with ADMIN privileges |


<a id="deleteOpaAccessPolicyItems"></a>
# **deleteOpaAccessPolicyItems**
> DeleteResponse deleteOpaAccessPolicyItems(siteId)

Delete OPA Access Policy Items

Delete OPA Access Policy Items

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.AccessControlApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    AccessControlApi apiInstance = new AccessControlApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      DeleteResponse result = apiInstance.deleteOpaAccessPolicyItems(siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessControlApi#deleteOpaAccessPolicyItems");
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

### Return type

[**DeleteResponse**](DeleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getOpaAccessPolicies"></a>
# **getOpaAccessPolicies**
> GetOpaAccessPoliciesResponse getOpaAccessPolicies()

Get OPAs Access Policies

Returns a list of OPA Access Policies, can only be requested with ADMIN privileges

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.AccessControlApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    AccessControlApi apiInstance = new AccessControlApi(defaultClient);
    try {
      GetOpaAccessPoliciesResponse result = apiInstance.getOpaAccessPolicies();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessControlApi#getOpaAccessPolicies");
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

[**GetOpaAccessPoliciesResponse**](GetOpaAccessPoliciesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getOpaAccessPolicy"></a>
# **getOpaAccessPolicy**
> GetOpaAccessPolicyResponse getOpaAccessPolicy(siteId)

Get OPA Access Policy

Returns OPA Access Policy, can only be requested with ADMIN privileges

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.AccessControlApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    AccessControlApi apiInstance = new AccessControlApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      GetOpaAccessPolicyResponse result = apiInstance.getOpaAccessPolicy(siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessControlApi#getOpaAccessPolicy");
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

### Return type

[**GetOpaAccessPolicyResponse**](GetOpaAccessPolicyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getOpaAccessPolicyItems"></a>
# **getOpaAccessPolicyItems**
> GetOpaAccessPolicyItemsResponse getOpaAccessPolicyItems(siteId)

Get OPA Access Policy Items

Returns OPA Access Policy Items, can only be requested with ADMIN privileges

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.AccessControlApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    AccessControlApi apiInstance = new AccessControlApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      GetOpaAccessPolicyItemsResponse result = apiInstance.getOpaAccessPolicyItems(siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessControlApi#getOpaAccessPolicyItems");
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

### Return type

[**GetOpaAccessPolicyItemsResponse**](GetOpaAccessPolicyItemsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="setOpaAccessPolicyItems"></a>
# **setOpaAccessPolicyItems**
> SetResponse setOpaAccessPolicyItems(siteId, setOpaAccessPolicyItemsRequest)

Set opa access policy items, can only be requested with ADMIN privileges

Sets opa access policy items

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.AccessControlApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    AccessControlApi apiInstance = new AccessControlApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    SetOpaAccessPolicyItemsRequest setOpaAccessPolicyItemsRequest = new SetOpaAccessPolicyItemsRequest(); // SetOpaAccessPolicyItemsRequest | 
    try {
      SetResponse result = apiInstance.setOpaAccessPolicyItems(siteId, setOpaAccessPolicyItemsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessControlApi#setOpaAccessPolicyItems");
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
| **setOpaAccessPolicyItemsRequest** | [**SetOpaAccessPolicyItemsRequest**](SetOpaAccessPolicyItemsRequest.md)|  | |

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
| **200** | 200 CREATED |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | 400 OK |  -  |

