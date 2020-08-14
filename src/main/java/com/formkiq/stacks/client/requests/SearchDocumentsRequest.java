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

/**
 * Creates POST /search Request.
 *
 */
public class SearchDocumentsRequest implements ApiRequest {

  /** Tag Key. */
  private String tagKey;
  /** Tag Value. */
  private String eq;
  /** Tag Value. */
  private String beginsWith;
  /** Request Parameters. */
  private Map<String, String> parameters = new HashMap<>();

  /**
   * constructor.
   */
  public SearchDocumentsRequest() {}


  /**
   * Get BeginsWith Value.
   * 
   * @return {@link String}
   */
  public String beginsWith() {
    return this.beginsWith;
  }

  /**
   * Set the BeginsWith search criteria.
   * 
   * @param value {@link String}
   * @return {@link SearchDocumentsRequest}
   */
  public SearchDocumentsRequest beginsWith(final String value) {
    this.beginsWith = value;
    return this;
  }

  /**
   * Get Eq Value.
   * 
   * @return {@link String}
   */
  public String eq() {
    return this.eq;
  }

  /**
   * Set the equals search criteria.
   * 
   * @param value {@link String}
   * @return {@link SearchDocumentsRequest}
   */
  public SearchDocumentsRequest eq(final String value) {
    this.eq = value;
    return this;
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
   * Site Identifier.
   * 
   * @param siteId {@link String}
   * @return {@link SearchDocumentsRequest}
   */
  public SearchDocumentsRequest siteId(final String siteId) {
    this.parameters.put("siteId", siteId);
    return this;
  }

  /**
   * Get Tag Key.
   * 
   * @return {@link String}
   */
  public String tagKey() {
    return this.tagKey;
  }

  /**
   * Set the tagKey.
   * 
   * @param key {@link String}
   * @return {@link SearchDocumentsRequest}
   */
  public SearchDocumentsRequest tagKey(final String key) {
    this.tagKey = key;
    return this;
  }

  @Override
  public void validate() {
    Validate.notNull(this.tagKey, "TagKey is required.");
  }
}
