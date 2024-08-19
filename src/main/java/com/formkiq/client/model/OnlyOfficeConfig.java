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
import com.formkiq.client.model.OnlyOfficeConfigDocument;
import com.formkiq.client.model.OnlyOfficeEditorConfig;
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
 * OnlyOfficeConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-08-19T17:49:09.619199-04:00[America/New_York]",
    comments = "Generator version: 7.7.0")
public class OnlyOfficeConfig {
  public static final String SERIALIZED_NAME_ONLY_OFFICE_URL = "onlyOfficeUrl";
  @SerializedName(SERIALIZED_NAME_ONLY_OFFICE_URL)
  private String onlyOfficeUrl;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "documentType";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  private String documentType;

  public static final String SERIALIZED_NAME_EDITOR_CONFIG = "editorConfig";
  @SerializedName(SERIALIZED_NAME_EDITOR_CONFIG)
  private OnlyOfficeEditorConfig editorConfig;

  public static final String SERIALIZED_NAME_DOCUMENT = "document";
  @SerializedName(SERIALIZED_NAME_DOCUMENT)
  private OnlyOfficeConfigDocument document;

  public OnlyOfficeConfig() {}

  public OnlyOfficeConfig onlyOfficeUrl(String onlyOfficeUrl) {
    this.onlyOfficeUrl = onlyOfficeUrl;
    return this;
  }

  /**
   * URL of the ONLYOFFICE application
   * 
   * @return onlyOfficeUrl
   */
  @javax.annotation.Nullable
  public String getOnlyOfficeUrl() {
    return onlyOfficeUrl;
  }

  public void setOnlyOfficeUrl(String onlyOfficeUrl) {
    this.onlyOfficeUrl = onlyOfficeUrl;
  }


  public OnlyOfficeConfig token(String token) {
    this.token = token;
    return this;
  }

  /**
   * ONLYOFFICE security token
   * 
   * @return token
   */
  @javax.annotation.Nullable
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  public OnlyOfficeConfig documentType(String documentType) {
    this.documentType = documentType;
    return this;
  }

  /**
   * Type of document (https://api.onlyoffice.com/editors/config/)
   * 
   * @return documentType
   */
  @javax.annotation.Nullable
  public String getDocumentType() {
    return documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }


  public OnlyOfficeConfig editorConfig(OnlyOfficeEditorConfig editorConfig) {
    this.editorConfig = editorConfig;
    return this;
  }

  /**
   * Get editorConfig
   * 
   * @return editorConfig
   */
  @javax.annotation.Nullable
  public OnlyOfficeEditorConfig getEditorConfig() {
    return editorConfig;
  }

  public void setEditorConfig(OnlyOfficeEditorConfig editorConfig) {
    this.editorConfig = editorConfig;
  }


  public OnlyOfficeConfig document(OnlyOfficeConfigDocument document) {
    this.document = document;
    return this;
  }

  /**
   * Get document
   * 
   * @return document
   */
  @javax.annotation.Nullable
  public OnlyOfficeConfigDocument getDocument() {
    return document;
  }

  public void setDocument(OnlyOfficeConfigDocument document) {
    this.document = document;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnlyOfficeConfig onlyOfficeConfig = (OnlyOfficeConfig) o;
    return Objects.equals(this.onlyOfficeUrl, onlyOfficeConfig.onlyOfficeUrl)
        && Objects.equals(this.token, onlyOfficeConfig.token)
        && Objects.equals(this.documentType, onlyOfficeConfig.documentType)
        && Objects.equals(this.editorConfig, onlyOfficeConfig.editorConfig)
        && Objects.equals(this.document, onlyOfficeConfig.document);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onlyOfficeUrl, token, documentType, editorConfig, document);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnlyOfficeConfig {\n");
    sb.append("    onlyOfficeUrl: ").append(toIndentedString(onlyOfficeUrl)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    editorConfig: ").append(toIndentedString(editorConfig)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
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
    openapiFields.add("onlyOfficeUrl");
    openapiFields.add("token");
    openapiFields.add("documentType");
    openapiFields.add("editorConfig");
    openapiFields.add("document");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OnlyOfficeConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!OnlyOfficeConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                               // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in OnlyOfficeConfig is not found in the empty JSON string",
            OnlyOfficeConfig.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!OnlyOfficeConfig.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `OnlyOfficeConfig` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("onlyOfficeUrl") != null && !jsonObj.get("onlyOfficeUrl").isJsonNull())
        && !jsonObj.get("onlyOfficeUrl").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `onlyOfficeUrl` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("onlyOfficeUrl").toString()));
    }
    if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull())
        && !jsonObj.get("token").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `token` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("token").toString()));
    }
    if ((jsonObj.get("documentType") != null && !jsonObj.get("documentType").isJsonNull())
        && !jsonObj.get("documentType").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `documentType` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("documentType").toString()));
    }
    // validate the optional field `editorConfig`
    if (jsonObj.get("editorConfig") != null && !jsonObj.get("editorConfig").isJsonNull()) {
      OnlyOfficeEditorConfig.validateJsonElement(jsonObj.get("editorConfig"));
    }
    // validate the optional field `document`
    if (jsonObj.get("document") != null && !jsonObj.get("document").isJsonNull()) {
      OnlyOfficeConfigDocument.validateJsonElement(jsonObj.get("document"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!OnlyOfficeConfig.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'OnlyOfficeConfig' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<OnlyOfficeConfig> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(OnlyOfficeConfig.class));

      return (TypeAdapter<T>) new TypeAdapter<OnlyOfficeConfig>() {
        @Override
        public void write(JsonWriter out, OnlyOfficeConfig value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public OnlyOfficeConfig read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of OnlyOfficeConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OnlyOfficeConfig
   * @throws IOException if the JSON string is invalid with respect to OnlyOfficeConfig
   */
  public static OnlyOfficeConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnlyOfficeConfig.class);
  }

  /**
   * Convert an instance of OnlyOfficeConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

