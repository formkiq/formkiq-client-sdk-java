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
 * The version of the OpenAPI document: 1.16.0 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import com.formkiq.client.model.Nigo;
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
 * GetCaseNigosResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-11-11T22:01:15.097051-06:00[America/Winnipeg]",
    comments = "Generator version: 7.9.0")
public class GetCaseNigosResponse {
  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private String next;

  public static final String SERIALIZED_NAME_NIGOS = "nigos";
  @SerializedName(SERIALIZED_NAME_NIGOS)
  private List<Nigo> nigos = new ArrayList<>();

  public GetCaseNigosResponse() {}

  public GetCaseNigosResponse next(String next) {
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


  public GetCaseNigosResponse nigos(List<Nigo> nigos) {
    this.nigos = nigos;
    return this;
  }

  public GetCaseNigosResponse addNigosItem(Nigo nigosItem) {
    if (this.nigos == null) {
      this.nigos = new ArrayList<>();
    }
    this.nigos.add(nigosItem);
    return this;
  }

  /**
   * List of Nigos
   * 
   * @return nigos
   */
  @javax.annotation.Nullable
  public List<Nigo> getNigos() {
    return nigos;
  }

  public void setNigos(List<Nigo> nigos) {
    this.nigos = nigos;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCaseNigosResponse getCaseNigosResponse = (GetCaseNigosResponse) o;
    return Objects.equals(this.next, getCaseNigosResponse.next)
        && Objects.equals(this.nigos, getCaseNigosResponse.nigos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(next, nigos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCaseNigosResponse {\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    nigos: ").append(toIndentedString(nigos)).append("\n");
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
    openapiFields.add("nigos");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetCaseNigosResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!GetCaseNigosResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                   // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in GetCaseNigosResponse is not found in the empty JSON string",
            GetCaseNigosResponse.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!GetCaseNigosResponse.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `GetCaseNigosResponse` properties. JSON: %s",
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
    if (jsonObj.get("nigos") != null && !jsonObj.get("nigos").isJsonNull()) {
      JsonArray jsonArraynigos = jsonObj.getAsJsonArray("nigos");
      if (jsonArraynigos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("nigos").isJsonArray()) {
          throw new IllegalArgumentException(String.format(
              "Expected the field `nigos` to be an array in the JSON string but got `%s`",
              jsonObj.get("nigos").toString()));
        }

        // validate the optional field `nigos` (array)
        for (int i = 0; i < jsonArraynigos.size(); i++) {
          Nigo.validateJsonElement(jsonArraynigos.get(i));
        } ;
      }
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!GetCaseNigosResponse.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'GetCaseNigosResponse' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<GetCaseNigosResponse> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(GetCaseNigosResponse.class));

      return (TypeAdapter<T>) new TypeAdapter<GetCaseNigosResponse>() {
        @Override
        public void write(JsonWriter out, GetCaseNigosResponse value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public GetCaseNigosResponse read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of GetCaseNigosResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetCaseNigosResponse
   * @throws IOException if the JSON string is invalid with respect to GetCaseNigosResponse
   */
  public static GetCaseNigosResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetCaseNigosResponse.class);
  }

  /**
   * Convert an instance of GetCaseNigosResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

