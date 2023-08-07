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
 * TagSchemaOptional
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-06T22:07:40.215317-05:00[America/Winnipeg]")
public class TagSchemaOptional {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_DEFAULT_VALUES = "defaultValues";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUES)
  private List<String> defaultValues;

  public static final String SERIALIZED_NAME_ALLOWED_VALUES = "allowedValues";
  @SerializedName(SERIALIZED_NAME_ALLOWED_VALUES)
  private List<String> allowedValues;

  public TagSchemaOptional() {
  }

  public TagSchemaOptional key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public TagSchemaOptional defaultValues(List<String> defaultValues) {
    
    this.defaultValues = defaultValues;
    return this;
  }

  public TagSchemaOptional addDefaultValuesItem(String defaultValuesItem) {
    if (this.defaultValues == null) {
      this.defaultValues = new ArrayList<>();
    }
    this.defaultValues.add(defaultValuesItem);
    return this;
  }

   /**
   * Default values
   * @return defaultValues
  **/
  @javax.annotation.Nullable
  public List<String> getDefaultValues() {
    return defaultValues;
  }


  public void setDefaultValues(List<String> defaultValues) {
    this.defaultValues = defaultValues;
  }


  public TagSchemaOptional allowedValues(List<String> allowedValues) {
    
    this.allowedValues = allowedValues;
    return this;
  }

  public TagSchemaOptional addAllowedValuesItem(String allowedValuesItem) {
    if (this.allowedValues == null) {
      this.allowedValues = new ArrayList<>();
    }
    this.allowedValues.add(allowedValuesItem);
    return this;
  }

   /**
   * Only valid values
   * @return allowedValues
  **/
  @javax.annotation.Nullable
  public List<String> getAllowedValues() {
    return allowedValues;
  }


  public void setAllowedValues(List<String> allowedValues) {
    this.allowedValues = allowedValues;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagSchemaOptional tagSchemaOptional = (TagSchemaOptional) o;
    return Objects.equals(this.key, tagSchemaOptional.key) &&
        Objects.equals(this.defaultValues, tagSchemaOptional.defaultValues) &&
        Objects.equals(this.allowedValues, tagSchemaOptional.allowedValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, defaultValues, allowedValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagSchemaOptional {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    defaultValues: ").append(toIndentedString(defaultValues)).append("\n");
    sb.append("    allowedValues: ").append(toIndentedString(allowedValues)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("defaultValues");
    openapiFields.add("allowedValues");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TagSchemaOptional
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TagSchemaOptional.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TagSchemaOptional is not found in the empty JSON string", TagSchemaOptional.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TagSchemaOptional.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TagSchemaOptional` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("defaultValues") != null && !jsonObj.get("defaultValues").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultValues` to be an array in the JSON string but got `%s`", jsonObj.get("defaultValues").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowedValues") != null && !jsonObj.get("allowedValues").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowedValues` to be an array in the JSON string but got `%s`", jsonObj.get("allowedValues").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TagSchemaOptional.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TagSchemaOptional' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TagSchemaOptional> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TagSchemaOptional.class));

       return (TypeAdapter<T>) new TypeAdapter<TagSchemaOptional>() {
           @Override
           public void write(JsonWriter out, TagSchemaOptional value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TagSchemaOptional read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TagSchemaOptional given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TagSchemaOptional
  * @throws IOException if the JSON string is invalid with respect to TagSchemaOptional
  */
  public static TagSchemaOptional fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TagSchemaOptional.class);
  }

 /**
  * Convert an instance of TagSchemaOptional to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

