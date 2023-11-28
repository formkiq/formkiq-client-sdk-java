

# DocumentAction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Status of the Document Action |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of Document Action |  [optional] |
|**queueId** | **String** | Queue Id |  [optional] |
|**workflowId** | **String** | Workflow Id |  [optional] |
|**workflowStepId** | **String** | Workflow Step Id |  [optional] |
|**message** | **String** | Action message information |  [optional] |
|**userId** | **String** | User who requested the Action |  [optional] |
|**insertedDate** | **String** | Inserted Timestamp |  [optional] |
|**completedDate** | **String** | Completed Timestamp |  [optional] |
|**parameters** | **Map&lt;String, String&gt;** | Action parameters |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** | Action metadata |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETE | &quot;COMPLETE&quot; |
| FAILED | &quot;FAILED&quot; |
| IN_QUEUE | &quot;IN_QUEUE&quot; |
| PENDING | &quot;PENDING&quot; |
| RUNNING | &quot;RUNNING&quot; |
| SKIPPED | &quot;SKIPPED&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ANTIVIRUS | &quot;ANTIVIRUS&quot; |
| DOCUMENTTAGGING | &quot;DOCUMENTTAGGING&quot; |
| FULLTEXT | &quot;FULLTEXT&quot; |
| NOTIFICATION | &quot;NOTIFICATION&quot; |
| OCR | &quot;OCR&quot; |
| QUEUE | &quot;QUEUE&quot; |
| WEBHOOK | &quot;WEBHOOK&quot; |



