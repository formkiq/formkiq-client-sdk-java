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
import com.formkiq.client.model.MappingAttributeLabelMatchingType;
import com.formkiq.client.model.MappingAttributeMetadataField;
import com.formkiq.client.model.MappingAttributeSourceType;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.formkiq.client.invoker.JSON;

/**
 * MappingAttribute
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2025-05-20T14:44:33.741519-05:00[America/Winnipeg]",
    comments = "Generator version: 7.13.0")
public class MappingAttribute {
  public static final String SERIALIZED_NAME_ATTRIBUTE_KEY = "attributeKey";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_KEY)
  @javax.annotation.Nullable
  private String attributeKey;

  public static final String SERIALIZED_NAME_SOURCE_TYPE = "sourceType";
  @SerializedName(SERIALIZED_NAME_SOURCE_TYPE)
  @javax.annotation.Nullable
  private MappingAttributeSourceType sourceType;

  public static final String SERIALIZED_NAME_DEFAULT_VALUE = "defaultValue";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
  @javax.annotation.Nullable
  private String defaultValue;

  public static final String SERIALIZED_NAME_DEFAULT_VALUES = "defaultValues";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUES)
  @javax.annotation.Nullable
  private List<String> defaultValues = new ArrayList<>();

  public static final String SERIALIZED_NAME_LABEL_TEXTS = "labelTexts";
  @SerializedName(SERIALIZED_NAME_LABEL_TEXTS)
  @javax.annotation.Nullable
  private List<String> labelTexts = new ArrayList<>();

  public static final String SERIALIZED_NAME_LABEL_MATCHING_TYPE = "labelMatchingType";
  @SerializedName(SERIALIZED_NAME_LABEL_MATCHING_TYPE)
  @javax.annotation.Nullable
  private MappingAttributeLabelMatchingType labelMatchingType;

  public static final String SERIALIZED_NAME_METADATA_FIELD = "metadataField";
  @SerializedName(SERIALIZED_NAME_METADATA_FIELD)
  @javax.annotation.Nullable
  private MappingAttributeMetadataField metadataField;

  public static final String SERIALIZED_NAME_VALIDATION_REGEX = "validationRegex";
  @SerializedName(SERIALIZED_NAME_VALIDATION_REGEX)
  @javax.annotation.Nullable
  private String validationRegex;

  public MappingAttribute() {}

  public MappingAttribute attributeKey(@javax.annotation.Nullable String attributeKey) {
    this.attributeKey = attributeKey;
    return this;
  }

  /**
   * Attribute Key
   * 
   * @return attributeKey
   */
  @javax.annotation.Nullable
  public String getAttributeKey() {
    return attributeKey;
  }

  public void setAttributeKey(@javax.annotation.Nullable String attributeKey) {
    this.attributeKey = attributeKey;
  }


  public MappingAttribute sourceType(
      @javax.annotation.Nullable MappingAttributeSourceType sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  /**
   * Get sourceType
   * 
   * @return sourceType
   */
  @javax.annotation.Nullable
  public MappingAttributeSourceType getSourceType() {
    return sourceType;
  }

  public void setSourceType(@javax.annotation.Nullable MappingAttributeSourceType sourceType) {
    this.sourceType = sourceType;
  }


  public MappingAttribute defaultValue(@javax.annotation.Nullable String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * Default value
   * 
   * @return defaultValue
   */
  @javax.annotation.Nullable
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(@javax.annotation.Nullable String defaultValue) {
    this.defaultValue = defaultValue;
  }


  public MappingAttribute defaultValues(@javax.annotation.Nullable List<String> defaultValues) {
    this.defaultValues = defaultValues;
    return this;
  }

  public MappingAttribute addDefaultValuesItem(String defaultValuesItem) {
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
   */
  @javax.annotation.Nullable
  public List<String> getDefaultValues() {
    return defaultValues;
  }

  public void setDefaultValues(@javax.annotation.Nullable List<String> defaultValues) {
    this.defaultValues = defaultValues;
  }


  public MappingAttribute labelTexts(@javax.annotation.Nullable List<String> labelTexts) {
    this.labelTexts = labelTexts;
    return this;
  }

  public MappingAttribute addLabelTextsItem(String labelTextsItem) {
    if (this.labelTexts == null) {
      this.labelTexts = new ArrayList<>();
    }
    this.labelTexts.add(labelTextsItem);
    return this;
  }

  /**
   * Get labelTexts
   * 
   * @return labelTexts
   */
  @javax.annotation.Nullable
  public List<String> getLabelTexts() {
    return labelTexts;
  }

  public void setLabelTexts(@javax.annotation.Nullable List<String> labelTexts) {
    this.labelTexts = labelTexts;
  }


  public MappingAttribute labelMatchingType(
      @javax.annotation.Nullable MappingAttributeLabelMatchingType labelMatchingType) {
    this.labelMatchingType = labelMatchingType;
    return this;
  }

  /**
   * Get labelMatchingType
   * 
   * @return labelMatchingType
   */
  @javax.annotation.Nullable
  public MappingAttributeLabelMatchingType getLabelMatchingType() {
    return labelMatchingType;
  }

  public void setLabelMatchingType(
      @javax.annotation.Nullable MappingAttributeLabelMatchingType labelMatchingType) {
    this.labelMatchingType = labelMatchingType;
  }


  public MappingAttribute metadataField(
      @javax.annotation.Nullable MappingAttributeMetadataField metadataField) {
    this.metadataField = metadataField;
    return this;
  }

  /**
   * Get metadataField
   * 
   * @return metadataField
   */
  @javax.annotation.Nullable
  public MappingAttributeMetadataField getMetadataField() {
    return metadataField;
  }

  public void setMetadataField(
      @javax.annotation.Nullable MappingAttributeMetadataField metadataField) {
    this.metadataField = metadataField;
  }


  public MappingAttribute validationRegex(@javax.annotation.Nullable String validationRegex) {
    this.validationRegex = validationRegex;
    return this;
  }

  /**
   * Attribute Value Regex Validation
   * 
   * @return validationRegex
   */
  @javax.annotation.Nullable
  public String getValidationRegex() {
    return validationRegex;
  }

  public void setValidationRegex(@javax.annotation.Nullable String validationRegex) {
    this.validationRegex = validationRegex;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MappingAttribute mappingAttribute = (MappingAttribute) o;
    return Objects.equals(this.attributeKey, mappingAttribute.attributeKey)
        && Objects.equals(this.sourceType, mappingAttribute.sourceType)
        && Objects.equals(this.defaultValue, mappingAttribute.defaultValue)
        && Objects.equals(this.defaultValues, mappingAttribute.defaultValues)
        && Objects.equals(this.labelTexts, mappingAttribute.labelTexts)
        && Objects.equals(this.labelMatchingType, mappingAttribute.labelMatchingType)
        && Objects.equals(this.metadataField, mappingAttribute.metadataField)
        && Objects.equals(this.validationRegex, mappingAttribute.validationRegex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeKey, sourceType, defaultValue, defaultValues, labelTexts,
        labelMatchingType, metadataField, validationRegex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MappingAttribute {\n");
    sb.append("    attributeKey: ").append(toIndentedString(attributeKey)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    defaultValues: ").append(toIndentedString(defaultValues)).append("\n");
    sb.append("    labelTexts: ").append(toIndentedString(labelTexts)).append("\n");
    sb.append("    labelMatchingType: ").append(toIndentedString(labelMatchingType)).append("\n");
    sb.append("    metadataField: ").append(toIndentedString(metadataField)).append("\n");
    sb.append("    validationRegex: ").append(toIndentedString(validationRegex)).append("\n");
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
    openapiFields.add("sourceType");
    openapiFields.add("defaultValue");
    openapiFields.add("defaultValues");
    openapiFields.add("labelTexts");
    openapiFields.add("labelMatchingType");
    openapiFields.add("metadataField");
    openapiFields.add("validationRegex");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MappingAttribute
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!MappingAttribute.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                               // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in MappingAttribute is not found in the empty JSON string",
            MappingAttribute.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!MappingAttribute.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `MappingAttribute` properties. JSON: %s",
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
    // validate the optional field `sourceType`
    if (jsonObj.get("sourceType") != null && !jsonObj.get("sourceType").isJsonNull()) {
      MappingAttributeSourceType.validateJsonElement(jsonObj.get("sourceType"));
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
    if (jsonObj.get("labelTexts") != null && !jsonObj.get("labelTexts").isJsonNull()
        && !jsonObj.get("labelTexts").isJsonArray()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `labelTexts` to be an array in the JSON string but got `%s`",
          jsonObj.get("labelTexts").toString()));
    }
    // validate the optional field `labelMatchingType`
    if (jsonObj.get("labelMatchingType") != null
        && !jsonObj.get("labelMatchingType").isJsonNull()) {
      MappingAttributeLabelMatchingType.validateJsonElement(jsonObj.get("labelMatchingType"));
    }
    // validate the optional field `metadataField`
    if (jsonObj.get("metadataField") != null && !jsonObj.get("metadataField").isJsonNull()) {
      MappingAttributeMetadataField.validateJsonElement(jsonObj.get("metadataField"));
    }
    if ((jsonObj.get("validationRegex") != null && !jsonObj.get("validationRegex").isJsonNull())
        && !jsonObj.get("validationRegex").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `validationRegex` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("validationRegex").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!MappingAttribute.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'MappingAttribute' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<MappingAttribute> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(MappingAttribute.class));

      return (TypeAdapter<T>) new TypeAdapter<MappingAttribute>() {
        @Override
        public void write(JsonWriter out, MappingAttribute value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public MappingAttribute read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of MappingAttribute given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MappingAttribute
   * @throws IOException if the JSON string is invalid with respect to MappingAttribute
   */
  public static MappingAttribute fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MappingAttribute.class);
  }

  /**
   * Convert an instance of MappingAttribute to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

