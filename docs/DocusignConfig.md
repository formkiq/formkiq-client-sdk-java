

# DocusignConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | Optional DocuSign API account GUID. When set, selects the matching account accessible to the configured DocuSign user and its API base URI. When omitted, uses the first account returned by DocuSign for that user. Invalid or inaccessible account IDs are rejected without falling back to another account. This is optional for the default docusign configuration and required for each additionalDocusignAccounts entry. |  [optional] |
|**environment** | **DocusignEnvironment** |  |  [optional] |
|**userId** | **String** | Docusign UserId |  [optional] |
|**integrationKey** | **String** | Docusign Integration Key or ClientId |  [optional] |
|**rsaPrivateKey** | **String** | Docusign Rsa Private Key |  [optional] |
|**hmacSignature** | **String** | Optional HMAC secret used to validate Docusign Connect event notifications. When configured, callbacks must include a matching Docusign HMAC signature. When omitted or empty, callbacks are processed without HMAC validation, including when connectUrl is configured. |  [optional] |
|**connectUrl** | **URI** | Public HTTPS URL that receives Docusign Connect event notifications. May be configured with or without hmacSignature. |  [optional] |



