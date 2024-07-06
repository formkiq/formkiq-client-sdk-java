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
 * TagSchemaSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-07-06T13:14:53.148809-05:00[America/Winnipeg]",
    comments = "Generator version: 7.7.0")
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

  public static final String SERIALIZED_NAME_IN_USE = "inUse";
  @SerializedName(SERIALIZED_NAME_IN_USE)
  private Boolean inUse;

  public static final String SERIALIZED_NAME_INSERTED_DATE = "insertedDate";
  @SerializedName(SERIALIZED_NAME_INSERTED_DATE)
  private String insertedDate;

  public TagSchemaSummary() {}

  public TagSchemaSummary tagSchemaId(String tagSchemaId) {
    this.tagSchemaId = tagSchemaId;
    return this;
  }

  /**
   * Get tagSchemaId
   * 
   * @return tagSchemaId
   */
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
   * 
   * @return name
   */
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


  public TagSchemaSummary inUse(Boolean inUse) {
    this.inUse = inUse;
    return this;
  }

  /**
   * Whether the TagSchema is in use
   * 
   * @return inUse
   */
  @javax.annotation.Nullable
  public Boolean getInUse() {
    return inUse;
  }

  public void setInUse(Boolean inUse) {
    this.inUse = inUse;
  }


  public TagSchemaSummary insertedDate(String insertedDate) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagSchemaSummary tagSchemaSummary = (TagSchemaSummary) o;
    return Objects.equals(this.tagSchemaId, tagSchemaSummary.tagSchemaId)
        && Objects.equals(this.name, tagSchemaSummary.name)
        && Objects.equals(this.userId, tagSchemaSummary.userId)
        && Objects.equals(this.inUse, tagSchemaSummary.inUse)
        && Objects.equals(this.insertedDate, tagSchemaSummary.insertedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagSchemaId, name, userId, inUse, insertedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagSchemaSummary {\n");
    sb.append("    tagSchemaId: ").append(toIndentedString(tagSchemaId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    inUse: ").append(toIndentedString(inUse)).append("\n");
    sb.append("    insertedDate: ").append(toIndentedString(insertedDate)).append("\n");
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
    openapiFields.add("tagSchemaId");
    openapiFields.add("name");
    openapiFields.add("userId");
    openapiFields.add("inUse");
    openapiFields.add("insertedDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TagSchemaSummary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!TagSchemaSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                               // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in TagSchemaSummary is not found in the empty JSON string",
            TagSchemaSummary.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!TagSchemaSummary.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `TagSchemaSummary` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("tagSchemaId") != null && !jsonObj.get("tagSchemaId").isJsonNull())
        && !jsonObj.get("tagSchemaId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `tagSchemaId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("tagSchemaId").toString()));
    }
    if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull())
        && !jsonObj.get("name").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `name` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("name").toString()));
    }
    if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull())
        && !jsonObj.get("userId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `userId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("userId").toString()));
    }
    if ((jsonObj.get("insertedDate") != null && !jsonObj.get("insertedDate").isJsonNull())
        && !jsonObj.get("insertedDate").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `insertedDate` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("insertedDate").toString()));
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
      final TypeAdapter<TagSchemaSummary> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(TagSchemaSummary.class));

      return (TypeAdapter<T>) new TypeAdapter<TagSchemaSummary>() {
        @Override
        public void write(JsonWriter out, TagSchemaSummary value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public TagSchemaSummary read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
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

