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
 * The version of the OpenAPI document: 1.17.1 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import com.formkiq.client.model.DocusignSignHereTabs;
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
 * DocusignSigningTabs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2025-05-20T14:44:33.741519-05:00[America/Winnipeg]",
    comments = "Generator version: 7.13.0")
public class DocusignSigningTabs {
  public static final String SERIALIZED_NAME_SIGN_HERE_TABS = "signHereTabs";
  @SerializedName(SERIALIZED_NAME_SIGN_HERE_TABS)
  @javax.annotation.Nullable
  private List<DocusignSignHereTabs> signHereTabs = new ArrayList<>();

  public DocusignSigningTabs() {}

  public DocusignSigningTabs signHereTabs(
      @javax.annotation.Nullable List<DocusignSignHereTabs> signHereTabs) {
    this.signHereTabs = signHereTabs;
    return this;
  }

  public DocusignSigningTabs addSignHereTabsItem(DocusignSignHereTabs signHereTabsItem) {
    if (this.signHereTabs == null) {
      this.signHereTabs = new ArrayList<>();
    }
    this.signHereTabs.add(signHereTabsItem);
    return this;
  }

  /**
   * A list of Sign Here tabs
   * 
   * @return signHereTabs
   */
  @javax.annotation.Nullable
  public List<DocusignSignHereTabs> getSignHereTabs() {
    return signHereTabs;
  }

  public void setSignHereTabs(@javax.annotation.Nullable List<DocusignSignHereTabs> signHereTabs) {
    this.signHereTabs = signHereTabs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocusignSigningTabs docusignSigningTabs = (DocusignSigningTabs) o;
    return Objects.equals(this.signHereTabs, docusignSigningTabs.signHereTabs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signHereTabs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocusignSigningTabs {\n");
    sb.append("    signHereTabs: ").append(toIndentedString(signHereTabs)).append("\n");
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
    openapiFields.add("signHereTabs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocusignSigningTabs
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!DocusignSigningTabs.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                  // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in DocusignSigningTabs is not found in the empty JSON string",
            DocusignSigningTabs.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!DocusignSigningTabs.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `DocusignSigningTabs` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if (jsonObj.get("signHereTabs") != null && !jsonObj.get("signHereTabs").isJsonNull()) {
      JsonArray jsonArraysignHereTabs = jsonObj.getAsJsonArray("signHereTabs");
      if (jsonArraysignHereTabs != null) {
        // ensure the json data is an array
        if (!jsonObj.get("signHereTabs").isJsonArray()) {
          throw new IllegalArgumentException(String.format(
              "Expected the field `signHereTabs` to be an array in the JSON string but got `%s`",
              jsonObj.get("signHereTabs").toString()));
        }

        // validate the optional field `signHereTabs` (array)
        for (int i = 0; i < jsonArraysignHereTabs.size(); i++) {
          DocusignSignHereTabs.validateJsonElement(jsonArraysignHereTabs.get(i));
        } ;
      }
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!DocusignSigningTabs.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'DocusignSigningTabs' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<DocusignSigningTabs> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(DocusignSigningTabs.class));

      return (TypeAdapter<T>) new TypeAdapter<DocusignSigningTabs>() {
        @Override
        public void write(JsonWriter out, DocusignSigningTabs value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public DocusignSigningTabs read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of DocusignSigningTabs given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocusignSigningTabs
   * @throws IOException if the JSON string is invalid with respect to DocusignSigningTabs
   */
  public static DocusignSigningTabs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocusignSigningTabs.class);
  }

  /**
   * Convert an instance of DocusignSigningTabs to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

