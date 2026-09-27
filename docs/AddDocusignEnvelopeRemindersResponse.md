

# AddDocusignEnvelopeRemindersResponse

For targeted reminders, recipients contains exactly one outcome for each requested recipient ID. HTTP 200 can include accepted and failed outcomes, including when every recipient failed at the provider after validation. Invalid selections detected before the resend return 400 instead. Envelope-wide acceptance returns an empty object; do not infer individual outcomes. There is no overall status field. Authentication, validation, rate-limit, upstream, and timeout errors use the documented 4xx/5xx responses.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recipients** | [**List&lt;DocusignReminderRecipient&gt;**](DocusignReminderRecipient.md) | Outcomes for the selected recipients, present for targeted requests and omitted for envelope-wide reminders. A timeout or missing provider outcome must not be represented as confirmed acceptance or failure. |  [optional] |



