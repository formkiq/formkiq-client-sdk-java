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
 * The version of the OpenAPI document: 1.15.1 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.api;

import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.model.AddClassificationRequest;
import com.formkiq.client.model.AddClassificationResponse;
import com.formkiq.client.model.DeleteResponse;
import com.formkiq.client.model.GetClassificationResponse;
import com.formkiq.client.model.GetClassificationsResponse;
import com.formkiq.client.model.GetSitesSchemaResponse;
import com.formkiq.client.model.SetClassificationRequest;
import com.formkiq.client.model.SetResponse;
import com.formkiq.client.model.SetSitesSchemaRequest;
import com.formkiq.client.model.ValidationErrorsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SchemasApi
 */
@Disabled
public class SchemasApiTest {

  private final SchemasApi api = new SchemasApi();

  /**
   * Add Classification
   *
   * Add Classification
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addClassificationTest() throws ApiException {
    String siteId = null;
    AddClassificationRequest addClassificationRequest = null;
    AddClassificationResponse response = api.addClassification(siteId, addClassificationRequest);
    // TODO: test validations
  }

  /**
   * Delete Classification
   *
   * Delete Classification
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteClassificationTest() throws ApiException {
    String siteId = null;
    String classificationId = null;
    DeleteResponse response = api.deleteClassification(siteId, classificationId);
    // TODO: test validations
  }

  /**
   * Get Classification
   *
   * Get Classification
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getClassificationTest() throws ApiException {
    String siteId = null;
    String classificationId = null;
    GetClassificationResponse response = api.getClassification(siteId, classificationId);
    // TODO: test validations
  }

  /**
   * Get Sites Classifications
   *
   * Gets Sites Classifications
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getSitesClassificationsTest() throws ApiException {
    String siteId = null;
    String limit = null;
    String next = null;
    GetClassificationsResponse response = api.getSitesClassifications(siteId, limit, next);
    // TODO: test validations
  }

  /**
   * Get Sites Schema
   *
   * Gets Sites schema
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getSitesSchemaTest() throws ApiException {
    String siteId = null;
    GetSitesSchemaResponse response = api.getSitesSchema(siteId);
    // TODO: test validations
  }

  /**
   * Set Classification
   *
   * Sets Classification
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void setClassificationTest() throws ApiException {
    String siteId = null;
    String classificationId = null;
    SetClassificationRequest setClassificationRequest = null;
    SetResponse response =
        api.setClassification(siteId, classificationId, setClassificationRequest);
    // TODO: test validations
  }

  /**
   * Set Sites Schema
   *
   * Sets Sites schema
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void setSitesSchemaTest() throws ApiException {
    String siteId = null;
    SetSitesSchemaRequest setSitesSchemaRequest = null;
    SetResponse response = api.setSitesSchema(siteId, setSitesSchemaRequest);
    // TODO: test validations
  }

}