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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * GetDocumentTagResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-05-21T14:06:01.586937-05:00[America/Winnipeg]",
    comments = "Generator version: 7.6.0")
public class GetDocumentTagResponse {
  public static final String SERIALIZED_NAME_INSERTED_DATE = "insertedDate";
  @SerializedName(SERIALIZED_NAME_INSERTED_DATE)
  private String insertedDate;

  public static final String SERIALIZED_NAME_DOCUMENT_ID = "documentId";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_ID)
  private String documentId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<String> values = new ArrayList<>();

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public GetDocumentTagResponse() {}

  public GetDocumentTagResponse insertedDate(String insertedDate) {
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


  public GetDocumentTagResponse documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Document Identifier
   * 
   * @return documentId
   **/
  @javax.annotation.Nullable
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }


  public GetDocumentTagResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Tag type
   * 
   * @return type
   **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public GetDocumentTagResponse userId(String userId) {
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


  public GetDocumentTagResponse value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Tag value
   * 
   * @return value
   **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public GetDocumentTagResponse values(List<String> values) {
    this.values = values;
    return this;
  }

  public GetDocumentTagResponse addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Tag values
   * 
   * @return values
   **/
  @javax.annotation.Nullable
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }


  public GetDocumentTagResponse key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Tag key
   * 
   * @return key
   **/
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocumentTagResponse getDocumentTagResponse = (GetDocumentTagResponse) o;
    return Objects.equals(this.insertedDate, getDocumentTagResponse.insertedDate)
        && Objects.equals(this.documentId, getDocumentTagResponse.documentId)
        && Objects.equals(this.type, getDocumentTagResponse.type)
        && Objects.equals(this.userId, getDocumentTagResponse.userId)
        && Objects.equals(this.value, getDocumentTagResponse.value)
        && Objects.equals(this.values, getDocumentTagResponse.values)
        && Objects.equals(this.key, getDocumentTagResponse.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insertedDate, documentId, type, userId, value, values, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocumentTagResponse {\n");
    sb.append("    insertedDate: ").append(toIndentedString(insertedDate)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
    openapiFields.add("insertedDate");
    openapiFields.add("documentId");
    openapiFields.add("type");
    openapiFields.add("userId");
    openapiFields.add("value");
    openapiFields.add("values");
    openapiFields.add("key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetDocumentTagResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!GetDocumentTagResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                     // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in GetDocumentTagResponse is not found in the empty JSON string",
            GetDocumentTagResponse.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!GetDocumentTagResponse.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `GetDocumentTagResponse` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("insertedDate") != null && !jsonObj.get("insertedDate").isJsonNull())
        && !jsonObj.get("insertedDate").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `insertedDate` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("insertedDate").toString()));
    }
    if ((jsonObj.get("documentId") != null && !jsonObj.get("documentId").isJsonNull())
        && !jsonObj.get("documentId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `documentId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("documentId").toString()));
    }
    if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull())
        && !jsonObj.get("type").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `type` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("type").toString()));
    }
    if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull())
        && !jsonObj.get("userId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `userId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("userId").toString()));
    }
    if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull())
        && !jsonObj.get("value").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `value` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("value").toString()));
    }
    // ensure the optional json data is an array if present
    if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonNull()
        && !jsonObj.get("values").isJsonArray()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `values` to be an array in the JSON string but got `%s`",
          jsonObj.get("values").toString()));
    }
    if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull())
        && !jsonObj.get("key").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `key` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("key").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!GetDocumentTagResponse.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'GetDocumentTagResponse' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<GetDocumentTagResponse> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(GetDocumentTagResponse.class));

      return (TypeAdapter<T>) new TypeAdapter<GetDocumentTagResponse>() {
        @Override
        public void write(JsonWriter out, GetDocumentTagResponse value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public GetDocumentTagResponse read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of GetDocumentTagResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetDocumentTagResponse
   * @throws IOException if the JSON string is invalid with respect to GetDocumentTagResponse
   */
  public static GetDocumentTagResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetDocumentTagResponse.class);
  }

  /**
   * Convert an instance of GetDocumentTagResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

