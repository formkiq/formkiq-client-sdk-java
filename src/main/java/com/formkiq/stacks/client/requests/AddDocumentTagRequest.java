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
 * Creates POST /documents/{documentId}/tags Request.
 *
 */
public class AddDocumentTagRequest implements ApiRequest {

  /** Tag Key. */
  private String tagKey;
  /** Tag Value. */
  private String tagValue;
  /** Tag Values. */
  private List<String> tagValues;
  /** Request Parameters. */
  private Map<String, String> paths = new HashMap<>();
  /** Request Parameters. */
  private Map<String, String> parameters = new HashMap<>();

  /**
   * constructor.
   */
  public AddDocumentTagRequest() {}

  /**
   * Set the DocumentId.
   * 
   * @param documentId {@link String}
   * @return {@link AddDocumentTagRequest}
   */
  public AddDocumentTagRequest documentId(final String documentId) {
    this.paths.put("documentId", documentId);
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
    return "documents/" + this.paths.get("documentId") + "/tags";
  }

  /**
   * Site Identifier.
   * 
   * @param siteId {@link String}
   * @return {@link AddDocumentTagRequest}
   */
  public AddDocumentTagRequest siteId(final String siteId) {
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
   * Set Tag Key.
   * 
   * @param s {@link String}
   * @return {@link AddDocumentTagRequest}
   */
  public AddDocumentTagRequest tagKey(final String s) {
    this.tagKey = s;
    return this;
  }

  /**
   * Get Tag Value.
   * 
   * @return {@link String}
   */
  public String tagValue() {
    return this.tagValue;
  }

  /**
   * Set Tag Value.
   * 
   * @param s {@link String}
   * @return {@link AddDocumentTagRequest}
   */
  public AddDocumentTagRequest tagValue(final String s) {
    this.tagValue = s;
    return this;
  }

  /**
   * Get Tag Values.
   * 
   * @return {@link String}
   */
  public List<String> tagValues() {
    return this.tagValues;
  }

  /**
   * Set Tag Values.
   * 
   * @param list {@link List} {@link String}
   * @return {@link AddDocumentTagRequest}
   */
  public AddDocumentTagRequest tagValues(final List<String> list) {
    this.tagValues = list;
    return this;
  }

  @Override
  public void validate() {
    Validate.notNull(this.paths.get("documentId"), "DocumentId is required.");
    Validate.notNull(this.tagKey, "TagKey is required.");
    Validate.notNull(this.tagValue, this.tagValues, "TagValue or TagValues is required.");
  }

  /**
   * WebNotify.
   * 
   * @param webnotify boolean
   * @return {@link AddDocumentTagRequest}
   */
  public AddDocumentTagRequest webnotify(final boolean webnotify) {
    this.parameters.put("webnotify", String.valueOf(webnotify));
    return this;
  }
}
