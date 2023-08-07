# client

FormKiQ HTTP API
- API version: 1.12.0
  - Build date: 2023-08-06T22:07:40.215317-05:00[America/Winnipeg]

Formkiq API: Document Management Platform API using JWT Authentication

  For more information, please visit [https://formkiq.com](https://formkiq.com)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.formkiq</groupId>
  <artifactId>client</artifactId>
  <version>1.12.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.formkiq:client:1.12.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/client-1.12.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.AdvancedDocumentSearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    AdvancedDocumentSearchApi apiInstance = new AdvancedDocumentSearchApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    try {
      DeleteFulltextResponse result = apiInstance.deleteDocumentFulltext(documentId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvancedDocumentSearchApi#deleteDocumentFulltext");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdvancedDocumentSearchApi* | [**deleteDocumentFulltext**](docs/AdvancedDocumentSearchApi.md#deleteDocumentFulltext) | **DELETE** /documents/{documentId}/fulltext | 
*AdvancedDocumentSearchApi* | [**deleteDocumentFulltextTag**](docs/AdvancedDocumentSearchApi.md#deleteDocumentFulltextTag) | **DELETE** /documents/{documentId}/fulltext/tags/{tagKey} | 
*AdvancedDocumentSearchApi* | [**deleteDocumentFulltextTagAndValue**](docs/AdvancedDocumentSearchApi.md#deleteDocumentFulltextTagAndValue) | **DELETE** /documents/{documentId}/fulltext/tags/{tagKey}/{tagValue} | 
*AdvancedDocumentSearchApi* | [**documentFulltext**](docs/AdvancedDocumentSearchApi.md#documentFulltext) | **POST** /searchFulltext | 
*AdvancedDocumentSearchApi* | [**getDocumentFulltext**](docs/AdvancedDocumentSearchApi.md#getDocumentFulltext) | **GET** /documents/{documentId}/fulltext | 
*AdvancedDocumentSearchApi* | [**queryFulltext**](docs/AdvancedDocumentSearchApi.md#queryFulltext) | **POST** /queryFulltext | 
*AdvancedDocumentSearchApi* | [**setDocumentFulltext**](docs/AdvancedDocumentSearchApi.md#setDocumentFulltext) | **PUT** /documents/{documentId}/fulltext | 
*AdvancedDocumentSearchApi* | [**updateDocumentFulltext**](docs/AdvancedDocumentSearchApi.md#updateDocumentFulltext) | **PATCH** /documents/{documentId}/fulltext | 
*AntivirusApi* | [**setAntivirus**](docs/AntivirusApi.md#setAntivirus) | **PUT** /documents/{documentId}/antivirus | 
*CustomIndexApi* | [**deleteIndex**](docs/CustomIndexApi.md#deleteIndex) | **DELETE** /indices/{indexType}/{indexKey} | 
*CustomIndexApi* | [**indexFolderMove**](docs/CustomIndexApi.md#indexFolderMove) | **POST** /indices/{indexType}/move | 
*CustomIndexApi* | [**indexSearch**](docs/CustomIndexApi.md#indexSearch) | **POST** /indices/search | 
*DocumentActionsApi* | [**addDocumentActions**](docs/DocumentActionsApi.md#addDocumentActions) | **POST** /documents/{documentId}/actions | 
*DocumentActionsApi* | [**getDocumentActions**](docs/DocumentActionsApi.md#getDocumentActions) | **GET** /documents/{documentId}/actions | 
*DocumentOcrApi* | [**addDocumentOcr**](docs/DocumentOcrApi.md#addDocumentOcr) | **POST** /documents/{documentId}/ocr | 
*DocumentOcrApi* | [**deleteDocumentOcr**](docs/DocumentOcrApi.md#deleteDocumentOcr) | **DELETE** /documents/{documentId}/ocr | 
*DocumentOcrApi* | [**getDocumentOcr**](docs/DocumentOcrApi.md#getDocumentOcr) | **GET** /documents/{documentId}/ocr | 
*DocumentOcrApi* | [**setDocumentOcr**](docs/DocumentOcrApi.md#setDocumentOcr) | **PUT** /documents/{documentId}/ocr | 
*DocumentSearchApi* | [**documentSearch**](docs/DocumentSearchApi.md#documentSearch) | **POST** /search | 
*DocumentSharesApi* | [**addFolderShare**](docs/DocumentSharesApi.md#addFolderShare) | **POST** /shares/folders/{indexKey} | 
*DocumentSharesApi* | [**deleteShare**](docs/DocumentSharesApi.md#deleteShare) | **DELETE** /shares/{shareKey} | 
*DocumentSharesApi* | [**getUserShares**](docs/DocumentSharesApi.md#getUserShares) | **GET** /shares | 
*DocumentTagsApi* | [**addDocumentTags**](docs/DocumentTagsApi.md#addDocumentTags) | **POST** /documents/{documentId}/tags | 
*DocumentTagsApi* | [**deleteDocumentTag**](docs/DocumentTagsApi.md#deleteDocumentTag) | **DELETE** /documents/{documentId}/tags/{tagKey} | 
*DocumentTagsApi* | [**deleteDocumentTagAndValue**](docs/DocumentTagsApi.md#deleteDocumentTagAndValue) | **DELETE** /documents/{documentId}/tags/{tagKey}/{tagValue} | 
*DocumentTagsApi* | [**getDocumentTag**](docs/DocumentTagsApi.md#getDocumentTag) | **GET** /documents/{documentId}/tags/{tagKey} | 
*DocumentTagsApi* | [**getDocumentTags**](docs/DocumentTagsApi.md#getDocumentTags) | **GET** /documents/{documentId}/tags | 
*DocumentTagsApi* | [**setDocumentTag**](docs/DocumentTagsApi.md#setDocumentTag) | **PUT** /documents/{documentId}/tags/{tagKey} | 
*DocumentTagsApi* | [**setDocumentTags**](docs/DocumentTagsApi.md#setDocumentTags) | **PUT** /documents/{documentId}/tags | 
*DocumentTagsApi* | [**updateDocumentTags**](docs/DocumentTagsApi.md#updateDocumentTags) | **PATCH** /documents/{documentId}/tags | 
*DocumentTagsApi* | [**updateMatchingDocumentTags**](docs/DocumentTagsApi.md#updateMatchingDocumentTags) | **PATCH** /documents/tags | 
*DocumentVersionsApi* | [**deleteDocumentVersion**](docs/DocumentVersionsApi.md#deleteDocumentVersion) | **DELETE** /documents/{documentId}/versions/{versionKey} | 
*DocumentVersionsApi* | [**getDocumentVersions**](docs/DocumentVersionsApi.md#getDocumentVersions) | **GET** /documents/{documentId}/versions | 
*DocumentVersionsApi* | [**setDocumentVersion**](docs/DocumentVersionsApi.md#setDocumentVersion) | **PUT** /documents/{documentId}/versions | 
*DocumentsApi* | [**addDocument**](docs/DocumentsApi.md#addDocument) | **POST** /documents | 
*DocumentsApi* | [**addDocumentUpload**](docs/DocumentsApi.md#addDocumentUpload) | **POST** /documents/upload | 
*DocumentsApi* | [**deleteDocument**](docs/DocumentsApi.md#deleteDocument) | **DELETE** /documents/{documentId} | 
*DocumentsApi* | [**getDocument**](docs/DocumentsApi.md#getDocument) | **GET** /documents/{documentId} | 
*DocumentsApi* | [**getDocumentContent**](docs/DocumentsApi.md#getDocumentContent) | **GET** /documents/{documentId}/content | 
*DocumentsApi* | [**getDocumentIdUpload**](docs/DocumentsApi.md#getDocumentIdUpload) | **GET** /documents/{documentId}/upload | 
*DocumentsApi* | [**getDocumentSyncs**](docs/DocumentsApi.md#getDocumentSyncs) | **GET** /documents/{documentId}/syncs | 
*DocumentsApi* | [**getDocumentUpload**](docs/DocumentsApi.md#getDocumentUpload) | **GET** /documents/upload | 
*DocumentsApi* | [**getDocumentUrl**](docs/DocumentsApi.md#getDocumentUrl) | **GET** /documents/{documentId}/url | 
*DocumentsApi* | [**getDocuments**](docs/DocumentsApi.md#getDocuments) | **GET** /documents | 
*DocumentsApi* | [**updateDocument**](docs/DocumentsApi.md#updateDocument) | **PATCH** /documents/{documentId} | 
*ESignatureApi* | [**addEsignatureDocusignEvents**](docs/ESignatureApi.md#addEsignatureDocusignEvents) | **POST** /esignature/docusign/events | 
*ESignatureApi* | [**esignatureDocusign**](docs/ESignatureApi.md#esignatureDocusign) | **POST** /esignature/docusign/{documentId} | 
*ESignatureApi* | [**esignatureDocusignConfig**](docs/ESignatureApi.md#esignatureDocusignConfig) | **GET** /esignature/docusign/config | 
*ESignatureApi* | [**esignatureSetDocusignConfig**](docs/ESignatureApi.md#esignatureSetDocusignConfig) | **PUT** /esignature/docusign/config | 
*FoldersApi* | [**addFolder**](docs/FoldersApi.md#addFolder) | **POST** /folders | 
*FoldersApi* | [**deleteFolder**](docs/FoldersApi.md#deleteFolder) | **DELETE** /folders/{indexKey} | 
*FoldersApi* | [**getFolderDocuments**](docs/FoldersApi.md#getFolderDocuments) | **GET** /folders | 
*OnlyofficeApi* | [**onlyOfficeDocumentEdit**](docs/OnlyofficeApi.md#onlyOfficeDocumentEdit) | **POST** /onlyoffice/{documentId}/edit | 
*OnlyofficeApi* | [**onlyOfficeDocumentNew**](docs/OnlyofficeApi.md#onlyOfficeDocumentNew) | **POST** /onlyoffice/new | 
*OnlyofficeApi* | [**onlyOfficeDocumentSave**](docs/OnlyofficeApi.md#onlyOfficeDocumentSave) | **POST** /onlyoffice/{documentId}/save | 
*PublicApi* | [**publicAddDocument**](docs/PublicApi.md#publicAddDocument) | **POST** /public/documents | 
*PublicApi* | [**publicAddWebhook**](docs/PublicApi.md#publicAddWebhook) | **POST** /public/webhooks/{webhooks+} | 
*SystemManagementApi* | [**addApiKey**](docs/SystemManagementApi.md#addApiKey) | **POST** /configuration/apiKeys | 
*SystemManagementApi* | [**deleteApiKey**](docs/SystemManagementApi.md#deleteApiKey) | **DELETE** /configuration/apiKeys/{apiKey} | 
*SystemManagementApi* | [**getApiKeys**](docs/SystemManagementApi.md#getApiKeys) | **GET** /configuration/apiKeys | 
*SystemManagementApi* | [**getConfigs**](docs/SystemManagementApi.md#getConfigs) | **GET** /configuration | 
*SystemManagementApi* | [**getSites**](docs/SystemManagementApi.md#getSites) | **GET** /sites | 
*SystemManagementApi* | [**getVersion**](docs/SystemManagementApi.md#getVersion) | **GET** /version | 
*SystemManagementApi* | [**updateConfig**](docs/SystemManagementApi.md#updateConfig) | **PATCH** /configuration | 
*TagIndexApi* | [**indexSearch**](docs/TagIndexApi.md#indexSearch) | **POST** /indices/search | 
*TagSchemaApi* | [**addTagSchema**](docs/TagSchemaApi.md#addTagSchema) | **POST** /tagSchemas | 
*TagSchemaApi* | [**deleteTagSchema**](docs/TagSchemaApi.md#deleteTagSchema) | **DELETE** /tagSchemas/{tagSchemaId} | 
*TagSchemaApi* | [**getTagSchema**](docs/TagSchemaApi.md#getTagSchema) | **GET** /tagSchemas/{tagSchemaId} | 
*TagSchemaApi* | [**getTagSchemas**](docs/TagSchemaApi.md#getTagSchemas) | **GET** /tagSchemas | 
*WebhooksApi* | [**addWebhook**](docs/WebhooksApi.md#addWebhook) | **POST** /webhooks | 
*WebhooksApi* | [**addWebhookDocument**](docs/WebhooksApi.md#addWebhookDocument) | **POST** /private/webhooks/{webhooks+} | 
*WebhooksApi* | [**addWebhookTag**](docs/WebhooksApi.md#addWebhookTag) | **POST** /webhooks/{webhookId}/tags | 
*WebhooksApi* | [**deleteWebhook**](docs/WebhooksApi.md#deleteWebhook) | **DELETE** /webhooks/{webhookId} | 
*WebhooksApi* | [**getWebhook**](docs/WebhooksApi.md#getWebhook) | **GET** /webhooks/{webhookId} | 
*WebhooksApi* | [**getWebhookTags**](docs/WebhooksApi.md#getWebhookTags) | **GET** /webhooks/{webhookId}/tags | 
*WebhooksApi* | [**getWebhooks**](docs/WebhooksApi.md#getWebhooks) | **GET** /webhooks | 
*WebhooksApi* | [**updateWebhook**](docs/WebhooksApi.md#updateWebhook) | **PATCH** /webhooks/{webhookId} | 


## Documentation for Models

 - [AddAction](docs/AddAction.md)
 - [AddActionParameters](docs/AddActionParameters.md)
 - [AddApiKeyRequest](docs/AddApiKeyRequest.md)
 - [AddApiKeyResponse](docs/AddApiKeyResponse.md)
 - [AddChildDocument](docs/AddChildDocument.md)
 - [AddChildDocumentResponse](docs/AddChildDocumentResponse.md)
 - [AddDocumentActionsRequest](docs/AddDocumentActionsRequest.md)
 - [AddDocumentActionsResponse](docs/AddDocumentActionsResponse.md)
 - [AddDocumentMetadata](docs/AddDocumentMetadata.md)
 - [AddDocumentOcrRequest](docs/AddDocumentOcrRequest.md)
 - [AddDocumentOcrResponse](docs/AddDocumentOcrResponse.md)
 - [AddDocumentRequest](docs/AddDocumentRequest.md)
 - [AddDocumentResponse](docs/AddDocumentResponse.md)
 - [AddDocumentTag](docs/AddDocumentTag.md)
 - [AddDocumentTagsRequest](docs/AddDocumentTagsRequest.md)
 - [AddDocumentUploadRequest](docs/AddDocumentUploadRequest.md)
 - [AddFolderRequest](docs/AddFolderRequest.md)
 - [AddFolderResponse](docs/AddFolderResponse.md)
 - [AddFolderShareRequest](docs/AddFolderShareRequest.md)
 - [AddFolderShareResponse](docs/AddFolderShareResponse.md)
 - [AddShare](docs/AddShare.md)
 - [AddTagSchemaRequest](docs/AddTagSchemaRequest.md)
 - [AddTagSchemaTags](docs/AddTagSchemaTags.md)
 - [AddWebhookRequest](docs/AddWebhookRequest.md)
 - [AddWebhookResponse](docs/AddWebhookResponse.md)
 - [ApiKey](docs/ApiKey.md)
 - [ChildDocument](docs/ChildDocument.md)
 - [DeleteApiKeyResponse](docs/DeleteApiKeyResponse.md)
 - [DeleteFolderResponse](docs/DeleteFolderResponse.md)
 - [DeleteFulltextResponse](docs/DeleteFulltextResponse.md)
 - [DeleteIndicesResponse](docs/DeleteIndicesResponse.md)
 - [DeleteShareResponse](docs/DeleteShareResponse.md)
 - [DocumentAction](docs/DocumentAction.md)
 - [DocumentFulltextRequest](docs/DocumentFulltextRequest.md)
 - [DocumentFulltextResponse](docs/DocumentFulltextResponse.md)
 - [DocumentFulltextSearch](docs/DocumentFulltextSearch.md)
 - [DocumentFulltextTag](docs/DocumentFulltextTag.md)
 - [DocumentId](docs/DocumentId.md)
 - [DocumentItemResult](docs/DocumentItemResult.md)
 - [DocumentItemVersion](docs/DocumentItemVersion.md)
 - [DocumentSearch](docs/DocumentSearch.md)
 - [DocumentSearchItemMeta](docs/DocumentSearchItemMeta.md)
 - [DocumentSearchItemTag](docs/DocumentSearchItemTag.md)
 - [DocumentSearchMatchTag](docs/DocumentSearchMatchTag.md)
 - [DocumentSearchRequest](docs/DocumentSearchRequest.md)
 - [DocumentSearchResponse](docs/DocumentSearchResponse.md)
 - [Error](docs/Error.md)
 - [ErrorsResponse](docs/ErrorsResponse.md)
 - [EsignatureDocusignCarbonCopy](docs/EsignatureDocusignCarbonCopy.md)
 - [EsignatureDocusignConfigResponse](docs/EsignatureDocusignConfigResponse.md)
 - [EsignatureDocusignRecipientTab](docs/EsignatureDocusignRecipientTab.md)
 - [EsignatureDocusignRequest](docs/EsignatureDocusignRequest.md)
 - [EsignatureDocusignResponse](docs/EsignatureDocusignResponse.md)
 - [EsignatureDocusignSigner](docs/EsignatureDocusignSigner.md)
 - [EsignatureSetDocusignConfigRequest](docs/EsignatureSetDocusignConfigRequest.md)
 - [EsignatureSetDocusignConfigResponse](docs/EsignatureSetDocusignConfigResponse.md)
 - [FulltextSearchItem](docs/FulltextSearchItem.md)
 - [GetApiKeysResponse](docs/GetApiKeysResponse.md)
 - [GetConfigurationResponse](docs/GetConfigurationResponse.md)
 - [GetDocumentActionsResponse](docs/GetDocumentActionsResponse.md)
 - [GetDocumentContentResponse](docs/GetDocumentContentResponse.md)
 - [GetDocumentFulltextResponse](docs/GetDocumentFulltextResponse.md)
 - [GetDocumentOcrResponse](docs/GetDocumentOcrResponse.md)
 - [GetDocumentResponse](docs/GetDocumentResponse.md)
 - [GetDocumentSync](docs/GetDocumentSync.md)
 - [GetDocumentSyncResponse](docs/GetDocumentSyncResponse.md)
 - [GetDocumentTagResponse](docs/GetDocumentTagResponse.md)
 - [GetDocumentTagsResponse](docs/GetDocumentTagsResponse.md)
 - [GetDocumentUrlResponse](docs/GetDocumentUrlResponse.md)
 - [GetDocumentVersionsResponse](docs/GetDocumentVersionsResponse.md)
 - [GetDocumentsResponse](docs/GetDocumentsResponse.md)
 - [GetFoldersResponse](docs/GetFoldersResponse.md)
 - [GetSitesRequest](docs/GetSitesRequest.md)
 - [GetTagSchemaRequest](docs/GetTagSchemaRequest.md)
 - [GetTagSchemasRequest](docs/GetTagSchemasRequest.md)
 - [GetUserShares](docs/GetUserShares.md)
 - [GetVersionRequest](docs/GetVersionRequest.md)
 - [GetWebhookResponse](docs/GetWebhookResponse.md)
 - [GetWebhookTagsResponse](docs/GetWebhookTagsResponse.md)
 - [GetWebhooksResponse](docs/GetWebhooksResponse.md)
 - [IndexFolderMoveRequest](docs/IndexFolderMoveRequest.md)
 - [IndexFolderMoveResponse](docs/IndexFolderMoveResponse.md)
 - [IndexSearch](docs/IndexSearch.md)
 - [IndexSearchRequest](docs/IndexSearchRequest.md)
 - [IndexSearchResponse](docs/IndexSearchResponse.md)
 - [MatchDocumentTag](docs/MatchDocumentTag.md)
 - [OnlyOfficeConfig](docs/OnlyOfficeConfig.md)
 - [OnlyOfficeConfigDocument](docs/OnlyOfficeConfigDocument.md)
 - [OnlyOfficeDocumentNewRequest](docs/OnlyOfficeDocumentNewRequest.md)
 - [OnlyOfficeDocumentResponse](docs/OnlyOfficeDocumentResponse.md)
 - [OnlyOfficeDocumentSaveResponse](docs/OnlyOfficeDocumentSaveResponse.md)
 - [OnlyOfficeEditorConfig](docs/OnlyOfficeEditorConfig.md)
 - [QueryFulltextResponse](docs/QueryFulltextResponse.md)
 - [SearchResponseFields](docs/SearchResponseFields.md)
 - [SearchResultDocument](docs/SearchResultDocument.md)
 - [SetAntivirusResponse](docs/SetAntivirusResponse.md)
 - [SetConfigRequest](docs/SetConfigRequest.md)
 - [SetConfigResponse](docs/SetConfigResponse.md)
 - [SetDocumentFulltextRequest](docs/SetDocumentFulltextRequest.md)
 - [SetDocumentFulltextResponse](docs/SetDocumentFulltextResponse.md)
 - [SetDocumentOcrRequest](docs/SetDocumentOcrRequest.md)
 - [SetDocumentTagKeyRequest](docs/SetDocumentTagKeyRequest.md)
 - [SetDocumentVersionRequest](docs/SetDocumentVersionRequest.md)
 - [SetDocumentVersionResponse](docs/SetDocumentVersionResponse.md)
 - [Site](docs/Site.md)
 - [TagSchemaCompositeKey](docs/TagSchemaCompositeKey.md)
 - [TagSchemaOptional](docs/TagSchemaOptional.md)
 - [TagSchemaPostResponse](docs/TagSchemaPostResponse.md)
 - [TagSchemaRequired](docs/TagSchemaRequired.md)
 - [TagSchemaSummary](docs/TagSchemaSummary.md)
 - [TagSchemaTags](docs/TagSchemaTags.md)
 - [UpdateDocumentFulltextRequest](docs/UpdateDocumentFulltextRequest.md)
 - [UpdateMatchingDocumentTagsRequest](docs/UpdateMatchingDocumentTagsRequest.md)
 - [UpdateMatchingDocumentTagsRequestMatch](docs/UpdateMatchingDocumentTagsRequestMatch.md)
 - [UpdateMatchingDocumentTagsRequestUpdate](docs/UpdateMatchingDocumentTagsRequestUpdate.md)
 - [UpdateMatchingDocumentTagsResponse](docs/UpdateMatchingDocumentTagsResponse.md)
 - [UserShare](docs/UserShare.md)
 - [ValidationError](docs/ValidationError.md)
 - [ValidationErrorsResponse](docs/ValidationErrorsResponse.md)
 - [WebhookTag](docs/WebhookTag.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@formkiq.com

