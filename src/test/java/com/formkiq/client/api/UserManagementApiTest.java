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
 * The version of the OpenAPI document: 1.17.1 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.api;

import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.model.AddGroupRequest;
import com.formkiq.client.model.AddResponse;
import com.formkiq.client.model.AddUserRequest;
import com.formkiq.client.model.DeleteResponse;
import com.formkiq.client.model.GetGroupResponse;
import com.formkiq.client.model.GetGroupsResponse;
import com.formkiq.client.model.GetUserGroupsResponse;
import com.formkiq.client.model.GetUserResponse;
import com.formkiq.client.model.GetUsersInGroupResponse;
import com.formkiq.client.model.GetUsersResponse;
import com.formkiq.client.model.SetResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserManagementApi
 */
@Disabled
public class UserManagementApiTest {

  private final UserManagementApi api = new UserManagementApi();

  /**
   * Add a group
   *
   * Add a new group
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addGroupTest() throws ApiException {
    AddGroupRequest addGroupRequest = null;
    AddResponse response = api.addGroup(addGroupRequest);
    // TODO: test validations
  }

  /**
   * Add User
   *
   * Adds a user
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addUserTest() throws ApiException {
    AddUserRequest addUserRequest = null;
    AddResponse response = api.addUser(addUserRequest);
    // TODO: test validations
  }

  /**
   * Add User to a group
   *
   * Adds a user to a group
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addUserToGroupTest() throws ApiException {
    String groupName = null;
    AddUserRequest addUserRequest = null;
    AddResponse response = api.addUserToGroup(groupName, addUserRequest);
    // TODO: test validations
  }

  /**
   * Delete Group
   *
   * Delete Group
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteGroupTest() throws ApiException {
    String groupName = null;
    DeleteResponse response = api.deleteGroup(groupName);
    // TODO: test validations
  }

  /**
   * Delete Username
   *
   * Delete Username
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteUsernameTest() throws ApiException {
    String username = null;
    DeleteResponse response = api.deleteUsername(username);
    // TODO: test validations
  }

  /**
   * Get a user group
   *
   * Returns a user group
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getGroupTest() throws ApiException {
    String groupName = null;
    GetGroupResponse response = api.getGroup(groupName);
    // TODO: test validations
  }

  /**
   * Get list of user group(s)
   *
   * Returns the list of user groups
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getGroupsTest() throws ApiException {
    String limit = null;
    String next = null;
    GetGroupsResponse response = api.getGroups(limit, next);
    // TODO: test validations
  }

  /**
   * Returns a list of group user belongs to
   *
   * Returns a list of group user belongs to
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getListOfUserGroupsTest() throws ApiException {
    String username = null;
    String limit = null;
    String next = null;
    GetUserGroupsResponse response = api.getListOfUserGroups(username, limit, next);
    // TODO: test validations
  }

  /**
   * Get a user
   *
   * Returns a user
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getUserTest() throws ApiException {
    String username = null;
    GetUserResponse response = api.getUser(username);
    // TODO: test validations
  }

  /**
   * Get list of user(s)
   *
   * Returns the list of users
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getUsersTest() throws ApiException {
    String limit = null;
    String next = null;
    GetUsersResponse response = api.getUsers(limit, next);
    // TODO: test validations
  }

  /**
   * Get users in a group
   *
   * Returns the list of users in a group
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getUsersInGroupTest() throws ApiException {
    String groupName = null;
    String limit = null;
    String next = null;
    GetUsersInGroupResponse response = api.getUsersInGroup(groupName, limit, next);
    // TODO: test validations
  }

  /**
   * Remove Username From Group
   *
   * Remove Username From Group
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void removeUsernameFromGroupTest() throws ApiException {
    String groupName = null;
    String username = null;
    DeleteResponse response = api.removeUsernameFromGroup(groupName, username);
    // TODO: test validations
  }

  /**
   * Set User Operation
   *
   * Set User Operation (disable, enable, reset-password)
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void setUserOperationTest() throws ApiException {
    String username = null;
    String userOperation = null;
    SetResponse response = api.setUserOperation(username, userOperation);
    // TODO: test validations
  }

}
