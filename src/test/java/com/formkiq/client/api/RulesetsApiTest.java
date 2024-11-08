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
 * The version of the OpenAPI document: 1.16.0 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.api;

import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.model.AddRuleRequest;
import com.formkiq.client.model.AddRuleResponse;
import com.formkiq.client.model.AddRulesetRequest;
import com.formkiq.client.model.AddRulesetResponse;
import com.formkiq.client.model.DeleteRuleResponse;
import com.formkiq.client.model.DeleteRulesetResponse;
import com.formkiq.client.model.GetRuleResponse;
import com.formkiq.client.model.GetRulesResponse;
import com.formkiq.client.model.GetRulesetResponse;
import com.formkiq.client.model.GetRulesetsResponse;
import com.formkiq.client.model.UpdateRuleRequest;
import com.formkiq.client.model.UpdateRuleResponse;
import com.formkiq.client.model.UpdateRulesetRequest;
import com.formkiq.client.model.UpdateRulesetResponse;
import com.formkiq.client.model.ValidationErrorsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RulesetsApi
 */
@Disabled
public class RulesetsApiTest {

  private final RulesetsApi api = new RulesetsApi();

  /**
   * Add New Rule
   *
   * Creates a new rule; ONLY available with FormKiQ Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addRuleTest() throws ApiException {
    String rulesetId = null;
    AddRuleRequest addRuleRequest = null;
    String siteId = null;
    AddRuleResponse response = api.addRule(rulesetId, addRuleRequest, siteId);
    // TODO: test validations
  }

  /**
   * Add New Ruleset
   *
   * Creates a new ruleset; ONLY available with FormKiQ Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void addRulesetTest() throws ApiException {
    AddRulesetRequest addRulesetRequest = null;
    String siteId = null;
    AddRulesetResponse response = api.addRuleset(addRulesetRequest, siteId);
    // TODO: test validations
  }

  /**
   * Delete Rule
   *
   * Delete Rule; ONLY available with FormKiQ Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteRuleTest() throws ApiException {
    String rulesetId = null;
    String ruleId = null;
    String siteId = null;
    DeleteRuleResponse response = api.deleteRule(rulesetId, ruleId, siteId);
    // TODO: test validations
  }

  /**
   * Delete Ruleset
   *
   * Delete Ruleset; ONLY available with FormKiQ Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteRulesetTest() throws ApiException {
    String rulesetId = null;
    String siteId = null;
    DeleteRulesetResponse response = api.deleteRuleset(rulesetId, siteId);
    // TODO: test validations
  }

  /**
   * Get Rule
   *
   * Returns a rule in a ruleset; ONLY available with FormKiQ Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getRuleTest() throws ApiException {
    String rulesetId = null;
    String ruleId = null;
    String siteId = null;
    GetRuleResponse response = api.getRule(rulesetId, ruleId, siteId);
    // TODO: test validations
  }

  /**
   * Get Rules
   *
   * Returns a list of rules in a ruleset; ONLY available with FormKiQ Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getRulesTest() throws ApiException {
    String rulesetId = null;
    String siteId = null;
    String next = null;
    String limit = null;
    GetRulesResponse response = api.getRules(rulesetId, siteId, next, limit);
    // TODO: test validations
  }

  /**
   * Get Ruleset
   *
   * Get a rule sets; ONLY available with FormKiQ Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getRulesetTest() throws ApiException {
    String rulesetId = null;
    String siteId = null;
    GetRulesetResponse response = api.getRuleset(rulesetId, siteId);
    // TODO: test validations
  }

  /**
   * Get Rulesets
   *
   * Returns a list of rule sets; ONLY available with FormKiQ Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getRulesetsTest() throws ApiException {
    String siteId = null;
    String next = null;
    String limit = null;
    GetRulesetsResponse response = api.getRulesets(siteId, next, limit);
    // TODO: test validations
  }

  /**
   * Update Rule
   *
   * Update Rule; ONLY available with FormKiQ Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void updateRuleTest() throws ApiException {
    String rulesetId = null;
    String ruleId = null;
    UpdateRuleRequest updateRuleRequest = null;
    String siteId = null;
    UpdateRuleResponse response = api.updateRule(rulesetId, ruleId, updateRuleRequest, siteId);
    // TODO: test validations
  }

  /**
   * Update Ruleset
   *
   * Updates an existing ruleset; ONLY available with FormKiQ Enterprise
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void updateRulesetTest() throws ApiException {
    String rulesetId = null;
    UpdateRulesetRequest updateRulesetRequest = null;
    String siteId = null;
    UpdateRulesetResponse response = api.updateRuleset(rulesetId, updateRulesetRequest, siteId);
    // TODO: test validations
  }

}
