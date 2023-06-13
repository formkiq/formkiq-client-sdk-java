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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import com.formkiq.stacks.client.ApiRequest;
import com.formkiq.stacks.client.Validate;
import com.formkiq.stacks.client.models.AddDocumentAction;

/**
 * Creates POST /documents/{documentId}/tags Request.
 *
 */
public class AddDocumentActionRequest implements ApiRequest {

  /** {@link List} {@link AddDocumentAction}. */
  private List<AddDocumentAction> actions;
  /** Request Parameters. */
  private Map<String, String> parameters = new HashMap<>();
  /** Request Parameters. */
  private Map<String, String> paths = new HashMap<>();

  /**
   * constructor.
   */
  public AddDocumentActionRequest() {
    this.actions = new ArrayList<>();
  }

  /**
   * Get Actions.
   * 
   * @return {@link List} {@link AddDocumentAction}
   */
  public List<AddDocumentAction> actions() {
    return this.actions;
  }

  /**
   * Set Document Actions.
   * 
   * @param list {@link List} {@link AddDocumentAction}
   * @return {@link AddDocumentActionRequest}
   */
  public AddDocumentActionRequest actions(final List<AddDocumentAction> list) {
    this.actions = list;
    return this;
  }

  @Override
  public void addQueryParameter(final String key, final String value) {
    this.parameters.put(key, value);
  }

  /**
   * Set the DocumentId.
   * 
   * @param documentId {@link String}
   * @return {@link AddDocumentActionRequest}
   */
  public AddDocumentActionRequest documentId(final String documentId) {
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
    return "documents/" + this.paths.get("documentId") + "/actions";
  }

  /**
   * Site Identifier.
   * 
   * @param siteId {@link String}
   * @return {@link AddDocumentActionRequest}
   */
  public AddDocumentActionRequest siteId(final String siteId) {
    this.parameters.put("siteId", siteId);
    return this;
  }

  @Override
  public void validate() {
    Validate.notNull(this.paths.get("documentId"), "DocumentId is required.");
  }
}
