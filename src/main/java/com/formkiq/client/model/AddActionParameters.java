/*
 * FormKiQ HTTP API
 * Formkiq API: Document Management Platform API using JWT Authentication
 *
 * The version of the OpenAPI document: 1.12.0
 * Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.formkiq.client.invoker.JSON;

/**
 * AddActionParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-22T22:50:57.759130-05:00[America/Winnipeg]")
public class AddActionParameters {
  public static final String SERIALIZED_NAME_OCR_PARSE_TYPES = "ocrParseTypes";
  @SerializedName(SERIALIZED_NAME_OCR_PARSE_TYPES)
  private String ocrParseTypes;

  public static final String SERIALIZED_NAME_ADD_PDF_DETECTED_CHARACTERS_AS_TEXT = "addPdfDetectedCharactersAsText";
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
      public void write(final JsonWriter jsonWriter, final EngineEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EngineEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EngineEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENGINE = "engine";
  @SerializedName(SERIALIZED_NAME_ENGINE)
  private EngineEnum engine;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags;

  public AddActionParameters() {
  }

  public AddActionParameters ocrParseTypes(String ocrParseTypes) {
    
    this.ocrParseTypes = ocrParseTypes;
    return this;
  }

   /**
   * OCR: Parse types - TEXT, FORMS, TABLES
   * @return ocrParseTypes
  **/
  @javax.annotation.Nullable
  public String getOcrParseTypes() {
    return ocrParseTypes;
  }


  public void setOcrParseTypes(String ocrParseTypes) {
    this.ocrParseTypes = ocrParseTypes;
  }


  public AddActionParameters addPdfDetectedCharactersAsText(Boolean addPdfDetectedCharactersAsText) {
    
    this.addPdfDetectedCharactersAsText = addPdfDetectedCharactersAsText;
    return this;
  }

   /**
   * OCR: For the rewriting of the PDF document, converting any image text to searchable text
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
   * @return engine
  **/
  @javax.annotation.Nullable
  public EngineEnum getEngine() {
    return engine;
  }


  public void setEngine(EngineEnum engine) {
    this.engine = engine;
  }


  public AddActionParameters tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public AddActionParameters addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * DocumentTagging: List of Tags to generate tags for
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
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
    return Objects.equals(this.ocrParseTypes, addActionParameters.ocrParseTypes) &&
        Objects.equals(this.addPdfDetectedCharactersAsText, addActionParameters.addPdfDetectedCharactersAsText) &&
        Objects.equals(this.url, addActionParameters.url) &&
        Objects.equals(this.characterMax, addActionParameters.characterMax) &&
        Objects.equals(this.engine, addActionParameters.engine) &&
        Objects.equals(this.tags, addActionParameters.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ocrParseTypes, addPdfDetectedCharactersAsText, url, characterMax, engine, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddActionParameters {\n");
    sb.append("    ocrParseTypes: ").append(toIndentedString(ocrParseTypes)).append("\n");
    sb.append("    addPdfDetectedCharactersAsText: ").append(toIndentedString(addPdfDetectedCharactersAsText)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    characterMax: ").append(toIndentedString(characterMax)).append("\n");
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
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
    openapiFields.add("addPdfDetectedCharactersAsText");
    openapiFields.add("url");
    openapiFields.add("characterMax");
    openapiFields.add("engine");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddActionParameters
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddActionParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddActionParameters is not found in the empty JSON string", AddActionParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AddActionParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddActionParameters` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("ocrParseTypes") != null && !jsonObj.get("ocrParseTypes").isJsonNull()) && !jsonObj.get("ocrParseTypes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ocrParseTypes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ocrParseTypes").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("characterMax") != null && !jsonObj.get("characterMax").isJsonNull()) && !jsonObj.get("characterMax").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `characterMax` to be a primitive type in the JSON string but got `%s`", jsonObj.get("characterMax").toString()));
      }
      if ((jsonObj.get("engine") != null && !jsonObj.get("engine").isJsonNull()) && !jsonObj.get("engine").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `engine` to be a primitive type in the JSON string but got `%s`", jsonObj.get("engine").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
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
       final TypeAdapter<AddActionParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddActionParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<AddActionParameters>() {
           @Override
           public void write(JsonWriter out, AddActionParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddActionParameters read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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

