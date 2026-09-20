

# DocumentReview


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentId** | **String** | Document Identifier |  [optional] |
|**artifactId** | **String** | Artifact Identifier |  [optional] |
|**reviewId** | **String** | Review Identifier |  [optional] |
|**reviewCategory** | **String** | Review category |  [optional] |
|**reviewStatus** | **DocumentReviewStatus** |  |  [optional] |
|**approvalGroups** | **List&lt;String&gt;** | Optional approval groups used for additional credential verification when submitting a decision to POST /documents/{documentId}/reviews/{reviewId}/decisions. The caller must belong to at least one of the listed groups, in addition to satisfying the existing authorization requirements. |  [optional] |
|**requiredDecisions** | **Long** | Number of decisions required to complete the review |  [optional] |
|**userId** | **String** | User who added review |  [optional] |
|**comments** | **String** | Review comments |  [optional] |
|**insertedDate** | **String** | Inserted Timestamp |  [optional] |
|**lastModifiedDate** | **String** | Last Modified Timestamp |  [optional] |



