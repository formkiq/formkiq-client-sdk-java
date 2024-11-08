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
import com.formkiq.client.model.DocumentGenerateDataSource;
import com.formkiq.client.model.DocumentGenerateOutputType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * AddDocumentGenerateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-11-07T14:33:54.015542-06:00[America/Winnipeg]",
    comments = "Generator version: 7.9.0")
public class AddDocumentGenerateRequest {
  public static final String SERIALIZED_NAME_DATASOURCES = "datasources";
  @SerializedName(SERIALIZED_NAME_DATASOURCES)
  private List<DocumentGenerateDataSource> datasources = new ArrayList<>();

  public static final String SERIALIZED_NAME_OUTPUT_TYPE = "outputType";
  @SerializedName(SERIALIZED_NAME_OUTPUT_TYPE)
  private DocumentGenerateOutputType outputType;

  public static final String SERIALIZED_NAME_SAVE_AS_DOCUMENT_ID = "saveAsDocumentId";
  @SerializedName(SERIALIZED_NAME_SAVE_AS_DOCUMENT_ID)
  private String saveAsDocumentId;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public AddDocumentGenerateRequest() {}

  public AddDocumentGenerateRequest datasources(List<DocumentGenerateDataSource> datasources) {
    this.datasources = datasources;
    return this;
  }

  public AddDocumentGenerateRequest addDatasourcesItem(DocumentGenerateDataSource datasourcesItem) {
    if (this.datasources == null) {
      this.datasources = new ArrayList<>();
    }
    this.datasources.add(datasourcesItem);
    return this;
  }

  /**
   * List of data sources
   * 
   * @return datasources
   */
  @javax.annotation.Nullable
  public List<DocumentGenerateDataSource> getDatasources() {
    return datasources;
  }

  public void setDatasources(List<DocumentGenerateDataSource> datasources) {
    this.datasources = datasources;
  }


  public AddDocumentGenerateRequest outputType(DocumentGenerateOutputType outputType) {
    this.outputType = outputType;
    return this;
  }

  /**
   * Get outputType
   * 
   * @return outputType
   */
  @javax.annotation.Nullable
  public DocumentGenerateOutputType getOutputType() {
    return outputType;
  }

  public void setOutputType(DocumentGenerateOutputType outputType) {
    this.outputType = outputType;
  }


  public AddDocumentGenerateRequest saveAsDocumentId(String saveAsDocumentId) {
    this.saveAsDocumentId = saveAsDocumentId;
    return this;
  }

  /**
   * Save the generated document with a specific documentId
   * 
   * @return saveAsDocumentId
   */
  @javax.annotation.Nullable
  public String getSaveAsDocumentId() {
    return saveAsDocumentId;
  }

  public void setSaveAsDocumentId(String saveAsDocumentId) {
    this.saveAsDocumentId = saveAsDocumentId;
  }


  public AddDocumentGenerateRequest path(String path) {
    this.path = path;
    return this;
  }

  /**
   * The path of the generated document
   * 
   * @return path
   */
  @javax.annotation.Nullable
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddDocumentGenerateRequest addDocumentGenerateRequest = (AddDocumentGenerateRequest) o;
    return Objects.equals(this.datasources, addDocumentGenerateRequest.datasources)
        && Objects.equals(this.outputType, addDocumentGenerateRequest.outputType)
        && Objects.equals(this.saveAsDocumentId, addDocumentGenerateRequest.saveAsDocumentId)
        && Objects.equals(this.path, addDocumentGenerateRequest.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasources, outputType, saveAsDocumentId, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddDocumentGenerateRequest {\n");
    sb.append("    datasources: ").append(toIndentedString(datasources)).append("\n");
    sb.append("    outputType: ").append(toIndentedString(outputType)).append("\n");
    sb.append("    saveAsDocumentId: ").append(toIndentedString(saveAsDocumentId)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
    openapiFields.add("datasources");
    openapiFields.add("outputType");
    openapiFields.add("saveAsDocumentId");
    openapiFields.add("path");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AddDocumentGenerateRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!AddDocumentGenerateRequest.openapiRequiredFields.isEmpty()) { // has required fields but
                                                                         // JSON element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in AddDocumentGenerateRequest is not found in the empty JSON string",
            AddDocumentGenerateRequest.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!AddDocumentGenerateRequest.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `AddDocumentGenerateRequest` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if (jsonObj.get("datasources") != null && !jsonObj.get("datasources").isJsonNull()) {
      JsonArray jsonArraydatasources = jsonObj.getAsJsonArray("datasources");
      if (jsonArraydatasources != null) {
        // ensure the json data is an array
        if (!jsonObj.get("datasources").isJsonArray()) {
          throw new IllegalArgumentException(String.format(
              "Expected the field `datasources` to be an array in the JSON string but got `%s`",
              jsonObj.get("datasources").toString()));
        }

        // validate the optional field `datasources` (array)
        for (int i = 0; i < jsonArraydatasources.size(); i++) {
          DocumentGenerateDataSource.validateJsonElement(jsonArraydatasources.get(i));
        } ;
      }
    }
    // validate the optional field `outputType`
    if (jsonObj.get("outputType") != null && !jsonObj.get("outputType").isJsonNull()) {
      DocumentGenerateOutputType.validateJsonElement(jsonObj.get("outputType"));
    }
    if ((jsonObj.get("saveAsDocumentId") != null && !jsonObj.get("saveAsDocumentId").isJsonNull())
        && !jsonObj.get("saveAsDocumentId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `saveAsDocumentId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("saveAsDocumentId").toString()));
    }
    if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull())
        && !jsonObj.get("path").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `path` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("path").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!AddDocumentGenerateRequest.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'AddDocumentGenerateRequest' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<AddDocumentGenerateRequest> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(AddDocumentGenerateRequest.class));

      return (TypeAdapter<T>) new TypeAdapter<AddDocumentGenerateRequest>() {
        @Override
        public void write(JsonWriter out, AddDocumentGenerateRequest value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public AddDocumentGenerateRequest read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of AddDocumentGenerateRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AddDocumentGenerateRequest
   * @throws IOException if the JSON string is invalid with respect to AddDocumentGenerateRequest
   */
  public static AddDocumentGenerateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddDocumentGenerateRequest.class);
  }

  /**
   * Convert an instance of AddDocumentGenerateRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

