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
 * The version of the OpenAPI document: 1.16.0 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import com.formkiq.client.model.DocusignEnvironment;
import com.formkiq.client.model.DocusignInpersonSigner;
import com.formkiq.client.model.DocusignNotification;
import com.formkiq.client.model.DocusignSigner;
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
 * AddDocusignEnvelopesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-11-12T21:03:32.853177-06:00[America/Winnipeg]",
    comments = "Generator version: 7.9.0")
public class AddDocusignEnvelopesRequest {
  public static final String SERIALIZED_NAME_EMAIL_SUBJECT = "emailSubject";
  @SerializedName(SERIALIZED_NAME_EMAIL_SUBJECT)
  private String emailSubject;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private DocusignEnvironment environment;

  public static final String SERIALIZED_NAME_SIGNERS = "signers";
  @SerializedName(SERIALIZED_NAME_SIGNERS)
  private List<DocusignSigner> signers = new ArrayList<>();

  public static final String SERIALIZED_NAME_INPERSON_SIGNERS = "inpersonSigners";
  @SerializedName(SERIALIZED_NAME_INPERSON_SIGNERS)
  private List<DocusignInpersonSigner> inpersonSigners = new ArrayList<>();

  public static final String SERIALIZED_NAME_NOTIFICATION = "notification";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION)
  private DocusignNotification notification;

  public AddDocusignEnvelopesRequest() {}

  public AddDocusignEnvelopesRequest emailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
    return this;
  }

  /**
   * The subject line of the email message that is sent to all recipients
   * 
   * @return emailSubject
   */
  @javax.annotation.Nullable
  public String getEmailSubject() {
    return emailSubject;
  }

  public void setEmailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
  }


  public AddDocusignEnvelopesRequest environment(DocusignEnvironment environment) {
    this.environment = environment;
    return this;
  }

  /**
   * Get environment
   * 
   * @return environment
   */
  @javax.annotation.Nonnull
  public DocusignEnvironment getEnvironment() {
    return environment;
  }

  public void setEnvironment(DocusignEnvironment environment) {
    this.environment = environment;
  }


  public AddDocusignEnvelopesRequest signers(List<DocusignSigner> signers) {
    this.signers = signers;
    return this;
  }

  public AddDocusignEnvelopesRequest addSignersItem(DocusignSigner signersItem) {
    if (this.signers == null) {
      this.signers = new ArrayList<>();
    }
    this.signers.add(signersItem);
    return this;
  }

  /**
   * List of DocuSign Signers
   * 
   * @return signers
   */
  @javax.annotation.Nullable
  public List<DocusignSigner> getSigners() {
    return signers;
  }

  public void setSigners(List<DocusignSigner> signers) {
    this.signers = signers;
  }


  public AddDocusignEnvelopesRequest inpersonSigners(List<DocusignInpersonSigner> inpersonSigners) {
    this.inpersonSigners = inpersonSigners;
    return this;
  }

  public AddDocusignEnvelopesRequest addInpersonSignersItem(
      DocusignInpersonSigner inpersonSignersItem) {
    if (this.inpersonSigners == null) {
      this.inpersonSigners = new ArrayList<>();
    }
    this.inpersonSigners.add(inpersonSignersItem);
    return this;
  }

  /**
   * List of DocuSign Inperson Signers
   * 
   * @return inpersonSigners
   */
  @javax.annotation.Nullable
  public List<DocusignInpersonSigner> getInpersonSigners() {
    return inpersonSigners;
  }

  public void setInpersonSigners(List<DocusignInpersonSigner> inpersonSigners) {
    this.inpersonSigners = inpersonSigners;
  }


  public AddDocusignEnvelopesRequest notification(DocusignNotification notification) {
    this.notification = notification;
    return this;
  }

  /**
   * Get notification
   * 
   * @return notification
   */
  @javax.annotation.Nullable
  public DocusignNotification getNotification() {
    return notification;
  }

  public void setNotification(DocusignNotification notification) {
    this.notification = notification;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddDocusignEnvelopesRequest addDocusignEnvelopesRequest = (AddDocusignEnvelopesRequest) o;
    return Objects.equals(this.emailSubject, addDocusignEnvelopesRequest.emailSubject)
        && Objects.equals(this.environment, addDocusignEnvelopesRequest.environment)
        && Objects.equals(this.signers, addDocusignEnvelopesRequest.signers)
        && Objects.equals(this.inpersonSigners, addDocusignEnvelopesRequest.inpersonSigners)
        && Objects.equals(this.notification, addDocusignEnvelopesRequest.notification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailSubject, environment, signers, inpersonSigners, notification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddDocusignEnvelopesRequest {\n");
    sb.append("    emailSubject: ").append(toIndentedString(emailSubject)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    signers: ").append(toIndentedString(signers)).append("\n");
    sb.append("    inpersonSigners: ").append(toIndentedString(inpersonSigners)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
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
    openapiFields.add("emailSubject");
    openapiFields.add("environment");
    openapiFields.add("signers");
    openapiFields.add("inpersonSigners");
    openapiFields.add("notification");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("environment");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AddDocusignEnvelopesRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!AddDocusignEnvelopesRequest.openapiRequiredFields.isEmpty()) { // has required fields but
                                                                          // JSON element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in AddDocusignEnvelopesRequest is not found in the empty JSON string",
            AddDocusignEnvelopesRequest.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!AddDocusignEnvelopesRequest.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `AddDocusignEnvelopesRequest` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : AddDocusignEnvelopesRequest.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format("The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if ((jsonObj.get("emailSubject") != null && !jsonObj.get("emailSubject").isJsonNull())
        && !jsonObj.get("emailSubject").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `emailSubject` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("emailSubject").toString()));
    }
    // validate the required field `environment`
    DocusignEnvironment.validateJsonElement(jsonObj.get("environment"));
    if (jsonObj.get("signers") != null && !jsonObj.get("signers").isJsonNull()) {
      JsonArray jsonArraysigners = jsonObj.getAsJsonArray("signers");
      if (jsonArraysigners != null) {
        // ensure the json data is an array
        if (!jsonObj.get("signers").isJsonArray()) {
          throw new IllegalArgumentException(String.format(
              "Expected the field `signers` to be an array in the JSON string but got `%s`",
              jsonObj.get("signers").toString()));
        }

        // validate the optional field `signers` (array)
        for (int i = 0; i < jsonArraysigners.size(); i++) {
          DocusignSigner.validateJsonElement(jsonArraysigners.get(i));
        } ;
      }
    }
    if (jsonObj.get("inpersonSigners") != null && !jsonObj.get("inpersonSigners").isJsonNull()) {
      JsonArray jsonArrayinpersonSigners = jsonObj.getAsJsonArray("inpersonSigners");
      if (jsonArrayinpersonSigners != null) {
        // ensure the json data is an array
        if (!jsonObj.get("inpersonSigners").isJsonArray()) {
          throw new IllegalArgumentException(String.format(
              "Expected the field `inpersonSigners` to be an array in the JSON string but got `%s`",
              jsonObj.get("inpersonSigners").toString()));
        }

        // validate the optional field `inpersonSigners` (array)
        for (int i = 0; i < jsonArrayinpersonSigners.size(); i++) {
          DocusignInpersonSigner.validateJsonElement(jsonArrayinpersonSigners.get(i));
        } ;
      }
    }
    // validate the optional field `notification`
    if (jsonObj.get("notification") != null && !jsonObj.get("notification").isJsonNull()) {
      DocusignNotification.validateJsonElement(jsonObj.get("notification"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!AddDocusignEnvelopesRequest.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'AddDocusignEnvelopesRequest' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<AddDocusignEnvelopesRequest> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(AddDocusignEnvelopesRequest.class));

      return (TypeAdapter<T>) new TypeAdapter<AddDocusignEnvelopesRequest>() {
        @Override
        public void write(JsonWriter out, AddDocusignEnvelopesRequest value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public AddDocusignEnvelopesRequest read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of AddDocusignEnvelopesRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AddDocusignEnvelopesRequest
   * @throws IOException if the JSON string is invalid with respect to AddDocusignEnvelopesRequest
   */
  public static AddDocusignEnvelopesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddDocusignEnvelopesRequest.class);
  }

  /**
   * Convert an instance of AddDocusignEnvelopesRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

