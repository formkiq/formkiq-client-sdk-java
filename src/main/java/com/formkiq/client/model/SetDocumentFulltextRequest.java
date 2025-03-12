/*
 * FormKiQ API JWT Formkiq API: Document Management Platform API using OAuth(JWT) Authentication You
 * can find out more about FormKiQ at [https://formkiq.com](http://formkiq.com). ## Introduction
 * FormKiQ is an API-first (head-less), battle-tested document management API. The FormKiQ API
 * provides all the API endpoints to build your Perfect Document Management Platform. FormKiQ API
 * was built on top of [OpenAPI specification](https://www.openapis.org), so it is easy to use the
 * API spec file with any application that supports the OpenAPI specification. Open API OAuth
 * Specification -
 * https://raw.githubusercontent.com/formkiq/formkiq-core/master/docs/openapi/openapi-jwt.yaml Open
 * API IAM Specification -
 * https://raw.githubusercontent.com/formkiq/formkiq-core/master/docs/openapi/openapi-iam.yaml ##
 * Authentication FormKiQ offers three forms of authentication: - OAuth(JWT) - AWS IAM - API Key
 *
 * The version of the OpenAPI document: 1.17.0 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import com.formkiq.client.model.AddDocumentMetadata;
import com.formkiq.client.model.AddDocumentTag;
import com.formkiq.client.model.ChecksumType;
import com.formkiq.client.model.FulltextAttribute;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * SetDocumentFulltextRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2025-03-12T17:17:25.165880-05:00[America/Winnipeg]",
    comments = "Generator version: 7.12.0")
public class SetDocumentFulltextRequest {
  public static final String SERIALIZED_NAME_CONTENT_TYPE = "contentType";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  @javax.annotation.Nullable
  private String contentType;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  @javax.annotation.Nullable
  private String content;

  public static final String SERIALIZED_NAME_CONTENT_URLS = "contentUrls";
  @SerializedName(SERIALIZED_NAME_CONTENT_URLS)
  @javax.annotation.Nullable
  private List<String> contentUrls = new ArrayList<>();

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  @javax.annotation.Nullable
  private String path;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  @javax.annotation.Nullable
  private String width;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  @javax.annotation.Nullable
  private String height;

  public static final String SERIALIZED_NAME_DEEP_LINK_PATH = "deepLinkPath";
  @SerializedName(SERIALIZED_NAME_DEEP_LINK_PATH)
  @javax.annotation.Nullable
  private String deepLinkPath;

  public static final String SERIALIZED_NAME_CHECKSUM = "checksum";
  @SerializedName(SERIALIZED_NAME_CHECKSUM)
  @javax.annotation.Nullable
  private String checksum;

  public static final String SERIALIZED_NAME_CHECKSUM_TYPE = "checksumType";
  @SerializedName(SERIALIZED_NAME_CHECKSUM_TYPE)
  @javax.annotation.Nullable
  private ChecksumType checksumType;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  @javax.annotation.Nullable
  private List<AddDocumentTag> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  @javax.annotation.Nullable
  private List<AddDocumentMetadata> metadata = new ArrayList<>();

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  @javax.annotation.Nullable
  private Map<String, FulltextAttribute> attributes = new HashMap<>();

  public SetDocumentFulltextRequest() {}

  public SetDocumentFulltextRequest contentType(@javax.annotation.Nullable String contentType) {
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

  public void setContentType(@javax.annotation.Nullable String contentType) {
    this.contentType = contentType;
  }


  public SetDocumentFulltextRequest content(@javax.annotation.Nullable String content) {
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

  public void setContent(@javax.annotation.Nullable String content) {
    this.content = content;
  }


  public SetDocumentFulltextRequest contentUrls(
      @javax.annotation.Nullable List<String> contentUrls) {
    this.contentUrls = contentUrls;
    return this;
  }

  public SetDocumentFulltextRequest addContentUrlsItem(String contentUrlsItem) {
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

  public void setContentUrls(@javax.annotation.Nullable List<String> contentUrls) {
    this.contentUrls = contentUrls;
  }


  public SetDocumentFulltextRequest path(@javax.annotation.Nullable String path) {
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

  public void setPath(@javax.annotation.Nullable String path) {
    this.path = path;
  }


  public SetDocumentFulltextRequest width(@javax.annotation.Nullable String width) {
    this.width = width;
    return this;
  }

  /**
   * Document Content Width property
   * 
   * @return width
   */
  @javax.annotation.Nullable
  public String getWidth() {
    return width;
  }

  public void setWidth(@javax.annotation.Nullable String width) {
    this.width = width;
  }


  public SetDocumentFulltextRequest height(@javax.annotation.Nullable String height) {
    this.height = height;
    return this;
  }

  /**
   * Document Content Height property
   * 
   * @return height
   */
  @javax.annotation.Nullable
  public String getHeight() {
    return height;
  }

  public void setHeight(@javax.annotation.Nullable String height) {
    this.height = height;
  }


  public SetDocumentFulltextRequest deepLinkPath(@javax.annotation.Nullable String deepLinkPath) {
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

  public void setDeepLinkPath(@javax.annotation.Nullable String deepLinkPath) {
    this.deepLinkPath = deepLinkPath;
  }


  public SetDocumentFulltextRequest checksum(@javax.annotation.Nullable String checksum) {
    this.checksum = checksum;
    return this;
  }

  /**
   * Document checksum, changes when document file changes
   * 
   * @return checksum
   */
  @javax.annotation.Nullable
  public String getChecksum() {
    return checksum;
  }

  public void setChecksum(@javax.annotation.Nullable String checksum) {
    this.checksum = checksum;
  }


  public SetDocumentFulltextRequest checksumType(
      @javax.annotation.Nullable ChecksumType checksumType) {
    this.checksumType = checksumType;
    return this;
  }

  /**
   * Get checksumType
   * 
   * @return checksumType
   */
  @javax.annotation.Nullable
  public ChecksumType getChecksumType() {
    return checksumType;
  }

  public void setChecksumType(@javax.annotation.Nullable ChecksumType checksumType) {
    this.checksumType = checksumType;
  }


  public SetDocumentFulltextRequest tags(@javax.annotation.Nullable List<AddDocumentTag> tags) {
    this.tags = tags;
    return this;
  }

  public SetDocumentFulltextRequest addTagsItem(AddDocumentTag tagsItem) {
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

  public void setTags(@javax.annotation.Nullable List<AddDocumentTag> tags) {
    this.tags = tags;
  }


  public SetDocumentFulltextRequest metadata(
      @javax.annotation.Nullable List<AddDocumentMetadata> metadata) {
    this.metadata = metadata;
    return this;
  }

  public SetDocumentFulltextRequest addMetadataItem(AddDocumentMetadata metadataItem) {
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

  public void setMetadata(@javax.annotation.Nullable List<AddDocumentMetadata> metadata) {
    this.metadata = metadata;
  }


  public SetDocumentFulltextRequest attributes(
      @javax.annotation.Nullable Map<String, FulltextAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public SetDocumentFulltextRequest putAttributesItem(String key,
      FulltextAttribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * Get attributes
   * 
   * @return attributes
   */
  @javax.annotation.Nullable
  public Map<String, FulltextAttribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(@javax.annotation.Nullable Map<String, FulltextAttribute> attributes) {
    this.attributes = attributes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetDocumentFulltextRequest setDocumentFulltextRequest = (SetDocumentFulltextRequest) o;
    return Objects.equals(this.contentType, setDocumentFulltextRequest.contentType)
        && Objects.equals(this.content, setDocumentFulltextRequest.content)
        && Objects.equals(this.contentUrls, setDocumentFulltextRequest.contentUrls)
        && Objects.equals(this.path, setDocumentFulltextRequest.path)
        && Objects.equals(this.width, setDocumentFulltextRequest.width)
        && Objects.equals(this.height, setDocumentFulltextRequest.height)
        && Objects.equals(this.deepLinkPath, setDocumentFulltextRequest.deepLinkPath)
        && Objects.equals(this.checksum, setDocumentFulltextRequest.checksum)
        && Objects.equals(this.checksumType, setDocumentFulltextRequest.checksumType)
        && Objects.equals(this.tags, setDocumentFulltextRequest.tags)
        && Objects.equals(this.metadata, setDocumentFulltextRequest.metadata)
        && Objects.equals(this.attributes, setDocumentFulltextRequest.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, content, contentUrls, path, width, height, deepLinkPath,
        checksum, checksumType, tags, metadata, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetDocumentFulltextRequest {\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    contentUrls: ").append(toIndentedString(contentUrls)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    deepLinkPath: ").append(toIndentedString(deepLinkPath)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    checksumType: ").append(toIndentedString(checksumType)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
    openapiFields.add("width");
    openapiFields.add("height");
    openapiFields.add("deepLinkPath");
    openapiFields.add("checksum");
    openapiFields.add("checksumType");
    openapiFields.add("tags");
    openapiFields.add("metadata");
    openapiFields.add("attributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SetDocumentFulltextRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!SetDocumentFulltextRequest.openapiRequiredFields.isEmpty()) { // has required fields but
                                                                         // JSON element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in SetDocumentFulltextRequest is not found in the empty JSON string",
            SetDocumentFulltextRequest.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!SetDocumentFulltextRequest.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `SetDocumentFulltextRequest` properties. JSON: %s",
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
    if ((jsonObj.get("width") != null && !jsonObj.get("width").isJsonNull())
        && !jsonObj.get("width").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `width` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("width").toString()));
    }
    if ((jsonObj.get("height") != null && !jsonObj.get("height").isJsonNull())
        && !jsonObj.get("height").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `height` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("height").toString()));
    }
    if ((jsonObj.get("deepLinkPath") != null && !jsonObj.get("deepLinkPath").isJsonNull())
        && !jsonObj.get("deepLinkPath").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `deepLinkPath` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("deepLinkPath").toString()));
    }
    if ((jsonObj.get("checksum") != null && !jsonObj.get("checksum").isJsonNull())
        && !jsonObj.get("checksum").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `checksum` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("checksum").toString()));
    }
    // validate the optional field `checksumType`
    if (jsonObj.get("checksumType") != null && !jsonObj.get("checksumType").isJsonNull()) {
      ChecksumType.validateJsonElement(jsonObj.get("checksumType"));
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
      if (!SetDocumentFulltextRequest.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'SetDocumentFulltextRequest' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<SetDocumentFulltextRequest> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(SetDocumentFulltextRequest.class));

      return (TypeAdapter<T>) new TypeAdapter<SetDocumentFulltextRequest>() {
        @Override
        public void write(JsonWriter out, SetDocumentFulltextRequest value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public SetDocumentFulltextRequest read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of SetDocumentFulltextRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SetDocumentFulltextRequest
   * @throws IOException if the JSON string is invalid with respect to SetDocumentFulltextRequest
   */
  public static SetDocumentFulltextRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SetDocumentFulltextRequest.class);
  }

  /**
   * Convert an instance of SetDocumentFulltextRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

