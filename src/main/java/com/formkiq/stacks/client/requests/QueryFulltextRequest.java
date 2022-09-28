/**
 * Copyright [2020] FormKiQ Inc. Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You may obtain a copy of the License
 * at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.formkiq.stacks.client.requests;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import com.formkiq.stacks.client.ApiRequest;
import com.formkiq.stacks.client.Validate;
import com.formkiq.stacks.client.models.DocumentSearchResponseFields;
import com.formkiq.stacks.client.models.FulltextSearchQuery;

/**
 * Creates POST /queryFulltext Request.
 *
 */
public class QueryFulltextRequest implements ApiRequest {

  /** Request Parameters. */
  private Map<String, String> parameters = new HashMap<>();
  /** {@link String}. */
  private String query = null;
  /** {@link DocumentSearchResponseFields}. */
  private DocumentSearchResponseFields responseFields = null;

  /**
   * constructor.
   */
  public QueryFulltextRequest() {}

  @Override
  public void addQueryParameter(final String key, final String value) {
    this.parameters.put(key, value);
  }

  @Override
  public Optional<Map<String, List<String>>> getHttpHeaders() {
    return Optional.empty();
  }

  @Override
  public Map<String, String> getQueryParameters() {
    return this.parameters;
  }

  @Override
  public String getUrlPath() {
    return "queryFulltext";
  }

  /**
   * Get {@link String}.
   * 
   * @return {@link String}
   */
  public String query() {
    return this.query;
  }

  /**
   * Set {@link FulltextSearchQuery}.
   * 
   * @param searchQuery {@link String}
   * @return {@link QueryFulltextRequest}
   */
  public QueryFulltextRequest query(final String searchQuery) {
    this.query = searchQuery;
    return this;
  }

  /**
   * Get {@link DocumentSearchResponseFields}.
   * 
   * @return {@link DocumentSearchResponseFields}
   */
  public DocumentSearchResponseFields responseFields() {
    return this.responseFields;
  }

  /**
   * Set {@link DocumentSearchResponseFields}.
   * 
   * @param response {@link DocumentSearchResponseFields}
   * @return {@link QueryFulltextRequest}
   */
  public QueryFulltextRequest responseFields(final DocumentSearchResponseFields response) {
    this.responseFields = response;
    return this;
  }

  /**
   * Site Identifier.
   * 
   * @param siteId {@link String}
   * @return {@link QueryFulltextRequest}
   */
  public QueryFulltextRequest siteId(final String siteId) {
    this.parameters.put("siteId", siteId);
    return this;
  }

  @Override
  public void validate() {
    Validate.notNull(this.query, "Query is required.");
  }
}
