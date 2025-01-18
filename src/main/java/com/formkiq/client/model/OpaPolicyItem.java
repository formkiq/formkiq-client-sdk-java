/*
 * FormKiQ API JWT Formkiq API: Document Management Platform API using OAuth(JWT) Authentication You
 * can find out more about FormKiQ at [https://formkiq.com](http://formkiq.com). ## Introduction
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
 * The version of the OpenAPI document: 1.16.1 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import com.formkiq.client.model.OpaPolicyAttribute;
import com.formkiq.client.model.OpaPolicyItemType;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.formkiq.client.invoker.JSON;

/**
 * OpaPolicyItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2025-01-10T23:07:47.624119-06:00[America/Winnipeg]",
    comments = "Generator version: 7.10.0")
public class OpaPolicyItem {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private OpaPolicyItemType type;

  public static final String SERIALIZED_NAME_POLICY = "policy";
  @SerializedName(SERIALIZED_NAME_POLICY)
  @javax.annotation.Nullable
  private String policy;

  public static final String SERIALIZED_NAME_ALL_ROLES = "allRoles";
  @SerializedName(SERIALIZED_NAME_ALL_ROLES)
  @javax.annotation.Nullable
  private List<String> allRoles = new ArrayList<>();

  public static final String SERIALIZED_NAME_ANY_ROLES = "anyRoles";
  @SerializedName(SERIALIZED_NAME_ANY_ROLES)
  @javax.annotation.Nullable
  private List<String> anyRoles = new ArrayList<>();

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  @javax.annotation.Nullable
  private List<OpaPolicyAttribute> attributes = new ArrayList<>();

  public OpaPolicyItem() {}

  public OpaPolicyItem type(@javax.annotation.Nullable OpaPolicyItemType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * 
   * @return type
   */
  @javax.annotation.Nullable
  public OpaPolicyItemType getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable OpaPolicyItemType type) {
    this.type = type;
  }


  public OpaPolicyItem policy(@javax.annotation.Nullable String policy) {
    this.policy = policy;
    return this;
  }

  /**
   * OPA Policy in REGO format
   * 
   * @return policy
   */
  @javax.annotation.Nullable
  public String getPolicy() {
    return policy;
  }

  public void setPolicy(@javax.annotation.Nullable String policy) {
    this.policy = policy;
  }


  public OpaPolicyItem allRoles(@javax.annotation.Nullable List<String> allRoles) {
    this.allRoles = allRoles;
    return this;
  }

  public OpaPolicyItem addAllRolesItem(String allRolesItem) {
    if (this.allRoles == null) {
      this.allRoles = new ArrayList<>();
    }
    this.allRoles.add(allRolesItem);
    return this;
  }

  /**
   * User must match all roles
   * 
   * @return allRoles
   */
  @javax.annotation.Nullable
  public List<String> getAllRoles() {
    return allRoles;
  }

  public void setAllRoles(@javax.annotation.Nullable List<String> allRoles) {
    this.allRoles = allRoles;
  }


  public OpaPolicyItem anyRoles(@javax.annotation.Nullable List<String> anyRoles) {
    this.anyRoles = anyRoles;
    return this;
  }

  public OpaPolicyItem addAnyRolesItem(String anyRolesItem) {
    if (this.anyRoles == null) {
      this.anyRoles = new ArrayList<>();
    }
    this.anyRoles.add(anyRolesItem);
    return this;
  }

  /**
   * User must match any role
   * 
   * @return anyRoles
   */
  @javax.annotation.Nullable
  public List<String> getAnyRoles() {
    return anyRoles;
  }

  public void setAnyRoles(@javax.annotation.Nullable List<String> anyRoles) {
    this.anyRoles = anyRoles;
  }


  public OpaPolicyItem attributes(@javax.annotation.Nullable List<OpaPolicyAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public OpaPolicyItem addAttributesItem(OpaPolicyAttribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Get attributes
   * 
   * @return attributes
   */
  @javax.annotation.Nullable
  public List<OpaPolicyAttribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(@javax.annotation.Nullable List<OpaPolicyAttribute> attributes) {
    this.attributes = attributes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpaPolicyItem opaPolicyItem = (OpaPolicyItem) o;
    return Objects.equals(this.type, opaPolicyItem.type)
        && Objects.equals(this.policy, opaPolicyItem.policy)
        && Objects.equals(this.allRoles, opaPolicyItem.allRoles)
        && Objects.equals(this.anyRoles, opaPolicyItem.anyRoles)
        && Objects.equals(this.attributes, opaPolicyItem.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, policy, allRoles, anyRoles, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpaPolicyItem {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    allRoles: ").append(toIndentedString(allRoles)).append("\n");
    sb.append("    anyRoles: ").append(toIndentedString(anyRoles)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
    openapiFields.add("policy");
    openapiFields.add("allRoles");
    openapiFields.add("anyRoles");
    openapiFields.add("attributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OpaPolicyItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!OpaPolicyItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element
                                                            // is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in OpaPolicyItem is not found in the empty JSON string",
            OpaPolicyItem.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!OpaPolicyItem.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `OpaPolicyItem` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the optional field `type`
    if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
      OpaPolicyItemType.validateJsonElement(jsonObj.get("type"));
    }
    if ((jsonObj.get("policy") != null && !jsonObj.get("policy").isJsonNull())
        && !jsonObj.get("policy").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `policy` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("policy").toString()));
    }
    // ensure the optional json data is an array if present
    if (jsonObj.get("allRoles") != null && !jsonObj.get("allRoles").isJsonNull()
        && !jsonObj.get("allRoles").isJsonArray()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `allRoles` to be an array in the JSON string but got `%s`",
          jsonObj.get("allRoles").toString()));
    }
    // ensure the optional json data is an array if present
    if (jsonObj.get("anyRoles") != null && !jsonObj.get("anyRoles").isJsonNull()
        && !jsonObj.get("anyRoles").isJsonArray()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `anyRoles` to be an array in the JSON string but got `%s`",
          jsonObj.get("anyRoles").toString()));
    }
    if (jsonObj.get("attributes") != null && !jsonObj.get("attributes").isJsonNull()) {
      JsonArray jsonArrayattributes = jsonObj.getAsJsonArray("attributes");
      if (jsonArrayattributes != null) {
        // ensure the json data is an array
        if (!jsonObj.get("attributes").isJsonArray()) {
          throw new IllegalArgumentException(String.format(
              "Expected the field `attributes` to be an array in the JSON string but got `%s`",
              jsonObj.get("attributes").toString()));
        }

        // validate the optional field `attributes` (array)
        for (int i = 0; i < jsonArrayattributes.size(); i++) {
          OpaPolicyAttribute.validateJsonElement(jsonArrayattributes.get(i));
        } ;
      }
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!OpaPolicyItem.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'OpaPolicyItem' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<OpaPolicyItem> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(OpaPolicyItem.class));

      return (TypeAdapter<T>) new TypeAdapter<OpaPolicyItem>() {
        @Override
        public void write(JsonWriter out, OpaPolicyItem value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public OpaPolicyItem read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of OpaPolicyItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OpaPolicyItem
   * @throws IOException if the JSON string is invalid with respect to OpaPolicyItem
   */
  public static OpaPolicyItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OpaPolicyItem.class);
  }

  /**
   * Convert an instance of OpaPolicyItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

