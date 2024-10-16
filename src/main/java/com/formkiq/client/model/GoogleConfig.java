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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.formkiq.client.invoker.JSON;

/**
 * GoogleConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-10-15T23:10:22.074601-05:00[America/Winnipeg]",
    comments = "Generator version: 7.9.0")
public class GoogleConfig {
  public static final String SERIALIZED_NAME_WORKLOAD_IDENTITY_AUDIENCE =
      "workloadIdentityAudience";
  @SerializedName(SERIALIZED_NAME_WORKLOAD_IDENTITY_AUDIENCE)
  private String workloadIdentityAudience;

  public static final String SERIALIZED_NAME_WORKLOAD_IDENTITY_SERVICE_ACCOUNT =
      "workloadIdentityServiceAccount";
  @SerializedName(SERIALIZED_NAME_WORKLOAD_IDENTITY_SERVICE_ACCOUNT)
  private String workloadIdentityServiceAccount;

  public GoogleConfig() {}

  public GoogleConfig workloadIdentityAudience(String workloadIdentityAudience) {
    this.workloadIdentityAudience = workloadIdentityAudience;
    return this;
  }

  /**
   * Workload Identity Audience
   * 
   * @return workloadIdentityAudience
   */
  @javax.annotation.Nullable
  public String getWorkloadIdentityAudience() {
    return workloadIdentityAudience;
  }

  public void setWorkloadIdentityAudience(String workloadIdentityAudience) {
    this.workloadIdentityAudience = workloadIdentityAudience;
  }


  public GoogleConfig workloadIdentityServiceAccount(String workloadIdentityServiceAccount) {
    this.workloadIdentityServiceAccount = workloadIdentityServiceAccount;
    return this;
  }

  /**
   * Workload Service Account
   * 
   * @return workloadIdentityServiceAccount
   */
  @javax.annotation.Nullable
  public String getWorkloadIdentityServiceAccount() {
    return workloadIdentityServiceAccount;
  }

  public void setWorkloadIdentityServiceAccount(String workloadIdentityServiceAccount) {
    this.workloadIdentityServiceAccount = workloadIdentityServiceAccount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleConfig googleConfig = (GoogleConfig) o;
    return Objects.equals(this.workloadIdentityAudience, googleConfig.workloadIdentityAudience)
        && Objects.equals(this.workloadIdentityServiceAccount,
            googleConfig.workloadIdentityServiceAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workloadIdentityAudience, workloadIdentityServiceAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleConfig {\n");
    sb.append("    workloadIdentityAudience: ").append(toIndentedString(workloadIdentityAudience))
        .append("\n");
    sb.append("    workloadIdentityServiceAccount: ")
        .append(toIndentedString(workloadIdentityServiceAccount)).append("\n");
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
    openapiFields.add("workloadIdentityAudience");
    openapiFields.add("workloadIdentityServiceAccount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!GoogleConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element
                                                           // is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in GoogleConfig is not found in the empty JSON string",
            GoogleConfig.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!GoogleConfig.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `GoogleConfig` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("workloadIdentityAudience") != null
        && !jsonObj.get("workloadIdentityAudience").isJsonNull())
        && !jsonObj.get("workloadIdentityAudience").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `workloadIdentityAudience` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("workloadIdentityAudience").toString()));
    }
    if ((jsonObj.get("workloadIdentityServiceAccount") != null
        && !jsonObj.get("workloadIdentityServiceAccount").isJsonNull())
        && !jsonObj.get("workloadIdentityServiceAccount").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `workloadIdentityServiceAccount` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("workloadIdentityServiceAccount").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!GoogleConfig.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'GoogleConfig' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<GoogleConfig> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(GoogleConfig.class));

      return (TypeAdapter<T>) new TypeAdapter<GoogleConfig>() {
        @Override
        public void write(JsonWriter out, GoogleConfig value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public GoogleConfig read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleConfig
   * @throws IOException if the JSON string is invalid with respect to GoogleConfig
   */
  public static GoogleConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleConfig.class);
  }

  /**
   * Convert an instance of GoogleConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

