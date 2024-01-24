/*
 * FormKiQ HTTP API Formkiq API: Document Management Platform API using OAuth(JWT) Authentication
 * You can find out more about FormKiQ at [https://formkiq.com](http://formkiq.com). ## Introduction
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
 * The version of the OpenAPI document: 1.13.0 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import com.formkiq.client.model.DocumentCompositeSearchTag;
import com.formkiq.client.model.DocumentSearchMeta;
import com.formkiq.client.model.DocumentSearchTag;
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
 * Document tag search criteria
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-01-23T19:44:28.335991-06:00[America/Winnipeg]")
public class DocumentSearch {
  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private DocumentSearchMeta meta;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private DocumentSearchTag tag;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<DocumentCompositeSearchTag> tags;

  public static final String SERIALIZED_NAME_DOCUMENT_IDS = "documentIds";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_IDS)
  private List<String> documentIds;

  public DocumentSearch() {}

  public DocumentSearch text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Full text search
   * 
   * @return text
   **/
  @javax.annotation.Nullable
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  public DocumentSearch meta(DocumentSearchMeta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * 
   * @return meta
   **/
  @javax.annotation.Nullable
  public DocumentSearchMeta getMeta() {
    return meta;
  }

  public void setMeta(DocumentSearchMeta meta) {
    this.meta = meta;
  }


  public DocumentSearch tag(DocumentSearchTag tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Get tag
   * 
   * @return tag
   **/
  @javax.annotation.Nullable
  public DocumentSearchTag getTag() {
    return tag;
  }

  public void setTag(DocumentSearchTag tag) {
    this.tag = tag;
  }


  public DocumentSearch tags(List<DocumentCompositeSearchTag> tags) {
    this.tags = tags;
    return this;
  }

  public DocumentSearch addTagsItem(DocumentCompositeSearchTag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * List of Composite Key tags to filter search results on
   * 
   * @return tags
   **/
  @javax.annotation.Nullable
  public List<DocumentCompositeSearchTag> getTags() {
    return tags;
  }

  public void setTags(List<DocumentCompositeSearchTag> tags) {
    this.tags = tags;
  }


  public DocumentSearch documentIds(List<String> documentIds) {
    this.documentIds = documentIds;
    return this;
  }

  public DocumentSearch addDocumentIdsItem(String documentIdsItem) {
    if (this.documentIds == null) {
      this.documentIds = new ArrayList<>();
    }
    this.documentIds.add(documentIdsItem);
    return this;
  }

  /**
   * List of DocumentIds to filter search results on
   * 
   * @return documentIds
   **/
  @javax.annotation.Nullable
  public List<String> getDocumentIds() {
    return documentIds;
  }

  public void setDocumentIds(List<String> documentIds) {
    this.documentIds = documentIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentSearch documentSearch = (DocumentSearch) o;
    return Objects.equals(this.text, documentSearch.text)
        && Objects.equals(this.meta, documentSearch.meta)
        && Objects.equals(this.tag, documentSearch.tag)
        && Objects.equals(this.tags, documentSearch.tags)
        && Objects.equals(this.documentIds, documentSearch.documentIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, meta, tag, tags, documentIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentSearch {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    documentIds: ").append(toIndentedString(documentIds)).append("\n");
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
    openapiFields.add("text");
    openapiFields.add("meta");
    openapiFields.add("tag");
    openapiFields.add("tags");
    openapiFields.add("documentIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocumentSearch
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!DocumentSearch.openapiRequiredFields.isEmpty()) { // has required fields but JSON element
                                                             // is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in DocumentSearch is not found in the empty JSON string",
            DocumentSearch.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!DocumentSearch.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `DocumentSearch` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull())
        && !jsonObj.get("text").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `text` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("text").toString()));
    }
    // validate the optional field `meta`
    if (jsonObj.get("meta") != null && !jsonObj.get("meta").isJsonNull()) {
      DocumentSearchMeta.validateJsonElement(jsonObj.get("meta"));
    }
    // validate the optional field `tag`
    if (jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) {
      DocumentSearchTag.validateJsonElement(jsonObj.get("tag"));
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
          DocumentCompositeSearchTag.validateJsonElement(jsonArraytags.get(i));
        } ;
      }
    }
    // ensure the optional json data is an array if present
    if (jsonObj.get("documentIds") != null && !jsonObj.get("documentIds").isJsonNull()
        && !jsonObj.get("documentIds").isJsonArray()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `documentIds` to be an array in the JSON string but got `%s`",
          jsonObj.get("documentIds").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!DocumentSearch.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'DocumentSearch' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<DocumentSearch> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(DocumentSearch.class));

      return (TypeAdapter<T>) new TypeAdapter<DocumentSearch>() {
        @Override
        public void write(JsonWriter out, DocumentSearch value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public DocumentSearch read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of DocumentSearch given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocumentSearch
   * @throws IOException if the JSON string is invalid with respect to DocumentSearch
   */
  public static DocumentSearch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentSearch.class);
  }

  /**
   * Convert an instance of DocumentSearch to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

