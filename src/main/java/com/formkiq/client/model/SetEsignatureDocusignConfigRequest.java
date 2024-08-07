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
 * The version of the OpenAPI document: 1.15.1 Contact: support@formkiq.com
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
 * SetEsignatureDocusignConfigRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-07-28T14:34:11.210797-05:00[America/Winnipeg]",
    comments = "Generator version: 7.7.0")
public class SetEsignatureDocusignConfigRequest {
  public static final String SERIALIZED_NAME_PRIVATE_KEY = "privateKey";
  @SerializedName(SERIALIZED_NAME_PRIVATE_KEY)
  private String privateKey;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public SetEsignatureDocusignConfigRequest() {}

  public SetEsignatureDocusignConfigRequest privateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

  /**
   * DocuSign App RSA PRIVATE KEY
   * 
   * @return privateKey
   */
  @javax.annotation.Nonnull
  public String getPrivateKey() {
    return privateKey;
  }

  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }


  public SetEsignatureDocusignConfigRequest userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * DocuSign App UserId
   * 
   * @return userId
   */
  @javax.annotation.Nonnull
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public SetEsignatureDocusignConfigRequest clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * DocuSign App Client
   * 
   * @return clientId
   */
  @javax.annotation.Nonnull
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetEsignatureDocusignConfigRequest setEsignatureDocusignConfigRequest =
        (SetEsignatureDocusignConfigRequest) o;
    return Objects.equals(this.privateKey, setEsignatureDocusignConfigRequest.privateKey)
        && Objects.equals(this.userId, setEsignatureDocusignConfigRequest.userId)
        && Objects.equals(this.clientId, setEsignatureDocusignConfigRequest.clientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateKey, userId, clientId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetEsignatureDocusignConfigRequest {\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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
    openapiFields.add("privateKey");
    openapiFields.add("userId");
    openapiFields.add("clientId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("privateKey");
    openapiRequiredFields.add("userId");
    openapiRequiredFields.add("clientId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to
   *         SetEsignatureDocusignConfigRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!SetEsignatureDocusignConfigRequest.openapiRequiredFields.isEmpty()) { // has required
                                                                                 // fields but JSON
                                                                                 // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in SetEsignatureDocusignConfigRequest is not found in the empty JSON string",
            SetEsignatureDocusignConfigRequest.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!SetEsignatureDocusignConfigRequest.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `SetEsignatureDocusignConfigRequest` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : SetEsignatureDocusignConfigRequest.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format("The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if (!jsonObj.get("privateKey").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `privateKey` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("privateKey").toString()));
    }
    if (!jsonObj.get("userId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `userId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("userId").toString()));
    }
    if (!jsonObj.get("clientId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `clientId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("clientId").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!SetEsignatureDocusignConfigRequest.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'SetEsignatureDocusignConfigRequest' and its
                     // subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<SetEsignatureDocusignConfigRequest> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(SetEsignatureDocusignConfigRequest.class));

      return (TypeAdapter<T>) new TypeAdapter<SetEsignatureDocusignConfigRequest>() {
        @Override
        public void write(JsonWriter out, SetEsignatureDocusignConfigRequest value)
            throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public SetEsignatureDocusignConfigRequest read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of SetEsignatureDocusignConfigRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SetEsignatureDocusignConfigRequest
   * @throws IOException if the JSON string is invalid with respect to
   *         SetEsignatureDocusignConfigRequest
   */
  public static SetEsignatureDocusignConfigRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SetEsignatureDocusignConfigRequest.class);
  }

  /**
   * Convert an instance of SetEsignatureDocusignConfigRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

