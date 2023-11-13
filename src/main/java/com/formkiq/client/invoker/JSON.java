/*
 * FormKiQ HTTP API Formkiq API: Document Management Platform API using OAuth(JWT) Authentication
 * You can find out more about FormKiQ at [https://formkiq.com](http://formkiq.com). ## Introduction
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
 * The version of the OpenAPI document: 1.13.0 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.invoker;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 * backward-compatibility
 */
public class JSON {
  private static Gson gson;
  private static boolean isLenientOnJson = false;
  private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
  private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
  private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter =
      new OffsetDateTimeTypeAdapter();
  private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
  private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

  @SuppressWarnings("unchecked")
  public static GsonBuilder createGson() {
    GsonFireBuilder fireBuilder = new GsonFireBuilder();
    GsonBuilder builder = fireBuilder.createGsonBuilder();
    return builder;
  }

  private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
    JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
    if (null == element) {
      throw new IllegalArgumentException(
          "missing discriminator field: <" + discriminatorField + ">");
    }
    return element.getAsString();
  }

  /**
   * Returns the Java class that implements the OpenAPI schema for the specified discriminator
   * value.
   *
   * @param classByDiscriminatorValue The map of discriminator values to Java classes.
   * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
   * @return The Java class that implements the OpenAPI schema
   */
  private static Class getClassByDiscriminator(Map classByDiscriminatorValue,
      String discriminatorValue) {
    Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
    if (null == clazz) {
      throw new IllegalArgumentException(
          "cannot determine model class of name: <" + discriminatorValue + ">");
    }
    return clazz;
  }

  {
    GsonBuilder gsonBuilder = createGson();
    gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
    gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
    gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
    gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
    gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddAction.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddActionParameters.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddApiKeyRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddApiKeyResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddChildDocument.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddChildDocumentResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddDocumentActionsRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddDocumentActionsResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddDocumentMetadata.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddDocumentOcrRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddDocumentOcrResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddDocumentRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddDocumentResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddDocumentTag.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddDocumentTagsRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddDocumentUploadRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddDocumentWorkflowDecisionsRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddDocumentWorkflowDecisionsResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddDocumentWorkflowRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddDocumentWorkflowResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddFolderRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddFolderResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddFolderShareRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddFolderShareResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddQueue.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddQueueRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddQueueResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddShare.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddTagSchemaRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddTagSchemaResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddTagSchemaTags.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddWebhookRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddWebhookResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddWebhookTagRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddWorkflowRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddWorkflowResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.AddWorkflowStep.CustomTypeAdapterFactory());
    gsonBuilder
        .registerTypeAdapterFactory(new com.formkiq.client.model.ApiKey.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.ChildDocument.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.DeleteApiKeyResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.DeleteFolderResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.DeleteFulltextResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.DeleteIndicesResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.DeleteQueueResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.DeleteShareResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.DeleteWorkflowResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.Document.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.DocumentAction.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.DocumentFulltextRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.DocumentFulltextResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.DocumentFulltextSearch.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.DocumentFulltextTag.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.DocumentId.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.DocumentMetadata.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.DocumentSearch.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.DocumentSearchMatchTag.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.DocumentSearchMeta.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.DocumentSearchRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.DocumentSearchResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.DocumentSearchTag.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.DocumentTag.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.DocumentVersion.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.DocumentsCompressRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.DocumentsCompressResponse.CustomTypeAdapterFactory());
    gsonBuilder
        .registerTypeAdapterFactory(new com.formkiq.client.model.Error.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.ErrorsResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.EsignatureDocusignCarbonCopy.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.EsignatureDocusignConfigResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.EsignatureDocusignRecipientTab.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.EsignatureDocusignRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.EsignatureDocusignResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.EsignatureDocusignSigner.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.EsignatureSetDocusignConfigRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.EsignatureSetDocusignConfigResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.FulltextSearchItem.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.GetApiKeysResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.GetConfigurationResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.GetDocumentActionsResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.GetDocumentContentResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.GetDocumentFulltextResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.GetDocumentOcrResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.GetDocumentResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.GetDocumentSync.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.GetDocumentSyncResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.GetDocumentTagResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.GetDocumentTagsResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.GetDocumentUrlResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.GetDocumentVersionsResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.GetDocumentWorkflowResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.GetDocumentWorkflowsResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.GetDocumentsResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.GetFoldersResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.GetGroupsResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.GetQueueResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.GetQueuesResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.GetSitesResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.GetTagSchemaRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.GetTagSchemasRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.GetUserSharesResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.GetUsersInGroupResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.GetVersionResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.GetWebhookResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.GetWebhookTagsResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.GetWebhooksResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.GetWorkflowResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.GetWorkflowsResponse.CustomTypeAdapterFactory());
    gsonBuilder
        .registerTypeAdapterFactory(new com.formkiq.client.model.Group.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.IndexFolderMoveRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.IndexFolderMoveResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.IndexSearch.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.IndexSearchRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.IndexSearchResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.MatchDocumentTag.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.OnlyOfficeConfig.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.OnlyOfficeConfigDocument.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.OnlyOfficeDocumentNewRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.OnlyOfficeDocumentResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.OnlyOfficeDocumentSaveResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.OnlyOfficeEditorConfig.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.QueryFulltextResponse.CustomTypeAdapterFactory());
    gsonBuilder
        .registerTypeAdapterFactory(new com.formkiq.client.model.Queue.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.SearchResponseFields.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.SearchResultDocument.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.SetAntivirusResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.SetDocumentFulltextRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.SetDocumentFulltextResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.SetDocumentOcrRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.SetDocumentTagKeyRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.SetDocumentVersionRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.SetDocumentVersionResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.SetWorkflowRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.SetWorkflowResponse.CustomTypeAdapterFactory());
    gsonBuilder
        .registerTypeAdapterFactory(new com.formkiq.client.model.Site.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.TagSchemaCompositeKey.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.TagSchemaOptional.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.TagSchemaRequired.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.TagSchemaSummary.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.TagSchemaTags.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.UpdateConfigurationRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.UpdateConfigurationResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.UpdateDocumentFulltextRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.UpdateMatchingDocumentTagsRequest.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.UpdateMatchingDocumentTagsRequestMatch.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.UpdateMatchingDocumentTagsRequestUpdate.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.UpdateMatchingDocumentTagsResponse.CustomTypeAdapterFactory());
    gsonBuilder
        .registerTypeAdapterFactory(new com.formkiq.client.model.User.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.UserShare.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.ValidationError.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.ValidationErrorsResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.WebhookTag.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.Workflow.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.WorkflowQueue.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.WorkflowQueueDocumentsResponse.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.WorkflowStep.CustomTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(
        new com.formkiq.client.model.WorkflowSummary.CustomTypeAdapterFactory());
    gson = gsonBuilder.create();
  }

  /**
   * Get Gson.
   *
   * @return Gson
   */
  public static Gson getGson() {
    return gson;
  }

  /**
   * Set Gson.
   *
   * @param gson Gson
   */
  public static void setGson(Gson gson) {
    JSON.gson = gson;
  }

  public static void setLenientOnJson(boolean lenientOnJson) {
    isLenientOnJson = lenientOnJson;
  }

  /**
   * Serialize the given Java object into JSON string.
   *
   * @param obj Object
   * @return String representation of the JSON
   */
  public static String serialize(Object obj) {
    return gson.toJson(obj);
  }

  /**
   * Deserialize the given JSON string to Java object.
   *
   * @param <T> Type
   * @param body The JSON string
   * @param returnType The type to deserialize into
   * @return The deserialized Java object
   */
  @SuppressWarnings("unchecked")
  public static <T> T deserialize(String body, Type returnType) {
    try {
      if (isLenientOnJson) {
        JsonReader jsonReader = new JsonReader(new StringReader(body));
        // see
        // https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
        jsonReader.setLenient(true);
        return gson.fromJson(jsonReader, returnType);
      } else {
        return gson.fromJson(body, returnType);
      }
    } catch (JsonParseException e) {
      // Fallback processing when failed to parse JSON form response body:
      // return the response body string directly for the String return type;
      if (returnType.equals(String.class)) {
        return (T) body;
      } else {
        throw (e);
      }
    }
  }

  /**
   * Gson TypeAdapter for Byte Array type
   */
  public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

    @Override
    public void write(JsonWriter out, byte[] value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        out.value(ByteString.of(value).base64());
      }
    }

    @Override
    public byte[] read(JsonReader in) throws IOException {
      switch (in.peek()) {
        case NULL:
          in.nextNull();
          return null;
        default:
          String bytesAsBase64 = in.nextString();
          ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
          return byteString.toByteArray();
      }
    }
  }

  /**
   * Gson TypeAdapter for JSR310 OffsetDateTime type
   */
  public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

    private DateTimeFormatter formatter;

    public OffsetDateTimeTypeAdapter() {
      this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }

    public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
      this.formatter = formatter;
    }

    public void setFormat(DateTimeFormatter dateFormat) {
      this.formatter = dateFormat;
    }

    @Override
    public void write(JsonWriter out, OffsetDateTime date) throws IOException {
      if (date == null) {
        out.nullValue();
      } else {
        out.value(formatter.format(date));
      }
    }

    @Override
    public OffsetDateTime read(JsonReader in) throws IOException {
      switch (in.peek()) {
        case NULL:
          in.nextNull();
          return null;
        default:
          String date = in.nextString();
          if (date.endsWith("+0000")) {
            date = date.substring(0, date.length() - 5) + "Z";
          }
          return OffsetDateTime.parse(date, formatter);
      }
    }
  }

  /**
   * Gson TypeAdapter for JSR310 LocalDate type
   */
  public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

    private DateTimeFormatter formatter;

    public LocalDateTypeAdapter() {
      this(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public LocalDateTypeAdapter(DateTimeFormatter formatter) {
      this.formatter = formatter;
    }

    public void setFormat(DateTimeFormatter dateFormat) {
      this.formatter = dateFormat;
    }

    @Override
    public void write(JsonWriter out, LocalDate date) throws IOException {
      if (date == null) {
        out.nullValue();
      } else {
        out.value(formatter.format(date));
      }
    }

    @Override
    public LocalDate read(JsonReader in) throws IOException {
      switch (in.peek()) {
        case NULL:
          in.nextNull();
          return null;
        default:
          String date = in.nextString();
          return LocalDate.parse(date, formatter);
      }
    }
  }

  public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
    offsetDateTimeTypeAdapter.setFormat(dateFormat);
  }

  public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
    localDateTypeAdapter.setFormat(dateFormat);
  }

  /**
   * Gson TypeAdapter for java.sql.Date type If the dateFormat is null, a simple "yyyy-MM-dd" format
   * will be used (more efficient than SimpleDateFormat).
   */
  public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

    private DateFormat dateFormat;

    public SqlDateTypeAdapter() {}

    public SqlDateTypeAdapter(DateFormat dateFormat) {
      this.dateFormat = dateFormat;
    }

    public void setFormat(DateFormat dateFormat) {
      this.dateFormat = dateFormat;
    }

    @Override
    public void write(JsonWriter out, java.sql.Date date) throws IOException {
      if (date == null) {
        out.nullValue();
      } else {
        String value;
        if (dateFormat != null) {
          value = dateFormat.format(date);
        } else {
          value = date.toString();
        }
        out.value(value);
      }
    }

    @Override
    public java.sql.Date read(JsonReader in) throws IOException {
      switch (in.peek()) {
        case NULL:
          in.nextNull();
          return null;
        default:
          String date = in.nextString();
          try {
            if (dateFormat != null) {
              return new java.sql.Date(dateFormat.parse(date).getTime());
            }
            return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
          } catch (ParseException e) {
            throw new JsonParseException(e);
          }
      }
    }
  }

  /**
   * Gson TypeAdapter for java.util.Date type If the dateFormat is null, ISO8601Utils will be used.
   */
  public static class DateTypeAdapter extends TypeAdapter<Date> {

    private DateFormat dateFormat;

    public DateTypeAdapter() {}

    public DateTypeAdapter(DateFormat dateFormat) {
      this.dateFormat = dateFormat;
    }

    public void setFormat(DateFormat dateFormat) {
      this.dateFormat = dateFormat;
    }

    @Override
    public void write(JsonWriter out, Date date) throws IOException {
      if (date == null) {
        out.nullValue();
      } else {
        String value;
        if (dateFormat != null) {
          value = dateFormat.format(date);
        } else {
          value = ISO8601Utils.format(date, true);
        }
        out.value(value);
      }
    }

    @Override
    public Date read(JsonReader in) throws IOException {
      try {
        switch (in.peek()) {
          case NULL:
            in.nextNull();
            return null;
          default:
            String date = in.nextString();
            try {
              if (dateFormat != null) {
                return dateFormat.parse(date);
              }
              return ISO8601Utils.parse(date, new ParsePosition(0));
            } catch (ParseException e) {
              throw new JsonParseException(e);
            }
        }
      } catch (IllegalArgumentException e) {
        throw new JsonParseException(e);
      }
    }
  }

  public static void setDateFormat(DateFormat dateFormat) {
    dateTypeAdapter.setFormat(dateFormat);
  }

  public static void setSqlDateFormat(DateFormat dateFormat) {
    sqlDateTypeAdapter.setFormat(dateFormat);
  }
}
