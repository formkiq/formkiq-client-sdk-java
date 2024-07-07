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
 * GetConfigurationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-07-07T10:53:55.848206-05:00[America/Winnipeg]",
    comments = "Generator version: 7.7.0")
public class GetConfigurationResponse {
  public static final String SERIALIZED_NAME_CHAT_GPT_API_KEY = "chatGptApiKey";
  @SerializedName(SERIALIZED_NAME_CHAT_GPT_API_KEY)
  private String chatGptApiKey;

  public static final String SERIALIZED_NAME_MAX_CONTENT_LENGTH_BYTES = "maxContentLengthBytes";
  @SerializedName(SERIALIZED_NAME_MAX_CONTENT_LENGTH_BYTES)
  private String maxContentLengthBytes;

  public static final String SERIALIZED_NAME_MAX_DOCUMENTS = "maxDocuments";
  @SerializedName(SERIALIZED_NAME_MAX_DOCUMENTS)
  private String maxDocuments;

  public static final String SERIALIZED_NAME_MAX_WEBHOOKS = "maxWebhooks";
  @SerializedName(SERIALIZED_NAME_MAX_WEBHOOKS)
  private String maxWebhooks;

  public static final String SERIALIZED_NAME_NOTIFICATION_EMAIL = "notificationEmail";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_EMAIL)
  private String notificationEmail;

  public GetConfigurationResponse() {}

  public GetConfigurationResponse chatGptApiKey(String chatGptApiKey) {
    this.chatGptApiKey = chatGptApiKey;
    return this;
  }

  /**
   * ChatGPT API Key
   * 
   * @return chatGptApiKey
   */
  @javax.annotation.Nullable
  public String getChatGptApiKey() {
    return chatGptApiKey;
  }

  public void setChatGptApiKey(String chatGptApiKey) {
    this.chatGptApiKey = chatGptApiKey;
  }


  public GetConfigurationResponse maxContentLengthBytes(String maxContentLengthBytes) {
    this.maxContentLengthBytes = maxContentLengthBytes;
    return this;
  }

  /**
   * Set Maximum Document Content Length in Bytes
   * 
   * @return maxContentLengthBytes
   */
  @javax.annotation.Nullable
  public String getMaxContentLengthBytes() {
    return maxContentLengthBytes;
  }

  public void setMaxContentLengthBytes(String maxContentLengthBytes) {
    this.maxContentLengthBytes = maxContentLengthBytes;
  }


  public GetConfigurationResponse maxDocuments(String maxDocuments) {
    this.maxDocuments = maxDocuments;
    return this;
  }

  /**
   * Set Maximum number of Documents allowed
   * 
   * @return maxDocuments
   */
  @javax.annotation.Nullable
  public String getMaxDocuments() {
    return maxDocuments;
  }

  public void setMaxDocuments(String maxDocuments) {
    this.maxDocuments = maxDocuments;
  }


  public GetConfigurationResponse maxWebhooks(String maxWebhooks) {
    this.maxWebhooks = maxWebhooks;
    return this;
  }

  /**
   * Set Maximum number of Webhooks allowed
   * 
   * @return maxWebhooks
   */
  @javax.annotation.Nullable
  public String getMaxWebhooks() {
    return maxWebhooks;
  }

  public void setMaxWebhooks(String maxWebhooks) {
    this.maxWebhooks = maxWebhooks;
  }


  public GetConfigurationResponse notificationEmail(String notificationEmail) {
    this.notificationEmail = notificationEmail;
    return this;
  }

  /**
   * Email address to use for notifications (Must be verified identity created in AWS SES)
   * 
   * @return notificationEmail
   */
  @javax.annotation.Nullable
  public String getNotificationEmail() {
    return notificationEmail;
  }

  public void setNotificationEmail(String notificationEmail) {
    this.notificationEmail = notificationEmail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetConfigurationResponse getConfigurationResponse = (GetConfigurationResponse) o;
    return Objects.equals(this.chatGptApiKey, getConfigurationResponse.chatGptApiKey)
        && Objects.equals(this.maxContentLengthBytes,
            getConfigurationResponse.maxContentLengthBytes)
        && Objects.equals(this.maxDocuments, getConfigurationResponse.maxDocuments)
        && Objects.equals(this.maxWebhooks, getConfigurationResponse.maxWebhooks)
        && Objects.equals(this.notificationEmail, getConfigurationResponse.notificationEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chatGptApiKey, maxContentLengthBytes, maxDocuments, maxWebhooks,
        notificationEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetConfigurationResponse {\n");
    sb.append("    chatGptApiKey: ").append(toIndentedString(chatGptApiKey)).append("\n");
    sb.append("    maxContentLengthBytes: ").append(toIndentedString(maxContentLengthBytes))
        .append("\n");
    sb.append("    maxDocuments: ").append(toIndentedString(maxDocuments)).append("\n");
    sb.append("    maxWebhooks: ").append(toIndentedString(maxWebhooks)).append("\n");
    sb.append("    notificationEmail: ").append(toIndentedString(notificationEmail)).append("\n");
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
    openapiFields.add("chatGptApiKey");
    openapiFields.add("maxContentLengthBytes");
    openapiFields.add("maxDocuments");
    openapiFields.add("maxWebhooks");
    openapiFields.add("notificationEmail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetConfigurationResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!GetConfigurationResponse.openapiRequiredFields.isEmpty()) { // has required fields but
                                                                       // JSON element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in GetConfigurationResponse is not found in the empty JSON string",
            GetConfigurationResponse.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!GetConfigurationResponse.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `GetConfigurationResponse` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("chatGptApiKey") != null && !jsonObj.get("chatGptApiKey").isJsonNull())
        && !jsonObj.get("chatGptApiKey").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `chatGptApiKey` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("chatGptApiKey").toString()));
    }
    if ((jsonObj.get("maxContentLengthBytes") != null
        && !jsonObj.get("maxContentLengthBytes").isJsonNull())
        && !jsonObj.get("maxContentLengthBytes").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `maxContentLengthBytes` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("maxContentLengthBytes").toString()));
    }
    if ((jsonObj.get("maxDocuments") != null && !jsonObj.get("maxDocuments").isJsonNull())
        && !jsonObj.get("maxDocuments").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `maxDocuments` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("maxDocuments").toString()));
    }
    if ((jsonObj.get("maxWebhooks") != null && !jsonObj.get("maxWebhooks").isJsonNull())
        && !jsonObj.get("maxWebhooks").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `maxWebhooks` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("maxWebhooks").toString()));
    }
    if ((jsonObj.get("notificationEmail") != null && !jsonObj.get("notificationEmail").isJsonNull())
        && !jsonObj.get("notificationEmail").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `notificationEmail` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("notificationEmail").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!GetConfigurationResponse.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'GetConfigurationResponse' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<GetConfigurationResponse> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(GetConfigurationResponse.class));

      return (TypeAdapter<T>) new TypeAdapter<GetConfigurationResponse>() {
        @Override
        public void write(JsonWriter out, GetConfigurationResponse value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public GetConfigurationResponse read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of GetConfigurationResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetConfigurationResponse
   * @throws IOException if the JSON string is invalid with respect to GetConfigurationResponse
   */
  public static GetConfigurationResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetConfigurationResponse.class);
  }

  /**
   * Convert an instance of GetConfigurationResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

