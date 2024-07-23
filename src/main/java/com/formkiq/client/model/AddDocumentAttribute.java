/*
 * FormKiQ API Formkiq API: Document Management Platform API using OAuth(JWT) Authentication You can
 * find out more about FormKiQ at [https://formkiq.com](http://formkiq.com). ## Introduction FormKiQ
 * is an API-first (head-less), battle-tested document management API. The FormKiQ API provides all
 * the API endpoints to build your Perfect Document Management Platform. FormKiQ API was built on
 * top of [OpenAPI specification](https://www.openapis.org), so it is easy to use the API spec file
 * with any application that supports the OpenAPI specification. Open API OAuth Specification -
 * https://raw.githubusercontent.com/formkiq/formkiq-core/master/docs/openapi/openapi-jwt.yaml Open
 * API IAM Specification -
 * https://raw.githubusercontent.com/formkiq/formkiq-core/master/docs/openapi/openapi-iam.yaml ##
 * Authentication FormKiQ offers three forms of authentication: - OAuth(JWT) - AWS IAM - API Key
 *
 * The version of the OpenAPI document: 1.15.1 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import com.formkiq.client.model.AddDocumentAttributeClassification;
import com.formkiq.client.model.AddDocumentAttributeStandard;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import com.formkiq.client.invoker.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-07-22T23:17:53.660045-05:00[America/Winnipeg]",
    comments = "Generator version: 7.7.0")
public class AddDocumentAttribute extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(AddDocumentAttribute.class.getName());

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!AddDocumentAttribute.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'AddDocumentAttribute' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<AddDocumentAttributeStandard> adapterAddDocumentAttributeStandard =
          gson.getDelegateAdapter(this, TypeToken.get(AddDocumentAttributeStandard.class));
      final TypeAdapter<AddDocumentAttributeClassification> adapterAddDocumentAttributeClassification =
          gson.getDelegateAdapter(this, TypeToken.get(AddDocumentAttributeClassification.class));

      return (TypeAdapter<T>) new TypeAdapter<AddDocumentAttribute>() {
        @Override
        public void write(JsonWriter out, AddDocumentAttribute value) throws IOException {
          if (value == null || value.getActualInstance() == null) {
            elementAdapter.write(out, null);
            return;
          }

          // check if the actual instance is of the type `AddDocumentAttributeStandard`
          if (value.getActualInstance() instanceof AddDocumentAttributeStandard) {
            JsonElement element = adapterAddDocumentAttributeStandard
                .toJsonTree((AddDocumentAttributeStandard) value.getActualInstance());
            elementAdapter.write(out, element);
            return;
          }
          // check if the actual instance is of the type `AddDocumentAttributeClassification`
          if (value.getActualInstance() instanceof AddDocumentAttributeClassification) {
            JsonElement element = adapterAddDocumentAttributeClassification
                .toJsonTree((AddDocumentAttributeClassification) value.getActualInstance());
            elementAdapter.write(out, element);
            return;
          }
          throw new IOException(
              "Failed to serialize as the type doesn't match oneOf schemas: AddDocumentAttributeClassification, AddDocumentAttributeStandard");
        }

        @Override
        public AddDocumentAttribute read(JsonReader in) throws IOException {
          Object deserialized = null;
          JsonElement jsonElement = elementAdapter.read(in);

          int match = 0;
          ArrayList<String> errorMessages = new ArrayList<>();
          TypeAdapter actualAdapter = elementAdapter;

          // deserialize AddDocumentAttributeStandard
          try {
            // validate the JSON object to see if any exception is thrown
            AddDocumentAttributeStandard.validateJsonElement(jsonElement);
            actualAdapter = adapterAddDocumentAttributeStandard;
            match++;
            log.log(Level.FINER, "Input data matches schema 'AddDocumentAttributeStandard'");
          } catch (Exception e) {
            // deserialization failed, continue
            errorMessages.add(
                String.format("Deserialization for AddDocumentAttributeStandard failed with `%s`.",
                    e.getMessage()));
            log.log(Level.FINER, "Input data does not match schema 'AddDocumentAttributeStandard'",
                e);
          }
          // deserialize AddDocumentAttributeClassification
          try {
            // validate the JSON object to see if any exception is thrown
            AddDocumentAttributeClassification.validateJsonElement(jsonElement);
            actualAdapter = adapterAddDocumentAttributeClassification;
            match++;
            log.log(Level.FINER, "Input data matches schema 'AddDocumentAttributeClassification'");
          } catch (Exception e) {
            // deserialization failed, continue
            errorMessages.add(String.format(
                "Deserialization for AddDocumentAttributeClassification failed with `%s`.",
                e.getMessage()));
            log.log(Level.FINER,
                "Input data does not match schema 'AddDocumentAttributeClassification'", e);
          }

          if (match == 1) {
            AddDocumentAttribute ret = new AddDocumentAttribute();
            ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
            return ret;
          }

          throw new IOException(String.format(
              "Failed deserialization for AddDocumentAttribute: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s",
              match, errorMessages, jsonElement.toString()));
        }
      }.nullSafe();
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

  public AddDocumentAttribute() {
    super("oneOf", Boolean.FALSE);
  }

  public AddDocumentAttribute(Object o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("AddDocumentAttributeStandard", AddDocumentAttributeStandard.class);
    schemas.put("AddDocumentAttributeClassification", AddDocumentAttributeClassification.class);
  }

  @Override
  public Map<String, Class<?>> getSchemas() {
    return AddDocumentAttribute.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: AddDocumentAttributeClassification,
   * AddDocumentAttributeStandard
   *
   * It could be an instance of the 'oneOf' schemas.
   */
  @Override
  public void setActualInstance(Object instance) {
    if (instance instanceof AddDocumentAttributeStandard) {
      super.setActualInstance(instance);
      return;
    }

    if (instance instanceof AddDocumentAttributeClassification) {
      super.setActualInstance(instance);
      return;
    }

    throw new RuntimeException(
        "Invalid instance type. Must be AddDocumentAttributeClassification, AddDocumentAttributeStandard");
  }

  /**
   * Get the actual instance, which can be the following: AddDocumentAttributeClassification,
   * AddDocumentAttributeStandard
   *
   * @return The actual instance (AddDocumentAttributeClassification, AddDocumentAttributeStandard)
   */
  @SuppressWarnings("unchecked")
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `AddDocumentAttributeStandard`. If the actual instance is not
   * `AddDocumentAttributeStandard`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `AddDocumentAttributeStandard`
   * @throws ClassCastException if the instance is not `AddDocumentAttributeStandard`
   */
  public AddDocumentAttributeStandard getAddDocumentAttributeStandard() throws ClassCastException {
    return (AddDocumentAttributeStandard) super.getActualInstance();
  }

  /**
   * Get the actual instance of `AddDocumentAttributeClassification`. If the actual instance is not
   * `AddDocumentAttributeClassification`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `AddDocumentAttributeClassification`
   * @throws ClassCastException if the instance is not `AddDocumentAttributeClassification`
   */
  public AddDocumentAttributeClassification getAddDocumentAttributeClassification()
      throws ClassCastException {
    return (AddDocumentAttributeClassification) super.getActualInstance();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AddDocumentAttribute
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with AddDocumentAttributeStandard
    try {
      AddDocumentAttributeStandard.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format(
          "Deserialization for AddDocumentAttributeStandard failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with AddDocumentAttributeClassification
    try {
      AddDocumentAttributeClassification.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(
          String.format("Deserialization for AddDocumentAttributeClassification failed with `%s`.",
              e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format(
          "The JSON string is invalid for AddDocumentAttribute with oneOf schemas: AddDocumentAttributeClassification, AddDocumentAttributeStandard. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s",
          validCount, errorMessages, jsonElement.toString()));
    }
  }

  /**
   * Create an instance of AddDocumentAttribute given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AddDocumentAttribute
   * @throws IOException if the JSON string is invalid with respect to AddDocumentAttribute
   */
  public static AddDocumentAttribute fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddDocumentAttribute.class);
  }

  /**
   * Convert an instance of AddDocumentAttribute to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

