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
 * The version of the OpenAPI document: 1.14.0 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import com.formkiq.client.model.DocumentSearch;
import com.formkiq.client.model.SearchResponseFields;
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
 * Document search tag criteria
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-01-21T10:52:57.550791-06:00[America/Winnipeg]")
public class DocumentSearchRequest {
  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private DocumentSearch query;

  public static final String SERIALIZED_NAME_RESPONSE_FIELDS = "responseFields";
  @SerializedName(SERIALIZED_NAME_RESPONSE_FIELDS)
  private SearchResponseFields responseFields;

  public DocumentSearchRequest() {}

  public DocumentSearchRequest query(DocumentSearch query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
   * 
   * @return query
   **/
  @javax.annotation.Nonnull
  public DocumentSearch getQuery() {
    return query;
  }

  public void setQuery(DocumentSearch query) {
    this.query = query;
  }


  public DocumentSearchRequest responseFields(SearchResponseFields responseFields) {
    this.responseFields = responseFields;
    return this;
  }

  /**
   * Get responseFields
   * 
   * @return responseFields
   **/
  @javax.annotation.Nullable
  public SearchResponseFields getResponseFields() {
    return responseFields;
  }

  public void setResponseFields(SearchResponseFields responseFields) {
    this.responseFields = responseFields;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentSearchRequest documentSearchRequest = (DocumentSearchRequest) o;
    return Objects.equals(this.query, documentSearchRequest.query)
        && Objects.equals(this.responseFields, documentSearchRequest.responseFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, responseFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentSearchRequest {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    responseFields: ").append(toIndentedString(responseFields)).append("\n");
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
    openapiFields.add("query");
    openapiFields.add("responseFields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("query");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocumentSearchRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!DocumentSearchRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                    // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in DocumentSearchRequest is not found in the empty JSON string",
            DocumentSearchRequest.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!DocumentSearchRequest.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `DocumentSearchRequest` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : DocumentSearchRequest.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format("The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the required field `query`
    DocumentSearch.validateJsonElement(jsonObj.get("query"));
    // validate the optional field `responseFields`
    if (jsonObj.get("responseFields") != null && !jsonObj.get("responseFields").isJsonNull()) {
      SearchResponseFields.validateJsonElement(jsonObj.get("responseFields"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!DocumentSearchRequest.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'DocumentSearchRequest' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<DocumentSearchRequest> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(DocumentSearchRequest.class));

      return (TypeAdapter<T>) new TypeAdapter<DocumentSearchRequest>() {
        @Override
        public void write(JsonWriter out, DocumentSearchRequest value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public DocumentSearchRequest read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of DocumentSearchRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocumentSearchRequest
   * @throws IOException if the JSON string is invalid with respect to DocumentSearchRequest
   */
  public static DocumentSearchRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentSearchRequest.class);
  }

  /**
   * Convert an instance of DocumentSearchRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

