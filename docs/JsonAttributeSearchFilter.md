

# JsonAttributeSearchFilter

Compare a nested scalar field of an attribute defined with dataType JSON. A path and at least one field comparison are required. All supplied predicates are combined with AND; eqOr matches any supplied value. beginsWith applies to string fields and gt/gte/lt/lte apply to numeric fields. The legacy range operator is not supported inside a json filter.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**path** | **String** | Path relative to jsonValue, beginning with $. Use dot notation for identifier-like property names, quoted bracket notation for other property names, and zero-based brackets for array positions. Examples: $.customer.name, $[&#39;customer.name&#39;], and $.lineItems[0].quantity. Quoted names may escape characters using a backslash. At least one property or array position is required. Wildcards, recursive descent, slices, and filter expressions are not supported. |  |
|**eq** | [**JsonAttributeSearchValue**](JsonAttributeSearchValue.md) |  |  [optional] |
|**eqOr** | [**List&lt;JsonAttributeSearchValue&gt;**](JsonAttributeSearchValue.md) | Match the field against any provided string, number, or boolean without type coercion. |  [optional] |
|**beginsWith** | **String** | JSON string field must begin with this value. |  [optional] |
|**gt** | **BigDecimal** | JSON numeric field must be greater than this value. |  [optional] |
|**gte** | **BigDecimal** | JSON numeric field must be greater than or equal to this value. |  [optional] |
|**lt** | **BigDecimal** | JSON numeric field must be less than this value. |  [optional] |
|**lte** | **BigDecimal** | JSON numeric field must be less than or equal to this value. |  [optional] |



