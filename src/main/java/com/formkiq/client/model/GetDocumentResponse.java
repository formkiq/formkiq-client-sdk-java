/*
 * FormKiQ API Formkiq API: Document Management Platform API using OAuth(JWT) Authentication You can
 * find out more about FormKiQ at [https://formkiq.com](http://formkiq.com). ## Introduction FormKiQ
 * is an API-first (head-less), battle-tested document management API. The FormKiQ API provides all
 * the API endpoints to build your Perfect Document Management Platform. FormKiQ API was built on
 * top of [OpenAPI specification](https://www.openapis.org), so it is easy to use the API spec file
 * with any application that supports the OpenAPI specification. Open API OAuth Specification -
 * https://raw.githubusercontent.com/formkiq/formkiq-core/master/docs/openapi/openapi-jwt.yaml Open
 * API IAM Specification -
 * https://raw.githubusercontent.com/formkiq/formkiq-core/master/docs/openapi/openapi-iam.yaml ##
 * Authentication FormKiQ offers three forms of authentication: - OAuth(JWT) - AWS IAM - API Key
 *
 * The version of the OpenAPI document: 1.15.0 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import com.formkiq.client.model.ChildDocument;
import com.formkiq.client.model.DocumentMetadata;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.formkiq.client.invoker.JSON;

/**
 * GetDocumentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-06-15T22:51:11.836217-05:00[America/Winnipeg]",
    comments = "Generator version: 7.6.0")
public class GetDocumentResponse {
  public static final String SERIALIZED_NAME_SITE_ID = "siteId";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private String siteId;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_DEEP_LINK_PATH = "deepLinkPath";
  @SerializedName(SERIALIZED_NAME_DEEP_LINK_PATH)
  private String deepLinkPath;

  public static final String SERIALIZED_NAME_INSERTED_DATE = "insertedDate";
  @SerializedName(SERIALIZED_NAME_INSERTED_DATE)
  private String insertedDate;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_DATE = "lastModifiedDate";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_DATE)
  private String lastModifiedDate;

  public static final String SERIALIZED_NAME_CHECKSUM = "checksum";
  @SerializedName(SERIALIZED_NAME_CHECKSUM)
  private String checksum;

  public static final String SERIALIZED_NAME_DOCUMENT_ID = "documentId";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_ID)
  private String documentId;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "contentType";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_CONTENT_LENGTH = "contentLength";
  @SerializedName(SERIALIZED_NAME_CONTENT_LENGTH)
  private Integer contentLength;

  public static final String SERIALIZED_NAME_VERSION_ID = "versionId";
  @SerializedName(SERIALIZED_NAME_VERSION_ID)
  private String versionId;

  public static final String SERIALIZED_NAME_DOCUMENTS = "documents";
  @SerializedName(SERIALIZED_NAME_DOCUMENTS)
  private List<ChildDocument> documents = new ArrayList<>();

  public static final String SERIALIZED_NAME_BELONGS_TO_DOCUMENT_ID = "belongsToDocumentId";
  @SerializedName(SERIALIZED_NAME_BELONGS_TO_DOCUMENT_ID)
  private String belongsToDocumentId;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private List<DocumentMetadata> metadata = new ArrayList<>();

  public GetDocumentResponse() {}

  public GetDocumentResponse siteId(String siteId) {
    this.siteId = siteId;
    return this;
  }

  /**
   * Site Identifier
   * 
   * @return siteId
   **/
  @javax.annotation.Nullable
  public String getSiteId() {
    return siteId;
  }

  public void setSiteId(String siteId) {
    this.siteId = siteId;
  }


  public GetDocumentResponse path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Path or Name of document
   * 
   * @return path
   **/
  @javax.annotation.Nullable
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  public GetDocumentResponse deepLinkPath(String deepLinkPath) {
    this.deepLinkPath = deepLinkPath;
    return this;
  }

  /**
   * Path or Name of deep link
   * 
   * @return deepLinkPath
   **/
  @javax.annotation.Nullable
  public String getDeepLinkPath() {
    return deepLinkPath;
  }

  public void setDeepLinkPath(String deepLinkPath) {
    this.deepLinkPath = deepLinkPath;
  }


  public GetDocumentResponse insertedDate(String insertedDate) {
    this.insertedDate = insertedDate;
    return this;
  }

  /**
   * Inserted Timestamp
   * 
   * @return insertedDate
   **/
  @javax.annotation.Nullable
  public String getInsertedDate() {
    return insertedDate;
  }

  public void setInsertedDate(String insertedDate) {
    this.insertedDate = insertedDate;
  }


  public GetDocumentResponse lastModifiedDate(String lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

  /**
   * Last Modified Timestamp
   * 
   * @return lastModifiedDate
   **/
  @javax.annotation.Nullable
  public String getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(String lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }


  public GetDocumentResponse checksum(String checksum) {
    this.checksum = checksum;
    return this;
  }

  /**
   * Document checksum, changes when document file changes
   * 
   * @return checksum
   **/
  @javax.annotation.Nullable
  public String getChecksum() {
    return checksum;
  }

  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }


  public GetDocumentResponse documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Document Identifier
   * 
   * @return documentId
   **/
  @javax.annotation.Nonnull
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }


  public GetDocumentResponse contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Document Content-Type
   * 
   * @return contentType
   **/
  @javax.annotation.Nullable
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public GetDocumentResponse userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * User who added document
   * 
   * @return userId
   **/
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public GetDocumentResponse contentLength(Integer contentLength) {
    this.contentLength = contentLength;
    return this;
  }

  /**
   * Document size
   * 
   * @return contentLength
   **/
  @javax.annotation.Nullable
  public Integer getContentLength() {
    return contentLength;
  }

  public void setContentLength(Integer contentLength) {
    this.contentLength = contentLength;
  }


  public GetDocumentResponse versionId(String versionId) {
    this.versionId = versionId;
    return this;
  }

  /**
   * Document version
   * 
   * @return versionId
   **/
  @javax.annotation.Nullable
  public String getVersionId() {
    return versionId;
  }

  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }


  public GetDocumentResponse documents(List<ChildDocument> documents) {
    this.documents = documents;
    return this;
  }

  public GetDocumentResponse addDocumentsItem(ChildDocument documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<>();
    }
    this.documents.add(documentsItem);
    return this;
  }

  /**
   * List of child documents
   * 
   * @return documents
   **/
  @javax.annotation.Nullable
  public List<ChildDocument> getDocuments() {
    return documents;
  }

  public void setDocuments(List<ChildDocument> documents) {
    this.documents = documents;
  }


  public GetDocumentResponse belongsToDocumentId(String belongsToDocumentId) {
    this.belongsToDocumentId = belongsToDocumentId;
    return this;
  }

  /**
   * Parent Document Identifier
   * 
   * @return belongsToDocumentId
   **/
  @javax.annotation.Nullable
  public String getBelongsToDocumentId() {
    return belongsToDocumentId;
  }

  public void setBelongsToDocumentId(String belongsToDocumentId) {
    this.belongsToDocumentId = belongsToDocumentId;
  }


  public GetDocumentResponse metadata(List<DocumentMetadata> metadata) {
    this.metadata = metadata;
    return this;
  }

  public GetDocumentResponse addMetadataItem(DocumentMetadata metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

  /**
   * List of document Metadata
   * 
   * @return metadata
   **/
  @javax.annotation.Nullable
  public List<DocumentMetadata> getMetadata() {
    return metadata;
  }

  public void setMetadata(List<DocumentMetadata> metadata) {
    this.metadata = metadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocumentResponse getDocumentResponse = (GetDocumentResponse) o;
    return Objects.equals(this.siteId, getDocumentResponse.siteId)
        && Objects.equals(this.path, getDocumentResponse.path)
        && Objects.equals(this.deepLinkPath, getDocumentResponse.deepLinkPath)
        && Objects.equals(this.insertedDate, getDocumentResponse.insertedDate)
        && Objects.equals(this.lastModifiedDate, getDocumentResponse.lastModifiedDate)
        && Objects.equals(this.checksum, getDocumentResponse.checksum)
        && Objects.equals(this.documentId, getDocumentResponse.documentId)
        && Objects.equals(this.contentType, getDocumentResponse.contentType)
        && Objects.equals(this.userId, getDocumentResponse.userId)
        && Objects.equals(this.contentLength, getDocumentResponse.contentLength)
        && Objects.equals(this.versionId, getDocumentResponse.versionId)
        && Objects.equals(this.documents, getDocumentResponse.documents)
        && Objects.equals(this.belongsToDocumentId, getDocumentResponse.belongsToDocumentId)
        && Objects.equals(this.metadata, getDocumentResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siteId, path, deepLinkPath, insertedDate, lastModifiedDate, checksum,
        documentId, contentType, userId, contentLength, versionId, documents, belongsToDocumentId,
        metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocumentResponse {\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    deepLinkPath: ").append(toIndentedString(deepLinkPath)).append("\n");
    sb.append("    insertedDate: ").append(toIndentedString(insertedDate)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    belongsToDocumentId: ").append(toIndentedString(belongsToDocumentId))
        .append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("siteId");
    openapiFields.add("path");
    openapiFields.add("deepLinkPath");
    openapiFields.add("insertedDate");
    openapiFields.add("lastModifiedDate");
    openapiFields.add("checksum");
    openapiFields.add("documentId");
    openapiFields.add("contentType");
    openapiFields.add("userId");
    openapiFields.add("contentLength");
    openapiFields.add("versionId");
    openapiFields.add("documents");
    openapiFields.add("belongsToDocumentId");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("documentId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetDocumentResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!GetDocumentResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                  // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in GetDocumentResponse is not found in the empty JSON string",
            GetDocumentResponse.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!GetDocumentResponse.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `GetDocumentResponse` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : GetDocumentResponse.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format("The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("siteId") != null && !jsonObj.get("siteId").isJsonNull())
        && !jsonObj.get("siteId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `siteId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("siteId").toString()));
    }
    if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull())
        && !jsonObj.get("path").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `path` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("path").toString()));
    }
    if ((jsonObj.get("deepLinkPath") != null && !jsonObj.get("deepLinkPath").isJsonNull())
        && !jsonObj.get("deepLinkPath").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `deepLinkPath` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("deepLinkPath").toString()));
    }
    if ((jsonObj.get("insertedDate") != null && !jsonObj.get("insertedDate").isJsonNull())
        && !jsonObj.get("insertedDate").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `insertedDate` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("insertedDate").toString()));
    }
    if ((jsonObj.get("lastModifiedDate") != null && !jsonObj.get("lastModifiedDate").isJsonNull())
        && !jsonObj.get("lastModifiedDate").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `lastModifiedDate` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("lastModifiedDate").toString()));
    }
    if ((jsonObj.get("checksum") != null && !jsonObj.get("checksum").isJsonNull())
        && !jsonObj.get("checksum").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `checksum` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("checksum").toString()));
    }
    if (!jsonObj.get("documentId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `documentId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("documentId").toString()));
    }
    if ((jsonObj.get("contentType") != null && !jsonObj.get("contentType").isJsonNull())
        && !jsonObj.get("contentType").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `contentType` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("contentType").toString()));
    }
    if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull())
        && !jsonObj.get("userId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `userId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("userId").toString()));
    }
    if ((jsonObj.get("versionId") != null && !jsonObj.get("versionId").isJsonNull())
        && !jsonObj.get("versionId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `versionId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("versionId").toString()));
    }
    if (jsonObj.get("documents") != null && !jsonObj.get("documents").isJsonNull()) {
      JsonArray jsonArraydocuments = jsonObj.getAsJsonArray("documents");
      if (jsonArraydocuments != null) {
        // ensure the json data is an array
        if (!jsonObj.get("documents").isJsonArray()) {
          throw new IllegalArgumentException(String.format(
              "Expected the field `documents` to be an array in the JSON string but got `%s`",
              jsonObj.get("documents").toString()));
        }

        // validate the optional field `documents` (array)
        for (int i = 0; i < jsonArraydocuments.size(); i++) {
          ChildDocument.validateJsonElement(jsonArraydocuments.get(i));
        } ;
      }
    }
    if ((jsonObj.get("belongsToDocumentId") != null
        && !jsonObj.get("belongsToDocumentId").isJsonNull())
        && !jsonObj.get("belongsToDocumentId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `belongsToDocumentId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("belongsToDocumentId").toString()));
    }
    if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
      JsonArray jsonArraymetadata = jsonObj.getAsJsonArray("metadata");
      if (jsonArraymetadata != null) {
        // ensure the json data is an array
        if (!jsonObj.get("metadata").isJsonArray()) {
          throw new IllegalArgumentException(String.format(
              "Expected the field `metadata` to be an array in the JSON string but got `%s`",
              jsonObj.get("metadata").toString()));
        }

        // validate the optional field `metadata` (array)
        for (int i = 0; i < jsonArraymetadata.size(); i++) {
          DocumentMetadata.validateJsonElement(jsonArraymetadata.get(i));
        } ;
      }
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!GetDocumentResponse.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'GetDocumentResponse' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<GetDocumentResponse> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(GetDocumentResponse.class));

      return (TypeAdapter<T>) new TypeAdapter<GetDocumentResponse>() {
        @Override
        public void write(JsonWriter out, GetDocumentResponse value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public GetDocumentResponse read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of GetDocumentResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetDocumentResponse
   * @throws IOException if the JSON string is invalid with respect to GetDocumentResponse
   */
  public static GetDocumentResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetDocumentResponse.class);
  }

  /**
   * Convert an instance of GetDocumentResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

