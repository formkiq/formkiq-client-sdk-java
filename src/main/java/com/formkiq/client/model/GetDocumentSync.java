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
import com.formkiq.client.model.DocumentSyncService;
import com.formkiq.client.model.DocumentSyncStatus;
import com.formkiq.client.model.DocumentSyncType;
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
 * GetDocumentSync
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-07-25T18:07:03.096053-05:00[America/Winnipeg]",
    comments = "Generator version: 7.7.0")
public class GetDocumentSync {
  public static final String SERIALIZED_NAME_SERVICE = "service";
  @SerializedName(SERIALIZED_NAME_SERVICE)
  private DocumentSyncService service;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private DocumentSyncStatus status;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private DocumentSyncType type;

  public static final String SERIALIZED_NAME_SYNC_DATE = "syncDate";
  @SerializedName(SERIALIZED_NAME_SYNC_DATE)
  private String syncDate;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public GetDocumentSync() {}

  public GetDocumentSync service(DocumentSyncService service) {
    this.service = service;
    return this;
  }

  /**
   * Get service
   * 
   * @return service
   */
  @javax.annotation.Nullable
  public DocumentSyncService getService() {
    return service;
  }

  public void setService(DocumentSyncService service) {
    this.service = service;
  }


  public GetDocumentSync status(DocumentSyncStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * 
   * @return status
   */
  @javax.annotation.Nullable
  public DocumentSyncStatus getStatus() {
    return status;
  }

  public void setStatus(DocumentSyncStatus status) {
    this.status = status;
  }


  public GetDocumentSync type(DocumentSyncType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * 
   * @return type
   */
  @javax.annotation.Nullable
  public DocumentSyncType getType() {
    return type;
  }

  public void setType(DocumentSyncType type) {
    this.type = type;
  }


  public GetDocumentSync syncDate(String syncDate) {
    this.syncDate = syncDate;
    return this;
  }

  /**
   * Timestamp of synchronization
   * 
   * @return syncDate
   */
  @javax.annotation.Nullable
  public String getSyncDate() {
    return syncDate;
  }

  public void setSyncDate(String syncDate) {
    this.syncDate = syncDate;
  }


  public GetDocumentSync userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * User who added document
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


  public GetDocumentSync message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Document sync message
   * 
   * @return message
   */
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocumentSync getDocumentSync = (GetDocumentSync) o;
    return Objects.equals(this.service, getDocumentSync.service)
        && Objects.equals(this.status, getDocumentSync.status)
        && Objects.equals(this.type, getDocumentSync.type)
        && Objects.equals(this.syncDate, getDocumentSync.syncDate)
        && Objects.equals(this.userId, getDocumentSync.userId)
        && Objects.equals(this.message, getDocumentSync.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(service, status, type, syncDate, userId, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocumentSync {\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    syncDate: ").append(toIndentedString(syncDate)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("service");
    openapiFields.add("status");
    openapiFields.add("type");
    openapiFields.add("syncDate");
    openapiFields.add("userId");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetDocumentSync
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!GetDocumentSync.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                              // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in GetDocumentSync is not found in the empty JSON string",
            GetDocumentSync.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!GetDocumentSync.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `GetDocumentSync` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the optional field `service`
    if (jsonObj.get("service") != null && !jsonObj.get("service").isJsonNull()) {
      DocumentSyncService.validateJsonElement(jsonObj.get("service"));
    }
    // validate the optional field `status`
    if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
      DocumentSyncStatus.validateJsonElement(jsonObj.get("status"));
    }
    // validate the optional field `type`
    if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
      DocumentSyncType.validateJsonElement(jsonObj.get("type"));
    }
    if ((jsonObj.get("syncDate") != null && !jsonObj.get("syncDate").isJsonNull())
        && !jsonObj.get("syncDate").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `syncDate` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("syncDate").toString()));
    }
    if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull())
        && !jsonObj.get("userId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `userId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("userId").toString()));
    }
    if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull())
        && !jsonObj.get("message").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `message` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("message").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!GetDocumentSync.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'GetDocumentSync' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<GetDocumentSync> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(GetDocumentSync.class));

      return (TypeAdapter<T>) new TypeAdapter<GetDocumentSync>() {
        @Override
        public void write(JsonWriter out, GetDocumentSync value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public GetDocumentSync read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of GetDocumentSync given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetDocumentSync
   * @throws IOException if the JSON string is invalid with respect to GetDocumentSync
   */
  public static GetDocumentSync fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetDocumentSync.class);
  }

  /**
   * Convert an instance of GetDocumentSync to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

