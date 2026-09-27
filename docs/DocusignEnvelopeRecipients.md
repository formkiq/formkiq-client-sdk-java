

# DocusignEnvelopeRecipients

Recipient information returned by DocuSign

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recipientCount** | **String** | Number of recipients, represented as a DocuSign string |  [optional] |
|**currentRoutingOrder** | **String** | Current routing step. Match this to recipient routingOrder and inspect recipient status to identify outstanding actions. Multiple recipients can share a routing order. Also check envelope status before treating a recipient as awaiting action. |  [optional] |
|**signers** | **List&lt;DocusignEnvelopeRecipient&gt;** |  |  [optional] |
|**inPersonSigners** | **List&lt;DocusignEnvelopeRecipient&gt;** |  |  [optional] |
|**agents** | **List&lt;DocusignEnvelopeRecipient&gt;** |  |  [optional] |
|**editors** | **List&lt;DocusignEnvelopeRecipient&gt;** |  |  [optional] |
|**intermediaries** | **List&lt;DocusignEnvelopeRecipient&gt;** |  |  [optional] |
|**carbonCopies** | **List&lt;DocusignEnvelopeRecipient&gt;** |  |  [optional] |
|**certifiedDeliveries** | **List&lt;DocusignEnvelopeRecipient&gt;** |  |  [optional] |
|**witnesses** | **List&lt;DocusignEnvelopeRecipient&gt;** |  |  [optional] |
|**seals** | **List&lt;DocusignEnvelopeRecipient&gt;** |  |  [optional] |
|**notaries** | **List&lt;DocusignEnvelopeRecipient&gt;** |  |  [optional] |



