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
import com.formkiq.client.model.AddAction;
import com.formkiq.client.model.AddWorkflowStepDecision;
import com.formkiq.client.model.AddWorkflowStepQueue;
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
 * AddWorkflowStep
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-08-04T20:12:43.895378-05:00[America/Winnipeg]",
    comments = "Generator version: 7.7.0")
public class AddWorkflowStep {
  public static final String SERIALIZED_NAME_STEP_ID = "stepId";
  @SerializedName(SERIALIZED_NAME_STEP_ID)
  private String stepId;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private AddAction action;

  public static final String SERIALIZED_NAME_QUEUE = "queue";
  @SerializedName(SERIALIZED_NAME_QUEUE)
  private AddWorkflowStepQueue queue;

  public static final String SERIALIZED_NAME_DECISIONS = "decisions";
  @SerializedName(SERIALIZED_NAME_DECISIONS)
  private List<AddWorkflowStepDecision> decisions = new ArrayList<>();

  public AddWorkflowStep() {}

  public AddWorkflowStep stepId(String stepId) {
    this.stepId = stepId;
    return this;
  }

  /**
   * Workflow Step Identifier
   * 
   * @return stepId
   */
  @javax.annotation.Nullable
  public String getStepId() {
    return stepId;
  }

  public void setStepId(String stepId) {
    this.stepId = stepId;
  }


  public AddWorkflowStep action(AddAction action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * 
   * @return action
   */
  @javax.annotation.Nullable
  public AddAction getAction() {
    return action;
  }

  public void setAction(AddAction action) {
    this.action = action;
  }


  public AddWorkflowStep queue(AddWorkflowStepQueue queue) {
    this.queue = queue;
    return this;
  }

  /**
   * Get queue
   * 
   * @return queue
   */
  @javax.annotation.Nullable
  public AddWorkflowStepQueue getQueue() {
    return queue;
  }

  public void setQueue(AddWorkflowStepQueue queue) {
    this.queue = queue;
  }


  public AddWorkflowStep decisions(List<AddWorkflowStepDecision> decisions) {
    this.decisions = decisions;
    return this;
  }

  public AddWorkflowStep addDecisionsItem(AddWorkflowStepDecision decisionsItem) {
    if (this.decisions == null) {
      this.decisions = new ArrayList<>();
    }
    this.decisions.add(decisionsItem);
    return this;
  }

  /**
   * Workflow Decisions
   * 
   * @return decisions
   */
  @javax.annotation.Nullable
  public List<AddWorkflowStepDecision> getDecisions() {
    return decisions;
  }

  public void setDecisions(List<AddWorkflowStepDecision> decisions) {
    this.decisions = decisions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddWorkflowStep addWorkflowStep = (AddWorkflowStep) o;
    return Objects.equals(this.stepId, addWorkflowStep.stepId)
        && Objects.equals(this.action, addWorkflowStep.action)
        && Objects.equals(this.queue, addWorkflowStep.queue)
        && Objects.equals(this.decisions, addWorkflowStep.decisions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stepId, action, queue, decisions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddWorkflowStep {\n");
    sb.append("    stepId: ").append(toIndentedString(stepId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    decisions: ").append(toIndentedString(decisions)).append("\n");
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
    openapiFields.add("stepId");
    openapiFields.add("action");
    openapiFields.add("queue");
    openapiFields.add("decisions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AddWorkflowStep
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!AddWorkflowStep.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                              // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in AddWorkflowStep is not found in the empty JSON string",
            AddWorkflowStep.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!AddWorkflowStep.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `AddWorkflowStep` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("stepId") != null && !jsonObj.get("stepId").isJsonNull())
        && !jsonObj.get("stepId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `stepId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("stepId").toString()));
    }
    // validate the optional field `action`
    if (jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) {
      AddAction.validateJsonElement(jsonObj.get("action"));
    }
    // validate the optional field `queue`
    if (jsonObj.get("queue") != null && !jsonObj.get("queue").isJsonNull()) {
      AddWorkflowStepQueue.validateJsonElement(jsonObj.get("queue"));
    }
    if (jsonObj.get("decisions") != null && !jsonObj.get("decisions").isJsonNull()) {
      JsonArray jsonArraydecisions = jsonObj.getAsJsonArray("decisions");
      if (jsonArraydecisions != null) {
        // ensure the json data is an array
        if (!jsonObj.get("decisions").isJsonArray()) {
          throw new IllegalArgumentException(String.format(
              "Expected the field `decisions` to be an array in the JSON string but got `%s`",
              jsonObj.get("decisions").toString()));
        }

        // validate the optional field `decisions` (array)
        for (int i = 0; i < jsonArraydecisions.size(); i++) {
          AddWorkflowStepDecision.validateJsonElement(jsonArraydecisions.get(i));
        } ;
      }
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!AddWorkflowStep.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'AddWorkflowStep' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<AddWorkflowStep> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(AddWorkflowStep.class));

      return (TypeAdapter<T>) new TypeAdapter<AddWorkflowStep>() {
        @Override
        public void write(JsonWriter out, AddWorkflowStep value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public AddWorkflowStep read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of AddWorkflowStep given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AddWorkflowStep
   * @throws IOException if the JSON string is invalid with respect to AddWorkflowStep
   */
  public static AddWorkflowStep fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddWorkflowStep.class);
  }

  /**
   * Convert an instance of AddWorkflowStep to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

