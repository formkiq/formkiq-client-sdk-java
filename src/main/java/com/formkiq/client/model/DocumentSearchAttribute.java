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
import com.formkiq.client.model.DocumentSearchRange;
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
 * DocumentSearchAttribute
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-06-10T20:23:40.951984-05:00[America/Winnipeg]",
    comments = "Generator version: 7.6.0")
public class DocumentSearchAttribute {
  public static final String SERIALIZED_NAME_EQ = "eq";
  @SerializedName(SERIALIZED_NAME_EQ)
  private String eq;

  public static final String SERIALIZED_NAME_EQ_OR = "eqOr";
  @SerializedName(SERIALIZED_NAME_EQ_OR)
  private List<String> eqOr = new ArrayList<>();

  public static final String SERIALIZED_NAME_BEGINS_WITH = "beginsWith";
  @SerializedName(SERIALIZED_NAME_BEGINS_WITH)
  private String beginsWith;

  public static final String SERIALIZED_NAME_RANGE = "range";
  @SerializedName(SERIALIZED_NAME_RANGE)
  private DocumentSearchRange range;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public DocumentSearchAttribute() {}

  public DocumentSearchAttribute eq(String eq) {
    this.eq = eq;
    return this;
  }

  /**
   * Searches for strings that eq
   * 
   * @return eq
   **/
  @javax.annotation.Nullable
  public String getEq() {
    return eq;
  }

  public void setEq(String eq) {
    this.eq = eq;
  }


  public DocumentSearchAttribute eqOr(List<String> eqOr) {
    this.eqOr = eqOr;
    return this;
  }

  public DocumentSearchAttribute addEqOrItem(String eqOrItem) {
    if (this.eqOr == null) {
      this.eqOr = new ArrayList<>();
    }
    this.eqOr.add(eqOrItem);
    return this;
  }

  /**
   * Searches for ANY strings that eq
   * 
   * @return eqOr
   **/
  @javax.annotation.Nullable
  public List<String> getEqOr() {
    return eqOr;
  }

  public void setEqOr(List<String> eqOr) {
    this.eqOr = eqOr;
  }


  public DocumentSearchAttribute beginsWith(String beginsWith) {
    this.beginsWith = beginsWith;
    return this;
  }

  /**
   * Searches for strings that begin with
   * 
   * @return beginsWith
   **/
  @javax.annotation.Nullable
  public String getBeginsWith() {
    return beginsWith;
  }

  public void setBeginsWith(String beginsWith) {
    this.beginsWith = beginsWith;
  }


  public DocumentSearchAttribute range(DocumentSearchRange range) {
    this.range = range;
    return this;
  }

  /**
   * Get range
   * 
   * @return range
   **/
  @javax.annotation.Nullable
  public DocumentSearchRange getRange() {
    return range;
  }

  public void setRange(DocumentSearchRange range) {
    this.range = range;
  }


  public DocumentSearchAttribute key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Attribute key to search
   * 
   * @return key
   **/
  @javax.annotation.Nonnull
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentSearchAttribute documentSearchAttribute = (DocumentSearchAttribute) o;
    return Objects.equals(this.eq, documentSearchAttribute.eq)
        && Objects.equals(this.eqOr, documentSearchAttribute.eqOr)
        && Objects.equals(this.beginsWith, documentSearchAttribute.beginsWith)
        && Objects.equals(this.range, documentSearchAttribute.range)
        && Objects.equals(this.key, documentSearchAttribute.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eq, eqOr, beginsWith, range, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentSearchAttribute {\n");
    sb.append("    eq: ").append(toIndentedString(eq)).append("\n");
    sb.append("    eqOr: ").append(toIndentedString(eqOr)).append("\n");
    sb.append("    beginsWith: ").append(toIndentedString(beginsWith)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
    openapiFields.add("eq");
    openapiFields.add("eqOr");
    openapiFields.add("beginsWith");
    openapiFields.add("range");
    openapiFields.add("key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("key");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocumentSearchAttribute
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!DocumentSearchAttribute.openapiRequiredFields.isEmpty()) { // has required fields but
                                                                      // JSON element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in DocumentSearchAttribute is not found in the empty JSON string",
            DocumentSearchAttribute.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!DocumentSearchAttribute.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `DocumentSearchAttribute` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : DocumentSearchAttribute.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format("The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("eq") != null && !jsonObj.get("eq").isJsonNull())
        && !jsonObj.get("eq").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `eq` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("eq").toString()));
    }
    // ensure the optional json data is an array if present
    if (jsonObj.get("eqOr") != null && !jsonObj.get("eqOr").isJsonNull()
        && !jsonObj.get("eqOr").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format("Expected the field `eqOr` to be an array in the JSON string but got `%s`",
              jsonObj.get("eqOr").toString()));
    }
    if ((jsonObj.get("beginsWith") != null && !jsonObj.get("beginsWith").isJsonNull())
        && !jsonObj.get("beginsWith").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `beginsWith` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("beginsWith").toString()));
    }
    // validate the optional field `range`
    if (jsonObj.get("range") != null && !jsonObj.get("range").isJsonNull()) {
      DocumentSearchRange.validateJsonElement(jsonObj.get("range"));
    }
    if (!jsonObj.get("key").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `key` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("key").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!DocumentSearchAttribute.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'DocumentSearchAttribute' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<DocumentSearchAttribute> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(DocumentSearchAttribute.class));

      return (TypeAdapter<T>) new TypeAdapter<DocumentSearchAttribute>() {
        @Override
        public void write(JsonWriter out, DocumentSearchAttribute value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public DocumentSearchAttribute read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of DocumentSearchAttribute given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocumentSearchAttribute
   * @throws IOException if the JSON string is invalid with respect to DocumentSearchAttribute
   */
  public static DocumentSearchAttribute fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentSearchAttribute.class);
  }

  /**
   * Convert an instance of DocumentSearchAttribute to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

