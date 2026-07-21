

# DocusignSigner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of Signer |  |
|**email** | **String** | Email of Signer |  [optional] |
|**clientUserId** | **String** | Specifies unique identifier for signer |  [optional] |
|**embeddedRecipientStartUrl** | [**EmbeddedRecipientStartUrlEnum**](#EmbeddedRecipientStartUrlEnum) | Enables a Docusign signing invitation while retaining embedded signing through clientUserId. Requires clientUserId. When omitted, the existing signing behavior is unchanged. Hybrid recipients do not receive automated reminders or expiration notifications. |  [optional] |
|**recipientId** | **String** | A reference used to map recipients to other objects, such as specific document tabs. |  [optional] |
|**routingOrder** | **String** | Specifies the routing order of the recipient in the envelope. |  [optional] |
|**suppressEmails** | **String** | When true, email notifications are suppressed for the recipient, and they must access envelopes and documents from their Docusign inbox. |  [optional] |
|**readyToSignNotification** | [**DocusignSignerReadyToSignNotification**](DocusignSignerReadyToSignNotification.md) |  |  [optional] |
|**tabs** | [**DocusignSigningTabs**](DocusignSigningTabs.md) |  |  [optional] |



## Enum: EmbeddedRecipientStartUrlEnum

| Name | Value |
|---- | -----|
| SIGN_AT_DOCUSIGN | &quot;SIGN_AT_DOCUSIGN&quot; |



