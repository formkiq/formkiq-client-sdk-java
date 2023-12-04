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
import com.formkiq.client.model.OnlyOfficeConfig;
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
 * OnlyOfficeDocumentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-12-03T21:57:24.695816-06:00[America/Winnipeg]")
public class OnlyOfficeDocumentResponse {
  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private OnlyOfficeConfig config;

  public OnlyOfficeDocumentResponse() {}

  public OnlyOfficeDocumentResponse config(OnlyOfficeConfig config) {

    this.config = config;
    return this;
  }

  /**
   * Get config
   * 
   * @return config
   **/
  @javax.annotation.Nullable
  public OnlyOfficeConfig getConfig() {
    return config;
  }


  public void setConfig(OnlyOfficeConfig config) {
    this.config = config;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnlyOfficeDocumentResponse onlyOfficeDocumentResponse = (OnlyOfficeDocumentResponse) o;
    return Objects.equals(this.config, onlyOfficeDocumentResponse.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnlyOfficeDocumentResponse {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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
    openapiFields.add("config");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OnlyOfficeDocumentResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!OnlyOfficeDocumentResponse.openapiRequiredFields.isEmpty()) { // has required fields but
                                                                         // JSON element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in OnlyOfficeDocumentResponse is not found in the empty JSON string",
            OnlyOfficeDocumentResponse.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!OnlyOfficeDocumentResponse.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `OnlyOfficeDocumentResponse` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the optional field `config`
    if (jsonObj.get("config") != null && !jsonObj.get("config").isJsonNull()) {
      OnlyOfficeConfig.validateJsonElement(jsonObj.get("config"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!OnlyOfficeDocumentResponse.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'OnlyOfficeDocumentResponse' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<OnlyOfficeDocumentResponse> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(OnlyOfficeDocumentResponse.class));

      return (TypeAdapter<T>) new TypeAdapter<OnlyOfficeDocumentResponse>() {
        @Override
        public void write(JsonWriter out, OnlyOfficeDocumentResponse value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public OnlyOfficeDocumentResponse read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of OnlyOfficeDocumentResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OnlyOfficeDocumentResponse
   * @throws IOException if the JSON string is invalid with respect to OnlyOfficeDocumentResponse
   */
  public static OnlyOfficeDocumentResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnlyOfficeDocumentResponse.class);
  }

  /**
   * Convert an instance of OnlyOfficeDocumentResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

