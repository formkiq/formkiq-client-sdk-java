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
 * The version of the OpenAPI document: 1.14.0 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import com.formkiq.client.model.AccessAttribute;
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
 * List of document access attributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-03-18T19:11:59.103684-05:00[America/Winnipeg]",
    comments = "Generator version: 7.4.0")
public class GetDocumentAccessAttributesResponse {
  public static final String SERIALIZED_NAME_ACCESS_ATTRIBUTES = "accessAttributes";
  @SerializedName(SERIALIZED_NAME_ACCESS_ATTRIBUTES)
  private List<AccessAttribute> accessAttributes;

  public GetDocumentAccessAttributesResponse() {}

  public GetDocumentAccessAttributesResponse accessAttributes(
      List<AccessAttribute> accessAttributes) {
    this.accessAttributes = accessAttributes;
    return this;
  }

  public GetDocumentAccessAttributesResponse addAccessAttributesItem(
      AccessAttribute accessAttributesItem) {
    if (this.accessAttributes == null) {
      this.accessAttributes = new ArrayList<>();
    }
    this.accessAttributes.add(accessAttributesItem);
    return this;
  }

  /**
   * List of document access attributes
   * 
   * @return accessAttributes
   **/
  @javax.annotation.Nullable
  public List<AccessAttribute> getAccessAttributes() {
    return accessAttributes;
  }

  public void setAccessAttributes(List<AccessAttribute> accessAttributes) {
    this.accessAttributes = accessAttributes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocumentAccessAttributesResponse getDocumentAccessAttributesResponse =
        (GetDocumentAccessAttributesResponse) o;
    return Objects.equals(this.accessAttributes,
        getDocumentAccessAttributesResponse.accessAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocumentAccessAttributesResponse {\n");
    sb.append("    accessAttributes: ").append(toIndentedString(accessAttributes)).append("\n");
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
    openapiFields.add("accessAttributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to
   *         GetDocumentAccessAttributesResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!GetDocumentAccessAttributesResponse.openapiRequiredFields.isEmpty()) { // has required
                                                                                  // fields but JSON
                                                                                  // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in GetDocumentAccessAttributesResponse is not found in the empty JSON string",
            GetDocumentAccessAttributesResponse.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!GetDocumentAccessAttributesResponse.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `GetDocumentAccessAttributesResponse` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if (jsonObj.get("accessAttributes") != null && !jsonObj.get("accessAttributes").isJsonNull()) {
      JsonArray jsonArrayaccessAttributes = jsonObj.getAsJsonArray("accessAttributes");
      if (jsonArrayaccessAttributes != null) {
        // ensure the json data is an array
        if (!jsonObj.get("accessAttributes").isJsonArray()) {
          throw new IllegalArgumentException(String.format(
              "Expected the field `accessAttributes` to be an array in the JSON string but got `%s`",
              jsonObj.get("accessAttributes").toString()));
        }

        // validate the optional field `accessAttributes` (array)
        for (int i = 0; i < jsonArrayaccessAttributes.size(); i++) {
          AccessAttribute.validateJsonElement(jsonArrayaccessAttributes.get(i));
        } ;
      }
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!GetDocumentAccessAttributesResponse.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'GetDocumentAccessAttributesResponse' and its
                     // subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<GetDocumentAccessAttributesResponse> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(GetDocumentAccessAttributesResponse.class));

      return (TypeAdapter<T>) new TypeAdapter<GetDocumentAccessAttributesResponse>() {
        @Override
        public void write(JsonWriter out, GetDocumentAccessAttributesResponse value)
            throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public GetDocumentAccessAttributesResponse read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of GetDocumentAccessAttributesResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetDocumentAccessAttributesResponse
   * @throws IOException if the JSON string is invalid with respect to
   *         GetDocumentAccessAttributesResponse
   */
  public static GetDocumentAccessAttributesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetDocumentAccessAttributesResponse.class);
  }

  /**
   * Convert an instance of GetDocumentAccessAttributesResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

