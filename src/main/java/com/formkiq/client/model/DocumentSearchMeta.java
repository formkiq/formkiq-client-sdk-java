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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.formkiq.client.invoker.JSON;

/**
 * DocumentSearchMeta
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-04-12T19:05:00.461233-05:00[America/Winnipeg]",
    comments = "Generator version: 7.4.0")
public class DocumentSearchMeta {
  public static final String SERIALIZED_NAME_FOLDER = "folder";
  @SerializedName(SERIALIZED_NAME_FOLDER)
  private String folder;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_EQ = "eq";
  @SerializedName(SERIALIZED_NAME_EQ)
  private String eq;

  /**
   * Searches in an index
   */
  @JsonAdapter(IndexTypeEnum.Adapter.class)
  public enum IndexTypeEnum {
    FOLDER("folder");

    private String value;

    IndexTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IndexTypeEnum fromValue(String value) {
      for (IndexTypeEnum b : IndexTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IndexTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IndexTypeEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IndexTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return IndexTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      IndexTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_INDEX_TYPE = "indexType";
  @SerializedName(SERIALIZED_NAME_INDEX_TYPE)
  private IndexTypeEnum indexType;

  public static final String SERIALIZED_NAME_INDEX_FILTER_BEGINS_WITH = "indexFilterBeginsWith";
  @SerializedName(SERIALIZED_NAME_INDEX_FILTER_BEGINS_WITH)
  private String indexFilterBeginsWith;

  public DocumentSearchMeta() {}

  public DocumentSearchMeta folder(String folder) {
    this.folder = folder;
    return this;
  }

  /**
   * Searches for a folder
   * 
   * @return folder
   **/
  @javax.annotation.Nullable
  public String getFolder() {
    return folder;
  }

  public void setFolder(String folder) {
    this.folder = folder;
  }


  public DocumentSearchMeta path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Searches for a Path of document
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


  public DocumentSearchMeta eq(String eq) {
    this.eq = eq;
    return this;
  }

  /**
   * Searches for strings that eq
   * 
   * @return eq
   **/
  @javax.annotation.Nullable
  public String getEq() {
    return eq;
  }

  public void setEq(String eq) {
    this.eq = eq;
  }


  public DocumentSearchMeta indexType(IndexTypeEnum indexType) {
    this.indexType = indexType;
    return this;
  }

  /**
   * Searches in an index
   * 
   * @return indexType
   **/
  @javax.annotation.Nullable
  public IndexTypeEnum getIndexType() {
    return indexType;
  }

  public void setIndexType(IndexTypeEnum indexType) {
    this.indexType = indexType;
  }


  public DocumentSearchMeta indexFilterBeginsWith(String indexFilterBeginsWith) {
    this.indexFilterBeginsWith = indexFilterBeginsWith;
    return this;
  }

  /**
   * Returns index records that begins with a particular substring
   * 
   * @return indexFilterBeginsWith
   **/
  @javax.annotation.Nullable
  public String getIndexFilterBeginsWith() {
    return indexFilterBeginsWith;
  }

  public void setIndexFilterBeginsWith(String indexFilterBeginsWith) {
    this.indexFilterBeginsWith = indexFilterBeginsWith;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentSearchMeta documentSearchMeta = (DocumentSearchMeta) o;
    return Objects.equals(this.folder, documentSearchMeta.folder)
        && Objects.equals(this.path, documentSearchMeta.path)
        && Objects.equals(this.eq, documentSearchMeta.eq)
        && Objects.equals(this.indexType, documentSearchMeta.indexType)
        && Objects.equals(this.indexFilterBeginsWith, documentSearchMeta.indexFilterBeginsWith);
  }

  @Override
  public int hashCode() {
    return Objects.hash(folder, path, eq, indexType, indexFilterBeginsWith);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentSearchMeta {\n");
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    eq: ").append(toIndentedString(eq)).append("\n");
    sb.append("    indexType: ").append(toIndentedString(indexType)).append("\n");
    sb.append("    indexFilterBeginsWith: ").append(toIndentedString(indexFilterBeginsWith))
        .append("\n");
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
    openapiFields.add("folder");
    openapiFields.add("path");
    openapiFields.add("eq");
    openapiFields.add("indexType");
    openapiFields.add("indexFilterBeginsWith");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocumentSearchMeta
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!DocumentSearchMeta.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                 // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in DocumentSearchMeta is not found in the empty JSON string",
            DocumentSearchMeta.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!DocumentSearchMeta.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `DocumentSearchMeta` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("folder") != null && !jsonObj.get("folder").isJsonNull())
        && !jsonObj.get("folder").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `folder` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("folder").toString()));
    }
    if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull())
        && !jsonObj.get("path").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `path` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("path").toString()));
    }
    if ((jsonObj.get("eq") != null && !jsonObj.get("eq").isJsonNull())
        && !jsonObj.get("eq").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `eq` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("eq").toString()));
    }
    if ((jsonObj.get("indexType") != null && !jsonObj.get("indexType").isJsonNull())
        && !jsonObj.get("indexType").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `indexType` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("indexType").toString()));
    }
    // validate the optional field `indexType`
    if (jsonObj.get("indexType") != null && !jsonObj.get("indexType").isJsonNull()) {
      IndexTypeEnum.validateJsonElement(jsonObj.get("indexType"));
    }
    if ((jsonObj.get("indexFilterBeginsWith") != null
        && !jsonObj.get("indexFilterBeginsWith").isJsonNull())
        && !jsonObj.get("indexFilterBeginsWith").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `indexFilterBeginsWith` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("indexFilterBeginsWith").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!DocumentSearchMeta.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'DocumentSearchMeta' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<DocumentSearchMeta> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(DocumentSearchMeta.class));

      return (TypeAdapter<T>) new TypeAdapter<DocumentSearchMeta>() {
        @Override
        public void write(JsonWriter out, DocumentSearchMeta value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public DocumentSearchMeta read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of DocumentSearchMeta given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocumentSearchMeta
   * @throws IOException if the JSON string is invalid with respect to DocumentSearchMeta
   */
  public static DocumentSearchMeta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentSearchMeta.class);
  }

  /**
   * Convert an instance of DocumentSearchMeta to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

