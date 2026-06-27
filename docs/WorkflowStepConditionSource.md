

# WorkflowStepConditionSource

Defines the document-derived source value to evaluate for a workflow condition criterion.  The source identifies where the value comes from before applying the operator. Supported sources include: - a document attribute identified by `attributeKey` - a comparison between a document attribute value and another attribute-derived   value - the document content type - the document path 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributeKey** | **String** | Document attribute key |  |
|**sourceType** | **WorkflowStepConditionAttributeValueComparisonSourceType** |  |  |
|**valueAttributeKey** | **String** | Document attribute key containing the value to compare. |  |
|**comparison** | [**WorkflowStepConditionAttributeValueComparisonTarget**](WorkflowStepConditionAttributeValueComparisonTarget.md) |  |  |



