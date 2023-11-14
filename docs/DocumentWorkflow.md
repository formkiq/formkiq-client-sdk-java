

# DocumentWorkflow


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**workflowId** | **String** | Workflow identifier |  [optional] |
|**name** | **String** | Workflow name |  [optional] |
|**description** | **String** | Workflow description |  [optional] |
|**currentStepId** | **String** | The current step workflow is on |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Workflow status |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETE | &quot;COMPLETE&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| FAILED | &quot;FAILED&quot; |



