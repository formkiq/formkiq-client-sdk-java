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
 * The version of the OpenAPI document: 1.16.0 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.api;

import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.model.AddDocumentActionsRequest;
import com.formkiq.client.model.AddDocumentActionsResponse;
import com.formkiq.client.model.AddDocumentActionsRetryResponse;
import com.formkiq.client.model.GetDocumentActionsResponse;
import com.formkiq.client.model.ValidationErrorsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DocumentActionsApi
 */
@Disabled
public class DocumentActionsApiTest {

  private final DocumentActionsApi api = new DocumentActionsApi();

  /**
   * Add document action
   *
   * Add one or more actions to a document; this appends actions and does not replace previous
   * actions Each action type supports a different set of parameters as shown in the table below:
   * ### Action Parameters | ActionType | Parameter | Description | Example | | -------- | ------- |
   * ------- | ------- | | OCR | ocrParseTypes | Ocr Parsing strategy to use | TEXT, FORMS, TABLES |
   * | OCR | ocrEngine | Ocr Engine to use | tesseract or textract | | OCR | ocrOutputType | Convert
   * OCR result to an Output format (textract table only) | true | | OCR | ocrNumberOfPages | Number
   * of pages to OCR (from start) | -1 | | OCR | addPdfDetectedCharactersAsText | PDF Documents
   * convert images to text | true or false | | FULLTEXT | characterMax | Maximum number of
   * characters to add to Fulltext destination | -1 | | DOCUMENTTAGGING | engine | Tagging Engine to
   * use | chatgpt | | DOCUMENTTAGGING | tags | Comma-deliminted list of keywords |
   * author,title,description | | WEBHOOK | url | Webhook URL |
   * https://yourdomain.com/webhook-endpoint | | NOTIFICATION | notificationType | Type of
   * Notification | email | | NOTIFICATION | notificationToCc | Notification Carbon Copy |
   * &lt;email&gt;@yourdomain.com | | NOTIFICATION | notificationToBcc | Notification Blind Carbon
   * Copy | &lt;email&gt;@yourdomain.com | | NOTIFICATION | notificationSubject | Notification
   * Subject | Email Subject | | NOTIFICATION | notificationText | Notification as Text | Email Text
   * | | NOTIFICATION | notificationHtml | Notification as Html | Email HTML Text | | QUEUE |
   * queueId | Id of Queue | | | IDP | mappingId | Id of Mapping | | | EVENTBRIDGE | eventBusName |
   * The name or ARN of the Amazon EventBridge to receive the event. | |
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addDocumentActionsTest() throws ApiException {
    String documentId = null;
    String siteId = null;
    AddDocumentActionsRequest addDocumentActionsRequest = null;
    AddDocumentActionsResponse response =
        api.addDocumentActions(documentId, siteId, addDocumentActionsRequest);
    // TODO: test validations
  }

  /**
   * Retries failed document action(s)
   *
   * Retries all failed document action(s). Failed action status changes to
   * \&quot;FAILED_RETRY\&quot; and a new \&quot;PENDING\&quot; action is created.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addDocumentRetryActionTest() throws ApiException {
    String documentId = null;
    String siteId = null;
    AddDocumentActionsRetryResponse response = api.addDocumentRetryAction(documentId, siteId);
    // TODO: test validations
  }

  /**
   * Get document actions
   *
   * Get document actions and their status
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getDocumentActionsTest() throws ApiException {
    String documentId = null;
    String siteId = null;
    String limit = null;
    String shareKey = null;
    String next = null;
    GetDocumentActionsResponse response =
        api.getDocumentActions(documentId, siteId, limit, shareKey, next);
    // TODO: test validations
  }

}
