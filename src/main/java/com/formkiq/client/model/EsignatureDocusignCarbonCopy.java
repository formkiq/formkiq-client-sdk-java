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
 * The version of the OpenAPI document: 1.14.0 Contact: support@formkiq.com
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.formkiq.client.invoker.JSON;

/**
 * EsignatureDocusignCarbonCopy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-12-22T14:33:09.594006-06:00[America/Winnipeg]")
public class EsignatureDocusignCarbonCopy {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public EsignatureDocusignCarbonCopy() {}

  public EsignatureDocusignCarbonCopy name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Name of Signer
   * 
   * @return name
   **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public EsignatureDocusignCarbonCopy email(String email) {

    this.email = email;
    return this;
  }

  /**
   * Email of Signer
   * 
   * @return email
   **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EsignatureDocusignCarbonCopy esignatureDocusignCarbonCopy = (EsignatureDocusignCarbonCopy) o;
    return Objects.equals(this.name, esignatureDocusignCarbonCopy.name)
        && Objects.equals(this.email, esignatureDocusignCarbonCopy.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EsignatureDocusignCarbonCopy {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EsignatureDocusignCarbonCopy
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!EsignatureDocusignCarbonCopy.openapiRequiredFields.isEmpty()) { // has required fields
                                                                           // but JSON element is
                                                                           // null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in EsignatureDocusignCarbonCopy is not found in the empty JSON string",
            EsignatureDocusignCarbonCopy.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!EsignatureDocusignCarbonCopy.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `EsignatureDocusignCarbonCopy` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull())
        && !jsonObj.get("name").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `name` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("name").toString()));
    }
    if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull())
        && !jsonObj.get("email").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `email` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("email").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!EsignatureDocusignCarbonCopy.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'EsignatureDocusignCarbonCopy' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<EsignatureDocusignCarbonCopy> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(EsignatureDocusignCarbonCopy.class));

      return (TypeAdapter<T>) new TypeAdapter<EsignatureDocusignCarbonCopy>() {
        @Override
        public void write(JsonWriter out, EsignatureDocusignCarbonCopy value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public EsignatureDocusignCarbonCopy read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of EsignatureDocusignCarbonCopy given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EsignatureDocusignCarbonCopy
   * @throws IOException if the JSON string is invalid with respect to EsignatureDocusignCarbonCopy
   */
  public static EsignatureDocusignCarbonCopy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EsignatureDocusignCarbonCopy.class);
  }

  /**
   * Convert an instance of EsignatureDocusignCarbonCopy to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

