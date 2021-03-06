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
import com.formkiq.stacks.client.models.UpdateDocument;

/**
 * PATCH(Update) /documents/{documentId}.
 *
 */
public class UpdateDocumentRequest implements ApiRequest {

  /** Request Paths. */
  private Map<String, String> paths = new HashMap<>();

  /** Request Parameters. */
  private Map<String, String> parameters = new HashMap<>();

  /** {@link UpdateDocument}. */
  private UpdateDocument document;

  /**
   * constructor.
   */
  public UpdateDocumentRequest() {}

  /**
   * Set {@link UpdateDocument}.
   * 
   * @return {@link UpdateDocument}
   */
  public UpdateDocument document() {
    return this.document;
  }

  /**
   * Set {@link UpdateDocument}.
   * 
   * @param updateDocument {@link UpdateDocument}
   * @return {@link UpdateDocumentRequest}
   */
  public UpdateDocumentRequest document(final UpdateDocument updateDocument) {
    this.document = updateDocument;
    return this;
  }

  /**
   * Set the DocumentId.
   * 
   * @param documentId {@link String}
   * @return {@link UpdateDocumentRequest}
   */
  public UpdateDocumentRequest documentId(final String documentId) {
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
    return "documents/" + this.paths.get("documentId");
  }

  /**
   * Site Identifier.
   * 
   * @param siteId {@link String}
   * @return {@link UpdateDocumentRequest}
   */
  public UpdateDocumentRequest siteId(final String siteId) {
    this.parameters.put("siteId", siteId);
    return this;
  }

  @Override
  public void validate() {
    Validate.notNull(this.paths.get("documentId"), "DocumentId is required.");
  }

  /**
   * WebNotify.
   * 
   * @param webnotify boolean
   * @return {@link UpdateDocumentRequest}
   */
  public UpdateDocumentRequest webnotify(final boolean webnotify) {
    this.parameters.put("webnotify", String.valueOf(webnotify));
    return this;
  }
}
