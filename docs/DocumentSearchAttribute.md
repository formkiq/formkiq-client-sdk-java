

# DocumentSearchAttribute

Attribute search criterion. Existing eq and eqOr operators accept strings. To compare a nested field of a JSON attribute, supply a json filter containing the path and comparisons. A json filter cannot be combined with the top-level eq, eqOr, beginsWith, or range operators in the same criterion. Use separate criteria in query.attributes to compare multiple JSON paths.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eq** | **String** | Searches for strings that eq |  [optional] |
|**eqOr** | **List&lt;String&gt;** | Searches for strings equal to any provided value. Pagination is not supported when &#x60;eqOr&#x60; is used, so no &#x60;nextToken&#x60; is returned. The request limit is applied separately to each value.  |  [optional] |
|**beginsWith** | **String** | Searches for strings that begin with |  [optional] |
|**range** | [**DocumentSearchRange**](DocumentSearchRange.md) |  |  [optional] |
|**key** | **String** | Attribute key to search |  |
|**json** | [**JsonAttributeSearchFilter**](JsonAttributeSearchFilter.md) |  |  [optional] |



