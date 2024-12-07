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
 * The version of the OpenAPI document: 1.16.1 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import com.formkiq.client.model.AttributeSchemaCompositeKey;
import com.formkiq.client.model.AttributeSchemaOptional;
import com.formkiq.client.model.AttributeSchemaRequired;
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
 * SchemaAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2025-01-10T23:07:47.624119-06:00[America/Winnipeg]",
    comments = "Generator version: 7.10.0")
public class SchemaAttributes {
  public static final String SERIALIZED_NAME_COMPOSITE_KEYS = "compositeKeys";
  @SerializedName(SERIALIZED_NAME_COMPOSITE_KEYS)
  @javax.annotation.Nullable
  private List<AttributeSchemaCompositeKey> compositeKeys = new ArrayList<>();

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  @javax.annotation.Nullable
  private List<AttributeSchemaRequired> required = new ArrayList<>();

  public static final String SERIALIZED_NAME_OPTIONAL = "optional";
  @SerializedName(SERIALIZED_NAME_OPTIONAL)
  @javax.annotation.Nullable
  private List<AttributeSchemaOptional> optional = new ArrayList<>();

  public static final String SERIALIZED_NAME_ALLOW_ADDITIONAL_ATTRIBUTES =
      "allowAdditionalAttributes";
  @SerializedName(SERIALIZED_NAME_ALLOW_ADDITIONAL_ATTRIBUTES)
  @javax.annotation.Nullable
  private Boolean allowAdditionalAttributes = true;

  public SchemaAttributes() {}

  public SchemaAttributes compositeKeys(
      @javax.annotation.Nullable List<AttributeSchemaCompositeKey> compositeKeys) {
    this.compositeKeys = compositeKeys;
    return this;
  }

  public SchemaAttributes addCompositeKeysItem(AttributeSchemaCompositeKey compositeKeysItem) {
    if (this.compositeKeys == null) {
      this.compositeKeys = new ArrayList<>();
    }
    this.compositeKeys.add(compositeKeysItem);
    return this;
  }

  /**
   * List of Composite Keys
   * 
   * @return compositeKeys
   */
  @javax.annotation.Nullable
  public List<AttributeSchemaCompositeKey> getCompositeKeys() {
    return compositeKeys;
  }

  public void setCompositeKeys(
      @javax.annotation.Nullable List<AttributeSchemaCompositeKey> compositeKeys) {
    this.compositeKeys = compositeKeys;
  }


  public SchemaAttributes required(
      @javax.annotation.Nullable List<AttributeSchemaRequired> required) {
    this.required = required;
    return this;
  }

  public SchemaAttributes addRequiredItem(AttributeSchemaRequired requiredItem) {
    if (this.required == null) {
      this.required = new ArrayList<>();
    }
    this.required.add(requiredItem);
    return this;
  }

  /**
   * List of Required Attributes
   * 
   * @return required
   */
  @javax.annotation.Nullable
  public List<AttributeSchemaRequired> getRequired() {
    return required;
  }

  public void setRequired(@javax.annotation.Nullable List<AttributeSchemaRequired> required) {
    this.required = required;
  }


  public SchemaAttributes optional(
      @javax.annotation.Nullable List<AttributeSchemaOptional> optional) {
    this.optional = optional;
    return this;
  }

  public SchemaAttributes addOptionalItem(AttributeSchemaOptional optionalItem) {
    if (this.optional == null) {
      this.optional = new ArrayList<>();
    }
    this.optional.add(optionalItem);
    return this;
  }

  /**
   * List of Optional Attribute
   * 
   * @return optional
   */
  @javax.annotation.Nullable
  public List<AttributeSchemaOptional> getOptional() {
    return optional;
  }

  public void setOptional(@javax.annotation.Nullable List<AttributeSchemaOptional> optional) {
    this.optional = optional;
  }


  public SchemaAttributes allowAdditionalAttributes(
      @javax.annotation.Nullable Boolean allowAdditionalAttributes) {
    this.allowAdditionalAttributes = allowAdditionalAttributes;
    return this;
  }

  /**
   * Get allowAdditionalAttributes
   * 
   * @return allowAdditionalAttributes
   */
  @javax.annotation.Nullable
  public Boolean getAllowAdditionalAttributes() {
    return allowAdditionalAttributes;
  }

  public void setAllowAdditionalAttributes(
      @javax.annotation.Nullable Boolean allowAdditionalAttributes) {
    this.allowAdditionalAttributes = allowAdditionalAttributes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemaAttributes schemaAttributes = (SchemaAttributes) o;
    return Objects.equals(this.compositeKeys, schemaAttributes.compositeKeys)
        && Objects.equals(this.required, schemaAttributes.required)
        && Objects.equals(this.optional, schemaAttributes.optional) && Objects
            .equals(this.allowAdditionalAttributes, schemaAttributes.allowAdditionalAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compositeKeys, required, optional, allowAdditionalAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemaAttributes {\n");
    sb.append("    compositeKeys: ").append(toIndentedString(compositeKeys)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    allowAdditionalAttributes: ").append(toIndentedString(allowAdditionalAttributes))
        .append("\n");
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
    openapiFields.add("compositeKeys");
    openapiFields.add("required");
    openapiFields.add("optional");
    openapiFields.add("allowAdditionalAttributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SchemaAttributes
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!SchemaAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                               // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in SchemaAttributes is not found in the empty JSON string",
            SchemaAttributes.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!SchemaAttributes.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `SchemaAttributes` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if (jsonObj.get("compositeKeys") != null && !jsonObj.get("compositeKeys").isJsonNull()) {
      JsonArray jsonArraycompositeKeys = jsonObj.getAsJsonArray("compositeKeys");
      if (jsonArraycompositeKeys != null) {
        // ensure the json data is an array
        if (!jsonObj.get("compositeKeys").isJsonArray()) {
          throw new IllegalArgumentException(String.format(
              "Expected the field `compositeKeys` to be an array in the JSON string but got `%s`",
              jsonObj.get("compositeKeys").toString()));
        }

        // validate the optional field `compositeKeys` (array)
        for (int i = 0; i < jsonArraycompositeKeys.size(); i++) {
          AttributeSchemaCompositeKey.validateJsonElement(jsonArraycompositeKeys.get(i));
        } ;
      }
    }
    if (jsonObj.get("required") != null && !jsonObj.get("required").isJsonNull()) {
      JsonArray jsonArrayrequired = jsonObj.getAsJsonArray("required");
      if (jsonArrayrequired != null) {
        // ensure the json data is an array
        if (!jsonObj.get("required").isJsonArray()) {
          throw new IllegalArgumentException(String.format(
              "Expected the field `required` to be an array in the JSON string but got `%s`",
              jsonObj.get("required").toString()));
        }

        // validate the optional field `required` (array)
        for (int i = 0; i < jsonArrayrequired.size(); i++) {
          AttributeSchemaRequired.validateJsonElement(jsonArrayrequired.get(i));
        } ;
      }
    }
    if (jsonObj.get("optional") != null && !jsonObj.get("optional").isJsonNull()) {
      JsonArray jsonArrayoptional = jsonObj.getAsJsonArray("optional");
      if (jsonArrayoptional != null) {
        // ensure the json data is an array
        if (!jsonObj.get("optional").isJsonArray()) {
          throw new IllegalArgumentException(String.format(
              "Expected the field `optional` to be an array in the JSON string but got `%s`",
              jsonObj.get("optional").toString()));
        }

        // validate the optional field `optional` (array)
        for (int i = 0; i < jsonArrayoptional.size(); i++) {
          AttributeSchemaOptional.validateJsonElement(jsonArrayoptional.get(i));
        } ;
      }
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!SchemaAttributes.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'SchemaAttributes' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<SchemaAttributes> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(SchemaAttributes.class));

      return (TypeAdapter<T>) new TypeAdapter<SchemaAttributes>() {
        @Override
        public void write(JsonWriter out, SchemaAttributes value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public SchemaAttributes read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of SchemaAttributes given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SchemaAttributes
   * @throws IOException if the JSON string is invalid with respect to SchemaAttributes
   */
  public static SchemaAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SchemaAttributes.class);
  }

  /**
   * Convert an instance of SchemaAttributes to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

