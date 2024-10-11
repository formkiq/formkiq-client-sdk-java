

# Site


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**siteId** | **String** | Site Identifier |  [optional] |
|**title** | **String** | Site Title |  [optional] |
|**status** | **SiteStatus** |  |  [optional] |
|**permission** | [**PermissionEnum**](#PermissionEnum) | SiteId permission level |  [optional] |
|**permissions** | **List&lt;SiteGroupPermissions&gt;** |  |  [optional] |
|**uploadEmail** | **String** | SiteId document upload email address |  [optional] |



## Enum: PermissionEnum

| Name | Value |
|---- | -----|
| WRITE | &quot;READ_WRITE&quot; |
| ONLY | &quot;READ_ONLY&quot; |



