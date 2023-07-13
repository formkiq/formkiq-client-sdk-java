

# GetDocumentSync


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**service** | [**ServiceEnum**](#ServiceEnum) | To which service the data was synced |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the sync |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the sync |  [optional] |
|**syncDate** | **String** | Timestamp of synchronization |  [optional] |
|**userId** | **String** | User who added document |  [optional] |
|**message** | **String** | Document sync message |  [optional] |



## Enum: ServiceEnum

| Name | Value |
|---- | -----|
| TYPESENSE | &quot;TYPESENSE&quot; |
| OPENSEARCH | &quot;OPENSEARCH&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETE | &quot;COMPLETE&quot; |
| FAILED | &quot;FAILED&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| METADATA | &quot;METADATA&quot; |
| TAG | &quot;TAG&quot; |



