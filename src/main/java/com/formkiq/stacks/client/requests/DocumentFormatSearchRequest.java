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
 * Creates POST /documents/{documentId}/formats Request.
 *
 */
public class DocumentFormatSearchRequest implements ApiRequest {

  /** Mime Type. */
  private String mime;
  /** Request Parameters. */
  private Map<String, String> parameters = new HashMap<>();
  /** Request Parameters. */
  private Map<String, String> paths = new HashMap<>();
  /** Object Version Id. */
  private String versionId;

  /**
   * constructor.
   */
  public DocumentFormatSearchRequest() {}

  @Override
  public void addQueryParameter(final String key, final String value) {
    this.parameters.put(key, value);
  }

  /**
   * Set the DocumentId.
   * 
   * @param documentId {@link String}
   * @return {@link GetDocumentContentRequest}
   */
  public DocumentFormatSearchRequest documentId(final String documentId) {
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
    return "documents/" + this.paths.get("documentId") + "/formats";
  }

  /**
   * Get Mime Value.
   * 
   * @return {@link String}
   */
  public String mime() {
    return this.mime;
  }

  /**
   * Set the Mime.
   * 
   * @param contentType {@link String}
   * @return {@link DocumentFormatSearchRequest}
   */
  public DocumentFormatSearchRequest mime(final String contentType) {
    this.mime = contentType;
    return this;
  }

  /**
   * Site Identifier.
   * 
   * @param siteId {@link String}
   * @return {@link DocumentFormatSearchRequest}
   */
  public DocumentFormatSearchRequest siteId(final String siteId) {
    this.parameters.put("siteId", siteId);
    return this;
  }

  @Override
  public void validate() {
    Validate.notNull(this.paths.get("documentId"), "DocumentId is required.");
  }

  /**
   * Get Version Id.
   * 
   * @return {@link String}
   */
  public String versionId() {
    return this.versionId;
  }

  /**
   * Set Version Id.
   * 
   * @param value {@link String}
   * @return {@link DocumentFormatSearchRequest}
   */
  public DocumentFormatSearchRequest versionId(final String value) {
    this.versionId = value;
    return this;
  }
}
