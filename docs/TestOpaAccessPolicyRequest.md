

# TestOpaAccessPolicyRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**policyItems** | [**List&lt;OpaPolicyItem&gt;**](OpaPolicyItem.md) | Draft OPA policy items to test without persisting them. When omitted, the site&#39;s saved OPA access policy is tested. An explicitly empty array tests the generated deny-all policy. |  [optional] |
|**input** | [**OpaPolicyTestInput**](OpaPolicyTestInput.md) |  |  |



