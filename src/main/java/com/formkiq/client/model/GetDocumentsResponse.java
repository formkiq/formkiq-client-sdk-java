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
 * The version of the OpenAPI document: 1.14.1 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import com.formkiq.client.model.Document;
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
 * GetDocumentsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-05-23T13:23:45.456005-05:00[America/Winnipeg]",
    comments = "Generator version: 7.6.0")
public class GetDocumentsResponse {
  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private String next;

  public static final String SERIALIZED_NAME_PREVIOUS = "previous";
  @SerializedName(SERIALIZED_NAME_PREVIOUS)
  private String previous;

  public static final String SERIALIZED_NAME_DOCUMENTS = "documents";
  @SerializedName(SERIALIZED_NAME_DOCUMENTS)
  private List<Document> documents = new ArrayList<>();

  public GetDocumentsResponse() {}

  public GetDocumentsResponse next(String next) {
    this.next = next;
    return this;
  }

  /**
   * Next page of results token
   * 
   * @return next
   **/
  @javax.annotation.Nullable
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }


  public GetDocumentsResponse previous(String previous) {
    this.previous = previous;
    return this;
  }

  /**
   * Previous page of results token
   * 
   * @return previous
   **/
  @javax.annotation.Nullable
  public String getPrevious() {
    return previous;
  }

  public void setPrevious(String previous) {
    this.previous = previous;
  }


  public GetDocumentsResponse documents(List<Document> documents) {
    this.documents = documents;
    return this;
  }

  public GetDocumentsResponse addDocumentsItem(Document documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<>();
    }
    this.documents.add(documentsItem);
    return this;
  }

  /**
   * List of documents
   * 
   * @return documents
   **/
  @javax.annotation.Nullable
  public List<Document> getDocuments() {
    return documents;
  }

  public void setDocuments(List<Document> documents) {
    this.documents = documents;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocumentsResponse getDocumentsResponse = (GetDocumentsResponse) o;
    return Objects.equals(this.next, getDocumentsResponse.next)
        && Objects.equals(this.previous, getDocumentsResponse.previous)
        && Objects.equals(this.documents, getDocumentsResponse.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(next, previous, documents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocumentsResponse {\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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
    openapiFields.add("next");
    openapiFields.add("previous");
    openapiFields.add("documents");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetDocumentsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!GetDocumentsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                   // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in GetDocumentsResponse is not found in the empty JSON string",
            GetDocumentsResponse.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!GetDocumentsResponse.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `GetDocumentsResponse` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("next") != null && !jsonObj.get("next").isJsonNull())
        && !jsonObj.get("next").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `next` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("next").toString()));
    }
    if ((jsonObj.get("previous") != null && !jsonObj.get("previous").isJsonNull())
        && !jsonObj.get("previous").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `previous` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("previous").toString()));
    }
    if (jsonObj.get("documents") != null && !jsonObj.get("documents").isJsonNull()) {
      JsonArray jsonArraydocuments = jsonObj.getAsJsonArray("documents");
      if (jsonArraydocuments != null) {
        // ensure the json data is an array
        if (!jsonObj.get("documents").isJsonArray()) {
          throw new IllegalArgumentException(String.format(
              "Expected the field `documents` to be an array in the JSON string but got `%s`",
              jsonObj.get("documents").toString()));
        }

        // validate the optional field `documents` (array)
        for (int i = 0; i < jsonArraydocuments.size(); i++) {
          Document.validateJsonElement(jsonArraydocuments.get(i));
        } ;
      }
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!GetDocumentsResponse.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'GetDocumentsResponse' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<GetDocumentsResponse> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(GetDocumentsResponse.class));

      return (TypeAdapter<T>) new TypeAdapter<GetDocumentsResponse>() {
        @Override
        public void write(JsonWriter out, GetDocumentsResponse value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public GetDocumentsResponse read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of GetDocumentsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetDocumentsResponse
   * @throws IOException if the JSON string is invalid with respect to GetDocumentsResponse
   */
  public static GetDocumentsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetDocumentsResponse.class);
  }

  /**
   * Convert an instance of GetDocumentsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

