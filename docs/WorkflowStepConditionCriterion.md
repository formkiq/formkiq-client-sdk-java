

# WorkflowStepConditionCriterion

A single criterion used to evaluate whether a workflow condition matches.  A criterion compares a document-derived source value against one or more provided values using the specified operator.  Supported sources include: - document attributes - document content type - document path  Typical examples: - attribute `status` equals `approved` - attribute `amount` greater than `1000` - content type equals `application/pdf` - path contains `/invoices/`  Use the appropriate typed value field for the comparison: - `stringValue` for string comparisons - `numberValue` for numeric comparisons - `booleanValue` for boolean comparisons - `stringValues` for multi-value comparisons such as `IN` and `NOT_IN` 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**source** | [**WorkflowStepConditionSource**](WorkflowStepConditionSource.md) |  |  |
|**operator** | **WorkflowStepConditionOperator** |  |  |
|**stringValue** | **String** | String comparison value |  [optional] |
|**numberValue** | **BigDecimal** | Numeric comparison value |  [optional] |
|**booleanValue** | **Boolean** | Boolean comparison value |  [optional] |
|**stringValues** | **List&lt;String&gt;** | String values used for IN or NOT_IN comparisons |  [optional] |



