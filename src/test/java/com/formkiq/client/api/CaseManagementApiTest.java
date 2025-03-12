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
import com.formkiq.client.model.AddCaseRequest;
import com.formkiq.client.model.AddCaseResponse;
import com.formkiq.client.model.AddNigoRequest;
import com.formkiq.client.model.AddNigoResponse;
import com.formkiq.client.model.AddTaskRequest;
import com.formkiq.client.model.AddTaskResponse;
import com.formkiq.client.model.DeleteCaseDocumentResponse;
import com.formkiq.client.model.DeleteCaseNigoDocumentResponse;
import com.formkiq.client.model.DeleteCaseNigoResponse;
import com.formkiq.client.model.DeleteCaseResponse;
import com.formkiq.client.model.DeleteCaseTaskDocumentResponse;
import com.formkiq.client.model.DeleteCaseTaskResponse;
import com.formkiq.client.model.GetCaseDocumentsResponse;
import com.formkiq.client.model.GetCaseNigoResponse;
import com.formkiq.client.model.GetCaseNigosResponse;
import com.formkiq.client.model.GetCaseResponse;
import com.formkiq.client.model.GetCaseTaskResponse;
import com.formkiq.client.model.GetCaseTasksResponse;
import com.formkiq.client.model.GetCasesResponse;
import com.formkiq.client.model.UpdateCaseRequest;
import com.formkiq.client.model.UpdateCaseResponse;
import com.formkiq.client.model.UpdateNigoRequest;
import com.formkiq.client.model.UpdateNigoResponse;
import com.formkiq.client.model.UpdateTaskRequest;
import com.formkiq.client.model.UpdateTaskResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CaseManagementApi
 */
@Disabled
public class CaseManagementApiTest {

  private final CaseManagementApi api = new CaseManagementApi();

  /**
   * Add New Case
   *
   * Adds new case; available as an Add-On Module
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addCaseTest() throws ApiException {
    AddCaseRequest addCaseRequest = null;
    String siteId = null;
    AddCaseResponse response = api.addCase(addCaseRequest, siteId);
    // TODO: test validations
  }

  /**
   * Add New Nigo
   *
   * Adds new nigo; available as an Add-On Module
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addNigoTest() throws ApiException {
    String caseId = null;
    AddNigoRequest addNigoRequest = null;
    String siteId = null;
    AddNigoResponse response = api.addNigo(caseId, addNigoRequest, siteId);
    // TODO: test validations
  }

  /**
   * Add New Task
   *
   * Adds new task; available as an Add-On Module
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addTaskTest() throws ApiException {
    String caseId = null;
    AddTaskRequest addTaskRequest = null;
    String siteId = null;
    AddTaskResponse response = api.addTask(caseId, addTaskRequest, siteId);
    // TODO: test validations
  }

  /**
   * Delete Case
   *
   * Delete Case
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteCaseTest() throws ApiException {
    String caseId = null;
    String siteId = null;
    DeleteCaseResponse response = api.deleteCase(caseId, siteId);
    // TODO: test validations
  }

  /**
   * Delete Document from Case
   *
   * Delete Document from Case
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteCaseDocumentTest() throws ApiException {
    String caseId = null;
    String documentId = null;
    String siteId = null;
    DeleteCaseDocumentResponse response = api.deleteCaseDocument(caseId, documentId, siteId);
    // TODO: test validations
  }

  /**
   * Delete Nigo
   *
   * Delete Nigo
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteNigoTest() throws ApiException {
    String caseId = null;
    String nigoId = null;
    String siteId = null;
    DeleteCaseNigoResponse response = api.deleteNigo(caseId, nigoId, siteId);
    // TODO: test validations
  }

  /**
   * Delete Document from Nigo
   *
   * Delete Document from Nigo
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteNigoDocumentTest() throws ApiException {
    String caseId = null;
    String nigoId = null;
    String documentId = null;
    String siteId = null;
    DeleteCaseNigoDocumentResponse response =
        api.deleteNigoDocument(caseId, nigoId, documentId, siteId);
    // TODO: test validations
  }

  /**
   * Delete Task
   *
   * Delete Task
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteTaskTest() throws ApiException {
    String caseId = null;
    String taskId = null;
    String siteId = null;
    DeleteCaseTaskResponse response = api.deleteTask(caseId, taskId, siteId);
    // TODO: test validations
  }

  /**
   * Delete Document from Task
   *
   * Delete Document from Task
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteTaskDocumentTest() throws ApiException {
    String caseId = null;
    String taskId = null;
    String documentId = null;
    String siteId = null;
    DeleteCaseTaskDocumentResponse response =
        api.deleteTaskDocument(caseId, taskId, documentId, siteId);
    // TODO: test validations
  }

  /**
   * Get Case details
   *
   * Returns a Case; available as an Add-On Module
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getCaseTest() throws ApiException {
    String caseId = null;
    String siteId = null;
    GetCaseResponse response = api.getCase(caseId, siteId);
    // TODO: test validations
  }

  /**
   * Get list of document in a case
   *
   * Returns documents in a Case; available as an Add-On Module
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getCaseDocumentsTest() throws ApiException {
    String caseId = null;
    String siteId = null;
    String next = null;
    String limit = null;
    GetCaseDocumentsResponse response = api.getCaseDocuments(caseId, siteId, next, limit);
    // TODO: test validations
  }

  /**
   * Get nigo in a case
   *
   * Returns a Nigo in Case; available as an Add-On Module
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getCaseNigoTest() throws ApiException {
    String caseId = null;
    String nigoId = null;
    String siteId = null;
    GetCaseNigoResponse response = api.getCaseNigo(caseId, nigoId, siteId);
    // TODO: test validations
  }

  /**
   * Get list of Nigos in a case
   *
   * Returns a Nigos of Case; available as an Add-On Module
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getCaseNigosTest() throws ApiException {
    String caseId = null;
    String siteId = null;
    String next = null;
    String limit = null;
    GetCaseNigosResponse response = api.getCaseNigos(caseId, siteId, next, limit);
    // TODO: test validations
  }

  /**
   * Get task in a case
   *
   * Returns a Task in Case; available as an Add-On Module
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getCaseTaskTest() throws ApiException {
    String caseId = null;
    String taskId = null;
    String siteId = null;
    GetCaseTaskResponse response = api.getCaseTask(caseId, taskId, siteId);
    // TODO: test validations
  }

  /**
   * Get list of tasks in a case
   *
   * Returns a Case; available as an Add-On Module
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getCaseTasksTest() throws ApiException {
    String caseId = null;
    String siteId = null;
    String next = null;
    String limit = null;
    GetCaseTasksResponse response = api.getCaseTasks(caseId, siteId, next, limit);
    // TODO: test validations
  }

  /**
   * Get Case listing
   *
   * Returns a list of the Cases; available as an Add-On Module
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getCasesTest() throws ApiException {
    String siteId = null;
    String next = null;
    String limit = null;
    GetCasesResponse response = api.getCases(siteId, next, limit);
    // TODO: test validations
  }

  /**
   * Get list of document in a task
   *
   * Returns a list documents in a Case; available as an Add-On Module
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getNigoDocumentsTest() throws ApiException {
    String caseId = null;
    String nigoId = null;
    String siteId = null;
    String next = null;
    String limit = null;
    GetCaseDocumentsResponse response = api.getNigoDocuments(caseId, nigoId, siteId, next, limit);
    // TODO: test validations
  }

  /**
   * Get list of document in a task
   *
   * Returns a list documents in a Case; available as an Add-On Module
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getTaskDocumentsTest() throws ApiException {
    String caseId = null;
    String taskId = null;
    String siteId = null;
    String next = null;
    String limit = null;
    GetCaseDocumentsResponse response = api.getTaskDocuments(caseId, taskId, siteId, next, limit);
    // TODO: test validations
  }

  /**
   * Update existing Case
   *
   * Updates existing case; available as an Add-On Module
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void updateCaseTest() throws ApiException {
    String caseId = null;
    UpdateCaseRequest updateCaseRequest = null;
    String siteId = null;
    UpdateCaseResponse response = api.updateCase(caseId, updateCaseRequest, siteId);
    // TODO: test validations
  }

  /**
   * Update existing Nigo
   *
   * Updates existing nigo; available as an Add-On Module
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void updateNigoTest() throws ApiException {
    String caseId = null;
    String nigoId = null;
    UpdateNigoRequest updateNigoRequest = null;
    String siteId = null;
    UpdateNigoResponse response = api.updateNigo(caseId, nigoId, updateNigoRequest, siteId);
    // TODO: test validations
  }

  /**
   * Update existing Task
   *
   * Updates existing task; available as an Add-On Module
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void updateTaskTest() throws ApiException {
    String caseId = null;
    String taskId = null;
    UpdateTaskRequest updateTaskRequest = null;
    String siteId = null;
    UpdateTaskResponse response = api.updateTask(caseId, taskId, updateTaskRequest, siteId);
    // TODO: test validations
  }

}
