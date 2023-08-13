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
 * OnlyOfficeConfigDocument
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-13T16:50:34.870897-05:00[America/Winnipeg]")
public class OnlyOfficeConfigDocument {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_FILE_TYPE = "fileType";
  @SerializedName(SERIALIZED_NAME_FILE_TYPE)
  private String fileType;

  public OnlyOfficeConfigDocument() {
  }

  public OnlyOfficeConfigDocument url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Defines the absolute URL where the source viewed or edited document is stored
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public OnlyOfficeConfigDocument title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Defines the desired file name for the viewed or edited document
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public OnlyOfficeConfigDocument key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Defines the unique document identifier used by the service to recognize the document
   * @return key
  **/
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public OnlyOfficeConfigDocument fileType(String fileType) {
    
    this.fileType = fileType;
    return this;
  }

   /**
   * Defines the type of the file for the source viewed or edited document
   * @return fileType
  **/
  @javax.annotation.Nullable
  public String getFileType() {
    return fileType;
  }


  public void setFileType(String fileType) {
    this.fileType = fileType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnlyOfficeConfigDocument onlyOfficeConfigDocument = (OnlyOfficeConfigDocument) o;
    return Objects.equals(this.url, onlyOfficeConfigDocument.url) &&
        Objects.equals(this.title, onlyOfficeConfigDocument.title) &&
        Objects.equals(this.key, onlyOfficeConfigDocument.key) &&
        Objects.equals(this.fileType, onlyOfficeConfigDocument.fileType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, title, key, fileType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnlyOfficeConfigDocument {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
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
    openapiFields.add("url");
    openapiFields.add("title");
    openapiFields.add("key");
    openapiFields.add("fileType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OnlyOfficeConfigDocument
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OnlyOfficeConfigDocument.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OnlyOfficeConfigDocument is not found in the empty JSON string", OnlyOfficeConfigDocument.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OnlyOfficeConfigDocument.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OnlyOfficeConfigDocument` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("fileType") != null && !jsonObj.get("fileType").isJsonNull()) && !jsonObj.get("fileType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnlyOfficeConfigDocument.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnlyOfficeConfigDocument' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnlyOfficeConfigDocument> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnlyOfficeConfigDocument.class));

       return (TypeAdapter<T>) new TypeAdapter<OnlyOfficeConfigDocument>() {
           @Override
           public void write(JsonWriter out, OnlyOfficeConfigDocument value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OnlyOfficeConfigDocument read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OnlyOfficeConfigDocument given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OnlyOfficeConfigDocument
  * @throws IOException if the JSON string is invalid with respect to OnlyOfficeConfigDocument
  */
  public static OnlyOfficeConfigDocument fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnlyOfficeConfigDocument.class);
  }

 /**
  * Convert an instance of OnlyOfficeConfigDocument to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

