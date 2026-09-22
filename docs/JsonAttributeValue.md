

# JsonAttributeValue

One JSON object or array stored as a single attribute value. Scalar and null roots are not accepted. Nested values may include objects, arrays, strings, numbers, booleans, and null. Empty objects and arrays are accepted. Object property order and original number formatting are not preserved.  The complete stored DynamoDB item, including metadata and attribute names, must fit within 400 KB. Stored document nesting must not exceed 32 levels, including the wrapper. Numbers must fit within DynamoDB's supported range and 38 digits of precision.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|



