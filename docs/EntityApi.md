# EntityApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addEntity**](EntityApi.md#addEntity) | **POST** /entities/{entityTypeId} | Add New Entity |
| [**addEntityType**](EntityApi.md#addEntityType) | **POST** /entityTypes | Add New EntityType |
| [**deleteEntity**](EntityApi.md#deleteEntity) | **DELETE** /entities/{entityTypeId}/{entityId} | Deletes Entity |
| [**deleteEntityType**](EntityApi.md#deleteEntityType) | **DELETE** /entityTypes/{entityTypeId} | Deletes Entity Type |
| [**getEntities**](EntityApi.md#getEntities) | **GET** /entities/{entityTypeId} | Get Entities |
| [**getEntity**](EntityApi.md#getEntity) | **GET** /entities/{entityTypeId}/{entityId} | Get Entity |
| [**getEntityType**](EntityApi.md#getEntityType) | **GET** /entityTypes/{entityTypeId} | Get EntityType |
| [**getEntityTypes**](EntityApi.md#getEntityTypes) | **GET** /entityTypes | Get EntityTypes |
| [**updateEntity**](EntityApi.md#updateEntity) | **PATCH** /entities/{entityTypeId}/{entityId} | Update Entity |


<a id="addEntity"></a>
# **addEntity**
> AddEntityResponse addEntity(entityTypeId, addEntityRequest, siteId, namespace)

Add New Entity

Creates a Entity

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.EntityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    EntityApi apiInstance = new EntityApi(defaultClient);
    String entityTypeId = "entityTypeId_example"; // String | EntityType Identifier
    AddEntityRequest addEntityRequest = new AddEntityRequest(); // AddEntityRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    String namespace = "PRESET"; // String | Namespace Identifier
    try {
      AddEntityResponse result = apiInstance.addEntity(entityTypeId, addEntityRequest, siteId, namespace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityApi#addEntity");
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
| **entityTypeId** | **String**| EntityType Identifier | |
| **addEntityRequest** | [**AddEntityRequest**](AddEntityRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |
| **namespace** | **String**| Namespace Identifier | [optional] [enum: PRESET, CUSTOM] |

### Return type

[**AddEntityResponse**](AddEntityResponse.md)

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

<a id="addEntityType"></a>
# **addEntityType**
> AddEntityTypeResponse addEntityType(addEntityTypeRequest, siteId)

Add New EntityType

Creates a Entity Type

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.EntityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    EntityApi apiInstance = new EntityApi(defaultClient);
    AddEntityTypeRequest addEntityTypeRequest = new AddEntityTypeRequest(); // AddEntityTypeRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      AddEntityTypeResponse result = apiInstance.addEntityType(addEntityTypeRequest, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityApi#addEntityType");
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
| **addEntityTypeRequest** | [**AddEntityTypeRequest**](AddEntityTypeRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |

### Return type

[**AddEntityTypeResponse**](AddEntityTypeResponse.md)

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

<a id="deleteEntity"></a>
# **deleteEntity**
> DeleteResponse deleteEntity(entityTypeId, entityId, siteId)

Deletes Entity

Deletes Entity

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.EntityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    EntityApi apiInstance = new EntityApi(defaultClient);
    String entityTypeId = "entityTypeId_example"; // String | EntityType Identifier
    String entityId = "entityId_example"; // String | Entity Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      DeleteResponse result = apiInstance.deleteEntity(entityTypeId, entityId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityApi#deleteEntity");
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
| **entityTypeId** | **String**| EntityType Identifier | |
| **entityId** | **String**| Entity Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |

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

<a id="deleteEntityType"></a>
# **deleteEntityType**
> DeleteResponse deleteEntityType(entityTypeId, siteId)

Deletes Entity Type

Deletes Entity Type

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.EntityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    EntityApi apiInstance = new EntityApi(defaultClient);
    String entityTypeId = "entityTypeId_example"; // String | EntityType Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      DeleteResponse result = apiInstance.deleteEntityType(entityTypeId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityApi#deleteEntityType");
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
| **entityTypeId** | **String**| EntityType Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |

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

<a id="getEntities"></a>
# **getEntities**
> GetEntitiesResponse getEntities(entityTypeId, siteId, namespace, next, limit)

Get Entities

Returns a list of entities

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.EntityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    EntityApi apiInstance = new EntityApi(defaultClient);
    String entityTypeId = "entityTypeId_example"; // String | EntityType Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    String namespace = "PRESET"; // String | Namespace Identifier
    String next = "next_example"; // String | Next page of results token
    String limit = "10"; // String | Limit Results
    try {
      GetEntitiesResponse result = apiInstance.getEntities(entityTypeId, siteId, namespace, next, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityApi#getEntities");
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
| **entityTypeId** | **String**| EntityType Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |
| **namespace** | **String**| Namespace Identifier | [optional] [enum: PRESET, CUSTOM] |
| **next** | **String**| Next page of results token | [optional] |
| **limit** | **String**| Limit Results | [optional] [default to 10] |

### Return type

[**GetEntitiesResponse**](GetEntitiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getEntity"></a>
# **getEntity**
> GetEntityResponse getEntity(entityTypeId, entityId, siteId, namespace)

Get Entity

Returns a entity

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.EntityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    EntityApi apiInstance = new EntityApi(defaultClient);
    String entityTypeId = "entityTypeId_example"; // String | EntityType Identifier
    String entityId = "entityId_example"; // String | Entity Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    String namespace = "PRESET"; // String | Namespace Identifier
    try {
      GetEntityResponse result = apiInstance.getEntity(entityTypeId, entityId, siteId, namespace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityApi#getEntity");
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
| **entityTypeId** | **String**| EntityType Identifier | |
| **entityId** | **String**| Entity Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |
| **namespace** | **String**| Namespace Identifier | [optional] [enum: PRESET, CUSTOM] |

### Return type

[**GetEntityResponse**](GetEntityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getEntityType"></a>
# **getEntityType**
> GetEntityTypeResponse getEntityType(entityTypeId, siteId, namespace)

Get EntityType

Returns a entity type

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.EntityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    EntityApi apiInstance = new EntityApi(defaultClient);
    String entityTypeId = "entityTypeId_example"; // String | EntityType Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    String namespace = "PRESET"; // String | Namespace Identifier
    try {
      GetEntityTypeResponse result = apiInstance.getEntityType(entityTypeId, siteId, namespace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityApi#getEntityType");
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
| **entityTypeId** | **String**| EntityType Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |
| **namespace** | **String**| Namespace Identifier | [optional] [enum: PRESET, CUSTOM] |

### Return type

[**GetEntityTypeResponse**](GetEntityTypeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getEntityTypes"></a>
# **getEntityTypes**
> GetEntityTypesResponse getEntityTypes(siteId, namespace, next, limit)

Get EntityTypes

Returns a list of entity types

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.EntityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    EntityApi apiInstance = new EntityApi(defaultClient);
    String siteId = "siteId_example"; // String | Site Identifier
    String namespace = "PRESET"; // String | Namespace Identifier
    String next = "next_example"; // String | Next page of results token
    String limit = "10"; // String | Limit Results
    try {
      GetEntityTypesResponse result = apiInstance.getEntityTypes(siteId, namespace, next, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityApi#getEntityTypes");
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
| **namespace** | **String**| Namespace Identifier | [optional] [enum: PRESET, CUSTOM] |
| **next** | **String**| Next page of results token | [optional] |
| **limit** | **String**| Limit Results | [optional] [default to 10] |

### Return type

[**GetEntityTypesResponse**](GetEntityTypesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="updateEntity"></a>
# **updateEntity**
> UpdateResponse updateEntity(entityTypeId, entityId, updateEntityRequest, siteId, namespace)

Update Entity

Updates a Entity

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.EntityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    EntityApi apiInstance = new EntityApi(defaultClient);
    String entityTypeId = "entityTypeId_example"; // String | EntityType Identifier
    String entityId = "entityId_example"; // String | Entity Identifier
    UpdateEntityRequest updateEntityRequest = new UpdateEntityRequest(); // UpdateEntityRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    String namespace = "PRESET"; // String | Namespace Identifier
    try {
      UpdateResponse result = apiInstance.updateEntity(entityTypeId, entityId, updateEntityRequest, siteId, namespace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityApi#updateEntity");
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
| **entityTypeId** | **String**| EntityType Identifier | |
| **entityId** | **String**| Entity Identifier | |
| **updateEntityRequest** | [**UpdateEntityRequest**](UpdateEntityRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |
| **namespace** | **String**| Namespace Identifier | [optional] [enum: PRESET, CUSTOM] |

### Return type

[**UpdateResponse**](UpdateResponse.md)

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

