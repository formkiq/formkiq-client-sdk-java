

# UpdateConfigurationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**chatGptApiKey** | **String** | ChatGPT Api Key |  [optional] |
|**maxContentLengthBytes** | **String** | Set Maximum Document Content Length in Bytes |  [optional] |
|**maxDocuments** | **String** | Set Maximum number of Documents allowed |  [optional] |
|**maxWebhooks** | **String** | Set Maximum number of Webhooks allowed |  [optional] |
|**notificationEmail** | **String** | Deprecated. Use notification.email instead. Email address to use for SES notifications. |  [optional] |
|**notification** | [**NotificationConfig**](NotificationConfig.md) |  |  [optional] |
|**document** | [**DocumentConfig**](DocumentConfig.md) |  |  [optional] |
|**ocr** | [**OcrConfig**](OcrConfig.md) |  |  [optional] |
|**google** | [**GoogleConfig**](GoogleConfig.md) |  |  [optional] |
|**docusign** | [**DocusignConfig**](DocusignConfig.md) |  |  [optional] |



