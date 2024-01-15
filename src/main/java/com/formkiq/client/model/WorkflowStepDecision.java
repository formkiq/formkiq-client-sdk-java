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
 * The version of the OpenAPI document: 1.14.0 Contact: support@formkiq.com
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.formkiq.client.invoker.JSON;

/**
 * WorkflowStepDecision
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-01-13T17:56:16.985602-06:00[America/Winnipeg]")
public class WorkflowStepDecision {
  /**
   * Type of Workflow Step Decision
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    APPROVE("APPROVE"),

    REJECT("REJECT");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_NEXT_STEP_ID = "nextStepId";
  @SerializedName(SERIALIZED_NAME_NEXT_STEP_ID)
  private String nextStepId;

  public WorkflowStepDecision() {}

  public WorkflowStepDecision type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of Workflow Step Decision
   * 
   * @return type
   **/
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  public WorkflowStepDecision nextStepId(String nextStepId) {
    this.nextStepId = nextStepId;
    return this;
  }

  /**
   * Workflow Step to move to
   * 
   * @return nextStepId
   **/
  @javax.annotation.Nullable
  public String getNextStepId() {
    return nextStepId;
  }

  public void setNextStepId(String nextStepId) {
    this.nextStepId = nextStepId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowStepDecision workflowStepDecision = (WorkflowStepDecision) o;
    return Objects.equals(this.type, workflowStepDecision.type)
        && Objects.equals(this.nextStepId, workflowStepDecision.nextStepId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, nextStepId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowStepDecision {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    nextStepId: ").append(toIndentedString(nextStepId)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("nextStepId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WorkflowStepDecision
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!WorkflowStepDecision.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                   // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in WorkflowStepDecision is not found in the empty JSON string",
            WorkflowStepDecision.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!WorkflowStepDecision.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `WorkflowStepDecision` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull())
        && !jsonObj.get("type").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `type` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("type").toString()));
    }
    // validate the optional field `type`
    if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
      TypeEnum.validateJsonElement(jsonObj.get("type"));
    }
    if ((jsonObj.get("nextStepId") != null && !jsonObj.get("nextStepId").isJsonNull())
        && !jsonObj.get("nextStepId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `nextStepId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("nextStepId").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!WorkflowStepDecision.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'WorkflowStepDecision' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<WorkflowStepDecision> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(WorkflowStepDecision.class));

      return (TypeAdapter<T>) new TypeAdapter<WorkflowStepDecision>() {
        @Override
        public void write(JsonWriter out, WorkflowStepDecision value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public WorkflowStepDecision read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of WorkflowStepDecision given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WorkflowStepDecision
   * @throws IOException if the JSON string is invalid with respect to WorkflowStepDecision
   */
  public static WorkflowStepDecision fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkflowStepDecision.class);
  }

  /**
   * Convert an instance of WorkflowStepDecision to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

