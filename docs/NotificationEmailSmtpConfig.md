

# NotificationEmailSmtpConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**host** | **String** | SMTP server hostname |  |
|**port** | **Integer** | SMTP server port |  |
|**connectionSecurity** | **NotificationEmailSmtpConnectionSecurity** |  |  |
|**credentialsSecretArn** | **String** | AWS Secrets Manager ARN for a secret whose value is a JSON object containing non-empty string properties named \&quot;username\&quot; and \&quot;password\&quot;, for example: {\&quot;username\&quot;:\&quot;smtp-user@example.com\&quot;,\&quot;password\&quot;:\&quot;smtp-password\&quot;}. |  |



