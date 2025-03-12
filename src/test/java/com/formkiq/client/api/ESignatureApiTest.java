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


package com.formkiq.client.api;

import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.model.AddDocusignEnvelopesRequest;
import com.formkiq.client.model.AddDocusignEnvelopesResponse;
import com.formkiq.client.model.AddDocusignRecipientViewRequest;
import com.formkiq.client.model.AddDocusignRecipientViewResponse;
import com.formkiq.client.model.AddResponse;
import com.formkiq.client.model.ValidationErrorsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ESignatureApi
 */
@Disabled
public class ESignatureApiTest {

  private final ESignatureApi api = new ESignatureApi();

  /**
   * Create Docusign Envelope request
   *
   * DocuSign create Docusign Envelope request; available as an Add-On Module
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addDocusignEnvelopesTest() throws ApiException {
    String documentId = null;
    AddDocusignEnvelopesRequest addDocusignEnvelopesRequest = null;
    String siteId = null;
    AddDocusignEnvelopesResponse response =
        api.addDocusignEnvelopes(documentId, addDocusignEnvelopesRequest, siteId);
    // TODO: test validations
  }

  /**
   * Create Docusign Recipient View request
   *
   * DocuSign create Docusign Recipient View request; available as an Add-On Module
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addDocusignRecipientViewTest() throws ApiException {
    String documentId = null;
    String envelopeId = null;
    AddDocusignRecipientViewRequest addDocusignRecipientViewRequest = null;
    String siteId = null;
    AddDocusignRecipientViewResponse response = api.addDocusignRecipientView(documentId, envelopeId,
        addDocusignRecipientViewRequest, siteId);
    // TODO: test validations
  }

  /**
   * Add E-signature event
   *
   * DocuSign callback URL handler; available as an Add-On Module
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addEsignatureDocusignEventsTest() throws ApiException {
    AddResponse response = api.addEsignatureDocusignEvents();
    // TODO: test validations
  }

}
