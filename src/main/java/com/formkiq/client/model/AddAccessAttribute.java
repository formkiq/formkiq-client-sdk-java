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
 * The version of the OpenAPI document: 1.14.0 Contact: support@formkiq.com
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
import java.math.BigDecimal;
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
 * Document Access Attribute (requires either: stringValue, numberValue, booleanValue)
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-03-12T17:22:35.784319-05:00[America/Winnipeg]",
    comments = "Generator version: 7.4.0")
public class AddAccessAttribute {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_STRING_VALUE = "stringValue";
  @SerializedName(SERIALIZED_NAME_STRING_VALUE)
  private String stringValue;

  public static final String SERIALIZED_NAME_NUMBER_VALUE = "numberValue";
  @SerializedName(SERIALIZED_NAME_NUMBER_VALUE)
  private BigDecimal numberValue;

  public static final String SERIALIZED_NAME_BOOLEAN_VALUE = "booleanValue";
  @SerializedName(SERIALIZED_NAME_BOOLEAN_VALUE)
  private Boolean booleanValue;

  public AddAccessAttribute() {}

  public AddAccessAttribute key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Attribute key
   * 
   * @return key
   **/
  @javax.annotation.Nonnull
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  public AddAccessAttribute stringValue(String stringValue) {
    this.stringValue = stringValue;
    return this;
  }

  /**
   * Attribute with string value
   * 
   * @return stringValue
   **/
  @javax.annotation.Nullable
  public String getStringValue() {
    return stringValue;
  }

  public void setStringValue(String stringValue) {
    this.stringValue = stringValue;
  }


  public AddAccessAttribute numberValue(BigDecimal numberValue) {
    this.numberValue = numberValue;
    return this;
  }

  /**
   * Attribute with number value
   * 
   * @return numberValue
   **/
  @javax.annotation.Nullable
  public BigDecimal getNumberValue() {
    return numberValue;
  }

  public void setNumberValue(BigDecimal numberValue) {
    this.numberValue = numberValue;
  }


  public AddAccessAttribute booleanValue(Boolean booleanValue) {
    this.booleanValue = booleanValue;
    return this;
  }

  /**
   * Attribute with boolean value
   * 
   * @return booleanValue
   **/
  @javax.annotation.Nullable
  public Boolean getBooleanValue() {
    return booleanValue;
  }

  public void setBooleanValue(Boolean booleanValue) {
    this.booleanValue = booleanValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddAccessAttribute addAccessAttribute = (AddAccessAttribute) o;
    return Objects.equals(this.key, addAccessAttribute.key)
        && Objects.equals(this.stringValue, addAccessAttribute.stringValue)
        && Objects.equals(this.numberValue, addAccessAttribute.numberValue)
        && Objects.equals(this.booleanValue, addAccessAttribute.booleanValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, stringValue, numberValue, booleanValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddAccessAttribute {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    stringValue: ").append(toIndentedString(stringValue)).append("\n");
    sb.append("    numberValue: ").append(toIndentedString(numberValue)).append("\n");
    sb.append("    booleanValue: ").append(toIndentedString(booleanValue)).append("\n");
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
    openapiFields.add("stringValue");
    openapiFields.add("numberValue");
    openapiFields.add("booleanValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("key");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AddAccessAttribute
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!AddAccessAttribute.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                 // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in AddAccessAttribute is not found in the empty JSON string",
            AddAccessAttribute.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!AddAccessAttribute.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `AddAccessAttribute` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : AddAccessAttribute.openapiRequiredFields) {
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
    if ((jsonObj.get("stringValue") != null && !jsonObj.get("stringValue").isJsonNull())
        && !jsonObj.get("stringValue").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `stringValue` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("stringValue").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!AddAccessAttribute.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'AddAccessAttribute' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<AddAccessAttribute> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(AddAccessAttribute.class));

      return (TypeAdapter<T>) new TypeAdapter<AddAccessAttribute>() {
        @Override
        public void write(JsonWriter out, AddAccessAttribute value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public AddAccessAttribute read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of AddAccessAttribute given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AddAccessAttribute
   * @throws IOException if the JSON string is invalid with respect to AddAccessAttribute
   */
  public static AddAccessAttribute fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddAccessAttribute.class);
  }

  /**
   * Convert an instance of AddAccessAttribute to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
