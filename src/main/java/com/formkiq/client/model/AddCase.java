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
import com.formkiq.client.model.CaseStatus;
import com.formkiq.client.model.StringFormat;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * AddCase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-10-10T10:01:40.041013-05:00[America/Winnipeg]",
    comments = "Generator version: 7.9.0")
public class AddCase {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private CaseStatus status;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DOCUMENT_NUMBER_FORMAT = "documentNumberFormat";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_NUMBER_FORMAT)
  private List<StringFormat> documentNumberFormat = new ArrayList<>();

  public static final String SERIALIZED_NAME_CASE_NUMBER_FORMAT = "caseNumberFormat";
  @SerializedName(SERIALIZED_NAME_CASE_NUMBER_FORMAT)
  private List<StringFormat> caseNumberFormat = new ArrayList<>();

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, Object> metadata = new HashMap<>();

  public static final String SERIALIZED_NAME_DOCUMENT_IDS = "documentIds";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_IDS)
  private List<String> documentIds = new ArrayList<>();

  public AddCase() {}

  public AddCase name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Case Name
   * 
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AddCase status(CaseStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * 
   * @return status
   */
  @javax.annotation.Nullable
  public CaseStatus getStatus() {
    return status;
  }

  public void setStatus(CaseStatus status) {
    this.status = status;
  }


  public AddCase startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start Date
   * 
   * @return startDate
   */
  @javax.annotation.Nullable
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public AddCase endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End Date
   * 
   * @return endDate
   */
  @javax.annotation.Nullable
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public AddCase description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Case Description
   * 
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public AddCase documentNumberFormat(List<StringFormat> documentNumberFormat) {
    this.documentNumberFormat = documentNumberFormat;
    return this;
  }

  public AddCase addDocumentNumberFormatItem(StringFormat documentNumberFormatItem) {
    if (this.documentNumberFormat == null) {
      this.documentNumberFormat = new ArrayList<>();
    }
    this.documentNumberFormat.add(documentNumberFormatItem);
    return this;
  }

  /**
   * Format of Document Number
   * 
   * @return documentNumberFormat
   */
  @javax.annotation.Nullable
  public List<StringFormat> getDocumentNumberFormat() {
    return documentNumberFormat;
  }

  public void setDocumentNumberFormat(List<StringFormat> documentNumberFormat) {
    this.documentNumberFormat = documentNumberFormat;
  }


  public AddCase caseNumberFormat(List<StringFormat> caseNumberFormat) {
    this.caseNumberFormat = caseNumberFormat;
    return this;
  }

  public AddCase addCaseNumberFormatItem(StringFormat caseNumberFormatItem) {
    if (this.caseNumberFormat == null) {
      this.caseNumberFormat = new ArrayList<>();
    }
    this.caseNumberFormat.add(caseNumberFormatItem);
    return this;
  }

  /**
   * Format of Case Number
   * 
   * @return caseNumberFormat
   */
  @javax.annotation.Nullable
  public List<StringFormat> getCaseNumberFormat() {
    return caseNumberFormat;
  }

  public void setCaseNumberFormat(List<StringFormat> caseNumberFormat) {
    this.caseNumberFormat = caseNumberFormat;
  }


  public AddCase metadata(Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public AddCase putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * Get metadata
   * 
   * @return metadata
   */
  @javax.annotation.Nullable
  public Map<String, Object> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }


  public AddCase documentIds(List<String> documentIds) {
    this.documentIds = documentIds;
    return this;
  }

  public AddCase addDocumentIdsItem(String documentIdsItem) {
    if (this.documentIds == null) {
      this.documentIds = new ArrayList<>();
    }
    this.documentIds.add(documentIdsItem);
    return this;
  }

  /**
   * Get documentIds
   * 
   * @return documentIds
   */
  @javax.annotation.Nullable
  public List<String> getDocumentIds() {
    return documentIds;
  }

  public void setDocumentIds(List<String> documentIds) {
    this.documentIds = documentIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddCase addCase = (AddCase) o;
    return Objects.equals(this.name, addCase.name) && Objects.equals(this.status, addCase.status)
        && Objects.equals(this.startDate, addCase.startDate)
        && Objects.equals(this.endDate, addCase.endDate)
        && Objects.equals(this.description, addCase.description)
        && Objects.equals(this.documentNumberFormat, addCase.documentNumberFormat)
        && Objects.equals(this.caseNumberFormat, addCase.caseNumberFormat)
        && Objects.equals(this.metadata, addCase.metadata)
        && Objects.equals(this.documentIds, addCase.documentIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, startDate, endDate, description, documentNumberFormat,
        caseNumberFormat, metadata, documentIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddCase {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    documentNumberFormat: ").append(toIndentedString(documentNumberFormat))
        .append("\n");
    sb.append("    caseNumberFormat: ").append(toIndentedString(caseNumberFormat)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    documentIds: ").append(toIndentedString(documentIds)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("description");
    openapiFields.add("documentNumberFormat");
    openapiFields.add("caseNumberFormat");
    openapiFields.add("metadata");
    openapiFields.add("documentIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AddCase
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!AddCase.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is
                                                      // null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in AddCase is not found in the empty JSON string",
            AddCase.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!AddCase.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `AddCase` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : AddCase.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format("The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if (!jsonObj.get("name").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `name` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("name").toString()));
    }
    // validate the optional field `status`
    if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
      CaseStatus.validateJsonElement(jsonObj.get("status"));
    }
    if ((jsonObj.get("startDate") != null && !jsonObj.get("startDate").isJsonNull())
        && !jsonObj.get("startDate").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `startDate` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("startDate").toString()));
    }
    if ((jsonObj.get("endDate") != null && !jsonObj.get("endDate").isJsonNull())
        && !jsonObj.get("endDate").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `endDate` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("endDate").toString()));
    }
    if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull())
        && !jsonObj.get("description").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `description` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("description").toString()));
    }
    if (jsonObj.get("documentNumberFormat") != null
        && !jsonObj.get("documentNumberFormat").isJsonNull()) {
      JsonArray jsonArraydocumentNumberFormat = jsonObj.getAsJsonArray("documentNumberFormat");
      if (jsonArraydocumentNumberFormat != null) {
        // ensure the json data is an array
        if (!jsonObj.get("documentNumberFormat").isJsonArray()) {
          throw new IllegalArgumentException(String.format(
              "Expected the field `documentNumberFormat` to be an array in the JSON string but got `%s`",
              jsonObj.get("documentNumberFormat").toString()));
        }

        // validate the optional field `documentNumberFormat` (array)
        for (int i = 0; i < jsonArraydocumentNumberFormat.size(); i++) {
          StringFormat.validateJsonElement(jsonArraydocumentNumberFormat.get(i));
        } ;
      }
    }
    if (jsonObj.get("caseNumberFormat") != null && !jsonObj.get("caseNumberFormat").isJsonNull()) {
      JsonArray jsonArraycaseNumberFormat = jsonObj.getAsJsonArray("caseNumberFormat");
      if (jsonArraycaseNumberFormat != null) {
        // ensure the json data is an array
        if (!jsonObj.get("caseNumberFormat").isJsonArray()) {
          throw new IllegalArgumentException(String.format(
              "Expected the field `caseNumberFormat` to be an array in the JSON string but got `%s`",
              jsonObj.get("caseNumberFormat").toString()));
        }

        // validate the optional field `caseNumberFormat` (array)
        for (int i = 0; i < jsonArraycaseNumberFormat.size(); i++) {
          StringFormat.validateJsonElement(jsonArraycaseNumberFormat.get(i));
        } ;
      }
    }
    // ensure the optional json data is an array if present
    if (jsonObj.get("documentIds") != null && !jsonObj.get("documentIds").isJsonNull()
        && !jsonObj.get("documentIds").isJsonArray()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `documentIds` to be an array in the JSON string but got `%s`",
          jsonObj.get("documentIds").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!AddCase.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'AddCase' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<AddCase> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(AddCase.class));

      return (TypeAdapter<T>) new TypeAdapter<AddCase>() {
        @Override
        public void write(JsonWriter out, AddCase value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public AddCase read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of AddCase given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AddCase
   * @throws IOException if the JSON string is invalid with respect to AddCase
   */
  public static AddCase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddCase.class);
  }

  /**
   * Convert an instance of AddCase to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

