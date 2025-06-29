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
 * GetDocumentContentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2025-05-20T14:44:33.741519-05:00[America/Winnipeg]",
    comments = "Generator version: 7.13.0")
public class GetDocumentContentResponse {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  @javax.annotation.Nullable
  private String content;

  public static final String SERIALIZED_NAME_CONTENT_URL = "contentUrl";
  @SerializedName(SERIALIZED_NAME_CONTENT_URL)
  @javax.annotation.Nullable
  private String contentUrl;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "contentType";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  @javax.annotation.Nullable
  private String contentType;

  public static final String SERIALIZED_NAME_IS_BASE64 = "isBase64";
  @SerializedName(SERIALIZED_NAME_IS_BASE64)
  @javax.annotation.Nullable
  private Boolean isBase64;

  public GetDocumentContentResponse() {}

  public GetDocumentContentResponse content(@javax.annotation.Nullable String content) {
    this.content = content;
    return this;
  }

  /**
   * Document content
   * 
   * @return content
   */
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }

  public void setContent(@javax.annotation.Nullable String content) {
    this.content = content;
  }


  public GetDocumentContentResponse contentUrl(@javax.annotation.Nullable String contentUrl) {
    this.contentUrl = contentUrl;
    return this;
  }

  /**
   * URL to retrieve document content
   * 
   * @return contentUrl
   */
  @javax.annotation.Nullable
  public String getContentUrl() {
    return contentUrl;
  }

  public void setContentUrl(@javax.annotation.Nullable String contentUrl) {
    this.contentUrl = contentUrl;
  }


  public GetDocumentContentResponse contentType(@javax.annotation.Nullable String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Document Content-Type
   * 
   * @return contentType
   */
  @javax.annotation.Nullable
  public String getContentType() {
    return contentType;
  }

  public void setContentType(@javax.annotation.Nullable String contentType) {
    this.contentType = contentType;
  }


  public GetDocumentContentResponse isBase64(@javax.annotation.Nullable Boolean isBase64) {
    this.isBase64 = isBase64;
    return this;
  }

  /**
   * Is the content Base64-encoded?
   * 
   * @return isBase64
   */
  @javax.annotation.Nullable
  public Boolean getIsBase64() {
    return isBase64;
  }

  public void setIsBase64(@javax.annotation.Nullable Boolean isBase64) {
    this.isBase64 = isBase64;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocumentContentResponse getDocumentContentResponse = (GetDocumentContentResponse) o;
    return Objects.equals(this.content, getDocumentContentResponse.content)
        && Objects.equals(this.contentUrl, getDocumentContentResponse.contentUrl)
        && Objects.equals(this.contentType, getDocumentContentResponse.contentType)
        && Objects.equals(this.isBase64, getDocumentContentResponse.isBase64);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, contentUrl, contentType, isBase64);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocumentContentResponse {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    contentUrl: ").append(toIndentedString(contentUrl)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    isBase64: ").append(toIndentedString(isBase64)).append("\n");
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
    openapiFields.add("content");
    openapiFields.add("contentUrl");
    openapiFields.add("contentType");
    openapiFields.add("isBase64");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetDocumentContentResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!GetDocumentContentResponse.openapiRequiredFields.isEmpty()) { // has required fields but
                                                                         // JSON element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in GetDocumentContentResponse is not found in the empty JSON string",
            GetDocumentContentResponse.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!GetDocumentContentResponse.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `GetDocumentContentResponse` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull())
        && !jsonObj.get("content").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `content` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("content").toString()));
    }
    if ((jsonObj.get("contentUrl") != null && !jsonObj.get("contentUrl").isJsonNull())
        && !jsonObj.get("contentUrl").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `contentUrl` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("contentUrl").toString()));
    }
    if ((jsonObj.get("contentType") != null && !jsonObj.get("contentType").isJsonNull())
        && !jsonObj.get("contentType").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `contentType` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("contentType").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!GetDocumentContentResponse.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'GetDocumentContentResponse' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<GetDocumentContentResponse> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(GetDocumentContentResponse.class));

      return (TypeAdapter<T>) new TypeAdapter<GetDocumentContentResponse>() {
        @Override
        public void write(JsonWriter out, GetDocumentContentResponse value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public GetDocumentContentResponse read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of GetDocumentContentResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetDocumentContentResponse
   * @throws IOException if the JSON string is invalid with respect to GetDocumentContentResponse
   */
  public static GetDocumentContentResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetDocumentContentResponse.class);
  }

  /**
   * Convert an instance of GetDocumentContentResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

