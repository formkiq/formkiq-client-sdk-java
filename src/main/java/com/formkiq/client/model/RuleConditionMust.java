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
import com.formkiq.client.model.RuleConditionAttribute;
import com.formkiq.client.model.RuleConditionCriterion;
import com.formkiq.client.model.RuleConditionOperation;
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
 * RuleConditionMust
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-06-05T21:01:53.120424-05:00[America/Winnipeg]",
    comments = "Generator version: 7.6.0")
public class RuleConditionMust {
  public static final String SERIALIZED_NAME_ATTRIBUTE = "attribute";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE)
  private RuleConditionAttribute attribute;

  public static final String SERIALIZED_NAME_CRITERION = "criterion";
  @SerializedName(SERIALIZED_NAME_CRITERION)
  private RuleConditionCriterion criterion;

  public static final String SERIALIZED_NAME_FIELD_NAME = "fieldName";
  @SerializedName(SERIALIZED_NAME_FIELD_NAME)
  private String fieldName;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private RuleConditionOperation operation;

  public RuleConditionMust() {}

  public RuleConditionMust attribute(RuleConditionAttribute attribute) {
    this.attribute = attribute;
    return this;
  }

  /**
   * Get attribute
   * 
   * @return attribute
   **/
  @javax.annotation.Nullable
  public RuleConditionAttribute getAttribute() {
    return attribute;
  }

  public void setAttribute(RuleConditionAttribute attribute) {
    this.attribute = attribute;
  }


  public RuleConditionMust criterion(RuleConditionCriterion criterion) {
    this.criterion = criterion;
    return this;
  }

  /**
   * Get criterion
   * 
   * @return criterion
   **/
  @javax.annotation.Nullable
  public RuleConditionCriterion getCriterion() {
    return criterion;
  }

  public void setCriterion(RuleConditionCriterion criterion) {
    this.criterion = criterion;
  }


  public RuleConditionMust fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * Rule field name (only required for FIELD criterion)
   * 
   * @return fieldName
   **/
  @javax.annotation.Nullable
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }


  public RuleConditionMust value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Rule condition value
   * 
   * @return value
   **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public RuleConditionMust operation(RuleConditionOperation operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * 
   * @return operation
   **/
  @javax.annotation.Nullable
  public RuleConditionOperation getOperation() {
    return operation;
  }

  public void setOperation(RuleConditionOperation operation) {
    this.operation = operation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleConditionMust ruleConditionMust = (RuleConditionMust) o;
    return Objects.equals(this.attribute, ruleConditionMust.attribute)
        && Objects.equals(this.criterion, ruleConditionMust.criterion)
        && Objects.equals(this.fieldName, ruleConditionMust.fieldName)
        && Objects.equals(this.value, ruleConditionMust.value)
        && Objects.equals(this.operation, ruleConditionMust.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, criterion, fieldName, value, operation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleConditionMust {\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    criterion: ").append(toIndentedString(criterion)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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
    openapiFields.add("attribute");
    openapiFields.add("criterion");
    openapiFields.add("fieldName");
    openapiFields.add("value");
    openapiFields.add("operation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RuleConditionMust
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!RuleConditionMust.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in RuleConditionMust is not found in the empty JSON string",
            RuleConditionMust.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!RuleConditionMust.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `RuleConditionMust` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the optional field `attribute`
    if (jsonObj.get("attribute") != null && !jsonObj.get("attribute").isJsonNull()) {
      RuleConditionAttribute.validateJsonElement(jsonObj.get("attribute"));
    }
    // validate the optional field `criterion`
    if (jsonObj.get("criterion") != null && !jsonObj.get("criterion").isJsonNull()) {
      RuleConditionCriterion.validateJsonElement(jsonObj.get("criterion"));
    }
    if ((jsonObj.get("fieldName") != null && !jsonObj.get("fieldName").isJsonNull())
        && !jsonObj.get("fieldName").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `fieldName` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("fieldName").toString()));
    }
    if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull())
        && !jsonObj.get("value").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `value` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("value").toString()));
    }
    // validate the optional field `operation`
    if (jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonNull()) {
      RuleConditionOperation.validateJsonElement(jsonObj.get("operation"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!RuleConditionMust.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'RuleConditionMust' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<RuleConditionMust> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(RuleConditionMust.class));

      return (TypeAdapter<T>) new TypeAdapter<RuleConditionMust>() {
        @Override
        public void write(JsonWriter out, RuleConditionMust value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public RuleConditionMust read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of RuleConditionMust given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RuleConditionMust
   * @throws IOException if the JSON string is invalid with respect to RuleConditionMust
   */
  public static RuleConditionMust fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RuleConditionMust.class);
  }

  /**
   * Convert an instance of RuleConditionMust to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

