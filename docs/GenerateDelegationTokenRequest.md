

# GenerateDelegationTokenRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**permissions** | [**List&lt;PermissionsEnum&gt;**](#List&lt;PermissionsEnum&gt;) | Permissions to keep while the delegation token is applied. These must be a subset of the caller&#39;s current permissions for the site and cannot include ADMIN. |  |
|**expiresInSeconds** | **Integer** | Token lifetime in seconds. Defaults to 300 seconds and cannot exceed 3600 seconds. |  [optional] |
|**onBehalfOf** | [**DelegationTokenPrincipal**](DelegationTokenPrincipal.md) |  |  [optional] |
|**reason** | **String** | Reason the delegation token is being generated. Stored in the signed token for audit/support traceability. |  [optional] |



## Enum: List&lt;PermissionsEnum&gt;

| Name | Value |
|---- | -----|
| READ | &quot;READ&quot; |
| WRITE | &quot;WRITE&quot; |
| DELETE | &quot;DELETE&quot; |
| GOVERN | &quot;GOVERN&quot; |



