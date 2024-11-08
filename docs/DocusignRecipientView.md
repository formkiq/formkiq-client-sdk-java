

# DocusignRecipientView


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**returnUrl** | **String** | Identifies the return point after sending the envelope |  [optional] |
|**recipientId** | **String** | A reference used to map recipients to other objects, such as specific document tabs. |  [optional] |
|**userName** | **String** | The username of the recipient. You can use either email and userName. |  [optional] |
|**clientUserId** | **String** | Specifies unique identifier for signer |  [optional] |
|**email** | **String** | Specifies the email of the recipient |  [optional] |
|**frameAncestors** | **List&lt;String&gt;** | An array of ancestors that can embed the frame. Include the domain where the envelope will be embedded and the same URL as messageOrigins. |  [optional] |
|**messageOrigins** | **List&lt;String&gt;** | The originating domain for the signature request message |  [optional] |



