

# DocumentSearchResponse

Document search response. The `DOCUMENTS` projection returns `documents`, `next`, and `previous`. The `COUNT` projection returns `count` and `truncated` instead.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**next** | **String** | Next page of document results token; omitted for the COUNT projection |  [optional] |
|**previous** | **String** | Previous page of document results token; omitted for the COUNT projection |  [optional] |
|**documents** | [**List&lt;SearchResultDocument&gt;**](SearchResultDocument.md) | List of search result documents; omitted for the COUNT projection |  [optional] |
|**count** | **Integer** | Number of matching documents counted, up to 10,000; only returned for the COUNT projection |  [optional] |
|**truncated** | **Boolean** | Whether counting stopped at the 10,000-document limit before the search was exhausted; only returned for the COUNT projection |  [optional] |



