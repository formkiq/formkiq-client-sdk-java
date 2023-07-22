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
 * DocumentItemResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-21T22:37:18.641266-05:00[America/Winnipeg]")
public class DocumentItemResult {
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

  public DocumentItemResult() {
  }

  public DocumentItemResult siteId(String siteId) {
    
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


  public DocumentItemResult path(String path) {
    
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


  public DocumentItemResult insertedDate(String insertedDate) {
    
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


  public DocumentItemResult lastModifiedDate(String lastModifiedDate) {
    
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


  public DocumentItemResult checksum(String checksum) {
    
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


  public DocumentItemResult documentId(String documentId) {
    
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


  public DocumentItemResult contentType(String contentType) {
    
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


  public DocumentItemResult userId(String userId) {
    
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


  public DocumentItemResult contentLength(Integer contentLength) {
    
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


  public DocumentItemResult versionId(String versionId) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentItemResult documentItemResult = (DocumentItemResult) o;
    return Objects.equals(this.siteId, documentItemResult.siteId) &&
        Objects.equals(this.path, documentItemResult.path) &&
        Objects.equals(this.insertedDate, documentItemResult.insertedDate) &&
        Objects.equals(this.lastModifiedDate, documentItemResult.lastModifiedDate) &&
        Objects.equals(this.checksum, documentItemResult.checksum) &&
        Objects.equals(this.documentId, documentItemResult.documentId) &&
        Objects.equals(this.contentType, documentItemResult.contentType) &&
        Objects.equals(this.userId, documentItemResult.userId) &&
        Objects.equals(this.contentLength, documentItemResult.contentLength) &&
        Objects.equals(this.versionId, documentItemResult.versionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siteId, path, insertedDate, lastModifiedDate, checksum, documentId, contentType, userId, contentLength, versionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentItemResult {\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    insertedDate: ").append(toIndentedString(insertedDate)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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
    openapiFields.add("checksum");
    openapiFields.add("documentId");
    openapiFields.add("contentType");
    openapiFields.add("userId");
    openapiFields.add("contentLength");
    openapiFields.add("versionId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DocumentItemResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DocumentItemResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentItemResult is not found in the empty JSON string", DocumentItemResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DocumentItemResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DocumentItemResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentItemResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentItemResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentItemResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentItemResult.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentItemResult>() {
           @Override
           public void write(JsonWriter out, DocumentItemResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentItemResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DocumentItemResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentItemResult
  * @throws IOException if the JSON string is invalid with respect to DocumentItemResult
  */
  public static DocumentItemResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentItemResult.class);
  }

 /**
  * Convert an instance of DocumentItemResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

