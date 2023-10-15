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
import com.formkiq.client.model.AddDocumentWorkflowApprovalResponse;
import com.formkiq.client.model.AddDocumentWorkflowRejectResponse;
import com.formkiq.client.model.AddDocumentWorkflowResponse;
import com.formkiq.client.model.AddWorkflowRequest;
import com.formkiq.client.model.AddWorkflowResponse;
import com.formkiq.client.model.DeleteWorkflowResponse;
import com.formkiq.client.model.ErrorsResponse;
import com.formkiq.client.model.GetWorkflowResponse;
import com.formkiq.client.model.GetWorkflowsResponse;
import com.formkiq.client.model.WorkflowQueueDocumentsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DocumentWorkflowsApi
 */
@Disabled
public class DocumentWorkflowsApiTest {

  private final DocumentWorkflowsApi api = new DocumentWorkflowsApi();

  /**
   * Add document workflow
   *
   * Creates a document workflow; ONLY available with FormKiQ Pro and Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addDocumentWorkflowTest() throws ApiException {
    String documentId = null;
    String workflowId = null;
    String siteId = null;
    AddDocumentWorkflowResponse response = api.addDocumentWorkflow(documentId, workflowId, siteId);
    // TODO: test validations
  }

  /**
   * Approve document in approval queue
   *
   * Approve document in approval queue; ONLY available with FormKiQ Pro and Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addDocumentWorkflowApprovalTest() throws ApiException {
    String documentId = null;
    String workflowId = null;
    String queueName = null;
    String siteId = null;
    AddDocumentWorkflowApprovalResponse response =
        api.addDocumentWorkflowApproval(documentId, workflowId, queueName, siteId);
    // TODO: test validations
  }

  /**
   * Reject document in approval queue
   *
   * Reject document in approval queue; ONLY available with FormKiQ Pro and Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addDocumentWorkflowRejectTest() throws ApiException {
    String documentId = null;
    String workflowId = null;
    String queueName = null;
    String siteId = null;
    AddDocumentWorkflowRejectResponse response =
        api.addDocumentWorkflowReject(documentId, workflowId, queueName, siteId);
    // TODO: test validations
  }

  /**
   * Add workflow
   *
   * Creates a new Workflow; ONLY available with FormKiQ Pro and Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addWorkflowTest() throws ApiException {
    AddWorkflowRequest addWorkflowRequest = null;
    String siteId = null;
    AddWorkflowResponse response = api.addWorkflow(addWorkflowRequest, siteId);
    // TODO: test validations
  }

  /**
   * Delete workflow
   *
   * Delete a Workflow; ONLY available with FormKiQ Pro and Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteWorkflowTest() throws ApiException {
    String workflowId = null;
    String siteId = null;
    DeleteWorkflowResponse response = api.deleteWorkflow(workflowId, siteId);
    // TODO: test validations
  }

  /**
   * Get workflow
   *
   * Get a workflow; ONLY available with FormKiQ Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getWorkflowTest() throws ApiException {
    String workflowId = null;
    String siteId = null;
    GetWorkflowResponse response = api.getWorkflow(workflowId, siteId);
    // TODO: test validations
  }

  /**
   * Get list of documents in queue
   *
   * List documents in Workflow Queue; ONLY available with FormKiQ Pro and Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getWorkflowQueueDocumentsTest() throws ApiException {
    String queueName = null;
    String siteId = null;
    String limit = null;
    String next = null;
    WorkflowQueueDocumentsResponse response =
        api.getWorkflowQueueDocuments(queueName, siteId, limit, next);
    // TODO: test validations
  }

  /**
   * Get workflows
   *
   * Get a listing of workflows; ONLY available with FormKiQ Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getWorkflowsTest() throws ApiException {
    String siteId = null;
    String next = null;
    String limit = null;
    GetWorkflowsResponse response = api.getWorkflows(siteId, next, limit);
    // TODO: test validations
  }

}
