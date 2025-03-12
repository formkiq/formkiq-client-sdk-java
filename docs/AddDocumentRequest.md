

# AddDocumentRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentId** | **String** | optional Document Identifier (Version 4 UUID), if skipped one will be assigned |  [optional] |
|**path** | **String** | Path or Name of document |  [optional] |
|**checksumType** | **ChecksumType** |  |  [optional] |
|**checksum** | **String** | The checksum value to validate the file against |  [optional] |
|**width** | **String** | Document Content Width property |  [optional] |
|**height** | **String** | Document Content Height property |  [optional] |
|**deepLinkPath** | **String** | Path or Name of deep link |  [optional] |
|**contentType** | **String** | Document media type |  [optional] |
|**isBase64** | **Boolean** | Is the content Base64-encoded? |  [optional] |
|**content** | **String** | Document content |  |
|**tags** | [**List&lt;AddDocumentTag&gt;**](AddDocumentTag.md) | List of document tags |  [optional] |
|**metadata** | [**List&lt;AddDocumentMetadata&gt;**](AddDocumentMetadata.md) | List of document Metadata |  [optional] |
|**actions** | [**List&lt;AddAction&gt;**](AddAction.md) | List of Actions |  [optional] |
|**attributes** | [**List&lt;AddDocumentAttribute&gt;**](AddDocumentAttribute.md) | List of Attributes to add to document |  [optional] |
|**documents** | [**List&lt;AddChildDocument&gt;**](AddChildDocument.md) | List of child documents |  [optional] |



