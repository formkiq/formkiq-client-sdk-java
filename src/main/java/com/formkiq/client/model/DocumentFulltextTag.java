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
 * DocumentFulltextTag
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-10-25T15:21:33.124089-05:00[America/Winnipeg]")
public class DocumentFulltextTag {
  public static final String SERIALIZED_NAME_EQ = "eq";
  @SerializedName(SERIALIZED_NAME_EQ)
  private String eq;

  public static final String SERIALIZED_NAME_EQ_OR = "eqOr";
  @SerializedName(SERIALIZED_NAME_EQ_OR)
  private List<String> eqOr;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public DocumentFulltextTag() {}

  public DocumentFulltextTag eq(String eq) {

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


  public DocumentFulltextTag eqOr(List<String> eqOr) {

    this.eqOr = eqOr;
    return this;
  }

  public DocumentFulltextTag addEqOrItem(String eqOrItem) {
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


  public DocumentFulltextTag key(String key) {

    this.key = key;
    return this;
  }

  /**
   * Tag key to search
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
    DocumentFulltextTag documentFulltextTag = (DocumentFulltextTag) o;
    return Objects.equals(this.eq, documentFulltextTag.eq)
        && Objects.equals(this.eqOr, documentFulltextTag.eqOr)
        && Objects.equals(this.key, documentFulltextTag.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eq, eqOr, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentFulltextTag {\n");
    sb.append("    eq: ").append(toIndentedString(eq)).append("\n");
    sb.append("    eqOr: ").append(toIndentedString(eqOr)).append("\n");
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
    openapiFields.add("key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("key");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocumentFulltextTag
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!DocumentFulltextTag.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                  // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in DocumentFulltextTag is not found in the empty JSON string",
            DocumentFulltextTag.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!DocumentFulltextTag.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `DocumentFulltextTag` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : DocumentFulltextTag.openapiRequiredFields) {
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
      if (!DocumentFulltextTag.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'DocumentFulltextTag' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<DocumentFulltextTag> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(DocumentFulltextTag.class));

      return (TypeAdapter<T>) new TypeAdapter<DocumentFulltextTag>() {
        @Override
        public void write(JsonWriter out, DocumentFulltextTag value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public DocumentFulltextTag read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of DocumentFulltextTag given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocumentFulltextTag
   * @throws IOException if the JSON string is invalid with respect to DocumentFulltextTag
   */
  public static DocumentFulltextTag fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentFulltextTag.class);
  }

  /**
   * Convert an instance of DocumentFulltextTag to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

