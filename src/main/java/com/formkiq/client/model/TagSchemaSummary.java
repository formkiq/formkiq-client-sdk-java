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
 * TagSchemaSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-02T11:00:15.465357-05:00[America/Winnipeg]")
public class TagSchemaSummary {
  public static final String SERIALIZED_NAME_TAG_SCHEMA_ID = "tagSchemaId";
  @SerializedName(SERIALIZED_NAME_TAG_SCHEMA_ID)
  private String tagSchemaId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_INSERTED_DATE = "insertedDate";
  @SerializedName(SERIALIZED_NAME_INSERTED_DATE)
  private String insertedDate;

  public TagSchemaSummary() {
  }

  public TagSchemaSummary tagSchemaId(String tagSchemaId) {
    
    this.tagSchemaId = tagSchemaId;
    return this;
  }

   /**
   * Get tagSchemaId
   * @return tagSchemaId
  **/
  @javax.annotation.Nullable
  public String getTagSchemaId() {
    return tagSchemaId;
  }


  public void setTagSchemaId(String tagSchemaId) {
    this.tagSchemaId = tagSchemaId;
  }


  public TagSchemaSummary name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TagSchemaSummary userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public TagSchemaSummary insertedDate(String insertedDate) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagSchemaSummary tagSchemaSummary = (TagSchemaSummary) o;
    return Objects.equals(this.tagSchemaId, tagSchemaSummary.tagSchemaId) &&
        Objects.equals(this.name, tagSchemaSummary.name) &&
        Objects.equals(this.userId, tagSchemaSummary.userId) &&
        Objects.equals(this.insertedDate, tagSchemaSummary.insertedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagSchemaId, name, userId, insertedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagSchemaSummary {\n");
    sb.append("    tagSchemaId: ").append(toIndentedString(tagSchemaId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    insertedDate: ").append(toIndentedString(insertedDate)).append("\n");
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
    openapiFields.add("tagSchemaId");
    openapiFields.add("name");
    openapiFields.add("userId");
    openapiFields.add("insertedDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TagSchemaSummary
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TagSchemaSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TagSchemaSummary is not found in the empty JSON string", TagSchemaSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TagSchemaSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TagSchemaSummary` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("tagSchemaId") != null && !jsonObj.get("tagSchemaId").isJsonNull()) && !jsonObj.get("tagSchemaId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tagSchemaId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tagSchemaId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if ((jsonObj.get("insertedDate") != null && !jsonObj.get("insertedDate").isJsonNull()) && !jsonObj.get("insertedDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `insertedDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("insertedDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TagSchemaSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TagSchemaSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TagSchemaSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TagSchemaSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<TagSchemaSummary>() {
           @Override
           public void write(JsonWriter out, TagSchemaSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TagSchemaSummary read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TagSchemaSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TagSchemaSummary
  * @throws IOException if the JSON string is invalid with respect to TagSchemaSummary
  */
  public static TagSchemaSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TagSchemaSummary.class);
  }

 /**
  * Convert an instance of TagSchemaSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

