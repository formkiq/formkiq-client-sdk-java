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
 * The version of the OpenAPI document: 1.12.1 Contact: support@formkiq.com
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
 * EsignatureDocusignRecipientTab
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-09-21T15:06:42.052427-05:00[America/Winnipeg]")
public class EsignatureDocusignRecipientTab {
  /**
   * Type of Recipient
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SIGNHERE("signHere");

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
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_PAGE_NUMBER = "pageNumber";
  @SerializedName(SERIALIZED_NAME_PAGE_NUMBER)
  private String pageNumber;

  public static final String SERIALIZED_NAME_POSITION_X = "positionX";
  @SerializedName(SERIALIZED_NAME_POSITION_X)
  private String positionX;

  public static final String SERIALIZED_NAME_POSITION_Y = "positionY";
  @SerializedName(SERIALIZED_NAME_POSITION_Y)
  private String positionY;

  public EsignatureDocusignRecipientTab() {}

  public EsignatureDocusignRecipientTab type(TypeEnum type) {

    this.type = type;
    return this;
  }

  /**
   * Type of Recipient
   * 
   * @return type
   **/
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public EsignatureDocusignRecipientTab pageNumber(String pageNumber) {

    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * Document Page Number
   * 
   * @return pageNumber
   **/
  @javax.annotation.Nullable
  public String getPageNumber() {
    return pageNumber;
  }


  public void setPageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
  }


  public EsignatureDocusignRecipientTab positionX(String positionX) {

    this.positionX = positionX;
    return this;
  }

  /**
   * Element X Position
   * 
   * @return positionX
   **/
  @javax.annotation.Nullable
  public String getPositionX() {
    return positionX;
  }


  public void setPositionX(String positionX) {
    this.positionX = positionX;
  }


  public EsignatureDocusignRecipientTab positionY(String positionY) {

    this.positionY = positionY;
    return this;
  }

  /**
   * Element Y Position
   * 
   * @return positionY
   **/
  @javax.annotation.Nullable
  public String getPositionY() {
    return positionY;
  }


  public void setPositionY(String positionY) {
    this.positionY = positionY;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EsignatureDocusignRecipientTab esignatureDocusignRecipientTab =
        (EsignatureDocusignRecipientTab) o;
    return Objects.equals(this.type, esignatureDocusignRecipientTab.type)
        && Objects.equals(this.pageNumber, esignatureDocusignRecipientTab.pageNumber)
        && Objects.equals(this.positionX, esignatureDocusignRecipientTab.positionX)
        && Objects.equals(this.positionY, esignatureDocusignRecipientTab.positionY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, pageNumber, positionX, positionY);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EsignatureDocusignRecipientTab {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    positionX: ").append(toIndentedString(positionX)).append("\n");
    sb.append("    positionY: ").append(toIndentedString(positionY)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("pageNumber");
    openapiFields.add("positionX");
    openapiFields.add("positionY");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to
   *         EsignatureDocusignRecipientTab
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!EsignatureDocusignRecipientTab.openapiRequiredFields.isEmpty()) { // has required fields
                                                                             // but JSON element is
                                                                             // null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in EsignatureDocusignRecipientTab is not found in the empty JSON string",
            EsignatureDocusignRecipientTab.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!EsignatureDocusignRecipientTab.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `EsignatureDocusignRecipientTab` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull())
        && !jsonObj.get("type").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `type` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("type").toString()));
    }
    if ((jsonObj.get("pageNumber") != null && !jsonObj.get("pageNumber").isJsonNull())
        && !jsonObj.get("pageNumber").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `pageNumber` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("pageNumber").toString()));
    }
    if ((jsonObj.get("positionX") != null && !jsonObj.get("positionX").isJsonNull())
        && !jsonObj.get("positionX").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `positionX` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("positionX").toString()));
    }
    if ((jsonObj.get("positionY") != null && !jsonObj.get("positionY").isJsonNull())
        && !jsonObj.get("positionY").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `positionY` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("positionY").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!EsignatureDocusignRecipientTab.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'EsignatureDocusignRecipientTab' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<EsignatureDocusignRecipientTab> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(EsignatureDocusignRecipientTab.class));

      return (TypeAdapter<T>) new TypeAdapter<EsignatureDocusignRecipientTab>() {
        @Override
        public void write(JsonWriter out, EsignatureDocusignRecipientTab value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public EsignatureDocusignRecipientTab read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of EsignatureDocusignRecipientTab given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EsignatureDocusignRecipientTab
   * @throws IOException if the JSON string is invalid with respect to
   *         EsignatureDocusignRecipientTab
   */
  public static EsignatureDocusignRecipientTab fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EsignatureDocusignRecipientTab.class);
  }

  /**
   * Convert an instance of EsignatureDocusignRecipientTab to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

