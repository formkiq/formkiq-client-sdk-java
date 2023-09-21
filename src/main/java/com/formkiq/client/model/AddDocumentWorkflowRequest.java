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
 * AddDocumentWorkflowRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-09-20T17:40:08.427476-05:00[America/Winnipeg]")
public class AddDocumentWorkflowRequest {
  public static final String SERIALIZED_NAME_STEP_ID = "stepId";
  @SerializedName(SERIALIZED_NAME_STEP_ID)
  private String stepId;

  /**
   * Workflow step status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    COMPLETE("COMPLETE"),

    FAILED("FAILED");

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

  public AddDocumentWorkflowRequest() {}

  public AddDocumentWorkflowRequest stepId(String stepId) {

    this.stepId = stepId;
    return this;
  }

  /**
   * Step identifier
   * 
   * @return stepId
   **/
  @javax.annotation.Nonnull
  public String getStepId() {
    return stepId;
  }


  public void setStepId(String stepId) {
    this.stepId = stepId;
  }


  public AddDocumentWorkflowRequest status(StatusEnum status) {

    this.status = status;
    return this;
  }

  /**
   * Workflow step status
   * 
   * @return status
   **/
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddDocumentWorkflowRequest addDocumentWorkflowRequest = (AddDocumentWorkflowRequest) o;
    return Objects.equals(this.stepId, addDocumentWorkflowRequest.stepId)
        && Objects.equals(this.status, addDocumentWorkflowRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stepId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddDocumentWorkflowRequest {\n");
    sb.append("    stepId: ").append(toIndentedString(stepId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("stepId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AddDocumentWorkflowRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!AddDocumentWorkflowRequest.openapiRequiredFields.isEmpty()) { // has required fields but
                                                                         // JSON element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in AddDocumentWorkflowRequest is not found in the empty JSON string",
            AddDocumentWorkflowRequest.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!AddDocumentWorkflowRequest.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `AddDocumentWorkflowRequest` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : AddDocumentWorkflowRequest.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format("The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if (!jsonObj.get("stepId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `stepId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("stepId").toString()));
    }
    if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull())
        && !jsonObj.get("status").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `status` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("status").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!AddDocumentWorkflowRequest.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'AddDocumentWorkflowRequest' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<AddDocumentWorkflowRequest> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(AddDocumentWorkflowRequest.class));

      return (TypeAdapter<T>) new TypeAdapter<AddDocumentWorkflowRequest>() {
        @Override
        public void write(JsonWriter out, AddDocumentWorkflowRequest value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public AddDocumentWorkflowRequest read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of AddDocumentWorkflowRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AddDocumentWorkflowRequest
   * @throws IOException if the JSON string is invalid with respect to AddDocumentWorkflowRequest
   */
  public static AddDocumentWorkflowRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddDocumentWorkflowRequest.class);
  }

  /**
   * Convert an instance of AddDocumentWorkflowRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

