/*
 * FormKiQ HTTP API
 * FormKiQ HTTP API
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
 * ONLYOFFICE New Document Request
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-12T22:09:49.468810-05:00[America/Winnipeg]")
public class OnlyOfficeDocumentNewRequest {
  /**
   * Gets or Sets extension
   */
  @JsonAdapter(ExtensionEnum.Adapter.class)
  public enum ExtensionEnum {
    DOCX("DOCX"),
    
    XLSX("XLSX"),
    
    PPTX("PPTX");

    private String value;

    ExtensionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExtensionEnum fromValue(String value) {
      for (ExtensionEnum b : ExtensionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ExtensionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExtensionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExtensionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ExtensionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EXTENSION = "extension";
  @SerializedName(SERIALIZED_NAME_EXTENSION)
  private ExtensionEnum extension;

  public OnlyOfficeDocumentNewRequest() {
  }

  public OnlyOfficeDocumentNewRequest extension(ExtensionEnum extension) {
    
    this.extension = extension;
    return this;
  }

   /**
   * Get extension
   * @return extension
  **/
  @javax.annotation.Nullable
  public ExtensionEnum getExtension() {
    return extension;
  }


  public void setExtension(ExtensionEnum extension) {
    this.extension = extension;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnlyOfficeDocumentNewRequest onlyOfficeDocumentNewRequest = (OnlyOfficeDocumentNewRequest) o;
    return Objects.equals(this.extension, onlyOfficeDocumentNewRequest.extension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnlyOfficeDocumentNewRequest {\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
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
    openapiFields.add("extension");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OnlyOfficeDocumentNewRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OnlyOfficeDocumentNewRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OnlyOfficeDocumentNewRequest is not found in the empty JSON string", OnlyOfficeDocumentNewRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OnlyOfficeDocumentNewRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OnlyOfficeDocumentNewRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("extension") != null && !jsonObj.get("extension").isJsonNull()) && !jsonObj.get("extension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extension").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnlyOfficeDocumentNewRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnlyOfficeDocumentNewRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnlyOfficeDocumentNewRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnlyOfficeDocumentNewRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OnlyOfficeDocumentNewRequest>() {
           @Override
           public void write(JsonWriter out, OnlyOfficeDocumentNewRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OnlyOfficeDocumentNewRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OnlyOfficeDocumentNewRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OnlyOfficeDocumentNewRequest
  * @throws IOException if the JSON string is invalid with respect to OnlyOfficeDocumentNewRequest
  */
  public static OnlyOfficeDocumentNewRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnlyOfficeDocumentNewRequest.class);
  }

 /**
  * Convert an instance of OnlyOfficeDocumentNewRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

