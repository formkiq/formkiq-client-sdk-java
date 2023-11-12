

# AddWorkflowRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Workflow name |  |
|**description** | **String** | Workflow description |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**steps** | [**List&lt;AddWorkflowStep&gt;**](AddWorkflowStep.md) | Workflow Steps |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |



