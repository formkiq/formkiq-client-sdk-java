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
import com.formkiq.client.model.AddLocaleResourceClassificationItem;
import com.formkiq.client.model.AddLocaleResourceInterfaceItem;
import com.formkiq.client.model.AddLocaleResourceSchemaItem;
import com.formkiq.client.model.LocaleResourceType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;



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
    date = "2025-05-20T14:44:33.741519-05:00[America/Winnipeg]",
    comments = "Generator version: 7.13.0")
public class AddResourceItem extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(AddResourceItem.class.getName());

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!AddResourceItem.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'AddResourceItem' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<AddLocaleResourceInterfaceItem> adapterAddLocaleResourceInterfaceItem =
          gson.getDelegateAdapter(this, TypeToken.get(AddLocaleResourceInterfaceItem.class));
      final TypeAdapter<AddLocaleResourceSchemaItem> adapterAddLocaleResourceSchemaItem =
          gson.getDelegateAdapter(this, TypeToken.get(AddLocaleResourceSchemaItem.class));
      final TypeAdapter<AddLocaleResourceClassificationItem> adapterAddLocaleResourceClassificationItem =
          gson.getDelegateAdapter(this, TypeToken.get(AddLocaleResourceClassificationItem.class));

      return (TypeAdapter<T>) new TypeAdapter<AddResourceItem>() {
        @Override
        public void write(JsonWriter out, AddResourceItem value) throws IOException {
          if (value == null || value.getActualInstance() == null) {
            elementAdapter.write(out, null);
            return;
          }

          // check if the actual instance is of the type `AddLocaleResourceInterfaceItem`
          if (value.getActualInstance() instanceof AddLocaleResourceInterfaceItem) {
            JsonElement element = adapterAddLocaleResourceInterfaceItem
                .toJsonTree((AddLocaleResourceInterfaceItem) value.getActualInstance());
            elementAdapter.write(out, element);
            return;
          }
          // check if the actual instance is of the type `AddLocaleResourceSchemaItem`
          if (value.getActualInstance() instanceof AddLocaleResourceSchemaItem) {
            JsonElement element = adapterAddLocaleResourceSchemaItem
                .toJsonTree((AddLocaleResourceSchemaItem) value.getActualInstance());
            elementAdapter.write(out, element);
            return;
          }
          // check if the actual instance is of the type `AddLocaleResourceClassificationItem`
          if (value.getActualInstance() instanceof AddLocaleResourceClassificationItem) {
            JsonElement element = adapterAddLocaleResourceClassificationItem
                .toJsonTree((AddLocaleResourceClassificationItem) value.getActualInstance());
            elementAdapter.write(out, element);
            return;
          }
          throw new IOException(
              "Failed to serialize as the type doesn't match oneOf schemas: AddLocaleResourceClassificationItem, AddLocaleResourceInterfaceItem, AddLocaleResourceSchemaItem");
        }

        @Override
        public AddResourceItem read(JsonReader in) throws IOException {
          Object deserialized = null;
          JsonElement jsonElement = elementAdapter.read(in);

          int match = 0;
          ArrayList<String> errorMessages = new ArrayList<>();
          TypeAdapter actualAdapter = elementAdapter;

          // deserialize AddLocaleResourceInterfaceItem
          try {
            // validate the JSON object to see if any exception is thrown
            AddLocaleResourceInterfaceItem.validateJsonElement(jsonElement);
            actualAdapter = adapterAddLocaleResourceInterfaceItem;
            match++;
            log.log(Level.FINER, "Input data matches schema 'AddLocaleResourceInterfaceItem'");
          } catch (Exception e) {
            // deserialization failed, continue
            errorMessages.add(String.format(
                "Deserialization for AddLocaleResourceInterfaceItem failed with `%s`.",
                e.getMessage()));
            log.log(Level.FINER,
                "Input data does not match schema 'AddLocaleResourceInterfaceItem'", e);
          }
          // deserialize AddLocaleResourceSchemaItem
          try {
            // validate the JSON object to see if any exception is thrown
            AddLocaleResourceSchemaItem.validateJsonElement(jsonElement);
            actualAdapter = adapterAddLocaleResourceSchemaItem;
            match++;
            log.log(Level.FINER, "Input data matches schema 'AddLocaleResourceSchemaItem'");
          } catch (Exception e) {
            // deserialization failed, continue
            errorMessages.add(
                String.format("Deserialization for AddLocaleResourceSchemaItem failed with `%s`.",
                    e.getMessage()));
            log.log(Level.FINER, "Input data does not match schema 'AddLocaleResourceSchemaItem'",
                e);
          }
          // deserialize AddLocaleResourceClassificationItem
          try {
            // validate the JSON object to see if any exception is thrown
            AddLocaleResourceClassificationItem.validateJsonElement(jsonElement);
            actualAdapter = adapterAddLocaleResourceClassificationItem;
            match++;
            log.log(Level.FINER, "Input data matches schema 'AddLocaleResourceClassificationItem'");
          } catch (Exception e) {
            // deserialization failed, continue
            errorMessages.add(String.format(
                "Deserialization for AddLocaleResourceClassificationItem failed with `%s`.",
                e.getMessage()));
            log.log(Level.FINER,
                "Input data does not match schema 'AddLocaleResourceClassificationItem'", e);
          }

          if (match == 1) {
            AddResourceItem ret = new AddResourceItem();
            ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
            return ret;
          }

          throw new IOException(String.format(
              "Failed deserialization for AddResourceItem: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s",
              match, errorMessages, jsonElement.toString()));
        }
      }.nullSafe();
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

  public AddResourceItem() {
    super("oneOf", Boolean.FALSE);
  }

  public AddResourceItem(Object o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("AddLocaleResourceInterfaceItem", AddLocaleResourceInterfaceItem.class);
    schemas.put("AddLocaleResourceSchemaItem", AddLocaleResourceSchemaItem.class);
    schemas.put("AddLocaleResourceClassificationItem", AddLocaleResourceClassificationItem.class);
  }

  @Override
  public Map<String, Class<?>> getSchemas() {
    return AddResourceItem.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: AddLocaleResourceClassificationItem,
   * AddLocaleResourceInterfaceItem, AddLocaleResourceSchemaItem
   *
   * It could be an instance of the 'oneOf' schemas.
   */
  @Override
  public void setActualInstance(Object instance) {
    if (instance instanceof AddLocaleResourceInterfaceItem) {
      super.setActualInstance(instance);
      return;
    }

    if (instance instanceof AddLocaleResourceSchemaItem) {
      super.setActualInstance(instance);
      return;
    }

    if (instance instanceof AddLocaleResourceClassificationItem) {
      super.setActualInstance(instance);
      return;
    }

    throw new RuntimeException(
        "Invalid instance type. Must be AddLocaleResourceClassificationItem, AddLocaleResourceInterfaceItem, AddLocaleResourceSchemaItem");
  }

  /**
   * Get the actual instance, which can be the following: AddLocaleResourceClassificationItem,
   * AddLocaleResourceInterfaceItem, AddLocaleResourceSchemaItem
   *
   * @return The actual instance (AddLocaleResourceClassificationItem,
   *         AddLocaleResourceInterfaceItem, AddLocaleResourceSchemaItem)
   */
  @SuppressWarnings("unchecked")
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `AddLocaleResourceInterfaceItem`. If the actual instance is not
   * `AddLocaleResourceInterfaceItem`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `AddLocaleResourceInterfaceItem`
   * @throws ClassCastException if the instance is not `AddLocaleResourceInterfaceItem`
   */
  public AddLocaleResourceInterfaceItem getAddLocaleResourceInterfaceItem()
      throws ClassCastException {
    return (AddLocaleResourceInterfaceItem) super.getActualInstance();
  }

  /**
   * Get the actual instance of `AddLocaleResourceSchemaItem`. If the actual instance is not
   * `AddLocaleResourceSchemaItem`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `AddLocaleResourceSchemaItem`
   * @throws ClassCastException if the instance is not `AddLocaleResourceSchemaItem`
   */
  public AddLocaleResourceSchemaItem getAddLocaleResourceSchemaItem() throws ClassCastException {
    return (AddLocaleResourceSchemaItem) super.getActualInstance();
  }

  /**
   * Get the actual instance of `AddLocaleResourceClassificationItem`. If the actual instance is not
   * `AddLocaleResourceClassificationItem`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `AddLocaleResourceClassificationItem`
   * @throws ClassCastException if the instance is not `AddLocaleResourceClassificationItem`
   */
  public AddLocaleResourceClassificationItem getAddLocaleResourceClassificationItem()
      throws ClassCastException {
    return (AddLocaleResourceClassificationItem) super.getActualInstance();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AddResourceItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with AddLocaleResourceInterfaceItem
    try {
      AddLocaleResourceInterfaceItem.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format(
          "Deserialization for AddLocaleResourceInterfaceItem failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with AddLocaleResourceSchemaItem
    try {
      AddLocaleResourceSchemaItem.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format(
          "Deserialization for AddLocaleResourceSchemaItem failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with AddLocaleResourceClassificationItem
    try {
      AddLocaleResourceClassificationItem.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(
          String.format("Deserialization for AddLocaleResourceClassificationItem failed with `%s`.",
              e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format(
          "The JSON string is invalid for AddResourceItem with oneOf schemas: AddLocaleResourceClassificationItem, AddLocaleResourceInterfaceItem, AddLocaleResourceSchemaItem. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s",
          validCount, errorMessages, jsonElement.toString()));
    }
  }

  /**
   * Create an instance of AddResourceItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AddResourceItem
   * @throws IOException if the JSON string is invalid with respect to AddResourceItem
   */
  public static AddResourceItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddResourceItem.class);
  }

  /**
   * Convert an instance of AddResourceItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

