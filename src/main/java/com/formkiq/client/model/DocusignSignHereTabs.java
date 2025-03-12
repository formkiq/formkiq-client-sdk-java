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
 * The version of the OpenAPI document: 1.17.0 Contact: support@formkiq.com
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
    date = "2025-03-12T17:17:25.165880-05:00[America/Winnipeg]",
    comments = "Generator version: 7.12.0")
public class DocusignSignHereTabs {
  public static final String SERIALIZED_NAME_ANCHOR_STRING = "anchorString";
  @SerializedName(SERIALIZED_NAME_ANCHOR_STRING)
  @javax.annotation.Nullable
  private String anchorString;

  public static final String SERIALIZED_NAME_ANCHOR_X_OFFSET = "anchorXOffset";
  @SerializedName(SERIALIZED_NAME_ANCHOR_X_OFFSET)
  @javax.annotation.Nullable
  private String anchorXOffset;

  public static final String SERIALIZED_NAME_ANCHOR_Y_OFFSET = "anchorYOffset";
  @SerializedName(SERIALIZED_NAME_ANCHOR_Y_OFFSET)
  @javax.annotation.Nullable
  private String anchorYOffset;

  public static final String SERIALIZED_NAME_ANCHOR_IGNORE_IF_NOT_PRESENT =
      "anchorIgnoreIfNotPresent";
  @SerializedName(SERIALIZED_NAME_ANCHOR_IGNORE_IF_NOT_PRESENT)
  @javax.annotation.Nullable
  private String anchorIgnoreIfNotPresent;

  public static final String SERIALIZED_NAME_ANCHOR_UNITS = "anchorUnits";
  @SerializedName(SERIALIZED_NAME_ANCHOR_UNITS)
  @javax.annotation.Nullable
  private String anchorUnits;

  public static final String SERIALIZED_NAME_X_POSITION = "xPosition";
  @SerializedName(SERIALIZED_NAME_X_POSITION)
  @javax.annotation.Nullable
  private String xPosition;

  public static final String SERIALIZED_NAME_Y_POSITION = "yPosition";
  @SerializedName(SERIALIZED_NAME_Y_POSITION)
  @javax.annotation.Nullable
  private String yPosition;

  public static final String SERIALIZED_NAME_PAGE_NUMBER = "pageNumber";
  @SerializedName(SERIALIZED_NAME_PAGE_NUMBER)
  @javax.annotation.Nullable
  private String pageNumber;

  public DocusignSignHereTabs() {}

  public DocusignSignHereTabs anchorString(@javax.annotation.Nullable String anchorString) {
    this.anchorString = anchorString;
    return this;
  }

  /**
   * Specifies the string to find in the document and use as the basis for tab placement.
   * 
   * @return anchorString
   */
  @javax.annotation.Nullable
  public String getAnchorString() {
    return anchorString;
  }

  public void setAnchorString(@javax.annotation.Nullable String anchorString) {
    this.anchorString = anchorString;
  }


  public DocusignSignHereTabs anchorXOffset(@javax.annotation.Nullable String anchorXOffset) {
    this.anchorXOffset = anchorXOffset;
    return this;
  }

  /**
   * Specifies the X axis location of the tab in anchorUnits relative to the anchorString.
   * 
   * @return anchorXOffset
   */
  @javax.annotation.Nullable
  public String getAnchorXOffset() {
    return anchorXOffset;
  }

  public void setAnchorXOffset(@javax.annotation.Nullable String anchorXOffset) {
    this.anchorXOffset = anchorXOffset;
  }


  public DocusignSignHereTabs anchorYOffset(@javax.annotation.Nullable String anchorYOffset) {
    this.anchorYOffset = anchorYOffset;
    return this;
  }

  /**
   * Specifies the Y axis location of the tab in anchorUnits relative to the anchorString.
   * 
   * @return anchorYOffset
   */
  @javax.annotation.Nullable
  public String getAnchorYOffset() {
    return anchorYOffset;
  }

  public void setAnchorYOffset(@javax.annotation.Nullable String anchorYOffset) {
    this.anchorYOffset = anchorYOffset;
  }


  public DocusignSignHereTabs anchorIgnoreIfNotPresent(
      @javax.annotation.Nullable String anchorIgnoreIfNotPresent) {
    this.anchorIgnoreIfNotPresent = anchorIgnoreIfNotPresent;
    return this;
  }

  /**
   * When true, this tab is ignored if the anchorString is not found in the document.
   * 
   * @return anchorIgnoreIfNotPresent
   */
  @javax.annotation.Nullable
  public String getAnchorIgnoreIfNotPresent() {
    return anchorIgnoreIfNotPresent;
  }

  public void setAnchorIgnoreIfNotPresent(
      @javax.annotation.Nullable String anchorIgnoreIfNotPresent) {
    this.anchorIgnoreIfNotPresent = anchorIgnoreIfNotPresent;
  }


  public DocusignSignHereTabs anchorUnits(@javax.annotation.Nullable String anchorUnits) {
    this.anchorUnits = anchorUnits;
    return this;
  }

  /**
   * Specifies units of the anchorXOffset and anchorYOffset
   * 
   * @return anchorUnits
   */
  @javax.annotation.Nullable
  public String getAnchorUnits() {
    return anchorUnits;
  }

  public void setAnchorUnits(@javax.annotation.Nullable String anchorUnits) {
    this.anchorUnits = anchorUnits;
  }


  public DocusignSignHereTabs xPosition(@javax.annotation.Nullable String xPosition) {
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

  public void setxPosition(@javax.annotation.Nullable String xPosition) {
    this.xPosition = xPosition;
  }


  public DocusignSignHereTabs yPosition(@javax.annotation.Nullable String yPosition) {
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

  public void setyPosition(@javax.annotation.Nullable String yPosition) {
    this.yPosition = yPosition;
  }


  public DocusignSignHereTabs pageNumber(@javax.annotation.Nullable String pageNumber) {
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

  public void setPageNumber(@javax.annotation.Nullable String pageNumber) {
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
    return Objects.equals(this.anchorString, docusignSignHereTabs.anchorString)
        && Objects.equals(this.anchorXOffset, docusignSignHereTabs.anchorXOffset)
        && Objects.equals(this.anchorYOffset, docusignSignHereTabs.anchorYOffset)
        && Objects.equals(this.anchorIgnoreIfNotPresent,
            docusignSignHereTabs.anchorIgnoreIfNotPresent)
        && Objects.equals(this.anchorUnits, docusignSignHereTabs.anchorUnits)
        && Objects.equals(this.xPosition, docusignSignHereTabs.xPosition)
        && Objects.equals(this.yPosition, docusignSignHereTabs.yPosition)
        && Objects.equals(this.pageNumber, docusignSignHereTabs.pageNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorString, anchorXOffset, anchorYOffset, anchorIgnoreIfNotPresent,
        anchorUnits, xPosition, yPosition, pageNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocusignSignHereTabs {\n");
    sb.append("    anchorString: ").append(toIndentedString(anchorString)).append("\n");
    sb.append("    anchorXOffset: ").append(toIndentedString(anchorXOffset)).append("\n");
    sb.append("    anchorYOffset: ").append(toIndentedString(anchorYOffset)).append("\n");
    sb.append("    anchorIgnoreIfNotPresent: ").append(toIndentedString(anchorIgnoreIfNotPresent))
        .append("\n");
    sb.append("    anchorUnits: ").append(toIndentedString(anchorUnits)).append("\n");
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
    openapiFields.add("anchorString");
    openapiFields.add("anchorXOffset");
    openapiFields.add("anchorYOffset");
    openapiFields.add("anchorIgnoreIfNotPresent");
    openapiFields.add("anchorUnits");
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
    if ((jsonObj.get("anchorString") != null && !jsonObj.get("anchorString").isJsonNull())
        && !jsonObj.get("anchorString").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `anchorString` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("anchorString").toString()));
    }
    if ((jsonObj.get("anchorXOffset") != null && !jsonObj.get("anchorXOffset").isJsonNull())
        && !jsonObj.get("anchorXOffset").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `anchorXOffset` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("anchorXOffset").toString()));
    }
    if ((jsonObj.get("anchorYOffset") != null && !jsonObj.get("anchorYOffset").isJsonNull())
        && !jsonObj.get("anchorYOffset").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `anchorYOffset` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("anchorYOffset").toString()));
    }
    if ((jsonObj.get("anchorIgnoreIfNotPresent") != null
        && !jsonObj.get("anchorIgnoreIfNotPresent").isJsonNull())
        && !jsonObj.get("anchorIgnoreIfNotPresent").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `anchorIgnoreIfNotPresent` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("anchorIgnoreIfNotPresent").toString()));
    }
    if ((jsonObj.get("anchorUnits") != null && !jsonObj.get("anchorUnits").isJsonNull())
        && !jsonObj.get("anchorUnits").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `anchorUnits` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("anchorUnits").toString()));
    }
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

