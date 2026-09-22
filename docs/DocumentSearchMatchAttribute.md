

# DocumentSearchMatchAttribute

Attribute that supplied the match. For JSON attributes, jsonValue contains the entire stored object, and jsonPath identifies the nested field used by the driving criterion when a path was supplied.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** | Attribute key |  [optional] |
|**jsonValue** | **Map&lt;String, Object&gt;** | One JSON object stored as a single attribute value. Arrays, scalars, and null are not accepted at the top level. Nested values may include objects, arrays, strings, numbers, booleans, and null. Empty objects and nested empty arrays are accepted. Object property order and original number formatting are not preserved.  The complete stored DynamoDB item, including metadata and attribute names, must fit within 400 KB. Stored document nesting must not exceed 32 levels, including the wrapper. Numbers must fit within DynamoDB&#39;s supported range and 38 digits of precision. |  [optional] |
|**jsonPath** | **String** | Path relative to jsonValue, beginning with $. Use dot notation for identifier-like property names, quoted bracket notation for other property names, and zero-based brackets for array positions. Examples: $.customer.name, $[&#39;customer.name&#39;], and $.lineItems[0].quantity. Quoted names may escape characters using a backslash. At least one property or array position is required. Wildcards, recursive descent, slices, and filter expressions are not supported. |  [optional] |
|**stringValue** | **String** | Attribute with string value |  [optional] |
|**numberValue** | **BigDecimal** | Attribute with number value |  [optional] |
|**booleanValue** | **Boolean** | Attribute with boolean value |  [optional] |
|**dateValue** | **String** | Attribute with date value |  [optional] |



