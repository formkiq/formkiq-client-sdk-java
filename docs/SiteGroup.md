

# SiteGroup

A group's permission configuration for a site. roleType is optional for legacy records. A missing roleType means permissions contains explicit CUSTOM grants. A predefined roleType determines the effective role grants.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**roleType** | **ApiPermissionRoleType** |  |  [optional] |
|**permissions** | **Set&lt;ApiPermissionGrant&gt;** | Explicit CUSTOM or legacy permission grants. |  [optional] |



