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
import java.util.ArrayList;
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
import java.util.Map.Entry;
import java.util.Set;

import com.formkiq.client.invoker.JSON;

/**
 * DocumentSearchItemTag
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-22T22:50:57.759130-05:00[America/Winnipeg]")
public class DocumentSearchItemTag {
  public static final String SERIALIZED_NAME_BEGINS_WITH = "beginsWith";
  @SerializedName(SERIALIZED_NAME_BEGINS_WITH)
  private String beginsWith;

  public static final String SERIALIZED_NAME_EQ = "eq";
  @SerializedName(SERIALIZED_NAME_EQ)
  private String eq;

  public static final String SERIALIZED_NAME_EQ_OR = "eqOr";
  @SerializedName(SERIALIZED_NAME_EQ_OR)
  private List<String> eqOr;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public DocumentSearchItemTag() {
  }

  public DocumentSearchItemTag beginsWith(String beginsWith) {
    
    this.beginsWith = beginsWith;
    return this;
  }

   /**
   * Searches for strings that begin with
   * @return beginsWith
  **/
  @javax.annotation.Nullable
  public String getBeginsWith() {
    return beginsWith;
  }


  public void setBeginsWith(String beginsWith) {
    this.beginsWith = beginsWith;
  }


  public DocumentSearchItemTag eq(String eq) {
    
    this.eq = eq;
    return this;
  }

   /**
   * Searches for strings that eq
   * @return eq
  **/
  @javax.annotation.Nullable
  public String getEq() {
    return eq;
  }


  public void setEq(String eq) {
    this.eq = eq;
  }


  public DocumentSearchItemTag eqOr(List<String> eqOr) {
    
    this.eqOr = eqOr;
    return this;
  }

  public DocumentSearchItemTag addEqOrItem(String eqOrItem) {
    if (this.eqOr == null) {
      this.eqOr = new ArrayList<>();
    }
    this.eqOr.add(eqOrItem);
    return this;
  }

   /**
   * Searches for ANY strings that eq
   * @return eqOr
  **/
  @javax.annotation.Nullable
  public List<String> getEqOr() {
    return eqOr;
  }


  public void setEqOr(List<String> eqOr) {
    this.eqOr = eqOr;
  }


  public DocumentSearchItemTag key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Tag key to search
   * @return key
  **/
  @javax.annotation.Nonnull
  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentSearchItemTag documentSearchItemTag = (DocumentSearchItemTag) o;
    return Objects.equals(this.beginsWith, documentSearchItemTag.beginsWith) &&
        Objects.equals(this.eq, documentSearchItemTag.eq) &&
        Objects.equals(this.eqOr, documentSearchItemTag.eqOr) &&
        Objects.equals(this.key, documentSearchItemTag.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginsWith, eq, eqOr, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentSearchItemTag {\n");
    sb.append("    beginsWith: ").append(toIndentedString(beginsWith)).append("\n");
    sb.append("    eq: ").append(toIndentedString(eq)).append("\n");
    sb.append("    eqOr: ").append(toIndentedString(eqOr)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
    openapiFields.add("beginsWith");
    openapiFields.add("eq");
    openapiFields.add("eqOr");
    openapiFields.add("key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("key");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DocumentSearchItemTag
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DocumentSearchItemTag.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentSearchItemTag is not found in the empty JSON string", DocumentSearchItemTag.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DocumentSearchItemTag.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DocumentSearchItemTag` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DocumentSearchItemTag.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("beginsWith") != null && !jsonObj.get("beginsWith").isJsonNull()) && !jsonObj.get("beginsWith").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beginsWith` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beginsWith").toString()));
      }
      if ((jsonObj.get("eq") != null && !jsonObj.get("eq").isJsonNull()) && !jsonObj.get("eq").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eq` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eq").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("eqOr") != null && !jsonObj.get("eqOr").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `eqOr` to be an array in the JSON string but got `%s`", jsonObj.get("eqOr").toString()));
      }
      if (!jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentSearchItemTag.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentSearchItemTag' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentSearchItemTag> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentSearchItemTag.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentSearchItemTag>() {
           @Override
           public void write(JsonWriter out, DocumentSearchItemTag value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentSearchItemTag read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DocumentSearchItemTag given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentSearchItemTag
  * @throws IOException if the JSON string is invalid with respect to DocumentSearchItemTag
  */
  public static DocumentSearchItemTag fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentSearchItemTag.class);
  }

 /**
  * Convert an instance of DocumentSearchItemTag to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

