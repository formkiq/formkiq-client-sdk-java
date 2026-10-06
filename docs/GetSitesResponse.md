

# GetSitesResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**username** | **String** | Username of request caller |  [optional] |
|**roles** | **List&lt;String&gt;** |  |  [optional] |
|**samlGroups** | **List&lt;String&gt;** | List of User Saml Groups |  [optional] |
|**userClaims** | **Map&lt;String, Object&gt;** | Custom claims for the authenticated caller, from a JWT or API key. Values retain their JSON types, including strings, numbers, Booleans, arrays, and objects. Null-valued object fields are omitted. |  [optional] |
|**sites** | [**List&lt;Site&gt;**](Site.md) | List of sites |  [optional] |



