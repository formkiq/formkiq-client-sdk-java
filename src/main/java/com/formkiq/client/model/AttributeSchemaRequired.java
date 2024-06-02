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
import java.util.ArrayList;
import java.util.Arrays;
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
import java.util.Set;

import com.formkiq.client.invoker.JSON;

/**
 * AttributeSchemaRequired
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-05-31T23:04:19.034052-05:00[America/Winnipeg]",
    comments = "Generator version: 7.6.0")
public class AttributeSchemaRequired {
  public static final String SERIALIZED_NAME_ATTRIBUTE_KEY = "attributeKey";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_KEY)
  private String attributeKey;

  public static final String SERIALIZED_NAME_DEFAULT_VALUE = "defaultValue";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
  private String defaultValue;

  public static final String SERIALIZED_NAME_DEFAULT_VALUES = "defaultValues";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUES)
  private List<String> defaultValues = new ArrayList<>();

  public static final String SERIALIZED_NAME_ALLOWED_VALUES = "allowedValues";
  @SerializedName(SERIALIZED_NAME_ALLOWED_VALUES)
  private List<String> allowedValues = new ArrayList<>();

  public AttributeSchemaRequired() {}

  public AttributeSchemaRequired attributeKey(String attributeKey) {
    this.attributeKey = attributeKey;
    return this;
  }

  /**
   * Get attributeKey
   * 
   * @return attributeKey
   **/
  @javax.annotation.Nullable
  public String getAttributeKey() {
    return attributeKey;
  }

  public void setAttributeKey(String attributeKey) {
    this.attributeKey = attributeKey;
  }


  public AttributeSchemaRequired defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * Default value
   * 
   * @return defaultValue
   **/
  @javax.annotation.Nullable
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }


  public AttributeSchemaRequired defaultValues(List<String> defaultValues) {
    this.defaultValues = defaultValues;
    return this;
  }

  public AttributeSchemaRequired addDefaultValuesItem(String defaultValuesItem) {
    if (this.defaultValues == null) {
      this.defaultValues = new ArrayList<>();
    }
    this.defaultValues.add(defaultValuesItem);
    return this;
  }

  /**
   * Default values
   * 
   * @return defaultValues
   **/
  @javax.annotation.Nullable
  public List<String> getDefaultValues() {
    return defaultValues;
  }

  public void setDefaultValues(List<String> defaultValues) {
    this.defaultValues = defaultValues;
  }


  public AttributeSchemaRequired allowedValues(List<String> allowedValues) {
    this.allowedValues = allowedValues;
    return this;
  }

  public AttributeSchemaRequired addAllowedValuesItem(String allowedValuesItem) {
    if (this.allowedValues == null) {
      this.allowedValues = new ArrayList<>();
    }
    this.allowedValues.add(allowedValuesItem);
    return this;
  }

  /**
   * Only valid string values
   * 
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
    AttributeSchemaRequired attributeSchemaRequired = (AttributeSchemaRequired) o;
    return Objects.equals(this.attributeKey, attributeSchemaRequired.attributeKey)
        && Objects.equals(this.defaultValue, attributeSchemaRequired.defaultValue)
        && Objects.equals(this.defaultValues, attributeSchemaRequired.defaultValues)
        && Objects.equals(this.allowedValues, attributeSchemaRequired.allowedValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeKey, defaultValue, defaultValues, allowedValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributeSchemaRequired {\n");
    sb.append("    attributeKey: ").append(toIndentedString(attributeKey)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    defaultValues: ").append(toIndentedString(defaultValues)).append("\n");
    sb.append("    allowedValues: ").append(toIndentedString(allowedValues)).append("\n");
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
    openapiFields.add("attributeKey");
    openapiFields.add("defaultValue");
    openapiFields.add("defaultValues");
    openapiFields.add("allowedValues");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AttributeSchemaRequired
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!AttributeSchemaRequired.openapiRequiredFields.isEmpty()) { // has required fields but
                                                                      // JSON element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in AttributeSchemaRequired is not found in the empty JSON string",
            AttributeSchemaRequired.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!AttributeSchemaRequired.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `AttributeSchemaRequired` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("attributeKey") != null && !jsonObj.get("attributeKey").isJsonNull())
        && !jsonObj.get("attributeKey").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `attributeKey` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("attributeKey").toString()));
    }
    if ((jsonObj.get("defaultValue") != null && !jsonObj.get("defaultValue").isJsonNull())
        && !jsonObj.get("defaultValue").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `defaultValue` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("defaultValue").toString()));
    }
    // ensure the optional json data is an array if present
    if (jsonObj.get("defaultValues") != null && !jsonObj.get("defaultValues").isJsonNull()
        && !jsonObj.get("defaultValues").isJsonArray()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `defaultValues` to be an array in the JSON string but got `%s`",
          jsonObj.get("defaultValues").toString()));
    }
    // ensure the optional json data is an array if present
    if (jsonObj.get("allowedValues") != null && !jsonObj.get("allowedValues").isJsonNull()
        && !jsonObj.get("allowedValues").isJsonArray()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `allowedValues` to be an array in the JSON string but got `%s`",
          jsonObj.get("allowedValues").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!AttributeSchemaRequired.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'AttributeSchemaRequired' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<AttributeSchemaRequired> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(AttributeSchemaRequired.class));

      return (TypeAdapter<T>) new TypeAdapter<AttributeSchemaRequired>() {
        @Override
        public void write(JsonWriter out, AttributeSchemaRequired value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public AttributeSchemaRequired read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of AttributeSchemaRequired given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AttributeSchemaRequired
   * @throws IOException if the JSON string is invalid with respect to AttributeSchemaRequired
   */
  public static AttributeSchemaRequired fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AttributeSchemaRequired.class);
  }

  /**
   * Convert an instance of AttributeSchemaRequired to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

