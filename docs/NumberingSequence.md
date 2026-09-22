

# NumberingSequence


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributeKey** | **String** | Attribute key where generated values are stored |  |
|**pattern** | **String** | Number format using supported tokens such as {YEAR} and {SEQUENCE} |  |
|**startAt** | **Long** | First sequence number allocated for a new period |  |
|**padding** | **Integer** | Minimum width of the generated sequence number, padded with leading zeroes |  |
|**reset** | **NumberingSequenceReset** |  |  |
|**timezone** | **String** | IANA timezone used to determine the active period; defaults to UTC |  [optional] |
|**currentPeriod** | **String** | Active sequence period, or null if no number has been allocated |  [optional] [readonly] |
|**currentSequence** | **Long** | Most recently allocated sequence number, or null if none has been allocated |  [optional] [readonly] |
|**lastValue** | **String** | Most recently generated attribute value, or null if none has been allocated |  [optional] [readonly] |



