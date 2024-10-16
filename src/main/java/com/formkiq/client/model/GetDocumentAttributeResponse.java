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
import com.formkiq.client.model.DocumentAttribute;
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
 * GetDocumentAttributeResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-10-15T23:10:22.074601-05:00[America/Winnipeg]",
    comments = "Generator version: 7.9.0")
public class GetDocumentAttributeResponse {
  public static final String SERIALIZED_NAME_ATTRIBUTE = "attribute";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE)
  private DocumentAttribute attribute;

  public GetDocumentAttributeResponse() {}

  public GetDocumentAttributeResponse attribute(DocumentAttribute attribute) {
    this.attribute = attribute;
    return this;
  }

  /**
   * Get attribute
   * 
   * @return attribute
   */
  @javax.annotation.Nullable
  public DocumentAttribute getAttribute() {
    return attribute;
  }

  public void setAttribute(DocumentAttribute attribute) {
    this.attribute = attribute;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocumentAttributeResponse getDocumentAttributeResponse = (GetDocumentAttributeResponse) o;
    return Objects.equals(this.attribute, getDocumentAttributeResponse.attribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocumentAttributeResponse {\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
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
    openapiFields.add("attribute");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetDocumentAttributeResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!GetDocumentAttributeResponse.openapiRequiredFields.isEmpty()) { // has required fields
                                                                           // but JSON element is
                                                                           // null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in GetDocumentAttributeResponse is not found in the empty JSON string",
            GetDocumentAttributeResponse.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!GetDocumentAttributeResponse.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `GetDocumentAttributeResponse` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the optional field `attribute`
    if (jsonObj.get("attribute") != null && !jsonObj.get("attribute").isJsonNull()) {
      DocumentAttribute.validateJsonElement(jsonObj.get("attribute"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!GetDocumentAttributeResponse.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'GetDocumentAttributeResponse' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<GetDocumentAttributeResponse> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(GetDocumentAttributeResponse.class));

      return (TypeAdapter<T>) new TypeAdapter<GetDocumentAttributeResponse>() {
        @Override
        public void write(JsonWriter out, GetDocumentAttributeResponse value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public GetDocumentAttributeResponse read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of GetDocumentAttributeResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetDocumentAttributeResponse
   * @throws IOException if the JSON string is invalid with respect to GetDocumentAttributeResponse
   */
  public static GetDocumentAttributeResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetDocumentAttributeResponse.class);
  }

  /**
   * Convert an instance of GetDocumentAttributeResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

