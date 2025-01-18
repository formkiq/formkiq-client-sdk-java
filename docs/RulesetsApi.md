# RulesetsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addRule**](RulesetsApi.md#addRule) | **POST** /rulesets/{rulesetId}/rules | Add New Rule |
| [**addRuleset**](RulesetsApi.md#addRuleset) | **POST** /rulesets | Add New Ruleset |
| [**deleteRule**](RulesetsApi.md#deleteRule) | **DELETE** /rulesets/{rulesetId}/rules/{ruleId} | Delete Rule |
| [**deleteRuleset**](RulesetsApi.md#deleteRuleset) | **DELETE** /rulesets/{rulesetId} | Delete Ruleset |
| [**getRule**](RulesetsApi.md#getRule) | **GET** /rulesets/{rulesetId}/rules/{ruleId} | Get Rule |
| [**getRules**](RulesetsApi.md#getRules) | **GET** /rulesets/{rulesetId}/rules | Get Rules |
| [**getRuleset**](RulesetsApi.md#getRuleset) | **GET** /rulesets/{rulesetId} | Get Ruleset |
| [**getRulesets**](RulesetsApi.md#getRulesets) | **GET** /rulesets | Get Rulesets |
| [**updateRule**](RulesetsApi.md#updateRule) | **PATCH** /rulesets/{rulesetId}/rules/{ruleId} | Update Rule |
| [**updateRuleset**](RulesetsApi.md#updateRuleset) | **PATCH** /rulesets/{rulesetId} | Update Ruleset |


<a id="addRule"></a>
# **addRule**
> AddRuleResponse addRule(rulesetId, addRuleRequest, siteId)

Add New Rule

Creates a new rule; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.RulesetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    RulesetsApi apiInstance = new RulesetsApi(defaultClient);
    String rulesetId = "rulesetId_example"; // String | Ruleset Identifier
    AddRuleRequest addRuleRequest = new AddRuleRequest(); // AddRuleRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      AddRuleResponse result = apiInstance.addRule(rulesetId, addRuleRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesetsApi#addRule");
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
| **rulesetId** | **String**| Ruleset Identifier | |
| **addRuleRequest** | [**AddRuleRequest**](AddRuleRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**AddRuleResponse**](AddRuleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 CREATED |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | 400 OK |  -  |

<a id="addRuleset"></a>
# **addRuleset**
> AddRulesetResponse addRuleset(addRulesetRequest, siteId)

Add New Ruleset

Creates a new ruleset; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.RulesetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    RulesetsApi apiInstance = new RulesetsApi(defaultClient);
    AddRulesetRequest addRulesetRequest = new AddRulesetRequest(); // AddRulesetRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      AddRulesetResponse result = apiInstance.addRuleset(addRulesetRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesetsApi#addRuleset");
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
| **addRulesetRequest** | [**AddRulesetRequest**](AddRulesetRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**AddRulesetResponse**](AddRulesetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 CREATED |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | 400 OK |  -  |

<a id="deleteRule"></a>
# **deleteRule**
> DeleteRuleResponse deleteRule(rulesetId, ruleId, siteId)

Delete Rule

Delete Rule; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.RulesetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    RulesetsApi apiInstance = new RulesetsApi(defaultClient);
    String rulesetId = "rulesetId_example"; // String | Ruleset Identifier
    String ruleId = "ruleId_example"; // String | Rule Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      DeleteRuleResponse result = apiInstance.deleteRule(rulesetId, ruleId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesetsApi#deleteRule");
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
| **rulesetId** | **String**| Ruleset Identifier | |
| **ruleId** | **String**| Rule Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**DeleteRuleResponse**](DeleteRuleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="deleteRuleset"></a>
# **deleteRuleset**
> DeleteRulesetResponse deleteRuleset(rulesetId, siteId)

Delete Ruleset

Delete Ruleset; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.RulesetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    RulesetsApi apiInstance = new RulesetsApi(defaultClient);
    String rulesetId = "rulesetId_example"; // String | Ruleset Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      DeleteRulesetResponse result = apiInstance.deleteRuleset(rulesetId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesetsApi#deleteRuleset");
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
| **rulesetId** | **String**| Ruleset Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**DeleteRulesetResponse**](DeleteRulesetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getRule"></a>
# **getRule**
> GetRuleResponse getRule(rulesetId, ruleId, siteId)

Get Rule

Returns a rule in a ruleset; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.RulesetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    RulesetsApi apiInstance = new RulesetsApi(defaultClient);
    String rulesetId = "rulesetId_example"; // String | Ruleset Identifier
    String ruleId = "ruleId_example"; // String | Rule Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      GetRuleResponse result = apiInstance.getRule(rulesetId, ruleId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesetsApi#getRule");
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
| **rulesetId** | **String**| Ruleset Identifier | |
| **ruleId** | **String**| Rule Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**GetRuleResponse**](GetRuleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getRules"></a>
# **getRules**
> GetRulesResponse getRules(rulesetId, siteId, next, limit)

Get Rules

Returns a list of rules in a ruleset; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.RulesetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    RulesetsApi apiInstance = new RulesetsApi(defaultClient);
    String rulesetId = "rulesetId_example"; // String | Ruleset Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    String next = "next_example"; // String | Next page of results token
    String limit = "10"; // String | Limit Results
    try {
      GetRulesResponse result = apiInstance.getRules(rulesetId, siteId, next, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesetsApi#getRules");
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
| **rulesetId** | **String**| Ruleset Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |
| **next** | **String**| Next page of results token | [optional] |
| **limit** | **String**| Limit Results | [optional] [default to 10] |

### Return type

[**GetRulesResponse**](GetRulesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getRuleset"></a>
# **getRuleset**
> GetRulesetResponse getRuleset(rulesetId, siteId)

Get Ruleset

Get a rule sets; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.RulesetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    RulesetsApi apiInstance = new RulesetsApi(defaultClient);
    String rulesetId = "rulesetId_example"; // String | Ruleset Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      GetRulesetResponse result = apiInstance.getRuleset(rulesetId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesetsApi#getRuleset");
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
| **rulesetId** | **String**| Ruleset Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**GetRulesetResponse**](GetRulesetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getRulesets"></a>
# **getRulesets**
> GetRulesetsResponse getRulesets(siteId, next, limit)

Get Rulesets

Returns a list of rule sets; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.RulesetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    RulesetsApi apiInstance = new RulesetsApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    String next = "next_example"; // String | Next page of results token
    String limit = "10"; // String | Limit Results
    try {
      GetRulesetsResponse result = apiInstance.getRulesets(siteId, next, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesetsApi#getRulesets");
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

[**GetRulesetsResponse**](GetRulesetsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="updateRule"></a>
# **updateRule**
> UpdateRuleResponse updateRule(rulesetId, ruleId, updateRuleRequest, siteId)

Update Rule

Update Rule; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.RulesetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    RulesetsApi apiInstance = new RulesetsApi(defaultClient);
    String rulesetId = "rulesetId_example"; // String | Ruleset Identifier
    String ruleId = "ruleId_example"; // String | Rule Identifier
    UpdateRuleRequest updateRuleRequest = new UpdateRuleRequest(); // UpdateRuleRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      UpdateRuleResponse result = apiInstance.updateRule(rulesetId, ruleId, updateRuleRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesetsApi#updateRule");
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
| **rulesetId** | **String**| Ruleset Identifier | |
| **ruleId** | **String**| Rule Identifier | |
| **updateRuleRequest** | [**UpdateRuleRequest**](UpdateRuleRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**UpdateRuleResponse**](UpdateRuleResponse.md)

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

<a id="updateRuleset"></a>
# **updateRuleset**
> UpdateRulesetResponse updateRuleset(rulesetId, updateRulesetRequest, siteId)

Update Ruleset

Updates an existing ruleset; available as an Add-On Module

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.RulesetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    RulesetsApi apiInstance = new RulesetsApi(defaultClient);
    String rulesetId = "rulesetId_example"; // String | Ruleset Identifier
    UpdateRulesetRequest updateRulesetRequest = new UpdateRulesetRequest(); // UpdateRulesetRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      UpdateRulesetResponse result = apiInstance.updateRuleset(rulesetId, updateRulesetRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesetsApi#updateRuleset");
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
| **rulesetId** | **String**| Ruleset Identifier | |
| **updateRulesetRequest** | [**UpdateRulesetRequest**](UpdateRulesetRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**UpdateRulesetResponse**](UpdateRulesetResponse.md)

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

