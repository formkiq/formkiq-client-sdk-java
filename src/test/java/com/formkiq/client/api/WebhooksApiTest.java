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


package com.formkiq.client.api;

import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.model.AddWebhookRequest;
import com.formkiq.client.model.AddWebhookResponse;
import com.formkiq.client.model.AddWebhookTagRequest;
import com.formkiq.client.model.DocumentId;
import com.formkiq.client.model.GetWebhookResponse;
import com.formkiq.client.model.GetWebhookTagsResponse;
import com.formkiq.client.model.GetWebhooksResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhooksApi
 */
@Disabled
public class WebhooksApiTest {

  private final WebhooksApi api = new WebhooksApi();

  /**
   * Add webhook
   *
   * Create a new webhook; once created, a webhook&#39;s id can be provided to an external service,
   * allowing data to be sent, received, and processed via that webhook
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addWebhookTest() throws ApiException {
    AddWebhookRequest addWebhookRequest = null;
    String siteId = null;
    AddWebhookResponse response = api.addWebhook(addWebhookRequest, siteId);
    // TODO: test validations
  }

  /**
   * Add webhook
   *
   * Receive an incoming private webhook and creates a document based on the webhook&#39;s body;
   * requires authentication
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addWebhookDocumentTest() throws ApiException {
    String webhooksPlus = null;
    Object body = null;
    String siteId = null;
    DocumentId response = api.addWebhookDocument(webhooksPlus, body, siteId);
    // TODO: test validations
  }

  /**
   * Add webhook tag
   *
   * Add a tag to a webhook
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addWebhookTagTest() throws ApiException {
    String webhookId = null;
    AddWebhookTagRequest addWebhookTagRequest = null;
    String siteId = null;
    api.addWebhookTag(webhookId, addWebhookTagRequest, siteId);
    // TODO: test validations
  }

  /**
   * Delete webhook
   *
   * Delete a webhook; this will disable sending, receiving, or processing of data from external
   * services to this webhook
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteWebhookTest() throws ApiException {
    String webhookId = null;
    String siteId = null;
    api.deleteWebhook(webhookId, siteId);
    // TODO: test validations
  }

  /**
   * Get webhook
   *
   * Return a webhook&#39;s details, i.e., its metadata
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getWebhookTest() throws ApiException {
    String webhookId = null;
    String siteId = null;
    GetWebhookResponse response = api.getWebhook(webhookId, siteId);
    // TODO: test validations
  }

  /**
   * Get webhook tags
   *
   * Get a webhook&#39;s tags
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getWebhookTagsTest() throws ApiException {
    String webhookId = null;
    String siteId = null;
    GetWebhookTagsResponse response = api.getWebhookTags(webhookId, siteId);
    // TODO: test validations
  }

  /**
   * Get webhooks
   *
   * Return a list of webhooks; each webhook&#39;s id can be provided to an external service,
   * allowing data to be sent, received, and processed via that webhook
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getWebhooksTest() throws ApiException {
    String siteId = null;
    GetWebhooksResponse response = api.getWebhooks(siteId);
    // TODO: test validations
  }

  /**
   * Update webhook
   *
   * Updates a webhook&#39;s details, i.e., its metadata
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void updateWebhookTest() throws ApiException {
    String webhookId = null;
    AddWebhookRequest addWebhookRequest = null;
    String siteId = null;
    api.updateWebhook(webhookId, addWebhookRequest, siteId);
    // TODO: test validations
  }

}
