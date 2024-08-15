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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.formkiq.client.invoker.JSON;

/**
 * WorkflowQueue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-08-13T19:59:27.914669-05:00[America/Winnipeg]",
    comments = "Generator version: 7.7.0")
public class WorkflowQueue {
  public static final String SERIALIZED_NAME_QUEUE_ID = "queueId";
  @SerializedName(SERIALIZED_NAME_QUEUE_ID)
  private String queueId;

  public static final String SERIALIZED_NAME_APPROVAL_GROUPS = "approvalGroups";
  @SerializedName(SERIALIZED_NAME_APPROVAL_GROUPS)
  private List<String> approvalGroups = new ArrayList<>();

  public WorkflowQueue() {}

  public WorkflowQueue queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }

  /**
   * Queue Id
   * 
   * @return queueId
   */
  @javax.annotation.Nullable
  public String getQueueId() {
    return queueId;
  }

  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }


  public WorkflowQueue approvalGroups(List<String> approvalGroups) {
    this.approvalGroups = approvalGroups;
    return this;
  }

  public WorkflowQueue addApprovalGroupsItem(String approvalGroupsItem) {
    if (this.approvalGroups == null) {
      this.approvalGroups = new ArrayList<>();
    }
    this.approvalGroups.add(approvalGroupsItem);
    return this;
  }

  /**
   * Get approvalGroups
   * 
   * @return approvalGroups
   */
  @javax.annotation.Nullable
  public List<String> getApprovalGroups() {
    return approvalGroups;
  }

  public void setApprovalGroups(List<String> approvalGroups) {
    this.approvalGroups = approvalGroups;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowQueue workflowQueue = (WorkflowQueue) o;
    return Objects.equals(this.queueId, workflowQueue.queueId)
        && Objects.equals(this.approvalGroups, workflowQueue.approvalGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueId, approvalGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowQueue {\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    approvalGroups: ").append(toIndentedString(approvalGroups)).append("\n");
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
    openapiFields.add("queueId");
    openapiFields.add("approvalGroups");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WorkflowQueue
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!WorkflowQueue.openapiRequiredFields.isEmpty()) { // has required fields but JSON element
                                                            // is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in WorkflowQueue is not found in the empty JSON string",
            WorkflowQueue.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!WorkflowQueue.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `WorkflowQueue` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("queueId") != null && !jsonObj.get("queueId").isJsonNull())
        && !jsonObj.get("queueId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `queueId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("queueId").toString()));
    }
    // ensure the optional json data is an array if present
    if (jsonObj.get("approvalGroups") != null && !jsonObj.get("approvalGroups").isJsonNull()
        && !jsonObj.get("approvalGroups").isJsonArray()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `approvalGroups` to be an array in the JSON string but got `%s`",
          jsonObj.get("approvalGroups").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!WorkflowQueue.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'WorkflowQueue' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<WorkflowQueue> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(WorkflowQueue.class));

      return (TypeAdapter<T>) new TypeAdapter<WorkflowQueue>() {
        @Override
        public void write(JsonWriter out, WorkflowQueue value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public WorkflowQueue read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of WorkflowQueue given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WorkflowQueue
   * @throws IOException if the JSON string is invalid with respect to WorkflowQueue
   */
  public static WorkflowQueue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkflowQueue.class);
  }

  /**
   * Convert an instance of WorkflowQueue to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

