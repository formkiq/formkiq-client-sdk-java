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
import com.formkiq.client.model.OpaPolicyAttributeEq;
import com.formkiq.client.model.OpaPolicyAttributeGt;
import com.formkiq.client.model.OpaPolicyAttributeGte;
import com.formkiq.client.model.OpaPolicyAttributeLt;
import com.formkiq.client.model.OpaPolicyAttributeLte;
import com.formkiq.client.model.OpaPolicyAttributeNeq;
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
 * OpaPolicyAttribute
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-08-15T10:59:01.662743-05:00[America/Winnipeg]",
    comments = "Generator version: 7.7.0")
public class OpaPolicyAttribute {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_EQ = "eq";
  @SerializedName(SERIALIZED_NAME_EQ)
  private OpaPolicyAttributeEq eq;

  public static final String SERIALIZED_NAME_GT = "gt";
  @SerializedName(SERIALIZED_NAME_GT)
  private OpaPolicyAttributeGt gt;

  public static final String SERIALIZED_NAME_GTE = "gte";
  @SerializedName(SERIALIZED_NAME_GTE)
  private OpaPolicyAttributeGte gte;

  public static final String SERIALIZED_NAME_LT = "lt";
  @SerializedName(SERIALIZED_NAME_LT)
  private OpaPolicyAttributeLt lt;

  public static final String SERIALIZED_NAME_LTE = "lte";
  @SerializedName(SERIALIZED_NAME_LTE)
  private OpaPolicyAttributeLte lte;

  public static final String SERIALIZED_NAME_NEQ = "neq";
  @SerializedName(SERIALIZED_NAME_NEQ)
  private OpaPolicyAttributeNeq neq;

  public OpaPolicyAttribute() {}

  public OpaPolicyAttribute key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Attribute Key
   * 
   * @return key
   */
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  public OpaPolicyAttribute eq(OpaPolicyAttributeEq eq) {
    this.eq = eq;
    return this;
  }

  /**
   * Get eq
   * 
   * @return eq
   */
  @javax.annotation.Nullable
  public OpaPolicyAttributeEq getEq() {
    return eq;
  }

  public void setEq(OpaPolicyAttributeEq eq) {
    this.eq = eq;
  }


  public OpaPolicyAttribute gt(OpaPolicyAttributeGt gt) {
    this.gt = gt;
    return this;
  }

  /**
   * Get gt
   * 
   * @return gt
   */
  @javax.annotation.Nullable
  public OpaPolicyAttributeGt getGt() {
    return gt;
  }

  public void setGt(OpaPolicyAttributeGt gt) {
    this.gt = gt;
  }


  public OpaPolicyAttribute gte(OpaPolicyAttributeGte gte) {
    this.gte = gte;
    return this;
  }

  /**
   * Get gte
   * 
   * @return gte
   */
  @javax.annotation.Nullable
  public OpaPolicyAttributeGte getGte() {
    return gte;
  }

  public void setGte(OpaPolicyAttributeGte gte) {
    this.gte = gte;
  }


  public OpaPolicyAttribute lt(OpaPolicyAttributeLt lt) {
    this.lt = lt;
    return this;
  }

  /**
   * Get lt
   * 
   * @return lt
   */
  @javax.annotation.Nullable
  public OpaPolicyAttributeLt getLt() {
    return lt;
  }

  public void setLt(OpaPolicyAttributeLt lt) {
    this.lt = lt;
  }


  public OpaPolicyAttribute lte(OpaPolicyAttributeLte lte) {
    this.lte = lte;
    return this;
  }

  /**
   * Get lte
   * 
   * @return lte
   */
  @javax.annotation.Nullable
  public OpaPolicyAttributeLte getLte() {
    return lte;
  }

  public void setLte(OpaPolicyAttributeLte lte) {
    this.lte = lte;
  }


  public OpaPolicyAttribute neq(OpaPolicyAttributeNeq neq) {
    this.neq = neq;
    return this;
  }

  /**
   * Get neq
   * 
   * @return neq
   */
  @javax.annotation.Nullable
  public OpaPolicyAttributeNeq getNeq() {
    return neq;
  }

  public void setNeq(OpaPolicyAttributeNeq neq) {
    this.neq = neq;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpaPolicyAttribute opaPolicyAttribute = (OpaPolicyAttribute) o;
    return Objects.equals(this.key, opaPolicyAttribute.key)
        && Objects.equals(this.eq, opaPolicyAttribute.eq)
        && Objects.equals(this.gt, opaPolicyAttribute.gt)
        && Objects.equals(this.gte, opaPolicyAttribute.gte)
        && Objects.equals(this.lt, opaPolicyAttribute.lt)
        && Objects.equals(this.lte, opaPolicyAttribute.lte)
        && Objects.equals(this.neq, opaPolicyAttribute.neq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, eq, gt, gte, lt, lte, neq);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpaPolicyAttribute {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    eq: ").append(toIndentedString(eq)).append("\n");
    sb.append("    gt: ").append(toIndentedString(gt)).append("\n");
    sb.append("    gte: ").append(toIndentedString(gte)).append("\n");
    sb.append("    lt: ").append(toIndentedString(lt)).append("\n");
    sb.append("    lte: ").append(toIndentedString(lte)).append("\n");
    sb.append("    neq: ").append(toIndentedString(neq)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("eq");
    openapiFields.add("gt");
    openapiFields.add("gte");
    openapiFields.add("lt");
    openapiFields.add("lte");
    openapiFields.add("neq");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OpaPolicyAttribute
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!OpaPolicyAttribute.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                 // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in OpaPolicyAttribute is not found in the empty JSON string",
            OpaPolicyAttribute.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!OpaPolicyAttribute.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `OpaPolicyAttribute` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull())
        && !jsonObj.get("key").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `key` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("key").toString()));
    }
    // validate the optional field `eq`
    if (jsonObj.get("eq") != null && !jsonObj.get("eq").isJsonNull()) {
      OpaPolicyAttributeEq.validateJsonElement(jsonObj.get("eq"));
    }
    // validate the optional field `gt`
    if (jsonObj.get("gt") != null && !jsonObj.get("gt").isJsonNull()) {
      OpaPolicyAttributeGt.validateJsonElement(jsonObj.get("gt"));
    }
    // validate the optional field `gte`
    if (jsonObj.get("gte") != null && !jsonObj.get("gte").isJsonNull()) {
      OpaPolicyAttributeGte.validateJsonElement(jsonObj.get("gte"));
    }
    // validate the optional field `lt`
    if (jsonObj.get("lt") != null && !jsonObj.get("lt").isJsonNull()) {
      OpaPolicyAttributeLt.validateJsonElement(jsonObj.get("lt"));
    }
    // validate the optional field `lte`
    if (jsonObj.get("lte") != null && !jsonObj.get("lte").isJsonNull()) {
      OpaPolicyAttributeLte.validateJsonElement(jsonObj.get("lte"));
    }
    // validate the optional field `neq`
    if (jsonObj.get("neq") != null && !jsonObj.get("neq").isJsonNull()) {
      OpaPolicyAttributeNeq.validateJsonElement(jsonObj.get("neq"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!OpaPolicyAttribute.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'OpaPolicyAttribute' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<OpaPolicyAttribute> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(OpaPolicyAttribute.class));

      return (TypeAdapter<T>) new TypeAdapter<OpaPolicyAttribute>() {
        @Override
        public void write(JsonWriter out, OpaPolicyAttribute value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public OpaPolicyAttribute read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of OpaPolicyAttribute given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OpaPolicyAttribute
   * @throws IOException if the JSON string is invalid with respect to OpaPolicyAttribute
   */
  public static OpaPolicyAttribute fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OpaPolicyAttribute.class);
  }

  /**
   * Convert an instance of OpaPolicyAttribute to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

