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
 * Creates GET /documents/upload or /documents/{documentId}/url Request.
 *
 */
public class GetDocumentUploadRequest implements ApiRequest {

  /** Request Parameters. */
  private Map<String, String> paths = new HashMap<>();
  /** Request Parameters. */
  private Map<String, String> parameters = new HashMap<>();

  /**
   * constructor.
   */
  public GetDocumentUploadRequest() {}

  /**
   * Set the ContentLength of the data.
   * 
   * @param contentLength long
   * @return {@link GetDocumentUploadRequest}
   */
  public GetDocumentUploadRequest contentLength(final long contentLength) {
    this.parameters.put("contentLength", "" + contentLength);
    return this;
  }

  /**
   * Set the DocumentId.
   * 
   * @param documentId {@link String}
   * @return {@link GetDocumentUploadRequest}
   */
  public GetDocumentUploadRequest documentId(final String documentId) {
    this.paths.put("documentId", documentId);
    return this;
  }

  /**
   * Indicates the number of hours request is valid for.
   * 
   * @param duration int
   * @return {@link GetDocumentUploadRequest}
   */
  public GetDocumentUploadRequest duration(final int duration) {
    this.parameters.put("duration", "" + duration);
    return this;
  }

  @Override
  public Map<String, String> getQueryParameters() {
    return this.parameters;
  }

  @Override
  public String getUrlPath() {
    return this.paths.containsKey("documentId") && this.paths.get("documentId") != null
        ? "documents/" + this.paths.get("documentId") + "/upload"
        : "documents/upload";
  }

  /**
   * Set Document Path attribute.
   * 
   * @param path {@link String}
   * @return {@link GetDocumentUploadRequest}
   */
  public GetDocumentUploadRequest path(final String path) {
    this.parameters.put("path", path);
    return this;
  }

  /**
   * Site Identifier.
   * 
   * @param siteId {@link String}
   * @return {@link GetDocumentUploadRequest}
   */
  public GetDocumentUploadRequest siteId(final String siteId) {
    this.parameters.put("siteId", siteId);
    return this;
  }
}
