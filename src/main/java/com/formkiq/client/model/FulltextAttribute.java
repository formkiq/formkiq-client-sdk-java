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
import com.formkiq.client.model.AttributeValueType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.formkiq.client.invoker.JSON;

/**
 * FulltextAttribute
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2025-05-20T14:44:33.741519-05:00[America/Winnipeg]",
    comments = "Generator version: 7.13.0")
public class FulltextAttribute {
  public static final String SERIALIZED_NAME_STRING_VALUES = "stringValues";
  @SerializedName(SERIALIZED_NAME_STRING_VALUES)
  @javax.annotation.Nullable
  private List<String> stringValues = new ArrayList<>();

  public static final String SERIALIZED_NAME_NUMBER_VALUES = "numberValues";
  @SerializedName(SERIALIZED_NAME_NUMBER_VALUES)
  @javax.annotation.Nullable
  private List<BigDecimal> numberValues = new ArrayList<>();

  public static final String SERIALIZED_NAME_BOOLEAN_VALUE = "booleanValue";
  @SerializedName(SERIALIZED_NAME_BOOLEAN_VALUE)
  @javax.annotation.Nullable
  private Boolean booleanValue;

  public static final String SERIALIZED_NAME_VALUE_TYPE = "valueType";
  @SerializedName(SERIALIZED_NAME_VALUE_TYPE)
  @javax.annotation.Nullable
  private AttributeValueType valueType;

  public FulltextAttribute() {}

  public FulltextAttribute stringValues(@javax.annotation.Nullable List<String> stringValues) {
    this.stringValues = stringValues;
    return this;
  }

  public FulltextAttribute addStringValuesItem(String stringValuesItem) {
    if (this.stringValues == null) {
      this.stringValues = new ArrayList<>();
    }
    this.stringValues.add(stringValuesItem);
    return this;
  }

  /**
   * Attribute with string values
   * 
   * @return stringValues
   */
  @javax.annotation.Nullable
  public List<String> getStringValues() {
    return stringValues;
  }

  public void setStringValues(@javax.annotation.Nullable List<String> stringValues) {
    this.stringValues = stringValues;
  }


  public FulltextAttribute numberValues(@javax.annotation.Nullable List<BigDecimal> numberValues) {
    this.numberValues = numberValues;
    return this;
  }

  public FulltextAttribute addNumberValuesItem(BigDecimal numberValuesItem) {
    if (this.numberValues == null) {
      this.numberValues = new ArrayList<>();
    }
    this.numberValues.add(numberValuesItem);
    return this;
  }

  /**
   * Attribute with number values
   * 
   * @return numberValues
   */
  @javax.annotation.Nullable
  public List<BigDecimal> getNumberValues() {
    return numberValues;
  }

  public void setNumberValues(@javax.annotation.Nullable List<BigDecimal> numberValues) {
    this.numberValues = numberValues;
  }


  public FulltextAttribute booleanValue(@javax.annotation.Nullable Boolean booleanValue) {
    this.booleanValue = booleanValue;
    return this;
  }

  /**
   * Attribute with boolean value
   * 
   * @return booleanValue
   */
  @javax.annotation.Nullable
  public Boolean getBooleanValue() {
    return booleanValue;
  }

  public void setBooleanValue(@javax.annotation.Nullable Boolean booleanValue) {
    this.booleanValue = booleanValue;
  }


  public FulltextAttribute valueType(@javax.annotation.Nullable AttributeValueType valueType) {
    this.valueType = valueType;
    return this;
  }

  /**
   * Get valueType
   * 
   * @return valueType
   */
  @javax.annotation.Nullable
  public AttributeValueType getValueType() {
    return valueType;
  }

  public void setValueType(@javax.annotation.Nullable AttributeValueType valueType) {
    this.valueType = valueType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulltextAttribute fulltextAttribute = (FulltextAttribute) o;
    return Objects.equals(this.stringValues, fulltextAttribute.stringValues)
        && Objects.equals(this.numberValues, fulltextAttribute.numberValues)
        && Objects.equals(this.booleanValue, fulltextAttribute.booleanValue)
        && Objects.equals(this.valueType, fulltextAttribute.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stringValues, numberValues, booleanValue, valueType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulltextAttribute {\n");
    sb.append("    stringValues: ").append(toIndentedString(stringValues)).append("\n");
    sb.append("    numberValues: ").append(toIndentedString(numberValues)).append("\n");
    sb.append("    booleanValue: ").append(toIndentedString(booleanValue)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
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
    openapiFields.add("stringValues");
    openapiFields.add("numberValues");
    openapiFields.add("booleanValue");
    openapiFields.add("valueType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FulltextAttribute
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!FulltextAttribute.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in FulltextAttribute is not found in the empty JSON string",
            FulltextAttribute.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!FulltextAttribute.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `FulltextAttribute` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // ensure the optional json data is an array if present
    if (jsonObj.get("stringValues") != null && !jsonObj.get("stringValues").isJsonNull()
        && !jsonObj.get("stringValues").isJsonArray()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `stringValues` to be an array in the JSON string but got `%s`",
          jsonObj.get("stringValues").toString()));
    }
    // ensure the optional json data is an array if present
    if (jsonObj.get("numberValues") != null && !jsonObj.get("numberValues").isJsonNull()
        && !jsonObj.get("numberValues").isJsonArray()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `numberValues` to be an array in the JSON string but got `%s`",
          jsonObj.get("numberValues").toString()));
    }
    // validate the optional field `valueType`
    if (jsonObj.get("valueType") != null && !jsonObj.get("valueType").isJsonNull()) {
      AttributeValueType.validateJsonElement(jsonObj.get("valueType"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!FulltextAttribute.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'FulltextAttribute' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<FulltextAttribute> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(FulltextAttribute.class));

      return (TypeAdapter<T>) new TypeAdapter<FulltextAttribute>() {
        @Override
        public void write(JsonWriter out, FulltextAttribute value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public FulltextAttribute read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of FulltextAttribute given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FulltextAttribute
   * @throws IOException if the JSON string is invalid with respect to FulltextAttribute
   */
  public static FulltextAttribute fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FulltextAttribute.class);
  }

  /**
   * Convert an instance of FulltextAttribute to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

