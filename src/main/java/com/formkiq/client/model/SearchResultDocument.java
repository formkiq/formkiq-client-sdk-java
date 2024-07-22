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
 * The version of the OpenAPI document: 1.15.1 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import com.formkiq.client.model.DocumentMetadata;
import com.formkiq.client.model.DocumentSearchMatchAttribute;
import com.formkiq.client.model.DocumentSearchMatchTag;
import com.formkiq.client.model.SearchResultDocumentAttribute;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.formkiq.client.invoker.JSON;

/**
 * SearchResultDocument
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-07-21T21:52:14.648567-05:00[America/Winnipeg]",
    comments = "Generator version: 7.7.0")
public class SearchResultDocument {
  public static final String SERIALIZED_NAME_SITE_ID = "siteId";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private String siteId;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_DEEP_LINK_PATH = "deepLinkPath";
  @SerializedName(SERIALIZED_NAME_DEEP_LINK_PATH)
  private String deepLinkPath;

  public static final String SERIALIZED_NAME_INSERTED_DATE = "insertedDate";
  @SerializedName(SERIALIZED_NAME_INSERTED_DATE)
  private String insertedDate;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_DATE = "lastModifiedDate";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_DATE)
  private String lastModifiedDate;

  public static final String SERIALIZED_NAME_FOLDER = "folder";
  @SerializedName(SERIALIZED_NAME_FOLDER)
  private Boolean folder;

  public static final String SERIALIZED_NAME_INDEX_KEY = "indexKey";
  @SerializedName(SERIALIZED_NAME_INDEX_KEY)
  private String indexKey;

  public static final String SERIALIZED_NAME_CHECKSUM = "checksum";
  @SerializedName(SERIALIZED_NAME_CHECKSUM)
  private String checksum;

  public static final String SERIALIZED_NAME_DOCUMENT_ID = "documentId";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_ID)
  private String documentId;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "contentType";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_CONTENT_LENGTH = "contentLength";
  @SerializedName(SERIALIZED_NAME_CONTENT_LENGTH)
  private Integer contentLength;

  public static final String SERIALIZED_NAME_VERSION_ID = "versionId";
  @SerializedName(SERIALIZED_NAME_VERSION_ID)
  private String versionId;

  public static final String SERIALIZED_NAME_BELONGS_TO_DOCUMENT_ID = "belongsToDocumentId";
  @SerializedName(SERIALIZED_NAME_BELONGS_TO_DOCUMENT_ID)
  private String belongsToDocumentId;

  public static final String SERIALIZED_NAME_MATCHED_ATTRIBUTE = "matchedAttribute";
  @SerializedName(SERIALIZED_NAME_MATCHED_ATTRIBUTE)
  private DocumentSearchMatchAttribute matchedAttribute;

  public static final String SERIALIZED_NAME_MATCHED_TAG = "matchedTag";
  @SerializedName(SERIALIZED_NAME_MATCHED_TAG)
  private DocumentSearchMatchTag matchedTag;

  public static final String SERIALIZED_NAME_MATCHED_TAGS = "matchedTags";
  @SerializedName(SERIALIZED_NAME_MATCHED_TAGS)
  private List<DocumentSearchMatchTag> matchedTags = new ArrayList<>();

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, Object> tags = new HashMap<>();

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, SearchResultDocumentAttribute> attributes = new HashMap<>();

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private List<DocumentMetadata> metadata = new ArrayList<>();

  public SearchResultDocument() {}

  public SearchResultDocument siteId(String siteId) {
    this.siteId = siteId;
    return this;
  }

  /**
   * Site Identifier
   * 
   * @return siteId
   */
  @javax.annotation.Nullable
  public String getSiteId() {
    return siteId;
  }

  public void setSiteId(String siteId) {
    this.siteId = siteId;
  }


  public SearchResultDocument path(String path) {
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


  public SearchResultDocument deepLinkPath(String deepLinkPath) {
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


  public SearchResultDocument insertedDate(String insertedDate) {
    this.insertedDate = insertedDate;
    return this;
  }

  /**
   * Inserted Timestamp
   * 
   * @return insertedDate
   */
  @javax.annotation.Nullable
  public String getInsertedDate() {
    return insertedDate;
  }

  public void setInsertedDate(String insertedDate) {
    this.insertedDate = insertedDate;
  }


  public SearchResultDocument lastModifiedDate(String lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

  /**
   * Last Modified Timestamp
   * 
   * @return lastModifiedDate
   */
  @javax.annotation.Nullable
  public String getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(String lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }


  public SearchResultDocument folder(Boolean folder) {
    this.folder = folder;
    return this;
  }

  /**
   * Is Result a Document Folder
   * 
   * @return folder
   */
  @javax.annotation.Nullable
  public Boolean getFolder() {
    return folder;
  }

  public void setFolder(Boolean folder) {
    this.folder = folder;
  }


  public SearchResultDocument indexKey(String indexKey) {
    this.indexKey = indexKey;
    return this;
  }

  /**
   * populated if search result are from an index
   * 
   * @return indexKey
   */
  @javax.annotation.Nullable
  public String getIndexKey() {
    return indexKey;
  }

  public void setIndexKey(String indexKey) {
    this.indexKey = indexKey;
  }


  public SearchResultDocument checksum(String checksum) {
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

  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }


  public SearchResultDocument documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Document Identifier
   * 
   * @return documentId
   */
  @javax.annotation.Nullable
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }


  public SearchResultDocument contentType(String contentType) {
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


  public SearchResultDocument userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * User who added document
   * 
   * @return userId
   */
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public SearchResultDocument contentLength(Integer contentLength) {
    this.contentLength = contentLength;
    return this;
  }

  /**
   * Document size
   * 
   * @return contentLength
   */
  @javax.annotation.Nullable
  public Integer getContentLength() {
    return contentLength;
  }

  public void setContentLength(Integer contentLength) {
    this.contentLength = contentLength;
  }


  public SearchResultDocument versionId(String versionId) {
    this.versionId = versionId;
    return this;
  }

  /**
   * Document version
   * 
   * @return versionId
   */
  @javax.annotation.Nullable
  public String getVersionId() {
    return versionId;
  }

  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }


  public SearchResultDocument belongsToDocumentId(String belongsToDocumentId) {
    this.belongsToDocumentId = belongsToDocumentId;
    return this;
  }

  /**
   * Parent Document Identifier
   * 
   * @return belongsToDocumentId
   */
  @javax.annotation.Nullable
  public String getBelongsToDocumentId() {
    return belongsToDocumentId;
  }

  public void setBelongsToDocumentId(String belongsToDocumentId) {
    this.belongsToDocumentId = belongsToDocumentId;
  }


  public SearchResultDocument matchedAttribute(DocumentSearchMatchAttribute matchedAttribute) {
    this.matchedAttribute = matchedAttribute;
    return this;
  }

  /**
   * Get matchedAttribute
   * 
   * @return matchedAttribute
   */
  @javax.annotation.Nullable
  public DocumentSearchMatchAttribute getMatchedAttribute() {
    return matchedAttribute;
  }

  public void setMatchedAttribute(DocumentSearchMatchAttribute matchedAttribute) {
    this.matchedAttribute = matchedAttribute;
  }


  public SearchResultDocument matchedTag(DocumentSearchMatchTag matchedTag) {
    this.matchedTag = matchedTag;
    return this;
  }

  /**
   * Get matchedTag
   * 
   * @return matchedTag
   */
  @javax.annotation.Nullable
  public DocumentSearchMatchTag getMatchedTag() {
    return matchedTag;
  }

  public void setMatchedTag(DocumentSearchMatchTag matchedTag) {
    this.matchedTag = matchedTag;
  }


  public SearchResultDocument matchedTags(List<DocumentSearchMatchTag> matchedTags) {
    this.matchedTags = matchedTags;
    return this;
  }

  public SearchResultDocument addMatchedTagsItem(DocumentSearchMatchTag matchedTagsItem) {
    if (this.matchedTags == null) {
      this.matchedTags = new ArrayList<>();
    }
    this.matchedTags.add(matchedTagsItem);
    return this;
  }

  /**
   * Get matchedTags
   * 
   * @return matchedTags
   */
  @javax.annotation.Nullable
  public List<DocumentSearchMatchTag> getMatchedTags() {
    return matchedTags;
  }

  public void setMatchedTags(List<DocumentSearchMatchTag> matchedTags) {
    this.matchedTags = matchedTags;
  }


  public SearchResultDocument tags(Map<String, Object> tags) {
    this.tags = tags;
    return this;
  }

  public SearchResultDocument putTagsItem(String key, Object tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

  /**
   * Get tags
   * 
   * @return tags
   */
  @javax.annotation.Nullable
  public Map<String, Object> getTags() {
    return tags;
  }

  public void setTags(Map<String, Object> tags) {
    this.tags = tags;
  }


  public SearchResultDocument attributes(Map<String, SearchResultDocumentAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public SearchResultDocument putAttributesItem(String key,
      SearchResultDocumentAttribute attributesItem) {
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
  public Map<String, SearchResultDocumentAttribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, SearchResultDocumentAttribute> attributes) {
    this.attributes = attributes;
  }


  public SearchResultDocument metadata(List<DocumentMetadata> metadata) {
    this.metadata = metadata;
    return this;
  }

  public SearchResultDocument addMetadataItem(DocumentMetadata metadataItem) {
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
  public List<DocumentMetadata> getMetadata() {
    return metadata;
  }

  public void setMetadata(List<DocumentMetadata> metadata) {
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
    SearchResultDocument searchResultDocument = (SearchResultDocument) o;
    return Objects.equals(this.siteId, searchResultDocument.siteId)
        && Objects.equals(this.path, searchResultDocument.path)
        && Objects.equals(this.deepLinkPath, searchResultDocument.deepLinkPath)
        && Objects.equals(this.insertedDate, searchResultDocument.insertedDate)
        && Objects.equals(this.lastModifiedDate, searchResultDocument.lastModifiedDate)
        && Objects.equals(this.folder, searchResultDocument.folder)
        && Objects.equals(this.indexKey, searchResultDocument.indexKey)
        && Objects.equals(this.checksum, searchResultDocument.checksum)
        && Objects.equals(this.documentId, searchResultDocument.documentId)
        && Objects.equals(this.contentType, searchResultDocument.contentType)
        && Objects.equals(this.userId, searchResultDocument.userId)
        && Objects.equals(this.contentLength, searchResultDocument.contentLength)
        && Objects.equals(this.versionId, searchResultDocument.versionId)
        && Objects.equals(this.belongsToDocumentId, searchResultDocument.belongsToDocumentId)
        && Objects.equals(this.matchedAttribute, searchResultDocument.matchedAttribute)
        && Objects.equals(this.matchedTag, searchResultDocument.matchedTag)
        && Objects.equals(this.matchedTags, searchResultDocument.matchedTags)
        && Objects.equals(this.tags, searchResultDocument.tags)
        && Objects.equals(this.attributes, searchResultDocument.attributes)
        && Objects.equals(this.metadata, searchResultDocument.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siteId, path, deepLinkPath, insertedDate, lastModifiedDate, folder,
        indexKey, checksum, documentId, contentType, userId, contentLength, versionId,
        belongsToDocumentId, matchedAttribute, matchedTag, matchedTags, tags, attributes, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResultDocument {\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    deepLinkPath: ").append(toIndentedString(deepLinkPath)).append("\n");
    sb.append("    insertedDate: ").append(toIndentedString(insertedDate)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    indexKey: ").append(toIndentedString(indexKey)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
    sb.append("    belongsToDocumentId: ").append(toIndentedString(belongsToDocumentId))
        .append("\n");
    sb.append("    matchedAttribute: ").append(toIndentedString(matchedAttribute)).append("\n");
    sb.append("    matchedTag: ").append(toIndentedString(matchedTag)).append("\n");
    sb.append("    matchedTags: ").append(toIndentedString(matchedTags)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
    openapiFields.add("siteId");
    openapiFields.add("path");
    openapiFields.add("deepLinkPath");
    openapiFields.add("insertedDate");
    openapiFields.add("lastModifiedDate");
    openapiFields.add("folder");
    openapiFields.add("indexKey");
    openapiFields.add("checksum");
    openapiFields.add("documentId");
    openapiFields.add("contentType");
    openapiFields.add("userId");
    openapiFields.add("contentLength");
    openapiFields.add("versionId");
    openapiFields.add("belongsToDocumentId");
    openapiFields.add("matchedAttribute");
    openapiFields.add("matchedTag");
    openapiFields.add("matchedTags");
    openapiFields.add("tags");
    openapiFields.add("attributes");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SearchResultDocument
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!SearchResultDocument.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                   // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in SearchResultDocument is not found in the empty JSON string",
            SearchResultDocument.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!SearchResultDocument.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `SearchResultDocument` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("siteId") != null && !jsonObj.get("siteId").isJsonNull())
        && !jsonObj.get("siteId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `siteId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("siteId").toString()));
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
    if ((jsonObj.get("insertedDate") != null && !jsonObj.get("insertedDate").isJsonNull())
        && !jsonObj.get("insertedDate").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `insertedDate` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("insertedDate").toString()));
    }
    if ((jsonObj.get("lastModifiedDate") != null && !jsonObj.get("lastModifiedDate").isJsonNull())
        && !jsonObj.get("lastModifiedDate").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `lastModifiedDate` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("lastModifiedDate").toString()));
    }
    if ((jsonObj.get("indexKey") != null && !jsonObj.get("indexKey").isJsonNull())
        && !jsonObj.get("indexKey").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `indexKey` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("indexKey").toString()));
    }
    if ((jsonObj.get("checksum") != null && !jsonObj.get("checksum").isJsonNull())
        && !jsonObj.get("checksum").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `checksum` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("checksum").toString()));
    }
    if ((jsonObj.get("documentId") != null && !jsonObj.get("documentId").isJsonNull())
        && !jsonObj.get("documentId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `documentId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("documentId").toString()));
    }
    if ((jsonObj.get("contentType") != null && !jsonObj.get("contentType").isJsonNull())
        && !jsonObj.get("contentType").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `contentType` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("contentType").toString()));
    }
    if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull())
        && !jsonObj.get("userId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `userId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("userId").toString()));
    }
    if ((jsonObj.get("versionId") != null && !jsonObj.get("versionId").isJsonNull())
        && !jsonObj.get("versionId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `versionId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("versionId").toString()));
    }
    if ((jsonObj.get("belongsToDocumentId") != null
        && !jsonObj.get("belongsToDocumentId").isJsonNull())
        && !jsonObj.get("belongsToDocumentId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `belongsToDocumentId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("belongsToDocumentId").toString()));
    }
    // validate the optional field `matchedAttribute`
    if (jsonObj.get("matchedAttribute") != null && !jsonObj.get("matchedAttribute").isJsonNull()) {
      DocumentSearchMatchAttribute.validateJsonElement(jsonObj.get("matchedAttribute"));
    }
    // validate the optional field `matchedTag`
    if (jsonObj.get("matchedTag") != null && !jsonObj.get("matchedTag").isJsonNull()) {
      DocumentSearchMatchTag.validateJsonElement(jsonObj.get("matchedTag"));
    }
    if (jsonObj.get("matchedTags") != null && !jsonObj.get("matchedTags").isJsonNull()) {
      JsonArray jsonArraymatchedTags = jsonObj.getAsJsonArray("matchedTags");
      if (jsonArraymatchedTags != null) {
        // ensure the json data is an array
        if (!jsonObj.get("matchedTags").isJsonArray()) {
          throw new IllegalArgumentException(String.format(
              "Expected the field `matchedTags` to be an array in the JSON string but got `%s`",
              jsonObj.get("matchedTags").toString()));
        }

        // validate the optional field `matchedTags` (array)
        for (int i = 0; i < jsonArraymatchedTags.size(); i++) {
          DocumentSearchMatchTag.validateJsonElement(jsonArraymatchedTags.get(i));
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
          DocumentMetadata.validateJsonElement(jsonArraymetadata.get(i));
        } ;
      }
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!SearchResultDocument.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'SearchResultDocument' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<SearchResultDocument> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(SearchResultDocument.class));

      return (TypeAdapter<T>) new TypeAdapter<SearchResultDocument>() {
        @Override
        public void write(JsonWriter out, SearchResultDocument value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public SearchResultDocument read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of SearchResultDocument given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SearchResultDocument
   * @throws IOException if the JSON string is invalid with respect to SearchResultDocument
   */
  public static SearchResultDocument fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchResultDocument.class);
  }

  /**
   * Convert an instance of SearchResultDocument to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

