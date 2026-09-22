

# AddDocusignEnvelopeRemindersRequest

Optional selection of one or more signers. Omit the body or send an empty object to remind all eligible recipients at the current routing step. The singular recipientId field, signer names, and email addresses are not accepted. Invalid selections never trigger an envelope-level reminder.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recipientIds** | **Set&lt;String&gt;** | Existing DocuSign signer IDs from recipients.signers[].recipientId in GET /esignature/docusign/{documentId}/envelopes/{envelopeId} for this same envelope. Every selected signer must be notification-eligible and awaiting action at the current routing step. Validate the entire selection before issuing a resend. Null or empty arrays, duplicate IDs, and null, empty, whitespace-only, or non-string entries are invalid. Omit this property for an envelope-level reminder. |  [optional] |



