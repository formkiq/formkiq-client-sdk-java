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
import com.formkiq.client.model.AddDocumentTag;
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
 * Data to update
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-08-13T11:58:14.990579-05:00[America/Winnipeg]",
    comments = "Generator version: 7.7.0")
public class UpdateMatchingDocumentTagsRequestUpdate {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<AddDocumentTag> tags = new ArrayList<>();

  public UpdateMatchingDocumentTagsRequestUpdate() {}

  public UpdateMatchingDocumentTagsRequestUpdate tags(List<AddDocumentTag> tags) {
    this.tags = tags;
    return this;
  }

  public UpdateMatchingDocumentTagsRequestUpdate addTagsItem(AddDocumentTag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * List of document tags
   * 
   * @return tags
   */
  @javax.annotation.Nullable
  public List<AddDocumentTag> getTags() {
    return tags;
  }

  public void setTags(List<AddDocumentTag> tags) {
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
    UpdateMatchingDocumentTagsRequestUpdate updateMatchingDocumentTagsRequestUpdate =
        (UpdateMatchingDocumentTagsRequestUpdate) o;
    return Objects.equals(this.tags, updateMatchingDocumentTagsRequestUpdate.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMatchingDocumentTagsRequestUpdate {\n");
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
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to
   *         UpdateMatchingDocumentTagsRequestUpdate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!UpdateMatchingDocumentTagsRequestUpdate.openapiRequiredFields.isEmpty()) { // has
                                                                                      // required
                                                                                      // fields but
                                                                                      // JSON
                                                                                      // element is
                                                                                      // null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in UpdateMatchingDocumentTagsRequestUpdate is not found in the empty JSON string",
            UpdateMatchingDocumentTagsRequestUpdate.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!UpdateMatchingDocumentTagsRequestUpdate.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `UpdateMatchingDocumentTagsRequestUpdate` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
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
          AddDocumentTag.validateJsonElement(jsonArraytags.get(i));
        } ;
      }
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!UpdateMatchingDocumentTagsRequestUpdate.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'UpdateMatchingDocumentTagsRequestUpdate' and its
                     // subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<UpdateMatchingDocumentTagsRequestUpdate> thisAdapter = gson
          .getDelegateAdapter(this, TypeToken.get(UpdateMatchingDocumentTagsRequestUpdate.class));

      return (TypeAdapter<T>) new TypeAdapter<UpdateMatchingDocumentTagsRequestUpdate>() {
        @Override
        public void write(JsonWriter out, UpdateMatchingDocumentTagsRequestUpdate value)
            throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public UpdateMatchingDocumentTagsRequestUpdate read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateMatchingDocumentTagsRequestUpdate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateMatchingDocumentTagsRequestUpdate
   * @throws IOException if the JSON string is invalid with respect to
   *         UpdateMatchingDocumentTagsRequestUpdate
   */
  public static UpdateMatchingDocumentTagsRequestUpdate fromJson(String jsonString)
      throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateMatchingDocumentTagsRequestUpdate.class);
  }

  /**
   * Convert an instance of UpdateMatchingDocumentTagsRequestUpdate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

