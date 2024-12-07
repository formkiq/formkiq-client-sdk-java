

# GetDocumentOcrResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contentUrls** | **List&lt;String&gt;** | Presigned S3 Urls for the OCR content |  [optional] |
|**keyValues** | [**List&lt;OcrKeyValues&gt;**](OcrKeyValues.md) | List of ocr key / values |  [optional] |
|**tables** | [**List&lt;OcrTable&gt;**](OcrTable.md) |  |  [optional] |
|**data** | **String** | OCR text result |  [optional] |
|**ocrEngine** | **String** | The OCR technique used |  [optional] |
|**ocrStatus** | **String** | The status of the OCR request |  [optional] |
|**contentType** | **String** | Document Content-Type |  [optional] |
|**isBase64** | **Boolean** | Is the content Base64-encoded? |  [optional] |
|**userId** | **String** | User who requested the OCR |  [optional] |
|**documentId** | **String** | Document Identifier |  [optional] |
|**insertedDate** | **String** | Inserted Timestamp |  [optional] |



