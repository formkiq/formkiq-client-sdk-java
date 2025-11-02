

# OpenSearchSnapshotFailure

Details about a failure for a specific shard in a snapshot.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**index** | **String** | The index name. |  [optional] |
|**indexUuid** | **String** | UUID of the index. |  [optional] |
|**shardId** | **Integer** | Shard identifier. |  [optional] |
|**reason** | **String** | Full exception/message explaining why the failure occurred. |  [optional] |
|**nodeId** | **String** | ID of the node handling that shard. |  [optional] |
|**status** | **String** | Status of the failure (e.g., INTERNAL_SERVER_ERROR). |  [optional] |



