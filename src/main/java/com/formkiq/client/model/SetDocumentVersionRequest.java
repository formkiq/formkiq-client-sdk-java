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
 * SetDocumentVersionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-12T22:09:49.468810-05:00[America/Winnipeg]")
public class SetDocumentVersionRequest {
  public static final String SERIALIZED_NAME_VERSION_KEY = "versionKey";
  @SerializedName(SERIALIZED_NAME_VERSION_KEY)
  private String versionKey;

  public SetDocumentVersionRequest() {
  }

  public SetDocumentVersionRequest versionKey(String versionKey) {
    
    this.versionKey = versionKey;
    return this;
  }

   /**
   * VersionKey returned by the GET /documents/{documentId}/versions to revert to
   * @return versionKey
  **/
  @javax.annotation.Nullable
  public String getVersionKey() {
    return versionKey;
  }


  public void setVersionKey(String versionKey) {
    this.versionKey = versionKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetDocumentVersionRequest setDocumentVersionRequest = (SetDocumentVersionRequest) o;
    return Objects.equals(this.versionKey, setDocumentVersionRequest.versionKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetDocumentVersionRequest {\n");
    sb.append("    versionKey: ").append(toIndentedString(versionKey)).append("\n");
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
    openapiFields.add("versionKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SetDocumentVersionRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SetDocumentVersionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SetDocumentVersionRequest is not found in the empty JSON string", SetDocumentVersionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SetDocumentVersionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SetDocumentVersionRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("versionKey") != null && !jsonObj.get("versionKey").isJsonNull()) && !jsonObj.get("versionKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `versionKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("versionKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SetDocumentVersionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SetDocumentVersionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SetDocumentVersionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SetDocumentVersionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SetDocumentVersionRequest>() {
           @Override
           public void write(JsonWriter out, SetDocumentVersionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SetDocumentVersionRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SetDocumentVersionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SetDocumentVersionRequest
  * @throws IOException if the JSON string is invalid with respect to SetDocumentVersionRequest
  */
  public static SetDocumentVersionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SetDocumentVersionRequest.class);
  }

 /**
  * Convert an instance of SetDocumentVersionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

