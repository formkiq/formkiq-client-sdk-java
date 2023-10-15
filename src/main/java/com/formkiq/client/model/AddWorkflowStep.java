/*
 * FormKiQ HTTP API Formkiq API: Document Management Platform API using OAuth(JWT) Authentication
 * You can find out more about FormKiQ at [https://formkiq.com](http://formkiq.com). ## Introduction
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
 * The version of the OpenAPI document: 1.13.0 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import com.formkiq.client.model.AddAction;
import com.formkiq.client.model.AddQueue;
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
    date = "2023-10-14T22:24:24.582106-05:00[America/Winnipeg]")
public class AddWorkflowStep {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private AddAction action;

  public static final String SERIALIZED_NAME_QUEUE = "queue";
  @SerializedName(SERIALIZED_NAME_QUEUE)
  private AddQueue queue;

  public AddWorkflowStep() {}

  public AddWorkflowStep id(String id) {

    this.id = id;
    return this;
  }

  /**
   * Step identifier
   * 
   * @return id
   **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public AddWorkflowStep type(String type) {

    this.type = type;
    return this;
  }

  /**
   * Workflow step type
   * 
   * @return type
   **/
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public AddWorkflowStep action(AddAction action) {

    this.action = action;
    return this;
  }

  /**
   * Get action
   * 
   * @return action
   **/
  @javax.annotation.Nullable
  public AddAction getAction() {
    return action;
  }


  public void setAction(AddAction action) {
    this.action = action;
  }


  public AddWorkflowStep queue(AddQueue queue) {

    this.queue = queue;
    return this;
  }

  /**
   * Get queue
   * 
   * @return queue
   **/
  @javax.annotation.Nullable
  public AddQueue getQueue() {
    return queue;
  }


  public void setQueue(AddQueue queue) {
    this.queue = queue;
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
    return Objects.equals(this.id, addWorkflowStep.id)
        && Objects.equals(this.type, addWorkflowStep.type)
        && Objects.equals(this.action, addWorkflowStep.action)
        && Objects.equals(this.queue, addWorkflowStep.queue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, action, queue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddWorkflowStep {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("type");
    openapiFields.add("action");
    openapiFields.add("queue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("type");
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

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : AddWorkflowStep.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format("The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if (!jsonObj.get("id").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `id` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("id").toString()));
    }
    if (!jsonObj.get("type").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `type` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("type").toString()));
    }
    // validate the optional field `action`
    if (jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) {
      AddAction.validateJsonElement(jsonObj.get("action"));
    }
    // validate the optional field `queue`
    if (jsonObj.get("queue") != null && !jsonObj.get("queue").isJsonNull()) {
      AddQueue.validateJsonElement(jsonObj.get("queue"));
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
