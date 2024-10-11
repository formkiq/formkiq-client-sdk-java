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
 * The version of the OpenAPI document: 1.16.0 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import com.formkiq.client.model.ChecksumType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
 * DocumentVersion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-10-10T10:01:40.041013-05:00[America/Winnipeg]",
    comments = "Generator version: 7.9.0")
public class DocumentVersion {
  public static final String SERIALIZED_NAME_INSERTED_DATE = "insertedDate";
  @SerializedName(SERIALIZED_NAME_INSERTED_DATE)
  private String insertedDate;

  public static final String SERIALIZED_NAME_CHECKSUM = "checksum";
  @SerializedName(SERIALIZED_NAME_CHECKSUM)
  private String checksum;

  public static final String SERIALIZED_NAME_CHECKSUM_TYPE = "checksumType";
  @SerializedName(SERIALIZED_NAME_CHECKSUM_TYPE)
  private ChecksumType checksumType;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "contentType";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_CONTENT_LENGTH = "contentLength";
  @SerializedName(SERIALIZED_NAME_CONTENT_LENGTH)
  private Integer contentLength;

  public static final String SERIALIZED_NAME_VERSION_KEY = "versionKey";
  @SerializedName(SERIALIZED_NAME_VERSION_KEY)
  private String versionKey;

  public static final String SERIALIZED_NAME_S3VERSION = "s3version";
  @SerializedName(SERIALIZED_NAME_S3VERSION)
  private String s3version;

  public DocumentVersion() {}

  public DocumentVersion insertedDate(String insertedDate) {
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

  public void setInsertedDate(String insertedDate) {
    this.insertedDate = insertedDate;
  }


  public DocumentVersion checksum(String checksum) {
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

  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }


  public DocumentVersion checksumType(ChecksumType checksumType) {
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

  public void setChecksumType(ChecksumType checksumType) {
    this.checksumType = checksumType;
  }


  public DocumentVersion contentType(String contentType) {
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

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public DocumentVersion userId(String userId) {
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

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public DocumentVersion contentLength(Integer contentLength) {
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

  public void setContentLength(Integer contentLength) {
    this.contentLength = contentLength;
  }


  public DocumentVersion versionKey(String versionKey) {
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

  public void setVersionKey(String versionKey) {
    this.versionKey = versionKey;
  }


  public DocumentVersion s3version(String s3version) {
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

  public void setS3version(String s3version) {
    this.s3version = s3version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentVersion documentVersion = (DocumentVersion) o;
    return Objects.equals(this.insertedDate, documentVersion.insertedDate)
        && Objects.equals(this.checksum, documentVersion.checksum)
        && Objects.equals(this.checksumType, documentVersion.checksumType)
        && Objects.equals(this.contentType, documentVersion.contentType)
        && Objects.equals(this.userId, documentVersion.userId)
        && Objects.equals(this.contentLength, documentVersion.contentLength)
        && Objects.equals(this.versionKey, documentVersion.versionKey)
        && Objects.equals(this.s3version, documentVersion.s3version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insertedDate, checksum, checksumType, contentType, userId, contentLength,
        versionKey, s3version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentVersion {\n");
    sb.append("    insertedDate: ").append(toIndentedString(insertedDate)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    checksumType: ").append(toIndentedString(checksumType)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
    sb.append("    versionKey: ").append(toIndentedString(versionKey)).append("\n");
    sb.append("    s3version: ").append(toIndentedString(s3version)).append("\n");
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
    openapiFields.add("insertedDate");
    openapiFields.add("checksum");
    openapiFields.add("checksumType");
    openapiFields.add("contentType");
    openapiFields.add("userId");
    openapiFields.add("contentLength");
    openapiFields.add("versionKey");
    openapiFields.add("s3version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocumentVersion
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!DocumentVersion.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                              // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in DocumentVersion is not found in the empty JSON string",
            DocumentVersion.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!DocumentVersion.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `DocumentVersion` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("insertedDate") != null && !jsonObj.get("insertedDate").isJsonNull())
        && !jsonObj.get("insertedDate").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `insertedDate` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("insertedDate").toString()));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!DocumentVersion.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'DocumentVersion' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<DocumentVersion> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(DocumentVersion.class));

      return (TypeAdapter<T>) new TypeAdapter<DocumentVersion>() {
        @Override
        public void write(JsonWriter out, DocumentVersion value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public DocumentVersion read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of DocumentVersion given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocumentVersion
   * @throws IOException if the JSON string is invalid with respect to DocumentVersion
   */
  public static DocumentVersion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentVersion.class);
  }

  /**
   * Convert an instance of DocumentVersion to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

