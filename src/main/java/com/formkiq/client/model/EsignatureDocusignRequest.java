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
import com.formkiq.client.model.EsignatureDocusignCarbonCopy;
import com.formkiq.client.model.EsignatureDocusignRecipientTab;
import com.formkiq.client.model.EsignatureDocusignSigner;
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
 * EsignatureDocusignRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-02T11:00:15.465357-05:00[America/Winnipeg]")
public class EsignatureDocusignRequest {
  public static final String SERIALIZED_NAME_EMAIL_SUBJECT = "emailSubject";
  @SerializedName(SERIALIZED_NAME_EMAIL_SUBJECT)
  private String emailSubject;

  /**
   * The status of the request
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    CREATED("created"),
    
    SENT("sent");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_DEVELOPMENT_MODE = "developmentMode";
  @SerializedName(SERIALIZED_NAME_DEVELOPMENT_MODE)
  private Boolean developmentMode;

  public static final String SERIALIZED_NAME_SIGNERS = "signers";
  @SerializedName(SERIALIZED_NAME_SIGNERS)
  private List<EsignatureDocusignSigner> signers;

  public static final String SERIALIZED_NAME_CARBON_COPIES = "carbonCopies";
  @SerializedName(SERIALIZED_NAME_CARBON_COPIES)
  private List<EsignatureDocusignCarbonCopy> carbonCopies;

  public static final String SERIALIZED_NAME_RECIPIENT_TABS = "recipientTabs";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_TABS)
  private List<EsignatureDocusignRecipientTab> recipientTabs;

  public EsignatureDocusignRequest() {
  }

  public EsignatureDocusignRequest emailSubject(String emailSubject) {
    
    this.emailSubject = emailSubject;
    return this;
  }

   /**
   * Email Subject
   * @return emailSubject
  **/
  @javax.annotation.Nullable
  public String getEmailSubject() {
    return emailSubject;
  }


  public void setEmailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
  }


  public EsignatureDocusignRequest status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the request
   * @return status
  **/
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public EsignatureDocusignRequest developmentMode(Boolean developmentMode) {
    
    this.developmentMode = developmentMode;
    return this;
  }

   /**
   * Whether to enable developer mode
   * @return developmentMode
  **/
  @javax.annotation.Nullable
  public Boolean getDevelopmentMode() {
    return developmentMode;
  }


  public void setDevelopmentMode(Boolean developmentMode) {
    this.developmentMode = developmentMode;
  }


  public EsignatureDocusignRequest signers(List<EsignatureDocusignSigner> signers) {
    
    this.signers = signers;
    return this;
  }

  public EsignatureDocusignRequest addSignersItem(EsignatureDocusignSigner signersItem) {
    if (this.signers == null) {
      this.signers = new ArrayList<>();
    }
    this.signers.add(signersItem);
    return this;
  }

   /**
   * List of DocuSign Signers
   * @return signers
  **/
  @javax.annotation.Nullable
  public List<EsignatureDocusignSigner> getSigners() {
    return signers;
  }


  public void setSigners(List<EsignatureDocusignSigner> signers) {
    this.signers = signers;
  }


  public EsignatureDocusignRequest carbonCopies(List<EsignatureDocusignCarbonCopy> carbonCopies) {
    
    this.carbonCopies = carbonCopies;
    return this;
  }

  public EsignatureDocusignRequest addCarbonCopiesItem(EsignatureDocusignCarbonCopy carbonCopiesItem) {
    if (this.carbonCopies == null) {
      this.carbonCopies = new ArrayList<>();
    }
    this.carbonCopies.add(carbonCopiesItem);
    return this;
  }

   /**
   * List of DocuSign Carbon Copies
   * @return carbonCopies
  **/
  @javax.annotation.Nullable
  public List<EsignatureDocusignCarbonCopy> getCarbonCopies() {
    return carbonCopies;
  }


  public void setCarbonCopies(List<EsignatureDocusignCarbonCopy> carbonCopies) {
    this.carbonCopies = carbonCopies;
  }


  public EsignatureDocusignRequest recipientTabs(List<EsignatureDocusignRecipientTab> recipientTabs) {
    
    this.recipientTabs = recipientTabs;
    return this;
  }

  public EsignatureDocusignRequest addRecipientTabsItem(EsignatureDocusignRecipientTab recipientTabsItem) {
    if (this.recipientTabs == null) {
      this.recipientTabs = new ArrayList<>();
    }
    this.recipientTabs.add(recipientTabsItem);
    return this;
  }

   /**
   * List of DocuSign Recipient Tabs
   * @return recipientTabs
  **/
  @javax.annotation.Nullable
  public List<EsignatureDocusignRecipientTab> getRecipientTabs() {
    return recipientTabs;
  }


  public void setRecipientTabs(List<EsignatureDocusignRecipientTab> recipientTabs) {
    this.recipientTabs = recipientTabs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EsignatureDocusignRequest esignatureDocusignRequest = (EsignatureDocusignRequest) o;
    return Objects.equals(this.emailSubject, esignatureDocusignRequest.emailSubject) &&
        Objects.equals(this.status, esignatureDocusignRequest.status) &&
        Objects.equals(this.developmentMode, esignatureDocusignRequest.developmentMode) &&
        Objects.equals(this.signers, esignatureDocusignRequest.signers) &&
        Objects.equals(this.carbonCopies, esignatureDocusignRequest.carbonCopies) &&
        Objects.equals(this.recipientTabs, esignatureDocusignRequest.recipientTabs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailSubject, status, developmentMode, signers, carbonCopies, recipientTabs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EsignatureDocusignRequest {\n");
    sb.append("    emailSubject: ").append(toIndentedString(emailSubject)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    developmentMode: ").append(toIndentedString(developmentMode)).append("\n");
    sb.append("    signers: ").append(toIndentedString(signers)).append("\n");
    sb.append("    carbonCopies: ").append(toIndentedString(carbonCopies)).append("\n");
    sb.append("    recipientTabs: ").append(toIndentedString(recipientTabs)).append("\n");
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
    openapiFields.add("emailSubject");
    openapiFields.add("status");
    openapiFields.add("developmentMode");
    openapiFields.add("signers");
    openapiFields.add("carbonCopies");
    openapiFields.add("recipientTabs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EsignatureDocusignRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EsignatureDocusignRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EsignatureDocusignRequest is not found in the empty JSON string", EsignatureDocusignRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EsignatureDocusignRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EsignatureDocusignRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("emailSubject") != null && !jsonObj.get("emailSubject").isJsonNull()) && !jsonObj.get("emailSubject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailSubject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailSubject").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("signers") != null && !jsonObj.get("signers").isJsonNull()) {
        JsonArray jsonArraysigners = jsonObj.getAsJsonArray("signers");
        if (jsonArraysigners != null) {
          // ensure the json data is an array
          if (!jsonObj.get("signers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `signers` to be an array in the JSON string but got `%s`", jsonObj.get("signers").toString()));
          }

          // validate the optional field `signers` (array)
          for (int i = 0; i < jsonArraysigners.size(); i++) {
            EsignatureDocusignSigner.validateJsonObject(jsonArraysigners.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("carbonCopies") != null && !jsonObj.get("carbonCopies").isJsonNull()) {
        JsonArray jsonArraycarbonCopies = jsonObj.getAsJsonArray("carbonCopies");
        if (jsonArraycarbonCopies != null) {
          // ensure the json data is an array
          if (!jsonObj.get("carbonCopies").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `carbonCopies` to be an array in the JSON string but got `%s`", jsonObj.get("carbonCopies").toString()));
          }

          // validate the optional field `carbonCopies` (array)
          for (int i = 0; i < jsonArraycarbonCopies.size(); i++) {
            EsignatureDocusignCarbonCopy.validateJsonObject(jsonArraycarbonCopies.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("recipientTabs") != null && !jsonObj.get("recipientTabs").isJsonNull()) {
        JsonArray jsonArrayrecipientTabs = jsonObj.getAsJsonArray("recipientTabs");
        if (jsonArrayrecipientTabs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("recipientTabs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `recipientTabs` to be an array in the JSON string but got `%s`", jsonObj.get("recipientTabs").toString()));
          }

          // validate the optional field `recipientTabs` (array)
          for (int i = 0; i < jsonArrayrecipientTabs.size(); i++) {
            EsignatureDocusignRecipientTab.validateJsonObject(jsonArrayrecipientTabs.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EsignatureDocusignRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EsignatureDocusignRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EsignatureDocusignRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EsignatureDocusignRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EsignatureDocusignRequest>() {
           @Override
           public void write(JsonWriter out, EsignatureDocusignRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EsignatureDocusignRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EsignatureDocusignRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EsignatureDocusignRequest
  * @throws IOException if the JSON string is invalid with respect to EsignatureDocusignRequest
  */
  public static EsignatureDocusignRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EsignatureDocusignRequest.class);
  }

 /**
  * Convert an instance of EsignatureDocusignRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

