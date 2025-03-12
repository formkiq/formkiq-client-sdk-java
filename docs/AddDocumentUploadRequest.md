

# AddDocumentUploadRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentId** | **String** | optional Document Identifier, if skipped one will be assigned |  [optional] |
|**path** | **String** | Path or Name of document |  [optional] |
|**contentType** | **String** | Document media type |  [optional] |
|**width** | **String** | Document Content Width property |  [optional] |
|**height** | **String** | Document Content Height property |  [optional] |
|**deepLinkPath** | **String** | Path or Name of deep link |  [optional] |
|**checksumType** | **ChecksumType** |  |  [optional] |
|**checksum** | **String** | The checksum value to validate the file against |  [optional] |
|**attributes** | [**List&lt;AddDocumentAttribute&gt;**](AddDocumentAttribute.md) | List of Attributes to add to document |  [optional] |
|**tags** | [**List&lt;AddDocumentTag&gt;**](AddDocumentTag.md) | List of document tags |  [optional] |
|**actions** | [**List&lt;AddAction&gt;**](AddAction.md) | List of Actions |  [optional] |



