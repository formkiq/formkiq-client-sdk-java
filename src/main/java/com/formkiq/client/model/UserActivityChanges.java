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
 * The version of the OpenAPI document: 1.16.0 Contact: support@formkiq.com
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
 * UserActivityChanges
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-11-07T14:33:54.015542-06:00[America/Winnipeg]",
    comments = "Generator version: 7.9.0")
public class UserActivityChanges {
  public static final String SERIALIZED_NAME_OLD_VALUE = "oldValue";
  @SerializedName(SERIALIZED_NAME_OLD_VALUE)
  private String oldValue;

  public static final String SERIALIZED_NAME_NEW_VALUE = "newValue";
  @SerializedName(SERIALIZED_NAME_NEW_VALUE)
  private String newValue;

  public UserActivityChanges() {}

  public UserActivityChanges oldValue(String oldValue) {
    this.oldValue = oldValue;
    return this;
  }

  /**
   * Previous key value
   * 
   * @return oldValue
   */
  @javax.annotation.Nullable
  public String getOldValue() {
    return oldValue;
  }

  public void setOldValue(String oldValue) {
    this.oldValue = oldValue;
  }


  public UserActivityChanges newValue(String newValue) {
    this.newValue = newValue;
    return this;
  }

  /**
   * New key value
   * 
   * @return newValue
   */
  @javax.annotation.Nullable
  public String getNewValue() {
    return newValue;
  }

  public void setNewValue(String newValue) {
    this.newValue = newValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserActivityChanges userActivityChanges = (UserActivityChanges) o;
    return Objects.equals(this.oldValue, userActivityChanges.oldValue)
        && Objects.equals(this.newValue, userActivityChanges.newValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldValue, newValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserActivityChanges {\n");
    sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
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
    openapiFields.add("oldValue");
    openapiFields.add("newValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UserActivityChanges
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!UserActivityChanges.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                  // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in UserActivityChanges is not found in the empty JSON string",
            UserActivityChanges.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!UserActivityChanges.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `UserActivityChanges` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("oldValue") != null && !jsonObj.get("oldValue").isJsonNull())
        && !jsonObj.get("oldValue").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `oldValue` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("oldValue").toString()));
    }
    if ((jsonObj.get("newValue") != null && !jsonObj.get("newValue").isJsonNull())
        && !jsonObj.get("newValue").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `newValue` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("newValue").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!UserActivityChanges.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'UserActivityChanges' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<UserActivityChanges> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(UserActivityChanges.class));

      return (TypeAdapter<T>) new TypeAdapter<UserActivityChanges>() {
        @Override
        public void write(JsonWriter out, UserActivityChanges value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public UserActivityChanges read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of UserActivityChanges given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UserActivityChanges
   * @throws IOException if the JSON string is invalid with respect to UserActivityChanges
   */
  public static UserActivityChanges fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserActivityChanges.class);
  }

  /**
   * Convert an instance of UserActivityChanges to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

