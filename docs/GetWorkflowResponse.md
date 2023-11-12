

# GetWorkflowResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Workflow name |  [optional] |
|**description** | **String** | Workflow description |  [optional] |
|**inUse** | **Boolean** | Whether the Workflow is in use |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**steps** | [**List&lt;WorkflowStep&gt;**](WorkflowStep.md) | Workflow steps |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |



