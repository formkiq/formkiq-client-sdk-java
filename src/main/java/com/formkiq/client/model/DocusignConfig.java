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
 * DocusignConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-09-30T12:37:05.696833-05:00[America/Chicago]",
    comments = "Generator version: 7.8.0")
public class DocusignConfig {
  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_INTEGRATION_KEY = "integrationKey";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_KEY)
  private String integrationKey;

  public static final String SERIALIZED_NAME_RSA_PRIVATE_KEY = "rsaPrivateKey";
  @SerializedName(SERIALIZED_NAME_RSA_PRIVATE_KEY)
  private String rsaPrivateKey;

  public DocusignConfig() {}

  public DocusignConfig userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Docusign UserId
   * 
   * @return userId
   */
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public DocusignConfig integrationKey(String integrationKey) {
    this.integrationKey = integrationKey;
    return this;
  }

  /**
   * Docusign Integration Key or ClientId
   * 
   * @return integrationKey
   */
  @javax.annotation.Nullable
  public String getIntegrationKey() {
    return integrationKey;
  }

  public void setIntegrationKey(String integrationKey) {
    this.integrationKey = integrationKey;
  }


  public DocusignConfig rsaPrivateKey(String rsaPrivateKey) {
    this.rsaPrivateKey = rsaPrivateKey;
    return this;
  }

  /**
   * Docusign Rsa Private Key
   * 
   * @return rsaPrivateKey
   */
  @javax.annotation.Nullable
  public String getRsaPrivateKey() {
    return rsaPrivateKey;
  }

  public void setRsaPrivateKey(String rsaPrivateKey) {
    this.rsaPrivateKey = rsaPrivateKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocusignConfig docusignConfig = (DocusignConfig) o;
    return Objects.equals(this.userId, docusignConfig.userId)
        && Objects.equals(this.integrationKey, docusignConfig.integrationKey)
        && Objects.equals(this.rsaPrivateKey, docusignConfig.rsaPrivateKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, integrationKey, rsaPrivateKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocusignConfig {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    integrationKey: ").append(toIndentedString(integrationKey)).append("\n");
    sb.append("    rsaPrivateKey: ").append(toIndentedString(rsaPrivateKey)).append("\n");
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
    openapiFields.add("userId");
    openapiFields.add("integrationKey");
    openapiFields.add("rsaPrivateKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocusignConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!DocusignConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element
                                                             // is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in DocusignConfig is not found in the empty JSON string",
            DocusignConfig.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!DocusignConfig.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `DocusignConfig` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull())
        && !jsonObj.get("userId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `userId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("userId").toString()));
    }
    if ((jsonObj.get("integrationKey") != null && !jsonObj.get("integrationKey").isJsonNull())
        && !jsonObj.get("integrationKey").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `integrationKey` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("integrationKey").toString()));
    }
    if ((jsonObj.get("rsaPrivateKey") != null && !jsonObj.get("rsaPrivateKey").isJsonNull())
        && !jsonObj.get("rsaPrivateKey").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `rsaPrivateKey` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("rsaPrivateKey").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!DocusignConfig.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'DocusignConfig' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<DocusignConfig> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(DocusignConfig.class));

      return (TypeAdapter<T>) new TypeAdapter<DocusignConfig>() {
        @Override
        public void write(JsonWriter out, DocusignConfig value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public DocusignConfig read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of DocusignConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocusignConfig
   * @throws IOException if the JSON string is invalid with respect to DocusignConfig
   */
  public static DocusignConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocusignConfig.class);
  }

  /**
   * Convert an instance of DocusignConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

