

# DocumentAction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **DocumentActionStatus** |  |  [optional] |
|**type** | **DocumentActionType** |  |  [optional] |
|**retryCount** | **BigDecimal** | The number of times this action has already been attempted |  [optional] |
|**maxRetries** | **BigDecimal** | The maximum number of retry attempts allowed for this action |  [optional] |
|**queueId** | **String** | Queue Id |  [optional] |
|**workflowId** | **String** | Workflow Id |  [optional] |
|**workflowStepId** | **String** | Workflow Step Id |  [optional] |
|**message** | **String** | Action message information |  [optional] |
|**userId** | **String** | User who requested the Action |  [optional] |
|**insertedDate** | **String** | Inserted Timestamp |  [optional] |
|**startDate** | **String** | Started Timestamp |  [optional] |
|**completedDate** | **String** | Completed Timestamp |  [optional] |
|**parameters** | **Map&lt;String, Object&gt;** | Action parameters |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** | Action metadata |  [optional] |



