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
import com.formkiq.client.model.AddDocumentTagRequest;
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
 * AddWebhookRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-22T21:10:11.628621-05:00[America/Winnipeg]")
public class AddWebhookRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  private String ttl;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private String enabled;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<AddDocumentTagRequest> tags;

  public AddWebhookRequest() {
  }

  public AddWebhookRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of webhook
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AddWebhookRequest ttl(String ttl) {
    
    this.ttl = ttl;
    return this;
  }

   /**
   * Webhook time to live (expiry)
   * @return ttl
  **/
  @javax.annotation.Nullable
  public String getTtl() {
    return ttl;
  }


  public void setTtl(String ttl) {
    this.ttl = ttl;
  }


  public AddWebhookRequest enabled(String enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Is webhook enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  public String getEnabled() {
    return enabled;
  }


  public void setEnabled(String enabled) {
    this.enabled = enabled;
  }


  public AddWebhookRequest tags(List<AddDocumentTagRequest> tags) {
    
    this.tags = tags;
    return this;
  }

  public AddWebhookRequest addTagsItem(AddDocumentTagRequest tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * List of document tags
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<AddDocumentTagRequest> getTags() {
    return tags;
  }


  public void setTags(List<AddDocumentTagRequest> tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddWebhookRequest addWebhookRequest = (AddWebhookRequest) o;
    return Objects.equals(this.name, addWebhookRequest.name) &&
        Objects.equals(this.ttl, addWebhookRequest.ttl) &&
        Objects.equals(this.enabled, addWebhookRequest.enabled) &&
        Objects.equals(this.tags, addWebhookRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, ttl, enabled, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddWebhookRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("ttl");
    openapiFields.add("enabled");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddWebhookRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddWebhookRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddWebhookRequest is not found in the empty JSON string", AddWebhookRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AddWebhookRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddWebhookRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddWebhookRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("ttl") != null && !jsonObj.get("ttl").isJsonNull()) && !jsonObj.get("ttl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ttl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ttl").toString()));
      }
      if ((jsonObj.get("enabled") != null && !jsonObj.get("enabled").isJsonNull()) && !jsonObj.get("enabled").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enabled` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enabled").toString()));
      }
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
        if (jsonArraytags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
          }

          // validate the optional field `tags` (array)
          for (int i = 0; i < jsonArraytags.size(); i++) {
            AddDocumentTagRequest.validateJsonObject(jsonArraytags.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddWebhookRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddWebhookRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddWebhookRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddWebhookRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddWebhookRequest>() {
           @Override
           public void write(JsonWriter out, AddWebhookRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddWebhookRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddWebhookRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddWebhookRequest
  * @throws IOException if the JSON string is invalid with respect to AddWebhookRequest
  */
  public static AddWebhookRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddWebhookRequest.class);
  }

 /**
  * Convert an instance of AddWebhookRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

