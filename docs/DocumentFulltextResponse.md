

# DocumentFulltextResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**totalCount** | **Integer** | Total number of documents that matched the search query. When the number of matches exceeds 10,000, this value will be reported as 10,000+ unless the search request explicitly enables exact total hit tracking.  |  [optional] |
|**documents** | [**List&lt;FulltextSearchItem&gt;**](FulltextSearchItem.md) | List of search result documents |  [optional] |



