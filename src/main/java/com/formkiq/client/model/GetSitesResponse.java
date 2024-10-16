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
import com.formkiq.client.model.Site;
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
 * GetSitesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-10-15T23:10:22.074601-05:00[America/Winnipeg]",
    comments = "Generator version: 7.9.0")
public class GetSitesResponse {
  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_SITES = "sites";
  @SerializedName(SERIALIZED_NAME_SITES)
  private List<Site> sites = new ArrayList<>();

  public GetSitesResponse() {}

  public GetSitesResponse username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Username of request caller
   * 
   * @return username
   */
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public GetSitesResponse sites(List<Site> sites) {
    this.sites = sites;
    return this;
  }

  public GetSitesResponse addSitesItem(Site sitesItem) {
    if (this.sites == null) {
      this.sites = new ArrayList<>();
    }
    this.sites.add(sitesItem);
    return this;
  }

  /**
   * List of sites
   * 
   * @return sites
   */
  @javax.annotation.Nullable
  public List<Site> getSites() {
    return sites;
  }

  public void setSites(List<Site> sites) {
    this.sites = sites;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSitesResponse getSitesResponse = (GetSitesResponse) o;
    return Objects.equals(this.username, getSitesResponse.username)
        && Objects.equals(this.sites, getSitesResponse.sites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, sites);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSitesResponse {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    sites: ").append(toIndentedString(sites)).append("\n");
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
    openapiFields.add("username");
    openapiFields.add("sites");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetSitesResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!GetSitesResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                               // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in GetSitesResponse is not found in the empty JSON string",
            GetSitesResponse.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!GetSitesResponse.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `GetSitesResponse` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull())
        && !jsonObj.get("username").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `username` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("username").toString()));
    }
    if (jsonObj.get("sites") != null && !jsonObj.get("sites").isJsonNull()) {
      JsonArray jsonArraysites = jsonObj.getAsJsonArray("sites");
      if (jsonArraysites != null) {
        // ensure the json data is an array
        if (!jsonObj.get("sites").isJsonArray()) {
          throw new IllegalArgumentException(String.format(
              "Expected the field `sites` to be an array in the JSON string but got `%s`",
              jsonObj.get("sites").toString()));
        }

        // validate the optional field `sites` (array)
        for (int i = 0; i < jsonArraysites.size(); i++) {
          Site.validateJsonElement(jsonArraysites.get(i));
        } ;
      }
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!GetSitesResponse.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'GetSitesResponse' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<GetSitesResponse> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(GetSitesResponse.class));

      return (TypeAdapter<T>) new TypeAdapter<GetSitesResponse>() {
        @Override
        public void write(JsonWriter out, GetSitesResponse value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public GetSitesResponse read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of GetSitesResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetSitesResponse
   * @throws IOException if the JSON string is invalid with respect to GetSitesResponse
   */
  public static GetSitesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetSitesResponse.class);
  }

  /**
   * Convert an instance of GetSitesResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

