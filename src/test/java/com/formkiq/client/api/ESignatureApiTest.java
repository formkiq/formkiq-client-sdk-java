/*
 * FormKiQ HTTP API Formkiq API: Document Management Platform API using JWT Authentication
 *
 * The version of the OpenAPI document: 1.12.0 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.api;

import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.model.EsignatureDocusignConfigResponse;
import com.formkiq.client.model.EsignatureDocusignRequest;
import com.formkiq.client.model.EsignatureDocusignResponse;
import com.formkiq.client.model.EsignatureSetDocusignConfigRequest;
import com.formkiq.client.model.EsignatureSetDocusignConfigResponse;
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
   * DocuSign callback URL handler; ONLY available with FormKiQ Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addEsignatureDocusignEventsTest() throws ApiException {
    EsignatureDocusignResponse response = api.addEsignatureDocusignEvents();
    // TODO: test validations
  }

  /**
   * Create a DocuSign E-Signature request; ONLY available with FormKiQ Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void esignatureDocusignTest() throws ApiException {
    String documentId = null;
    EsignatureDocusignRequest esignatureDocusignRequest = null;
    String siteId = null;
    EsignatureDocusignResponse response =
        api.esignatureDocusign(documentId, esignatureDocusignRequest, siteId);
    // TODO: test validations
  }

  /**
   * Get DocuSign configuration info; ONLY available with FormKiQ Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void esignatureDocusignConfigTest() throws ApiException {
    String siteId = null;
    EsignatureDocusignConfigResponse response = api.esignatureDocusignConfig(siteId);
    // TODO: test validations
  }

  /**
   * Set DocuSign configuration, required for integration; ONLY available with FormKiQ Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void esignatureSetDocusignConfigTest() throws ApiException {
    EsignatureSetDocusignConfigRequest esignatureSetDocusignConfigRequest = null;
    String siteId = null;
    EsignatureSetDocusignConfigResponse response =
        api.esignatureSetDocusignConfig(esignatureSetDocusignConfigRequest, siteId);
    // TODO: test validations
  }

}
