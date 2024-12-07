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
 * The version of the OpenAPI document: 1.16.1 Contact: support@formkiq.com
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
import java.math.BigDecimal;
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
 * OcrConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2025-01-10T23:07:47.624119-06:00[America/Winnipeg]",
    comments = "Generator version: 7.10.0")
public class OcrConfig {
  public static final String SERIALIZED_NAME_MAX_PAGES_PER_TRANSACTION = "maxPagesPerTransaction";
  @SerializedName(SERIALIZED_NAME_MAX_PAGES_PER_TRANSACTION)
  @javax.annotation.Nullable
  private BigDecimal maxPagesPerTransaction;

  public static final String SERIALIZED_NAME_MAX_TRANSACTIONS = "maxTransactions";
  @SerializedName(SERIALIZED_NAME_MAX_TRANSACTIONS)
  @javax.annotation.Nullable
  private BigDecimal maxTransactions;

  public OcrConfig() {}

  public OcrConfig maxPagesPerTransaction(
      @javax.annotation.Nullable BigDecimal maxPagesPerTransaction) {
    this.maxPagesPerTransaction = maxPagesPerTransaction;
    return this;
  }

  /**
   * Max number of OCR pages (-1 for unlimited)
   * 
   * @return maxPagesPerTransaction
   */
  @javax.annotation.Nullable
  public BigDecimal getMaxPagesPerTransaction() {
    return maxPagesPerTransaction;
  }

  public void setMaxPagesPerTransaction(
      @javax.annotation.Nullable BigDecimal maxPagesPerTransaction) {
    this.maxPagesPerTransaction = maxPagesPerTransaction;
  }


  public OcrConfig maxTransactions(@javax.annotation.Nullable BigDecimal maxTransactions) {
    this.maxTransactions = maxTransactions;
    return this;
  }

  /**
   * Max number of OCR actions that can be created (-1 for unlimited)
   * 
   * @return maxTransactions
   */
  @javax.annotation.Nullable
  public BigDecimal getMaxTransactions() {
    return maxTransactions;
  }

  public void setMaxTransactions(@javax.annotation.Nullable BigDecimal maxTransactions) {
    this.maxTransactions = maxTransactions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcrConfig ocrConfig = (OcrConfig) o;
    return Objects.equals(this.maxPagesPerTransaction, ocrConfig.maxPagesPerTransaction)
        && Objects.equals(this.maxTransactions, ocrConfig.maxTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxPagesPerTransaction, maxTransactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcrConfig {\n");
    sb.append("    maxPagesPerTransaction: ").append(toIndentedString(maxPagesPerTransaction))
        .append("\n");
    sb.append("    maxTransactions: ").append(toIndentedString(maxTransactions)).append("\n");
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
    openapiFields.add("maxPagesPerTransaction");
    openapiFields.add("maxTransactions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OcrConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!OcrConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is
                                                        // null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in OcrConfig is not found in the empty JSON string",
            OcrConfig.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!OcrConfig.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `OcrConfig` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!OcrConfig.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'OcrConfig' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<OcrConfig> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(OcrConfig.class));

      return (TypeAdapter<T>) new TypeAdapter<OcrConfig>() {
        @Override
        public void write(JsonWriter out, OcrConfig value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public OcrConfig read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of OcrConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OcrConfig
   * @throws IOException if the JSON string is invalid with respect to OcrConfig
   */
  public static OcrConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OcrConfig.class);
  }

  /**
   * Convert an instance of OcrConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

