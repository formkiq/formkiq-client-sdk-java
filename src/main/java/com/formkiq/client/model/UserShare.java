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
 * The version of the OpenAPI document: 1.16.1 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import com.formkiq.client.model.UserSharePermission;
import com.formkiq.client.model.UserSharePermissionType;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.formkiq.client.invoker.JSON;

/**
 * UserShare
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2025-01-10T23:07:47.624119-06:00[America/Winnipeg]",
    comments = "Generator version: 7.10.0")
public class UserShare {
  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  @javax.annotation.Nullable
  private String group;

  public static final String SERIALIZED_NAME_SHARE_KEY = "shareKey";
  @SerializedName(SERIALIZED_NAME_SHARE_KEY)
  @javax.annotation.Nullable
  private String shareKey;

  /**
   * Type of Document
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    FOLDER("FOLDER");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private TypeEnum type;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  @javax.annotation.Nullable
  private List<UserSharePermission> permissions = new ArrayList<>();

  public static final String SERIALIZED_NAME_SITE_ID = "siteId";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  @javax.annotation.Nullable
  private String siteId;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  @javax.annotation.Nullable
  private String path;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  @javax.annotation.Nullable
  private String userId;

  public static final String SERIALIZED_NAME_PERMISSION_TYPE = "permissionType";
  @SerializedName(SERIALIZED_NAME_PERMISSION_TYPE)
  @javax.annotation.Nullable
  private UserSharePermissionType permissionType;

  public UserShare() {}

  public UserShare group(@javax.annotation.Nullable String group) {
    this.group = group;
    return this;
  }

  /**
   * Name of Share Group
   * 
   * @return group
   */
  @javax.annotation.Nullable
  public String getGroup() {
    return group;
  }

  public void setGroup(@javax.annotation.Nullable String group) {
    this.group = group;
  }


  public UserShare shareKey(@javax.annotation.Nullable String shareKey) {
    this.shareKey = shareKey;
    return this;
  }

  /**
   * Share Identifier
   * 
   * @return shareKey
   */
  @javax.annotation.Nullable
  public String getShareKey() {
    return shareKey;
  }

  public void setShareKey(@javax.annotation.Nullable String shareKey) {
    this.shareKey = shareKey;
  }


  public UserShare type(@javax.annotation.Nullable TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of Document
   * 
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable TypeEnum type) {
    this.type = type;
  }


  public UserShare permissions(@javax.annotation.Nullable List<UserSharePermission> permissions) {
    this.permissions = permissions;
    return this;
  }

  public UserShare addPermissionsItem(UserSharePermission permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * List of share permissions
   * 
   * @return permissions
   */
  @javax.annotation.Nullable
  public List<UserSharePermission> getPermissions() {
    return permissions;
  }

  public void setPermissions(@javax.annotation.Nullable List<UserSharePermission> permissions) {
    this.permissions = permissions;
  }


  public UserShare siteId(@javax.annotation.Nullable String siteId) {
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

  public void setSiteId(@javax.annotation.Nullable String siteId) {
    this.siteId = siteId;
  }


  public UserShare path(@javax.annotation.Nullable String path) {
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


  public UserShare userId(@javax.annotation.Nullable String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * User who created share
   * 
   * @return userId
   */
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }

  public void setUserId(@javax.annotation.Nullable String userId) {
    this.userId = userId;
  }


  public UserShare permissionType(
      @javax.annotation.Nullable UserSharePermissionType permissionType) {
    this.permissionType = permissionType;
    return this;
  }

  /**
   * Get permissionType
   * 
   * @return permissionType
   */
  @javax.annotation.Nullable
  public UserSharePermissionType getPermissionType() {
    return permissionType;
  }

  public void setPermissionType(@javax.annotation.Nullable UserSharePermissionType permissionType) {
    this.permissionType = permissionType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserShare userShare = (UserShare) o;
    return Objects.equals(this.group, userShare.group)
        && Objects.equals(this.shareKey, userShare.shareKey)
        && Objects.equals(this.type, userShare.type)
        && Objects.equals(this.permissions, userShare.permissions)
        && Objects.equals(this.siteId, userShare.siteId)
        && Objects.equals(this.path, userShare.path)
        && Objects.equals(this.userId, userShare.userId)
        && Objects.equals(this.permissionType, userShare.permissionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, shareKey, type, permissions, siteId, path, userId, permissionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserShare {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    shareKey: ").append(toIndentedString(shareKey)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    permissionType: ").append(toIndentedString(permissionType)).append("\n");
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
    openapiFields.add("group");
    openapiFields.add("shareKey");
    openapiFields.add("type");
    openapiFields.add("permissions");
    openapiFields.add("siteId");
    openapiFields.add("path");
    openapiFields.add("userId");
    openapiFields.add("permissionType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UserShare
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!UserShare.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is
                                                        // null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in UserShare is not found in the empty JSON string",
            UserShare.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!UserShare.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `UserShare` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("group") != null && !jsonObj.get("group").isJsonNull())
        && !jsonObj.get("group").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `group` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("group").toString()));
    }
    if ((jsonObj.get("shareKey") != null && !jsonObj.get("shareKey").isJsonNull())
        && !jsonObj.get("shareKey").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `shareKey` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("shareKey").toString()));
    }
    if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull())
        && !jsonObj.get("type").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `type` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("type").toString()));
    }
    // validate the optional field `type`
    if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
      TypeEnum.validateJsonElement(jsonObj.get("type"));
    }
    // ensure the optional json data is an array if present
    if (jsonObj.get("permissions") != null && !jsonObj.get("permissions").isJsonNull()
        && !jsonObj.get("permissions").isJsonArray()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `permissions` to be an array in the JSON string but got `%s`",
          jsonObj.get("permissions").toString()));
    }
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
    if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull())
        && !jsonObj.get("userId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `userId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("userId").toString()));
    }
    // validate the optional field `permissionType`
    if (jsonObj.get("permissionType") != null && !jsonObj.get("permissionType").isJsonNull()) {
      UserSharePermissionType.validateJsonElement(jsonObj.get("permissionType"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!UserShare.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'UserShare' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<UserShare> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(UserShare.class));

      return (TypeAdapter<T>) new TypeAdapter<UserShare>() {
        @Override
        public void write(JsonWriter out, UserShare value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public UserShare read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of UserShare given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UserShare
   * @throws IOException if the JSON string is invalid with respect to UserShare
   */
  public static UserShare fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserShare.class);
  }

  /**
   * Convert an instance of UserShare to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

