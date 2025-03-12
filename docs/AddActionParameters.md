

# AddActionParameters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ocrParseTypes** | **String** | OCR: Parse types - TEXT, FORMS, TABLES |  [optional] |
|**ocrEngine** | **OcrEngine** |  |  [optional] |
|**ocrOutputType** | **OcrOutputType** |  |  [optional] |
|**ocrNumberOfPages** | **String** | Number of pages to OCR (from start) (-1 all) |  [optional] |
|**addPdfDetectedCharactersAsText** | **String** | OCR: For the rewriting of the PDF document, converting any image text to searchable text |  [optional] |
|**url** | **String** | Webhook: Callback URL |  [optional] |
|**characterMax** | **String** | Fulltext: Maximum number of characters (-1 unlimited, Typesense defaults to 2048 characters) |  [optional] |
|**engine** | [**EngineEnum**](#EngineEnum) | DocumentTagging: Engine to use for document tagging generation |  [optional] |
|**notificationType** | [**NotificationTypeEnum**](#NotificationTypeEnum) | Notification Type |  [optional] |
|**notificationToCc** | **String** | Who to carbon copy on the notification to (comma-delimited list) |  [optional] |
|**notificationToBcc** | **String** | Who to blind carbon copy on the notification to (comma-delimited list) |  [optional] |
|**notificationSubject** | **String** | Subject of the notification |  [optional] |
|**notificationText** | **String** | Text of the notification |  [optional] |
|**notificationHtml** | **String** | Html of the notification |  [optional] |
|**tags** | **String** | DocumentTagging: Comma-deliminted list of keywords to generate tags for |  [optional] |
|**mappingId** | **String** | Id of Mapping |  [optional] |
|**eventBusName** | **String** | The name or ARN of the event bus to receive the event |  [optional] |
|**width** | **String** | The width of the image to resize (or &#39;auto&#39;) |  [optional] |
|**height** | **String** | The height of the image to resize (or &#39;auto&#39;) |  [optional] |
|**path** | **String** | The path to use when creating resized document (optional) |  [optional] |
|**outputType** | **String** | The output type of the image |  [optional] |



## Enum: EngineEnum

| Name | Value |
|---- | -----|
| CHATGPT | &quot;chatgpt&quot; |



## Enum: NotificationTypeEnum

| Name | Value |
|---- | -----|
| EMAIL | &quot;email&quot; |



