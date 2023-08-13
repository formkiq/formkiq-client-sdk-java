/*
 * FormKiQ HTTP API
 * Formkiq API: Document Management Platform API using JWT Authentication
 *
 * The version of the OpenAPI document: 1.12.0
 * Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.formkiq.client.model.DocumentSearchMatchTag;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
import java.util.Map.Entry;
import java.util.Set;

import com.formkiq.client.invoker.JSON;

/**
 * SearchResultDocument
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-13T16:50:34.870897-05:00[America/Winnipeg]")
public class SearchResultDocument {
  public static final String SERIALIZED_NAME_SITE_ID = "siteId";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private String siteId;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_INSERTED_DATE = "insertedDate";
  @SerializedName(SERIALIZED_NAME_INSERTED_DATE)
  private String insertedDate;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_DATE = "lastModifiedDate";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_DATE)
  private String lastModifiedDate;

  public static final String SERIALIZED_NAME_FOLDER = "folder";
  @SerializedName(SERIALIZED_NAME_FOLDER)
  private Boolean folder;

  public static final String SERIALIZED_NAME_INDEX_KEY = "indexKey";
  @SerializedName(SERIALIZED_NAME_INDEX_KEY)
  private String indexKey;

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

  public static final String SERIALIZED_NAME_BELONGS_TO_DOCUMENT_ID = "belongsToDocumentId";
  @SerializedName(SERIALIZED_NAME_BELONGS_TO_DOCUMENT_ID)
  private String belongsToDocumentId;

  public static final String SERIALIZED_NAME_MATCHED_TAG = "matchedTag";
  @SerializedName(SERIALIZED_NAME_MATCHED_TAG)
  private DocumentSearchMatchTag matchedTag;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Object tags;

  public SearchResultDocument() {
  }

  public SearchResultDocument siteId(String siteId) {
    
    this.siteId = siteId;
    return this;
  }

   /**
   * Site Identifier
   * @return siteId
  **/
  @javax.annotation.Nullable
  public String getSiteId() {
    return siteId;
  }


  public void setSiteId(String siteId) {
    this.siteId = siteId;
  }


  public SearchResultDocument path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Path or Name of document
   * @return path
  **/
  @javax.annotation.Nullable
  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public SearchResultDocument insertedDate(String insertedDate) {
    
    this.insertedDate = insertedDate;
    return this;
  }

   /**
   * Inserted Timestamp
   * @return insertedDate
  **/
  @javax.annotation.Nullable
  public String getInsertedDate() {
    return insertedDate;
  }


  public void setInsertedDate(String insertedDate) {
    this.insertedDate = insertedDate;
  }


  public SearchResultDocument lastModifiedDate(String lastModifiedDate) {
    
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * Last Modified Timestamp
   * @return lastModifiedDate
  **/
  @javax.annotation.Nullable
  public String getLastModifiedDate() {
    return lastModifiedDate;
  }


  public void setLastModifiedDate(String lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }


  public SearchResultDocument folder(Boolean folder) {
    
    this.folder = folder;
    return this;
  }

   /**
   * Is Result a Document Folder
   * @return folder
  **/
  @javax.annotation.Nullable
  public Boolean getFolder() {
    return folder;
  }


  public void setFolder(Boolean folder) {
    this.folder = folder;
  }


  public SearchResultDocument indexKey(String indexKey) {
    
    this.indexKey = indexKey;
    return this;
  }

   /**
   * populated if search result are from an index
   * @return indexKey
  **/
  @javax.annotation.Nullable
  public String getIndexKey() {
    return indexKey;
  }


  public void setIndexKey(String indexKey) {
    this.indexKey = indexKey;
  }


  public SearchResultDocument checksum(String checksum) {
    
    this.checksum = checksum;
    return this;
  }

   /**
   * Document checksum, changes when document file changes
   * @return checksum
  **/
  @javax.annotation.Nullable
  public String getChecksum() {
    return checksum;
  }


  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }


  public SearchResultDocument documentId(String documentId) {
    
    this.documentId = documentId;
    return this;
  }

   /**
   * Document Identifier
   * @return documentId
  **/
  @javax.annotation.Nullable
  public String getDocumentId() {
    return documentId;
  }


  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }


  public SearchResultDocument contentType(String contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * Document Content-Type
   * @return contentType
  **/
  @javax.annotation.Nullable
  public String getContentType() {
    return contentType;
  }


  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public SearchResultDocument userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * User who added document
   * @return userId
  **/
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public SearchResultDocument contentLength(Integer contentLength) {
    
    this.contentLength = contentLength;
    return this;
  }

   /**
   * Document size
   * @return contentLength
  **/
  @javax.annotation.Nullable
  public Integer getContentLength() {
    return contentLength;
  }


  public void setContentLength(Integer contentLength) {
    this.contentLength = contentLength;
  }


  public SearchResultDocument versionId(String versionId) {
    
    this.versionId = versionId;
    return this;
  }

   /**
   * Document version
   * @return versionId
  **/
  @javax.annotation.Nullable
  public String getVersionId() {
    return versionId;
  }


  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }


  public SearchResultDocument belongsToDocumentId(String belongsToDocumentId) {
    
    this.belongsToDocumentId = belongsToDocumentId;
    return this;
  }

   /**
   * Parent Document Identifier
   * @return belongsToDocumentId
  **/
  @javax.annotation.Nullable
  public String getBelongsToDocumentId() {
    return belongsToDocumentId;
  }


  public void setBelongsToDocumentId(String belongsToDocumentId) {
    this.belongsToDocumentId = belongsToDocumentId;
  }


  public SearchResultDocument matchedTag(DocumentSearchMatchTag matchedTag) {
    
    this.matchedTag = matchedTag;
    return this;
  }

   /**
   * Get matchedTag
   * @return matchedTag
  **/
  @javax.annotation.Nullable
  public DocumentSearchMatchTag getMatchedTag() {
    return matchedTag;
  }


  public void setMatchedTag(DocumentSearchMatchTag matchedTag) {
    this.matchedTag = matchedTag;
  }


  public SearchResultDocument tags(Object tags) {
    
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  public Object getTags() {
    return tags;
  }


  public void setTags(Object tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResultDocument searchResultDocument = (SearchResultDocument) o;
    return Objects.equals(this.siteId, searchResultDocument.siteId) &&
        Objects.equals(this.path, searchResultDocument.path) &&
        Objects.equals(this.insertedDate, searchResultDocument.insertedDate) &&
        Objects.equals(this.lastModifiedDate, searchResultDocument.lastModifiedDate) &&
        Objects.equals(this.folder, searchResultDocument.folder) &&
        Objects.equals(this.indexKey, searchResultDocument.indexKey) &&
        Objects.equals(this.checksum, searchResultDocument.checksum) &&
        Objects.equals(this.documentId, searchResultDocument.documentId) &&
        Objects.equals(this.contentType, searchResultDocument.contentType) &&
        Objects.equals(this.userId, searchResultDocument.userId) &&
        Objects.equals(this.contentLength, searchResultDocument.contentLength) &&
        Objects.equals(this.versionId, searchResultDocument.versionId) &&
        Objects.equals(this.belongsToDocumentId, searchResultDocument.belongsToDocumentId) &&
        Objects.equals(this.matchedTag, searchResultDocument.matchedTag) &&
        Objects.equals(this.tags, searchResultDocument.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siteId, path, insertedDate, lastModifiedDate, folder, indexKey, checksum, documentId, contentType, userId, contentLength, versionId, belongsToDocumentId, matchedTag, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResultDocument {\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    insertedDate: ").append(toIndentedString(insertedDate)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    indexKey: ").append(toIndentedString(indexKey)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
    sb.append("    belongsToDocumentId: ").append(toIndentedString(belongsToDocumentId)).append("\n");
    sb.append("    matchedTag: ").append(toIndentedString(matchedTag)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
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
    openapiFields.add("insertedDate");
    openapiFields.add("lastModifiedDate");
    openapiFields.add("folder");
    openapiFields.add("indexKey");
    openapiFields.add("checksum");
    openapiFields.add("documentId");
    openapiFields.add("contentType");
    openapiFields.add("userId");
    openapiFields.add("contentLength");
    openapiFields.add("versionId");
    openapiFields.add("belongsToDocumentId");
    openapiFields.add("matchedTag");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchResultDocument
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SearchResultDocument.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchResultDocument is not found in the empty JSON string", SearchResultDocument.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SearchResultDocument.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchResultDocument` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("siteId") != null && !jsonObj.get("siteId").isJsonNull()) && !jsonObj.get("siteId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `siteId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("siteId").toString()));
      }
      if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull()) && !jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      if ((jsonObj.get("insertedDate") != null && !jsonObj.get("insertedDate").isJsonNull()) && !jsonObj.get("insertedDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `insertedDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("insertedDate").toString()));
      }
      if ((jsonObj.get("lastModifiedDate") != null && !jsonObj.get("lastModifiedDate").isJsonNull()) && !jsonObj.get("lastModifiedDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastModifiedDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastModifiedDate").toString()));
      }
      if ((jsonObj.get("indexKey") != null && !jsonObj.get("indexKey").isJsonNull()) && !jsonObj.get("indexKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `indexKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("indexKey").toString()));
      }
      if ((jsonObj.get("checksum") != null && !jsonObj.get("checksum").isJsonNull()) && !jsonObj.get("checksum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `checksum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checksum").toString()));
      }
      if ((jsonObj.get("documentId") != null && !jsonObj.get("documentId").isJsonNull()) && !jsonObj.get("documentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentId").toString()));
      }
      if ((jsonObj.get("contentType") != null && !jsonObj.get("contentType").isJsonNull()) && !jsonObj.get("contentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contentType").toString()));
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if ((jsonObj.get("versionId") != null && !jsonObj.get("versionId").isJsonNull()) && !jsonObj.get("versionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `versionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("versionId").toString()));
      }
      if ((jsonObj.get("belongsToDocumentId") != null && !jsonObj.get("belongsToDocumentId").isJsonNull()) && !jsonObj.get("belongsToDocumentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `belongsToDocumentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("belongsToDocumentId").toString()));
      }
      // validate the optional field `matchedTag`
      if (jsonObj.get("matchedTag") != null && !jsonObj.get("matchedTag").isJsonNull()) {
        DocumentSearchMatchTag.validateJsonObject(jsonObj.getAsJsonObject("matchedTag"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchResultDocument.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchResultDocument' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchResultDocument> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchResultDocument.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchResultDocument>() {
           @Override
           public void write(JsonWriter out, SearchResultDocument value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchResultDocument read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchResultDocument given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchResultDocument
  * @throws IOException if the JSON string is invalid with respect to SearchResultDocument
  */
  public static SearchResultDocument fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchResultDocument.class);
  }

 /**
  * Convert an instance of SearchResultDocument to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

