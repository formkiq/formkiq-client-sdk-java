/*
 * FormKiQ API JWT Formkiq API: Document Management Platform API using OAuth(JWT) Authentication You
 * can find out more about FormKiQ at [https://formkiq.com](http://formkiq.com). ## Introduction
 * FormKiQ is an API-first (head-less), battle-tested document management API. The FormKiQ API
 * provides all the API endpoints to build your Perfect Document Management Platform. FormKiQ API
 * was built on top of [OpenAPI specification](https://www.openapis.org), so it is easy to use the
 * API spec file with any application that supports the OpenAPI specification. Open API OAuth
 * Specification -
 * https://raw.githubusercontent.com/formkiq/formkiq-core/master/docs/openapi/openapi-jwt.yaml Open
 * API IAM Specification -
 * https://raw.githubusercontent.com/formkiq/formkiq-core/master/docs/openapi/openapi-iam.yaml ##
 * Authentication FormKiQ offers three forms of authentication: - OAuth(JWT) - AWS IAM - API Key
 *
 * The version of the OpenAPI document: 1.17.1 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import com.formkiq.client.model.ChecksumType;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.formkiq.client.invoker.JSON;

/**
 * Document
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2025-05-20T14:44:33.741519-05:00[America/Winnipeg]",
    comments = "Generator version: 7.13.0")
public class Document {
  public static final String SERIALIZED_NAME_SITE_ID = "siteId";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  @javax.annotation.Nullable
  private String siteId;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  @javax.annotation.Nullable
  private String path;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  @javax.annotation.Nullable
  private String width;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  @javax.annotation.Nullable
  private String height;

  public static final String SERIALIZED_NAME_DEEP_LINK_PATH = "deepLinkPath";
  @SerializedName(SERIALIZED_NAME_DEEP_LINK_PATH)
  @javax.annotation.Nullable
  private String deepLinkPath;

  public static final String SERIALIZED_NAME_INSERTED_DATE = "insertedDate";
  @SerializedName(SERIALIZED_NAME_INSERTED_DATE)
  @javax.annotation.Nullable
  private String insertedDate;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_DATE = "lastModifiedDate";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_DATE)
  @javax.annotation.Nullable
  private String lastModifiedDate;

  public static final String SERIALIZED_NAME_CHECKSUM = "checksum";
  @SerializedName(SERIALIZED_NAME_CHECKSUM)
  @javax.annotation.Nullable
  private String checksum;

  public static final String SERIALIZED_NAME_CHECKSUM_TYPE = "checksumType";
  @SerializedName(SERIALIZED_NAME_CHECKSUM_TYPE)
  @javax.annotation.Nullable
  private ChecksumType checksumType;

  public static final String SERIALIZED_NAME_DOCUMENT_ID = "documentId";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_ID)
  @javax.annotation.Nullable
  private String documentId;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "contentType";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  @javax.annotation.Nullable
  private String contentType;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  @javax.annotation.Nullable
  private String userId;

  public static final String SERIALIZED_NAME_CONTENT_LENGTH = "contentLength";
  @SerializedName(SERIALIZED_NAME_CONTENT_LENGTH)
  @javax.annotation.Nullable
  private Integer contentLength;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  @javax.annotation.Nullable
  private String version;

  public static final String SERIALIZED_NAME_VERSION_KEY = "versionKey";
  @SerializedName(SERIALIZED_NAME_VERSION_KEY)
  @javax.annotation.Nullable
  private String versionKey;

  public static final String SERIALIZED_NAME_S3VERSION = "s3version";
  @SerializedName(SERIALIZED_NAME_S3VERSION)
  @javax.annotation.Nullable
  private String s3version;

  public static final String SERIALIZED_NAME_BELONGS_TO_DOCUMENT_ID = "belongsToDocumentId";
  @SerializedName(SERIALIZED_NAME_BELONGS_TO_DOCUMENT_ID)
  @javax.annotation.Nullable
  private String belongsToDocumentId;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  @javax.annotation.Nullable
  private List<DocumentMetadata> metadata = new ArrayList<>();

  public Document() {}

  public Document siteId(@javax.annotation.Nullable String siteId) {
    this.siteId = siteId;
    return this;
  }

  /**
   * Site Identifier
   * 
   * @return siteId
   */
  @javax.annotation.Nullable
  public String getSiteId() {
    return siteId;
  }

  public void setSiteId(@javax.annotation.Nullable String siteId) {
    this.siteId = siteId;
  }


  public Document path(@javax.annotation.Nullable String path) {
    this.path = path;
    return this;
  }

  /**
   * Path or Name of document
   * 
   * @return path
   */
  @javax.annotation.Nullable
  public String getPath() {
    return path;
  }

  public void setPath(@javax.annotation.Nullable String path) {
    this.path = path;
  }


  public Document width(@javax.annotation.Nullable String width) {
    this.width = width;
    return this;
  }

  /**
   * Document Content Width property
   * 
   * @return width
   */
  @javax.annotation.Nullable
  public String getWidth() {
    return width;
  }

  public void setWidth(@javax.annotation.Nullable String width) {
    this.width = width;
  }


  public Document height(@javax.annotation.Nullable String height) {
    this.height = height;
    return this;
  }

  /**
   * Document Content Height property
   * 
   * @return height
   */
  @javax.annotation.Nullable
  public String getHeight() {
    return height;
  }

  public void setHeight(@javax.annotation.Nullable String height) {
    this.height = height;
  }


  public Document deepLinkPath(@javax.annotation.Nullable String deepLinkPath) {
    this.deepLinkPath = deepLinkPath;
    return this;
  }

  /**
   * Path or Name of deep link
   * 
   * @return deepLinkPath
   */
  @javax.annotation.Nullable
  public String getDeepLinkPath() {
    return deepLinkPath;
  }

  public void setDeepLinkPath(@javax.annotation.Nullable String deepLinkPath) {
    this.deepLinkPath = deepLinkPath;
  }


  public Document insertedDate(@javax.annotation.Nullable String insertedDate) {
    this.insertedDate = insertedDate;
    return this;
  }

  /**
   * Inserted Timestamp
   * 
   * @return insertedDate
   */
  @javax.annotation.Nullable
  public String getInsertedDate() {
    return insertedDate;
  }

  public void setInsertedDate(@javax.annotation.Nullable String insertedDate) {
    this.insertedDate = insertedDate;
  }


  public Document lastModifiedDate(@javax.annotation.Nullable String lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

  /**
   * Last Modified Timestamp
   * 
   * @return lastModifiedDate
   */
  @javax.annotation.Nullable
  public String getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(@javax.annotation.Nullable String lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }


  public Document checksum(@javax.annotation.Nullable String checksum) {
    this.checksum = checksum;
    return this;
  }

  /**
   * Document checksum, changes when document file changes
   * 
   * @return checksum
   */
  @javax.annotation.Nullable
  public String getChecksum() {
    return checksum;
  }

  public void setChecksum(@javax.annotation.Nullable String checksum) {
    this.checksum = checksum;
  }


  public Document checksumType(@javax.annotation.Nullable ChecksumType checksumType) {
    this.checksumType = checksumType;
    return this;
  }

  /**
   * Get checksumType
   * 
   * @return checksumType
   */
  @javax.annotation.Nullable
  public ChecksumType getChecksumType() {
    return checksumType;
  }

  public void setChecksumType(@javax.annotation.Nullable ChecksumType checksumType) {
    this.checksumType = checksumType;
  }


  public Document documentId(@javax.annotation.Nullable String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Document Identifier
   * 
   * @return documentId
   */
  @javax.annotation.Nullable
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(@javax.annotation.Nullable String documentId) {
    this.documentId = documentId;
  }


  public Document contentType(@javax.annotation.Nullable String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Document Content-Type
   * 
   * @return contentType
   */
  @javax.annotation.Nullable
  public String getContentType() {
    return contentType;
  }

  public void setContentType(@javax.annotation.Nullable String contentType) {
    this.contentType = contentType;
  }


  public Document userId(@javax.annotation.Nullable String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * User who added document
   * 
   * @return userId
   */
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }

  public void setUserId(@javax.annotation.Nullable String userId) {
    this.userId = userId;
  }


  public Document contentLength(@javax.annotation.Nullable Integer contentLength) {
    this.contentLength = contentLength;
    return this;
  }

  /**
   * Document size
   * 
   * @return contentLength
   */
  @javax.annotation.Nullable
  public Integer getContentLength() {
    return contentLength;
  }

  public void setContentLength(@javax.annotation.Nullable Integer contentLength) {
    this.contentLength = contentLength;
  }


  public Document version(@javax.annotation.Nullable String version) {
    this.version = version;
    return this;
  }

  /**
   * Document version
   * 
   * @return version
   */
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(@javax.annotation.Nullable String version) {
    this.version = version;
  }


  public Document versionKey(@javax.annotation.Nullable String versionKey) {
    this.versionKey = versionKey;
    return this;
  }

  /**
   * Document Version Identifier
   * 
   * @return versionKey
   */
  @javax.annotation.Nullable
  public String getVersionKey() {
    return versionKey;
  }

  public void setVersionKey(@javax.annotation.Nullable String versionKey) {
    this.versionKey = versionKey;
  }


  public Document s3version(@javax.annotation.Nullable String s3version) {
    this.s3version = s3version;
    return this;
  }

  /**
   * Document storage version
   * 
   * @return s3version
   */
  @javax.annotation.Nullable
  public String getS3version() {
    return s3version;
  }

  public void setS3version(@javax.annotation.Nullable String s3version) {
    this.s3version = s3version;
  }


  public Document belongsToDocumentId(@javax.annotation.Nullable String belongsToDocumentId) {
    this.belongsToDocumentId = belongsToDocumentId;
    return this;
  }

  /**
   * Parent Document Identifier
   * 
   * @return belongsToDocumentId
   */
  @javax.annotation.Nullable
  public String getBelongsToDocumentId() {
    return belongsToDocumentId;
  }

  public void setBelongsToDocumentId(@javax.annotation.Nullable String belongsToDocumentId) {
    this.belongsToDocumentId = belongsToDocumentId;
  }


  public Document metadata(@javax.annotation.Nullable List<DocumentMetadata> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Document addMetadataItem(DocumentMetadata metadataItem) {
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
   */
  @javax.annotation.Nullable
  public List<DocumentMetadata> getMetadata() {
    return metadata;
  }

  public void setMetadata(@javax.annotation.Nullable List<DocumentMetadata> metadata) {
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
    Document document = (Document) o;
    return Objects.equals(this.siteId, document.siteId) && Objects.equals(this.path, document.path)
        && Objects.equals(this.width, document.width)
        && Objects.equals(this.height, document.height)
        && Objects.equals(this.deepLinkPath, document.deepLinkPath)
        && Objects.equals(this.insertedDate, document.insertedDate)
        && Objects.equals(this.lastModifiedDate, document.lastModifiedDate)
        && Objects.equals(this.checksum, document.checksum)
        && Objects.equals(this.checksumType, document.checksumType)
        && Objects.equals(this.documentId, document.documentId)
        && Objects.equals(this.contentType, document.contentType)
        && Objects.equals(this.userId, document.userId)
        && Objects.equals(this.contentLength, document.contentLength)
        && Objects.equals(this.version, document.version)
        && Objects.equals(this.versionKey, document.versionKey)
        && Objects.equals(this.s3version, document.s3version)
        && Objects.equals(this.belongsToDocumentId, document.belongsToDocumentId)
        && Objects.equals(this.metadata, document.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siteId, path, width, height, deepLinkPath, insertedDate, lastModifiedDate,
        checksum, checksumType, documentId, contentType, userId, contentLength, version, versionKey,
        s3version, belongsToDocumentId, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    deepLinkPath: ").append(toIndentedString(deepLinkPath)).append("\n");
    sb.append("    insertedDate: ").append(toIndentedString(insertedDate)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    checksumType: ").append(toIndentedString(checksumType)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionKey: ").append(toIndentedString(versionKey)).append("\n");
    sb.append("    s3version: ").append(toIndentedString(s3version)).append("\n");
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
    openapiFields.add("width");
    openapiFields.add("height");
    openapiFields.add("deepLinkPath");
    openapiFields.add("insertedDate");
    openapiFields.add("lastModifiedDate");
    openapiFields.add("checksum");
    openapiFields.add("checksumType");
    openapiFields.add("documentId");
    openapiFields.add("contentType");
    openapiFields.add("userId");
    openapiFields.add("contentLength");
    openapiFields.add("version");
    openapiFields.add("versionKey");
    openapiFields.add("s3version");
    openapiFields.add("belongsToDocumentId");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Document
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!Document.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is
                                                       // null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in Document is not found in the empty JSON string",
            Document.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!Document.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `Document` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
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
    if ((jsonObj.get("width") != null && !jsonObj.get("width").isJsonNull())
        && !jsonObj.get("width").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `width` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("width").toString()));
    }
    if ((jsonObj.get("height") != null && !jsonObj.get("height").isJsonNull())
        && !jsonObj.get("height").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `height` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("height").toString()));
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
    // validate the optional field `checksumType`
    if (jsonObj.get("checksumType") != null && !jsonObj.get("checksumType").isJsonNull()) {
      ChecksumType.validateJsonElement(jsonObj.get("checksumType"));
    }
    if ((jsonObj.get("documentId") != null && !jsonObj.get("documentId").isJsonNull())
        && !jsonObj.get("documentId").isJsonPrimitive()) {
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
    if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull())
        && !jsonObj.get("version").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `version` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("version").toString()));
    }
    if ((jsonObj.get("versionKey") != null && !jsonObj.get("versionKey").isJsonNull())
        && !jsonObj.get("versionKey").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `versionKey` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("versionKey").toString()));
    }
    if ((jsonObj.get("s3version") != null && !jsonObj.get("s3version").isJsonNull())
        && !jsonObj.get("s3version").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `s3version` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("s3version").toString()));
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
      if (!Document.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'Document' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<Document> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(Document.class));

      return (TypeAdapter<T>) new TypeAdapter<Document>() {
        @Override
        public void write(JsonWriter out, Document value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public Document read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of Document given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Document
   * @throws IOException if the JSON string is invalid with respect to Document
   */
  public static Document fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Document.class);
  }

  /**
   * Convert an instance of Document to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

