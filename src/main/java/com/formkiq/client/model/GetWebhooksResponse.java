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
import com.formkiq.client.model.GetWebhookResponse;
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
 * GetWebhooksResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-08-13T13:53:13.529619-05:00[America/Winnipeg]")
public class GetWebhooksResponse {
  public static final String SERIALIZED_NAME_WEBHOOKS = "webhooks";
  @SerializedName(SERIALIZED_NAME_WEBHOOKS)
  private List<GetWebhookResponse> webhooks;

  public GetWebhooksResponse() {}

  public GetWebhooksResponse webhooks(List<GetWebhookResponse> webhooks) {

    this.webhooks = webhooks;
    return this;
  }

  public GetWebhooksResponse addWebhooksItem(GetWebhookResponse webhooksItem) {
    if (this.webhooks == null) {
      this.webhooks = new ArrayList<>();
    }
    this.webhooks.add(webhooksItem);
    return this;
  }

  /**
   * List of webhooks
   * 
   * @return webhooks
   **/
  @javax.annotation.Nullable
  public List<GetWebhookResponse> getWebhooks() {
    return webhooks;
  }


  public void setWebhooks(List<GetWebhookResponse> webhooks) {
    this.webhooks = webhooks;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetWebhooksResponse getWebhooksResponse = (GetWebhooksResponse) o;
    return Objects.equals(this.webhooks, getWebhooksResponse.webhooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhooks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWebhooksResponse {\n");
    sb.append("    webhooks: ").append(toIndentedString(webhooks)).append("\n");
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
    openapiFields.add("webhooks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to GetWebhooksResponse
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (!GetWebhooksResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                  // object is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in GetWebhooksResponse is not found in the empty JSON string",
            GetWebhooksResponse.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!GetWebhooksResponse.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `GetWebhooksResponse` properties. JSON: %s",
            entry.getKey(), jsonObj.toString()));
      }
    }
    if (jsonObj.get("webhooks") != null && !jsonObj.get("webhooks").isJsonNull()) {
      JsonArray jsonArraywebhooks = jsonObj.getAsJsonArray("webhooks");
      if (jsonArraywebhooks != null) {
        // ensure the json data is an array
        if (!jsonObj.get("webhooks").isJsonArray()) {
          throw new IllegalArgumentException(String.format(
              "Expected the field `webhooks` to be an array in the JSON string but got `%s`",
              jsonObj.get("webhooks").toString()));
        }

        // validate the optional field `webhooks` (array)
        for (int i = 0; i < jsonArraywebhooks.size(); i++) {
          GetWebhookResponse.validateJsonObject(jsonArraywebhooks.get(i).getAsJsonObject());
        } ;
      }
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!GetWebhooksResponse.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'GetWebhooksResponse' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<GetWebhooksResponse> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(GetWebhooksResponse.class));

      return (TypeAdapter<T>) new TypeAdapter<GetWebhooksResponse>() {
        @Override
        public void write(JsonWriter out, GetWebhooksResponse value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public GetWebhooksResponse read(JsonReader in) throws IOException {
          JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
          validateJsonObject(jsonObj);
          return thisAdapter.fromJsonTree(jsonObj);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of GetWebhooksResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetWebhooksResponse
   * @throws IOException if the JSON string is invalid with respect to GetWebhooksResponse
   */
  public static GetWebhooksResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetWebhooksResponse.class);
  }

  /**
   * Convert an instance of GetWebhooksResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

