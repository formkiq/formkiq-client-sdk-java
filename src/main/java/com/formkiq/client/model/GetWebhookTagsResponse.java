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
 * The version of the OpenAPI document: 1.15.0 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import com.formkiq.client.model.WebhookTag;
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
 * GetWebhookTagsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-06-15T14:16:48.642984-05:00[America/Winnipeg]",
    comments = "Generator version: 7.6.0")
public class GetWebhookTagsResponse {
  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private String next;

  public static final String SERIALIZED_NAME_PREVIOUS = "previous";
  @SerializedName(SERIALIZED_NAME_PREVIOUS)
  private String previous;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<WebhookTag> tags = new ArrayList<>();

  public GetWebhookTagsResponse() {}

  public GetWebhookTagsResponse next(String next) {
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


  public GetWebhookTagsResponse previous(String previous) {
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


  public GetWebhookTagsResponse tags(List<WebhookTag> tags) {
    this.tags = tags;
    return this;
  }

  public GetWebhookTagsResponse addTagsItem(WebhookTag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * List of webhook tags
   * 
   * @return tags
   **/
  @javax.annotation.Nullable
  public List<WebhookTag> getTags() {
    return tags;
  }

  public void setTags(List<WebhookTag> tags) {
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
    GetWebhookTagsResponse getWebhookTagsResponse = (GetWebhookTagsResponse) o;
    return Objects.equals(this.next, getWebhookTagsResponse.next)
        && Objects.equals(this.previous, getWebhookTagsResponse.previous)
        && Objects.equals(this.tags, getWebhookTagsResponse.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(next, previous, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWebhookTagsResponse {\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetWebhookTagsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!GetWebhookTagsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                     // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in GetWebhookTagsResponse is not found in the empty JSON string",
            GetWebhookTagsResponse.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!GetWebhookTagsResponse.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `GetWebhookTagsResponse` properties. JSON: %s",
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
    if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
      JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
      if (jsonArraytags != null) {
        // ensure the json data is an array
        if (!jsonObj.get("tags").isJsonArray()) {
          throw new IllegalArgumentException(String.format(
              "Expected the field `tags` to be an array in the JSON string but got `%s`",
              jsonObj.get("tags").toString()));
        }

        // validate the optional field `tags` (array)
        for (int i = 0; i < jsonArraytags.size(); i++) {
          WebhookTag.validateJsonElement(jsonArraytags.get(i));
        } ;
      }
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!GetWebhookTagsResponse.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'GetWebhookTagsResponse' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<GetWebhookTagsResponse> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(GetWebhookTagsResponse.class));

      return (TypeAdapter<T>) new TypeAdapter<GetWebhookTagsResponse>() {
        @Override
        public void write(JsonWriter out, GetWebhookTagsResponse value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public GetWebhookTagsResponse read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of GetWebhookTagsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetWebhookTagsResponse
   * @throws IOException if the JSON string is invalid with respect to GetWebhookTagsResponse
   */
  public static GetWebhookTagsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetWebhookTagsResponse.class);
  }

  /**
   * Convert an instance of GetWebhookTagsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

