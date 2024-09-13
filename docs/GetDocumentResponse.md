

# GetDocumentResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**siteId** | **String** | Site Identifier |  [optional] |
|**path** | **String** | Path or Name of document |  [optional] |
|**deepLinkPath** | **String** | Path or Name of deep link |  [optional] |
|**insertedDate** | **String** | Inserted Timestamp |  [optional] |
|**lastModifiedDate** | **String** | Last Modified Timestamp |  [optional] |
|**checksum** | **String** | Document checksum, changes when document file changes |  [optional] |
|**checksumType** | **ChecksumType** |  |  [optional] |
|**documentId** | **String** | Document Identifier |  |
|**contentType** | **String** | Document Content-Type |  [optional] |
|**userId** | **String** | User who added document |  [optional] |
|**contentLength** | **Integer** | Document size |  [optional] |
|**versionId** | **String** | Document version |  [optional] |
|**documents** | [**List&lt;ChildDocument&gt;**](ChildDocument.md) | List of child documents |  [optional] |
|**belongsToDocumentId** | **String** | Parent Document Identifier |  [optional] |
|**metadata** | [**List&lt;DocumentMetadata&gt;**](DocumentMetadata.md) | List of document Metadata |  [optional] |



