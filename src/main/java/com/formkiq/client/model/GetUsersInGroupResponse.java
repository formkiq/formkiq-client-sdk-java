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
 * The version of the OpenAPI document: 1.17.1 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import com.formkiq.client.model.User;
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
 * GetUsersInGroupResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2025-05-20T14:44:33.741519-05:00[America/Winnipeg]",
    comments = "Generator version: 7.13.0")
public class GetUsersInGroupResponse {
  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  @javax.annotation.Nullable
  private String next;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  @javax.annotation.Nullable
  private List<User> users = new ArrayList<>();

  public GetUsersInGroupResponse() {}

  public GetUsersInGroupResponse next(@javax.annotation.Nullable String next) {
    this.next = next;
    return this;
  }

  /**
   * Next page of results token
   * 
   * @return next
   */
  @javax.annotation.Nullable
  public String getNext() {
    return next;
  }

  public void setNext(@javax.annotation.Nullable String next) {
    this.next = next;
  }


  public GetUsersInGroupResponse users(@javax.annotation.Nullable List<User> users) {
    this.users = users;
    return this;
  }

  public GetUsersInGroupResponse addUsersItem(User usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * List of users
   * 
   * @return users
   */
  @javax.annotation.Nullable
  public List<User> getUsers() {
    return users;
  }

  public void setUsers(@javax.annotation.Nullable List<User> users) {
    this.users = users;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUsersInGroupResponse getUsersInGroupResponse = (GetUsersInGroupResponse) o;
    return Objects.equals(this.next, getUsersInGroupResponse.next)
        && Objects.equals(this.users, getUsersInGroupResponse.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(next, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUsersInGroupResponse {\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
    openapiFields.add("next");
    openapiFields.add("users");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetUsersInGroupResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!GetUsersInGroupResponse.openapiRequiredFields.isEmpty()) { // has required fields but
                                                                      // JSON element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in GetUsersInGroupResponse is not found in the empty JSON string",
            GetUsersInGroupResponse.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!GetUsersInGroupResponse.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `GetUsersInGroupResponse` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("next") != null && !jsonObj.get("next").isJsonNull())
        && !jsonObj.get("next").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `next` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("next").toString()));
    }
    if (jsonObj.get("users") != null && !jsonObj.get("users").isJsonNull()) {
      JsonArray jsonArrayusers = jsonObj.getAsJsonArray("users");
      if (jsonArrayusers != null) {
        // ensure the json data is an array
        if (!jsonObj.get("users").isJsonArray()) {
          throw new IllegalArgumentException(String.format(
              "Expected the field `users` to be an array in the JSON string but got `%s`",
              jsonObj.get("users").toString()));
        }

        // validate the optional field `users` (array)
        for (int i = 0; i < jsonArrayusers.size(); i++) {
          User.validateJsonElement(jsonArrayusers.get(i));
        } ;
      }
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!GetUsersInGroupResponse.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'GetUsersInGroupResponse' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<GetUsersInGroupResponse> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(GetUsersInGroupResponse.class));

      return (TypeAdapter<T>) new TypeAdapter<GetUsersInGroupResponse>() {
        @Override
        public void write(JsonWriter out, GetUsersInGroupResponse value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public GetUsersInGroupResponse read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of GetUsersInGroupResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetUsersInGroupResponse
   * @throws IOException if the JSON string is invalid with respect to GetUsersInGroupResponse
   */
  public static GetUsersInGroupResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetUsersInGroupResponse.class);
  }

  /**
   * Convert an instance of GetUsersInGroupResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

