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
 * DocusignSigner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-11-12T21:03:32.853177-06:00[America/Winnipeg]",
    comments = "Generator version: 7.9.0")
public class DocusignSigner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_CLIENT_USER_ID = "clientUserId";
  @SerializedName(SERIALIZED_NAME_CLIENT_USER_ID)
  private String clientUserId;

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

  public DocusignSigner() {}

  public DocusignSigner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of Signer
   * 
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public DocusignSigner email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email of Signer
   * 
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public DocusignSigner clientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
    return this;
  }

  /**
   * Specifies unique identifier for signer
   * 
   * @return clientUserId
   */
  @javax.annotation.Nullable
  public String getClientUserId() {
    return clientUserId;
  }

  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }


  public DocusignSigner recipientId(String recipientId) {
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


  public DocusignSigner routingOrder(String routingOrder) {
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


  public DocusignSigner suppressEmails(String suppressEmails) {
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


  public DocusignSigner tabs(DocusignSigningTabs tabs) {
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
    DocusignSigner docusignSigner = (DocusignSigner) o;
    return Objects.equals(this.name, docusignSigner.name)
        && Objects.equals(this.email, docusignSigner.email)
        && Objects.equals(this.clientUserId, docusignSigner.clientUserId)
        && Objects.equals(this.recipientId, docusignSigner.recipientId)
        && Objects.equals(this.routingOrder, docusignSigner.routingOrder)
        && Objects.equals(this.suppressEmails, docusignSigner.suppressEmails)
        && Objects.equals(this.tabs, docusignSigner.tabs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email, clientUserId, recipientId, routingOrder, suppressEmails, tabs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocusignSigner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("email");
    openapiFields.add("clientUserId");
    openapiFields.add("recipientId");
    openapiFields.add("routingOrder");
    openapiFields.add("suppressEmails");
    openapiFields.add("tabs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocusignSigner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!DocusignSigner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element
                                                             // is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in DocusignSigner is not found in the empty JSON string",
            DocusignSigner.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!DocusignSigner.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `DocusignSigner` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : DocusignSigner.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format("The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if (!jsonObj.get("name").isJsonPrimitive()) {
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
    if ((jsonObj.get("clientUserId") != null && !jsonObj.get("clientUserId").isJsonNull())
        && !jsonObj.get("clientUserId").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `clientUserId` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("clientUserId").toString()));
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
      if (!DocusignSigner.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'DocusignSigner' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<DocusignSigner> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(DocusignSigner.class));

      return (TypeAdapter<T>) new TypeAdapter<DocusignSigner>() {
        @Override
        public void write(JsonWriter out, DocusignSigner value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public DocusignSigner read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of DocusignSigner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocusignSigner
   * @throws IOException if the JSON string is invalid with respect to DocusignSigner
   */
  public static DocusignSigner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocusignSigner.class);
  }

  /**
   * Convert an instance of DocusignSigner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

