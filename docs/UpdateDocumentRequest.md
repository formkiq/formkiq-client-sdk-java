

# UpdateDocumentRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**path** | **String** | Path or Name of document |  [optional] |
|**width** | **String** | Document Content Width property |  [optional] |
|**height** | **String** | Document Content Height property |  [optional] |
|**deepLinkPath** | **String** | Path or Name of deep link |  [optional] |
|**contentType** | **String** | Document media type |  [optional] |
|**isBase64** | **Boolean** | Is the content Base64-encoded? |  [optional] |
|**content** | **String** | Document content |  [optional] |
|**checksum** | **String** | Document checksum, changes when document file changes |  [optional] |
|**checksumType** | **ChecksumType** |  |  [optional] |
|**tags** | [**List&lt;AddDocumentTag&gt;**](AddDocumentTag.md) | List of document tags |  [optional] |
|**metadata** | [**List&lt;AddDocumentMetadata&gt;**](AddDocumentMetadata.md) | List of document Metadata |  [optional] |
|**attributes** | [**List&lt;AddDocumentAttribute&gt;**](AddDocumentAttribute.md) | List of document attributes |  [optional] |
|**actions** | [**List&lt;AddAction&gt;**](AddAction.md) | List of Actions |  [optional] |
|**documents** | [**List&lt;AddChildDocument&gt;**](AddChildDocument.md) | List of child documents |  [optional] |



