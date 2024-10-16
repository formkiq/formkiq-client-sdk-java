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
 * The version of the OpenAPI document: 1.16.0 Contact: support@formkiq.com
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
 * DocusignSignHereTabs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-10-15T23:10:22.074601-05:00[America/Winnipeg]",
    comments = "Generator version: 7.9.0")
public class DocusignSignHereTabs {
  public static final String SERIALIZED_NAME_X_POSITION = "xPosition";
  @SerializedName(SERIALIZED_NAME_X_POSITION)
  private String xPosition;

  public static final String SERIALIZED_NAME_Y_POSITION = "yPosition";
  @SerializedName(SERIALIZED_NAME_Y_POSITION)
  private String yPosition;

  public static final String SERIALIZED_NAME_PAGE_NUMBER = "pageNumber";
  @SerializedName(SERIALIZED_NAME_PAGE_NUMBER)
  private String pageNumber;

  public DocusignSignHereTabs() {}

  public DocusignSignHereTabs xPosition(String xPosition) {
    this.xPosition = xPosition;
    return this;
  }

  /**
   * This property indicates the horizontal offset of the object on the page
   * 
   * @return xPosition
   */
  @javax.annotation.Nullable
  public String getxPosition() {
    return xPosition;
  }

  public void setxPosition(String xPosition) {
    this.xPosition = xPosition;
  }


  public DocusignSignHereTabs yPosition(String yPosition) {
    this.yPosition = yPosition;
    return this;
  }

  /**
   * This property indicates the vertical offset of the object on the page
   * 
   * @return yPosition
   */
  @javax.annotation.Nullable
  public String getyPosition() {
    return yPosition;
  }

  public void setyPosition(String yPosition) {
    this.yPosition = yPosition;
  }


  public DocusignSignHereTabs pageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * Specifies the page number on which the tab is located
   * 
   * @return pageNumber
   */
  @javax.annotation.Nullable
  public String getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocusignSignHereTabs docusignSignHereTabs = (DocusignSignHereTabs) o;
    return Objects.equals(this.xPosition, docusignSignHereTabs.xPosition)
        && Objects.equals(this.yPosition, docusignSignHereTabs.yPosition)
        && Objects.equals(this.pageNumber, docusignSignHereTabs.pageNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xPosition, yPosition, pageNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocusignSignHereTabs {\n");
    sb.append("    xPosition: ").append(toIndentedString(xPosition)).append("\n");
    sb.append("    yPosition: ").append(toIndentedString(yPosition)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
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
    openapiFields.add("xPosition");
    openapiFields.add("yPosition");
    openapiFields.add("pageNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocusignSignHereTabs
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!DocusignSignHereTabs.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                   // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in DocusignSignHereTabs is not found in the empty JSON string",
            DocusignSignHereTabs.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!DocusignSignHereTabs.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `DocusignSignHereTabs` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("xPosition") != null && !jsonObj.get("xPosition").isJsonNull())
        && !jsonObj.get("xPosition").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `xPosition` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("xPosition").toString()));
    }
    if ((jsonObj.get("yPosition") != null && !jsonObj.get("yPosition").isJsonNull())
        && !jsonObj.get("yPosition").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `yPosition` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("yPosition").toString()));
    }
    if ((jsonObj.get("pageNumber") != null && !jsonObj.get("pageNumber").isJsonNull())
        && !jsonObj.get("pageNumber").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `pageNumber` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("pageNumber").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!DocusignSignHereTabs.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'DocusignSignHereTabs' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<DocusignSignHereTabs> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(DocusignSignHereTabs.class));

      return (TypeAdapter<T>) new TypeAdapter<DocusignSignHereTabs>() {
        @Override
        public void write(JsonWriter out, DocusignSignHereTabs value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public DocusignSignHereTabs read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of DocusignSignHereTabs given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocusignSignHereTabs
   * @throws IOException if the JSON string is invalid with respect to DocusignSignHereTabs
   */
  public static DocusignSignHereTabs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocusignSignHereTabs.class);
  }

  /**
   * Convert an instance of DocusignSignHereTabs to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

