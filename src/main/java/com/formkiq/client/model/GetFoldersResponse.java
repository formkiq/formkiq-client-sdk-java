/*
 * FormKiQ HTTP API Formkiq API: Document Management Platform API using JWT Authentication
 *
 * The version of the OpenAPI document: 1.12.0 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.formkiq.client.model.SearchResultDocument;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
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
import java.util.Map.Entry;
import java.util.Set;

import com.formkiq.client.invoker.JSON;

/**
 * GetFoldersResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-08-13T13:53:13.529619-05:00[America/Winnipeg]")
public class GetFoldersResponse {
  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private String next;

  public static final String SERIALIZED_NAME_PREVIOUS = "previous";
  @SerializedName(SERIALIZED_NAME_PREVIOUS)
  private String previous;

  public static final String SERIALIZED_NAME_DOCUMENTS = "documents";
  @SerializedName(SERIALIZED_NAME_DOCUMENTS)
  private List<SearchResultDocument> documents;

  public GetFoldersResponse() {}

  public GetFoldersResponse next(String next) {

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


  public GetFoldersResponse previous(String previous) {

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


  public GetFoldersResponse documents(List<SearchResultDocument> documents) {

    this.documents = documents;
    return this;
  }

  public GetFoldersResponse addDocumentsItem(SearchResultDocument documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<>();
    }
    this.documents.add(documentsItem);
    return this;
  }

  /**
   * List of search result documents
   * 
   * @return documents
   **/
  @javax.annotation.Nullable
  public List<SearchResultDocument> getDocuments() {
    return documents;
  }


  public void setDocuments(List<SearchResultDocument> documents) {
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
    GetFoldersResponse getFoldersResponse = (GetFoldersResponse) o;
    return Objects.equals(this.next, getFoldersResponse.next)
        && Objects.equals(this.previous, getFoldersResponse.previous)
        && Objects.equals(this.documents, getFoldersResponse.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(next, previous, documents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFoldersResponse {\n");
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
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to GetFoldersResponse
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (!GetFoldersResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                 // object is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in GetFoldersResponse is not found in the empty JSON string",
            GetFoldersResponse.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!GetFoldersResponse.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `GetFoldersResponse` properties. JSON: %s",
            entry.getKey(), jsonObj.toString()));
      }
    }
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
          SearchResultDocument.validateJsonObject(jsonArraydocuments.get(i).getAsJsonObject());
        } ;
      }
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!GetFoldersResponse.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'GetFoldersResponse' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<GetFoldersResponse> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(GetFoldersResponse.class));

      return (TypeAdapter<T>) new TypeAdapter<GetFoldersResponse>() {
        @Override
        public void write(JsonWriter out, GetFoldersResponse value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public GetFoldersResponse read(JsonReader in) throws IOException {
          JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
          validateJsonObject(jsonObj);
          return thisAdapter.fromJsonTree(jsonObj);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of GetFoldersResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetFoldersResponse
   * @throws IOException if the JSON string is invalid with respect to GetFoldersResponse
   */
  public static GetFoldersResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetFoldersResponse.class);
  }

  /**
   * Convert an instance of GetFoldersResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

