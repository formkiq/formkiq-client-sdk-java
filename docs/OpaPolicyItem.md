

# OpaPolicyItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **OpaPolicyItemType** |  |  [optional] |
|**policy** | **String** | OPA Policy in REGO format |  [optional] |
|**allRoles** | **List&lt;String&gt;** | User must match all roles |  [optional] |
|**anyRoles** | **List&lt;String&gt;** | User must match any role |  [optional] |
|**attributes** | [**List&lt;OpaPolicyAttribute&gt;**](OpaPolicyAttribute.md) |  |  [optional] |



