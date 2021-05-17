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
 * PUT /documents/{documentId}/tags/{tagKey} Request.
 *
 */
public class UpdateDocumentTagKeyRequest implements ApiRequest {

  /** Request Parameters. */
  private Map<String, String> paths = new HashMap<>();
  /** Request Parameters. */
  private Map<String, String> parameters = new HashMap<>();
  /** Tag Value. */
  private String tagValue;

  /**
   * constructor.
   */
  public UpdateDocumentTagKeyRequest() {}

  /**
   * Set the DocumentId.
   * 
   * @param documentId {@link String}
   * @return {@link UpdateDocumentTagKeyRequest}
   */
  public UpdateDocumentTagKeyRequest documentId(final String documentId) {
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
    return "documents/" + this.paths.get("documentId") + "/tags/" + this.paths.get("tagKey");
  }

  /**
   * Site Identifier.
   * 
   * @param siteId {@link String}
   * @return {@link UpdateDocumentTagKeyRequest}
   */
  public UpdateDocumentTagKeyRequest siteId(final String siteId) {
    this.parameters.put("siteId", siteId);
    return this;
  }

  /**
   * Set the tagKey.
   * 
   * @param tagKey {@link String}
   * @return {@link UpdateDocumentTagKeyRequest}
   */
  public UpdateDocumentTagKeyRequest tagKey(final String tagKey) {
    this.paths.put("tagKey", tagKey);
    return this;
  }

  /**
   * Set the tagValue.
   * 
   * @return {@link UpdateDocumentTagKeyRequest}
   */
  public String tagValue() {
    return this.tagValue;
  }

  /**
   * Set the tagValue.
   * 
   * @param value {@link String}
   * @return {@link UpdateDocumentTagKeyRequest}
   */
  public UpdateDocumentTagKeyRequest tagValue(final String value) {
    this.tagValue = value;
    return this;
  }

  @Override
  public void validate() {
    Validate.notNull(this.paths.get("documentId"), "DocumentId is required.");
    Validate.notNull(this.paths.get("tagKey"), "TagKey is required.");
    Validate.notNull(this.tagValue, "TagValue is required.");
  }

  /**
   * WebNotify.
   * 
   * @param webnotify boolean
   * @return {@link UpdateDocumentTagKeyRequest}
   */
  public UpdateDocumentTagKeyRequest webnotify(final boolean webnotify) {
    this.parameters.put("webnotify", String.valueOf(webnotify));
    return this;
  }
}
