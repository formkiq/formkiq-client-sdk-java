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
 * The version of the OpenAPI document: 1.16.1 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.api;

import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.model.AddDocumentWorkflowDecisionsRequest;
import com.formkiq.client.model.AddDocumentWorkflowDecisionsResponse;
import com.formkiq.client.model.AddDocumentWorkflowRequest;
import com.formkiq.client.model.AddDocumentWorkflowResponse;
import com.formkiq.client.model.AddQueueRequest;
import com.formkiq.client.model.AddQueueResponse;
import com.formkiq.client.model.AddWorkflowRequest;
import com.formkiq.client.model.AddWorkflowResponse;
import com.formkiq.client.model.DeleteQueueResponse;
import com.formkiq.client.model.DeleteWorkflowResponse;
import com.formkiq.client.model.ErrorsResponse;
import com.formkiq.client.model.GetDocumentWorkflowResponse;
import com.formkiq.client.model.GetDocumentWorkflowsResponse;
import com.formkiq.client.model.GetQueueResponse;
import com.formkiq.client.model.GetQueuesResponse;
import com.formkiq.client.model.GetWorkflowDocumentsResponse;
import com.formkiq.client.model.GetWorkflowQueueDocumentsResponse;
import com.formkiq.client.model.GetWorkflowResponse;
import com.formkiq.client.model.GetWorkflowsResponse;
import com.formkiq.client.model.SetWorkflowRequest;
import com.formkiq.client.model.SetWorkflowResponse;
import com.formkiq.client.model.UpdateWorkflowRequest;
import com.formkiq.client.model.UpdateWorkflowResponse;
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
   * Creates a document workflow; available as an Add-On Module
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addDocumentWorkflowTest() throws ApiException {
    String documentId = null;
    AddDocumentWorkflowRequest addDocumentWorkflowRequest = null;
    String siteId = null;
    AddDocumentWorkflowResponse response =
        api.addDocumentWorkflow(documentId, addDocumentWorkflowRequest, siteId);
    // TODO: test validations
  }

  /**
   * Approve/Reject document in approval queue
   *
   * Approve/Reject document in approval queue; available as an Add-On Module
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addDocumentWorkflowDecisionsTest() throws ApiException {
    String documentId = null;
    String workflowId = null;
    AddDocumentWorkflowDecisionsRequest addDocumentWorkflowDecisionsRequest = null;
    String siteId = null;
    AddDocumentWorkflowDecisionsResponse response = api.addDocumentWorkflowDecisions(documentId,
        workflowId, addDocumentWorkflowDecisionsRequest, siteId);
    // TODO: test validations
  }

  /**
   * Add queue
   *
   * Creates a new Queue; available as an Add-On Module
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addQueueTest() throws ApiException {
    AddQueueRequest addQueueRequest = null;
    String siteId = null;
    AddQueueResponse response = api.addQueue(addQueueRequest, siteId);
    // TODO: test validations
  }

  /**
   * Add workflow
   *
   * Creates a new Workflow; available as an Add-On Module
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
   * Delete queue
   *
   * Delete a Queue; available as an Add-On Module
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteQueueTest() throws ApiException {
    String queueId = null;
    String siteId = null;
    DeleteQueueResponse response = api.deleteQueue(queueId, siteId);
    // TODO: test validations
  }

  /**
   * Delete workflow
   *
   * Delete a Workflow; available as an Add-On Module
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
   * Get document workflow
   *
   * Gets a document workflow; available as an Add-On Module
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getDocumentWorkflowTest() throws ApiException {
    String documentId = null;
    String workflowId = null;
    String siteId = null;
    GetDocumentWorkflowResponse response = api.getDocumentWorkflow(documentId, workflowId, siteId);
    // TODO: test validations
  }

  /**
   * Get document workflows
   *
   * Gets a document workflows; available as an Add-On Module
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getDocumentWorkflowsTest() throws ApiException {
    String documentId = null;
    String siteId = null;
    GetDocumentWorkflowsResponse response = api.getDocumentWorkflows(documentId, siteId);
    // TODO: test validations
  }

  /**
   * Get queue
   *
   * Get a queue; available as an Add-On Module
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getQueueTest() throws ApiException {
    String queueId = null;
    String siteId = null;
    GetQueueResponse response = api.getQueue(queueId, siteId);
    // TODO: test validations
  }

  /**
   * Get queues
   *
   * Get a listing of queues; available as an Add-On Module
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getQueuesTest() throws ApiException {
    String siteId = null;
    String next = null;
    String limit = null;
    GetQueuesResponse response = api.getQueues(siteId, next, limit);
    // TODO: test validations
  }

  /**
   * Get workflow
   *
   * Get a workflow; available as an Add-On Module
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
   * Get list of documents in workflow
   *
   * List documents in Workflow; available as an Add-On Module
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getWorkflowDocumentsTest() throws ApiException {
    String workflowId = null;
    String siteId = null;
    String limit = null;
    String next = null;
    GetWorkflowDocumentsResponse response =
        api.getWorkflowDocuments(workflowId, siteId, limit, next);
    // TODO: test validations
  }

  /**
   * Get list of documents in queue
   *
   * List documents in Workflow Queue; available as an Add-On Module
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getWorkflowQueueDocumentsTest() throws ApiException {
    String queueId = null;
    String siteId = null;
    String limit = null;
    String next = null;
    GetWorkflowQueueDocumentsResponse response =
        api.getWorkflowQueueDocuments(queueId, siteId, limit, next);
    // TODO: test validations
  }

  /**
   * Get workflows
   *
   * Get a listing of workflows; available as an Add-On Module
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getWorkflowsTest() throws ApiException {
    String siteId = null;
    String next = null;
    String limit = null;
    String status = null;
    GetWorkflowsResponse response = api.getWorkflows(siteId, next, limit, status);
    // TODO: test validations
  }

  /**
   * Set workflow
   *
   * Set a Workflow details; available as an Add-On Module
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void setWorkflowTest() throws ApiException {
    String workflowId = null;
    SetWorkflowRequest setWorkflowRequest = null;
    String siteId = null;
    SetWorkflowResponse response = api.setWorkflow(workflowId, setWorkflowRequest, siteId);
    // TODO: test validations
  }

  /**
   * Update workflow
   *
   * Update a Workflow details; available as an Add-On Module
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void updateWorkflowTest() throws ApiException {
    String workflowId = null;
    UpdateWorkflowRequest updateWorkflowRequest = null;
    String siteId = null;
    UpdateWorkflowResponse response = api.updateWorkflow(workflowId, updateWorkflowRequest, siteId);
    // TODO: test validations
  }

}
