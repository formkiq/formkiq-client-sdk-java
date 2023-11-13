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
import com.formkiq.client.model.AddWorkflowStep;
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
 * SetWorkflowRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-11-12T20:44:26.668767-06:00[America/Winnipeg]")
public class SetWorkflowRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("ACTIVE"),

    INACTIVE("INACTIVE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private List<AddWorkflowStep> steps = new ArrayList<>();

  public SetWorkflowRequest() {}

  public SetWorkflowRequest name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Workflow name
   * 
   * @return name
   **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SetWorkflowRequest description(String description) {

    this.description = description;
    return this;
  }

  /**
   * Workflow description
   * 
   * @return description
   **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SetWorkflowRequest status(StatusEnum status) {

    this.status = status;
    return this;
  }

  /**
   * Get status
   * 
   * @return status
   **/
  @javax.annotation.Nonnull
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public SetWorkflowRequest steps(List<AddWorkflowStep> steps) {

    this.steps = steps;
    return this;
  }

  public SetWorkflowRequest addStepsItem(AddWorkflowStep stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

  /**
   * Workflow Steps
   * 
   * @return steps
   **/
  @javax.annotation.Nonnull
  public List<AddWorkflowStep> getSteps() {
    return steps;
  }


  public void setSteps(List<AddWorkflowStep> steps) {
    this.steps = steps;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetWorkflowRequest setWorkflowRequest = (SetWorkflowRequest) o;
    return Objects.equals(this.name, setWorkflowRequest.name)
        && Objects.equals(this.description, setWorkflowRequest.description)
        && Objects.equals(this.status, setWorkflowRequest.status)
        && Objects.equals(this.steps, setWorkflowRequest.steps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, status, steps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetWorkflowRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("status");
    openapiFields.add("steps");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("steps");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SetWorkflowRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!SetWorkflowRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                 // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in SetWorkflowRequest is not found in the empty JSON string",
            SetWorkflowRequest.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!SetWorkflowRequest.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `SetWorkflowRequest` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : SetWorkflowRequest.openapiRequiredFields) {
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
    if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull())
        && !jsonObj.get("description").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `description` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("description").toString()));
    }
    if (!jsonObj.get("status").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `status` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("status").toString()));
    }
    // ensure the json data is an array
    if (!jsonObj.get("steps").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format("Expected the field `steps` to be an array in the JSON string but got `%s`",
              jsonObj.get("steps").toString()));
    }

    JsonArray jsonArraysteps = jsonObj.getAsJsonArray("steps");
    // validate the required field `steps` (array)
    for (int i = 0; i < jsonArraysteps.size(); i++) {
      AddWorkflowStep.validateJsonElement(jsonArraysteps.get(i));
    } ;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!SetWorkflowRequest.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'SetWorkflowRequest' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<SetWorkflowRequest> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(SetWorkflowRequest.class));

      return (TypeAdapter<T>) new TypeAdapter<SetWorkflowRequest>() {
        @Override
        public void write(JsonWriter out, SetWorkflowRequest value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public SetWorkflowRequest read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of SetWorkflowRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SetWorkflowRequest
   * @throws IOException if the JSON string is invalid with respect to SetWorkflowRequest
   */
  public static SetWorkflowRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SetWorkflowRequest.class);
  }

  /**
   * Convert an instance of SetWorkflowRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

