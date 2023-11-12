

# AddDocumentOcrRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**parseTypes** | **List&lt;String&gt;** | OCR Parse types - TEXT, FORMS, TABLES |  [optional] |
|**addPdfDetectedCharactersAsText** | **Boolean** | Rewrite PDF document, converting any Image text to searchable text |  [optional] |
|**ocrEngine** | [**OcrEngineEnum**](#OcrEngineEnum) | OCR: Engine to use for Optical character recognition |  [optional] |



## Enum: OcrEngineEnum

| Name | Value |
|---- | -----|
| TESSERACT | &quot;TESSERACT&quot; |
| TEXTRACT | &quot;TEXTRACT&quot; |



