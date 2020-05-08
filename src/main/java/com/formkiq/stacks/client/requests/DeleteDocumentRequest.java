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
import java.util.Map;
import com.formkiq.stacks.client.ApiRequest;

/**
 * Creates DELETE /documents/{documentId}.
 *
 */
public class DeleteDocumentRequest implements ApiRequest {

  /** Request Paths. */
  private Map<String, String> paths = new HashMap<>();

  /** Request Parameters. */
  private Map<String, String> parameters = new HashMap<>();

  /**
   * constructor.
   */
  public DeleteDocumentRequest() {}

  /**
   * Set the DocumentId.
   * 
   * @param documentId {@link String}
   * @return {@link DeleteDocumentRequest}
   */
  public DeleteDocumentRequest documentId(final String documentId) {
    this.paths.put("documentId", documentId);
    return this;
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
   * @return {@link DeleteDocumentRequest}
   */
  public DeleteDocumentRequest siteId(final String siteId) {
    this.parameters.put("siteId", siteId);
    return this;
  }
}
