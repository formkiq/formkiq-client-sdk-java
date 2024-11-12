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
import com.formkiq.client.model.DocusignSigningTabs;
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
 * DocusignInpersonSigner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-11-11T22:01:15.097051-06:00[America/Winnipeg]",
    comments = "Generator version: 7.9.0")
public class DocusignInpersonSigner {
  public static final String SERIALIZED_NAME_HOST_EMAIL = "hostEmail";
  @SerializedName(SERIALIZED_NAME_HOST_EMAIL)
  private String hostEmail;

  public static final String SERIALIZED_NAME_HOST_NAME = "hostName";
  @SerializedName(SERIALIZED_NAME_HOST_NAME)
  private String hostName;

  public static final String SERIALIZED_NAME_SIGNER_NAME = "signerName";
  @SerializedName(SERIALIZED_NAME_SIGNER_NAME)
  private String signerName;

  public static final String SERIALIZED_NAME_SIGNER_EMAIL = "signerEmail";
  @SerializedName(SERIALIZED_NAME_SIGNER_EMAIL)
  private String signerEmail;

  public static final String SERIALIZED_NAME_RECIPIENT_ID = "recipientId";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_ID)
  private String recipientId;

  public static final String SERIALIZED_NAME_ROUTING_ORDER = "routingOrder";
  @SerializedName(SERIALIZED_NAME_ROUTING_ORDER)
  private String routingOrder;

  public static final String SERIALIZED_NAME_SUPPRESS_EMAILS = "suppressEmails";
  @SerializedName(SERIALIZED_NAME_SUPPRESS_EMAILS)
  private String suppressEmails;

  public static final String SERIALIZED_NAME_TABS = "tabs";
  @SerializedName(SERIALIZED_NAME_TABS)
  private DocusignSigningTabs tabs;

  public DocusignInpersonSigner() {}

  public DocusignInpersonSigner hostEmail(String hostEmail) {
    this.hostEmail = hostEmail;
    return this;
  }

  /**
   * The email of the signing host
   * 
   * @return hostEmail
   */
  @javax.annotation.Nonnull
  public String getHostEmail() {
    return hostEmail;
  }

  public void setHostEmail(String hostEmail) {
    this.hostEmail = hostEmail;
  }


  public DocusignInpersonSigner hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

  /**
   * The name of the signing host
   * 
   * @return hostName
   */
  @javax.annotation.Nonnull
  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }


  public DocusignInpersonSigner signerName(String signerName) {
    this.signerName = signerName;
    return this;
  }

  /**
   * The full legal name of a signer
   * 
   * @return signerName
   */
  @javax.annotation.Nonnull
  public String getSignerName() {
    return signerName;
  }

  public void setSignerName(String signerName) {
    this.signerName = signerName;
  }


  public DocusignInpersonSigner signerEmail(String signerEmail) {
    this.signerEmail = signerEmail;
    return this;
  }

  /**
   * The in-person signer&#39;s email address
   * 
   * @return signerEmail
   */
  @javax.annotation.Nullable
  public String getSignerEmail() {
    return signerEmail;
  }

  public void setSignerEmail(String signerEmail) {
    this.signerEmail = signerEmail;
  }


  public DocusignInpersonSigner recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

  /**
   * A reference used to map recipients to other objects, such as specific document tabs.
   * 
   * @return recipientId
   */
  @javax.annotation.Nullable
  public String getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }


  public DocusignInpersonSigner routingOrder(String routingOrder) {
    this.routingOrder = routingOrder;
    return this;
  }

  /**
   * Specifies the routing order of the recipient in the envelope.
   * 
   * @return routingOrder
   */
  @javax.annotation.Nullable
  public String getRoutingOrder() {
    return routingOrder;
  }

  public void setRoutingOrder(String routingOrder) {
    this.routingOrder = routingOrder;
  }


  public DocusignInpersonSigner suppressEmails(String suppressEmails) {
    this.suppressEmails = suppressEmails;
    return this;
  }

  /**
   * When true, email notifications are suppressed for the recipient, and they must access envelopes
   * and documents from their Docusign inbox.
   * 
   * @return suppressEmails
   */
  @javax.annotation.Nullable
  public String getSuppressEmails() {
    return suppressEmails;
  }

  public void setSuppressEmails(String suppressEmails) {
    this.suppressEmails = suppressEmails;
  }


  public DocusignInpersonSigner tabs(DocusignSigningTabs tabs) {
    this.tabs = tabs;
    return this;
  }

  /**
   * Get tabs
   * 
   * @return tabs
   */
  @javax.annotation.Nullable
  public DocusignSigningTabs getTabs() {
    return tabs;
  }

  public void setTabs(DocusignSigningTabs tabs) {
    this.tabs = tabs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocusignInpersonSigner docusignInpersonSigner = (DocusignInpersonSigner) o;
    return Objects.equals(this.hostEmail, docusignInpersonSigner.hostEmail)
        && Objects.equals(this.hostName, docusignInpersonSigner.hostName)
        && Objects.equals(this.signerName, docusignInpersonSigner.signerName)
        && Objects.equals(this.signerEmail, docusignInpersonSigner.signerEmail)
        && Objects.equals(this.recipientId, docusignInpersonSigner.recipientId)
        && Objects.equals(this.routingOrder, docusignInpersonSigner.routingOrder)
        && Objects.equals(this.suppressEmails, docusignInpersonSigner.suppressEmails)
        && Objects.equals(this.tabs, docusignInpersonSigner.tabs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostEmail, hostName, signerName, signerEmail, recipientId, routingOrder,
        suppressEmails, tabs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocusignInpersonSigner {\n");
    sb.append("    hostEmail: ").append(toIndentedString(hostEmail)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    signerName: ").append(toIndentedString(signerName)).append("\n");
    sb.append("    signerEmail: ").append(toIndentedString(signerEmail)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    routingOrder: ").append(toIndentedString(routingOrder)).append("\n");
    sb.append("    suppressEmails: ").append(toIndentedString(suppressEmails)).append("\n");
    sb.append("    tabs: ").append(toIndentedString(tabs)).append("\n");
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
    openapiFields.add("hostEmail");
    openapiFields.add("hostName");
    openapiFields.add("signerName");
    openapiFields.add("signerEmail");
    openapiFields.add("recipientId");
    openapiFields.add("routingOrder");
    openapiFields.add("suppressEmails");
    openapiFields.add("tabs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("hostEmail");
    openapiRequiredFields.add("hostName");
    openapiRequiredFields.add("signerName");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocusignInpersonSigner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!DocusignInpersonSigner.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                                     // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in DocusignInpersonSigner is not found in the empty JSON string",
            DocusignInpersonSigner.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!DocusignInpersonSigner.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `DocusignInpersonSigner` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : DocusignInpersonSigner.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format("The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if (!jsonObj.get("hostEmail").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `hostEmail` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("hostEmail").toString()));
    }
    if (!jsonObj.get("hostName").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `hostName` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("hostName").toString()));
    }
    if (!jsonObj.get("signerName").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `signerName` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("signerName").toString()));
    }
    if ((jsonObj.get("signerEmail") != null && !jsonObj.get("signerEmail").isJsonNull())
        && !jsonObj.get("signerEmail").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `signerEmail` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("signerEmail").toString()));
    }
    if ((jsonObj.get("recipientId") != null && !jsonObj.get("recipientId").isJsonNull())
        && !jsonObj.get("recipientId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `recipientId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("recipientId").toString()));
    }
    if ((jsonObj.get("routingOrder") != null && !jsonObj.get("routingOrder").isJsonNull())
        && !jsonObj.get("routingOrder").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `routingOrder` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("routingOrder").toString()));
    }
    if ((jsonObj.get("suppressEmails") != null && !jsonObj.get("suppressEmails").isJsonNull())
        && !jsonObj.get("suppressEmails").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `suppressEmails` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("suppressEmails").toString()));
    }
    // validate the optional field `tabs`
    if (jsonObj.get("tabs") != null && !jsonObj.get("tabs").isJsonNull()) {
      DocusignSigningTabs.validateJsonElement(jsonObj.get("tabs"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!DocusignInpersonSigner.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'DocusignInpersonSigner' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<DocusignInpersonSigner> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(DocusignInpersonSigner.class));

      return (TypeAdapter<T>) new TypeAdapter<DocusignInpersonSigner>() {
        @Override
        public void write(JsonWriter out, DocusignInpersonSigner value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public DocusignInpersonSigner read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of DocusignInpersonSigner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocusignInpersonSigner
   * @throws IOException if the JSON string is invalid with respect to DocusignInpersonSigner
   */
  public static DocusignInpersonSigner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocusignInpersonSigner.class);
  }

  /**
   * Convert an instance of DocusignInpersonSigner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

