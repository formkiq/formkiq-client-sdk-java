/*
 * FormKiQ HTTP API Formkiq API: Document Management Platform API using OAuth(JWT) Authentication
 * You can find out more about FormKiQ at [https://formkiq.com](http://formkiq.com). ## Introduction
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
 * The version of the OpenAPI document: 1.13.0 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import com.formkiq.client.model.TagSchemaCompositeKey;
import com.formkiq.client.model.TagSchemaOptional;
import com.formkiq.client.model.TagSchemaRequired;
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
 * TagSchemaTags
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-11-11T20:33:52.265263-06:00[America/Winnipeg]")
public class TagSchemaTags {
  public static final String SERIALIZED_NAME_COMPOSITE_KEYS = "compositeKeys";
  @SerializedName(SERIALIZED_NAME_COMPOSITE_KEYS)
  private List<TagSchemaCompositeKey> compositeKeys;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private List<TagSchemaRequired> required;

  public static final String SERIALIZED_NAME_OPTIONAL = "optional";
  @SerializedName(SERIALIZED_NAME_OPTIONAL)
  private List<TagSchemaOptional> optional;

  public static final String SERIALIZED_NAME_ALLOW_ADDITIONAL_TAGS = "allowAdditionalTags";
  @SerializedName(SERIALIZED_NAME_ALLOW_ADDITIONAL_TAGS)
  private Boolean allowAdditionalTags = true;

  public TagSchemaTags() {}

  public TagSchemaTags compositeKeys(List<TagSchemaCompositeKey> compositeKeys) {

    this.compositeKeys = compositeKeys;
    return this;
  }

  public TagSchemaTags addCompositeKeysItem(TagSchemaCompositeKey compositeKeysItem) {
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
   **/
  @javax.annotation.Nullable
  public List<TagSchemaCompositeKey> getCompositeKeys() {
    return compositeKeys;
  }


  public void setCompositeKeys(List<TagSchemaCompositeKey> compositeKeys) {
    this.compositeKeys = compositeKeys;
  }


  public TagSchemaTags required(List<TagSchemaRequired> required) {

    this.required = required;
    return this;
  }

  public TagSchemaTags addRequiredItem(TagSchemaRequired requiredItem) {
    if (this.required == null) {
      this.required = new ArrayList<>();
    }
    this.required.add(requiredItem);
    return this;
  }

  /**
   * List of Required Tags
   * 
   * @return required
   **/
  @javax.annotation.Nullable
  public List<TagSchemaRequired> getRequired() {
    return required;
  }


  public void setRequired(List<TagSchemaRequired> required) {
    this.required = required;
  }


  public TagSchemaTags optional(List<TagSchemaOptional> optional) {

    this.optional = optional;
    return this;
  }

  public TagSchemaTags addOptionalItem(TagSchemaOptional optionalItem) {
    if (this.optional == null) {
      this.optional = new ArrayList<>();
    }
    this.optional.add(optionalItem);
    return this;
  }

  /**
   * List of Optional Tags
   * 
   * @return optional
   **/
  @javax.annotation.Nullable
  public List<TagSchemaOptional> getOptional() {
    return optional;
  }


  public void setOptional(List<TagSchemaOptional> optional) {
    this.optional = optional;
  }


  public TagSchemaTags allowAdditionalTags(Boolean allowAdditionalTags) {

    this.allowAdditionalTags = allowAdditionalTags;
    return this;
  }

  /**
   * Get allowAdditionalTags
   * 
   * @return allowAdditionalTags
   **/
  @javax.annotation.Nullable
  public Boolean getAllowAdditionalTags() {
    return allowAdditionalTags;
  }


  public void setAllowAdditionalTags(Boolean allowAdditionalTags) {
    this.allowAdditionalTags = allowAdditionalTags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagSchemaTags tagSchemaTags = (TagSchemaTags) o;
    return Objects.equals(this.compositeKeys, tagSchemaTags.compositeKeys)
        && Objects.equals(this.required, tagSchemaTags.required)
        && Objects.equals(this.optional, tagSchemaTags.optional)
        && Objects.equals(this.allowAdditionalTags, tagSchemaTags.allowAdditionalTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compositeKeys, required, optional, allowAdditionalTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagSchemaTags {\n");
    sb.append("    compositeKeys: ").append(toIndentedString(compositeKeys)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    allowAdditionalTags: ").append(toIndentedString(allowAdditionalTags))
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
    openapiFields.add("allowAdditionalTags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TagSchemaTags
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!TagSchemaTags.openapiRequiredFields.isEmpty()) { // has required fields but JSON element
                                                            // is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in TagSchemaTags is not found in the empty JSON string",
            TagSchemaTags.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!TagSchemaTags.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `TagSchemaTags` properties. JSON: %s",
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
          TagSchemaCompositeKey.validateJsonElement(jsonArraycompositeKeys.get(i));
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
          TagSchemaRequired.validateJsonElement(jsonArrayrequired.get(i));
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
          TagSchemaOptional.validateJsonElement(jsonArrayoptional.get(i));
        } ;
      }
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!TagSchemaTags.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'TagSchemaTags' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<TagSchemaTags> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(TagSchemaTags.class));

      return (TypeAdapter<T>) new TypeAdapter<TagSchemaTags>() {
        @Override
        public void write(JsonWriter out, TagSchemaTags value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public TagSchemaTags read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of TagSchemaTags given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TagSchemaTags
   * @throws IOException if the JSON string is invalid with respect to TagSchemaTags
   */
  public static TagSchemaTags fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TagSchemaTags.class);
  }

  /**
   * Convert an instance of TagSchemaTags to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

