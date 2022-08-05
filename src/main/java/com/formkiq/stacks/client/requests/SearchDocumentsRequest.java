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
import com.formkiq.stacks.client.models.DocumentSearchQuery;
import com.formkiq.stacks.client.models.DocumentSearchResponseFields;

/**
 * Creates POST /search Request.
 *
 */
public class SearchDocumentsRequest implements ApiRequest {

  /** Request Parameters. */
  private Map<String, String> parameters = new HashMap<>();
  /** {@link DocumentSearchQuery}. */
  private DocumentSearchQuery query = null;
  /** {@link DocumentSearchResponseFields}. */
  private DocumentSearchResponseFields responseFields = null;

  /**
   * constructor.
   */
  public SearchDocumentsRequest() {}

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
    return "search";
  }

  /**
   * Limit the number of results returned.
   * 
   * @param limit {@link String}
   * @return {@link SearchDocumentsRequest}
   */
  public SearchDocumentsRequest limit(final int limit) {
    this.parameters.put("limit", "" + limit);
    return this;
  }

  /**
   * set Next Results Token.
   * 
   * @param next {@link String}
   * @return {@link SearchDocumentsRequest}
   */
  public SearchDocumentsRequest next(final String next) {
    this.parameters.put("next", next);
    return this;
  }

  /**
   * set Previous Results Token.
   * 
   * @param previous {@link String}
   * @return {@link SearchDocumentsRequest}
   */
  public SearchDocumentsRequest previous(final String previous) {
    this.parameters.put("previous", previous);
    return this;
  }

  /**
   * Get {@link DocumentSearchQuery}.
   * 
   * @return {@link DocumentSearchQuery}
   */
  public DocumentSearchQuery query() {
    return this.query;
  }

  /**
   * Set {@link DocumentSearchQuery}.
   * 
   * @param searchQuery {@link DocumentSearchQuery}
   * @return {@link SearchDocumentsRequest}
   */
  public SearchDocumentsRequest query(final DocumentSearchQuery searchQuery) {
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
   * @return {@link SearchDocumentsRequest}
   */
  public SearchDocumentsRequest responseFields(final DocumentSearchResponseFields response) {
    this.responseFields = response;
    return this;
  }

  /**
   * Site Identifier.
   * 
   * @param siteId {@link String}
   * @return {@link SearchDocumentsRequest}
   */
  public SearchDocumentsRequest siteId(final String siteId) {
    this.parameters.put("siteId", siteId);
    return this;
  }

  @Override
  public void validate() {
    Validate.notNull(this.query, "Query is required.");
  }
}
