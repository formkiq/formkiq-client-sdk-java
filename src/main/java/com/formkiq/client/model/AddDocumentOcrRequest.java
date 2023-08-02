/*
 * FormKiQ HTTP API
 * Formkiq API: Document Management Platform API using JWT Authentication
 *
 * The version of the OpenAPI document: 1.12.0
 * Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import java.util.Arrays;
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
 * AddDocumentOcrRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-02T11:00:15.465357-05:00[America/Winnipeg]")
public class AddDocumentOcrRequest {
  public static final String SERIALIZED_NAME_PARSE_TYPES = "parseTypes";
  @SerializedName(SERIALIZED_NAME_PARSE_TYPES)
  private List<String> parseTypes;

  public static final String SERIALIZED_NAME_ADD_PDF_DETECTED_CHARACTERS_AS_TEXT = "addPdfDetectedCharactersAsText";
  @SerializedName(SERIALIZED_NAME_ADD_PDF_DETECTED_CHARACTERS_AS_TEXT)
  private Boolean addPdfDetectedCharactersAsText;

  public AddDocumentOcrRequest() {
  }

  public AddDocumentOcrRequest parseTypes(List<String> parseTypes) {
    
    this.parseTypes = parseTypes;
    return this;
  }

  public AddDocumentOcrRequest addParseTypesItem(String parseTypesItem) {
    if (this.parseTypes == null) {
      this.parseTypes = new ArrayList<>();
    }
    this.parseTypes.add(parseTypesItem);
    return this;
  }

   /**
   * OCR Parse types - TEXT, FORMS, TABLES
   * @return parseTypes
  **/
  @javax.annotation.Nullable
  public List<String> getParseTypes() {
    return parseTypes;
  }


  public void setParseTypes(List<String> parseTypes) {
    this.parseTypes = parseTypes;
  }


  public AddDocumentOcrRequest addPdfDetectedCharactersAsText(Boolean addPdfDetectedCharactersAsText) {
    
    this.addPdfDetectedCharactersAsText = addPdfDetectedCharactersAsText;
    return this;
  }

   /**
   * Rewrite PDF document, converting any Image text to searchable text
   * @return addPdfDetectedCharactersAsText
  **/
  @javax.annotation.Nullable
  public Boolean getAddPdfDetectedCharactersAsText() {
    return addPdfDetectedCharactersAsText;
  }


  public void setAddPdfDetectedCharactersAsText(Boolean addPdfDetectedCharactersAsText) {
    this.addPdfDetectedCharactersAsText = addPdfDetectedCharactersAsText;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddDocumentOcrRequest addDocumentOcrRequest = (AddDocumentOcrRequest) o;
    return Objects.equals(this.parseTypes, addDocumentOcrRequest.parseTypes) &&
        Objects.equals(this.addPdfDetectedCharactersAsText, addDocumentOcrRequest.addPdfDetectedCharactersAsText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parseTypes, addPdfDetectedCharactersAsText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddDocumentOcrRequest {\n");
    sb.append("    parseTypes: ").append(toIndentedString(parseTypes)).append("\n");
    sb.append("    addPdfDetectedCharactersAsText: ").append(toIndentedString(addPdfDetectedCharactersAsText)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
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
    openapiFields.add("parseTypes");
    openapiFields.add("addPdfDetectedCharactersAsText");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddDocumentOcrRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddDocumentOcrRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddDocumentOcrRequest is not found in the empty JSON string", AddDocumentOcrRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AddDocumentOcrRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddDocumentOcrRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("parseTypes") != null && !jsonObj.get("parseTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `parseTypes` to be an array in the JSON string but got `%s`", jsonObj.get("parseTypes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddDocumentOcrRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddDocumentOcrRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddDocumentOcrRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddDocumentOcrRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddDocumentOcrRequest>() {
           @Override
           public void write(JsonWriter out, AddDocumentOcrRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddDocumentOcrRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddDocumentOcrRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddDocumentOcrRequest
  * @throws IOException if the JSON string is invalid with respect to AddDocumentOcrRequest
  */
  public static AddDocumentOcrRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddDocumentOcrRequest.class);
  }

 /**
  * Convert an instance of AddDocumentOcrRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

