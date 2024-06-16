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
 * The version of the OpenAPI document: 1.15.0 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import com.formkiq.client.model.DocumentActionStatus;
import com.formkiq.client.model.DocumentActionType;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.formkiq.client.invoker.JSON;

/**
 * DocumentAction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-06-16T11:16:04.034590-05:00[America/Winnipeg]",
    comments = "Generator version: 7.6.0")
public class DocumentAction {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private DocumentActionStatus status;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private DocumentActionType type;

  public static final String SERIALIZED_NAME_QUEUE_ID = "queueId";
  @SerializedName(SERIALIZED_NAME_QUEUE_ID)
  private String queueId;

  public static final String SERIALIZED_NAME_WORKFLOW_ID = "workflowId";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_ID)
  private String workflowId;

  public static final String SERIALIZED_NAME_WORKFLOW_STEP_ID = "workflowStepId";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_STEP_ID)
  private String workflowStepId;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_INSERTED_DATE = "insertedDate";
  @SerializedName(SERIALIZED_NAME_INSERTED_DATE)
  private String insertedDate;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_COMPLETED_DATE = "completedDate";
  @SerializedName(SERIALIZED_NAME_COMPLETED_DATE)
  private String completedDate;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private Map<String, String> parameters = new HashMap<>();

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = new HashMap<>();

  public DocumentAction() {}

  public DocumentAction status(DocumentActionStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * 
   * @return status
   **/
  @javax.annotation.Nullable
  public DocumentActionStatus getStatus() {
    return status;
  }

  public void setStatus(DocumentActionStatus status) {
    this.status = status;
  }


  public DocumentAction type(DocumentActionType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * 
   * @return type
   **/
  @javax.annotation.Nullable
  public DocumentActionType getType() {
    return type;
  }

  public void setType(DocumentActionType type) {
    this.type = type;
  }


  public DocumentAction queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }

  /**
   * Queue Id
   * 
   * @return queueId
   **/
  @javax.annotation.Nullable
  public String getQueueId() {
    return queueId;
  }

  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }


  public DocumentAction workflowId(String workflowId) {
    this.workflowId = workflowId;
    return this;
  }

  /**
   * Workflow Id
   * 
   * @return workflowId
   **/
  @javax.annotation.Nullable
  public String getWorkflowId() {
    return workflowId;
  }

  public void setWorkflowId(String workflowId) {
    this.workflowId = workflowId;
  }


  public DocumentAction workflowStepId(String workflowStepId) {
    this.workflowStepId = workflowStepId;
    return this;
  }

  /**
   * Workflow Step Id
   * 
   * @return workflowStepId
   **/
  @javax.annotation.Nullable
  public String getWorkflowStepId() {
    return workflowStepId;
  }

  public void setWorkflowStepId(String workflowStepId) {
    this.workflowStepId = workflowStepId;
  }


  public DocumentAction message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Action message information
   * 
   * @return message
   **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public DocumentAction userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * User who requested the Action
   * 
   * @return userId
   **/
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public DocumentAction insertedDate(String insertedDate) {
    this.insertedDate = insertedDate;
    return this;
  }

  /**
   * Inserted Timestamp
   * 
   * @return insertedDate
   **/
  @javax.annotation.Nullable
  public String getInsertedDate() {
    return insertedDate;
  }

  public void setInsertedDate(String insertedDate) {
    this.insertedDate = insertedDate;
  }


  public DocumentAction startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Started Timestamp
   * 
   * @return startDate
   **/
  @javax.annotation.Nullable
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public DocumentAction completedDate(String completedDate) {
    this.completedDate = completedDate;
    return this;
  }

  /**
   * Completed Timestamp
   * 
   * @return completedDate
   **/
  @javax.annotation.Nullable
  public String getCompletedDate() {
    return completedDate;
  }

  public void setCompletedDate(String completedDate) {
    this.completedDate = completedDate;
  }


  public DocumentAction parameters(Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public DocumentAction putParametersItem(String key, String parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<>();
    }
    this.parameters.put(key, parametersItem);
    return this;
  }

  /**
   * Action parameters
   * 
   * @return parameters
   **/
  @javax.annotation.Nullable
  public Map<String, String> getParameters() {
    return parameters;
  }

  public void setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
  }


  public DocumentAction metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public DocumentAction putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * Action metadata
   * 
   * @return metadata
   **/
  @javax.annotation.Nullable
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentAction documentAction = (DocumentAction) o;
    return Objects.equals(this.status, documentAction.status)
        && Objects.equals(this.type, documentAction.type)
        && Objects.equals(this.queueId, documentAction.queueId)
        && Objects.equals(this.workflowId, documentAction.workflowId)
        && Objects.equals(this.workflowStepId, documentAction.workflowStepId)
        && Objects.equals(this.message, documentAction.message)
        && Objects.equals(this.userId, documentAction.userId)
        && Objects.equals(this.insertedDate, documentAction.insertedDate)
        && Objects.equals(this.startDate, documentAction.startDate)
        && Objects.equals(this.completedDate, documentAction.completedDate)
        && Objects.equals(this.parameters, documentAction.parameters)
        && Objects.equals(this.metadata, documentAction.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, type, queueId, workflowId, workflowStepId, message, userId,
        insertedDate, startDate, completedDate, parameters, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentAction {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    workflowStepId: ").append(toIndentedString(workflowStepId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    insertedDate: ").append(toIndentedString(insertedDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    completedDate: ").append(toIndentedString(completedDate)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("type");
    openapiFields.add("queueId");
    openapiFields.add("workflowId");
    openapiFields.add("workflowStepId");
    openapiFields.add("message");
    openapiFields.add("userId");
    openapiFields.add("insertedDate");
    openapiFields.add("startDate");
    openapiFields.add("completedDate");
    openapiFields.add("parameters");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocumentAction
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!DocumentAction.openapiRequiredFields.isEmpty()) { // has required fields but JSON element
                                                             // is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in DocumentAction is not found in the empty JSON string",
            DocumentAction.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!DocumentAction.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `DocumentAction` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the optional field `status`
    if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
      DocumentActionStatus.validateJsonElement(jsonObj.get("status"));
    }
    // validate the optional field `type`
    if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
      DocumentActionType.validateJsonElement(jsonObj.get("type"));
    }
    if ((jsonObj.get("queueId") != null && !jsonObj.get("queueId").isJsonNull())
        && !jsonObj.get("queueId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `queueId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("queueId").toString()));
    }
    if ((jsonObj.get("workflowId") != null && !jsonObj.get("workflowId").isJsonNull())
        && !jsonObj.get("workflowId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `workflowId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("workflowId").toString()));
    }
    if ((jsonObj.get("workflowStepId") != null && !jsonObj.get("workflowStepId").isJsonNull())
        && !jsonObj.get("workflowStepId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `workflowStepId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("workflowStepId").toString()));
    }
    if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull())
        && !jsonObj.get("message").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `message` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("message").toString()));
    }
    if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull())
        && !jsonObj.get("userId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `userId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("userId").toString()));
    }
    if ((jsonObj.get("insertedDate") != null && !jsonObj.get("insertedDate").isJsonNull())
        && !jsonObj.get("insertedDate").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `insertedDate` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("insertedDate").toString()));
    }
    if ((jsonObj.get("startDate") != null && !jsonObj.get("startDate").isJsonNull())
        && !jsonObj.get("startDate").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `startDate` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("startDate").toString()));
    }
    if ((jsonObj.get("completedDate") != null && !jsonObj.get("completedDate").isJsonNull())
        && !jsonObj.get("completedDate").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `completedDate` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("completedDate").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!DocumentAction.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'DocumentAction' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<DocumentAction> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(DocumentAction.class));

      return (TypeAdapter<T>) new TypeAdapter<DocumentAction>() {
        @Override
        public void write(JsonWriter out, DocumentAction value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public DocumentAction read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of DocumentAction given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocumentAction
   * @throws IOException if the JSON string is invalid with respect to DocumentAction
   */
  public static DocumentAction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentAction.class);
  }

  /**
   * Convert an instance of DocumentAction to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

