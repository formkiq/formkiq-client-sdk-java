/*
 * FormKiQ HTTP API Formkiq API: Document Management Platform API using JWT Authentication
 *
 * The version of the OpenAPI document: 1.12.0 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import java.util.Arrays;
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
 * SetDocumentOcrRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-08-13T13:53:13.529619-05:00[America/Winnipeg]")
public class SetDocumentOcrRequest {
  public static final String SERIALIZED_NAME_CONTENT_TYPE = "contentType";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_IS_BASE64 = "isBase64";
  @SerializedName(SERIALIZED_NAME_IS_BASE64)
  private Boolean isBase64;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public SetDocumentOcrRequest() {}

  public SetDocumentOcrRequest contentType(String contentType) {

    this.contentType = contentType;
    return this;
  }

  /**
   * Document Content-Type
   * 
   * @return contentType
   **/
  @javax.annotation.Nullable
  public String getContentType() {
    return contentType;
  }


  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public SetDocumentOcrRequest isBase64(Boolean isBase64) {

    this.isBase64 = isBase64;
    return this;
  }

  /**
   * Is the content Base64-encoded?
   * 
   * @return isBase64
   **/
  @javax.annotation.Nullable
  public Boolean getIsBase64() {
    return isBase64;
  }


  public void setIsBase64(Boolean isBase64) {
    this.isBase64 = isBase64;
  }


  public SetDocumentOcrRequest content(String content) {

    this.content = content;
    return this;
  }

  /**
   * Document content
   * 
   * @return content
   **/
  @javax.annotation.Nonnull
  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetDocumentOcrRequest setDocumentOcrRequest = (SetDocumentOcrRequest) o;
    return Objects.equals(this.contentType, setDocumentOcrRequest.contentType)
        && Objects.equals(this.isBase64, setDocumentOcrRequest.isBase64)
        && Objects.equals(this.content, setDocumentOcrRequest.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, isBase64, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetDocumentOcrRequest {\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    isBase64: ").append(toIndentedString(isBase64)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
    openapiFields.add("contentType");
    openapiFields.add("isBase64");
    openapiFields.add("content");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("content");
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to SetDocumentOcrRequest
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (!SetDocumentOcrRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                    // object is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in SetDocumentOcrRequest is not found in the empty JSON string",
            SetDocumentOcrRequest.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!SetDocumentOcrRequest.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `SetDocumentOcrRequest` properties. JSON: %s",
            entry.getKey(), jsonObj.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : SetDocumentOcrRequest.openapiRequiredFields) {
      if (jsonObj.get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format("The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonObj.toString()));
      }
    }
    if ((jsonObj.get("contentType") != null && !jsonObj.get("contentType").isJsonNull())
        && !jsonObj.get("contentType").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `contentType` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("contentType").toString()));
    }
    if (!jsonObj.get("content").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `content` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("content").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!SetDocumentOcrRequest.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'SetDocumentOcrRequest' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<SetDocumentOcrRequest> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(SetDocumentOcrRequest.class));

      return (TypeAdapter<T>) new TypeAdapter<SetDocumentOcrRequest>() {
        @Override
        public void write(JsonWriter out, SetDocumentOcrRequest value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public SetDocumentOcrRequest read(JsonReader in) throws IOException {
          JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
          validateJsonObject(jsonObj);
          return thisAdapter.fromJsonTree(jsonObj);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of SetDocumentOcrRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SetDocumentOcrRequest
   * @throws IOException if the JSON string is invalid with respect to SetDocumentOcrRequest
   */
  public static SetDocumentOcrRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SetDocumentOcrRequest.class);
  }

  /**
   * Convert an instance of SetDocumentOcrRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

