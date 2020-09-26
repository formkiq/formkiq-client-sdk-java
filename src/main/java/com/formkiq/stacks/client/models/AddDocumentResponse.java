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
package com.formkiq.stacks.client.models;

import java.util.List;

/**
 * Response object for POST /documents.
 *
 */
public class AddDocumentResponse {

  /** Site Id. */
  private String siteId;
  /** Document Identifier. */
  private String documentId;
  /** Upload Url. */
  private String uploadUrl;
  /** {@link List} {@link DocumentUploadUrl}. */
  private List<DocumentUploadUrl> documents;

  /**
   * constructor.
   */
  public AddDocumentResponse() {}

  /**
   * Get Document Identifier.
   * 
   * @return {@link String}
   */
  public String documentId() {
    return this.documentId;
  }

  /**
   * Get Site Id.
   * 
   * @return {@link String}
   */
  public String siteId() {
    return this.siteId;
  }

  /**
   * Get Upload Url.
   * 
   * @return {@link String}
   */
  public String uploadUrl() {
    return this.uploadUrl;
  }

  /**
   * Get Child Documents.
   * 
   * @return {@link List} {@link DocumentUploadUrl}
   */
  public List<DocumentUploadUrl> documents() {
    return this.documents;
  }
}
