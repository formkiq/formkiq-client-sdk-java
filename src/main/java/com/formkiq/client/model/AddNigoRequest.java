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
import com.formkiq.client.model.AddNigo;
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
 * AddNigoRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-08-13T19:59:27.914669-05:00[America/Winnipeg]",
    comments = "Generator version: 7.7.0")
public class AddNigoRequest {
  public static final String SERIALIZED_NAME_NIGO = "nigo";
  @SerializedName(SERIALIZED_NAME_NIGO)
  private AddNigo nigo;

  public AddNigoRequest() {}

  public AddNigoRequest nigo(AddNigo nigo) {
    this.nigo = nigo;
    return this;
  }

  /**
   * Get nigo
   * 
   * @return nigo
   */
  @javax.annotation.Nonnull
  public AddNigo getNigo() {
    return nigo;
  }

  public void setNigo(AddNigo nigo) {
    this.nigo = nigo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddNigoRequest addNigoRequest = (AddNigoRequest) o;
    return Objects.equals(this.nigo, addNigoRequest.nigo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nigo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddNigoRequest {\n");
    sb.append("    nigo: ").append(toIndentedString(nigo)).append("\n");
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
    openapiFields.add("nigo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("nigo");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AddNigoRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!AddNigoRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element
                                                             // is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in AddNigoRequest is not found in the empty JSON string",
            AddNigoRequest.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!AddNigoRequest.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `AddNigoRequest` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : AddNigoRequest.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format("The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the required field `nigo`
    AddNigo.validateJsonElement(jsonObj.get("nigo"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!AddNigoRequest.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'AddNigoRequest' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<AddNigoRequest> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(AddNigoRequest.class));

      return (TypeAdapter<T>) new TypeAdapter<AddNigoRequest>() {
        @Override
        public void write(JsonWriter out, AddNigoRequest value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public AddNigoRequest read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of AddNigoRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AddNigoRequest
   * @throws IOException if the JSON string is invalid with respect to AddNigoRequest
   */
  public static AddNigoRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddNigoRequest.class);
  }

  /**
   * Convert an instance of AddNigoRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

