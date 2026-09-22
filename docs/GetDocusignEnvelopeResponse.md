

# GetDocusignEnvelopeResponse

The DocuSign Get Envelope response with include=recipients, returned without enrichment. Additional DocuSign fields are preserved. Optional fields are returned only when supplied by DocuSign. A completed envelope does not confirm that FormKiQ has stored the signed PDF.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**envelopeId** | **String** | DocuSign envelope identifier |  [optional] |
|**status** | **String** | Envelope status reported by DocuSign, such as created, sent, delivered, signed, completed, declined, or voided. |  [optional] |
|**statusChangedDateTime** | **OffsetDateTime** | Time DocuSign reports the envelope status changed |  [optional] |
|**sentDateTime** | **OffsetDateTime** |  |  [optional] |
|**deliveredDateTime** | **OffsetDateTime** |  |  [optional] |
|**completedDateTime** | **OffsetDateTime** |  |  [optional] |
|**declinedDateTime** | **OffsetDateTime** |  |  [optional] |
|**voidedDateTime** | **OffsetDateTime** |  |  [optional] |
|**recipients** | **DocusignEnvelopeRecipients** |  |  [optional] |



