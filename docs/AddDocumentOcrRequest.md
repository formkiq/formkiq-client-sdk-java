

# AddDocumentOcrRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**textractQueries** | [**List&lt;TextractQuery&gt;**](TextractQuery.md) |  |  [optional] |
|**parseTypes** | **List&lt;String&gt;** | OCR Parse types - TEXT, FORMS, TABLES, QUERIES |  [optional] |
|**addPdfDetectedCharactersAsText** | **Boolean** | Rewrite PDF document, converting any Image text to searchable text |  [optional] |
|**ocrEngine** | **OcrEngine** |  |  [optional] |
|**ocrNumberOfPages** | **String** | Number of pages to OCR (from start) (-1 all) |  [optional] |
|**ocrOutputType** | **OcrOutputType** |  |  [optional] |



