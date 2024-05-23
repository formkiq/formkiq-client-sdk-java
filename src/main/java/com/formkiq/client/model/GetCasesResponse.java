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
 * The version of the OpenAPI document: 1.15.0 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import com.formkiq.client.model.ModelCase;
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
 * GetCasesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-05-21T14:06:01.586937-05:00[America/Winnipeg]",
    comments = "Generator version: 7.6.0")
public class GetCasesResponse {
  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private String next;

  public static final String SERIALIZED_NAME_CASES = "cases";
  @SerializedName(SERIALIZED_NAME_CASES)
  private List<ModelCase> cases = new ArrayList<>();

  public GetCasesResponse() {}

  public GetCasesResponse next(String next) {
    this.next = next;
    return this;
  }

  /**
   * Next page of results token
   * 
   * @return next
   **/
  @javax.annotation.Nullable
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }


  public GetCasesResponse cases(List<ModelCase> cases) {
    this.cases = cases;
    return this;
  }

  public GetCasesResponse addCasesItem(ModelCase casesItem) {
    if (this.cases == null) {
      this.cases = new ArrayList<>();
    }
    this.cases.add(casesItem);
    return this;
  }

  /**
   * List of cases
   * 
   * @return cases
   **/
  @javax.annotation.Nullable
  public List<ModelCase> getCases() {
    return cases;
  }

  public void setCases(List<ModelCase> cases) {
    this.cases = cases;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCasesResponse getCasesResponse = (GetCasesResponse) o;
    return Objects.equals(this.next, getCasesResponse.next)
        && Objects.equals(this.cases, getCasesResponse.cases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(next, cases);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCasesResponse {\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    cases: ").append(toIndentedString(cases)).append("\n");
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
    openapiFields.add("cases");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetCasesResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!GetCasesResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                               // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in GetCasesResponse is not found in the empty JSON string",
            GetCasesResponse.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!GetCasesResponse.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `GetCasesResponse` properties. JSON: %s",
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
    if (jsonObj.get("cases") != null && !jsonObj.get("cases").isJsonNull()) {
      JsonArray jsonArraycases = jsonObj.getAsJsonArray("cases");
      if (jsonArraycases != null) {
        // ensure the json data is an array
        if (!jsonObj.get("cases").isJsonArray()) {
          throw new IllegalArgumentException(String.format(
              "Expected the field `cases` to be an array in the JSON string but got `%s`",
              jsonObj.get("cases").toString()));
        }

        // validate the optional field `cases` (array)
        for (int i = 0; i < jsonArraycases.size(); i++) {
          ModelCase.validateJsonElement(jsonArraycases.get(i));
        } ;
      }
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!GetCasesResponse.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'GetCasesResponse' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<GetCasesResponse> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(GetCasesResponse.class));

      return (TypeAdapter<T>) new TypeAdapter<GetCasesResponse>() {
        @Override
        public void write(JsonWriter out, GetCasesResponse value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public GetCasesResponse read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of GetCasesResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetCasesResponse
   * @throws IOException if the JSON string is invalid with respect to GetCasesResponse
   */
  public static GetCasesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetCasesResponse.class);
  }

  /**
   * Convert an instance of GetCasesResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

