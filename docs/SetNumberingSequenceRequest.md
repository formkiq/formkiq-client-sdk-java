

# SetNumberingSequenceRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pattern** | **String** | Number format using supported tokens such as {YEAR} and {SEQUENCE} |  |
|**startAt** | **Long** | First sequence number allocated for a new period |  |
|**padding** | **Integer** | Minimum width of the generated sequence number, padded with leading zeroes |  |
|**reset** | **NumberingSequenceReset** |  |  |
|**timezone** | **String** | IANA timezone used to determine the active period; defaults to UTC |  [optional] |



