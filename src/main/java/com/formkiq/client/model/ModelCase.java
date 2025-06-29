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
import com.formkiq.client.model.CaseStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
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
 * ModelCase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2025-05-20T14:44:33.741519-05:00[America/Winnipeg]",
    comments = "Generator version: 7.13.0")
public class ModelCase {
  public static final String SERIALIZED_NAME_CASE_ID = "caseId";
  @SerializedName(SERIALIZED_NAME_CASE_ID)
  @javax.annotation.Nullable
  private String caseId;

  public static final String SERIALIZED_NAME_CASE_NUMBER = "caseNumber";
  @SerializedName(SERIALIZED_NAME_CASE_NUMBER)
  @javax.annotation.Nullable
  private String caseNumber;

  public static final String SERIALIZED_NAME_DOCUMENT_NUMBER = "documentNumber";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_NUMBER)
  @javax.annotation.Nullable
  private String documentNumber;

  public static final String SERIALIZED_NAME_PLANNED_START_DATE = "plannedStartDate";
  @SerializedName(SERIALIZED_NAME_PLANNED_START_DATE)
  @javax.annotation.Nullable
  private String plannedStartDate;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nullable
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  @javax.annotation.Nullable
  private String endDate;

  public static final String SERIALIZED_NAME_DUE_DATE = "dueDate";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  @javax.annotation.Nullable
  private String dueDate;

  public static final String SERIALIZED_NAME_INSERTED_DATE = "insertedDate";
  @SerializedName(SERIALIZED_NAME_INSERTED_DATE)
  @javax.annotation.Nullable
  private String insertedDate;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  @javax.annotation.Nullable
  private Map<String, Object> metadata = new HashMap<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private CaseStatus status;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  @javax.annotation.Nullable
  private String userId;

  public ModelCase() {}

  public ModelCase caseId(@javax.annotation.Nullable String caseId) {
    this.caseId = caseId;
    return this;
  }

  /**
   * Case Identifier
   * 
   * @return caseId
   */
  @javax.annotation.Nullable
  public String getCaseId() {
    return caseId;
  }

  public void setCaseId(@javax.annotation.Nullable String caseId) {
    this.caseId = caseId;
  }


  public ModelCase caseNumber(@javax.annotation.Nullable String caseNumber) {
    this.caseNumber = caseNumber;
    return this;
  }

  /**
   * Case Number
   * 
   * @return caseNumber
   */
  @javax.annotation.Nullable
  public String getCaseNumber() {
    return caseNumber;
  }

  public void setCaseNumber(@javax.annotation.Nullable String caseNumber) {
    this.caseNumber = caseNumber;
  }


  public ModelCase documentNumber(@javax.annotation.Nullable String documentNumber) {
    this.documentNumber = documentNumber;
    return this;
  }

  /**
   * Document Number
   * 
   * @return documentNumber
   */
  @javax.annotation.Nullable
  public String getDocumentNumber() {
    return documentNumber;
  }

  public void setDocumentNumber(@javax.annotation.Nullable String documentNumber) {
    this.documentNumber = documentNumber;
  }


  public ModelCase plannedStartDate(@javax.annotation.Nullable String plannedStartDate) {
    this.plannedStartDate = plannedStartDate;
    return this;
  }

  /**
   * Planned Start Date
   * 
   * @return plannedStartDate
   */
  @javax.annotation.Nullable
  public String getPlannedStartDate() {
    return plannedStartDate;
  }

  public void setPlannedStartDate(@javax.annotation.Nullable String plannedStartDate) {
    this.plannedStartDate = plannedStartDate;
  }


  public ModelCase startDate(@javax.annotation.Nullable String startDate) {
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

  public void setStartDate(@javax.annotation.Nullable String startDate) {
    this.startDate = startDate;
  }


  public ModelCase endDate(@javax.annotation.Nullable String endDate) {
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

  public void setEndDate(@javax.annotation.Nullable String endDate) {
    this.endDate = endDate;
  }


  public ModelCase dueDate(@javax.annotation.Nullable String dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Due Date
   * 
   * @return dueDate
   */
  @javax.annotation.Nullable
  public String getDueDate() {
    return dueDate;
  }

  public void setDueDate(@javax.annotation.Nullable String dueDate) {
    this.dueDate = dueDate;
  }


  public ModelCase insertedDate(@javax.annotation.Nullable String insertedDate) {
    this.insertedDate = insertedDate;
    return this;
  }

  /**
   * Inserted Timestamp
   * 
   * @return insertedDate
   */
  @javax.annotation.Nullable
  public String getInsertedDate() {
    return insertedDate;
  }

  public void setInsertedDate(@javax.annotation.Nullable String insertedDate) {
    this.insertedDate = insertedDate;
  }


  public ModelCase name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Case Name
   * 
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public ModelCase description(@javax.annotation.Nullable String description) {
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

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public ModelCase metadata(@javax.annotation.Nullable Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public ModelCase putMetadataItem(String key, Object metadataItem) {
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

  public void setMetadata(@javax.annotation.Nullable Map<String, Object> metadata) {
    this.metadata = metadata;
  }


  public ModelCase status(@javax.annotation.Nullable CaseStatus status) {
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

  public void setStatus(@javax.annotation.Nullable CaseStatus status) {
    this.status = status;
  }


  public ModelCase userId(@javax.annotation.Nullable String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * User who added document
   * 
   * @return userId
   */
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }

  public void setUserId(@javax.annotation.Nullable String userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelCase _case = (ModelCase) o;
    return Objects.equals(this.caseId, _case.caseId)
        && Objects.equals(this.caseNumber, _case.caseNumber)
        && Objects.equals(this.documentNumber, _case.documentNumber)
        && Objects.equals(this.plannedStartDate, _case.plannedStartDate)
        && Objects.equals(this.startDate, _case.startDate)
        && Objects.equals(this.endDate, _case.endDate)
        && Objects.equals(this.dueDate, _case.dueDate)
        && Objects.equals(this.insertedDate, _case.insertedDate)
        && Objects.equals(this.name, _case.name)
        && Objects.equals(this.description, _case.description)
        && Objects.equals(this.metadata, _case.metadata)
        && Objects.equals(this.status, _case.status) && Objects.equals(this.userId, _case.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseId, caseNumber, documentNumber, plannedStartDate, startDate, endDate,
        dueDate, insertedDate, name, description, metadata, status, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCase {\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    caseNumber: ").append(toIndentedString(caseNumber)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    plannedStartDate: ").append(toIndentedString(plannedStartDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    insertedDate: ").append(toIndentedString(insertedDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("caseId");
    openapiFields.add("caseNumber");
    openapiFields.add("documentNumber");
    openapiFields.add("plannedStartDate");
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("dueDate");
    openapiFields.add("insertedDate");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("metadata");
    openapiFields.add("status");
    openapiFields.add("userId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ModelCase
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!ModelCase.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is
                                                        // null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in ModelCase is not found in the empty JSON string",
            ModelCase.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!ModelCase.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `ModelCase` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("caseId") != null && !jsonObj.get("caseId").isJsonNull())
        && !jsonObj.get("caseId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `caseId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("caseId").toString()));
    }
    if ((jsonObj.get("caseNumber") != null && !jsonObj.get("caseNumber").isJsonNull())
        && !jsonObj.get("caseNumber").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `caseNumber` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("caseNumber").toString()));
    }
    if ((jsonObj.get("documentNumber") != null && !jsonObj.get("documentNumber").isJsonNull())
        && !jsonObj.get("documentNumber").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `documentNumber` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("documentNumber").toString()));
    }
    if ((jsonObj.get("plannedStartDate") != null && !jsonObj.get("plannedStartDate").isJsonNull())
        && !jsonObj.get("plannedStartDate").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `plannedStartDate` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("plannedStartDate").toString()));
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
    if ((jsonObj.get("dueDate") != null && !jsonObj.get("dueDate").isJsonNull())
        && !jsonObj.get("dueDate").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `dueDate` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("dueDate").toString()));
    }
    if ((jsonObj.get("insertedDate") != null && !jsonObj.get("insertedDate").isJsonNull())
        && !jsonObj.get("insertedDate").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `insertedDate` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("insertedDate").toString()));
    }
    if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull())
        && !jsonObj.get("name").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `name` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("name").toString()));
    }
    if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull())
        && !jsonObj.get("description").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `description` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("description").toString()));
    }
    // validate the optional field `status`
    if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
      CaseStatus.validateJsonElement(jsonObj.get("status"));
    }
    if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull())
        && !jsonObj.get("userId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `userId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("userId").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!ModelCase.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'ModelCase' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<ModelCase> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(ModelCase.class));

      return (TypeAdapter<T>) new TypeAdapter<ModelCase>() {
        @Override
        public void write(JsonWriter out, ModelCase value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public ModelCase read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of ModelCase given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ModelCase
   * @throws IOException if the JSON string is invalid with respect to ModelCase
   */
  public static ModelCase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelCase.class);
  }

  /**
   * Convert an instance of ModelCase to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

