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
import com.formkiq.client.model.OcrEngine;
import com.formkiq.client.model.OcrOutputType;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.formkiq.client.invoker.JSON;

/**
 * AddDocumentOcrRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-10-05T22:24:29.372002-05:00[America/Winnipeg]",
    comments = "Generator version: 7.8.0")
public class AddDocumentOcrRequest {
  public static final String SERIALIZED_NAME_PARSE_TYPES = "parseTypes";
  @SerializedName(SERIALIZED_NAME_PARSE_TYPES)
  private List<String> parseTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_ADD_PDF_DETECTED_CHARACTERS_AS_TEXT =
      "addPdfDetectedCharactersAsText";
  @SerializedName(SERIALIZED_NAME_ADD_PDF_DETECTED_CHARACTERS_AS_TEXT)
  private Boolean addPdfDetectedCharactersAsText;

  public static final String SERIALIZED_NAME_OCR_ENGINE = "ocrEngine";
  @SerializedName(SERIALIZED_NAME_OCR_ENGINE)
  private OcrEngine ocrEngine;

  public static final String SERIALIZED_NAME_OCR_NUMBER_OF_PAGES = "ocrNumberOfPages";
  @SerializedName(SERIALIZED_NAME_OCR_NUMBER_OF_PAGES)
  private String ocrNumberOfPages;

  public static final String SERIALIZED_NAME_OCR_OUTPUT_TYPE = "ocrOutputType";
  @SerializedName(SERIALIZED_NAME_OCR_OUTPUT_TYPE)
  private OcrOutputType ocrOutputType;

  public AddDocumentOcrRequest() {}

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
   * 
   * @return parseTypes
   */
  @javax.annotation.Nullable
  public List<String> getParseTypes() {
    return parseTypes;
  }

  public void setParseTypes(List<String> parseTypes) {
    this.parseTypes = parseTypes;
  }


  public AddDocumentOcrRequest addPdfDetectedCharactersAsText(
      Boolean addPdfDetectedCharactersAsText) {
    this.addPdfDetectedCharactersAsText = addPdfDetectedCharactersAsText;
    return this;
  }

  /**
   * Rewrite PDF document, converting any Image text to searchable text
   * 
   * @return addPdfDetectedCharactersAsText
   */
  @javax.annotation.Nullable
  public Boolean getAddPdfDetectedCharactersAsText() {
    return addPdfDetectedCharactersAsText;
  }

  public void setAddPdfDetectedCharactersAsText(Boolean addPdfDetectedCharactersAsText) {
    this.addPdfDetectedCharactersAsText = addPdfDetectedCharactersAsText;
  }


  public AddDocumentOcrRequest ocrEngine(OcrEngine ocrEngine) {
    this.ocrEngine = ocrEngine;
    return this;
  }

  /**
   * Get ocrEngine
   * 
   * @return ocrEngine
   */
  @javax.annotation.Nullable
  public OcrEngine getOcrEngine() {
    return ocrEngine;
  }

  public void setOcrEngine(OcrEngine ocrEngine) {
    this.ocrEngine = ocrEngine;
  }


  public AddDocumentOcrRequest ocrNumberOfPages(String ocrNumberOfPages) {
    this.ocrNumberOfPages = ocrNumberOfPages;
    return this;
  }

  /**
   * Number of pages to OCR (from start) (-1 all)
   * 
   * @return ocrNumberOfPages
   */
  @javax.annotation.Nullable
  public String getOcrNumberOfPages() {
    return ocrNumberOfPages;
  }

  public void setOcrNumberOfPages(String ocrNumberOfPages) {
    this.ocrNumberOfPages = ocrNumberOfPages;
  }


  public AddDocumentOcrRequest ocrOutputType(OcrOutputType ocrOutputType) {
    this.ocrOutputType = ocrOutputType;
    return this;
  }

  /**
   * Get ocrOutputType
   * 
   * @return ocrOutputType
   */
  @javax.annotation.Nullable
  public OcrOutputType getOcrOutputType() {
    return ocrOutputType;
  }

  public void setOcrOutputType(OcrOutputType ocrOutputType) {
    this.ocrOutputType = ocrOutputType;
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
    return Objects.equals(this.parseTypes, addDocumentOcrRequest.parseTypes)
        && Objects.equals(this.addPdfDetectedCharactersAsText,
            addDocumentOcrRequest.addPdfDetectedCharactersAsText)
        && Objects.equals(this.ocrEngine, addDocumentOcrRequest.ocrEngine)
        && Objects.equals(this.ocrNumberOfPages, addDocumentOcrRequest.ocrNumberOfPages)
        && Objects.equals(this.ocrOutputType, addDocumentOcrRequest.ocrOutputType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parseTypes, addPdfDetectedCharactersAsText, ocrEngine, ocrNumberOfPages,
        ocrOutputType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddDocumentOcrRequest {\n");
    sb.append("    parseTypes: ").append(toIndentedString(parseTypes)).append("\n");
    sb.append("    addPdfDetectedCharactersAsText: ")
        .append(toIndentedString(addPdfDetectedCharactersAsText)).append("\n");
    sb.append("    ocrEngine: ").append(toIndentedString(ocrEngine)).append("\n");
    sb.append("    ocrNumberOfPages: ").append(toIndentedString(ocrNumberOfPages)).append("\n");
    sb.append("    ocrOutputType: ").append(toIndentedString(ocrOutputType)).append("\n");
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
    openapiFields.add("parseTypes");
    openapiFields.add("addPdfDetectedCharactersAsText");
    openapiFields.add("ocrEngine");
    openapiFields.add("ocrNumberOfPages");
    openapiFields.add("ocrOutputType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AddDocumentOcrRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!AddDocumentOcrRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                    // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in AddDocumentOcrRequest is not found in the empty JSON string",
            AddDocumentOcrRequest.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!AddDocumentOcrRequest.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `AddDocumentOcrRequest` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // ensure the optional json data is an array if present
    if (jsonObj.get("parseTypes") != null && !jsonObj.get("parseTypes").isJsonNull()
        && !jsonObj.get("parseTypes").isJsonArray()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `parseTypes` to be an array in the JSON string but got `%s`",
          jsonObj.get("parseTypes").toString()));
    }
    // validate the optional field `ocrEngine`
    if (jsonObj.get("ocrEngine") != null && !jsonObj.get("ocrEngine").isJsonNull()) {
      OcrEngine.validateJsonElement(jsonObj.get("ocrEngine"));
    }
    if ((jsonObj.get("ocrNumberOfPages") != null && !jsonObj.get("ocrNumberOfPages").isJsonNull())
        && !jsonObj.get("ocrNumberOfPages").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `ocrNumberOfPages` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("ocrNumberOfPages").toString()));
    }
    // validate the optional field `ocrOutputType`
    if (jsonObj.get("ocrOutputType") != null && !jsonObj.get("ocrOutputType").isJsonNull()) {
      OcrOutputType.validateJsonElement(jsonObj.get("ocrOutputType"));
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
      final TypeAdapter<AddDocumentOcrRequest> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(AddDocumentOcrRequest.class));

      return (TypeAdapter<T>) new TypeAdapter<AddDocumentOcrRequest>() {
        @Override
        public void write(JsonWriter out, AddDocumentOcrRequest value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public AddDocumentOcrRequest read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
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

