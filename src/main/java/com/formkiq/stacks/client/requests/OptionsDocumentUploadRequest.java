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

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import com.formkiq.stacks.client.ApiRequest;

/**
 * OPTIONS /documents/upload or /documents/{documentId}/url Request.
 *
 */
public class OptionsDocumentUploadRequest implements ApiRequest {

  /** Request Parameters. */
  private Map<String, String> paths = new HashMap<>();

  /**
   * constructor.
   */
  public OptionsDocumentUploadRequest() {}

  /**
   * Set the DocumentId.
   * 
   * @param documentId {@link String}
   * @return {@link OptionsDocumentUploadRequest}
   */
  public OptionsDocumentUploadRequest documentId(final String documentId) {
    this.paths.put("documentId", documentId);
    return this;
  }

  @Override
  public Optional<Map<String, List<String>>> getHttpHeaders() {
    return Optional.empty();
  }

  @Override
  public Map<String, String> getQueryParameters() {
    return Collections.emptyMap();
  }

  @Override
  public String getUrlPath() {
    return this.paths.containsKey("documentId") && this.paths.get("documentId") != null
        ? "documents/" + this.paths.get("documentId") + "/upload"
        : "documents/upload";
  }

  @Override
  public void validate() {
    // empty
  }
}
