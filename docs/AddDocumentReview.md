

# AddDocumentReview


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reviewCategory** | **String** | Review category |  |
|**reviewStatus** | **DocumentReviewStatus** |  |  [optional] |
|**approvalGroups** | **List&lt;String&gt;** | Optional approval groups used for additional credential verification when submitting a decision to POST /documents/{documentId}/reviews/{reviewId}/decisions. The caller must belong to at least one of the listed groups, in addition to satisfying the existing authorization requirements. |  [optional] |
|**requiredDecisions** | **Long** | Number of decisions required to complete the review |  |
|**notifications** | [**List&lt;AddDocumentNotificationRequest&gt;**](AddDocumentNotificationRequest.md) | Optional notifications to queue for delivery when the review is created. An empty list sends no notifications. |  [optional] |
|**comments** | **String** | Review comments |  [optional] |



