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
 * The version of the OpenAPI document: 1.16.0 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import com.formkiq.client.model.StringGeneratorType;
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
 * StringFormat
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-08-06T13:20:48.482805-05:00[America/Winnipeg]",
    comments = "Generator version: 7.7.0")
public class StringFormat {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private StringGeneratorType type;

  public static final String SERIALIZED_NAME_STATIC_VALUE = "staticValue";
  @SerializedName(SERIALIZED_NAME_STATIC_VALUE)
  private String staticValue;

  public static final String SERIALIZED_NAME_PADDING = "padding";
  @SerializedName(SERIALIZED_NAME_PADDING)
  private Integer padding;

  public StringFormat() {}

  public StringFormat type(StringGeneratorType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * 
   * @return type
   */
  @javax.annotation.Nullable
  public StringGeneratorType getType() {
    return type;
  }

  public void setType(StringGeneratorType type) {
    this.type = type;
  }


  public StringFormat staticValue(String staticValue) {
    this.staticValue = staticValue;
    return this;
  }

  /**
   * Static Value
   * 
   * @return staticValue
   */
  @javax.annotation.Nullable
  public String getStaticValue() {
    return staticValue;
  }

  public void setStaticValue(String staticValue) {
    this.staticValue = staticValue;
  }


  public StringFormat padding(Integer padding) {
    this.padding = padding;
    return this;
  }

  /**
   * Optional padding for AUTO_INCREMENT number
   * 
   * @return padding
   */
  @javax.annotation.Nullable
  public Integer getPadding() {
    return padding;
  }

  public void setPadding(Integer padding) {
    this.padding = padding;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StringFormat stringFormat = (StringFormat) o;
    return Objects.equals(this.type, stringFormat.type)
        && Objects.equals(this.staticValue, stringFormat.staticValue)
        && Objects.equals(this.padding, stringFormat.padding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, staticValue, padding);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringFormat {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    staticValue: ").append(toIndentedString(staticValue)).append("\n");
    sb.append("    padding: ").append(toIndentedString(padding)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("staticValue");
    openapiFields.add("padding");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to StringFormat
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!StringFormat.openapiRequiredFields.isEmpty()) { // has required fields but JSON element
                                                           // is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in StringFormat is not found in the empty JSON string",
            StringFormat.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!StringFormat.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `StringFormat` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the optional field `type`
    if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
      StringGeneratorType.validateJsonElement(jsonObj.get("type"));
    }
    if ((jsonObj.get("staticValue") != null && !jsonObj.get("staticValue").isJsonNull())
        && !jsonObj.get("staticValue").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `staticValue` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("staticValue").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!StringFormat.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'StringFormat' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<StringFormat> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(StringFormat.class));

      return (TypeAdapter<T>) new TypeAdapter<StringFormat>() {
        @Override
        public void write(JsonWriter out, StringFormat value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public StringFormat read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of StringFormat given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StringFormat
   * @throws IOException if the JSON string is invalid with respect to StringFormat
   */
  public static StringFormat fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StringFormat.class);
  }

  /**
   * Convert an instance of StringFormat to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

