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
import com.formkiq.stacks.client.models.FulltextSearchQuery;

/**
 * Creates POST /searchFulltext Request.
 *
 */
public class SearchFulltextRequest implements ApiRequest {

  /** Request Parameters. */
  private Map<String, String> parameters = new HashMap<>();
  /** {@link FulltextSearchQuery}. */
  private FulltextSearchQuery query = null;

  /**
   * constructor.
   */
  public SearchFulltextRequest() {}

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
    return "searchFulltext";
  }

  /**
   * Limit the number of results returned.
   * 
   * @param limit {@link String}
   * @return {@link SearchFulltextRequest}
   */
  public SearchFulltextRequest limit(final int limit) {
    this.parameters.put("limit", "" + limit);
    return this;
  }

  /**
   * Get {@link FulltextSearchQuery}.
   * 
   * @return {@link FulltextSearchQuery}
   */
  public FulltextSearchQuery query() {
    return this.query;
  }

  /**
   * Set {@link FulltextSearchQuery}.
   * 
   * @param searchQuery {@link FulltextSearchQuery}
   * @return {@link SearchFulltextRequest}
   */
  public SearchFulltextRequest query(final FulltextSearchQuery searchQuery) {
    this.query = searchQuery;
    return this;
  }

  /**
   * Site Identifier.
   * 
   * @param siteId {@link String}
   * @return {@link SearchFulltextRequest}
   */
  public SearchFulltextRequest siteId(final String siteId) {
    this.parameters.put("siteId", siteId);
    return this;
  }

  @Override
  public void validate() {
    Validate.notNull(this.query, "Query is required.");
  }
}
