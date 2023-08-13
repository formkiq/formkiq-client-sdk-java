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
import com.formkiq.client.model.DocumentAction;
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
 * GetDocumentActionsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-13T16:50:34.870897-05:00[America/Winnipeg]")
public class GetDocumentActionsResponse {
  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<DocumentAction> actions;

  public GetDocumentActionsResponse() {
  }

  public GetDocumentActionsResponse actions(List<DocumentAction> actions) {
    
    this.actions = actions;
    return this;
  }

  public GetDocumentActionsResponse addActionsItem(DocumentAction actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * List of document actions
   * @return actions
  **/
  @javax.annotation.Nullable
  public List<DocumentAction> getActions() {
    return actions;
  }


  public void setActions(List<DocumentAction> actions) {
    this.actions = actions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocumentActionsResponse getDocumentActionsResponse = (GetDocumentActionsResponse) o;
    return Objects.equals(this.actions, getDocumentActionsResponse.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocumentActionsResponse {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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
    openapiFields.add("actions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetDocumentActionsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetDocumentActionsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetDocumentActionsResponse is not found in the empty JSON string", GetDocumentActionsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetDocumentActionsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetDocumentActionsResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("actions") != null && !jsonObj.get("actions").isJsonNull()) {
        JsonArray jsonArrayactions = jsonObj.getAsJsonArray("actions");
        if (jsonArrayactions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("actions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `actions` to be an array in the JSON string but got `%s`", jsonObj.get("actions").toString()));
          }

          // validate the optional field `actions` (array)
          for (int i = 0; i < jsonArrayactions.size(); i++) {
            DocumentAction.validateJsonObject(jsonArrayactions.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetDocumentActionsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetDocumentActionsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetDocumentActionsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetDocumentActionsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetDocumentActionsResponse>() {
           @Override
           public void write(JsonWriter out, GetDocumentActionsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetDocumentActionsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetDocumentActionsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetDocumentActionsResponse
  * @throws IOException if the JSON string is invalid with respect to GetDocumentActionsResponse
  */
  public static GetDocumentActionsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetDocumentActionsResponse.class);
  }

 /**
  * Convert an instance of GetDocumentActionsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

