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
 * DocumentSearchItemMeta
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-22T22:50:57.759130-05:00[America/Winnipeg]")
public class DocumentSearchItemMeta {
  public static final String SERIALIZED_NAME_FOLDER = "folder";
  @SerializedName(SERIALIZED_NAME_FOLDER)
  private String folder;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

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
      public void write(final JsonWriter jsonWriter, final IndexTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IndexTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IndexTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INDEX_TYPE = "indexType";
  @SerializedName(SERIALIZED_NAME_INDEX_TYPE)
  private IndexTypeEnum indexType;

  public static final String SERIALIZED_NAME_INDEX_FILTER_BEGINS_WITH = "indexFilterBeginsWith";
  @SerializedName(SERIALIZED_NAME_INDEX_FILTER_BEGINS_WITH)
  private String indexFilterBeginsWith;

  public DocumentSearchItemMeta() {
  }

  public DocumentSearchItemMeta folder(String folder) {
    
    this.folder = folder;
    return this;
  }

   /**
   * Searches for a folder
   * @return folder
  **/
  @javax.annotation.Nullable
  public String getFolder() {
    return folder;
  }


  public void setFolder(String folder) {
    this.folder = folder;
  }


  public DocumentSearchItemMeta path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Searches for a Path of document
   * @return path
  **/
  @javax.annotation.Nullable
  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public DocumentSearchItemMeta indexType(IndexTypeEnum indexType) {
    
    this.indexType = indexType;
    return this;
  }

   /**
   * Searches in an index
   * @return indexType
  **/
  @javax.annotation.Nullable
  public IndexTypeEnum getIndexType() {
    return indexType;
  }


  public void setIndexType(IndexTypeEnum indexType) {
    this.indexType = indexType;
  }


  public DocumentSearchItemMeta indexFilterBeginsWith(String indexFilterBeginsWith) {
    
    this.indexFilterBeginsWith = indexFilterBeginsWith;
    return this;
  }

   /**
   * Returns index records that begins with a particular substring
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
    DocumentSearchItemMeta documentSearchItemMeta = (DocumentSearchItemMeta) o;
    return Objects.equals(this.folder, documentSearchItemMeta.folder) &&
        Objects.equals(this.path, documentSearchItemMeta.path) &&
        Objects.equals(this.indexType, documentSearchItemMeta.indexType) &&
        Objects.equals(this.indexFilterBeginsWith, documentSearchItemMeta.indexFilterBeginsWith);
  }

  @Override
  public int hashCode() {
    return Objects.hash(folder, path, indexType, indexFilterBeginsWith);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentSearchItemMeta {\n");
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    indexType: ").append(toIndentedString(indexType)).append("\n");
    sb.append("    indexFilterBeginsWith: ").append(toIndentedString(indexFilterBeginsWith)).append("\n");
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
    openapiFields.add("folder");
    openapiFields.add("path");
    openapiFields.add("indexType");
    openapiFields.add("indexFilterBeginsWith");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DocumentSearchItemMeta
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DocumentSearchItemMeta.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentSearchItemMeta is not found in the empty JSON string", DocumentSearchItemMeta.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DocumentSearchItemMeta.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DocumentSearchItemMeta` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("folder") != null && !jsonObj.get("folder").isJsonNull()) && !jsonObj.get("folder").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `folder` to be a primitive type in the JSON string but got `%s`", jsonObj.get("folder").toString()));
      }
      if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull()) && !jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      if ((jsonObj.get("indexType") != null && !jsonObj.get("indexType").isJsonNull()) && !jsonObj.get("indexType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `indexType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("indexType").toString()));
      }
      if ((jsonObj.get("indexFilterBeginsWith") != null && !jsonObj.get("indexFilterBeginsWith").isJsonNull()) && !jsonObj.get("indexFilterBeginsWith").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `indexFilterBeginsWith` to be a primitive type in the JSON string but got `%s`", jsonObj.get("indexFilterBeginsWith").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentSearchItemMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentSearchItemMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentSearchItemMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentSearchItemMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentSearchItemMeta>() {
           @Override
           public void write(JsonWriter out, DocumentSearchItemMeta value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentSearchItemMeta read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DocumentSearchItemMeta given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentSearchItemMeta
  * @throws IOException if the JSON string is invalid with respect to DocumentSearchItemMeta
  */
  public static DocumentSearchItemMeta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentSearchItemMeta.class);
  }

 /**
  * Convert an instance of DocumentSearchItemMeta to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

