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
import com.formkiq.client.model.UpdateMatchingDocumentTagsRequestMatch;
import com.formkiq.client.model.UpdateMatchingDocumentTagsRequestUpdate;
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
 * Add/Update of multiple document tag(s) based on document(s) that have the matching tag.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-12-22T14:23:50.813490-06:00[America/Winnipeg]")
public class UpdateMatchingDocumentTagsRequest {
  public static final String SERIALIZED_NAME_MATCH = "match";
  @SerializedName(SERIALIZED_NAME_MATCH)
  private UpdateMatchingDocumentTagsRequestMatch match;

  public static final String SERIALIZED_NAME_UPDATE = "update";
  @SerializedName(SERIALIZED_NAME_UPDATE)
  private UpdateMatchingDocumentTagsRequestUpdate update;

  public UpdateMatchingDocumentTagsRequest() {}

  public UpdateMatchingDocumentTagsRequest match(UpdateMatchingDocumentTagsRequestMatch match) {

    this.match = match;
    return this;
  }

  /**
   * Get match
   * 
   * @return match
   **/
  @javax.annotation.Nonnull
  public UpdateMatchingDocumentTagsRequestMatch getMatch() {
    return match;
  }


  public void setMatch(UpdateMatchingDocumentTagsRequestMatch match) {
    this.match = match;
  }


  public UpdateMatchingDocumentTagsRequest update(UpdateMatchingDocumentTagsRequestUpdate update) {

    this.update = update;
    return this;
  }

  /**
   * Get update
   * 
   * @return update
   **/
  @javax.annotation.Nonnull
  public UpdateMatchingDocumentTagsRequestUpdate getUpdate() {
    return update;
  }


  public void setUpdate(UpdateMatchingDocumentTagsRequestUpdate update) {
    this.update = update;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMatchingDocumentTagsRequest updateMatchingDocumentTagsRequest =
        (UpdateMatchingDocumentTagsRequest) o;
    return Objects.equals(this.match, updateMatchingDocumentTagsRequest.match)
        && Objects.equals(this.update, updateMatchingDocumentTagsRequest.update);
  }

  @Override
  public int hashCode() {
    return Objects.hash(match, update);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMatchingDocumentTagsRequest {\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
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
    openapiFields.add("match");
    openapiFields.add("update");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("match");
    openapiRequiredFields.add("update");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to
   *         UpdateMatchingDocumentTagsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!UpdateMatchingDocumentTagsRequest.openapiRequiredFields.isEmpty()) { // has required
                                                                                // fields but JSON
                                                                                // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in UpdateMatchingDocumentTagsRequest is not found in the empty JSON string",
            UpdateMatchingDocumentTagsRequest.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!UpdateMatchingDocumentTagsRequest.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `UpdateMatchingDocumentTagsRequest` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : UpdateMatchingDocumentTagsRequest.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format("The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the required field `match`
    UpdateMatchingDocumentTagsRequestMatch.validateJsonElement(jsonObj.get("match"));
    // validate the required field `update`
    UpdateMatchingDocumentTagsRequestUpdate.validateJsonElement(jsonObj.get("update"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!UpdateMatchingDocumentTagsRequest.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'UpdateMatchingDocumentTagsRequest' and its
                     // subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<UpdateMatchingDocumentTagsRequest> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(UpdateMatchingDocumentTagsRequest.class));

      return (TypeAdapter<T>) new TypeAdapter<UpdateMatchingDocumentTagsRequest>() {
        @Override
        public void write(JsonWriter out, UpdateMatchingDocumentTagsRequest value)
            throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public UpdateMatchingDocumentTagsRequest read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateMatchingDocumentTagsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateMatchingDocumentTagsRequest
   * @throws IOException if the JSON string is invalid with respect to
   *         UpdateMatchingDocumentTagsRequest
   */
  public static UpdateMatchingDocumentTagsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateMatchingDocumentTagsRequest.class);
  }

  /**
   * Convert an instance of UpdateMatchingDocumentTagsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

