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
 * AddDocusignRecipientViewResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2025-05-20T14:44:33.741519-05:00[America/Winnipeg]",
    comments = "Generator version: 7.13.0")
public class AddDocusignRecipientViewResponse {
  public static final String SERIALIZED_NAME_VIEW_URL = "viewUrl";
  @SerializedName(SERIALIZED_NAME_VIEW_URL)
  @javax.annotation.Nullable
  private String viewUrl;

  public AddDocusignRecipientViewResponse() {}

  public AddDocusignRecipientViewResponse viewUrl(@javax.annotation.Nullable String viewUrl) {
    this.viewUrl = viewUrl;
    return this;
  }

  /**
   * The view URL to be navigated to complete DocuSign signing
   * 
   * @return viewUrl
   */
  @javax.annotation.Nullable
  public String getViewUrl() {
    return viewUrl;
  }

  public void setViewUrl(@javax.annotation.Nullable String viewUrl) {
    this.viewUrl = viewUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddDocusignRecipientViewResponse addDocusignRecipientViewResponse =
        (AddDocusignRecipientViewResponse) o;
    return Objects.equals(this.viewUrl, addDocusignRecipientViewResponse.viewUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(viewUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddDocusignRecipientViewResponse {\n");
    sb.append("    viewUrl: ").append(toIndentedString(viewUrl)).append("\n");
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
    openapiFields.add("viewUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to
   *         AddDocusignRecipientViewResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!AddDocusignRecipientViewResponse.openapiRequiredFields.isEmpty()) { // has required
                                                                               // fields but JSON
                                                                               // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in AddDocusignRecipientViewResponse is not found in the empty JSON string",
            AddDocusignRecipientViewResponse.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!AddDocusignRecipientViewResponse.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `AddDocusignRecipientViewResponse` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("viewUrl") != null && !jsonObj.get("viewUrl").isJsonNull())
        && !jsonObj.get("viewUrl").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `viewUrl` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("viewUrl").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!AddDocusignRecipientViewResponse.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'AddDocusignRecipientViewResponse' and its
                     // subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<AddDocusignRecipientViewResponse> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(AddDocusignRecipientViewResponse.class));

      return (TypeAdapter<T>) new TypeAdapter<AddDocusignRecipientViewResponse>() {
        @Override
        public void write(JsonWriter out, AddDocusignRecipientViewResponse value)
            throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public AddDocusignRecipientViewResponse read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of AddDocusignRecipientViewResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AddDocusignRecipientViewResponse
   * @throws IOException if the JSON string is invalid with respect to
   *         AddDocusignRecipientViewResponse
   */
  public static AddDocusignRecipientViewResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddDocusignRecipientViewResponse.class);
  }

  /**
   * Convert an instance of AddDocusignRecipientViewResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

