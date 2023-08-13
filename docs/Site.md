

# Site


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**siteId** | **String** | Site Identifier |  [optional] |
|**permission** | [**PermissionEnum**](#PermissionEnum) | SiteId permission level |  [optional] |
|**permissions** | [**List&lt;PermissionsEnum&gt;**](#List&lt;PermissionsEnum&gt;) | List of caller permissions |  [optional] |
|**uploadEmail** | **String** | SiteId document upload email address |  [optional] |



## Enum: PermissionEnum

| Name | Value |
|---- | -----|
| WRITE | &quot;READ_WRITE&quot; |
| ONLY | &quot;READ_ONLY&quot; |



## Enum: List&lt;PermissionsEnum&gt;

| Name | Value |
|---- | -----|
| ADMIN | &quot;ADMIN&quot; |
| DELETE | &quot;DELETE&quot; |
| READ | &quot;READ&quot; |
| WRITE | &quot;WRITE&quot; |



