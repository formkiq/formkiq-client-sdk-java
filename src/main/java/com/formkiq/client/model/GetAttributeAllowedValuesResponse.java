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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * GetAttributeAllowedValuesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2025-05-20T14:44:33.741519-05:00[America/Winnipeg]",
    comments = "Generator version: 7.13.0")
public class GetAttributeAllowedValuesResponse {
  public static final String SERIALIZED_NAME_ALLOWED_VALUES = "allowedValues";
  @SerializedName(SERIALIZED_NAME_ALLOWED_VALUES)
  @javax.annotation.Nullable
  private List<String> allowedValues = new ArrayList<>();

  public static final String SERIALIZED_NAME_LOCALIZED_ALLOWED_VALUES = "localizedAllowedValues";
  @SerializedName(SERIALIZED_NAME_LOCALIZED_ALLOWED_VALUES)
  @javax.annotation.Nullable
  private Map<String, String> localizedAllowedValues = new HashMap<>();

  public GetAttributeAllowedValuesResponse() {}

  public GetAttributeAllowedValuesResponse allowedValues(
      @javax.annotation.Nullable List<String> allowedValues) {
    this.allowedValues = allowedValues;
    return this;
  }

  public GetAttributeAllowedValuesResponse addAllowedValuesItem(String allowedValuesItem) {
    if (this.allowedValues == null) {
      this.allowedValues = new ArrayList<>();
    }
    this.allowedValues.add(allowedValuesItem);
    return this;
  }

  /**
   * Attribute&#39;s allowed values
   * 
   * @return allowedValues
   */
  @javax.annotation.Nullable
  public List<String> getAllowedValues() {
    return allowedValues;
  }

  public void setAllowedValues(@javax.annotation.Nullable List<String> allowedValues) {
    this.allowedValues = allowedValues;
  }


  public GetAttributeAllowedValuesResponse localizedAllowedValues(
      @javax.annotation.Nullable Map<String, String> localizedAllowedValues) {
    this.localizedAllowedValues = localizedAllowedValues;
    return this;
  }

  public GetAttributeAllowedValuesResponse putLocalizedAllowedValuesItem(String key,
      String localizedAllowedValuesItem) {
    if (this.localizedAllowedValues == null) {
      this.localizedAllowedValues = new HashMap<>();
    }
    this.localizedAllowedValues.put(key, localizedAllowedValuesItem);
    return this;
  }

  /**
   * Get localizedAllowedValues
   * 
   * @return localizedAllowedValues
   */
  @javax.annotation.Nullable
  public Map<String, String> getLocalizedAllowedValues() {
    return localizedAllowedValues;
  }

  public void setLocalizedAllowedValues(
      @javax.annotation.Nullable Map<String, String> localizedAllowedValues) {
    this.localizedAllowedValues = localizedAllowedValues;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAttributeAllowedValuesResponse getAttributeAllowedValuesResponse =
        (GetAttributeAllowedValuesResponse) o;
    return Objects.equals(this.allowedValues, getAttributeAllowedValuesResponse.allowedValues)
        && Objects.equals(this.localizedAllowedValues,
            getAttributeAllowedValuesResponse.localizedAllowedValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedValues, localizedAllowedValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAttributeAllowedValuesResponse {\n");
    sb.append("    allowedValues: ").append(toIndentedString(allowedValues)).append("\n");
    sb.append("    localizedAllowedValues: ").append(toIndentedString(localizedAllowedValues))
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
    openapiFields.add("allowedValues");
    openapiFields.add("localizedAllowedValues");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to
   *         GetAttributeAllowedValuesResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!GetAttributeAllowedValuesResponse.openapiRequiredFields.isEmpty()) { // has required
                                                                                // fields but JSON
                                                                                // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in GetAttributeAllowedValuesResponse is not found in the empty JSON string",
            GetAttributeAllowedValuesResponse.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!GetAttributeAllowedValuesResponse.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `GetAttributeAllowedValuesResponse` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
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
      if (!GetAttributeAllowedValuesResponse.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'GetAttributeAllowedValuesResponse' and its
                     // subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<GetAttributeAllowedValuesResponse> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(GetAttributeAllowedValuesResponse.class));

      return (TypeAdapter<T>) new TypeAdapter<GetAttributeAllowedValuesResponse>() {
        @Override
        public void write(JsonWriter out, GetAttributeAllowedValuesResponse value)
            throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public GetAttributeAllowedValuesResponse read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of GetAttributeAllowedValuesResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetAttributeAllowedValuesResponse
   * @throws IOException if the JSON string is invalid with respect to
   *         GetAttributeAllowedValuesResponse
   */
  public static GetAttributeAllowedValuesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAttributeAllowedValuesResponse.class);
  }

  /**
   * Convert an instance of GetAttributeAllowedValuesResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

