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
 * The version of the OpenAPI document: 1.17.0 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.model;

import java.util.Objects;
import com.formkiq.client.model.DocumentWorkflow;
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
 * GetDocumentWorkflowsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2025-03-12T17:17:25.165880-05:00[America/Winnipeg]",
    comments = "Generator version: 7.12.0")
public class GetDocumentWorkflowsResponse {
  public static final String SERIALIZED_NAME_WORKFLOWS = "workflows";
  @SerializedName(SERIALIZED_NAME_WORKFLOWS)
  @javax.annotation.Nullable
  private List<DocumentWorkflow> workflows = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  @javax.annotation.Nullable
  private String next;

  public GetDocumentWorkflowsResponse() {}

  public GetDocumentWorkflowsResponse workflows(
      @javax.annotation.Nullable List<DocumentWorkflow> workflows) {
    this.workflows = workflows;
    return this;
  }

  public GetDocumentWorkflowsResponse addWorkflowsItem(DocumentWorkflow workflowsItem) {
    if (this.workflows == null) {
      this.workflows = new ArrayList<>();
    }
    this.workflows.add(workflowsItem);
    return this;
  }

  /**
   * List of Document Workflows
   * 
   * @return workflows
   */
  @javax.annotation.Nullable
  public List<DocumentWorkflow> getWorkflows() {
    return workflows;
  }

  public void setWorkflows(@javax.annotation.Nullable List<DocumentWorkflow> workflows) {
    this.workflows = workflows;
  }


  public GetDocumentWorkflowsResponse next(@javax.annotation.Nullable String next) {
    this.next = next;
    return this;
  }

  /**
   * Get next
   * 
   * @return next
   */
  @javax.annotation.Nullable
  public String getNext() {
    return next;
  }

  public void setNext(@javax.annotation.Nullable String next) {
    this.next = next;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocumentWorkflowsResponse getDocumentWorkflowsResponse = (GetDocumentWorkflowsResponse) o;
    return Objects.equals(this.workflows, getDocumentWorkflowsResponse.workflows)
        && Objects.equals(this.next, getDocumentWorkflowsResponse.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflows, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocumentWorkflowsResponse {\n");
    sb.append("    workflows: ").append(toIndentedString(workflows)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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
    openapiFields.add("workflows");
    openapiFields.add("next");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetDocumentWorkflowsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!GetDocumentWorkflowsResponse.openapiRequiredFields.isEmpty()) { // has required fields
                                                                           // but JSON element is
                                                                           // null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in GetDocumentWorkflowsResponse is not found in the empty JSON string",
            GetDocumentWorkflowsResponse.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!GetDocumentWorkflowsResponse.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `GetDocumentWorkflowsResponse` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if (jsonObj.get("workflows") != null && !jsonObj.get("workflows").isJsonNull()) {
      JsonArray jsonArrayworkflows = jsonObj.getAsJsonArray("workflows");
      if (jsonArrayworkflows != null) {
        // ensure the json data is an array
        if (!jsonObj.get("workflows").isJsonArray()) {
          throw new IllegalArgumentException(String.format(
              "Expected the field `workflows` to be an array in the JSON string but got `%s`",
              jsonObj.get("workflows").toString()));
        }

        // validate the optional field `workflows` (array)
        for (int i = 0; i < jsonArrayworkflows.size(); i++) {
          DocumentWorkflow.validateJsonElement(jsonArrayworkflows.get(i));
        } ;
      }
    }
    if ((jsonObj.get("next") != null && !jsonObj.get("next").isJsonNull())
        && !jsonObj.get("next").isJsonPrimitive()) {
      throw new IllegalArgumentException(String.format(
          "Expected the field `next` to be a primitive type in the JSON string but got `%s`",
          jsonObj.get("next").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!GetDocumentWorkflowsResponse.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'GetDocumentWorkflowsResponse' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<GetDocumentWorkflowsResponse> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(GetDocumentWorkflowsResponse.class));

      return (TypeAdapter<T>) new TypeAdapter<GetDocumentWorkflowsResponse>() {
        @Override
        public void write(JsonWriter out, GetDocumentWorkflowsResponse value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public GetDocumentWorkflowsResponse read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of GetDocumentWorkflowsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetDocumentWorkflowsResponse
   * @throws IOException if the JSON string is invalid with respect to GetDocumentWorkflowsResponse
   */
  public static GetDocumentWorkflowsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetDocumentWorkflowsResponse.class);
  }

  /**
   * Convert an instance of GetDocumentWorkflowsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

