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
import com.formkiq.client.model.AddAction;
import com.formkiq.client.model.AddChildDocument;
import com.formkiq.client.model.AddDocumentAttribute;
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
 * UpdateDocumentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-06-16T11:16:04.034590-05:00[America/Winnipeg]",
    comments = "Generator version: 7.6.0")
public class UpdateDocumentRequest {
  public static final String SERIALIZED_NAME_TAG_SCHEMA_ID = "tagSchemaId";
  @SerializedName(SERIALIZED_NAME_TAG_SCHEMA_ID)
  private String tagSchemaId;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_DEEP_LINK_PATH = "deepLinkPath";
  @SerializedName(SERIALIZED_NAME_DEEP_LINK_PATH)
  private String deepLinkPath;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "contentType";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_IS_BASE64 = "isBase64";
  @SerializedName(SERIALIZED_NAME_IS_BASE64)
  private Boolean isBase64;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<AddDocumentTag> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private List<AddDocumentMetadata> metadata = new ArrayList<>();

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<AddDocumentAttribute> attributes = new ArrayList<>();

  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<AddAction> actions = new ArrayList<>();

  public static final String SERIALIZED_NAME_DOCUMENTS = "documents";
  @SerializedName(SERIALIZED_NAME_DOCUMENTS)
  private List<AddChildDocument> documents = new ArrayList<>();

  public UpdateDocumentRequest() {}

  public UpdateDocumentRequest tagSchemaId(String tagSchemaId) {
    this.tagSchemaId = tagSchemaId;
    return this;
  }

  /**
   * Tag Schema Id
   * 
   * @return tagSchemaId
   **/
  @javax.annotation.Nullable
  public String getTagSchemaId() {
    return tagSchemaId;
  }

  public void setTagSchemaId(String tagSchemaId) {
    this.tagSchemaId = tagSchemaId;
  }


  public UpdateDocumentRequest path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Path or Name of document
   * 
   * @return path
   **/
  @javax.annotation.Nullable
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  public UpdateDocumentRequest deepLinkPath(String deepLinkPath) {
    this.deepLinkPath = deepLinkPath;
    return this;
  }

  /**
   * Path or Name of deep link
   * 
   * @return deepLinkPath
   **/
  @javax.annotation.Nullable
  public String getDeepLinkPath() {
    return deepLinkPath;
  }

  public void setDeepLinkPath(String deepLinkPath) {
    this.deepLinkPath = deepLinkPath;
  }


  public UpdateDocumentRequest contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Document media type
   * 
   * @return contentType
   **/
  @javax.annotation.Nullable
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public UpdateDocumentRequest isBase64(Boolean isBase64) {
    this.isBase64 = isBase64;
    return this;
  }

  /**
   * Is the content Base64-encoded?
   * 
   * @return isBase64
   **/
  @javax.annotation.Nullable
  public Boolean getIsBase64() {
    return isBase64;
  }

  public void setIsBase64(Boolean isBase64) {
    this.isBase64 = isBase64;
  }


  public UpdateDocumentRequest content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Document content
   * 
   * @return content
   **/
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public UpdateDocumentRequest tags(List<AddDocumentTag> tags) {
    this.tags = tags;
    return this;
  }

  public UpdateDocumentRequest addTagsItem(AddDocumentTag tagsItem) {
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
   **/
  @javax.annotation.Nullable
  public List<AddDocumentTag> getTags() {
    return tags;
  }

  public void setTags(List<AddDocumentTag> tags) {
    this.tags = tags;
  }


  public UpdateDocumentRequest metadata(List<AddDocumentMetadata> metadata) {
    this.metadata = metadata;
    return this;
  }

  public UpdateDocumentRequest addMetadataItem(AddDocumentMetadata metadataItem) {
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
   **/
  @javax.annotation.Nullable
  public List<AddDocumentMetadata> getMetadata() {
    return metadata;
  }

  public void setMetadata(List<AddDocumentMetadata> metadata) {
    this.metadata = metadata;
  }


  public UpdateDocumentRequest attributes(List<AddDocumentAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public UpdateDocumentRequest addAttributesItem(AddDocumentAttribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * List of document attributes
   * 
   * @return attributes
   **/
  @javax.annotation.Nullable
  public List<AddDocumentAttribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<AddDocumentAttribute> attributes) {
    this.attributes = attributes;
  }


  public UpdateDocumentRequest actions(List<AddAction> actions) {
    this.actions = actions;
    return this;
  }

  public UpdateDocumentRequest addActionsItem(AddAction actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

  /**
   * List of Actions
   * 
   * @return actions
   **/
  @javax.annotation.Nullable
  public List<AddAction> getActions() {
    return actions;
  }

  public void setActions(List<AddAction> actions) {
    this.actions = actions;
  }


  public UpdateDocumentRequest documents(List<AddChildDocument> documents) {
    this.documents = documents;
    return this;
  }

  public UpdateDocumentRequest addDocumentsItem(AddChildDocument documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<>();
    }
    this.documents.add(documentsItem);
    return this;
  }

  /**
   * List of child documents
   * 
   * @return documents
   **/
  @javax.annotation.Nullable
  public List<AddChildDocument> getDocuments() {
    return documents;
  }

  public void setDocuments(List<AddChildDocument> documents) {
    this.documents = documents;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDocumentRequest updateDocumentRequest = (UpdateDocumentRequest) o;
    return Objects.equals(this.tagSchemaId, updateDocumentRequest.tagSchemaId)
        && Objects.equals(this.path, updateDocumentRequest.path)
        && Objects.equals(this.deepLinkPath, updateDocumentRequest.deepLinkPath)
        && Objects.equals(this.contentType, updateDocumentRequest.contentType)
        && Objects.equals(this.isBase64, updateDocumentRequest.isBase64)
        && Objects.equals(this.content, updateDocumentRequest.content)
        && Objects.equals(this.tags, updateDocumentRequest.tags)
        && Objects.equals(this.metadata, updateDocumentRequest.metadata)
        && Objects.equals(this.attributes, updateDocumentRequest.attributes)
        && Objects.equals(this.actions, updateDocumentRequest.actions)
        && Objects.equals(this.documents, updateDocumentRequest.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagSchemaId, path, deepLinkPath, contentType, isBase64, content, tags,
        metadata, attributes, actions, documents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDocumentRequest {\n");
    sb.append("    tagSchemaId: ").append(toIndentedString(tagSchemaId)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    deepLinkPath: ").append(toIndentedString(deepLinkPath)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    isBase64: ").append(toIndentedString(isBase64)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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
    openapiFields.add("tagSchemaId");
    openapiFields.add("path");
    openapiFields.add("deepLinkPath");
    openapiFields.add("contentType");
    openapiFields.add("isBase64");
    openapiFields.add("content");
    openapiFields.add("tags");
    openapiFields.add("metadata");
    openapiFields.add("attributes");
    openapiFields.add("actions");
    openapiFields.add("documents");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateDocumentRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!UpdateDocumentRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                    // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in UpdateDocumentRequest is not found in the empty JSON string",
            UpdateDocumentRequest.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!UpdateDocumentRequest.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `UpdateDocumentRequest` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("tagSchemaId") != null && !jsonObj.get("tagSchemaId").isJsonNull())
        && !jsonObj.get("tagSchemaId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `tagSchemaId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("tagSchemaId").toString()));
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
    if (jsonObj.get("attributes") != null && !jsonObj.get("attributes").isJsonNull()) {
      JsonArray jsonArrayattributes = jsonObj.getAsJsonArray("attributes");
      if (jsonArrayattributes != null) {
        // ensure the json data is an array
        if (!jsonObj.get("attributes").isJsonArray()) {
          throw new IllegalArgumentException(String.format(
              "Expected the field `attributes` to be an array in the JSON string but got `%s`",
              jsonObj.get("attributes").toString()));
        }

        // validate the optional field `attributes` (array)
        for (int i = 0; i < jsonArrayattributes.size(); i++) {
          AddDocumentAttribute.validateJsonElement(jsonArrayattributes.get(i));
        } ;
      }
    }
    if (jsonObj.get("actions") != null && !jsonObj.get("actions").isJsonNull()) {
      JsonArray jsonArrayactions = jsonObj.getAsJsonArray("actions");
      if (jsonArrayactions != null) {
        // ensure the json data is an array
        if (!jsonObj.get("actions").isJsonArray()) {
          throw new IllegalArgumentException(String.format(
              "Expected the field `actions` to be an array in the JSON string but got `%s`",
              jsonObj.get("actions").toString()));
        }

        // validate the optional field `actions` (array)
        for (int i = 0; i < jsonArrayactions.size(); i++) {
          AddAction.validateJsonElement(jsonArrayactions.get(i));
        } ;
      }
    }
    if (jsonObj.get("documents") != null && !jsonObj.get("documents").isJsonNull()) {
      JsonArray jsonArraydocuments = jsonObj.getAsJsonArray("documents");
      if (jsonArraydocuments != null) {
        // ensure the json data is an array
        if (!jsonObj.get("documents").isJsonArray()) {
          throw new IllegalArgumentException(String.format(
              "Expected the field `documents` to be an array in the JSON string but got `%s`",
              jsonObj.get("documents").toString()));
        }

        // validate the optional field `documents` (array)
        for (int i = 0; i < jsonArraydocuments.size(); i++) {
          AddChildDocument.validateJsonElement(jsonArraydocuments.get(i));
        } ;
      }
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!UpdateDocumentRequest.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'UpdateDocumentRequest' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<UpdateDocumentRequest> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(UpdateDocumentRequest.class));

      return (TypeAdapter<T>) new TypeAdapter<UpdateDocumentRequest>() {
        @Override
        public void write(JsonWriter out, UpdateDocumentRequest value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public UpdateDocumentRequest read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateDocumentRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateDocumentRequest
   * @throws IOException if the JSON string is invalid with respect to UpdateDocumentRequest
   */
  public static UpdateDocumentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateDocumentRequest.class);
  }

  /**
   * Convert an instance of UpdateDocumentRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

