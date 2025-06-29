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
import com.formkiq.client.model.AttributeDataType;
import com.formkiq.client.model.AttributeType;
import com.formkiq.client.model.Watermark;
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
 * Attribute
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2025-05-20T14:44:33.741519-05:00[America/Winnipeg]",
    comments = "Generator version: 7.13.0")
public class Attribute {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private AttributeType type = AttributeType.STANDARD;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  @javax.annotation.Nullable
  private String key;

  public static final String SERIALIZED_NAME_DATA_TYPE = "dataType";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  @javax.annotation.Nullable
  private AttributeDataType dataType = AttributeDataType.STRING;

  public static final String SERIALIZED_NAME_WATERMARK = "watermark";
  @SerializedName(SERIALIZED_NAME_WATERMARK)
  @javax.annotation.Nullable
  private Watermark watermark;

  public Attribute() {}

  public Attribute type(@javax.annotation.Nullable AttributeType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * 
   * @return type
   */
  @javax.annotation.Nullable
  public AttributeType getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable AttributeType type) {
    this.type = type;
  }


  public Attribute key(@javax.annotation.Nullable String key) {
    this.key = key;
    return this;
  }

  /**
   * Attribute Key
   * 
   * @return key
   */
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }

  public void setKey(@javax.annotation.Nullable String key) {
    this.key = key;
  }


  public Attribute dataType(@javax.annotation.Nullable AttributeDataType dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * Get dataType
   * 
   * @return dataType
   */
  @javax.annotation.Nullable
  public AttributeDataType getDataType() {
    return dataType;
  }

  public void setDataType(@javax.annotation.Nullable AttributeDataType dataType) {
    this.dataType = dataType;
  }


  public Attribute watermark(@javax.annotation.Nullable Watermark watermark) {
    this.watermark = watermark;
    return this;
  }

  /**
   * Get watermark
   * 
   * @return watermark
   */
  @javax.annotation.Nullable
  public Watermark getWatermark() {
    return watermark;
  }

  public void setWatermark(@javax.annotation.Nullable Watermark watermark) {
    this.watermark = watermark;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attribute attribute = (Attribute) o;
    return Objects.equals(this.type, attribute.type) && Objects.equals(this.key, attribute.key)
        && Objects.equals(this.dataType, attribute.dataType)
        && Objects.equals(this.watermark, attribute.watermark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, key, dataType, watermark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attribute {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    watermark: ").append(toIndentedString(watermark)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("dataType");
    openapiFields.add("watermark");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Attribute
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!Attribute.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is
                                                        // null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in Attribute is not found in the empty JSON string",
            Attribute.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!Attribute.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `Attribute` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the optional field `type`
    if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
      AttributeType.validateJsonElement(jsonObj.get("type"));
    }
    if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull())
        && !jsonObj.get("key").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `key` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("key").toString()));
    }
    // validate the optional field `dataType`
    if (jsonObj.get("dataType") != null && !jsonObj.get("dataType").isJsonNull()) {
      AttributeDataType.validateJsonElement(jsonObj.get("dataType"));
    }
    // validate the optional field `watermark`
    if (jsonObj.get("watermark") != null && !jsonObj.get("watermark").isJsonNull()) {
      Watermark.validateJsonElement(jsonObj.get("watermark"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!Attribute.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'Attribute' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<Attribute> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(Attribute.class));

      return (TypeAdapter<T>) new TypeAdapter<Attribute>() {
        @Override
        public void write(JsonWriter out, Attribute value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public Attribute read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of Attribute given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Attribute
   * @throws IOException if the JSON string is invalid with respect to Attribute
   */
  public static Attribute fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Attribute.class);
  }

  /**
   * Convert an instance of Attribute to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

