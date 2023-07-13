

# AddActionParameters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ocrParseTypes** | **String** | OCR: Parse types - TEXT, FORMS, TABLES |  [optional] |
|**addPdfDetectedCharactersAsText** | **Boolean** | OCR: For the rewriting of the PDF document, converting any image text to searchable text |  [optional] |
|**url** | **String** | Webhook: Callback URL |  [optional] |
|**characterMax** | **String** | Fulltext: Maximum number of characters (-1 unlimited, Typesense defaults to 2048 characters) |  [optional] |
|**engine** | [**EngineEnum**](#EngineEnum) | DocumentTagging: Engine to use for document tagging generation |  [optional] |
|**tags** | **List&lt;String&gt;** | DocumentTagging: List of Tags to generate tags for |  [optional] |



## Enum: EngineEnum

| Name | Value |
|---- | -----|
| CHATGPT | &quot;chatgpt&quot; |



