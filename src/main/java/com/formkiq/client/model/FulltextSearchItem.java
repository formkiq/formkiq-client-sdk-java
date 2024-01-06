/*
 * FormKiQ HTTP API Formkiq API: Document Management Platform API using OAuth(JWT) Authentication
 * You can find out more about FormKiQ at [https://formkiq.com](http://formkiq.com). ## Introduction
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
 * The version of the OpenAPI document: 1.14.0 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
 * FulltextSearchItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-01-05T21:39:11.737413-06:00[America/Winnipeg]")
public class FulltextSearchItem {
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

  public static final String SERIALIZED_NAME_DOCUMENT_ID = "documentId";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_ID)
  private String documentId;

  public static final String SERIALIZED_NAME_CONTENT_LENGTH = "contentLength";
  @SerializedName(SERIALIZED_NAME_CONTENT_LENGTH)
  private Integer contentLength;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, Object> tags = new HashMap<>();

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, Object> metadata = new HashMap<>();

  public static final String SERIALIZED_NAME_ACCESS_ATTRIBUTES = "accessAttributes";
  @SerializedName(SERIALIZED_NAME_ACCESS_ATTRIBUTES)
  private Map<String, Object> accessAttributes = new HashMap<>();

  public FulltextSearchItem() {}

  public FulltextSearchItem siteId(String siteId) {
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


  public FulltextSearchItem path(String path) {
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


  public FulltextSearchItem deepLinkPath(String deepLinkPath) {
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


  public FulltextSearchItem insertedDate(String insertedDate) {
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


  public FulltextSearchItem lastModifiedDate(String lastModifiedDate) {
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


  public FulltextSearchItem documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Document Identifier
   * 
   * @return documentId
   **/
  @javax.annotation.Nullable
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }


  public FulltextSearchItem contentLength(Integer contentLength) {
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


  public FulltextSearchItem createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * User who added document
   * 
   * @return createdBy
   **/
  @javax.annotation.Nullable
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public FulltextSearchItem tags(Map<String, Object> tags) {
    this.tags = tags;
    return this;
  }

  public FulltextSearchItem putTagsItem(String key, Object tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

  /**
   * Get tags
   * 
   * @return tags
   **/
  @javax.annotation.Nullable
  public Map<String, Object> getTags() {
    return tags;
  }

  public void setTags(Map<String, Object> tags) {
    this.tags = tags;
  }


  public FulltextSearchItem metadata(Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public FulltextSearchItem putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * Get metadata
   * 
   * @return metadata
   **/
  @javax.annotation.Nullable
  public Map<String, Object> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }


  public FulltextSearchItem accessAttributes(Map<String, Object> accessAttributes) {
    this.accessAttributes = accessAttributes;
    return this;
  }

  public FulltextSearchItem putAccessAttributesItem(String key, Object accessAttributesItem) {
    if (this.accessAttributes == null) {
      this.accessAttributes = new HashMap<>();
    }
    this.accessAttributes.put(key, accessAttributesItem);
    return this;
  }

  /**
   * Get accessAttributes
   * 
   * @return accessAttributes
   **/
  @javax.annotation.Nullable
  public Map<String, Object> getAccessAttributes() {
    return accessAttributes;
  }

  public void setAccessAttributes(Map<String, Object> accessAttributes) {
    this.accessAttributes = accessAttributes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulltextSearchItem fulltextSearchItem = (FulltextSearchItem) o;
    return Objects.equals(this.siteId, fulltextSearchItem.siteId)
        && Objects.equals(this.path, fulltextSearchItem.path)
        && Objects.equals(this.deepLinkPath, fulltextSearchItem.deepLinkPath)
        && Objects.equals(this.insertedDate, fulltextSearchItem.insertedDate)
        && Objects.equals(this.lastModifiedDate, fulltextSearchItem.lastModifiedDate)
        && Objects.equals(this.documentId, fulltextSearchItem.documentId)
        && Objects.equals(this.contentLength, fulltextSearchItem.contentLength)
        && Objects.equals(this.createdBy, fulltextSearchItem.createdBy)
        && Objects.equals(this.tags, fulltextSearchItem.tags)
        && Objects.equals(this.metadata, fulltextSearchItem.metadata)
        && Objects.equals(this.accessAttributes, fulltextSearchItem.accessAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siteId, path, deepLinkPath, insertedDate, lastModifiedDate, documentId,
        contentLength, createdBy, tags, metadata, accessAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulltextSearchItem {\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    deepLinkPath: ").append(toIndentedString(deepLinkPath)).append("\n");
    sb.append("    insertedDate: ").append(toIndentedString(insertedDate)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    accessAttributes: ").append(toIndentedString(accessAttributes)).append("\n");
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
    openapiFields.add("documentId");
    openapiFields.add("contentLength");
    openapiFields.add("createdBy");
    openapiFields.add("tags");
    openapiFields.add("metadata");
    openapiFields.add("accessAttributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FulltextSearchItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!FulltextSearchItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                 // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in FulltextSearchItem is not found in the empty JSON string",
            FulltextSearchItem.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!FulltextSearchItem.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `FulltextSearchItem` properties. JSON: %s",
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
    if ((jsonObj.get("documentId") != null && !jsonObj.get("documentId").isJsonNull())
        && !jsonObj.get("documentId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `documentId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("documentId").toString()));
    }
    if ((jsonObj.get("createdBy") != null && !jsonObj.get("createdBy").isJsonNull())
        && !jsonObj.get("createdBy").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `createdBy` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("createdBy").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!FulltextSearchItem.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'FulltextSearchItem' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<FulltextSearchItem> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(FulltextSearchItem.class));

      return (TypeAdapter<T>) new TypeAdapter<FulltextSearchItem>() {
        @Override
        public void write(JsonWriter out, FulltextSearchItem value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public FulltextSearchItem read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of FulltextSearchItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FulltextSearchItem
   * @throws IOException if the JSON string is invalid with respect to FulltextSearchItem
   */
  public static FulltextSearchItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FulltextSearchItem.class);
  }

  /**
   * Convert an instance of FulltextSearchItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

