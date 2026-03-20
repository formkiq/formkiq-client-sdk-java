

# WorkflowStepConditionAttributeValueComparison

Compares the value of one document attribute to another attribute-derived value on the same document.  The criterion operator is evaluated as: document.attribute[valueAttributeKey] OP comparison  Literal comparison value fields are not used with this source. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceType** | **WorkflowStepConditionAttributeValueComparisonSourceType** |  |  |
|**valueAttributeKey** | **String** | Document attribute key containing the value to compare. |  |
|**comparison** | [**WorkflowStepConditionAttributeValueComparisonTarget**](WorkflowStepConditionAttributeValueComparisonTarget.md) |  |  |



