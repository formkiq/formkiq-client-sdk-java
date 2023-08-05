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
 * GetDocumentOcrResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-04T23:41:20.238290-05:00[America/Winnipeg]")
public class GetDocumentOcrResponse {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_OCR_ENGINE = "ocrEngine";
  @SerializedName(SERIALIZED_NAME_OCR_ENGINE)
  private String ocrEngine;

  public static final String SERIALIZED_NAME_OCR_STATUS = "ocrStatus";
  @SerializedName(SERIALIZED_NAME_OCR_STATUS)
  private String ocrStatus;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "contentType";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_IS_BASE64 = "isBase64";
  @SerializedName(SERIALIZED_NAME_IS_BASE64)
  private Boolean isBase64;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_DOCUMENT_ID = "documentId";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_ID)
  private String documentId;

  public GetDocumentOcrResponse() {
  }

  public GetDocumentOcrResponse data(String data) {
    
    this.data = data;
    return this;
  }

   /**
   * OCR text result
   * @return data
  **/
  @javax.annotation.Nullable
  public String getData() {
    return data;
  }


  public void setData(String data) {
    this.data = data;
  }


  public GetDocumentOcrResponse ocrEngine(String ocrEngine) {
    
    this.ocrEngine = ocrEngine;
    return this;
  }

   /**
   * The OCR technique used
   * @return ocrEngine
  **/
  @javax.annotation.Nullable
  public String getOcrEngine() {
    return ocrEngine;
  }


  public void setOcrEngine(String ocrEngine) {
    this.ocrEngine = ocrEngine;
  }


  public GetDocumentOcrResponse ocrStatus(String ocrStatus) {
    
    this.ocrStatus = ocrStatus;
    return this;
  }

   /**
   * The status of the OCR request
   * @return ocrStatus
  **/
  @javax.annotation.Nullable
  public String getOcrStatus() {
    return ocrStatus;
  }


  public void setOcrStatus(String ocrStatus) {
    this.ocrStatus = ocrStatus;
  }


  public GetDocumentOcrResponse contentType(String contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * Document Content-Type
   * @return contentType
  **/
  @javax.annotation.Nullable
  public String getContentType() {
    return contentType;
  }


  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public GetDocumentOcrResponse isBase64(Boolean isBase64) {
    
    this.isBase64 = isBase64;
    return this;
  }

   /**
   * Is the content Base64-encoded?
   * @return isBase64
  **/
  @javax.annotation.Nullable
  public Boolean getIsBase64() {
    return isBase64;
  }


  public void setIsBase64(Boolean isBase64) {
    this.isBase64 = isBase64;
  }


  public GetDocumentOcrResponse userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * User who requested the OCR
   * @return userId
  **/
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public GetDocumentOcrResponse documentId(String documentId) {
    
    this.documentId = documentId;
    return this;
  }

   /**
   * Document Identifier
   * @return documentId
  **/
  @javax.annotation.Nullable
  public String getDocumentId() {
    return documentId;
  }


  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocumentOcrResponse getDocumentOcrResponse = (GetDocumentOcrResponse) o;
    return Objects.equals(this.data, getDocumentOcrResponse.data) &&
        Objects.equals(this.ocrEngine, getDocumentOcrResponse.ocrEngine) &&
        Objects.equals(this.ocrStatus, getDocumentOcrResponse.ocrStatus) &&
        Objects.equals(this.contentType, getDocumentOcrResponse.contentType) &&
        Objects.equals(this.isBase64, getDocumentOcrResponse.isBase64) &&
        Objects.equals(this.userId, getDocumentOcrResponse.userId) &&
        Objects.equals(this.documentId, getDocumentOcrResponse.documentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, ocrEngine, ocrStatus, contentType, isBase64, userId, documentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocumentOcrResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    ocrEngine: ").append(toIndentedString(ocrEngine)).append("\n");
    sb.append("    ocrStatus: ").append(toIndentedString(ocrStatus)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    isBase64: ").append(toIndentedString(isBase64)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("ocrEngine");
    openapiFields.add("ocrStatus");
    openapiFields.add("contentType");
    openapiFields.add("isBase64");
    openapiFields.add("userId");
    openapiFields.add("documentId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetDocumentOcrResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetDocumentOcrResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetDocumentOcrResponse is not found in the empty JSON string", GetDocumentOcrResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetDocumentOcrResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetDocumentOcrResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) && !jsonObj.get("data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }
      if ((jsonObj.get("ocrEngine") != null && !jsonObj.get("ocrEngine").isJsonNull()) && !jsonObj.get("ocrEngine").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ocrEngine` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ocrEngine").toString()));
      }
      if ((jsonObj.get("ocrStatus") != null && !jsonObj.get("ocrStatus").isJsonNull()) && !jsonObj.get("ocrStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ocrStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ocrStatus").toString()));
      }
      if ((jsonObj.get("contentType") != null && !jsonObj.get("contentType").isJsonNull()) && !jsonObj.get("contentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contentType").toString()));
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if ((jsonObj.get("documentId") != null && !jsonObj.get("documentId").isJsonNull()) && !jsonObj.get("documentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetDocumentOcrResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetDocumentOcrResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetDocumentOcrResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetDocumentOcrResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetDocumentOcrResponse>() {
           @Override
           public void write(JsonWriter out, GetDocumentOcrResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetDocumentOcrResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetDocumentOcrResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetDocumentOcrResponse
  * @throws IOException if the JSON string is invalid with respect to GetDocumentOcrResponse
  */
  public static GetDocumentOcrResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetDocumentOcrResponse.class);
  }

 /**
  * Convert an instance of GetDocumentOcrResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

