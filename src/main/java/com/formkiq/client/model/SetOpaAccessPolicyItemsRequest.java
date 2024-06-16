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
 * The version of the OpenAPI document: 1.15.0 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import com.formkiq.client.model.OpaPolicyItem;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.formkiq.client.invoker.JSON;

/**
 * SetOpaAccessPolicyItemsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-06-15T22:51:11.836217-05:00[America/Winnipeg]",
    comments = "Generator version: 7.6.0")
public class SetOpaAccessPolicyItemsRequest {
  public static final String SERIALIZED_NAME_POLICY_ITEMS = "policyItems";
  @SerializedName(SERIALIZED_NAME_POLICY_ITEMS)
  private List<OpaPolicyItem> policyItems = new ArrayList<>();

  public SetOpaAccessPolicyItemsRequest() {}

  public SetOpaAccessPolicyItemsRequest policyItems(List<OpaPolicyItem> policyItems) {
    this.policyItems = policyItems;
    return this;
  }

  public SetOpaAccessPolicyItemsRequest addPolicyItemsItem(OpaPolicyItem policyItemsItem) {
    if (this.policyItems == null) {
      this.policyItems = new ArrayList<>();
    }
    this.policyItems.add(policyItemsItem);
    return this;
  }

  /**
   * List of OPA policy items
   * 
   * @return policyItems
   **/
  @javax.annotation.Nullable
  public List<OpaPolicyItem> getPolicyItems() {
    return policyItems;
  }

  public void setPolicyItems(List<OpaPolicyItem> policyItems) {
    this.policyItems = policyItems;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetOpaAccessPolicyItemsRequest setOpaAccessPolicyItemsRequest =
        (SetOpaAccessPolicyItemsRequest) o;
    return Objects.equals(this.policyItems, setOpaAccessPolicyItemsRequest.policyItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetOpaAccessPolicyItemsRequest {\n");
    sb.append("    policyItems: ").append(toIndentedString(policyItems)).append("\n");
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
    openapiFields.add("policyItems");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to
   *         SetOpaAccessPolicyItemsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!SetOpaAccessPolicyItemsRequest.openapiRequiredFields.isEmpty()) { // has required fields
                                                                             // but JSON element is
                                                                             // null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in SetOpaAccessPolicyItemsRequest is not found in the empty JSON string",
            SetOpaAccessPolicyItemsRequest.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!SetOpaAccessPolicyItemsRequest.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `SetOpaAccessPolicyItemsRequest` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if (jsonObj.get("policyItems") != null && !jsonObj.get("policyItems").isJsonNull()) {
      JsonArray jsonArraypolicyItems = jsonObj.getAsJsonArray("policyItems");
      if (jsonArraypolicyItems != null) {
        // ensure the json data is an array
        if (!jsonObj.get("policyItems").isJsonArray()) {
          throw new IllegalArgumentException(String.format(
              "Expected the field `policyItems` to be an array in the JSON string but got `%s`",
              jsonObj.get("policyItems").toString()));
        }

        // validate the optional field `policyItems` (array)
        for (int i = 0; i < jsonArraypolicyItems.size(); i++) {
          OpaPolicyItem.validateJsonElement(jsonArraypolicyItems.get(i));
        } ;
      }
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!SetOpaAccessPolicyItemsRequest.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'SetOpaAccessPolicyItemsRequest' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<SetOpaAccessPolicyItemsRequest> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(SetOpaAccessPolicyItemsRequest.class));

      return (TypeAdapter<T>) new TypeAdapter<SetOpaAccessPolicyItemsRequest>() {
        @Override
        public void write(JsonWriter out, SetOpaAccessPolicyItemsRequest value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public SetOpaAccessPolicyItemsRequest read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of SetOpaAccessPolicyItemsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SetOpaAccessPolicyItemsRequest
   * @throws IOException if the JSON string is invalid with respect to
   *         SetOpaAccessPolicyItemsRequest
   */
  public static SetOpaAccessPolicyItemsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SetOpaAccessPolicyItemsRequest.class);
  }

  /**
   * Convert an instance of SetOpaAccessPolicyItemsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

