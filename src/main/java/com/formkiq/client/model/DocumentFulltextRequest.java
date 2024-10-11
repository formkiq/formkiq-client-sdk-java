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
import com.formkiq.client.model.DocumentFulltextSearch;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.formkiq.client.invoker.JSON;

/**
 * Document full text search
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-10-10T21:27:48.499768-05:00[America/Winnipeg]",
    comments = "Generator version: 7.9.0")
public class DocumentFulltextRequest {
  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private DocumentFulltextSearch query;

  public static final String SERIALIZED_NAME_RESPONSE_FIELDS = "responseFields";
  @SerializedName(SERIALIZED_NAME_RESPONSE_FIELDS)
  private SearchResponseFields responseFields;

  public DocumentFulltextRequest() {}

  public DocumentFulltextRequest query(DocumentFulltextSearch query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
   * 
   * @return query
   */
  @javax.annotation.Nonnull
  public DocumentFulltextSearch getQuery() {
    return query;
  }

  public void setQuery(DocumentFulltextSearch query) {
    this.query = query;
  }


  public DocumentFulltextRequest responseFields(SearchResponseFields responseFields) {
    this.responseFields = responseFields;
    return this;
  }

  /**
   * Get responseFields
   * 
   * @return responseFields
   */
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
    DocumentFulltextRequest documentFulltextRequest = (DocumentFulltextRequest) o;
    return Objects.equals(this.query, documentFulltextRequest.query)
        && Objects.equals(this.responseFields, documentFulltextRequest.responseFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, responseFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentFulltextRequest {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to DocumentFulltextRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!DocumentFulltextRequest.openapiRequiredFields.isEmpty()) { // has required fields but
                                                                      // JSON element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in DocumentFulltextRequest is not found in the empty JSON string",
            DocumentFulltextRequest.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!DocumentFulltextRequest.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `DocumentFulltextRequest` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : DocumentFulltextRequest.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format("The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the required field `query`
    DocumentFulltextSearch.validateJsonElement(jsonObj.get("query"));
    // validate the optional field `responseFields`
    if (jsonObj.get("responseFields") != null && !jsonObj.get("responseFields").isJsonNull()) {
      SearchResponseFields.validateJsonElement(jsonObj.get("responseFields"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!DocumentFulltextRequest.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'DocumentFulltextRequest' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<DocumentFulltextRequest> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(DocumentFulltextRequest.class));

      return (TypeAdapter<T>) new TypeAdapter<DocumentFulltextRequest>() {
        @Override
        public void write(JsonWriter out, DocumentFulltextRequest value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public DocumentFulltextRequest read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of DocumentFulltextRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocumentFulltextRequest
   * @throws IOException if the JSON string is invalid with respect to DocumentFulltextRequest
   */
  public static DocumentFulltextRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentFulltextRequest.class);
  }

  /**
   * Convert an instance of DocumentFulltextRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

