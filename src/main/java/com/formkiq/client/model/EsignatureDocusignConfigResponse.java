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
 * EsignatureDocusignConfigResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-05T17:28:01.933058-05:00[America/Winnipeg]")
public class EsignatureDocusignConfigResponse {
  public static final String SERIALIZED_NAME_CONFIGURED = "configured";
  @SerializedName(SERIALIZED_NAME_CONFIGURED)
  private Boolean configured;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public EsignatureDocusignConfigResponse() {
  }

  public EsignatureDocusignConfigResponse configured(Boolean configured) {
    
    this.configured = configured;
    return this;
  }

   /**
   * Whether DocuSign is configured
   * @return configured
  **/
  @javax.annotation.Nullable
  public Boolean getConfigured() {
    return configured;
  }


  public void setConfigured(Boolean configured) {
    this.configured = configured;
  }


  public EsignatureDocusignConfigResponse userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * DocuSign UserId configured
   * @return userId
  **/
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public EsignatureDocusignConfigResponse clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * DocuSign Client configured
   * @return clientId
  **/
  @javax.annotation.Nullable
  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EsignatureDocusignConfigResponse esignatureDocusignConfigResponse = (EsignatureDocusignConfigResponse) o;
    return Objects.equals(this.configured, esignatureDocusignConfigResponse.configured) &&
        Objects.equals(this.userId, esignatureDocusignConfigResponse.userId) &&
        Objects.equals(this.clientId, esignatureDocusignConfigResponse.clientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configured, userId, clientId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EsignatureDocusignConfigResponse {\n");
    sb.append("    configured: ").append(toIndentedString(configured)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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
    openapiFields.add("configured");
    openapiFields.add("userId");
    openapiFields.add("clientId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EsignatureDocusignConfigResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EsignatureDocusignConfigResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EsignatureDocusignConfigResponse is not found in the empty JSON string", EsignatureDocusignConfigResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EsignatureDocusignConfigResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EsignatureDocusignConfigResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if ((jsonObj.get("clientId") != null && !jsonObj.get("clientId").isJsonNull()) && !jsonObj.get("clientId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EsignatureDocusignConfigResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EsignatureDocusignConfigResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EsignatureDocusignConfigResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EsignatureDocusignConfigResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<EsignatureDocusignConfigResponse>() {
           @Override
           public void write(JsonWriter out, EsignatureDocusignConfigResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EsignatureDocusignConfigResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EsignatureDocusignConfigResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EsignatureDocusignConfigResponse
  * @throws IOException if the JSON string is invalid with respect to EsignatureDocusignConfigResponse
  */
  public static EsignatureDocusignConfigResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EsignatureDocusignConfigResponse.class);
  }

 /**
  * Convert an instance of EsignatureDocusignConfigResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

