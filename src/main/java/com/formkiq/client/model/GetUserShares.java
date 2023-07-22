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
import com.formkiq.client.model.UserShare;
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
 * GetUserShares
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-21T22:37:18.641266-05:00[America/Winnipeg]")
public class GetUserShares {
  public static final String SERIALIZED_NAME_SHARES = "shares";
  @SerializedName(SERIALIZED_NAME_SHARES)
  private List<UserShare> shares;

  public GetUserShares() {
  }

  public GetUserShares shares(List<UserShare> shares) {
    
    this.shares = shares;
    return this;
  }

  public GetUserShares addSharesItem(UserShare sharesItem) {
    if (this.shares == null) {
      this.shares = new ArrayList<>();
    }
    this.shares.add(sharesItem);
    return this;
  }

   /**
   * List of user&#39;s shares
   * @return shares
  **/
  @javax.annotation.Nullable
  public List<UserShare> getShares() {
    return shares;
  }


  public void setShares(List<UserShare> shares) {
    this.shares = shares;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUserShares getUserShares = (GetUserShares) o;
    return Objects.equals(this.shares, getUserShares.shares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shares);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUserShares {\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
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
    openapiFields.add("shares");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetUserShares
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetUserShares.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetUserShares is not found in the empty JSON string", GetUserShares.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetUserShares.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetUserShares` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("shares") != null && !jsonObj.get("shares").isJsonNull()) {
        JsonArray jsonArrayshares = jsonObj.getAsJsonArray("shares");
        if (jsonArrayshares != null) {
          // ensure the json data is an array
          if (!jsonObj.get("shares").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `shares` to be an array in the JSON string but got `%s`", jsonObj.get("shares").toString()));
          }

          // validate the optional field `shares` (array)
          for (int i = 0; i < jsonArrayshares.size(); i++) {
            UserShare.validateJsonObject(jsonArrayshares.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetUserShares.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetUserShares' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetUserShares> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetUserShares.class));

       return (TypeAdapter<T>) new TypeAdapter<GetUserShares>() {
           @Override
           public void write(JsonWriter out, GetUserShares value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetUserShares read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetUserShares given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetUserShares
  * @throws IOException if the JSON string is invalid with respect to GetUserShares
  */
  public static GetUserShares fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetUserShares.class);
  }

 /**
  * Convert an instance of GetUserShares to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

