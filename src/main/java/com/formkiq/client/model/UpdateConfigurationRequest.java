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
import com.formkiq.client.model.DocusignConfig;
import com.formkiq.client.model.GoogleConfig;
import com.formkiq.client.model.OcrConfig;
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
 * UpdateConfigurationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2025-03-12T17:15:14.870440-05:00[America/Winnipeg]",
    comments = "Generator version: 7.12.0")
public class UpdateConfigurationRequest {
  public static final String SERIALIZED_NAME_CHAT_GPT_API_KEY = "chatGptApiKey";
  @SerializedName(SERIALIZED_NAME_CHAT_GPT_API_KEY)
  @javax.annotation.Nullable
  private String chatGptApiKey;

  public static final String SERIALIZED_NAME_MAX_CONTENT_LENGTH_BYTES = "maxContentLengthBytes";
  @SerializedName(SERIALIZED_NAME_MAX_CONTENT_LENGTH_BYTES)
  @javax.annotation.Nullable
  private String maxContentLengthBytes;

  public static final String SERIALIZED_NAME_MAX_DOCUMENTS = "maxDocuments";
  @SerializedName(SERIALIZED_NAME_MAX_DOCUMENTS)
  @javax.annotation.Nullable
  private String maxDocuments;

  public static final String SERIALIZED_NAME_MAX_WEBHOOKS = "maxWebhooks";
  @SerializedName(SERIALIZED_NAME_MAX_WEBHOOKS)
  @javax.annotation.Nullable
  private String maxWebhooks;

  public static final String SERIALIZED_NAME_NOTIFICATION_EMAIL = "notificationEmail";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_EMAIL)
  @javax.annotation.Nullable
  private String notificationEmail;

  public static final String SERIALIZED_NAME_OCR = "ocr";
  @SerializedName(SERIALIZED_NAME_OCR)
  @javax.annotation.Nullable
  private OcrConfig ocr;

  public static final String SERIALIZED_NAME_GOOGLE = "google";
  @SerializedName(SERIALIZED_NAME_GOOGLE)
  @javax.annotation.Nullable
  private GoogleConfig google;

  public static final String SERIALIZED_NAME_DOCUSIGN = "docusign";
  @SerializedName(SERIALIZED_NAME_DOCUSIGN)
  @javax.annotation.Nullable
  private DocusignConfig docusign;

  public UpdateConfigurationRequest() {}

  public UpdateConfigurationRequest chatGptApiKey(@javax.annotation.Nullable String chatGptApiKey) {
    this.chatGptApiKey = chatGptApiKey;
    return this;
  }

  /**
   * ChatGPT Api Key
   * 
   * @return chatGptApiKey
   */
  @javax.annotation.Nullable
  public String getChatGptApiKey() {
    return chatGptApiKey;
  }

  public void setChatGptApiKey(@javax.annotation.Nullable String chatGptApiKey) {
    this.chatGptApiKey = chatGptApiKey;
  }


  public UpdateConfigurationRequest maxContentLengthBytes(
      @javax.annotation.Nullable String maxContentLengthBytes) {
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

  public void setMaxContentLengthBytes(@javax.annotation.Nullable String maxContentLengthBytes) {
    this.maxContentLengthBytes = maxContentLengthBytes;
  }


  public UpdateConfigurationRequest maxDocuments(@javax.annotation.Nullable String maxDocuments) {
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

  public void setMaxDocuments(@javax.annotation.Nullable String maxDocuments) {
    this.maxDocuments = maxDocuments;
  }


  public UpdateConfigurationRequest maxWebhooks(@javax.annotation.Nullable String maxWebhooks) {
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

  public void setMaxWebhooks(@javax.annotation.Nullable String maxWebhooks) {
    this.maxWebhooks = maxWebhooks;
  }


  public UpdateConfigurationRequest notificationEmail(
      @javax.annotation.Nullable String notificationEmail) {
    this.notificationEmail = notificationEmail;
    return this;
  }

  /**
   * Email address to use for notifications
   * 
   * @return notificationEmail
   */
  @javax.annotation.Nullable
  public String getNotificationEmail() {
    return notificationEmail;
  }

  public void setNotificationEmail(@javax.annotation.Nullable String notificationEmail) {
    this.notificationEmail = notificationEmail;
  }


  public UpdateConfigurationRequest ocr(@javax.annotation.Nullable OcrConfig ocr) {
    this.ocr = ocr;
    return this;
  }

  /**
   * Get ocr
   * 
   * @return ocr
   */
  @javax.annotation.Nullable
  public OcrConfig getOcr() {
    return ocr;
  }

  public void setOcr(@javax.annotation.Nullable OcrConfig ocr) {
    this.ocr = ocr;
  }


  public UpdateConfigurationRequest google(@javax.annotation.Nullable GoogleConfig google) {
    this.google = google;
    return this;
  }

  /**
   * Get google
   * 
   * @return google
   */
  @javax.annotation.Nullable
  public GoogleConfig getGoogle() {
    return google;
  }

  public void setGoogle(@javax.annotation.Nullable GoogleConfig google) {
    this.google = google;
  }


  public UpdateConfigurationRequest docusign(@javax.annotation.Nullable DocusignConfig docusign) {
    this.docusign = docusign;
    return this;
  }

  /**
   * Get docusign
   * 
   * @return docusign
   */
  @javax.annotation.Nullable
  public DocusignConfig getDocusign() {
    return docusign;
  }

  public void setDocusign(@javax.annotation.Nullable DocusignConfig docusign) {
    this.docusign = docusign;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateConfigurationRequest updateConfigurationRequest = (UpdateConfigurationRequest) o;
    return Objects.equals(this.chatGptApiKey, updateConfigurationRequest.chatGptApiKey)
        && Objects.equals(this.maxContentLengthBytes,
            updateConfigurationRequest.maxContentLengthBytes)
        && Objects.equals(this.maxDocuments, updateConfigurationRequest.maxDocuments)
        && Objects.equals(this.maxWebhooks, updateConfigurationRequest.maxWebhooks)
        && Objects.equals(this.notificationEmail, updateConfigurationRequest.notificationEmail)
        && Objects.equals(this.ocr, updateConfigurationRequest.ocr)
        && Objects.equals(this.google, updateConfigurationRequest.google)
        && Objects.equals(this.docusign, updateConfigurationRequest.docusign);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chatGptApiKey, maxContentLengthBytes, maxDocuments, maxWebhooks,
        notificationEmail, ocr, google, docusign);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateConfigurationRequest {\n");
    sb.append("    chatGptApiKey: ").append(toIndentedString(chatGptApiKey)).append("\n");
    sb.append("    maxContentLengthBytes: ").append(toIndentedString(maxContentLengthBytes))
        .append("\n");
    sb.append("    maxDocuments: ").append(toIndentedString(maxDocuments)).append("\n");
    sb.append("    maxWebhooks: ").append(toIndentedString(maxWebhooks)).append("\n");
    sb.append("    notificationEmail: ").append(toIndentedString(notificationEmail)).append("\n");
    sb.append("    ocr: ").append(toIndentedString(ocr)).append("\n");
    sb.append("    google: ").append(toIndentedString(google)).append("\n");
    sb.append("    docusign: ").append(toIndentedString(docusign)).append("\n");
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
    openapiFields.add("ocr");
    openapiFields.add("google");
    openapiFields.add("docusign");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateConfigurationRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!UpdateConfigurationRequest.openapiRequiredFields.isEmpty()) { // has required fields but
                                                                         // JSON element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in UpdateConfigurationRequest is not found in the empty JSON string",
            UpdateConfigurationRequest.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!UpdateConfigurationRequest.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `UpdateConfigurationRequest` properties. JSON: %s",
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
    // validate the optional field `ocr`
    if (jsonObj.get("ocr") != null && !jsonObj.get("ocr").isJsonNull()) {
      OcrConfig.validateJsonElement(jsonObj.get("ocr"));
    }
    // validate the optional field `google`
    if (jsonObj.get("google") != null && !jsonObj.get("google").isJsonNull()) {
      GoogleConfig.validateJsonElement(jsonObj.get("google"));
    }
    // validate the optional field `docusign`
    if (jsonObj.get("docusign") != null && !jsonObj.get("docusign").isJsonNull()) {
      DocusignConfig.validateJsonElement(jsonObj.get("docusign"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!UpdateConfigurationRequest.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'UpdateConfigurationRequest' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<UpdateConfigurationRequest> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(UpdateConfigurationRequest.class));

      return (TypeAdapter<T>) new TypeAdapter<UpdateConfigurationRequest>() {
        @Override
        public void write(JsonWriter out, UpdateConfigurationRequest value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public UpdateConfigurationRequest read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateConfigurationRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateConfigurationRequest
   * @throws IOException if the JSON string is invalid with respect to UpdateConfigurationRequest
   */
  public static UpdateConfigurationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateConfigurationRequest.class);
  }

  /**
   * Convert an instance of UpdateConfigurationRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

