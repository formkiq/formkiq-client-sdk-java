

# DocusignConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**environment** | **DocusignEnvironment** |  |  [optional] |
|**userId** | **String** | Docusign UserId |  [optional] |
|**integrationKey** | **String** | Docusign Integration Key or ClientId |  [optional] |
|**rsaPrivateKey** | **String** | Docusign Rsa Private Key |  [optional] |
|**hmacSignature** | **String** | Optional HMAC secret used to validate Docusign Connect event notifications. When configured, callbacks must include a matching Docusign HMAC signature. When omitted or empty, callbacks are processed without HMAC validation, including when connectUrl is configured. |  [optional] |
|**connectUrl** | **URI** | Public HTTPS URL that receives Docusign Connect event notifications. May be configured with or without hmacSignature. |  [optional] |



