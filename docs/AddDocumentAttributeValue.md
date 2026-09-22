

# AddDocumentAttributeValue


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**jsonValue** | **Map&lt;String, Object&gt;** | One JSON object stored as a single attribute value. Arrays, scalars, and null are not accepted at the top level. Nested values may include objects, arrays, strings, numbers, booleans, and null. Empty objects and nested empty arrays are accepted. Object property order and original number formatting are not preserved.  The complete stored DynamoDB item, including metadata and attribute names, must fit within 400 KB. Stored document nesting must not exceed 32 levels, including the wrapper. Numbers must fit within DynamoDB&#39;s supported range and 38 digits of precision. |  [optional] |
|**stringValue** | **String** | Attribute with string value |  [optional] |
|**stringValues** | **List&lt;String&gt;** | Attribute with string values |  [optional] |
|**numberValue** | **BigDecimal** | Attribute with number value |  [optional] |
|**numberValues** | **List&lt;BigDecimal&gt;** | Attribute with number values |  [optional] |
|**booleanValue** | **Boolean** | Attribute with boolean value |  [optional] |
|**dateValue** | **String** | Attribute with date value |  [optional] |
|**dateValues** | **List&lt;String&gt;** | Attribute with date values |  [optional] |



