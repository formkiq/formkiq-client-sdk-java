

# AdditionalDocusignConfig

A self-contained additional DocuSign account configuration. Credentials may match another configuration when that identity can access both accounts. Optional HMAC and callback settings apply only to this account.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | Optional DocuSign API account GUID. When set, selects the matching account accessible to the configured DocuSign user and its API base URI. When omitted, uses the first account returned by DocuSign for that user. Invalid or inaccessible account IDs are rejected without falling back to another account. This is optional for the default docusign configuration and required for each additionalDocusignAccounts entry. |  |
|**environment** | **DocusignEnvironment** |  |  |
|**userId** | **String** | Docusign UserId |  |
|**integrationKey** | **String** | Docusign Integration Key or ClientId |  |
|**rsaPrivateKey** | **String** | Docusign Rsa Private Key |  |
|**hmacSignature** | **String** | Optional HMAC secret used to validate Docusign Connect event notifications. When configured, callbacks must include a matching Docusign HMAC signature. When omitted or empty, callbacks are processed without HMAC validation, including when connectUrl is configured. |  [optional] |
|**connectUrl** | **URI** | Public HTTPS URL that receives Docusign Connect event notifications. May be configured with or without hmacSignature. |  [optional] |



