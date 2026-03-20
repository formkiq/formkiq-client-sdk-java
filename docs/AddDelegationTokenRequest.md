

# AddDelegationTokenRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**permissions** | **List&lt;DelegationTokenPermission&gt;** | Permissions to keep while the delegation token is applied. These must be a subset of the caller&#39;s current permissions for the site and cannot include ADMIN. |  |
|**onBehalfOf** | [**DelegationTokenPrincipal**](DelegationTokenPrincipal.md) |  |  [optional] |
|**reason** | **String** | Reason the delegation token is being generated. Stored in the signed token for audit/support traceability. |  |



