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
 * DocumentGenerateDataSource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-11-07T14:33:54.015542-06:00[America/Winnipeg]",
    comments = "Generator version: 7.9.0")
public class DocumentGenerateDataSource {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DOCUMENT_ID = "documentId";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_ID)
  private String documentId;

  public static final String SERIALIZED_NAME_DATA_ROOT = "dataRoot";
  @SerializedName(SERIALIZED_NAME_DATA_ROOT)
  private String dataRoot = "data";

  public DocumentGenerateDataSource() {}

  public DocumentGenerateDataSource name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The data source name
   * 
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public DocumentGenerateDataSource documentId(String documentId) {
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

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }


  public DocumentGenerateDataSource dataRoot(String dataRoot) {
    this.dataRoot = dataRoot;
    return this;
  }

  /**
   * The default JSON object path for the data object
   * 
   * @return dataRoot
   */
  @javax.annotation.Nullable
  public String getDataRoot() {
    return dataRoot;
  }

  public void setDataRoot(String dataRoot) {
    this.dataRoot = dataRoot;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentGenerateDataSource documentGenerateDataSource = (DocumentGenerateDataSource) o;
    return Objects.equals(this.name, documentGenerateDataSource.name)
        && Objects.equals(this.documentId, documentGenerateDataSource.documentId)
        && Objects.equals(this.dataRoot, documentGenerateDataSource.dataRoot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, documentId, dataRoot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentGenerateDataSource {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    dataRoot: ").append(toIndentedString(dataRoot)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("documentId");
    openapiFields.add("dataRoot");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("documentId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocumentGenerateDataSource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!DocumentGenerateDataSource.openapiRequiredFields.isEmpty()) { // has required fields but
                                                                         // JSON element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in DocumentGenerateDataSource is not found in the empty JSON string",
            DocumentGenerateDataSource.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!DocumentGenerateDataSource.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `DocumentGenerateDataSource` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : DocumentGenerateDataSource.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format("The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull())
        && !jsonObj.get("name").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `name` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("name").toString()));
    }
    if (!jsonObj.get("documentId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `documentId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("documentId").toString()));
    }
    if ((jsonObj.get("dataRoot") != null && !jsonObj.get("dataRoot").isJsonNull())
        && !jsonObj.get("dataRoot").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `dataRoot` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("dataRoot").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!DocumentGenerateDataSource.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'DocumentGenerateDataSource' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<DocumentGenerateDataSource> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(DocumentGenerateDataSource.class));

      return (TypeAdapter<T>) new TypeAdapter<DocumentGenerateDataSource>() {
        @Override
        public void write(JsonWriter out, DocumentGenerateDataSource value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public DocumentGenerateDataSource read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of DocumentGenerateDataSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocumentGenerateDataSource
   * @throws IOException if the JSON string is invalid with respect to DocumentGenerateDataSource
   */
  public static DocumentGenerateDataSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentGenerateDataSource.class);
  }

  /**
   * Convert an instance of DocumentGenerateDataSource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

