

# DocusignTextTab

A text field supporting single-line and multiline entry. Use width and height to size a multiline field and maxLength to limit input. Reserve sufficient space in the generated document; tabs do not reflow surrounding content. disableAutoSize affects single-line fields only. Specify either anchorString (with optional anchor settings) or pageNumber, xPosition, and yPosition. Do not combine anchor and coordinate placement. Recipient and document assignment are inherited from the containing request.

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
|**value** | **String** | Initial field value. Use locked to prevent recipient edits. |  [optional] |
|**required** | [**RequiredEnum**](#RequiredEnum) | Whether the recipient must complete the field. When omitted, DocuSign defaults apply. |  [optional] |
|**locked** | [**LockedEnum**](#LockedEnum) | When true, the recipient cannot edit the field. |  [optional] |
|**width** | **String** | Field width in pixels. |  [optional] |
|**validationPattern** | **String** | DocuSign regular expression used to validate the entered value. |  [optional] |
|**validationMessage** | **String** | Message shown when the entered value fails validation. |  [optional] |
|**height** | **String** | Field height in pixels. Set with width to size a multiline text area. |  [optional] |
|**maxLength** | **String** | Maximum number of characters accepted by the field. |  [optional] |
|**disableAutoSize** | [**DisableAutoSizeEnum**](#DisableAutoSizeEnum) | Disable automatic resizing of single-line text fields. This property does not enable multiline entry. |  [optional] |
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



## Enum: RequiredEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: LockedEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: DisableAutoSizeEnum

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



