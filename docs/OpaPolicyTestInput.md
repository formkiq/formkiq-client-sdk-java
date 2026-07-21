

# OpaPolicyTestInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resource** | **String** | API Gateway resource template, such as /documents/{documentId}. |  |
|**httpMethod** | **OpaPolicyTestHttpMethod** |  |  |
|**pathParameters** | **Map&lt;String, String&gt;** | Simulated API Gateway path parameters. Defaults to an empty object. |  [optional] |
|**queryParameters** | **Map&lt;String, String&gt;** | Simulated API Gateway query parameters. The path siteId is added when siteId is omitted; a different siteId is rejected. |  [optional] |
|**user** | [**OpaPolicyTestInputUser**](OpaPolicyTestInputUser.md) |  |  |



