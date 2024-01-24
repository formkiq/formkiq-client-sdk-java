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
 * The version of the OpenAPI document: 1.13.0 Contact: support@formkiq.com
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
 * AddActionParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-01-23T19:44:28.335991-06:00[America/Winnipeg]")
public class AddActionParameters {
  public static final String SERIALIZED_NAME_OCR_PARSE_TYPES = "ocrParseTypes";
  @SerializedName(SERIALIZED_NAME_OCR_PARSE_TYPES)
  private String ocrParseTypes;

  /**
   * OCR: Engine to use for Optical character recognition
   */
  @JsonAdapter(OcrEngineEnum.Adapter.class)
  public enum OcrEngineEnum {
    TESSERACT("TESSERACT"),

    TEXTRACT("TEXTRACT");

    private String value;

    OcrEngineEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OcrEngineEnum fromValue(String value) {
      for (OcrEngineEnum b : OcrEngineEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OcrEngineEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OcrEngineEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OcrEngineEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OcrEngineEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      OcrEngineEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_OCR_ENGINE = "ocrEngine";
  @SerializedName(SERIALIZED_NAME_OCR_ENGINE)
  private OcrEngineEnum ocrEngine;

  public static final String SERIALIZED_NAME_ADD_PDF_DETECTED_CHARACTERS_AS_TEXT =
      "addPdfDetectedCharactersAsText";
  @SerializedName(SERIALIZED_NAME_ADD_PDF_DETECTED_CHARACTERS_AS_TEXT)
  private Boolean addPdfDetectedCharactersAsText;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_CHARACTER_MAX = "characterMax";
  @SerializedName(SERIALIZED_NAME_CHARACTER_MAX)
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
  private NotificationTypeEnum notificationType;

  public static final String SERIALIZED_NAME_NOTIFICATION_TO_CC = "notificationToCc";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_TO_CC)
  private String notificationToCc;

  public static final String SERIALIZED_NAME_NOTIFICATION_TO_BCC = "notificationToBcc";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_TO_BCC)
  private String notificationToBcc;

  public static final String SERIALIZED_NAME_NOTIFICATION_SUBJECT = "notificationSubject";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_SUBJECT)
  private String notificationSubject;

  public static final String SERIALIZED_NAME_NOTIFICATION_TEXT = "notificationText";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_TEXT)
  private String notificationText;

  public static final String SERIALIZED_NAME_NOTIFICATION_HTML = "notificationHtml";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_HTML)
  private String notificationHtml;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private String tags;

  public static final String SERIALIZED_NAME_QUEUE_NAME = "queueName";
  @SerializedName(SERIALIZED_NAME_QUEUE_NAME)
  private String queueName;

  public AddActionParameters() {}

  public AddActionParameters ocrParseTypes(String ocrParseTypes) {
    this.ocrParseTypes = ocrParseTypes;
    return this;
  }

  /**
   * OCR: Parse types - TEXT, FORMS, TABLES
   * 
   * @return ocrParseTypes
   **/
  @javax.annotation.Nullable
  public String getOcrParseTypes() {
    return ocrParseTypes;
  }

  public void setOcrParseTypes(String ocrParseTypes) {
    this.ocrParseTypes = ocrParseTypes;
  }


  public AddActionParameters ocrEngine(OcrEngineEnum ocrEngine) {
    this.ocrEngine = ocrEngine;
    return this;
  }

  /**
   * OCR: Engine to use for Optical character recognition
   * 
   * @return ocrEngine
   **/
  @javax.annotation.Nullable
  public OcrEngineEnum getOcrEngine() {
    return ocrEngine;
  }

  public void setOcrEngine(OcrEngineEnum ocrEngine) {
    this.ocrEngine = ocrEngine;
  }


  public AddActionParameters addPdfDetectedCharactersAsText(
      Boolean addPdfDetectedCharactersAsText) {
    this.addPdfDetectedCharactersAsText = addPdfDetectedCharactersAsText;
    return this;
  }

  /**
   * OCR: For the rewriting of the PDF document, converting any image text to searchable text
   * 
   * @return addPdfDetectedCharactersAsText
   **/
  @javax.annotation.Nullable
  public Boolean getAddPdfDetectedCharactersAsText() {
    return addPdfDetectedCharactersAsText;
  }

  public void setAddPdfDetectedCharactersAsText(Boolean addPdfDetectedCharactersAsText) {
    this.addPdfDetectedCharactersAsText = addPdfDetectedCharactersAsText;
  }


  public AddActionParameters url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Webhook: Callback URL
   * 
   * @return url
   **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public AddActionParameters characterMax(String characterMax) {
    this.characterMax = characterMax;
    return this;
  }

  /**
   * Fulltext: Maximum number of characters (-1 unlimited, Typesense defaults to 2048 characters)
   * 
   * @return characterMax
   **/
  @javax.annotation.Nullable
  public String getCharacterMax() {
    return characterMax;
  }

  public void setCharacterMax(String characterMax) {
    this.characterMax = characterMax;
  }


  public AddActionParameters engine(EngineEnum engine) {
    this.engine = engine;
    return this;
  }

  /**
   * DocumentTagging: Engine to use for document tagging generation
   * 
   * @return engine
   **/
  @javax.annotation.Nullable
  public EngineEnum getEngine() {
    return engine;
  }

  public void setEngine(EngineEnum engine) {
    this.engine = engine;
  }


  public AddActionParameters notificationType(NotificationTypeEnum notificationType) {
    this.notificationType = notificationType;
    return this;
  }

  /**
   * Notification Type
   * 
   * @return notificationType
   **/
  @javax.annotation.Nullable
  public NotificationTypeEnum getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(NotificationTypeEnum notificationType) {
    this.notificationType = notificationType;
  }


  public AddActionParameters notificationToCc(String notificationToCc) {
    this.notificationToCc = notificationToCc;
    return this;
  }

  /**
   * Who to carbon copy on the notification to (comma-delimited list)
   * 
   * @return notificationToCc
   **/
  @javax.annotation.Nullable
  public String getNotificationToCc() {
    return notificationToCc;
  }

  public void setNotificationToCc(String notificationToCc) {
    this.notificationToCc = notificationToCc;
  }


  public AddActionParameters notificationToBcc(String notificationToBcc) {
    this.notificationToBcc = notificationToBcc;
    return this;
  }

  /**
   * Who to blind carbon copy on the notification to (comma-delimited list)
   * 
   * @return notificationToBcc
   **/
  @javax.annotation.Nullable
  public String getNotificationToBcc() {
    return notificationToBcc;
  }

  public void setNotificationToBcc(String notificationToBcc) {
    this.notificationToBcc = notificationToBcc;
  }


  public AddActionParameters notificationSubject(String notificationSubject) {
    this.notificationSubject = notificationSubject;
    return this;
  }

  /**
   * Subject of the notification
   * 
   * @return notificationSubject
   **/
  @javax.annotation.Nullable
  public String getNotificationSubject() {
    return notificationSubject;
  }

  public void setNotificationSubject(String notificationSubject) {
    this.notificationSubject = notificationSubject;
  }


  public AddActionParameters notificationText(String notificationText) {
    this.notificationText = notificationText;
    return this;
  }

  /**
   * Text of the notification
   * 
   * @return notificationText
   **/
  @javax.annotation.Nullable
  public String getNotificationText() {
    return notificationText;
  }

  public void setNotificationText(String notificationText) {
    this.notificationText = notificationText;
  }


  public AddActionParameters notificationHtml(String notificationHtml) {
    this.notificationHtml = notificationHtml;
    return this;
  }

  /**
   * Html of the notification
   * 
   * @return notificationHtml
   **/
  @javax.annotation.Nullable
  public String getNotificationHtml() {
    return notificationHtml;
  }

  public void setNotificationHtml(String notificationHtml) {
    this.notificationHtml = notificationHtml;
  }


  public AddActionParameters tags(String tags) {
    this.tags = tags;
    return this;
  }

  /**
   * DocumentTagging: Comma-deliminted list of keywords to generate tags for
   * 
   * @return tags
   **/
  @javax.annotation.Nullable
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }


  public AddActionParameters queueName(String queueName) {
    this.queueName = queueName;
    return this;
  }

  /**
   * Name of Queue action
   * 
   * @return queueName
   **/
  @javax.annotation.Nullable
  public String getQueueName() {
    return queueName;
  }

  public void setQueueName(String queueName) {
    this.queueName = queueName;
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
        && Objects.equals(this.queueName, addActionParameters.queueName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ocrParseTypes, ocrEngine, addPdfDetectedCharactersAsText, url, characterMax,
        engine, notificationType, notificationToCc, notificationToBcc, notificationSubject,
        notificationText, notificationHtml, tags, queueName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddActionParameters {\n");
    sb.append("    ocrParseTypes: ").append(toIndentedString(ocrParseTypes)).append("\n");
    sb.append("    ocrEngine: ").append(toIndentedString(ocrEngine)).append("\n");
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
    sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
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
    openapiFields.add("queueName");

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
    if ((jsonObj.get("ocrEngine") != null && !jsonObj.get("ocrEngine").isJsonNull())
        && !jsonObj.get("ocrEngine").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `ocrEngine` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("ocrEngine").toString()));
    }
    // validate the optional field `ocrEngine`
    if (jsonObj.get("ocrEngine") != null && !jsonObj.get("ocrEngine").isJsonNull()) {
      OcrEngineEnum.validateJsonElement(jsonObj.get("ocrEngine"));
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
    if ((jsonObj.get("queueName") != null && !jsonObj.get("queueName").isJsonNull())
        && !jsonObj.get("queueName").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `queueName` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("queueName").toString()));
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

