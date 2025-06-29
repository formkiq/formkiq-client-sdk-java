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
import com.formkiq.client.model.LocaleResourceType;
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
 * AddLocaleResourceSchemaItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2025-05-20T14:44:33.741519-05:00[America/Winnipeg]",
    comments = "Generator version: 7.13.0")
public class AddLocaleResourceSchemaItem {
  public static final String SERIALIZED_NAME_ITEM_TYPE = "itemType";
  @SerializedName(SERIALIZED_NAME_ITEM_TYPE)
  @javax.annotation.Nonnull
  private LocaleResourceType itemType;

  public static final String SERIALIZED_NAME_ATTRIBUTE_KEY = "attributeKey";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_KEY)
  @javax.annotation.Nonnull
  private String attributeKey;

  public static final String SERIALIZED_NAME_ALLOWED_VALUE = "allowedValue";
  @SerializedName(SERIALIZED_NAME_ALLOWED_VALUE)
  @javax.annotation.Nonnull
  private String allowedValue;

  public static final String SERIALIZED_NAME_LOCALIZED_VALUE = "localizedValue";
  @SerializedName(SERIALIZED_NAME_LOCALIZED_VALUE)
  @javax.annotation.Nonnull
  private String localizedValue;

  public AddLocaleResourceSchemaItem() {}

  public AddLocaleResourceSchemaItem itemType(
      @javax.annotation.Nonnull LocaleResourceType itemType) {
    this.itemType = itemType;
    return this;
  }

  /**
   * Get itemType
   * 
   * @return itemType
   */
  @javax.annotation.Nonnull
  public LocaleResourceType getItemType() {
    return itemType;
  }

  public void setItemType(@javax.annotation.Nonnull LocaleResourceType itemType) {
    this.itemType = itemType;
  }


  public AddLocaleResourceSchemaItem attributeKey(@javax.annotation.Nonnull String attributeKey) {
    this.attributeKey = attributeKey;
    return this;
  }

  /**
   * Attribute Key
   * 
   * @return attributeKey
   */
  @javax.annotation.Nonnull
  public String getAttributeKey() {
    return attributeKey;
  }

  public void setAttributeKey(@javax.annotation.Nonnull String attributeKey) {
    this.attributeKey = attributeKey;
  }


  public AddLocaleResourceSchemaItem allowedValue(@javax.annotation.Nonnull String allowedValue) {
    this.allowedValue = allowedValue;
    return this;
  }

  /**
   * Resource value
   * 
   * @return allowedValue
   */
  @javax.annotation.Nonnull
  public String getAllowedValue() {
    return allowedValue;
  }

  public void setAllowedValue(@javax.annotation.Nonnull String allowedValue) {
    this.allowedValue = allowedValue;
  }


  public AddLocaleResourceSchemaItem localizedValue(
      @javax.annotation.Nonnull String localizedValue) {
    this.localizedValue = localizedValue;
    return this;
  }

  /**
   * Localized Value
   * 
   * @return localizedValue
   */
  @javax.annotation.Nonnull
  public String getLocalizedValue() {
    return localizedValue;
  }

  public void setLocalizedValue(@javax.annotation.Nonnull String localizedValue) {
    this.localizedValue = localizedValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddLocaleResourceSchemaItem addLocaleResourceSchemaItem = (AddLocaleResourceSchemaItem) o;
    return Objects.equals(this.itemType, addLocaleResourceSchemaItem.itemType)
        && Objects.equals(this.attributeKey, addLocaleResourceSchemaItem.attributeKey)
        && Objects.equals(this.allowedValue, addLocaleResourceSchemaItem.allowedValue)
        && Objects.equals(this.localizedValue, addLocaleResourceSchemaItem.localizedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemType, attributeKey, allowedValue, localizedValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddLocaleResourceSchemaItem {\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    attributeKey: ").append(toIndentedString(attributeKey)).append("\n");
    sb.append("    allowedValue: ").append(toIndentedString(allowedValue)).append("\n");
    sb.append("    localizedValue: ").append(toIndentedString(localizedValue)).append("\n");
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
    openapiFields.add("itemType");
    openapiFields.add("attributeKey");
    openapiFields.add("allowedValue");
    openapiFields.add("localizedValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("itemType");
    openapiRequiredFields.add("attributeKey");
    openapiRequiredFields.add("allowedValue");
    openapiRequiredFields.add("localizedValue");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AddLocaleResourceSchemaItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!AddLocaleResourceSchemaItem.openapiRequiredFields.isEmpty()) { // has required fields but
                                                                          // JSON element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in AddLocaleResourceSchemaItem is not found in the empty JSON string",
            AddLocaleResourceSchemaItem.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!AddLocaleResourceSchemaItem.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `AddLocaleResourceSchemaItem` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : AddLocaleResourceSchemaItem.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format("The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the required field `itemType`
    LocaleResourceType.validateJsonElement(jsonObj.get("itemType"));
    if (!jsonObj.get("attributeKey").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `attributeKey` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("attributeKey").toString()));
    }
    if (!jsonObj.get("allowedValue").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `allowedValue` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("allowedValue").toString()));
    }
    if (!jsonObj.get("localizedValue").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `localizedValue` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("localizedValue").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!AddLocaleResourceSchemaItem.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'AddLocaleResourceSchemaItem' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<AddLocaleResourceSchemaItem> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(AddLocaleResourceSchemaItem.class));

      return (TypeAdapter<T>) new TypeAdapter<AddLocaleResourceSchemaItem>() {
        @Override
        public void write(JsonWriter out, AddLocaleResourceSchemaItem value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public AddLocaleResourceSchemaItem read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of AddLocaleResourceSchemaItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AddLocaleResourceSchemaItem
   * @throws IOException if the JSON string is invalid with respect to AddLocaleResourceSchemaItem
   */
  public static AddLocaleResourceSchemaItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddLocaleResourceSchemaItem.class);
  }

  /**
   * Convert an instance of AddLocaleResourceSchemaItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

