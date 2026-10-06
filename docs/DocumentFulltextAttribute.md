

# DocumentFulltextAttribute

Full-text attribute search criteria. Use eq or eqOr for scalar attributes and json for nested fields of JSON attributes. json cannot be combined with eq or eqOr. To compare multiple paths in one JSON attribute, use separate criteria with the same key. JSON searches use native OpenSearch indexes. Property paths through arrays match any element; array positions are not supported, and criteria may match different elements. Dotted property names use OpenSearch field-path semantics. Field types are inferred from stored values and must remain compatible across documents. Date-like strings may be indexed as dates, and numeric comparisons use the inferred numeric precision. Exact string and prefix searches use keyword fields; the default dynamic mapping does not index strings longer than 256 characters in keyword fields.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eq** | [**DocumentFulltextAttributeEq**](DocumentFulltextAttributeEq.md) |  |  [optional] |
|**eqOr** | [**List&lt;DocumentFulltextAttributeEq&gt;**](DocumentFulltextAttributeEq.md) | Searches for any of the supplied typed attribute values |  [optional] |
|**json** | [**JsonAttributeSearchFilter**](JsonAttributeSearchFilter.md) |  |  [optional] |
|**key** | **String** | Attribute key to search |  |



