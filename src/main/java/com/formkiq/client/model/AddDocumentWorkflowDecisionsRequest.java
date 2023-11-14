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
 * AddDocumentWorkflowDecisionsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-11-14T10:43:04.140627-06:00[America/Winnipeg]")
public class AddDocumentWorkflowDecisionsRequest {
  public static final String SERIALIZED_NAME_QUEUE_ID = "queueId";
  @SerializedName(SERIALIZED_NAME_QUEUE_ID)
  private String queueId;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private String comments;

  /**
   * Gets or Sets decision
   */
  @JsonAdapter(DecisionEnum.Adapter.class)
  public enum DecisionEnum {
    APPROVE("APPROVE"),

    REJECT("REJECT");

    private String value;

    DecisionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DecisionEnum fromValue(String value) {
      for (DecisionEnum b : DecisionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DecisionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DecisionEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DecisionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DecisionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DECISION = "decision";
  @SerializedName(SERIALIZED_NAME_DECISION)
  private DecisionEnum decision;

  public AddDocumentWorkflowDecisionsRequest() {}

  public AddDocumentWorkflowDecisionsRequest queueId(String queueId) {

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


  public AddDocumentWorkflowDecisionsRequest comments(String comments) {

    this.comments = comments;
    return this;
  }

  /**
   * Workflow decision comments
   * 
   * @return comments
   **/
  @javax.annotation.Nullable
  public String getComments() {
    return comments;
  }


  public void setComments(String comments) {
    this.comments = comments;
  }


  public AddDocumentWorkflowDecisionsRequest decision(DecisionEnum decision) {

    this.decision = decision;
    return this;
  }

  /**
   * Get decision
   * 
   * @return decision
   **/
  @javax.annotation.Nonnull
  public DecisionEnum getDecision() {
    return decision;
  }


  public void setDecision(DecisionEnum decision) {
    this.decision = decision;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddDocumentWorkflowDecisionsRequest addDocumentWorkflowDecisionsRequest =
        (AddDocumentWorkflowDecisionsRequest) o;
    return Objects.equals(this.queueId, addDocumentWorkflowDecisionsRequest.queueId)
        && Objects.equals(this.comments, addDocumentWorkflowDecisionsRequest.comments)
        && Objects.equals(this.decision, addDocumentWorkflowDecisionsRequest.decision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueId, comments, decision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddDocumentWorkflowDecisionsRequest {\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
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
    openapiFields.add("comments");
    openapiFields.add("decision");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("queueId");
    openapiRequiredFields.add("decision");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to
   *         AddDocumentWorkflowDecisionsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!AddDocumentWorkflowDecisionsRequest.openapiRequiredFields.isEmpty()) { // has required
                                                                                  // fields but JSON
                                                                                  // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in AddDocumentWorkflowDecisionsRequest is not found in the empty JSON string",
            AddDocumentWorkflowDecisionsRequest.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!AddDocumentWorkflowDecisionsRequest.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `AddDocumentWorkflowDecisionsRequest` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : AddDocumentWorkflowDecisionsRequest.openapiRequiredFields) {
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
    if ((jsonObj.get("comments") != null && !jsonObj.get("comments").isJsonNull())
        && !jsonObj.get("comments").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `comments` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("comments").toString()));
    }
    if (!jsonObj.get("decision").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `decision` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("decision").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!AddDocumentWorkflowDecisionsRequest.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'AddDocumentWorkflowDecisionsRequest' and its
                     // subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<AddDocumentWorkflowDecisionsRequest> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(AddDocumentWorkflowDecisionsRequest.class));

      return (TypeAdapter<T>) new TypeAdapter<AddDocumentWorkflowDecisionsRequest>() {
        @Override
        public void write(JsonWriter out, AddDocumentWorkflowDecisionsRequest value)
            throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public AddDocumentWorkflowDecisionsRequest read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of AddDocumentWorkflowDecisionsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AddDocumentWorkflowDecisionsRequest
   * @throws IOException if the JSON string is invalid with respect to
   *         AddDocumentWorkflowDecisionsRequest
   */
  public static AddDocumentWorkflowDecisionsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddDocumentWorkflowDecisionsRequest.class);
  }

  /**
   * Convert an instance of AddDocumentWorkflowDecisionsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

