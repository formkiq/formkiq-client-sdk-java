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
import java.util.Map;
import com.formkiq.stacks.client.ApiRequest;

/**
 * OPTIONS /documents/{documentId}/tags/{tagKey} Request.
 *
 */
public class OptionsDocumentTagsKeyRequest implements ApiRequest {

  /** Request Parameters. */
  private Map<String, String> paths = new HashMap<>();

  /**
   * constructor.
   */
  public OptionsDocumentTagsKeyRequest() {}

  /**
   * Set the DocumentId.
   * 
   * @param documentId {@link String}
   * @return {@link OptionsDocumentTagsKeyRequest}
   */
  public OptionsDocumentTagsKeyRequest documentId(final String documentId) {
    this.paths.put("documentId", documentId);
    return this;
  }

  /**
   * Set the tagKey.
   * 
   * @param tagKey {@link String}
   * @return {@link OptionsDocumentTagsKeyRequest}
   */
  public OptionsDocumentTagsKeyRequest tagKey(final String tagKey) {
    this.paths.put("tagKey", tagKey);
    return this;
  }

  @Override
  public Map<String, String> getQueryParameters() {
    return Collections.emptyMap();
  }

  @Override
  public String getUrlPath() {
    return "documents/" + this.paths.get("documentId") + "/tags/" + this.paths.get("tagKey");
  }
}
