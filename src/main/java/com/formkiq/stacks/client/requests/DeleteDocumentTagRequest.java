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
 * Creates DELETE /documents/{documentId}/tags/{tagKey} or
 * /documents/{documentId}/tags/{tagKey}/{tagValue} Request.
 *
 */
public class DeleteDocumentTagRequest implements ApiRequest {

  /** Request Parameters. */
  private Map<String, String> paths = new HashMap<>();
  /** Request Parameters. */
  private Map<String, String> parameters = new HashMap<>();

  /**
   * constructor.
   */
  public DeleteDocumentTagRequest() {}

  /**
   * Set the DocumentId.
   * 
   * @param documentId {@link String}
   * @return {@link DeleteDocumentTagRequest}
   */
  public DeleteDocumentTagRequest documentId(final String documentId) {
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
    String url = "documents/" + this.paths.get("documentId") + "/tags/" + this.paths.get("tagKey");
    if (this.paths.containsKey("tagValue")) {
      url += "/" + this.paths.get("tagValue");
    }
    return url;
  }

  /**
   * Site Identifier.
   * 
   * @param siteId {@link String}
   * @return {@link DeleteDocumentTagRequest}
   */
  public DeleteDocumentTagRequest siteId(final String siteId) {
    this.parameters.put("siteId", siteId);
    return this;
  }

  /**
   * Set the TagKey.
   * 
   * @param tagKey {@link String}
   * @return {@link DeleteDocumentTagRequest}
   */
  public DeleteDocumentTagRequest tagKey(final String tagKey) {
    this.paths.put("tagKey", tagKey);
    return this;
  }

  /**
   * Set the TagValue.
   * 
   * @param tagValue {@link String}
   * @return {@link DeleteDocumentTagRequest}
   */
  public DeleteDocumentTagRequest tagValue(final String tagValue) {
    this.paths.put("tagValue", tagValue);
    return this;
  }

  @Override
  public void validate() {
    Validate.notNull(this.paths.get("documentId"), "DocumentId is required.");
    Validate.notNull(this.paths.get("tagKey"), "TagKey is required.");
  }

  /**
   * WebNotify.
   * 
   * @param webnotify boolean
   * @return {@link DeleteDocumentTagRequest}
   */
  public DeleteDocumentTagRequest webnotify(final boolean webnotify) {
    this.parameters.put("webnotify", String.valueOf(webnotify));
    return this;
  }
}
