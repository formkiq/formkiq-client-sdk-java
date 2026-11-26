

# UpdateConfigurationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**branding** | [**BrandingConfig**](BrandingConfig.md) |  |  [optional] |
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
|**additionalDocusignAccounts** | [**List&lt;AdditionalDocusignConfig&gt;**](AdditionalDocusignConfig.md) | Additional DocuSign accounts available to this site through the accountId query parameter. The docusign configuration remains the default for new envelopes when accountId is omitted. Each entry is self-contained and does not inherit environment, credentials, or callback settings from docusign. Accounts sharing an authorized identity may use the same credentials. Account IDs must be unique across the default and additional accounts. Omit this property or set it to null to leave the additional accounts unchanged; supply an empty array to clear them. Retain connection settings needed by existing envelopes; configuration changes must not reassign them. |  [optional] |



