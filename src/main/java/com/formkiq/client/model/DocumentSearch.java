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
import com.formkiq.client.model.DocumentSearchItemMeta;
import com.formkiq.client.model.DocumentSearchItemTag;
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
 * Document tag search criteria
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-13T16:50:34.870897-05:00[America/Winnipeg]")
public class DocumentSearch {
  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private DocumentSearchItemMeta meta;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private DocumentSearchItemTag tag;

  public static final String SERIALIZED_NAME_DOCUMENT_IDS = "documentIds";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_IDS)
  private List<String> documentIds;

  public DocumentSearch() {
  }

  public DocumentSearch text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Full text search
   * @return text
  **/
  @javax.annotation.Nullable
  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public DocumentSearch meta(DocumentSearchItemMeta meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  public DocumentSearchItemMeta getMeta() {
    return meta;
  }


  public void setMeta(DocumentSearchItemMeta meta) {
    this.meta = meta;
  }


  public DocumentSearch tag(DocumentSearchItemTag tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @javax.annotation.Nullable
  public DocumentSearchItemTag getTag() {
    return tag;
  }


  public void setTag(DocumentSearchItemTag tag) {
    this.tag = tag;
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
    return Objects.equals(this.text, documentSearch.text) &&
        Objects.equals(this.meta, documentSearch.meta) &&
        Objects.equals(this.tag, documentSearch.tag) &&
        Objects.equals(this.documentIds, documentSearch.documentIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, meta, tag, documentIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentSearch {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    documentIds: ").append(toIndentedString(documentIds)).append("\n");
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
    openapiFields.add("text");
    openapiFields.add("meta");
    openapiFields.add("tag");
    openapiFields.add("documentIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DocumentSearch
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DocumentSearch.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentSearch is not found in the empty JSON string", DocumentSearch.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DocumentSearch.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DocumentSearch` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      // validate the optional field `meta`
      if (jsonObj.get("meta") != null && !jsonObj.get("meta").isJsonNull()) {
        DocumentSearchItemMeta.validateJsonObject(jsonObj.getAsJsonObject("meta"));
      }
      // validate the optional field `tag`
      if (jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) {
        DocumentSearchItemTag.validateJsonObject(jsonObj.getAsJsonObject("tag"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("documentIds") != null && !jsonObj.get("documentIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentIds` to be an array in the JSON string but got `%s`", jsonObj.get("documentIds").toString()));
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
       final TypeAdapter<DocumentSearch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentSearch.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentSearch>() {
           @Override
           public void write(JsonWriter out, DocumentSearch value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentSearch read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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

