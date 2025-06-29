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
import com.formkiq.client.model.OcrEngine;
import com.formkiq.client.model.OcrOutputType;
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
 * AddActionParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2025-05-20T14:44:33.741519-05:00[America/Winnipeg]",
    comments = "Generator version: 7.13.0")
public class AddActionParameters {
  public static final String SERIALIZED_NAME_OCR_PARSE_TYPES = "ocrParseTypes";
  @SerializedName(SERIALIZED_NAME_OCR_PARSE_TYPES)
  @javax.annotation.Nullable
  private String ocrParseTypes;

  public static final String SERIALIZED_NAME_OCR_ENGINE = "ocrEngine";
  @SerializedName(SERIALIZED_NAME_OCR_ENGINE)
  @javax.annotation.Nullable
  private OcrEngine ocrEngine;

  public static final String SERIALIZED_NAME_OCR_OUTPUT_TYPE = "ocrOutputType";
  @SerializedName(SERIALIZED_NAME_OCR_OUTPUT_TYPE)
  @javax.annotation.Nullable
  private OcrOutputType ocrOutputType;

  public static final String SERIALIZED_NAME_OCR_NUMBER_OF_PAGES = "ocrNumberOfPages";
  @SerializedName(SERIALIZED_NAME_OCR_NUMBER_OF_PAGES)
  @javax.annotation.Nullable
  private String ocrNumberOfPages;

  public static final String SERIALIZED_NAME_ADD_PDF_DETECTED_CHARACTERS_AS_TEXT =
      "addPdfDetectedCharactersAsText";
  @SerializedName(SERIALIZED_NAME_ADD_PDF_DETECTED_CHARACTERS_AS_TEXT)
  @javax.annotation.Nullable
  private String addPdfDetectedCharactersAsText;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  @javax.annotation.Nullable
  private String url;

  public static final String SERIALIZED_NAME_CHARACTER_MAX = "characterMax";
  @SerializedName(SERIALIZED_NAME_CHARACTER_MAX)
  @javax.annotation.Nullable
  private String characterMax;

  /**
   * DocumentTagging: Engine to use for document tagging generation
   */
  @JsonAdapter(EngineEnum.Adapter.class)
  public enum EngineEnum {
    CHATGPT("chatgpt");

    private String value;

    EngineEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EngineEnum fromValue(String value) {
      for (EngineEnum b : EngineEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EngineEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EngineEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EngineEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EngineEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      EngineEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ENGINE = "engine";
  @SerializedName(SERIALIZED_NAME_ENGINE)
  @javax.annotation.Nullable
  private EngineEnum engine;

  /**
   * Notification Type
   */
  @JsonAdapter(NotificationTypeEnum.Adapter.class)
  public enum NotificationTypeEnum {
    EMAIL("email");

    private String value;

    NotificationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NotificationTypeEnum fromValue(String value) {
      for (NotificationTypeEnum b : NotificationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NotificationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NotificationTypeEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NotificationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return NotificationTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      NotificationTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_NOTIFICATION_TYPE = "notificationType";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_TYPE)
  @javax.annotation.Nullable
  private NotificationTypeEnum notificationType;

  public static final String SERIALIZED_NAME_NOTIFICATION_TO_CC = "notificationToCc";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_TO_CC)
  @javax.annotation.Nullable
  private String notificationToCc;

  public static final String SERIALIZED_NAME_NOTIFICATION_TO_BCC = "notificationToBcc";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_TO_BCC)
  @javax.annotation.Nullable
  private String notificationToBcc;

  public static final String SERIALIZED_NAME_NOTIFICATION_SUBJECT = "notificationSubject";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_SUBJECT)
  @javax.annotation.Nullable
  private String notificationSubject;

  public static final String SERIALIZED_NAME_NOTIFICATION_TEXT = "notificationText";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_TEXT)
  @javax.annotation.Nullable
  private String notificationText;

  public static final String SERIALIZED_NAME_NOTIFICATION_HTML = "notificationHtml";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_HTML)
  @javax.annotation.Nullable
  private String notificationHtml;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  @javax.annotation.Nullable
  private String tags;

  public static final String SERIALIZED_NAME_MAPPING_ID = "mappingId";
  @SerializedName(SERIALIZED_NAME_MAPPING_ID)
  @javax.annotation.Nullable
  private String mappingId;

  public static final String SERIALIZED_NAME_EVENT_BUS_NAME = "eventBusName";
  @SerializedName(SERIALIZED_NAME_EVENT_BUS_NAME)
  @javax.annotation.Nullable
  private String eventBusName;

  public AddActionParameters() {}

  public AddActionParameters ocrParseTypes(@javax.annotation.Nullable String ocrParseTypes) {
    this.ocrParseTypes = ocrParseTypes;
    return this;
  }

  /**
   * OCR: Parse types - TEXT, FORMS, TABLES
   * 
   * @return ocrParseTypes
   */
  @javax.annotation.Nullable
  public String getOcrParseTypes() {
    return ocrParseTypes;
  }

  public void setOcrParseTypes(@javax.annotation.Nullable String ocrParseTypes) {
    this.ocrParseTypes = ocrParseTypes;
  }


  public AddActionParameters ocrEngine(@javax.annotation.Nullable OcrEngine ocrEngine) {
    this.ocrEngine = ocrEngine;
    return this;
  }

  /**
   * Get ocrEngine
   * 
   * @return ocrEngine
   */
  @javax.annotation.Nullable
  public OcrEngine getOcrEngine() {
    return ocrEngine;
  }

  public void setOcrEngine(@javax.annotation.Nullable OcrEngine ocrEngine) {
    this.ocrEngine = ocrEngine;
  }


  public AddActionParameters ocrOutputType(@javax.annotation.Nullable OcrOutputType ocrOutputType) {
    this.ocrOutputType = ocrOutputType;
    return this;
  }

  /**
   * Get ocrOutputType
   * 
   * @return ocrOutputType
   */
  @javax.annotation.Nullable
  public OcrOutputType getOcrOutputType() {
    return ocrOutputType;
  }

  public void setOcrOutputType(@javax.annotation.Nullable OcrOutputType ocrOutputType) {
    this.ocrOutputType = ocrOutputType;
  }


  public AddActionParameters ocrNumberOfPages(@javax.annotation.Nullable String ocrNumberOfPages) {
    this.ocrNumberOfPages = ocrNumberOfPages;
    return this;
  }

  /**
   * Number of pages to OCR (from start) (-1 all)
   * 
   * @return ocrNumberOfPages
   */
  @javax.annotation.Nullable
  public String getOcrNumberOfPages() {
    return ocrNumberOfPages;
  }

  public void setOcrNumberOfPages(@javax.annotation.Nullable String ocrNumberOfPages) {
    this.ocrNumberOfPages = ocrNumberOfPages;
  }


  public AddActionParameters addPdfDetectedCharactersAsText(
      @javax.annotation.Nullable String addPdfDetectedCharactersAsText) {
    this.addPdfDetectedCharactersAsText = addPdfDetectedCharactersAsText;
    return this;
  }

  /**
   * OCR: For the rewriting of the PDF document, converting any image text to searchable text
   * 
   * @return addPdfDetectedCharactersAsText
   */
  @javax.annotation.Nullable
  public String getAddPdfDetectedCharactersAsText() {
    return addPdfDetectedCharactersAsText;
  }

  public void setAddPdfDetectedCharactersAsText(
      @javax.annotation.Nullable String addPdfDetectedCharactersAsText) {
    this.addPdfDetectedCharactersAsText = addPdfDetectedCharactersAsText;
  }


  public AddActionParameters url(@javax.annotation.Nullable String url) {
    this.url = url;
    return this;
  }

  /**
   * Webhook: Callback URL
   * 
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(@javax.annotation.Nullable String url) {
    this.url = url;
  }


  public AddActionParameters characterMax(@javax.annotation.Nullable String characterMax) {
    this.characterMax = characterMax;
    return this;
  }

  /**
   * Fulltext: Maximum number of characters (-1 unlimited, Typesense defaults to 2048 characters)
   * 
   * @return characterMax
   */
  @javax.annotation.Nullable
  public String getCharacterMax() {
    return characterMax;
  }

  public void setCharacterMax(@javax.annotation.Nullable String characterMax) {
    this.characterMax = characterMax;
  }


  public AddActionParameters engine(@javax.annotation.Nullable EngineEnum engine) {
    this.engine = engine;
    return this;
  }

  /**
   * DocumentTagging: Engine to use for document tagging generation
   * 
   * @return engine
   */
  @javax.annotation.Nullable
  public EngineEnum getEngine() {
    return engine;
  }

  public void setEngine(@javax.annotation.Nullable EngineEnum engine) {
    this.engine = engine;
  }


  public AddActionParameters notificationType(
      @javax.annotation.Nullable NotificationTypeEnum notificationType) {
    this.notificationType = notificationType;
    return this;
  }

  /**
   * Notification Type
   * 
   * @return notificationType
   */
  @javax.annotation.Nullable
  public NotificationTypeEnum getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(
      @javax.annotation.Nullable NotificationTypeEnum notificationType) {
    this.notificationType = notificationType;
  }


  public AddActionParameters notificationToCc(@javax.annotation.Nullable String notificationToCc) {
    this.notificationToCc = notificationToCc;
    return this;
  }

  /**
   * Who to carbon copy on the notification to (comma-delimited list)
   * 
   * @return notificationToCc
   */
  @javax.annotation.Nullable
  public String getNotificationToCc() {
    return notificationToCc;
  }

  public void setNotificationToCc(@javax.annotation.Nullable String notificationToCc) {
    this.notificationToCc = notificationToCc;
  }


  public AddActionParameters notificationToBcc(
      @javax.annotation.Nullable String notificationToBcc) {
    this.notificationToBcc = notificationToBcc;
    return this;
  }

  /**
   * Who to blind carbon copy on the notification to (comma-delimited list)
   * 
   * @return notificationToBcc
   */
  @javax.annotation.Nullable
  public String getNotificationToBcc() {
    return notificationToBcc;
  }

  public void setNotificationToBcc(@javax.annotation.Nullable String notificationToBcc) {
    this.notificationToBcc = notificationToBcc;
  }


  public AddActionParameters notificationSubject(
      @javax.annotation.Nullable String notificationSubject) {
    this.notificationSubject = notificationSubject;
    return this;
  }

  /**
   * Subject of the notification
   * 
   * @return notificationSubject
   */
  @javax.annotation.Nullable
  public String getNotificationSubject() {
    return notificationSubject;
  }

  public void setNotificationSubject(@javax.annotation.Nullable String notificationSubject) {
    this.notificationSubject = notificationSubject;
  }


  public AddActionParameters notificationText(@javax.annotation.Nullable String notificationText) {
    this.notificationText = notificationText;
    return this;
  }

  /**
   * Text of the notification
   * 
   * @return notificationText
   */
  @javax.annotation.Nullable
  public String getNotificationText() {
    return notificationText;
  }

  public void setNotificationText(@javax.annotation.Nullable String notificationText) {
    this.notificationText = notificationText;
  }


  public AddActionParameters notificationHtml(@javax.annotation.Nullable String notificationHtml) {
    this.notificationHtml = notificationHtml;
    return this;
  }

  /**
   * Html of the notification
   * 
   * @return notificationHtml
   */
  @javax.annotation.Nullable
  public String getNotificationHtml() {
    return notificationHtml;
  }

  public void setNotificationHtml(@javax.annotation.Nullable String notificationHtml) {
    this.notificationHtml = notificationHtml;
  }


  public AddActionParameters tags(@javax.annotation.Nullable String tags) {
    this.tags = tags;
    return this;
  }

  /**
   * DocumentTagging: Comma-deliminted list of keywords to generate tags for
   * 
   * @return tags
   */
  @javax.annotation.Nullable
  public String getTags() {
    return tags;
  }

  public void setTags(@javax.annotation.Nullable String tags) {
    this.tags = tags;
  }


  public AddActionParameters mappingId(@javax.annotation.Nullable String mappingId) {
    this.mappingId = mappingId;
    return this;
  }

  /**
   * Id of Mapping
   * 
   * @return mappingId
   */
  @javax.annotation.Nullable
  public String getMappingId() {
    return mappingId;
  }

  public void setMappingId(@javax.annotation.Nullable String mappingId) {
    this.mappingId = mappingId;
  }


  public AddActionParameters eventBusName(@javax.annotation.Nullable String eventBusName) {
    this.eventBusName = eventBusName;
    return this;
  }

  /**
   * The name or ARN of the event bus to receive the event
   * 
   * @return eventBusName
   */
  @javax.annotation.Nullable
  public String getEventBusName() {
    return eventBusName;
  }

  public void setEventBusName(@javax.annotation.Nullable String eventBusName) {
    this.eventBusName = eventBusName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddActionParameters addActionParameters = (AddActionParameters) o;
    return Objects.equals(this.ocrParseTypes, addActionParameters.ocrParseTypes)
        && Objects.equals(this.ocrEngine, addActionParameters.ocrEngine)
        && Objects.equals(this.ocrOutputType, addActionParameters.ocrOutputType)
        && Objects.equals(this.ocrNumberOfPages, addActionParameters.ocrNumberOfPages)
        && Objects.equals(this.addPdfDetectedCharactersAsText,
            addActionParameters.addPdfDetectedCharactersAsText)
        && Objects.equals(this.url, addActionParameters.url)
        && Objects.equals(this.characterMax, addActionParameters.characterMax)
        && Objects.equals(this.engine, addActionParameters.engine)
        && Objects.equals(this.notificationType, addActionParameters.notificationType)
        && Objects.equals(this.notificationToCc, addActionParameters.notificationToCc)
        && Objects.equals(this.notificationToBcc, addActionParameters.notificationToBcc)
        && Objects.equals(this.notificationSubject, addActionParameters.notificationSubject)
        && Objects.equals(this.notificationText, addActionParameters.notificationText)
        && Objects.equals(this.notificationHtml, addActionParameters.notificationHtml)
        && Objects.equals(this.tags, addActionParameters.tags)
        && Objects.equals(this.mappingId, addActionParameters.mappingId)
        && Objects.equals(this.eventBusName, addActionParameters.eventBusName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ocrParseTypes, ocrEngine, ocrOutputType, ocrNumberOfPages,
        addPdfDetectedCharactersAsText, url, characterMax, engine, notificationType,
        notificationToCc, notificationToBcc, notificationSubject, notificationText,
        notificationHtml, tags, mappingId, eventBusName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddActionParameters {\n");
    sb.append("    ocrParseTypes: ").append(toIndentedString(ocrParseTypes)).append("\n");
    sb.append("    ocrEngine: ").append(toIndentedString(ocrEngine)).append("\n");
    sb.append("    ocrOutputType: ").append(toIndentedString(ocrOutputType)).append("\n");
    sb.append("    ocrNumberOfPages: ").append(toIndentedString(ocrNumberOfPages)).append("\n");
    sb.append("    addPdfDetectedCharactersAsText: ")
        .append(toIndentedString(addPdfDetectedCharactersAsText)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    characterMax: ").append(toIndentedString(characterMax)).append("\n");
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    notificationToCc: ").append(toIndentedString(notificationToCc)).append("\n");
    sb.append("    notificationToBcc: ").append(toIndentedString(notificationToBcc)).append("\n");
    sb.append("    notificationSubject: ").append(toIndentedString(notificationSubject))
        .append("\n");
    sb.append("    notificationText: ").append(toIndentedString(notificationText)).append("\n");
    sb.append("    notificationHtml: ").append(toIndentedString(notificationHtml)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    mappingId: ").append(toIndentedString(mappingId)).append("\n");
    sb.append("    eventBusName: ").append(toIndentedString(eventBusName)).append("\n");
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
    openapiFields.add("ocrParseTypes");
    openapiFields.add("ocrEngine");
    openapiFields.add("ocrOutputType");
    openapiFields.add("ocrNumberOfPages");
    openapiFields.add("addPdfDetectedCharactersAsText");
    openapiFields.add("url");
    openapiFields.add("characterMax");
    openapiFields.add("engine");
    openapiFields.add("notificationType");
    openapiFields.add("notificationToCc");
    openapiFields.add("notificationToBcc");
    openapiFields.add("notificationSubject");
    openapiFields.add("notificationText");
    openapiFields.add("notificationHtml");
    openapiFields.add("tags");
    openapiFields.add("mappingId");
    openapiFields.add("eventBusName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AddActionParameters
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!AddActionParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                  // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in AddActionParameters is not found in the empty JSON string",
            AddActionParameters.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!AddActionParameters.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `AddActionParameters` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("ocrParseTypes") != null && !jsonObj.get("ocrParseTypes").isJsonNull())
        && !jsonObj.get("ocrParseTypes").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `ocrParseTypes` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("ocrParseTypes").toString()));
    }
    // validate the optional field `ocrEngine`
    if (jsonObj.get("ocrEngine") != null && !jsonObj.get("ocrEngine").isJsonNull()) {
      OcrEngine.validateJsonElement(jsonObj.get("ocrEngine"));
    }
    // validate the optional field `ocrOutputType`
    if (jsonObj.get("ocrOutputType") != null && !jsonObj.get("ocrOutputType").isJsonNull()) {
      OcrOutputType.validateJsonElement(jsonObj.get("ocrOutputType"));
    }
    if ((jsonObj.get("ocrNumberOfPages") != null && !jsonObj.get("ocrNumberOfPages").isJsonNull())
        && !jsonObj.get("ocrNumberOfPages").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `ocrNumberOfPages` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("ocrNumberOfPages").toString()));
    }
    if ((jsonObj.get("addPdfDetectedCharactersAsText") != null
        && !jsonObj.get("addPdfDetectedCharactersAsText").isJsonNull())
        && !jsonObj.get("addPdfDetectedCharactersAsText").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `addPdfDetectedCharactersAsText` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("addPdfDetectedCharactersAsText").toString()));
    }
    if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull())
        && !jsonObj.get("url").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `url` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("url").toString()));
    }
    if ((jsonObj.get("characterMax") != null && !jsonObj.get("characterMax").isJsonNull())
        && !jsonObj.get("characterMax").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `characterMax` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("characterMax").toString()));
    }
    if ((jsonObj.get("engine") != null && !jsonObj.get("engine").isJsonNull())
        && !jsonObj.get("engine").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `engine` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("engine").toString()));
    }
    // validate the optional field `engine`
    if (jsonObj.get("engine") != null && !jsonObj.get("engine").isJsonNull()) {
      EngineEnum.validateJsonElement(jsonObj.get("engine"));
    }
    if ((jsonObj.get("notificationType") != null && !jsonObj.get("notificationType").isJsonNull())
        && !jsonObj.get("notificationType").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `notificationType` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("notificationType").toString()));
    }
    // validate the optional field `notificationType`
    if (jsonObj.get("notificationType") != null && !jsonObj.get("notificationType").isJsonNull()) {
      NotificationTypeEnum.validateJsonElement(jsonObj.get("notificationType"));
    }
    if ((jsonObj.get("notificationToCc") != null && !jsonObj.get("notificationToCc").isJsonNull())
        && !jsonObj.get("notificationToCc").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `notificationToCc` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("notificationToCc").toString()));
    }
    if ((jsonObj.get("notificationToBcc") != null && !jsonObj.get("notificationToBcc").isJsonNull())
        && !jsonObj.get("notificationToBcc").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `notificationToBcc` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("notificationToBcc").toString()));
    }
    if ((jsonObj.get("notificationSubject") != null
        && !jsonObj.get("notificationSubject").isJsonNull())
        && !jsonObj.get("notificationSubject").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `notificationSubject` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("notificationSubject").toString()));
    }
    if ((jsonObj.get("notificationText") != null && !jsonObj.get("notificationText").isJsonNull())
        && !jsonObj.get("notificationText").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `notificationText` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("notificationText").toString()));
    }
    if ((jsonObj.get("notificationHtml") != null && !jsonObj.get("notificationHtml").isJsonNull())
        && !jsonObj.get("notificationHtml").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `notificationHtml` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("notificationHtml").toString()));
    }
    if ((jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull())
        && !jsonObj.get("tags").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `tags` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("tags").toString()));
    }
    if ((jsonObj.get("mappingId") != null && !jsonObj.get("mappingId").isJsonNull())
        && !jsonObj.get("mappingId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `mappingId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("mappingId").toString()));
    }
    if ((jsonObj.get("eventBusName") != null && !jsonObj.get("eventBusName").isJsonNull())
        && !jsonObj.get("eventBusName").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `eventBusName` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("eventBusName").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!AddActionParameters.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'AddActionParameters' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<AddActionParameters> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(AddActionParameters.class));

      return (TypeAdapter<T>) new TypeAdapter<AddActionParameters>() {
        @Override
        public void write(JsonWriter out, AddActionParameters value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public AddActionParameters read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of AddActionParameters given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AddActionParameters
   * @throws IOException if the JSON string is invalid with respect to AddActionParameters
   */
  public static AddActionParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddActionParameters.class);
  }

  /**
   * Convert an instance of AddActionParameters to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

