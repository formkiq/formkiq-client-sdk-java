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
import com.formkiq.client.model.RuleCondition;
import com.formkiq.client.model.RulesetStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
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
 * AddRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-05-16T22:28:17.043903-05:00[America/Winnipeg]",
    comments = "Generator version: 7.5.0")
public class AddRule {
  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private BigDecimal priority;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_WORKFLOW_ID = "workflowId";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_ID)
  private String workflowId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private RulesetStatus status;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private RuleCondition conditions;

  public AddRule() {}

  public AddRule priority(BigDecimal priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Rule priority
   * 
   * @return priority
   **/
  @javax.annotation.Nullable
  public BigDecimal getPriority() {
    return priority;
  }

  public void setPriority(BigDecimal priority) {
    this.priority = priority;
  }


  public AddRule description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Rule description
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


  public AddRule workflowId(String workflowId) {
    this.workflowId = workflowId;
    return this;
  }

  /**
   * Workflow to start on matching of conditions
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


  public AddRule status(RulesetStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * 
   * @return status
   **/
  @javax.annotation.Nullable
  public RulesetStatus getStatus() {
    return status;
  }

  public void setStatus(RulesetStatus status) {
    this.status = status;
  }


  public AddRule conditions(RuleCondition conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * Get conditions
   * 
   * @return conditions
   **/
  @javax.annotation.Nullable
  public RuleCondition getConditions() {
    return conditions;
  }

  public void setConditions(RuleCondition conditions) {
    this.conditions = conditions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddRule addRule = (AddRule) o;
    return Objects.equals(this.priority, addRule.priority)
        && Objects.equals(this.description, addRule.description)
        && Objects.equals(this.workflowId, addRule.workflowId)
        && Objects.equals(this.status, addRule.status)
        && Objects.equals(this.conditions, addRule.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priority, description, workflowId, status, conditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddRule {\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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
    openapiFields.add("priority");
    openapiFields.add("description");
    openapiFields.add("workflowId");
    openapiFields.add("status");
    openapiFields.add("conditions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AddRule
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!AddRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is
                                                      // null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in AddRule is not found in the empty JSON string",
            AddRule.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!AddRule.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `AddRule` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull())
        && !jsonObj.get("description").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `description` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("description").toString()));
    }
    if ((jsonObj.get("workflowId") != null && !jsonObj.get("workflowId").isJsonNull())
        && !jsonObj.get("workflowId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `workflowId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("workflowId").toString()));
    }
    // validate the optional field `status`
    if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
      RulesetStatus.validateJsonElement(jsonObj.get("status"));
    }
    // validate the optional field `conditions`
    if (jsonObj.get("conditions") != null && !jsonObj.get("conditions").isJsonNull()) {
      RuleCondition.validateJsonElement(jsonObj.get("conditions"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!AddRule.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'AddRule' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<AddRule> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(AddRule.class));

      return (TypeAdapter<T>) new TypeAdapter<AddRule>() {
        @Override
        public void write(JsonWriter out, AddRule value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public AddRule read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of AddRule given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AddRule
   * @throws IOException if the JSON string is invalid with respect to AddRule
   */
  public static AddRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddRule.class);
  }

  /**
   * Convert an instance of AddRule to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

