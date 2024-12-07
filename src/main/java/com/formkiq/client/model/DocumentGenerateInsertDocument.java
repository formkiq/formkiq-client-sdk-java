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
 * The version of the OpenAPI document: 1.16.1 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import com.formkiq.client.model.DocumentGenerateInsertDocumentPosition;
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
 * DocumentGenerateInsertDocument
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2025-01-10T23:07:47.624119-06:00[America/Winnipeg]",
    comments = "Generator version: 7.10.0")
public class DocumentGenerateInsertDocument {
  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  @javax.annotation.Nonnull
  private DocumentGenerateInsertDocumentPosition position;

  public static final String SERIALIZED_NAME_DOCUMENT_ID = "documentId";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_ID)
  @javax.annotation.Nonnull
  private String documentId;

  public DocumentGenerateInsertDocument() {}

  public DocumentGenerateInsertDocument position(
      @javax.annotation.Nonnull DocumentGenerateInsertDocumentPosition position) {
    this.position = position;
    return this;
  }

  /**
   * Get position
   * 
   * @return position
   */
  @javax.annotation.Nonnull
  public DocumentGenerateInsertDocumentPosition getPosition() {
    return position;
  }

  public void setPosition(
      @javax.annotation.Nonnull DocumentGenerateInsertDocumentPosition position) {
    this.position = position;
  }


  public DocumentGenerateInsertDocument documentId(@javax.annotation.Nonnull String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Document Identifier of the data source document
   * 
   * @return documentId
   */
  @javax.annotation.Nonnull
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(@javax.annotation.Nonnull String documentId) {
    this.documentId = documentId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentGenerateInsertDocument documentGenerateInsertDocument =
        (DocumentGenerateInsertDocument) o;
    return Objects.equals(this.position, documentGenerateInsertDocument.position)
        && Objects.equals(this.documentId, documentGenerateInsertDocument.documentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, documentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentGenerateInsertDocument {\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
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
    openapiFields.add("position");
    openapiFields.add("documentId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("position");
    openapiRequiredFields.add("documentId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to
   *         DocumentGenerateInsertDocument
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!DocumentGenerateInsertDocument.openapiRequiredFields.isEmpty()) { // has required fields
                                                                             // but JSON element is
                                                                             // null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in DocumentGenerateInsertDocument is not found in the empty JSON string",
            DocumentGenerateInsertDocument.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!DocumentGenerateInsertDocument.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `DocumentGenerateInsertDocument` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : DocumentGenerateInsertDocument.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format("The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the required field `position`
    DocumentGenerateInsertDocumentPosition.validateJsonElement(jsonObj.get("position"));
    if (!jsonObj.get("documentId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `documentId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("documentId").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!DocumentGenerateInsertDocument.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'DocumentGenerateInsertDocument' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<DocumentGenerateInsertDocument> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(DocumentGenerateInsertDocument.class));

      return (TypeAdapter<T>) new TypeAdapter<DocumentGenerateInsertDocument>() {
        @Override
        public void write(JsonWriter out, DocumentGenerateInsertDocument value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public DocumentGenerateInsertDocument read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of DocumentGenerateInsertDocument given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocumentGenerateInsertDocument
   * @throws IOException if the JSON string is invalid with respect to
   *         DocumentGenerateInsertDocument
   */
  public static DocumentGenerateInsertDocument fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentGenerateInsertDocument.class);
  }

  /**
   * Convert an instance of DocumentGenerateInsertDocument to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

