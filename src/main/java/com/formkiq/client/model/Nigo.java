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
import com.formkiq.client.model.NigoStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
 * Nigo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-07-07T10:53:55.848206-05:00[America/Winnipeg]",
    comments = "Generator version: 7.7.0")
public class Nigo {
  public static final String SERIALIZED_NAME_NIGO_ID = "nigoId";
  @SerializedName(SERIALIZED_NAME_NIGO_ID)
  private String nigoId;

  public static final String SERIALIZED_NAME_INSERTED_DATE = "insertedDate";
  @SerializedName(SERIALIZED_NAME_INSERTED_DATE)
  private String insertedDate;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private NigoStatus status;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, Object> metadata = new HashMap<>();

  public Nigo() {}

  public Nigo nigoId(String nigoId) {
    this.nigoId = nigoId;
    return this;
  }

  /**
   * Nigo Identifier
   * 
   * @return nigoId
   */
  @javax.annotation.Nullable
  public String getNigoId() {
    return nigoId;
  }

  public void setNigoId(String nigoId) {
    this.nigoId = nigoId;
  }


  public Nigo insertedDate(String insertedDate) {
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

  public void setInsertedDate(String insertedDate) {
    this.insertedDate = insertedDate;
  }


  public Nigo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of Nigo
   * 
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Nigo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of Nigo
   * 
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Nigo startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start Date
   * 
   * @return startDate
   */
  @javax.annotation.Nullable
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public Nigo endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End Date
   * 
   * @return endDate
   */
  @javax.annotation.Nullable
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public Nigo userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * User who added Nigo
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


  public Nigo status(NigoStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * 
   * @return status
   */
  @javax.annotation.Nullable
  public NigoStatus getStatus() {
    return status;
  }

  public void setStatus(NigoStatus status) {
    this.status = status;
  }


  public Nigo metadata(Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Nigo putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * Get metadata
   * 
   * @return metadata
   */
  @javax.annotation.Nullable
  public Map<String, Object> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Nigo nigo = (Nigo) o;
    return Objects.equals(this.nigoId, nigo.nigoId)
        && Objects.equals(this.insertedDate, nigo.insertedDate)
        && Objects.equals(this.name, nigo.name)
        && Objects.equals(this.description, nigo.description)
        && Objects.equals(this.startDate, nigo.startDate)
        && Objects.equals(this.endDate, nigo.endDate) && Objects.equals(this.userId, nigo.userId)
        && Objects.equals(this.status, nigo.status) && Objects.equals(this.metadata, nigo.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nigoId, insertedDate, name, description, startDate, endDate, userId, status,
        metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Nigo {\n");
    sb.append("    nigoId: ").append(toIndentedString(nigoId)).append("\n");
    sb.append("    insertedDate: ").append(toIndentedString(insertedDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("nigoId");
    openapiFields.add("insertedDate");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("userId");
    openapiFields.add("status");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Nigo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!Nigo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format("The required field(s) %s in Nigo is not found in the empty JSON string",
                Nigo.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!Nigo.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `Nigo` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("nigoId") != null && !jsonObj.get("nigoId").isJsonNull())
        && !jsonObj.get("nigoId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `nigoId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("nigoId").toString()));
    }
    if ((jsonObj.get("insertedDate") != null && !jsonObj.get("insertedDate").isJsonNull())
        && !jsonObj.get("insertedDate").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `insertedDate` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("insertedDate").toString()));
    }
    if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull())
        && !jsonObj.get("name").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `name` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("name").toString()));
    }
    if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull())
        && !jsonObj.get("description").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `description` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("description").toString()));
    }
    if ((jsonObj.get("startDate") != null && !jsonObj.get("startDate").isJsonNull())
        && !jsonObj.get("startDate").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `startDate` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("startDate").toString()));
    }
    if ((jsonObj.get("endDate") != null && !jsonObj.get("endDate").isJsonNull())
        && !jsonObj.get("endDate").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `endDate` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("endDate").toString()));
    }
    if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull())
        && !jsonObj.get("userId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `userId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("userId").toString()));
    }
    // validate the optional field `status`
    if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
      NigoStatus.validateJsonElement(jsonObj.get("status"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!Nigo.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'Nigo' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<Nigo> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(Nigo.class));

      return (TypeAdapter<T>) new TypeAdapter<Nigo>() {
        @Override
        public void write(JsonWriter out, Nigo value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public Nigo read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of Nigo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Nigo
   * @throws IOException if the JSON string is invalid with respect to Nigo
   */
  public static Nigo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Nigo.class);
  }

  /**
   * Convert an instance of Nigo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

