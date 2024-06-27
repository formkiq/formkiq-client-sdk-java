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
 * AddRuleset
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-06-25T13:37:25.002662-05:00[America/Winnipeg]",
    comments = "Generator version: 7.6.0")
public class AddRuleset {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private BigDecimal priority;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private BigDecimal version;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private RulesetStatus status;

  public AddRuleset() {}

  public AddRuleset description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Ruleset description
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


  public AddRuleset priority(BigDecimal priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Ruleset priority
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


  public AddRuleset version(BigDecimal version) {
    this.version = version;
    return this;
  }

  /**
   * Ruleset version
   * 
   * @return version
   **/
  @javax.annotation.Nullable
  public BigDecimal getVersion() {
    return version;
  }

  public void setVersion(BigDecimal version) {
    this.version = version;
  }


  public AddRuleset status(RulesetStatus status) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddRuleset addRuleset = (AddRuleset) o;
    return Objects.equals(this.description, addRuleset.description)
        && Objects.equals(this.priority, addRuleset.priority)
        && Objects.equals(this.version, addRuleset.version)
        && Objects.equals(this.status, addRuleset.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, priority, version, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddRuleset {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("priority");
    openapiFields.add("version");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AddRuleset
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!AddRuleset.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is
                                                         // null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in AddRuleset is not found in the empty JSON string",
            AddRuleset.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!AddRuleset.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `AddRuleset` properties. JSON: %s",
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
    // validate the optional field `status`
    if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
      RulesetStatus.validateJsonElement(jsonObj.get("status"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!AddRuleset.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'AddRuleset' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<AddRuleset> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(AddRuleset.class));

      return (TypeAdapter<T>) new TypeAdapter<AddRuleset>() {
        @Override
        public void write(JsonWriter out, AddRuleset value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public AddRuleset read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of AddRuleset given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AddRuleset
   * @throws IOException if the JSON string is invalid with respect to AddRuleset
   */
  public static AddRuleset fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddRuleset.class);
  }

  /**
   * Convert an instance of AddRuleset to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

