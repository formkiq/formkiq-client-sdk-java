

# SearchResultDocument


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**siteId** | **String** | Site Identifier |  [optional] |
|**path** | **String** | Path or Name of document |  [optional] |
|**insertedDate** | **String** | Inserted Timestamp |  [optional] |
|**lastModifiedDate** | **String** | Last Modified Timestamp |  [optional] |
|**folder** | **Boolean** | Is Result a Document Folder |  [optional] |
|**indexKey** | **String** | populated if search result are from an index |  [optional] |
|**checksum** | **String** | Document checksum, changes when document file changes |  [optional] |
|**documentId** | **String** | Document Identifier |  [optional] |
|**contentType** | **String** | Document Content-Type |  [optional] |
|**userId** | **String** | User who added document |  [optional] |
|**contentLength** | **Integer** | Document size |  [optional] |
|**versionId** | **String** | Document version |  [optional] |
|**belongsToDocumentId** | **String** | Parent Document Identifier |  [optional] |
|**metadata** | [**List&lt;DocumentMetadata&gt;**](DocumentMetadata.md) | List of document Metadata |  [optional] |
|**matchedTag** | [**DocumentSearchMatchTag**](DocumentSearchMatchTag.md) |  |  [optional] |
|**tags** | **Object** |  |  [optional] |



