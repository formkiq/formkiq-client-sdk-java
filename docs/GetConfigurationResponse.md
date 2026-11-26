

# GetConfigurationResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**branding** | [**BrandingConfig**](BrandingConfig.md) |  |  [optional] |
|**chatGptApiKey** | **String** | ChatGPT API Key |  [optional] |
|**maxContentLengthBytes** | **String** | Set Maximum Document Content Length in Bytes |  [optional] |
|**maxDocuments** | **String** | Set Maximum number of Documents allowed |  [optional] |
|**maxWebhooks** | **String** | Set Maximum number of Webhooks allowed |  [optional] |
|**notificationEmail** | **String** | Deprecated. Use notification.email instead. Email address to use for SES notifications. |  [optional] |
|**notification** | [**NotificationConfig**](NotificationConfig.md) |  |  [optional] |
|**document** | [**DocumentConfig**](DocumentConfig.md) |  |  [optional] |
|**ocr** | [**OcrConfig**](OcrConfig.md) |  |  [optional] |
|**google** | [**GoogleConfig**](GoogleConfig.md) |  |  [optional] |
|**docusign** | [**DocusignConfig**](DocusignConfig.md) |  |  [optional] |
|**additionalDocusignAccounts** | [**List&lt;AdditionalDocusignConfig&gt;**](AdditionalDocusignConfig.md) | Additional DocuSign account configurations selectable through accountId. The docusign configuration remains the default for new envelopes when accountId is omitted. Each entry has its own environment, credentials, and callback settings, with no implicit inheritance from docusign. |  [optional] |



