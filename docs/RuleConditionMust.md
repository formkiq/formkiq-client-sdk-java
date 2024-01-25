

# RuleConditionMust


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attribute** | [**AttributeEnum**](#AttributeEnum) | Rule attribute |  [optional] |
|**propertyName** | **String** | Rule property name |  [optional] |
|**value** | **String** | Rule condition value |  [optional] |
|**operation** | [**OperationEnum**](#OperationEnum) | Rule condition operation |  [optional] |



## Enum: AttributeEnum

| Name | Value |
|---- | -----|
| TEXT | &quot;TEXT&quot; |
| CONTENT_TYPE | &quot;CONTENT_TYPE&quot; |
| BARCODE | &quot;BARCODE&quot; |
| PROPERTY | &quot;PROPERTY&quot; |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| EQ | &quot;EQ&quot; |
| CONTAINS | &quot;CONTAINS&quot; |



