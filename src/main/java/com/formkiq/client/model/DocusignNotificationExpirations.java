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
 * The version of the OpenAPI document: 1.17.0 Contact: support@formkiq.com
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
 * DocusignNotificationExpirations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2025-03-12T17:17:25.165880-05:00[America/Winnipeg]",
    comments = "Generator version: 7.12.0")
public class DocusignNotificationExpirations {
  public static final String SERIALIZED_NAME_EXPIRE_AFTER = "expireAfter";
  @SerializedName(SERIALIZED_NAME_EXPIRE_AFTER)
  @javax.annotation.Nullable
  private String expireAfter;

  public static final String SERIALIZED_NAME_EXPIRE_ENABLED = "expireEnabled";
  @SerializedName(SERIALIZED_NAME_EXPIRE_ENABLED)
  @javax.annotation.Nullable
  private String expireEnabled;

  public static final String SERIALIZED_NAME_EXPIRE_WARN = "expireWarn";
  @SerializedName(SERIALIZED_NAME_EXPIRE_WARN)
  @javax.annotation.Nullable
  private String expireWarn;

  public DocusignNotificationExpirations() {}

  public DocusignNotificationExpirations expireAfter(
      @javax.annotation.Nullable String expireAfter) {
    this.expireAfter = expireAfter;
    return this;
  }

  /**
   * An integer that sets the number of days the envelope is active. For this value to be used,
   * expireEnabled must be explicitly set to true.
   * 
   * @return expireAfter
   */
  @javax.annotation.Nullable
  public String getExpireAfter() {
    return expireAfter;
  }

  public void setExpireAfter(@javax.annotation.Nullable String expireAfter) {
    this.expireAfter = expireAfter;
  }


  public DocusignNotificationExpirations expireEnabled(
      @javax.annotation.Nullable String expireEnabled) {
    this.expireEnabled = expireEnabled;
    return this;
  }

  /**
   * When true, the envelope expires in the number of days set by expireAfter.
   * 
   * @return expireEnabled
   */
  @javax.annotation.Nullable
  public String getExpireEnabled() {
    return expireEnabled;
  }

  public void setExpireEnabled(@javax.annotation.Nullable String expireEnabled) {
    this.expireEnabled = expireEnabled;
  }


  public DocusignNotificationExpirations expireWarn(@javax.annotation.Nullable String expireWarn) {
    this.expireWarn = expireWarn;
    return this;
  }

  /**
   * An integer that specifying the number of days before the envelope expires that an expiration
   * warning email is sent to the recipient.
   * 
   * @return expireWarn
   */
  @javax.annotation.Nullable
  public String getExpireWarn() {
    return expireWarn;
  }

  public void setExpireWarn(@javax.annotation.Nullable String expireWarn) {
    this.expireWarn = expireWarn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocusignNotificationExpirations docusignNotificationExpirations =
        (DocusignNotificationExpirations) o;
    return Objects.equals(this.expireAfter, docusignNotificationExpirations.expireAfter)
        && Objects.equals(this.expireEnabled, docusignNotificationExpirations.expireEnabled)
        && Objects.equals(this.expireWarn, docusignNotificationExpirations.expireWarn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expireAfter, expireEnabled, expireWarn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocusignNotificationExpirations {\n");
    sb.append("    expireAfter: ").append(toIndentedString(expireAfter)).append("\n");
    sb.append("    expireEnabled: ").append(toIndentedString(expireEnabled)).append("\n");
    sb.append("    expireWarn: ").append(toIndentedString(expireWarn)).append("\n");
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
    openapiFields.add("expireAfter");
    openapiFields.add("expireEnabled");
    openapiFields.add("expireWarn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to
   *         DocusignNotificationExpirations
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!DocusignNotificationExpirations.openapiRequiredFields.isEmpty()) { // has required fields
                                                                              // but JSON element is
                                                                              // null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in DocusignNotificationExpirations is not found in the empty JSON string",
            DocusignNotificationExpirations.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!DocusignNotificationExpirations.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `DocusignNotificationExpirations` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("expireAfter") != null && !jsonObj.get("expireAfter").isJsonNull())
        && !jsonObj.get("expireAfter").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `expireAfter` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("expireAfter").toString()));
    }
    if ((jsonObj.get("expireEnabled") != null && !jsonObj.get("expireEnabled").isJsonNull())
        && !jsonObj.get("expireEnabled").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `expireEnabled` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("expireEnabled").toString()));
    }
    if ((jsonObj.get("expireWarn") != null && !jsonObj.get("expireWarn").isJsonNull())
        && !jsonObj.get("expireWarn").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `expireWarn` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("expireWarn").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!DocusignNotificationExpirations.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'DocusignNotificationExpirations' and its
                     // subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<DocusignNotificationExpirations> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(DocusignNotificationExpirations.class));

      return (TypeAdapter<T>) new TypeAdapter<DocusignNotificationExpirations>() {
        @Override
        public void write(JsonWriter out, DocusignNotificationExpirations value)
            throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public DocusignNotificationExpirations read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of DocusignNotificationExpirations given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocusignNotificationExpirations
   * @throws IOException if the JSON string is invalid with respect to
   *         DocusignNotificationExpirations
   */
  public static DocusignNotificationExpirations fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocusignNotificationExpirations.class);
  }

  /**
   * Convert an instance of DocusignNotificationExpirations to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

