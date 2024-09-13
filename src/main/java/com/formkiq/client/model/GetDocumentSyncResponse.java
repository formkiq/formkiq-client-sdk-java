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
import com.formkiq.client.model.GetDocumentSync;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.formkiq.client.invoker.JSON;

/**
 * GetDocumentSyncResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-09-13T15:19:27.358609-05:00[America/Winnipeg]",
    comments = "Generator version: 7.8.0")
public class GetDocumentSyncResponse {
  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private String next;

  public static final String SERIALIZED_NAME_SYNCS = "syncs";
  @SerializedName(SERIALIZED_NAME_SYNCS)
  private List<GetDocumentSync> syncs = new ArrayList<>();

  public GetDocumentSyncResponse() {}

  public GetDocumentSyncResponse next(String next) {
    this.next = next;
    return this;
  }

  /**
   * Next page of results token
   * 
   * @return next
   */
  @javax.annotation.Nullable
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }


  public GetDocumentSyncResponse syncs(List<GetDocumentSync> syncs) {
    this.syncs = syncs;
    return this;
  }

  public GetDocumentSyncResponse addSyncsItem(GetDocumentSync syncsItem) {
    if (this.syncs == null) {
      this.syncs = new ArrayList<>();
    }
    this.syncs.add(syncsItem);
    return this;
  }

  /**
   * List of document syncs
   * 
   * @return syncs
   */
  @javax.annotation.Nullable
  public List<GetDocumentSync> getSyncs() {
    return syncs;
  }

  public void setSyncs(List<GetDocumentSync> syncs) {
    this.syncs = syncs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocumentSyncResponse getDocumentSyncResponse = (GetDocumentSyncResponse) o;
    return Objects.equals(this.next, getDocumentSyncResponse.next)
        && Objects.equals(this.syncs, getDocumentSyncResponse.syncs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(next, syncs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocumentSyncResponse {\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    syncs: ").append(toIndentedString(syncs)).append("\n");
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
    openapiFields.add("next");
    openapiFields.add("syncs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetDocumentSyncResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!GetDocumentSyncResponse.openapiRequiredFields.isEmpty()) { // has required fields but
                                                                      // JSON element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in GetDocumentSyncResponse is not found in the empty JSON string",
            GetDocumentSyncResponse.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!GetDocumentSyncResponse.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `GetDocumentSyncResponse` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("next") != null && !jsonObj.get("next").isJsonNull())
        && !jsonObj.get("next").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `next` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("next").toString()));
    }
    if (jsonObj.get("syncs") != null && !jsonObj.get("syncs").isJsonNull()) {
      JsonArray jsonArraysyncs = jsonObj.getAsJsonArray("syncs");
      if (jsonArraysyncs != null) {
        // ensure the json data is an array
        if (!jsonObj.get("syncs").isJsonArray()) {
          throw new IllegalArgumentException(String.format(
              "Expected the field `syncs` to be an array in the JSON string but got `%s`",
              jsonObj.get("syncs").toString()));
        }

        // validate the optional field `syncs` (array)
        for (int i = 0; i < jsonArraysyncs.size(); i++) {
          GetDocumentSync.validateJsonElement(jsonArraysyncs.get(i));
        } ;
      }
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!GetDocumentSyncResponse.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'GetDocumentSyncResponse' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<GetDocumentSyncResponse> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(GetDocumentSyncResponse.class));

      return (TypeAdapter<T>) new TypeAdapter<GetDocumentSyncResponse>() {
        @Override
        public void write(JsonWriter out, GetDocumentSyncResponse value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public GetDocumentSyncResponse read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of GetDocumentSyncResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetDocumentSyncResponse
   * @throws IOException if the JSON string is invalid with respect to GetDocumentSyncResponse
   */
  public static GetDocumentSyncResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetDocumentSyncResponse.class);
  }

  /**
   * Convert an instance of GetDocumentSyncResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

