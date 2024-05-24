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
 * The version of the OpenAPI document: 1.14.1 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.api;

import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.model.GetGroupsResponse;
import com.formkiq.client.model.GetUsersInGroupResponse;
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
   * Get configured system group(s)
   *
   * Returns the list of user groups configured in the application
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

}
