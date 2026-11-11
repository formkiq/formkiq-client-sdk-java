

# UpdateDocumentReview


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reviewStatus** | **DocumentReviewStatus** |  |  [optional] |
|**requiredDecisions** | **Long** | Number of decision records matching countedDecisionTypes required to complete the review. Changes apply when subsequent counted decisions are submitted. |  [optional] |
|**countedDecisionTypes** | **Set&lt;ReviewDecisionType&gt;** | Replacement types of decision records that count toward requiredDecisions. Omission or null preserves the effective current policy; it does not reset it to [APPROVAL]. Changes apply when subsequent counted decisions are submitted, counting existing records against the updated policy. This does not restrict submissions. Empty arrays, duplicate entries, unknown types, and non-string entries are rejected. |  [optional] |
|**comments** | **String** | Review comments |  [optional] |



