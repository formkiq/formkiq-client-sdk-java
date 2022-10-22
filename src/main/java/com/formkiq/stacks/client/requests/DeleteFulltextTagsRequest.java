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

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import com.formkiq.stacks.client.ApiRequest;
import com.formkiq.stacks.client.Validate;
import com.formkiq.stacks.client.models.DeleteFulltextTag;
import software.amazon.awssdk.utils.StringUtils;

/**
 * Creates DELETE /documents/{DocumentId}/fulltext/tags/{tagKey} and
 * /documents/{DocumentId}/fulltext/tags/{tagKey}/{tagValue}.
 *
 */
public class DeleteFulltextTagsRequest implements ApiRequest {

  /** Request Parameters. */
  private Map<String, String> parameters = new HashMap<>();

  /** Request Paths. */
  private Map<String, String> paths = new HashMap<>();

  /** {@link DeleteFulltextTag}. */
  private DeleteFulltextTag tag;

  /**
   * constructor.
   */
  public DeleteFulltextTagsRequest() {}

  @Override
  public void addQueryParameter(final String key, final String value) {
    this.parameters.put(key, value);
  }

  /**
   * Set the DocumentId.
   * 
   * @param documentId {@link String}
   * @return {@link DeleteFulltextTagsRequest}
   */
  public DeleteFulltextTagsRequest documentId(final String documentId) {
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
  public String getUrlPath() throws IOException {
    return !StringUtils.isEmpty(this.tag.value())
        ? String.format("documents/%s/fulltext/tags/%s/%s", this.paths.get("documentId"),
            encodeValue(this.tag.key()), encodeValue(this.tag.value()))
        : String.format("documents/%s/fulltext/tags/%s", this.paths.get("documentId"),
            encodeValue(this.tag.key()));
  }

  /**
   * Site Identifier.
   * 
   * @param siteId {@link String}
   * @return {@link DeleteFulltextTagsRequest}
   */
  public DeleteFulltextTagsRequest siteId(final String siteId) {
    this.parameters.put("siteId", siteId);
    return this;
  }

  /**
   * Set {@link DeleteFulltextTag}.
   * 
   * @param deleteTag {@link DeleteFulltextTag}
   * @return {@link DeleteFulltextTagsRequest}
   */
  public DeleteFulltextTagsRequest tag(final DeleteFulltextTag deleteTag) {
    this.tag = deleteTag;
    return this;
  }

  @Override
  public void validate() {
    Validate.notNull(this.paths.get("documentId"), "DocumentId is required.");
    Validate.notNull(this.tag, "DocumentTag is required.");
  }
}
