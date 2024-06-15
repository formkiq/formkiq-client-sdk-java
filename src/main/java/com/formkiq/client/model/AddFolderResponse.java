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
 * AddFolderResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-06-14T22:07:09.313909-05:00[America/Winnipeg]",
    comments = "Generator version: 7.6.0")
public class AddFolderResponse {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_INDEX_KEY = "indexKey";
  @SerializedName(SERIALIZED_NAME_INDEX_KEY)
  private String indexKey;

  public AddFolderResponse() {}

  public AddFolderResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Response Message
   * 
   * @return message
   **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public AddFolderResponse indexKey(String indexKey) {
    this.indexKey = indexKey;
    return this;
  }

  /**
   * Folder Index Key
   * 
   * @return indexKey
   **/
  @javax.annotation.Nullable
  public String getIndexKey() {
    return indexKey;
  }

  public void setIndexKey(String indexKey) {
    this.indexKey = indexKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddFolderResponse addFolderResponse = (AddFolderResponse) o;
    return Objects.equals(this.message, addFolderResponse.message)
        && Objects.equals(this.indexKey, addFolderResponse.indexKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, indexKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddFolderResponse {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    indexKey: ").append(toIndentedString(indexKey)).append("\n");
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
    openapiFields.add("indexKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AddFolderResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!AddFolderResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in AddFolderResponse is not found in the empty JSON string",
            AddFolderResponse.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!AddFolderResponse.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `AddFolderResponse` properties. JSON: %s",
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
    if ((jsonObj.get("indexKey") != null && !jsonObj.get("indexKey").isJsonNull())
        && !jsonObj.get("indexKey").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `indexKey` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("indexKey").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!AddFolderResponse.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'AddFolderResponse' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<AddFolderResponse> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(AddFolderResponse.class));

      return (TypeAdapter<T>) new TypeAdapter<AddFolderResponse>() {
        @Override
        public void write(JsonWriter out, AddFolderResponse value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public AddFolderResponse read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of AddFolderResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AddFolderResponse
   * @throws IOException if the JSON string is invalid with respect to AddFolderResponse
   */
  public static AddFolderResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddFolderResponse.class);
  }

  /**
   * Convert an instance of AddFolderResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

