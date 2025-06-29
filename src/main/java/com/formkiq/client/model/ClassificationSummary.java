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
 * The version of the OpenAPI document: 1.17.1 Contact: support@formkiq.com
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
 * ClassificationSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2025-05-20T14:44:33.741519-05:00[America/Winnipeg]",
    comments = "Generator version: 7.13.0")
public class ClassificationSummary {
  public static final String SERIALIZED_NAME_CLASSIFICATION_ID = "classificationId";
  @SerializedName(SERIALIZED_NAME_CLASSIFICATION_ID)
  @javax.annotation.Nullable
  private String classificationId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  @javax.annotation.Nullable
  private String userId;

  public static final String SERIALIZED_NAME_INSERTED_DATE = "insertedDate";
  @SerializedName(SERIALIZED_NAME_INSERTED_DATE)
  @javax.annotation.Nullable
  private String insertedDate;

  public ClassificationSummary() {}

  public ClassificationSummary classificationId(
      @javax.annotation.Nullable String classificationId) {
    this.classificationId = classificationId;
    return this;
  }

  /**
   * Classification Identifier
   * 
   * @return classificationId
   */
  @javax.annotation.Nullable
  public String getClassificationId() {
    return classificationId;
  }

  public void setClassificationId(@javax.annotation.Nullable String classificationId) {
    this.classificationId = classificationId;
  }


  public ClassificationSummary name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of Classification
   * 
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public ClassificationSummary userId(@javax.annotation.Nullable String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * 
   * @return userId
   */
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }

  public void setUserId(@javax.annotation.Nullable String userId) {
    this.userId = userId;
  }


  public ClassificationSummary insertedDate(@javax.annotation.Nullable String insertedDate) {
    this.insertedDate = insertedDate;
    return this;
  }

  /**
   * Inserted Timestamp
   * 
   * @return insertedDate
   */
  @javax.annotation.Nullable
  public String getInsertedDate() {
    return insertedDate;
  }

  public void setInsertedDate(@javax.annotation.Nullable String insertedDate) {
    this.insertedDate = insertedDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassificationSummary classificationSummary = (ClassificationSummary) o;
    return Objects.equals(this.classificationId, classificationSummary.classificationId)
        && Objects.equals(this.name, classificationSummary.name)
        && Objects.equals(this.userId, classificationSummary.userId)
        && Objects.equals(this.insertedDate, classificationSummary.insertedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classificationId, name, userId, insertedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassificationSummary {\n");
    sb.append("    classificationId: ").append(toIndentedString(classificationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    insertedDate: ").append(toIndentedString(insertedDate)).append("\n");
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
    openapiFields.add("classificationId");
    openapiFields.add("name");
    openapiFields.add("userId");
    openapiFields.add("insertedDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ClassificationSummary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!ClassificationSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                    // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in ClassificationSummary is not found in the empty JSON string",
            ClassificationSummary.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!ClassificationSummary.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `ClassificationSummary` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("classificationId") != null && !jsonObj.get("classificationId").isJsonNull())
        && !jsonObj.get("classificationId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `classificationId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("classificationId").toString()));
    }
    if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull())
        && !jsonObj.get("name").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `name` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("name").toString()));
    }
    if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull())
        && !jsonObj.get("userId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `userId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("userId").toString()));
    }
    if ((jsonObj.get("insertedDate") != null && !jsonObj.get("insertedDate").isJsonNull())
        && !jsonObj.get("insertedDate").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `insertedDate` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("insertedDate").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!ClassificationSummary.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'ClassificationSummary' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<ClassificationSummary> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(ClassificationSummary.class));

      return (TypeAdapter<T>) new TypeAdapter<ClassificationSummary>() {
        @Override
        public void write(JsonWriter out, ClassificationSummary value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public ClassificationSummary read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of ClassificationSummary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ClassificationSummary
   * @throws IOException if the JSON string is invalid with respect to ClassificationSummary
   */
  public static ClassificationSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClassificationSummary.class);
  }

  /**
   * Convert an instance of ClassificationSummary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

