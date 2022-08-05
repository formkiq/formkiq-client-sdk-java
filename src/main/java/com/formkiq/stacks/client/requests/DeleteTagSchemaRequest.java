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
 * Creates DELETE /tagSchemas/{tagSchemaId}.
 *
 */
public class DeleteTagSchemaRequest implements ApiRequest {

  /** Request Parameters. */
  private Map<String, String> parameters = new HashMap<>();

  /** Request Paths. */
  private Map<String, String> paths = new HashMap<>();

  /**
   * constructor.
   */
  public DeleteTagSchemaRequest() {}

  @Override
  public void addQueryParameter(final String key, final String value) {
    this.parameters.put(key, value);
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
    return "tagSchemas/" + this.paths.get("tagSchemaId");
  }

  /**
   * Site Identifier.
   * 
   * @param siteId {@link String}
   * @return {@link DeleteTagSchemaRequest}
   */
  public DeleteTagSchemaRequest siteId(final String siteId) {
    this.parameters.put("siteId", siteId);
    return this;
  }

  /**
   * Set the tagSchemaId.
   * 
   * @param tagSchemaId {@link String}
   * @return {@link DeleteTagSchemaRequest}
   */
  public DeleteTagSchemaRequest tagSchemaId(final String tagSchemaId) {
    this.paths.put("tagSchemaId", tagSchemaId);
    return this;
  }

  @Override
  public void validate() {
    Validate.notNull(this.paths.get("tagSchemaId"), "TagSchemaId is required.");
  }
}
