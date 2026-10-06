

# SetGroupPermissionsRequest

Replaces the group's grants for a site. roleType is optional. Supply a predefined roleType with no permissions or an empty array, or CUSTOM with a nonempty permissions array. Nonempty permissions with a predefined roleType are rejected. When roleType is omitted, a nonempty permissions array is required and is treated as an explicit CUSTOM grant without adding inherited role permissions. For example, legacy WRITE grants write operations only and is not converted to the predefined WRITE role, which also grants read and delete operations. Requests with neither field, unknown role types or permission names, and invalid field combinations are rejected. Administrator grants require an administrator caller.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**roleType** | **ApiPermissionRoleType** |  |  [optional] |
|**permissions** | **Set&lt;ApiPermissionGrant&gt;** | Explicit scoped or legacy umbrella grants. Required when roleType is omitted or CUSTOM, and must then be nonempty. For predefined role types, omit this field or supply an empty array. |  [optional] |



