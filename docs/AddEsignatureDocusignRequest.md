

# AddEsignatureDocusignRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**emailSubject** | **String** | Email Subject |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the request |  [optional] |
|**developmentMode** | **Boolean** | Whether to enable developer mode |  [optional] |
|**signers** | [**List&lt;EsignatureDocusignSigner&gt;**](EsignatureDocusignSigner.md) | List of DocuSign Signers |  [optional] |
|**carbonCopies** | [**List&lt;EsignatureDocusignCarbonCopy&gt;**](EsignatureDocusignCarbonCopy.md) | List of DocuSign Carbon Copies |  [optional] |
|**recipientTabs** | [**List&lt;EsignatureDocusignRecipientTab&gt;**](EsignatureDocusignRecipientTab.md) | List of DocuSign Recipient Tabs |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;CREATED&quot; |
| SENT | &quot;SENT&quot; |



