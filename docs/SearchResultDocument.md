

# SearchResultDocument


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**siteId** | **String** | Site Identifier |  [optional] |
|**path** | **String** | Path or Name of document |  [optional] |
|**deepLinkPath** | **String** | Path or Name of deep link |  [optional] |
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
|**matchedAttribute** | [**DocumentSearchMatchAttribute**](DocumentSearchMatchAttribute.md) |  |  [optional] |
|**matchedTag** | [**DocumentSearchMatchTag**](DocumentSearchMatchTag.md) |  |  [optional] |
|**matchedTags** | [**List&lt;DocumentSearchMatchTag&gt;**](DocumentSearchMatchTag.md) |  |  [optional] |
|**tags** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**responseAttributes** | [**List&lt;SearchResponseAttributeField&gt;**](SearchResponseAttributeField.md) | List of document response attributes |  [optional] |
|**metadata** | [**List&lt;DocumentMetadata&gt;**](DocumentMetadata.md) | List of document Metadata |  [optional] |



