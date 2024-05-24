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
 * The version of the OpenAPI document: 1.14.1 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import com.formkiq.client.model.AddAccessAttribute;
import com.formkiq.client.model.AddAction;
import com.formkiq.client.model.AddChildDocument;
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
 * AddDocumentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-05-23T13:23:45.456005-05:00[America/Winnipeg]",
    comments = "Generator version: 7.6.0")
public class AddDocumentRequest {
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

  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<AddAction> actions = new ArrayList<>();

  public static final String SERIALIZED_NAME_ACCESS_ATTRIBUTES = "accessAttributes";
  @SerializedName(SERIALIZED_NAME_ACCESS_ATTRIBUTES)
  private List<AddAccessAttribute> accessAttributes = new ArrayList<>();

  public static final String SERIALIZED_NAME_DOCUMENTS = "documents";
  @SerializedName(SERIALIZED_NAME_DOCUMENTS)
  private List<AddChildDocument> documents = new ArrayList<>();

  public AddDocumentRequest() {}

  public AddDocumentRequest tagSchemaId(String tagSchemaId) {
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


  public AddDocumentRequest path(String path) {
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


  public AddDocumentRequest deepLinkPath(String deepLinkPath) {
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


  public AddDocumentRequest contentType(String contentType) {
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


  public AddDocumentRequest isBase64(Boolean isBase64) {
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


  public AddDocumentRequest content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Document content
   * 
   * @return content
   **/
  @javax.annotation.Nonnull
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public AddDocumentRequest tags(List<AddDocumentTag> tags) {
    this.tags = tags;
    return this;
  }

  public AddDocumentRequest addTagsItem(AddDocumentTag tagsItem) {
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


  public AddDocumentRequest metadata(List<AddDocumentMetadata> metadata) {
    this.metadata = metadata;
    return this;
  }

  public AddDocumentRequest addMetadataItem(AddDocumentMetadata metadataItem) {
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


  public AddDocumentRequest actions(List<AddAction> actions) {
    this.actions = actions;
    return this;
  }

  public AddDocumentRequest addActionsItem(AddAction actionsItem) {
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


  public AddDocumentRequest accessAttributes(List<AddAccessAttribute> accessAttributes) {
    this.accessAttributes = accessAttributes;
    return this;
  }

  public AddDocumentRequest addAccessAttributesItem(AddAccessAttribute accessAttributesItem) {
    if (this.accessAttributes == null) {
      this.accessAttributes = new ArrayList<>();
    }
    this.accessAttributes.add(accessAttributesItem);
    return this;
  }

  /**
   * List of Access Attributes (only available in pro/enterprise)
   * 
   * @return accessAttributes
   **/
  @javax.annotation.Nullable
  public List<AddAccessAttribute> getAccessAttributes() {
    return accessAttributes;
  }

  public void setAccessAttributes(List<AddAccessAttribute> accessAttributes) {
    this.accessAttributes = accessAttributes;
  }


  public AddDocumentRequest documents(List<AddChildDocument> documents) {
    this.documents = documents;
    return this;
  }

  public AddDocumentRequest addDocumentsItem(AddChildDocument documentsItem) {
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
    AddDocumentRequest addDocumentRequest = (AddDocumentRequest) o;
    return Objects.equals(this.tagSchemaId, addDocumentRequest.tagSchemaId)
        && Objects.equals(this.path, addDocumentRequest.path)
        && Objects.equals(this.deepLinkPath, addDocumentRequest.deepLinkPath)
        && Objects.equals(this.contentType, addDocumentRequest.contentType)
        && Objects.equals(this.isBase64, addDocumentRequest.isBase64)
        && Objects.equals(this.content, addDocumentRequest.content)
        && Objects.equals(this.tags, addDocumentRequest.tags)
        && Objects.equals(this.metadata, addDocumentRequest.metadata)
        && Objects.equals(this.actions, addDocumentRequest.actions)
        && Objects.equals(this.accessAttributes, addDocumentRequest.accessAttributes)
        && Objects.equals(this.documents, addDocumentRequest.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagSchemaId, path, deepLinkPath, contentType, isBase64, content, tags,
        metadata, actions, accessAttributes, documents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddDocumentRequest {\n");
    sb.append("    tagSchemaId: ").append(toIndentedString(tagSchemaId)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    deepLinkPath: ").append(toIndentedString(deepLinkPath)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    isBase64: ").append(toIndentedString(isBase64)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    accessAttributes: ").append(toIndentedString(accessAttributes)).append("\n");
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
    openapiFields.add("actions");
    openapiFields.add("accessAttributes");
    openapiFields.add("documents");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("content");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AddDocumentRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!AddDocumentRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                 // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in AddDocumentRequest is not found in the empty JSON string",
            AddDocumentRequest.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!AddDocumentRequest.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `AddDocumentRequest` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : AddDocumentRequest.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format("The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
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
    if (!jsonObj.get("content").isJsonPrimitive()) {
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
    if (jsonObj.get("accessAttributes") != null && !jsonObj.get("accessAttributes").isJsonNull()) {
      JsonArray jsonArrayaccessAttributes = jsonObj.getAsJsonArray("accessAttributes");
      if (jsonArrayaccessAttributes != null) {
        // ensure the json data is an array
        if (!jsonObj.get("accessAttributes").isJsonArray()) {
          throw new IllegalArgumentException(String.format(
              "Expected the field `accessAttributes` to be an array in the JSON string but got `%s`",
              jsonObj.get("accessAttributes").toString()));
        }

        // validate the optional field `accessAttributes` (array)
        for (int i = 0; i < jsonArrayaccessAttributes.size(); i++) {
          AddAccessAttribute.validateJsonElement(jsonArrayaccessAttributes.get(i));
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
      if (!AddDocumentRequest.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'AddDocumentRequest' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<AddDocumentRequest> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(AddDocumentRequest.class));

      return (TypeAdapter<T>) new TypeAdapter<AddDocumentRequest>() {
        @Override
        public void write(JsonWriter out, AddDocumentRequest value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public AddDocumentRequest read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of AddDocumentRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AddDocumentRequest
   * @throws IOException if the JSON string is invalid with respect to AddDocumentRequest
   */
  public static AddDocumentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddDocumentRequest.class);
  }

  /**
   * Convert an instance of AddDocumentRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

