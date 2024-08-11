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
import com.formkiq.client.model.AddDocumentMetadata;
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
 * AddDocumentFulltextRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-08-10T23:08:52.578418-05:00[America/Winnipeg]",
    comments = "Generator version: 7.7.0")
public class AddDocumentFulltextRequest {
  public static final String SERIALIZED_NAME_CONTENT_TYPE = "contentType";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_CONTENT_URLS = "contentUrls";
  @SerializedName(SERIALIZED_NAME_CONTENT_URLS)
  private List<String> contentUrls = new ArrayList<>();

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_DEEP_LINK_PATH = "deepLinkPath";
  @SerializedName(SERIALIZED_NAME_DEEP_LINK_PATH)
  private String deepLinkPath;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<AddDocumentTag> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private List<AddDocumentMetadata> metadata = new ArrayList<>();

  public AddDocumentFulltextRequest() {}

  public AddDocumentFulltextRequest contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Document Content-Type
   * 
   * @return contentType
   */
  @javax.annotation.Nullable
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public AddDocumentFulltextRequest content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Document content
   * 
   * @return content
   */
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public AddDocumentFulltextRequest contentUrls(List<String> contentUrls) {
    this.contentUrls = contentUrls;
    return this;
  }

  public AddDocumentFulltextRequest addContentUrlsItem(String contentUrlsItem) {
    if (this.contentUrls == null) {
      this.contentUrls = new ArrayList<>();
    }
    this.contentUrls.add(contentUrlsItem);
    return this;
  }

  /**
   * URL(s) which contain document content
   * 
   * @return contentUrls
   */
  @javax.annotation.Nullable
  public List<String> getContentUrls() {
    return contentUrls;
  }

  public void setContentUrls(List<String> contentUrls) {
    this.contentUrls = contentUrls;
  }


  public AddDocumentFulltextRequest path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Path or Name of document
   * 
   * @return path
   */
  @javax.annotation.Nullable
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  public AddDocumentFulltextRequest deepLinkPath(String deepLinkPath) {
    this.deepLinkPath = deepLinkPath;
    return this;
  }

  /**
   * Path or Name of deep link
   * 
   * @return deepLinkPath
   */
  @javax.annotation.Nullable
  public String getDeepLinkPath() {
    return deepLinkPath;
  }

  public void setDeepLinkPath(String deepLinkPath) {
    this.deepLinkPath = deepLinkPath;
  }


  public AddDocumentFulltextRequest tags(List<AddDocumentTag> tags) {
    this.tags = tags;
    return this;
  }

  public AddDocumentFulltextRequest addTagsItem(AddDocumentTag tagsItem) {
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


  public AddDocumentFulltextRequest metadata(List<AddDocumentMetadata> metadata) {
    this.metadata = metadata;
    return this;
  }

  public AddDocumentFulltextRequest addMetadataItem(AddDocumentMetadata metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

  /**
   * List of document Metadata
   * 
   * @return metadata
   */
  @javax.annotation.Nullable
  public List<AddDocumentMetadata> getMetadata() {
    return metadata;
  }

  public void setMetadata(List<AddDocumentMetadata> metadata) {
    this.metadata = metadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddDocumentFulltextRequest addDocumentFulltextRequest = (AddDocumentFulltextRequest) o;
    return Objects.equals(this.contentType, addDocumentFulltextRequest.contentType)
        && Objects.equals(this.content, addDocumentFulltextRequest.content)
        && Objects.equals(this.contentUrls, addDocumentFulltextRequest.contentUrls)
        && Objects.equals(this.path, addDocumentFulltextRequest.path)
        && Objects.equals(this.deepLinkPath, addDocumentFulltextRequest.deepLinkPath)
        && Objects.equals(this.tags, addDocumentFulltextRequest.tags)
        && Objects.equals(this.metadata, addDocumentFulltextRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, content, contentUrls, path, deepLinkPath, tags, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddDocumentFulltextRequest {\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    contentUrls: ").append(toIndentedString(contentUrls)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    deepLinkPath: ").append(toIndentedString(deepLinkPath)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("contentType");
    openapiFields.add("content");
    openapiFields.add("contentUrls");
    openapiFields.add("path");
    openapiFields.add("deepLinkPath");
    openapiFields.add("tags");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AddDocumentFulltextRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!AddDocumentFulltextRequest.openapiRequiredFields.isEmpty()) { // has required fields but
                                                                         // JSON element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in AddDocumentFulltextRequest is not found in the empty JSON string",
            AddDocumentFulltextRequest.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!AddDocumentFulltextRequest.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `AddDocumentFulltextRequest` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("contentType") != null && !jsonObj.get("contentType").isJsonNull())
        && !jsonObj.get("contentType").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `contentType` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("contentType").toString()));
    }
    if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull())
        && !jsonObj.get("content").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `content` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("content").toString()));
    }
    // ensure the optional json data is an array if present
    if (jsonObj.get("contentUrls") != null && !jsonObj.get("contentUrls").isJsonNull()
        && !jsonObj.get("contentUrls").isJsonArray()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `contentUrls` to be an array in the JSON string but got `%s`",
          jsonObj.get("contentUrls").toString()));
    }
    if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull())
        && !jsonObj.get("path").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `path` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("path").toString()));
    }
    if ((jsonObj.get("deepLinkPath") != null && !jsonObj.get("deepLinkPath").isJsonNull())
        && !jsonObj.get("deepLinkPath").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `deepLinkPath` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("deepLinkPath").toString()));
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
          AddDocumentTag.validateJsonElement(jsonArraytags.get(i));
        } ;
      }
    }
    if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
      JsonArray jsonArraymetadata = jsonObj.getAsJsonArray("metadata");
      if (jsonArraymetadata != null) {
        // ensure the json data is an array
        if (!jsonObj.get("metadata").isJsonArray()) {
          throw new IllegalArgumentException(String.format(
              "Expected the field `metadata` to be an array in the JSON string but got `%s`",
              jsonObj.get("metadata").toString()));
        }

        // validate the optional field `metadata` (array)
        for (int i = 0; i < jsonArraymetadata.size(); i++) {
          AddDocumentMetadata.validateJsonElement(jsonArraymetadata.get(i));
        } ;
      }
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!AddDocumentFulltextRequest.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'AddDocumentFulltextRequest' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<AddDocumentFulltextRequest> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(AddDocumentFulltextRequest.class));

      return (TypeAdapter<T>) new TypeAdapter<AddDocumentFulltextRequest>() {
        @Override
        public void write(JsonWriter out, AddDocumentFulltextRequest value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public AddDocumentFulltextRequest read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of AddDocumentFulltextRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AddDocumentFulltextRequest
   * @throws IOException if the JSON string is invalid with respect to AddDocumentFulltextRequest
   */
  public static AddDocumentFulltextRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddDocumentFulltextRequest.class);
  }

  /**
   * Convert an instance of AddDocumentFulltextRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

