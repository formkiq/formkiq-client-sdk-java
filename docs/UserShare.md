

# UserShare


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**group** | **String** | Name of Share Group |  [optional] |
|**shareKey** | **String** | Share Identifier |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of Document |  [optional] |
|**permissions** | [**List&lt;PermissionsEnum&gt;**](#List&lt;PermissionsEnum&gt;) | List of share permissions |  [optional] |
|**siteId** | **String** | Site Identifier |  [optional] |
|**path** | **String** | Path or Name of document |  [optional] |
|**userId** | **String** | User who created share |  [optional] |
|**permissionType** | [**PermissionTypeEnum**](#PermissionTypeEnum) | Type of share |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FOLDER | &quot;FOLDER&quot; |



## Enum: List&lt;PermissionsEnum&gt;

| Name | Value |
|---- | -----|
| READ | &quot;READ&quot; |
| WRITE | &quot;WRITE&quot; |
| DELETE | &quot;DELETE&quot; |



## Enum: PermissionTypeEnum

| Name | Value |
|---- | -----|
| GROUP | &quot;GROUP&quot; |



