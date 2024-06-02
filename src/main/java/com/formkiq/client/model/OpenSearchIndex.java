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
 * OpenSearchIndex
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-05-31T23:04:19.034052-05:00[America/Winnipeg]",
    comments = "Generator version: 7.6.0")
public class OpenSearchIndex {
  public static final String SERIALIZED_NAME_NUMBER_OF_REPLICAS = "numberOfReplicas";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_REPLICAS)
  private String numberOfReplicas;

  public static final String SERIALIZED_NAME_NUMBER_OF_SHARDS = "numberOfShards";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_SHARDS)
  private String numberOfShards;

  public OpenSearchIndex() {}

  public OpenSearchIndex numberOfReplicas(String numberOfReplicas) {
    this.numberOfReplicas = numberOfReplicas;
    return this;
  }

  /**
   * The number of replicas per shard
   * 
   * @return numberOfReplicas
   **/
  @javax.annotation.Nullable
  public String getNumberOfReplicas() {
    return numberOfReplicas;
  }

  public void setNumberOfReplicas(String numberOfReplicas) {
    this.numberOfReplicas = numberOfReplicas;
  }


  public OpenSearchIndex numberOfShards(String numberOfShards) {
    this.numberOfShards = numberOfShards;
    return this;
  }

  /**
   * The number of shards in index
   * 
   * @return numberOfShards
   **/
  @javax.annotation.Nullable
  public String getNumberOfShards() {
    return numberOfShards;
  }

  public void setNumberOfShards(String numberOfShards) {
    this.numberOfShards = numberOfShards;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenSearchIndex openSearchIndex = (OpenSearchIndex) o;
    return Objects.equals(this.numberOfReplicas, openSearchIndex.numberOfReplicas)
        && Objects.equals(this.numberOfShards, openSearchIndex.numberOfShards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfReplicas, numberOfShards);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenSearchIndex {\n");
    sb.append("    numberOfReplicas: ").append(toIndentedString(numberOfReplicas)).append("\n");
    sb.append("    numberOfShards: ").append(toIndentedString(numberOfShards)).append("\n");
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
    openapiFields.add("numberOfReplicas");
    openapiFields.add("numberOfShards");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OpenSearchIndex
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!OpenSearchIndex.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                              // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in OpenSearchIndex is not found in the empty JSON string",
            OpenSearchIndex.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!OpenSearchIndex.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `OpenSearchIndex` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("numberOfReplicas") != null && !jsonObj.get("numberOfReplicas").isJsonNull())
        && !jsonObj.get("numberOfReplicas").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `numberOfReplicas` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("numberOfReplicas").toString()));
    }
    if ((jsonObj.get("numberOfShards") != null && !jsonObj.get("numberOfShards").isJsonNull())
        && !jsonObj.get("numberOfShards").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `numberOfShards` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("numberOfShards").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!OpenSearchIndex.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'OpenSearchIndex' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<OpenSearchIndex> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(OpenSearchIndex.class));

      return (TypeAdapter<T>) new TypeAdapter<OpenSearchIndex>() {
        @Override
        public void write(JsonWriter out, OpenSearchIndex value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public OpenSearchIndex read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of OpenSearchIndex given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OpenSearchIndex
   * @throws IOException if the JSON string is invalid with respect to OpenSearchIndex
   */
  public static OpenSearchIndex fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OpenSearchIndex.class);
  }

  /**
   * Convert an instance of OpenSearchIndex to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

