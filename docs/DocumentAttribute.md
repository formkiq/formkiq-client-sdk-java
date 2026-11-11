

# DocumentAttribute


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** | Attribute key |  [optional] |
|**jsonValue** | **Map&lt;String, Object&gt;** | One JSON object stored as a single attribute value. Arrays, scalars, and null are not accepted at the top level. Nested values may include objects, arrays, strings, numbers, booleans, and null. Empty objects and nested empty arrays are accepted. Object property order and original number formatting are not preserved.  The complete stored DynamoDB item, including metadata and attribute names, must fit within 400 KB. Stored document nesting must not exceed 32 levels, including the wrapper. Numbers must fit within DynamoDB&#39;s supported range and 38 digits of precision. |  [optional] |
|**stringValue** | **String** | Attribute with string value |  [optional] |
|**stringValues** | **List&lt;String&gt;** | Attribute with string values |  [optional] |
|**numberValue** | **BigDecimal** | Attribute with number value |  [optional] |
|**numberValues** | **List&lt;BigDecimal&gt;** | Attribute with number values |  [optional] |
|**booleanValue** | **Boolean** | Attribute with boolean value |  [optional] |
|**dateValue** | **String** | Attribute with date value |  [optional] |
|**dateValues** | **List&lt;String&gt;** | Attribute with date values |  [optional] |
|**insertedDate** | **String** | Earliest insertion timestamp across the attribute&#39;s current values. Adding a value preserves this timestamp; removing values recomputes it from the remaining values. May be absent for older records. |  [optional] [readonly] |
|**lastModifiedDate** | **String** | Latest modification timestamp across the attribute&#39;s current values. Removing values recomputes this timestamp from the remaining values; it does not track the time of removal. For older values without a modification timestamp, their insertion timestamp is used when available. May be absent when no timestamp is available. |  [optional] [readonly] |
|**userId** | **String** | User who added attribute |  [optional] |
|**valueType** | **AttributeValueType** |  |  [optional] |
|**entity** | [**Entity**](Entity.md) |  |  [optional] |
|**entities** | [**List&lt;Entity&gt;**](Entity.md) | Attribute with entity values |  [optional] |



