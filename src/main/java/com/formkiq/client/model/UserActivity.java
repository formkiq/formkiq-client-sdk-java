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
import com.formkiq.client.model.UserActivityType;
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
 * UserActivity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-06-15T14:16:48.642984-05:00[America/Winnipeg]",
    comments = "Generator version: 7.6.0")
public class UserActivity {
  public static final String SERIALIZED_NAME_ACTIVITY_ID = "activityId";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID)
  private String activityId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private UserActivityType type;

  public static final String SERIALIZED_NAME_INSERTED_DATE = "insertedDate";
  @SerializedName(SERIALIZED_NAME_INSERTED_DATE)
  private String insertedDate;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_VERSION_KEY = "versionKey";
  @SerializedName(SERIALIZED_NAME_VERSION_KEY)
  private String versionKey;

  public static final String SERIALIZED_NAME_TIME_TO_LIVE = "timeToLive";
  @SerializedName(SERIALIZED_NAME_TIME_TO_LIVE)
  private String timeToLive;

  public UserActivity() {}

  public UserActivity activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

  /**
   * Activity identifier
   * 
   * @return activityId
   **/
  @javax.annotation.Nullable
  public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }


  public UserActivity type(UserActivityType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * 
   * @return type
   **/
  @javax.annotation.Nullable
  public UserActivityType getType() {
    return type;
  }

  public void setType(UserActivityType type) {
    this.type = type;
  }


  public UserActivity insertedDate(String insertedDate) {
    this.insertedDate = insertedDate;
    return this;
  }

  /**
   * Inserted Timestamp
   * 
   * @return insertedDate
   **/
  @javax.annotation.Nullable
  public String getInsertedDate() {
    return insertedDate;
  }

  public void setInsertedDate(String insertedDate) {
    this.insertedDate = insertedDate;
  }


  public UserActivity userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * User who added document
   * 
   * @return userId
   **/
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public UserActivity versionKey(String versionKey) {
    this.versionKey = versionKey;
    return this;
  }

  /**
   * Document Version Identifier
   * 
   * @return versionKey
   **/
  @javax.annotation.Nullable
  public String getVersionKey() {
    return versionKey;
  }

  public void setVersionKey(String versionKey) {
    this.versionKey = versionKey;
  }


  public UserActivity timeToLive(String timeToLive) {
    this.timeToLive = timeToLive;
    return this;
  }

  /**
   * User activity time to live
   * 
   * @return timeToLive
   **/
  @javax.annotation.Nullable
  public String getTimeToLive() {
    return timeToLive;
  }

  public void setTimeToLive(String timeToLive) {
    this.timeToLive = timeToLive;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserActivity userActivity = (UserActivity) o;
    return Objects.equals(this.activityId, userActivity.activityId)
        && Objects.equals(this.type, userActivity.type)
        && Objects.equals(this.insertedDate, userActivity.insertedDate)
        && Objects.equals(this.userId, userActivity.userId)
        && Objects.equals(this.versionKey, userActivity.versionKey)
        && Objects.equals(this.timeToLive, userActivity.timeToLive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, type, insertedDate, userId, versionKey, timeToLive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserActivity {\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    insertedDate: ").append(toIndentedString(insertedDate)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    versionKey: ").append(toIndentedString(versionKey)).append("\n");
    sb.append("    timeToLive: ").append(toIndentedString(timeToLive)).append("\n");
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
    openapiFields.add("activityId");
    openapiFields.add("type");
    openapiFields.add("insertedDate");
    openapiFields.add("userId");
    openapiFields.add("versionKey");
    openapiFields.add("timeToLive");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UserActivity
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!UserActivity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element
                                                           // is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in UserActivity is not found in the empty JSON string",
            UserActivity.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!UserActivity.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `UserActivity` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("activityId") != null && !jsonObj.get("activityId").isJsonNull())
        && !jsonObj.get("activityId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `activityId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("activityId").toString()));
    }
    // validate the optional field `type`
    if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
      UserActivityType.validateJsonElement(jsonObj.get("type"));
    }
    if ((jsonObj.get("insertedDate") != null && !jsonObj.get("insertedDate").isJsonNull())
        && !jsonObj.get("insertedDate").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `insertedDate` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("insertedDate").toString()));
    }
    if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull())
        && !jsonObj.get("userId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `userId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("userId").toString()));
    }
    if ((jsonObj.get("versionKey") != null && !jsonObj.get("versionKey").isJsonNull())
        && !jsonObj.get("versionKey").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `versionKey` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("versionKey").toString()));
    }
    if ((jsonObj.get("timeToLive") != null && !jsonObj.get("timeToLive").isJsonNull())
        && !jsonObj.get("timeToLive").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `timeToLive` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("timeToLive").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!UserActivity.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'UserActivity' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<UserActivity> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(UserActivity.class));

      return (TypeAdapter<T>) new TypeAdapter<UserActivity>() {
        @Override
        public void write(JsonWriter out, UserActivity value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public UserActivity read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of UserActivity given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UserActivity
   * @throws IOException if the JSON string is invalid with respect to UserActivity
   */
  public static UserActivity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserActivity.class);
  }

  /**
   * Convert an instance of UserActivity to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

