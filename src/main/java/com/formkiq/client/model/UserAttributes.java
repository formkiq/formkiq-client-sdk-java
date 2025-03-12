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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
 * UserAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2025-03-12T17:15:14.870440-05:00[America/Winnipeg]",
    comments = "Generator version: 7.12.0")
public class UserAttributes {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  @javax.annotation.Nullable
  private String address;

  public static final String SERIALIZED_NAME_BIRTHDATE = "birthdate";
  @SerializedName(SERIALIZED_NAME_BIRTHDATE)
  @javax.annotation.Nullable
  private String birthdate;

  public static final String SERIALIZED_NAME_FAMILY_NAME = "familyName";
  @SerializedName(SERIALIZED_NAME_FAMILY_NAME)
  @javax.annotation.Nullable
  private String familyName;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  @javax.annotation.Nullable
  private String gender;

  public static final String SERIALIZED_NAME_GIVEN_NAME = "givenName";
  @SerializedName(SERIALIZED_NAME_GIVEN_NAME)
  @javax.annotation.Nullable
  private String givenName;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  @javax.annotation.Nullable
  private String locale;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middleName";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  @javax.annotation.Nullable
  private String middleName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_NICKNAME = "nickname";
  @SerializedName(SERIALIZED_NAME_NICKNAME)
  @javax.annotation.Nullable
  private String nickname;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  @javax.annotation.Nullable
  private String phoneNumber;

  public static final String SERIALIZED_NAME_PICTURE = "picture";
  @SerializedName(SERIALIZED_NAME_PICTURE)
  @javax.annotation.Nullable
  private String picture;

  public static final String SERIALIZED_NAME_PREFERRED_USERNAME = "preferredUsername";
  @SerializedName(SERIALIZED_NAME_PREFERRED_USERNAME)
  @javax.annotation.Nullable
  private String preferredUsername;

  public static final String SERIALIZED_NAME_PROFILE = "profile";
  @SerializedName(SERIALIZED_NAME_PROFILE)
  @javax.annotation.Nullable
  private String profile;

  public static final String SERIALIZED_NAME_ZONEINFO = "zoneinfo";
  @SerializedName(SERIALIZED_NAME_ZONEINFO)
  @javax.annotation.Nullable
  private String zoneinfo;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nullable
  private String updatedAt;

  public static final String SERIALIZED_NAME_WEBSITE = "website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  @javax.annotation.Nullable
  private String website;

  public UserAttributes() {}

  public UserAttributes address(@javax.annotation.Nullable String address) {
    this.address = address;
    return this;
  }

  /**
   * Address of user
   * 
   * @return address
   */
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }

  public void setAddress(@javax.annotation.Nullable String address) {
    this.address = address;
  }


  public UserAttributes birthdate(@javax.annotation.Nullable String birthdate) {
    this.birthdate = birthdate;
    return this;
  }

  /**
   * Birthdate of user
   * 
   * @return birthdate
   */
  @javax.annotation.Nullable
  public String getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(@javax.annotation.Nullable String birthdate) {
    this.birthdate = birthdate;
  }


  public UserAttributes familyName(@javax.annotation.Nullable String familyName) {
    this.familyName = familyName;
    return this;
  }

  /**
   * Family name of user
   * 
   * @return familyName
   */
  @javax.annotation.Nullable
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(@javax.annotation.Nullable String familyName) {
    this.familyName = familyName;
  }


  public UserAttributes gender(@javax.annotation.Nullable String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Gender of user
   * 
   * @return gender
   */
  @javax.annotation.Nullable
  public String getGender() {
    return gender;
  }

  public void setGender(@javax.annotation.Nullable String gender) {
    this.gender = gender;
  }


  public UserAttributes givenName(@javax.annotation.Nullable String givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * Given name of user
   * 
   * @return givenName
   */
  @javax.annotation.Nullable
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(@javax.annotation.Nullable String givenName) {
    this.givenName = givenName;
  }


  public UserAttributes locale(@javax.annotation.Nullable String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Locale of user
   * 
   * @return locale
   */
  @javax.annotation.Nullable
  public String getLocale() {
    return locale;
  }

  public void setLocale(@javax.annotation.Nullable String locale) {
    this.locale = locale;
  }


  public UserAttributes middleName(@javax.annotation.Nullable String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Middle name of user
   * 
   * @return middleName
   */
  @javax.annotation.Nullable
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(@javax.annotation.Nullable String middleName) {
    this.middleName = middleName;
  }


  public UserAttributes name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of user
   * 
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public UserAttributes nickname(@javax.annotation.Nullable String nickname) {
    this.nickname = nickname;
    return this;
  }

  /**
   * Nickname of user
   * 
   * @return nickname
   */
  @javax.annotation.Nullable
  public String getNickname() {
    return nickname;
  }

  public void setNickname(@javax.annotation.Nullable String nickname) {
    this.nickname = nickname;
  }


  public UserAttributes phoneNumber(@javax.annotation.Nullable String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Phone number of user
   * 
   * @return phoneNumber
   */
  @javax.annotation.Nullable
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(@javax.annotation.Nullable String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public UserAttributes picture(@javax.annotation.Nullable String picture) {
    this.picture = picture;
    return this;
  }

  /**
   * Picture of user
   * 
   * @return picture
   */
  @javax.annotation.Nullable
  public String getPicture() {
    return picture;
  }

  public void setPicture(@javax.annotation.Nullable String picture) {
    this.picture = picture;
  }


  public UserAttributes preferredUsername(@javax.annotation.Nullable String preferredUsername) {
    this.preferredUsername = preferredUsername;
    return this;
  }

  /**
   * Preferred username of user
   * 
   * @return preferredUsername
   */
  @javax.annotation.Nullable
  public String getPreferredUsername() {
    return preferredUsername;
  }

  public void setPreferredUsername(@javax.annotation.Nullable String preferredUsername) {
    this.preferredUsername = preferredUsername;
  }


  public UserAttributes profile(@javax.annotation.Nullable String profile) {
    this.profile = profile;
    return this;
  }

  /**
   * Profile of user
   * 
   * @return profile
   */
  @javax.annotation.Nullable
  public String getProfile() {
    return profile;
  }

  public void setProfile(@javax.annotation.Nullable String profile) {
    this.profile = profile;
  }


  public UserAttributes zoneinfo(@javax.annotation.Nullable String zoneinfo) {
    this.zoneinfo = zoneinfo;
    return this;
  }

  /**
   * Zoneinfo of user
   * 
   * @return zoneinfo
   */
  @javax.annotation.Nullable
  public String getZoneinfo() {
    return zoneinfo;
  }

  public void setZoneinfo(@javax.annotation.Nullable String zoneinfo) {
    this.zoneinfo = zoneinfo;
  }


  public UserAttributes updatedAt(@javax.annotation.Nullable String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Updated at date of user
   * 
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@javax.annotation.Nullable String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public UserAttributes website(@javax.annotation.Nullable String website) {
    this.website = website;
    return this;
  }

  /**
   * Website of user
   * 
   * @return website
   */
  @javax.annotation.Nullable
  public String getWebsite() {
    return website;
  }

  public void setWebsite(@javax.annotation.Nullable String website) {
    this.website = website;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAttributes userAttributes = (UserAttributes) o;
    return Objects.equals(this.address, userAttributes.address)
        && Objects.equals(this.birthdate, userAttributes.birthdate)
        && Objects.equals(this.familyName, userAttributes.familyName)
        && Objects.equals(this.gender, userAttributes.gender)
        && Objects.equals(this.givenName, userAttributes.givenName)
        && Objects.equals(this.locale, userAttributes.locale)
        && Objects.equals(this.middleName, userAttributes.middleName)
        && Objects.equals(this.name, userAttributes.name)
        && Objects.equals(this.nickname, userAttributes.nickname)
        && Objects.equals(this.phoneNumber, userAttributes.phoneNumber)
        && Objects.equals(this.picture, userAttributes.picture)
        && Objects.equals(this.preferredUsername, userAttributes.preferredUsername)
        && Objects.equals(this.profile, userAttributes.profile)
        && Objects.equals(this.zoneinfo, userAttributes.zoneinfo)
        && Objects.equals(this.updatedAt, userAttributes.updatedAt)
        && Objects.equals(this.website, userAttributes.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, birthdate, familyName, gender, givenName, locale, middleName, name,
        nickname, phoneNumber, picture, preferredUsername, profile, zoneinfo, updatedAt, website);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAttributes {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    birthdate: ").append(toIndentedString(birthdate)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("    preferredUsername: ").append(toIndentedString(preferredUsername)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    zoneinfo: ").append(toIndentedString(zoneinfo)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("birthdate");
    openapiFields.add("familyName");
    openapiFields.add("gender");
    openapiFields.add("givenName");
    openapiFields.add("locale");
    openapiFields.add("middleName");
    openapiFields.add("name");
    openapiFields.add("nickname");
    openapiFields.add("phoneNumber");
    openapiFields.add("picture");
    openapiFields.add("preferredUsername");
    openapiFields.add("profile");
    openapiFields.add("zoneinfo");
    openapiFields.add("updatedAt");
    openapiFields.add("website");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UserAttributes
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!UserAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element
                                                             // is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in UserAttributes is not found in the empty JSON string",
            UserAttributes.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!UserAttributes.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `UserAttributes` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull())
        && !jsonObj.get("address").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `address` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("address").toString()));
    }
    if ((jsonObj.get("birthdate") != null && !jsonObj.get("birthdate").isJsonNull())
        && !jsonObj.get("birthdate").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `birthdate` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("birthdate").toString()));
    }
    if ((jsonObj.get("familyName") != null && !jsonObj.get("familyName").isJsonNull())
        && !jsonObj.get("familyName").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `familyName` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("familyName").toString()));
    }
    if ((jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull())
        && !jsonObj.get("gender").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `gender` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("gender").toString()));
    }
    if ((jsonObj.get("givenName") != null && !jsonObj.get("givenName").isJsonNull())
        && !jsonObj.get("givenName").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `givenName` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("givenName").toString()));
    }
    if ((jsonObj.get("locale") != null && !jsonObj.get("locale").isJsonNull())
        && !jsonObj.get("locale").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `locale` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("locale").toString()));
    }
    if ((jsonObj.get("middleName") != null && !jsonObj.get("middleName").isJsonNull())
        && !jsonObj.get("middleName").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `middleName` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("middleName").toString()));
    }
    if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull())
        && !jsonObj.get("name").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `name` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("name").toString()));
    }
    if ((jsonObj.get("nickname") != null && !jsonObj.get("nickname").isJsonNull())
        && !jsonObj.get("nickname").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `nickname` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("nickname").toString()));
    }
    if ((jsonObj.get("phoneNumber") != null && !jsonObj.get("phoneNumber").isJsonNull())
        && !jsonObj.get("phoneNumber").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `phoneNumber` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("phoneNumber").toString()));
    }
    if ((jsonObj.get("picture") != null && !jsonObj.get("picture").isJsonNull())
        && !jsonObj.get("picture").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `picture` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("picture").toString()));
    }
    if ((jsonObj.get("preferredUsername") != null && !jsonObj.get("preferredUsername").isJsonNull())
        && !jsonObj.get("preferredUsername").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `preferredUsername` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("preferredUsername").toString()));
    }
    if ((jsonObj.get("profile") != null && !jsonObj.get("profile").isJsonNull())
        && !jsonObj.get("profile").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `profile` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("profile").toString()));
    }
    if ((jsonObj.get("zoneinfo") != null && !jsonObj.get("zoneinfo").isJsonNull())
        && !jsonObj.get("zoneinfo").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `zoneinfo` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("zoneinfo").toString()));
    }
    if ((jsonObj.get("updatedAt") != null && !jsonObj.get("updatedAt").isJsonNull())
        && !jsonObj.get("updatedAt").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `updatedAt` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("updatedAt").toString()));
    }
    if ((jsonObj.get("website") != null && !jsonObj.get("website").isJsonNull())
        && !jsonObj.get("website").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `website` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("website").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!UserAttributes.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'UserAttributes' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<UserAttributes> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(UserAttributes.class));

      return (TypeAdapter<T>) new TypeAdapter<UserAttributes>() {
        @Override
        public void write(JsonWriter out, UserAttributes value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public UserAttributes read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of UserAttributes given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UserAttributes
   * @throws IOException if the JSON string is invalid with respect to UserAttributes
   */
  public static UserAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserAttributes.class);
  }

  /**
   * Convert an instance of UserAttributes to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

