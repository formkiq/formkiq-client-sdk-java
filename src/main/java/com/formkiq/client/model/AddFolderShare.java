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
 * AddFolderShare
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-22T22:50:57.759130-05:00[America/Winnipeg]")
public class AddFolderShare {
  public static final String SERIALIZED_NAME_SHARE_KEY = "shareKey";
  @SerializedName(SERIALIZED_NAME_SHARE_KEY)
  private String shareKey;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public AddFolderShare() {
  }

  public AddFolderShare shareKey(String shareKey) {
    
    this.shareKey = shareKey;
    return this;
  }

   /**
   * Share Key Identifier
   * @return shareKey
  **/
  @javax.annotation.Nullable
  public String getShareKey() {
    return shareKey;
  }


  public void setShareKey(String shareKey) {
    this.shareKey = shareKey;
  }


  public AddFolderShare path(String path) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddFolderShare addFolderShare = (AddFolderShare) o;
    return Objects.equals(this.shareKey, addFolderShare.shareKey) &&
        Objects.equals(this.path, addFolderShare.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shareKey, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddFolderShare {\n");
    sb.append("    shareKey: ").append(toIndentedString(shareKey)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
    openapiFields.add("shareKey");
    openapiFields.add("path");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddFolderShare
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddFolderShare.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddFolderShare is not found in the empty JSON string", AddFolderShare.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AddFolderShare.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddFolderShare` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("shareKey") != null && !jsonObj.get("shareKey").isJsonNull()) && !jsonObj.get("shareKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shareKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shareKey").toString()));
      }
      if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull()) && !jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddFolderShare.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddFolderShare' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddFolderShare> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddFolderShare.class));

       return (TypeAdapter<T>) new TypeAdapter<AddFolderShare>() {
           @Override
           public void write(JsonWriter out, AddFolderShare value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddFolderShare read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddFolderShare given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddFolderShare
  * @throws IOException if the JSON string is invalid with respect to AddFolderShare
  */
  public static AddFolderShare fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddFolderShare.class);
  }

 /**
  * Convert an instance of AddFolderShare to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

