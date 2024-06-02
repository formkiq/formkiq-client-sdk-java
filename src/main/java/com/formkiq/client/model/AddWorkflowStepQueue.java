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
 * AddWorkflowStepQueue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-05-31T23:04:19.034052-05:00[America/Winnipeg]",
    comments = "Generator version: 7.6.0")
public class AddWorkflowStepQueue {
  public static final String SERIALIZED_NAME_QUEUE_ID = "queueId";
  @SerializedName(SERIALIZED_NAME_QUEUE_ID)
  private String queueId;

  public static final String SERIALIZED_NAME_APPROVAL_GROUPS = "approvalGroups";
  @SerializedName(SERIALIZED_NAME_APPROVAL_GROUPS)
  private List<String> approvalGroups = new ArrayList<>();

  public AddWorkflowStepQueue() {}

  public AddWorkflowStepQueue queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }

  /**
   * Queue Identifier
   * 
   * @return queueId
   **/
  @javax.annotation.Nonnull
  public String getQueueId() {
    return queueId;
  }

  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }


  public AddWorkflowStepQueue approvalGroups(List<String> approvalGroups) {
    this.approvalGroups = approvalGroups;
    return this;
  }

  public AddWorkflowStepQueue addApprovalGroupsItem(String approvalGroupsItem) {
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
   **/
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
    AddWorkflowStepQueue addWorkflowStepQueue = (AddWorkflowStepQueue) o;
    return Objects.equals(this.queueId, addWorkflowStepQueue.queueId)
        && Objects.equals(this.approvalGroups, addWorkflowStepQueue.approvalGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueId, approvalGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddWorkflowStepQueue {\n");
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
    openapiRequiredFields.add("queueId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AddWorkflowStepQueue
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!AddWorkflowStepQueue.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                   // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in AddWorkflowStepQueue is not found in the empty JSON string",
            AddWorkflowStepQueue.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!AddWorkflowStepQueue.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `AddWorkflowStepQueue` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : AddWorkflowStepQueue.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format("The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if (!jsonObj.get("queueId").isJsonPrimitive()) {
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
      if (!AddWorkflowStepQueue.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'AddWorkflowStepQueue' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<AddWorkflowStepQueue> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(AddWorkflowStepQueue.class));

      return (TypeAdapter<T>) new TypeAdapter<AddWorkflowStepQueue>() {
        @Override
        public void write(JsonWriter out, AddWorkflowStepQueue value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public AddWorkflowStepQueue read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of AddWorkflowStepQueue given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AddWorkflowStepQueue
   * @throws IOException if the JSON string is invalid with respect to AddWorkflowStepQueue
   */
  public static AddWorkflowStepQueue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddWorkflowStepQueue.class);
  }

  /**
   * Convert an instance of AddWorkflowStepQueue to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

