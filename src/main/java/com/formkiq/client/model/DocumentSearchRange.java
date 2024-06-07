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
import com.formkiq.client.model.SearchRangeDataType;
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
 * DocumentSearchRange
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-06-06T21:21:56.182904-05:00[America/Winnipeg]",
    comments = "Generator version: 7.6.0")
public class DocumentSearchRange {
  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private String start;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private String end;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private SearchRangeDataType type = SearchRangeDataType.STRING;

  public DocumentSearchRange() {}

  public DocumentSearchRange start(String start) {
    this.start = start;
    return this;
  }

  /**
   * Start of range query
   * 
   * @return start
   **/
  @javax.annotation.Nonnull
  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }


  public DocumentSearchRange end(String end) {
    this.end = end;
    return this;
  }

  /**
   * End of range query
   * 
   * @return end
   **/
  @javax.annotation.Nonnull
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }


  public DocumentSearchRange type(SearchRangeDataType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * 
   * @return type
   **/
  @javax.annotation.Nullable
  public SearchRangeDataType getType() {
    return type;
  }

  public void setType(SearchRangeDataType type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentSearchRange documentSearchRange = (DocumentSearchRange) o;
    return Objects.equals(this.start, documentSearchRange.start)
        && Objects.equals(this.end, documentSearchRange.end)
        && Objects.equals(this.type, documentSearchRange.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentSearchRange {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("start");
    openapiFields.add("end");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("start");
    openapiRequiredFields.add("end");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocumentSearchRange
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!DocumentSearchRange.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                  // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in DocumentSearchRange is not found in the empty JSON string",
            DocumentSearchRange.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!DocumentSearchRange.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `DocumentSearchRange` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : DocumentSearchRange.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format("The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if (!jsonObj.get("start").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `start` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("start").toString()));
    }
    if (!jsonObj.get("end").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `end` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("end").toString()));
    }
    // validate the optional field `type`
    if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
      SearchRangeDataType.validateJsonElement(jsonObj.get("type"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!DocumentSearchRange.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'DocumentSearchRange' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<DocumentSearchRange> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(DocumentSearchRange.class));

      return (TypeAdapter<T>) new TypeAdapter<DocumentSearchRange>() {
        @Override
        public void write(JsonWriter out, DocumentSearchRange value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public DocumentSearchRange read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of DocumentSearchRange given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocumentSearchRange
   * @throws IOException if the JSON string is invalid with respect to DocumentSearchRange
   */
  public static DocumentSearchRange fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentSearchRange.class);
  }

  /**
   * Convert an instance of DocumentSearchRange to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

