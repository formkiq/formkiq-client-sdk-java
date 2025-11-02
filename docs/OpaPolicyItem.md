

# OpaPolicyItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**policy** | **String** | OPA Policy in REGO format |  [optional] |
|**allRoles** | **List&lt;String&gt;** | User must match all roles |  [optional] |
|**anyRoles** | **List&lt;String&gt;** | User must match any role |  [optional] |
|**excludedRoles** | **List&lt;String&gt;** | User must NOT have these roles |  [optional] |
|**attributes** | [**List&lt;OpaPolicyAttribute&gt;**](OpaPolicyAttribute.md) |  |  [optional] |
|**input** | [**OpaPolicyInput**](OpaPolicyInput.md) |  |  [optional] |



