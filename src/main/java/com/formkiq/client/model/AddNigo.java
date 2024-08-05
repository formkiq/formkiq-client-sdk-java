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
import com.formkiq.client.model.NigoStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
 * AddNigo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-08-04T21:20:41.950279-05:00[America/Winnipeg]",
    comments = "Generator version: 7.7.0")
public class AddNigo {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private NigoStatus status;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, Object> metadata = new HashMap<>();

  public static final String SERIALIZED_NAME_DOCUMENT_IDS = "documentIds";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_IDS)
  private List<String> documentIds = new ArrayList<>();

  public AddNigo() {}

  public AddNigo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of Nigo
   * 
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AddNigo description(String description) {
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


  public AddNigo status(NigoStatus status) {
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


  public AddNigo startDate(String startDate) {
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


  public AddNigo endDate(String endDate) {
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


  public AddNigo metadata(Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public AddNigo putMetadataItem(String key, Object metadataItem) {
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


  public AddNigo documentIds(List<String> documentIds) {
    this.documentIds = documentIds;
    return this;
  }

  public AddNigo addDocumentIdsItem(String documentIdsItem) {
    if (this.documentIds == null) {
      this.documentIds = new ArrayList<>();
    }
    this.documentIds.add(documentIdsItem);
    return this;
  }

  /**
   * Get documentIds
   * 
   * @return documentIds
   */
  @javax.annotation.Nullable
  public List<String> getDocumentIds() {
    return documentIds;
  }

  public void setDocumentIds(List<String> documentIds) {
    this.documentIds = documentIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddNigo addNigo = (AddNigo) o;
    return Objects.equals(this.name, addNigo.name)
        && Objects.equals(this.description, addNigo.description)
        && Objects.equals(this.status, addNigo.status)
        && Objects.equals(this.startDate, addNigo.startDate)
        && Objects.equals(this.endDate, addNigo.endDate)
        && Objects.equals(this.metadata, addNigo.metadata)
        && Objects.equals(this.documentIds, addNigo.documentIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, status, startDate, endDate, metadata, documentIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddNigo {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    documentIds: ").append(toIndentedString(documentIds)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("status");
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("metadata");
    openapiFields.add("documentIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AddNigo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!AddNigo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is
                                                      // null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in AddNigo is not found in the empty JSON string",
            AddNigo.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!AddNigo.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `AddNigo` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : AddNigo.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format("The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if (!jsonObj.get("name").isJsonPrimitive()) {
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
    // validate the optional field `status`
    if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
      NigoStatus.validateJsonElement(jsonObj.get("status"));
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
    // ensure the optional json data is an array if present
    if (jsonObj.get("documentIds") != null && !jsonObj.get("documentIds").isJsonNull()
        && !jsonObj.get("documentIds").isJsonArray()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `documentIds` to be an array in the JSON string but got `%s`",
          jsonObj.get("documentIds").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!AddNigo.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'AddNigo' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<AddNigo> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(AddNigo.class));

      return (TypeAdapter<T>) new TypeAdapter<AddNigo>() {
        @Override
        public void write(JsonWriter out, AddNigo value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public AddNigo read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of AddNigo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AddNigo
   * @throws IOException if the JSON string is invalid with respect to AddNigo
   */
  public static AddNigo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddNigo.class);
  }

  /**
   * Convert an instance of AddNigo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

