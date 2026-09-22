

# AddDocumentGenerateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**locale** | [**LocaleInfo**](LocaleInfo.md) |  |  [optional] |
|**insertDocuments** | [**List&lt;DocumentGenerateInsertDocument&gt;**](DocumentGenerateInsertDocument.md) | List of documents to insert |  [optional] |
|**datasources** | [**List&lt;DocumentGenerateDataSource&gt;**](DocumentGenerateDataSource.md) | List of data sources |  [optional] |
|**outputType** | **DocumentGenerateOutputType** |  |  [optional] |
|**saveAsDocumentId** | **String** | Save the generated document with a specific documentId |  [optional] |
|**saveAsArtifact** | **Boolean** | Create the output as a new artifact of saveAsDocumentId |  [optional] |
|**saveAsArtifactId** | **String** | Save the output as a new version of an existing artifact |  [optional] |
|**artifactCategory** | **String** | Optional caller-defined category for artifact output |  [optional] |
|**path** | **String** | The path of the generated document |  [optional] |



