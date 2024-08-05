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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.formkiq.client.invoker.JSON;

/**
 * AddChildDocumentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-08-04T20:12:43.895378-05:00[America/Winnipeg]",
    comments = "Generator version: 7.7.0")
public class AddChildDocumentResponse {
  public static final String SERIALIZED_NAME_DOCUMENT_ID = "documentId";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_ID)
  private String documentId;

  public static final String SERIALIZED_NAME_UPLOAD_URL = "uploadUrl";
  @SerializedName(SERIALIZED_NAME_UPLOAD_URL)
  private String uploadUrl;

  public AddChildDocumentResponse() {}

  public AddChildDocumentResponse documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Document Identifier
   * 
   * @return documentId
   */
  @javax.annotation.Nullable
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }


  public AddChildDocumentResponse uploadUrl(String uploadUrl) {
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
    AddChildDocumentResponse addChildDocumentResponse = (AddChildDocumentResponse) o;
    return Objects.equals(this.documentId, addChildDocumentResponse.documentId)
        && Objects.equals(this.uploadUrl, addChildDocumentResponse.uploadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, uploadUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddChildDocumentResponse {\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
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
    openapiFields.add("documentId");
    openapiFields.add("uploadUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AddChildDocumentResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!AddChildDocumentResponse.openapiRequiredFields.isEmpty()) { // has required fields but
                                                                       // JSON element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in AddChildDocumentResponse is not found in the empty JSON string",
            AddChildDocumentResponse.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!AddChildDocumentResponse.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `AddChildDocumentResponse` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("documentId") != null && !jsonObj.get("documentId").isJsonNull())
        && !jsonObj.get("documentId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `documentId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("documentId").toString()));
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
      if (!AddChildDocumentResponse.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'AddChildDocumentResponse' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<AddChildDocumentResponse> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(AddChildDocumentResponse.class));

      return (TypeAdapter<T>) new TypeAdapter<AddChildDocumentResponse>() {
        @Override
        public void write(JsonWriter out, AddChildDocumentResponse value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public AddChildDocumentResponse read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of AddChildDocumentResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AddChildDocumentResponse
   * @throws IOException if the JSON string is invalid with respect to AddChildDocumentResponse
   */
  public static AddChildDocumentResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddChildDocumentResponse.class);
  }

  /**
   * Convert an instance of AddChildDocumentResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

