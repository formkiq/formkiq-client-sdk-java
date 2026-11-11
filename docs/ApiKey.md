

# ApiKey

An API key and its permission configuration. roleType is optional for legacy records. A missing roleType means permissions contains explicit CUSTOM grants. A predefined roleType determines the effective role grants, which can be discovered in the catalog.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of API Key |  [optional] |
|**apiKey** | **String** | API Key value |  [optional] |
|**userId** | **String** |  |  [optional] |
|**siteId** | **String** |  |  [optional] |
|**insertedDate** | **String** | Inserted Timestamp |  [optional] |
|**roleType** | **ApiPermissionRoleType** |  |  [optional] |
|**permissions** | **Set&lt;ApiPermissionGrant&gt;** | Explicit CUSTOM or legacy permission grants. |  [optional] |
|**groups** | **List&lt;String&gt;** | List of groups to add as custom claims to API Key |  [optional] |
|**customClaims** | **Map&lt;String, Object&gt;** | Custom claims associated with the API key and exposed in the requesting caller&#39;s userClaims. Values may be strings, numbers, Booleans, arrays, or objects. Null-valued object fields are omitted. These claims do not override the key&#39;s username, site, groups, role, or permissions. Keys created without custom claims have an empty claims map. |  [optional] |



