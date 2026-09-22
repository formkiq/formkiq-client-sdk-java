

# DocumentSearchResponse

Document search response. The `DOCUMENTS` projection returns `documents`, `next`, `previous`, and `truncated`. The `COUNT` projection returns `count` and `truncated` instead.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**next** | **String** | Next page of document results token; omitted for the COUNT projection |  [optional] |
|**previous** | **String** | Previous page of document results token; omitted for the COUNT projection |  [optional] |
|**documents** | [**List&lt;SearchResultDocument&gt;**](SearchResultDocument.md) | List of search result documents; omitted for the COUNT projection |  [optional] |
|**count** | **Integer** | Number of matching documents counted, up to 10,000; only returned for the COUNT projection |  [optional] |
|**truncated** | **Boolean** | For DOCUMENTS, true when the 10,000 attribute-record budget or the multi-attribute fallback time budget stops the request before the requested page size is reached and search work remains. The response contains matches found so far, possibly none, and a next token to continue with a fresh budget. False when the requested page size is reached or the search is exhausted, even if next is present for ordinary pagination. For COUNT, true when counting stops at the result limit or the attribute-record processing budget or multi-attribute fallback time budget before the search is exhausted. A truncated count is a lower bound, not an exact total; COUNT does not return continuation tokens. |  [optional] |



