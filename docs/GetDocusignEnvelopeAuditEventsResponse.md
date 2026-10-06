

# GetDocusignEnvelopeAuditEventsResponse

DocuSign's envelope audit events response returned unchanged. Additional fields at every level are preserved. Optional collections and fields are returned only when supplied by DocuSign; no events are synthesized.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**auditEvents** | **List&lt;DocusignEnvelopeAuditEvent&gt;** | Envelope audit events recorded by DocuSign |  [optional] |
|**paymentEvents** | **List&lt;DocusignEnvelopePaymentEvent&gt;** | Payment events returned by DocuSign, when present |  [optional] |



