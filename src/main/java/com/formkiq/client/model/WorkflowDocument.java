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
import com.formkiq.client.model.Document;
import com.formkiq.client.model.WorkflowSummary;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.formkiq.client.invoker.JSON;

/**
 * WorkflowDocument
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-07-04T16:10:39.847247-05:00[America/Winnipeg]",
    comments = "Generator version: 7.7.0")
public class WorkflowDocument {
  public static final String SERIALIZED_NAME_WORKFLOW = "workflow";
  @SerializedName(SERIALIZED_NAME_WORKFLOW)
  private WorkflowSummary workflow;

  public static final String SERIALIZED_NAME_DOCUMENT = "document";
  @SerializedName(SERIALIZED_NAME_DOCUMENT)
  private Document document;

  public WorkflowDocument() {}

  public WorkflowDocument workflow(WorkflowSummary workflow) {
    this.workflow = workflow;
    return this;
  }

  /**
   * Get workflow
   * 
   * @return workflow
   */
  @javax.annotation.Nullable
  public WorkflowSummary getWorkflow() {
    return workflow;
  }

  public void setWorkflow(WorkflowSummary workflow) {
    this.workflow = workflow;
  }


  public WorkflowDocument document(Document document) {
    this.document = document;
    return this;
  }

  /**
   * Get document
   * 
   * @return document
   */
  @javax.annotation.Nullable
  public Document getDocument() {
    return document;
  }

  public void setDocument(Document document) {
    this.document = document;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowDocument workflowDocument = (WorkflowDocument) o;
    return Objects.equals(this.workflow, workflowDocument.workflow)
        && Objects.equals(this.document, workflowDocument.document);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflow, document);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowDocument {\n");
    sb.append("    workflow: ").append(toIndentedString(workflow)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
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
    openapiFields.add("workflow");
    openapiFields.add("document");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WorkflowDocument
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!WorkflowDocument.openapiRequiredFields.isEmpty()) { // has required fields but JSON
                                                               // element is null
        throw new IllegalArgumentException(String.format(
            "The required field(s) %s in WorkflowDocument is not found in the empty JSON string",
            WorkflowDocument.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!WorkflowDocument.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(String.format(
            "The field `%s` in the JSON string is not defined in the `WorkflowDocument` properties. JSON: %s",
            entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the optional field `workflow`
    if (jsonObj.get("workflow") != null && !jsonObj.get("workflow").isJsonNull()) {
      WorkflowSummary.validateJsonElement(jsonObj.get("workflow"));
    }
    // validate the optional field `document`
    if (jsonObj.get("document") != null && !jsonObj.get("document").isJsonNull()) {
      Document.validateJsonElement(jsonObj.get("document"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!WorkflowDocument.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'WorkflowDocument' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<WorkflowDocument> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(WorkflowDocument.class));

      return (TypeAdapter<T>) new TypeAdapter<WorkflowDocument>() {
        @Override
        public void write(JsonWriter out, WorkflowDocument value) throws IOException {
          JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public WorkflowDocument read(JsonReader in) throws IOException {
          JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }

      }.nullSafe();
    }
  }

  /**
   * Create an instance of WorkflowDocument given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WorkflowDocument
   * @throws IOException if the JSON string is invalid with respect to WorkflowDocument
   */
  public static WorkflowDocument fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkflowDocument.class);
  }

  /**
   * Convert an instance of WorkflowDocument to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

