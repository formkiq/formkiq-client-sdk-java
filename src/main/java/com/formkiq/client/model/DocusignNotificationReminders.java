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
 * DocusignNotificationReminders
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-11-13T21:59:20.801618-06:00[America/Winnipeg]",
    comments = "Generator version: 7.9.0")
public class DocusignNotificationReminders {
  public static final String SERIALIZED_NAME_REMINDER_DELAY = "reminderDelay";
  @SerializedName(SERIALIZED_NAME_REMINDER_DELAY)
  private String reminderDelay;

  public static final String SERIALIZED_NAME_REMINDER_ENABLED = "reminderEnabled";
  @SerializedName(SERIALIZED_NAME_REMINDER_ENABLED)
  private String reminderEnabled;

  public static final String SERIALIZED_NAME_REMINDER_FREQUENCY = "reminderFrequency";
  @SerializedName(SERIALIZED_NAME_REMINDER_FREQUENCY)
  private String reminderFrequency;

  public DocusignNotificationReminders() {}

  public DocusignNotificationReminders reminderDelay(String reminderDelay) {
    this.reminderDelay = reminderDelay;
    return this;
  }

  /**
   * An integer specifying the number of days after the recipient receives the envelope that
   * reminder emails are sent to the recipient.
   * 
   * @return reminderDelay
   */
  @javax.annotation.Nullable
  public String getReminderDelay() {
    return reminderDelay;
  }

  public void setReminderDelay(String reminderDelay) {
    this.reminderDelay = reminderDelay;
  }


  public DocusignNotificationReminders reminderEnabled(String reminderEnabled) {
    this.reminderEnabled = reminderEnabled;
    return this;
  }

  /**
   * When true, reminders are enabled. The default value is false.
   * 
   * @return reminderEnabled
   */
  @javax.annotation.Nullable
  public String getReminderEnabled() {
    return reminderEnabled;
  }

  public void setReminderEnabled(String reminderEnabled) {
    this.reminderEnabled = reminderEnabled;
  }


  public DocusignNotificationReminders reminderFrequency(String reminderFrequency) {
    this.reminderFrequency = reminderFrequency;
    return this;
  }

  /**
   * An integer specifying the interval in days between reminder emails.
   * 
   * @return reminderFrequency
   */
  @javax.annotation.Nullable
  public String getReminderFrequency() {
    return reminderFrequency;
  }

  public void setReminderFrequency(String reminderFrequency) {
    this.reminderFrequency = reminderFrequency;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocusignNotificationReminders docusignNotificationReminders = (DocusignNotificationReminders) o;
    return Objects.equals(this.reminderDelay, docusignNotificationReminders.reminderDelay)
        && Objects.equals(this.reminderEnabled, docusignNotificationReminders.reminderEnabled)
        && Objects.equals(this.reminderFrequency, docusignNotificationReminders.reminderFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reminderDelay, reminderEnabled, reminderFrequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocusignNotificationReminders {\n");
    sb.append("    reminderDelay: ").append(toIndentedString(reminderDelay)).append("\n");
    sb.append("    reminderEnabled: ").append(toIndentedString(reminderEnabled)).append("\n");
    sb.append("    reminderFrequency: ").append(toIndentedString(reminderFrequency)).append("\n");
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
    openapiFields.add("reminderDelay");
    openapiFields.add("reminderEnabled");
    openapiFields.add("reminderFrequency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to
   *         DocusignNotificationReminders
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!DocusignNotificationReminders.openapiRequiredFields.isEmpty()) { // has required fields
                                                                            // but JSON element is
                                                                            // null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in DocusignNotificationReminders is not found in the empty JSON string",
            DocusignNotificationReminders.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!DocusignNotificationReminders.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `DocusignNotificationReminders` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("reminderDelay") != null && !jsonObj.get("reminderDelay").isJsonNull())
        && !jsonObj.get("reminderDelay").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `reminderDelay` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("reminderDelay").toString()));
    }
    if ((jsonObj.get("reminderEnabled") != null && !jsonObj.get("reminderEnabled").isJsonNull())
        && !jsonObj.get("reminderEnabled").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `reminderEnabled` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("reminderEnabled").toString()));
    }
    if ((jsonObj.get("reminderFrequency") != null && !jsonObj.get("reminderFrequency").isJsonNull())
        && !jsonObj.get("reminderFrequency").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `reminderFrequency` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("reminderFrequency").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!DocusignNotificationReminders.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'DocusignNotificationReminders' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<DocusignNotificationReminders> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(DocusignNotificationReminders.class));

      return (TypeAdapter<T>) new TypeAdapter<DocusignNotificationReminders>() {
        @Override
        public void write(JsonWriter out, DocusignNotificationReminders value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public DocusignNotificationReminders read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of DocusignNotificationReminders given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocusignNotificationReminders
   * @throws IOException if the JSON string is invalid with respect to DocusignNotificationReminders
   */
  public static DocusignNotificationReminders fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocusignNotificationReminders.class);
  }

  /**
   * Convert an instance of DocusignNotificationReminders to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

