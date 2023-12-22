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
 * The version of the OpenAPI document: 1.14.0 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.api;

import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.model.AddFolderRequest;
import com.formkiq.client.model.AddFolderResponse;
import com.formkiq.client.model.DeleteFolderResponse;
import com.formkiq.client.model.GetFoldersResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DocumentFoldersApi
 */
@Disabled
public class DocumentFoldersApiTest {

  private final DocumentFoldersApi api = new DocumentFoldersApi();

  /**
   * Add document folder
   *
   * Creates a new folder
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addFolderTest() throws ApiException {
    AddFolderRequest addFolderRequest = null;
    String siteId = null;
    String shareKey = null;
    AddFolderResponse response = api.addFolder(addFolderRequest, siteId, shareKey);
    // TODO: test validations
  }

  /**
   * Delete document folder
   *
   * Delete a specific folder; folder must be empty
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteFolderTest() throws ApiException {
    String indexKey = null;
    String siteId = null;
    String shareKey = null;
    DeleteFolderResponse response = api.deleteFolder(indexKey, siteId, shareKey);
    // TODO: test validations
  }

  /**
   * Get document folders
   *
   * Get list of documents in a folder
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getFolderDocumentsTest() throws ApiException {
    String siteId = null;
    String indexKey = null;
    String limit = null;
    String shareKey = null;
    String next = null;
    GetFoldersResponse response = api.getFolderDocuments(siteId, indexKey, limit, shareKey, next);
    // TODO: test validations
  }

}
