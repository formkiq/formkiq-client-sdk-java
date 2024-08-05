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
import com.formkiq.client.model.Ruleset;
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
 * GetRulesetsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-08-04T21:20:41.950279-05:00[America/Winnipeg]",
    comments = "Generator version: 7.7.0")
public class GetRulesetsResponse {
  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private String next;

  public static final String SERIALIZED_NAME_RULESETS = "rulesets";
  @SerializedName(SERIALIZED_NAME_RULESETS)
  private List<Ruleset> rulesets = new ArrayList<>();

  public GetRulesetsResponse() {}

  public GetRulesetsResponse next(String next) {
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


  public GetRulesetsResponse rulesets(List<Ruleset> rulesets) {
    this.rulesets = rulesets;
    return this;
  }

  public GetRulesetsResponse addRulesetsItem(Ruleset rulesetsItem) {
    if (this.rulesets == null) {
      this.rulesets = new ArrayList<>();
    }
    this.rulesets.add(rulesetsItem);
    return this;
  }

  /**
   * List of rulesets
   * 
   * @return rulesets
   */
  @javax.annotation.Nullable
  public List<Ruleset> getRulesets() {
    return rulesets;
  }

  public void setRulesets(List<Ruleset> rulesets) {
    this.rulesets = rulesets;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRulesetsResponse getRulesetsResponse = (GetRulesetsResponse) o;
    return Objects.equals(this.next, getRulesetsResponse.next)
        && Objects.equals(this.rulesets, getRulesetsResponse.rulesets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(next, rulesets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRulesetsResponse {\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    rulesets: ").append(toIndentedString(rulesets)).append("\n");
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
    openapiFields.add("rulesets");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetRulesetsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!GetRulesetsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                  // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in GetRulesetsResponse is not found in the empty JSON string",
            GetRulesetsResponse.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!GetRulesetsResponse.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `GetRulesetsResponse` properties. JSON: %s",
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
    if (jsonObj.get("rulesets") != null && !jsonObj.get("rulesets").isJsonNull()) {
      JsonArray jsonArrayrulesets = jsonObj.getAsJsonArray("rulesets");
      if (jsonArrayrulesets != null) {
        // ensure the json data is an array
        if (!jsonObj.get("rulesets").isJsonArray()) {
          throw new IllegalArgumentException(String.format(
              "Expected the field `rulesets` to be an array in the JSON string but got `%s`",
              jsonObj.get("rulesets").toString()));
        }

        // validate the optional field `rulesets` (array)
        for (int i = 0; i < jsonArrayrulesets.size(); i++) {
          Ruleset.validateJsonElement(jsonArrayrulesets.get(i));
        } ;
      }
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!GetRulesetsResponse.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'GetRulesetsResponse' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<GetRulesetsResponse> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(GetRulesetsResponse.class));

      return (TypeAdapter<T>) new TypeAdapter<GetRulesetsResponse>() {
        @Override
        public void write(JsonWriter out, GetRulesetsResponse value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public GetRulesetsResponse read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of GetRulesetsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetRulesetsResponse
   * @throws IOException if the JSON string is invalid with respect to GetRulesetsResponse
   */
  public static GetRulesetsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRulesetsResponse.class);
  }

  /**
   * Convert an instance of GetRulesetsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

