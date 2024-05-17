

# AddDocumentRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tagSchemaId** | **String** | Tag Schema Id |  [optional] |
|**path** | **String** | Path or Name of document |  [optional] |
|**deepLinkPath** | **String** | Path or Name of deep link |  [optional] |
|**contentType** | **String** | Document media type |  [optional] |
|**isBase64** | **Boolean** | Is the content Base64-encoded? |  [optional] |
|**content** | **String** | Document content |  |
|**tags** | [**List&lt;AddDocumentTag&gt;**](AddDocumentTag.md) | List of document tags |  [optional] |
|**metadata** | [**List&lt;AddDocumentMetadata&gt;**](AddDocumentMetadata.md) | List of document Metadata |  [optional] |
|**actions** | [**List&lt;AddAction&gt;**](AddAction.md) | List of Actions |  [optional] |
|**attributes** | [**List&lt;AddDocumentAttribute&gt;**](AddDocumentAttribute.md) | List of Attributes to add to document |  [optional] |
|**accessAttributes** | [**List&lt;AddAccessAttribute&gt;**](AddAccessAttribute.md) | List of Access Attributes (only available in pro/enterprise) |  [optional] |
|**documents** | [**List&lt;AddChildDocument&gt;**](AddChildDocument.md) | List of child documents |  [optional] |



