

# AddDocumentReview


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reviewCategory** | **String** | Review category |  |
|**reviewStatus** | **DocumentReviewStatus** |  |  [optional] |
|**approvalGroups** | **List&lt;String&gt;** | Optional approval groups used for additional credential verification when submitting a decision to POST /documents/{documentId}/reviews/{reviewId}/decisions. The caller must belong to at least one of the listed groups, in addition to satisfying the existing authorization requirements. |  [optional] |
|**requiredDecisions** | **Long** | Number of decision records matching countedDecisionTypes required to complete the review. Records count regardless of decision value or whether the same reviewer submitted earlier records. |  |
|**countedDecisionTypes** | **Set&lt;ReviewDecisionType&gt;** | Types of decision records that count toward requiredDecisions. Omission or null defaults to [APPROVAL]. This selects records to count and does not restrict which supported decision types may be submitted. Empty arrays, duplicate entries, unknown types, and non-string entries are rejected. |  [optional] |
|**notifications** | [**List&lt;AddDocumentNotificationRequest&gt;**](AddDocumentNotificationRequest.md) | Optional notifications to queue for delivery when the review is created. An empty list sends no notifications. |  [optional] |
|**comments** | **String** | Review comments |  [optional] |



