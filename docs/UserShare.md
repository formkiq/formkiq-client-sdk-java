

# UserShare


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentId** | **String** | Document/Folder Identifier |  [optional] |
|**shareKey** | **String** | Share Key Identifier |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of Document |  [optional] |
|**permissions** | [**List&lt;PermissionsEnum&gt;**](#List&lt;PermissionsEnum&gt;) | List of share permissions |  [optional] |
|**name** | **String** | Name of Share |  [optional] |
|**siteId** | **String** | Site Identifier |  [optional] |
|**path** | **String** | Path or Name of document |  [optional] |
|**userId** | **String** | User who created share |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FOLDER | &quot;FOLDER&quot; |
| FILE | &quot;FILE&quot; |



## Enum: List&lt;PermissionsEnum&gt;

| Name | Value |
|---- | -----|
| READ | &quot;READ&quot; |
| WRITE | &quot;WRITE&quot; |
| DELETE | &quot;DELETE&quot; |



