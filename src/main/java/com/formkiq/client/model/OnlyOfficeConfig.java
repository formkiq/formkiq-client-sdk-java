/*
 * FormKiQ HTTP API
 * FormKiQ HTTP API
 *
 * The version of the OpenAPI document: 1.12.0
 * Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.formkiq.client.model.OnlyOfficeConfigDocument;
import com.formkiq.client.model.OnlyOfficeEditorConfig;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
import java.util.Map.Entry;
import java.util.Set;

import com.formkiq.client.invoker.JSON;

/**
 * OnlyOfficeConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-12T22:09:49.468810-05:00[America/Winnipeg]")
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

  public OnlyOfficeConfig() {
  }

  public OnlyOfficeConfig onlyOfficeUrl(String onlyOfficeUrl) {
    
    this.onlyOfficeUrl = onlyOfficeUrl;
    return this;
  }

   /**
   * URL of the ONLYOFFICE application
   * @return onlyOfficeUrl
  **/
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
   * @return token
  **/
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
   * @return documentType
  **/
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
   * @return editorConfig
  **/
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
   * @return document
  **/
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
    return Objects.equals(this.onlyOfficeUrl, onlyOfficeConfig.onlyOfficeUrl) &&
        Objects.equals(this.token, onlyOfficeConfig.token) &&
        Objects.equals(this.documentType, onlyOfficeConfig.documentType) &&
        Objects.equals(this.editorConfig, onlyOfficeConfig.editorConfig) &&
        Objects.equals(this.document, onlyOfficeConfig.document);
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
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OnlyOfficeConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OnlyOfficeConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OnlyOfficeConfig is not found in the empty JSON string", OnlyOfficeConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OnlyOfficeConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OnlyOfficeConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("onlyOfficeUrl") != null && !jsonObj.get("onlyOfficeUrl").isJsonNull()) && !jsonObj.get("onlyOfficeUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `onlyOfficeUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("onlyOfficeUrl").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("documentType") != null && !jsonObj.get("documentType").isJsonNull()) && !jsonObj.get("documentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentType").toString()));
      }
      // validate the optional field `editorConfig`
      if (jsonObj.get("editorConfig") != null && !jsonObj.get("editorConfig").isJsonNull()) {
        OnlyOfficeEditorConfig.validateJsonObject(jsonObj.getAsJsonObject("editorConfig"));
      }
      // validate the optional field `document`
      if (jsonObj.get("document") != null && !jsonObj.get("document").isJsonNull()) {
        OnlyOfficeConfigDocument.validateJsonObject(jsonObj.getAsJsonObject("document"));
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
       final TypeAdapter<OnlyOfficeConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnlyOfficeConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<OnlyOfficeConfig>() {
           @Override
           public void write(JsonWriter out, OnlyOfficeConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OnlyOfficeConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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
