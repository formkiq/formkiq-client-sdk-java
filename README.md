# client

FormKiQ HTTP API
- API version: 1.14.0
  - Build date: 2023-12-26T12:48:12.925607-06:00[America/Winnipeg]

Formkiq API: Document Management Platform API using OAuth(JWT) Authentication

You can find out more about FormKiQ at [https://formkiq.com](http://formkiq.com).

## Introduction

FormKiQ is an API-first (head-less), battle-tested document management API. The FormKiQ API provides all the API endpoints to build your Perfect Document Management Platform.

FormKiQ API was built on top of [OpenAPI specification](https://www.openapis.org), so it is easy to use the API spec file with any application that supports the OpenAPI specification.

Open API OAuth Specification - https://raw.githubusercontent.com/formkiq/formkiq-core/master/docs/openapi/openapi-jwt.yaml

Open API IAM Specification - https://raw.githubusercontent.com/formkiq/formkiq-core/master/docs/openapi/openapi-iam.yaml

## Authentication
FormKiQ offers three forms of authentication:
  - OAuth(JWT)
  - AWS IAM
  - API Key

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
  <version>1.14.0</version>
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
     implementation "com.formkiq:client:1.14.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/client-1.14.0.jar`
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
*AdvancedDocumentSearchApi* | [**deleteDocumentFulltext**](docs/AdvancedDocumentSearchApi.md#deleteDocumentFulltext) | **DELETE** /documents/{documentId}/fulltext | Delete document full-text
*AdvancedDocumentSearchApi* | [**deleteDocumentFulltextTag**](docs/AdvancedDocumentSearchApi.md#deleteDocumentFulltextTag) | **DELETE** /documents/{documentId}/fulltext/tags/{tagKey} | Delete document full-text tag
*AdvancedDocumentSearchApi* | [**deleteDocumentFulltextTagAndValue**](docs/AdvancedDocumentSearchApi.md#deleteDocumentFulltextTagAndValue) | **DELETE** /documents/{documentId}/fulltext/tags/{tagKey}/{tagValue} | Delete document full-text tag/value
*AdvancedDocumentSearchApi* | [**documentFulltext**](docs/AdvancedDocumentSearchApi.md#documentFulltext) | **POST** /searchFulltext | Document full-text search
*AdvancedDocumentSearchApi* | [**getDocumentFulltext**](docs/AdvancedDocumentSearchApi.md#getDocumentFulltext) | **GET** /documents/{documentId}/fulltext | Get document&#39;s full-text
*AdvancedDocumentSearchApi* | [**queryFulltext**](docs/AdvancedDocumentSearchApi.md#queryFulltext) | **POST** /queryFulltext | Direct opensearch search API
*AdvancedDocumentSearchApi* | [**setDocumentFulltext**](docs/AdvancedDocumentSearchApi.md#setDocumentFulltext) | **PUT** /documents/{documentId}/fulltext | Set document&#39;s full-text
*AdvancedDocumentSearchApi* | [**updateDocumentFulltext**](docs/AdvancedDocumentSearchApi.md#updateDocumentFulltext) | **PATCH** /documents/{documentId}/fulltext | Update document&#39;s full-text
*AntivirusApi* | [**setAntivirus**](docs/AntivirusApi.md#setAntivirus) | **PUT** /documents/{documentId}/antivirus | Antivirus document scan
*CustomIndexApi* | [**deleteIndex**](docs/CustomIndexApi.md#deleteIndex) | **DELETE** /indices/{indexType}/{indexKey} | 
*CustomIndexApi* | [**indexFolderMove**](docs/CustomIndexApi.md#indexFolderMove) | **POST** /indices/{indexType}/move | 
*CustomIndexApi* | [**indexSearch**](docs/CustomIndexApi.md#indexSearch) | **POST** /indices/search | 
*DocumentActionsApi* | [**addDocumentActions**](docs/DocumentActionsApi.md#addDocumentActions) | **POST** /documents/{documentId}/actions | Add document action
*DocumentActionsApi* | [**addDocumentRetryAction**](docs/DocumentActionsApi.md#addDocumentRetryAction) | **POST** /documents/{documentId}/actions/retry | Retries failed document action(s)
*DocumentActionsApi* | [**getDocumentActions**](docs/DocumentActionsApi.md#getDocumentActions) | **GET** /documents/{documentId}/actions | Get document actions
*DocumentFoldersApi* | [**addFolder**](docs/DocumentFoldersApi.md#addFolder) | **POST** /folders | Add document folder
*DocumentFoldersApi* | [**deleteFolder**](docs/DocumentFoldersApi.md#deleteFolder) | **DELETE** /folders/{indexKey} | Delete document folder
*DocumentFoldersApi* | [**getFolderDocuments**](docs/DocumentFoldersApi.md#getFolderDocuments) | **GET** /folders | Get document folders
*DocumentOcrApi* | [**addDocumentOcr**](docs/DocumentOcrApi.md#addDocumentOcr) | **POST** /documents/{documentId}/ocr | Perform document ocr
*DocumentOcrApi* | [**deleteDocumentOcr**](docs/DocumentOcrApi.md#deleteDocumentOcr) | **DELETE** /documents/{documentId}/ocr | Delete document ocr
*DocumentOcrApi* | [**getDocumentOcr**](docs/DocumentOcrApi.md#getDocumentOcr) | **GET** /documents/{documentId}/ocr | Get document ocr content
*DocumentOcrApi* | [**setDocumentOcr**](docs/DocumentOcrApi.md#setDocumentOcr) | **PUT** /documents/{documentId}/ocr | Set document ocr result
*DocumentSearchApi* | [**documentSearch**](docs/DocumentSearchApi.md#documentSearch) | **POST** /search | Document search
*DocumentSharesApi* | [**addFolderShare**](docs/DocumentSharesApi.md#addFolderShare) | **POST** /shares/folders/{indexKey} | Add folder share
*DocumentSharesApi* | [**deleteShare**](docs/DocumentSharesApi.md#deleteShare) | **DELETE** /shares/{shareKey} | Delete folder share
*DocumentSharesApi* | [**getUserShares**](docs/DocumentSharesApi.md#getUserShares) | **GET** /shares | Get user shared folders
*DocumentTagsApi* | [**addDocumentTags**](docs/DocumentTagsApi.md#addDocumentTags) | **POST** /documents/{documentId}/tags | Add tag to document
*DocumentTagsApi* | [**deleteDocumentTag**](docs/DocumentTagsApi.md#deleteDocumentTag) | **DELETE** /documents/{documentId}/tags/{tagKey} | Delete document tag
*DocumentTagsApi* | [**deleteDocumentTagAndValue**](docs/DocumentTagsApi.md#deleteDocumentTagAndValue) | **DELETE** /documents/{documentId}/tags/{tagKey}/{tagValue} | Delete document&#39;s tag value
*DocumentTagsApi* | [**getDocumentTag**](docs/DocumentTagsApi.md#getDocumentTag) | **GET** /documents/{documentId}/tags/{tagKey} | Get document tag by key
*DocumentTagsApi* | [**getDocumentTags**](docs/DocumentTagsApi.md#getDocumentTags) | **GET** /documents/{documentId}/tags | Get document&#39;s tags
*DocumentTagsApi* | [**setDocumentTag**](docs/DocumentTagsApi.md#setDocumentTag) | **PUT** /documents/{documentId}/tags/{tagKey} | Update document tag value(s)
*DocumentTagsApi* | [**setDocumentTags**](docs/DocumentTagsApi.md#setDocumentTags) | **PUT** /documents/{documentId}/tags | Set document&#39;s tags
*DocumentTagsApi* | [**updateDocumentTags**](docs/DocumentTagsApi.md#updateDocumentTags) | **PATCH** /documents/{documentId}/tags | Update document tags
*DocumentTagsApi* | [**updateMatchingDocumentTags**](docs/DocumentTagsApi.md#updateMatchingDocumentTags) | **PATCH** /documents/tags | Mass Update document tag(s)
*DocumentVersionsApi* | [**deleteDocumentVersion**](docs/DocumentVersionsApi.md#deleteDocumentVersion) | **DELETE** /documents/{documentId}/versions/{versionKey} | Delete document version
*DocumentVersionsApi* | [**getDocumentVersions**](docs/DocumentVersionsApi.md#getDocumentVersions) | **GET** /documents/{documentId}/versions | Get document&#39;s versions
*DocumentVersionsApi* | [**setDocumentVersion**](docs/DocumentVersionsApi.md#setDocumentVersion) | **PUT** /documents/{documentId}/versions | Set version of document
*DocumentWorkflowsApi* | [**addDocumentWorkflow**](docs/DocumentWorkflowsApi.md#addDocumentWorkflow) | **POST** /documents/{documentId}/workflows | Add document workflow
*DocumentWorkflowsApi* | [**addDocumentWorkflowDecisions**](docs/DocumentWorkflowsApi.md#addDocumentWorkflowDecisions) | **POST** /documents/{documentId}/workflow/{workflowId}/decisions | Approve/Reject document in approval queue
*DocumentWorkflowsApi* | [**addQueue**](docs/DocumentWorkflowsApi.md#addQueue) | **POST** /queues | Add queue
*DocumentWorkflowsApi* | [**addWorkflow**](docs/DocumentWorkflowsApi.md#addWorkflow) | **POST** /workflows | Add workflow
*DocumentWorkflowsApi* | [**deleteQueue**](docs/DocumentWorkflowsApi.md#deleteQueue) | **DELETE** /queues/{queueId} | Delete queue
*DocumentWorkflowsApi* | [**deleteWorkflow**](docs/DocumentWorkflowsApi.md#deleteWorkflow) | **DELETE** /workflows/{workflowId} | Delete workflow
*DocumentWorkflowsApi* | [**getDocumentWorkflow**](docs/DocumentWorkflowsApi.md#getDocumentWorkflow) | **GET** /documents/{documentId}/workflows/{workflowId} | Get document workflow
*DocumentWorkflowsApi* | [**getDocumentWorkflows**](docs/DocumentWorkflowsApi.md#getDocumentWorkflows) | **GET** /documents/{documentId}/workflows | Get document workflows
*DocumentWorkflowsApi* | [**getQueue**](docs/DocumentWorkflowsApi.md#getQueue) | **GET** /queues/{queueId} | Get queue
*DocumentWorkflowsApi* | [**getQueues**](docs/DocumentWorkflowsApi.md#getQueues) | **GET** /queues | Get queues
*DocumentWorkflowsApi* | [**getWorkflow**](docs/DocumentWorkflowsApi.md#getWorkflow) | **GET** /workflows/{workflowId} | Get workflow
*DocumentWorkflowsApi* | [**getWorkflowDocuments**](docs/DocumentWorkflowsApi.md#getWorkflowDocuments) | **GET** /workflows/{workflowId}/documents | Get list of documents in workflow
*DocumentWorkflowsApi* | [**getWorkflowQueueDocuments**](docs/DocumentWorkflowsApi.md#getWorkflowQueueDocuments) | **GET** /queues/{queueId}/documents | Get list of documents in queue
*DocumentWorkflowsApi* | [**getWorkflows**](docs/DocumentWorkflowsApi.md#getWorkflows) | **GET** /workflows | Get workflows
*DocumentWorkflowsApi* | [**setWorkflow**](docs/DocumentWorkflowsApi.md#setWorkflow) | **PUT** /workflows/{workflowId} | Add workflow
*DocumentsApi* | [**addDocument**](docs/DocumentsApi.md#addDocument) | **POST** /documents | Add new document
*DocumentsApi* | [**addDocumentUpload**](docs/DocumentsApi.md#addDocumentUpload) | **POST** /documents/upload | Add large document
*DocumentsApi* | [**compressDocuments**](docs/DocumentsApi.md#compressDocuments) | **POST** /documents/compress | Compress multiple documents into a .zip file
*DocumentsApi* | [**deleteDocument**](docs/DocumentsApi.md#deleteDocument) | **DELETE** /documents/{documentId} | Delete document
*DocumentsApi* | [**deleteOpaConfiguration**](docs/DocumentsApi.md#deleteOpaConfiguration) | **DELETE** /configuration/opa | Delete OPA Configuration
*DocumentsApi* | [**getDocument**](docs/DocumentsApi.md#getDocument) | **GET** /documents/{documentId} | Get document
*DocumentsApi* | [**getDocumentContent**](docs/DocumentsApi.md#getDocumentContent) | **GET** /documents/{documentId}/content | Get document&#39;s contents
*DocumentsApi* | [**getDocumentIdUpload**](docs/DocumentsApi.md#getDocumentIdUpload) | **GET** /documents/{documentId}/upload | Get url to update large document
*DocumentsApi* | [**getDocumentSyncs**](docs/DocumentsApi.md#getDocumentSyncs) | **GET** /documents/{documentId}/syncs | Get document syncs
*DocumentsApi* | [**getDocumentUpload**](docs/DocumentsApi.md#getDocumentUpload) | **GET** /documents/upload | Get url to add large document
*DocumentsApi* | [**getDocumentUrl**](docs/DocumentsApi.md#getDocumentUrl) | **GET** /documents/{documentId}/url | Get document content url
*DocumentsApi* | [**getDocuments**](docs/DocumentsApi.md#getDocuments) | **GET** /documents | Get Documents listing
*DocumentsApi* | [**setDocumentRestore**](docs/DocumentsApi.md#setDocumentRestore) | **PUT** /documents/{documentId}/restore | Restore soft deleted document
*DocumentsApi* | [**updateDocument**](docs/DocumentsApi.md#updateDocument) | **PATCH** /documents/{documentId} | Update document
*ESignatureApi* | [**addEsignatureDocusign**](docs/ESignatureApi.md#addEsignatureDocusign) | **POST** /esignature/docusign/{documentId} | Create E-signature request
*ESignatureApi* | [**addEsignatureDocusignEvents**](docs/ESignatureApi.md#addEsignatureDocusignEvents) | **POST** /esignature/docusign/events | Add E-signature event
*ESignatureApi* | [**getEsignatureDocusignConfig**](docs/ESignatureApi.md#getEsignatureDocusignConfig) | **GET** /esignature/docusign/config | Get E-signature config
*ESignatureApi* | [**setEsignatureDocusignConfig**](docs/ESignatureApi.md#setEsignatureDocusignConfig) | **PUT** /esignature/docusign/config | Set E-signature config
*OnlyofficeApi* | [**onlyOfficeDocumentEdit**](docs/OnlyofficeApi.md#onlyOfficeDocumentEdit) | **POST** /onlyoffice/{documentId}/edit | Edit onlyoffice document
*OnlyofficeApi* | [**onlyOfficeDocumentNew**](docs/OnlyofficeApi.md#onlyOfficeDocumentNew) | **POST** /onlyoffice/new | Create onlyoffice document
*OnlyofficeApi* | [**onlyOfficeDocumentSave**](docs/OnlyofficeApi.md#onlyOfficeDocumentSave) | **POST** /onlyoffice/{documentId}/save | Save onlyoffice document
*PublicApi* | [**publicAddDocument**](docs/PublicApi.md#publicAddDocument) | **POST** /public/documents | Public add document
*PublicApi* | [**publicAddWebhook**](docs/PublicApi.md#publicAddWebhook) | **POST** /public/webhooks/{webhooks+} | Public add webhook
*SystemManagementApi* | [**addApiKey**](docs/SystemManagementApi.md#addApiKey) | **POST** /configuration/apiKeys | Add API Key
*SystemManagementApi* | [**deleteApiKey**](docs/SystemManagementApi.md#deleteApiKey) | **DELETE** /configuration/apiKeys/{apiKey} | Delete API Key
*SystemManagementApi* | [**getApiKeys**](docs/SystemManagementApi.md#getApiKeys) | **GET** /configuration/apiKeys | Get API Keys
*SystemManagementApi* | [**getConfiguration**](docs/SystemManagementApi.md#getConfiguration) | **GET** /configuration | Get site configuration
*SystemManagementApi* | [**getOpaConfiguration**](docs/SystemManagementApi.md#getOpaConfiguration) | **GET** /configuration/opa | Get OPA Configuration
*SystemManagementApi* | [**getSites**](docs/SystemManagementApi.md#getSites) | **GET** /sites | Get site(s) access
*SystemManagementApi* | [**getVersion**](docs/SystemManagementApi.md#getVersion) | **GET** /version | Get FormKiQ version
*SystemManagementApi* | [**setOpaConfiguration**](docs/SystemManagementApi.md#setOpaConfiguration) | **PUT** /configuration/opa | Set OPA Configuration
*SystemManagementApi* | [**updateConfiguration**](docs/SystemManagementApi.md#updateConfiguration) | **PATCH** /configuration | Update site configuration
*TagIndexApi* | [**indexSearch**](docs/TagIndexApi.md#indexSearch) | **POST** /indices/search | 
*TagSchemaApi* | [**addTagSchema**](docs/TagSchemaApi.md#addTagSchema) | **POST** /tagSchemas | Add tag schemas
*TagSchemaApi* | [**deleteTagSchema**](docs/TagSchemaApi.md#deleteTagSchema) | **DELETE** /tagSchemas/{tagSchemaId} | Delete tag schema
*TagSchemaApi* | [**getTagSchema**](docs/TagSchemaApi.md#getTagSchema) | **GET** /tagSchemas/{tagSchemaId} | Get tag schema
*TagSchemaApi* | [**getTagSchemas**](docs/TagSchemaApi.md#getTagSchemas) | **GET** /tagSchemas | Get tag schemas
*UserActivitiesApi* | [**getDocumentUserActivities**](docs/UserActivitiesApi.md#getDocumentUserActivities) | **GET** /documents/{documentId}/userActivities | Get user activities
*UserActivitiesApi* | [**getUserActivities**](docs/UserActivitiesApi.md#getUserActivities) | **GET** /userActivities | Get user activities
*UserManagementApi* | [**getGroups**](docs/UserManagementApi.md#getGroups) | **GET** /groups | Get configured system group(s)
*UserManagementApi* | [**getUsersInGroup**](docs/UserManagementApi.md#getUsersInGroup) | **GET** /groups/{groupName}/users | Get users in a group
*WebhooksApi* | [**addWebhook**](docs/WebhooksApi.md#addWebhook) | **POST** /webhooks | Add webhook
*WebhooksApi* | [**addWebhookDocument**](docs/WebhooksApi.md#addWebhookDocument) | **POST** /private/webhooks/{webhooks+} | Add webhook
*WebhooksApi* | [**addWebhookTag**](docs/WebhooksApi.md#addWebhookTag) | **POST** /webhooks/{webhookId}/tags | Add webhook tag
*WebhooksApi* | [**deleteWebhook**](docs/WebhooksApi.md#deleteWebhook) | **DELETE** /webhooks/{webhookId} | Delete webhook
*WebhooksApi* | [**getWebhook**](docs/WebhooksApi.md#getWebhook) | **GET** /webhooks/{webhookId} | Get webhook
*WebhooksApi* | [**getWebhookTags**](docs/WebhooksApi.md#getWebhookTags) | **GET** /webhooks/{webhookId}/tags | Get webhook tags
*WebhooksApi* | [**getWebhooks**](docs/WebhooksApi.md#getWebhooks) | **GET** /webhooks | Get webhooks
*WebhooksApi* | [**updateWebhook**](docs/WebhooksApi.md#updateWebhook) | **PATCH** /webhooks/{webhookId} | Update webhook


## Documentation for Models

 - [AddAction](docs/AddAction.md)
 - [AddActionParameters](docs/AddActionParameters.md)
 - [AddApiKeyRequest](docs/AddApiKeyRequest.md)
 - [AddApiKeyResponse](docs/AddApiKeyResponse.md)
 - [AddChildDocument](docs/AddChildDocument.md)
 - [AddChildDocumentResponse](docs/AddChildDocumentResponse.md)
 - [AddDocumentActionsRequest](docs/AddDocumentActionsRequest.md)
 - [AddDocumentActionsResponse](docs/AddDocumentActionsResponse.md)
 - [AddDocumentActionsRetryResponse](docs/AddDocumentActionsRetryResponse.md)
 - [AddDocumentMetadata](docs/AddDocumentMetadata.md)
 - [AddDocumentOcrRequest](docs/AddDocumentOcrRequest.md)
 - [AddDocumentOcrResponse](docs/AddDocumentOcrResponse.md)
 - [AddDocumentRequest](docs/AddDocumentRequest.md)
 - [AddDocumentResponse](docs/AddDocumentResponse.md)
 - [AddDocumentTag](docs/AddDocumentTag.md)
 - [AddDocumentTagsRequest](docs/AddDocumentTagsRequest.md)
 - [AddDocumentUploadRequest](docs/AddDocumentUploadRequest.md)
 - [AddDocumentWorkflowDecisionsRequest](docs/AddDocumentWorkflowDecisionsRequest.md)
 - [AddDocumentWorkflowDecisionsResponse](docs/AddDocumentWorkflowDecisionsResponse.md)
 - [AddDocumentWorkflowRequest](docs/AddDocumentWorkflowRequest.md)
 - [AddDocumentWorkflowResponse](docs/AddDocumentWorkflowResponse.md)
 - [AddEsignatureDocusignRequest](docs/AddEsignatureDocusignRequest.md)
 - [AddEsignatureDocusignResponse](docs/AddEsignatureDocusignResponse.md)
 - [AddFolderRequest](docs/AddFolderRequest.md)
 - [AddFolderResponse](docs/AddFolderResponse.md)
 - [AddFolderShareRequest](docs/AddFolderShareRequest.md)
 - [AddFolderShareResponse](docs/AddFolderShareResponse.md)
 - [AddQueueRequest](docs/AddQueueRequest.md)
 - [AddQueueResponse](docs/AddQueueResponse.md)
 - [AddShare](docs/AddShare.md)
 - [AddTagSchemaRequest](docs/AddTagSchemaRequest.md)
 - [AddTagSchemaResponse](docs/AddTagSchemaResponse.md)
 - [AddTagSchemaTags](docs/AddTagSchemaTags.md)
 - [AddWebhookRequest](docs/AddWebhookRequest.md)
 - [AddWebhookResponse](docs/AddWebhookResponse.md)
 - [AddWebhookTagRequest](docs/AddWebhookTagRequest.md)
 - [AddWorkflowRequest](docs/AddWorkflowRequest.md)
 - [AddWorkflowResponse](docs/AddWorkflowResponse.md)
 - [AddWorkflowStep](docs/AddWorkflowStep.md)
 - [AddWorkflowStepDecision](docs/AddWorkflowStepDecision.md)
 - [AddWorkflowStepQueue](docs/AddWorkflowStepQueue.md)
 - [ApiKey](docs/ApiKey.md)
 - [ChildDocument](docs/ChildDocument.md)
 - [DeleteApiKeyResponse](docs/DeleteApiKeyResponse.md)
 - [DeleteFolderResponse](docs/DeleteFolderResponse.md)
 - [DeleteFulltextResponse](docs/DeleteFulltextResponse.md)
 - [DeleteIndicesResponse](docs/DeleteIndicesResponse.md)
 - [DeleteOpaConfigurationResponse](docs/DeleteOpaConfigurationResponse.md)
 - [DeleteQueueResponse](docs/DeleteQueueResponse.md)
 - [DeleteShareResponse](docs/DeleteShareResponse.md)
 - [DeleteWorkflowResponse](docs/DeleteWorkflowResponse.md)
 - [Document](docs/Document.md)
 - [DocumentAction](docs/DocumentAction.md)
 - [DocumentCompositeSearchTag](docs/DocumentCompositeSearchTag.md)
 - [DocumentFulltextRequest](docs/DocumentFulltextRequest.md)
 - [DocumentFulltextResponse](docs/DocumentFulltextResponse.md)
 - [DocumentFulltextSearch](docs/DocumentFulltextSearch.md)
 - [DocumentFulltextTag](docs/DocumentFulltextTag.md)
 - [DocumentId](docs/DocumentId.md)
 - [DocumentMetadata](docs/DocumentMetadata.md)
 - [DocumentSearch](docs/DocumentSearch.md)
 - [DocumentSearchMatchTag](docs/DocumentSearchMatchTag.md)
 - [DocumentSearchMeta](docs/DocumentSearchMeta.md)
 - [DocumentSearchRequest](docs/DocumentSearchRequest.md)
 - [DocumentSearchResponse](docs/DocumentSearchResponse.md)
 - [DocumentSearchTag](docs/DocumentSearchTag.md)
 - [DocumentTag](docs/DocumentTag.md)
 - [DocumentVersion](docs/DocumentVersion.md)
 - [DocumentWorkflow](docs/DocumentWorkflow.md)
 - [DocumentsCompressRequest](docs/DocumentsCompressRequest.md)
 - [DocumentsCompressResponse](docs/DocumentsCompressResponse.md)
 - [Error](docs/Error.md)
 - [ErrorsResponse](docs/ErrorsResponse.md)
 - [EsignatureDocusignCarbonCopy](docs/EsignatureDocusignCarbonCopy.md)
 - [EsignatureDocusignRecipientTab](docs/EsignatureDocusignRecipientTab.md)
 - [EsignatureDocusignSigner](docs/EsignatureDocusignSigner.md)
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
 - [GetDocumentWorkflowResponse](docs/GetDocumentWorkflowResponse.md)
 - [GetDocumentWorkflowsResponse](docs/GetDocumentWorkflowsResponse.md)
 - [GetDocumentsResponse](docs/GetDocumentsResponse.md)
 - [GetEsignatureDocusignConfigResponse](docs/GetEsignatureDocusignConfigResponse.md)
 - [GetFoldersResponse](docs/GetFoldersResponse.md)
 - [GetGroupsResponse](docs/GetGroupsResponse.md)
 - [GetOpaConfigurationResponse](docs/GetOpaConfigurationResponse.md)
 - [GetQueueResponse](docs/GetQueueResponse.md)
 - [GetQueuesResponse](docs/GetQueuesResponse.md)
 - [GetSitesResponse](docs/GetSitesResponse.md)
 - [GetTagSchemaResponse](docs/GetTagSchemaResponse.md)
 - [GetTagSchemasResponse](docs/GetTagSchemasResponse.md)
 - [GetUserActivitesResponse](docs/GetUserActivitesResponse.md)
 - [GetUserSharesResponse](docs/GetUserSharesResponse.md)
 - [GetUsersInGroupResponse](docs/GetUsersInGroupResponse.md)
 - [GetVersionResponse](docs/GetVersionResponse.md)
 - [GetWebhookResponse](docs/GetWebhookResponse.md)
 - [GetWebhookTagsResponse](docs/GetWebhookTagsResponse.md)
 - [GetWebhooksResponse](docs/GetWebhooksResponse.md)
 - [GetWorkflowDocumentsResponse](docs/GetWorkflowDocumentsResponse.md)
 - [GetWorkflowQueueDocumentsResponse](docs/GetWorkflowQueueDocumentsResponse.md)
 - [GetWorkflowResponse](docs/GetWorkflowResponse.md)
 - [GetWorkflowsResponse](docs/GetWorkflowsResponse.md)
 - [Group](docs/Group.md)
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
 - [Queue](docs/Queue.md)
 - [SearchResponseFields](docs/SearchResponseFields.md)
 - [SearchResultDocument](docs/SearchResultDocument.md)
 - [SetAntivirusResponse](docs/SetAntivirusResponse.md)
 - [SetDocumentFulltextRequest](docs/SetDocumentFulltextRequest.md)
 - [SetDocumentFulltextResponse](docs/SetDocumentFulltextResponse.md)
 - [SetDocumentOcrRequest](docs/SetDocumentOcrRequest.md)
 - [SetDocumentRestoreResponse](docs/SetDocumentRestoreResponse.md)
 - [SetDocumentTagKeyRequest](docs/SetDocumentTagKeyRequest.md)
 - [SetDocumentVersionRequest](docs/SetDocumentVersionRequest.md)
 - [SetDocumentVersionResponse](docs/SetDocumentVersionResponse.md)
 - [SetEsignatureDocusignConfigRequest](docs/SetEsignatureDocusignConfigRequest.md)
 - [SetEsignatureDocusignConfigResponse](docs/SetEsignatureDocusignConfigResponse.md)
 - [SetOpaConfigurationRequest](docs/SetOpaConfigurationRequest.md)
 - [SetOpaConfigurationResponse](docs/SetOpaConfigurationResponse.md)
 - [SetWorkflowRequest](docs/SetWorkflowRequest.md)
 - [SetWorkflowResponse](docs/SetWorkflowResponse.md)
 - [Site](docs/Site.md)
 - [TagSchema](docs/TagSchema.md)
 - [TagSchemaCompositeKey](docs/TagSchemaCompositeKey.md)
 - [TagSchemaOptional](docs/TagSchemaOptional.md)
 - [TagSchemaRequired](docs/TagSchemaRequired.md)
 - [TagSchemaSummary](docs/TagSchemaSummary.md)
 - [TagSchemaTags](docs/TagSchemaTags.md)
 - [UpdateConfigurationRequest](docs/UpdateConfigurationRequest.md)
 - [UpdateConfigurationResponse](docs/UpdateConfigurationResponse.md)
 - [UpdateDocumentFulltextRequest](docs/UpdateDocumentFulltextRequest.md)
 - [UpdateMatchingDocumentTagsRequest](docs/UpdateMatchingDocumentTagsRequest.md)
 - [UpdateMatchingDocumentTagsRequestMatch](docs/UpdateMatchingDocumentTagsRequestMatch.md)
 - [UpdateMatchingDocumentTagsRequestUpdate](docs/UpdateMatchingDocumentTagsRequestUpdate.md)
 - [UpdateMatchingDocumentTagsResponse](docs/UpdateMatchingDocumentTagsResponse.md)
 - [User](docs/User.md)
 - [UserActivity](docs/UserActivity.md)
 - [UserShare](docs/UserShare.md)
 - [ValidationError](docs/ValidationError.md)
 - [ValidationErrorsResponse](docs/ValidationErrorsResponse.md)
 - [WebhookTag](docs/WebhookTag.md)
 - [WorkflowDocument](docs/WorkflowDocument.md)
 - [WorkflowQueue](docs/WorkflowQueue.md)
 - [WorkflowStep](docs/WorkflowStep.md)
 - [WorkflowStepDecision](docs/WorkflowStepDecision.md)
 - [WorkflowSummary](docs/WorkflowSummary.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@formkiq.com

