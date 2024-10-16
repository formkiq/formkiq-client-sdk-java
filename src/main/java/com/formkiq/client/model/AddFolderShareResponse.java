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
 * AddFolderShareResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-10-15T23:10:22.074601-05:00[America/Winnipeg]",
    comments = "Generator version: 7.9.0")
public class AddFolderShareResponse {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_SHARE_KEY = "shareKey";
  @SerializedName(SERIALIZED_NAME_SHARE_KEY)
  private String shareKey;

  public AddFolderShareResponse() {}

  public AddFolderShareResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * API Response message
   * 
   * @return message
   */
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public AddFolderShareResponse shareKey(String shareKey) {
    this.shareKey = shareKey;
    return this;
  }

  /**
   * Share Identifier
   * 
   * @return shareKey
   */
  @javax.annotation.Nullable
  public String getShareKey() {
    return shareKey;
  }

  public void setShareKey(String shareKey) {
    this.shareKey = shareKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddFolderShareResponse addFolderShareResponse = (AddFolderShareResponse) o;
    return Objects.equals(this.message, addFolderShareResponse.message)
        && Objects.equals(this.shareKey, addFolderShareResponse.shareKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, shareKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddFolderShareResponse {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    shareKey: ").append(toIndentedString(shareKey)).append("\n");
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
    openapiFields.add("message");
    openapiFields.add("shareKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AddFolderShareResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!AddFolderShareResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                     // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in AddFolderShareResponse is not found in the empty JSON string",
            AddFolderShareResponse.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!AddFolderShareResponse.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `AddFolderShareResponse` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull())
        && !jsonObj.get("message").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `message` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("message").toString()));
    }
    if ((jsonObj.get("shareKey") != null && !jsonObj.get("shareKey").isJsonNull())
        && !jsonObj.get("shareKey").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `shareKey` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("shareKey").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!AddFolderShareResponse.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'AddFolderShareResponse' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<AddFolderShareResponse> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(AddFolderShareResponse.class));

      return (TypeAdapter<T>) new TypeAdapter<AddFolderShareResponse>() {
        @Override
        public void write(JsonWriter out, AddFolderShareResponse value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public AddFolderShareResponse read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of AddFolderShareResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AddFolderShareResponse
   * @throws IOException if the JSON string is invalid with respect to AddFolderShareResponse
   */
  public static AddFolderShareResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddFolderShareResponse.class);
  }

  /**
   * Convert an instance of AddFolderShareResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

