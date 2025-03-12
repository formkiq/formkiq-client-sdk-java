

# OpenSearchSnapshot


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**snapshot** | **String** | Snapshot name |  [optional] |
|**uuid** | **String** | Snapshot’s universally unique identifier (UUID) |  [optional] |
|**version** | **String** | Open Search version that created the snapshot |  [optional] |
|**indices** | **List&lt;String&gt;** | Indices in the snapshot |  [optional] |
|**shards** | [**OpenSearchSnapshotShard**](OpenSearchSnapshotShard.md) |  |  [optional] |
|**failures** | [**List&lt;OpenSearchSnapshotFailure&gt;**](OpenSearchSnapshotFailure.md) |  |  [optional] |
|**state** | **String** | Snapshot status. Possible values: IN_PROGRESS, SUCCESS, FAILED, PARTIAL |  [optional] |
|**startTime** | **String** | Date/time when the snapshot creation process began |  [optional] |
|**startTimeInMillis** | **BigDecimal** | Time (in milliseconds) when the snapshot creation process began |  [optional] |
|**endTime** | **String** | Date/time when the snapshot creation process ended |  [optional] |
|**endTimeInMillis** | **BigDecimal** | Time (in milliseconds) when the snapshot creation process ended |  [optional] |
|**durationInMillis** | **BigDecimal** | Total time (in milliseconds) that the snapshot creation process lasted |  [optional] |



