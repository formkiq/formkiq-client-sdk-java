/*
 * FormKiQ API JWT Formkiq API: Document Management Platform API using OAuth(JWT) Authentication You
 * can find out more about FormKiQ at [https://formkiq.com](http://formkiq.com). ## Introduction
 * FormKiQ is an API-first (head-less), battle-tested document management API. The FormKiQ API
 * provides all the API endpoints to build your Perfect Document Management Platform. FormKiQ API
 * was built on top of [OpenAPI specification](https://www.openapis.org), so it is easy to use the
 * API spec file with any application that supports the OpenAPI specification. Open API OAuth
 * Specification -
 * https://raw.githubusercontent.com/formkiq/formkiq-core/master/docs/openapi/openapi-jwt.yaml Open
 * API IAM Specification -
 * https://raw.githubusercontent.com/formkiq/formkiq-core/master/docs/openapi/openapi-iam.yaml ##
 * Authentication FormKiQ offers three forms of authentication: - OAuth(JWT) - AWS IAM - API Key
 *
 * The version of the OpenAPI document: 1.17.1 Contact: support@formkiq.com
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.formkiq.client.invoker.JSON;

/**
 * Match Document Tag
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2025-05-20T14:44:33.741519-05:00[America/Winnipeg]",
    comments = "Generator version: 7.13.0")
public class MatchDocumentTag {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  @javax.annotation.Nonnull
  private String key;

  public static final String SERIALIZED_NAME_BEGINS_WITH = "beginsWith";
  @SerializedName(SERIALIZED_NAME_BEGINS_WITH)
  @javax.annotation.Nullable
  private String beginsWith;

  public static final String SERIALIZED_NAME_EQ = "eq";
  @SerializedName(SERIALIZED_NAME_EQ)
  @javax.annotation.Nullable
  private String eq;

  public MatchDocumentTag() {}

  public MatchDocumentTag key(@javax.annotation.Nonnull String key) {
    this.key = key;
    return this;
  }

  /**
   * Tag key
   * 
   * @return key
   */
  @javax.annotation.Nonnull
  public String getKey() {
    return key;
  }

  public void setKey(@javax.annotation.Nonnull String key) {
    this.key = key;
  }


  public MatchDocumentTag beginsWith(@javax.annotation.Nullable String beginsWith) {
    this.beginsWith = beginsWith;
    return this;
  }

  /**
   * Searches for strings that begin with
   * 
   * @return beginsWith
   */
  @javax.annotation.Nullable
  public String getBeginsWith() {
    return beginsWith;
  }

  public void setBeginsWith(@javax.annotation.Nullable String beginsWith) {
    this.beginsWith = beginsWith;
  }


  public MatchDocumentTag eq(@javax.annotation.Nullable String eq) {
    this.eq = eq;
    return this;
  }

  /**
   * Searches for strings that eq
   * 
   * @return eq
   */
  @javax.annotation.Nullable
  public String getEq() {
    return eq;
  }

  public void setEq(@javax.annotation.Nullable String eq) {
    this.eq = eq;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchDocumentTag matchDocumentTag = (MatchDocumentTag) o;
    return Objects.equals(this.key, matchDocumentTag.key)
        && Objects.equals(this.beginsWith, matchDocumentTag.beginsWith)
        && Objects.equals(this.eq, matchDocumentTag.eq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, beginsWith, eq);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchDocumentTag {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    beginsWith: ").append(toIndentedString(beginsWith)).append("\n");
    sb.append("    eq: ").append(toIndentedString(eq)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("beginsWith");
    openapiFields.add("eq");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("key");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MatchDocumentTag
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!MatchDocumentTag.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                               // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in MatchDocumentTag is not found in the empty JSON string",
            MatchDocumentTag.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!MatchDocumentTag.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `MatchDocumentTag` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : MatchDocumentTag.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format("The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if (!jsonObj.get("key").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `key` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("key").toString()));
    }
    if ((jsonObj.get("beginsWith") != null && !jsonObj.get("beginsWith").isJsonNull())
        && !jsonObj.get("beginsWith").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `beginsWith` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("beginsWith").toString()));
    }
    if ((jsonObj.get("eq") != null && !jsonObj.get("eq").isJsonNull())
        && !jsonObj.get("eq").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `eq` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("eq").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!MatchDocumentTag.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'MatchDocumentTag' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<MatchDocumentTag> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(MatchDocumentTag.class));

      return (TypeAdapter<T>) new TypeAdapter<MatchDocumentTag>() {
        @Override
        public void write(JsonWriter out, MatchDocumentTag value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public MatchDocumentTag read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of MatchDocumentTag given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MatchDocumentTag
   * @throws IOException if the JSON string is invalid with respect to MatchDocumentTag
   */
  public static MatchDocumentTag fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MatchDocumentTag.class);
  }

  /**
   * Convert an instance of MatchDocumentTag to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

