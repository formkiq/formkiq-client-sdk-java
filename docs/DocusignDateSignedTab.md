

# DocusignDateSignedTab

An automatic signing date populated by DocuSign when the recipient signs. The caller cannot set its value. Date and time formatting follow DocuSign account settings. Specify either anchorString (with optional anchor settings) or pageNumber, xPosition, and yPosition. Do not combine anchor and coordinate placement. Recipient and document assignment are inherited from the containing request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**anchorString** | **String** | Text used to locate the tab. Every matching occurrence creates a tab. Use distinct anchors for different recipients. |  [optional] |
|**anchorXOffset** | **String** | Horizontal offset from the anchor in anchorUnits; negative offsets are allowed. |  [optional] |
|**anchorYOffset** | **String** | Vertical offset from the anchor in anchorUnits; negative offsets are allowed. |  [optional] |
|**anchorUnits** | [**AnchorUnitsEnum**](#AnchorUnitsEnum) | Units for anchor offsets. |  [optional] |
|**anchorIgnoreIfNotPresent** | [**AnchorIgnoreIfNotPresentEnum**](#AnchorIgnoreIfNotPresentEnum) | When true, omit the tab if its anchor is missing. When false, a missing anchor is an error. When omitted, DocuSign defaults apply. |  [optional] |
|**anchorCaseSensitive** | [**AnchorCaseSensitiveEnum**](#AnchorCaseSensitiveEnum) | Whether anchor matching is case sensitive. When omitted, DocuSign defaults apply. |  [optional] |
|**anchorMatchWholeWord** | [**AnchorMatchWholeWordEnum**](#AnchorMatchWholeWordEnum) | Whether the anchor must match a whole word. When omitted, DocuSign defaults apply. |  [optional] |
|**pageNumber** | **String** | One-based page number for coordinate placement. |  [optional] |
|**xPosition** | **String** | Horizontal position in pixels for coordinate placement. |  [optional] |
|**yPosition** | **String** | Vertical position in pixels for coordinate placement. |  [optional] |
|**tabLabel** | **String** | Field label used to identify the tab. |  [optional] |
|**font** | **String** | DocuSign font name. |  [optional] |
|**fontSize** | **String** | DocuSign font size, for example Size12. |  [optional] |
|**fontColor** | **String** | DocuSign font color name, for example Black. |  [optional] |
|**bold** | [**BoldEnum**](#BoldEnum) | Whether the field text is bold. |  [optional] |
|**italic** | [**ItalicEnum**](#ItalicEnum) | Whether the field text is italic. |  [optional] |
|**underline** | [**UnderlineEnum**](#UnderlineEnum) | Whether the field text is underlined. |  [optional] |



## Enum: AnchorUnitsEnum

| Name | Value |
|---- | -----|
| PIXELS | &quot;pixels&quot; |
| INCHES | &quot;inches&quot; |
| MMS | &quot;mms&quot; |
| CMS | &quot;cms&quot; |



## Enum: AnchorIgnoreIfNotPresentEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: AnchorCaseSensitiveEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: AnchorMatchWholeWordEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: BoldEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: ItalicEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: UnderlineEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



