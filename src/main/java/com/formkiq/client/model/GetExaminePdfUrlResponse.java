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
 * The version of the OpenAPI document: 1.15.1 Contact: support@formkiq.com
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
 * GetExaminePdfUrlResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-07-22T23:17:53.660045-05:00[America/Winnipeg]",
    comments = "Generator version: 7.7.0")
public class GetExaminePdfUrlResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_UPLOAD_URL = "uploadUrl";
  @SerializedName(SERIALIZED_NAME_UPLOAD_URL)
  private String uploadUrl;

  public GetExaminePdfUrlResponse() {}

  public GetExaminePdfUrlResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Uploaded document identifier
   * 
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public GetExaminePdfUrlResponse uploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
    return this;
  }

  /**
   * Url to upload document to
   * 
   * @return uploadUrl
   */
  @javax.annotation.Nullable
  public String getUploadUrl() {
    return uploadUrl;
  }

  public void setUploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetExaminePdfUrlResponse getExaminePdfUrlResponse = (GetExaminePdfUrlResponse) o;
    return Objects.equals(this.id, getExaminePdfUrlResponse.id)
        && Objects.equals(this.uploadUrl, getExaminePdfUrlResponse.uploadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uploadUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetExaminePdfUrlResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uploadUrl: ").append(toIndentedString(uploadUrl)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("uploadUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetExaminePdfUrlResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!GetExaminePdfUrlResponse.openapiRequiredFields.isEmpty()) { // has required fields but
                                                                       // JSON element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in GetExaminePdfUrlResponse is not found in the empty JSON string",
            GetExaminePdfUrlResponse.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!GetExaminePdfUrlResponse.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `GetExaminePdfUrlResponse` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull())
        && !jsonObj.get("id").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `id` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("id").toString()));
    }
    if ((jsonObj.get("uploadUrl") != null && !jsonObj.get("uploadUrl").isJsonNull())
        && !jsonObj.get("uploadUrl").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `uploadUrl` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("uploadUrl").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!GetExaminePdfUrlResponse.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'GetExaminePdfUrlResponse' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<GetExaminePdfUrlResponse> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(GetExaminePdfUrlResponse.class));

      return (TypeAdapter<T>) new TypeAdapter<GetExaminePdfUrlResponse>() {
        @Override
        public void write(JsonWriter out, GetExaminePdfUrlResponse value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public GetExaminePdfUrlResponse read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of GetExaminePdfUrlResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetExaminePdfUrlResponse
   * @throws IOException if the JSON string is invalid with respect to GetExaminePdfUrlResponse
   */
  public static GetExaminePdfUrlResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetExaminePdfUrlResponse.class);
  }

  /**
   * Convert an instance of GetExaminePdfUrlResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

