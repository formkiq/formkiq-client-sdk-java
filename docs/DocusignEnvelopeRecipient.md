

# DocusignEnvelopeRecipient

Recipient fields returned by DocuSign. Fields depend on the recipient type; additional type-specific fields are preserved. This response schema is separate from FormKiQ's envelope creation request schemas.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recipientId** | **String** |  |  [optional] |
|**recipientIdGuid** | **String** |  |  [optional] |
|**recipientType** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**signerName** | **String** |  |  [optional] |
|**signerEmail** | **String** |  |  [optional] |
|**hostName** | **String** |  |  [optional] |
|**hostEmail** | **String** |  |  [optional] |
|**routingOrder** | **String** |  |  [optional] |
|**status** | **String** | Recipient status reported by DocuSign |  [optional] |
|**sentDateTime** | **OffsetDateTime** |  |  [optional] |
|**deliveredDateTime** | **OffsetDateTime** |  |  [optional] |
|**signedDateTime** | **OffsetDateTime** |  |  [optional] |
|**declinedDateTime** | **OffsetDateTime** |  |  [optional] |



