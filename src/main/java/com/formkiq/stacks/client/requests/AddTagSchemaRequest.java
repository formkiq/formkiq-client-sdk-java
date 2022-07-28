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
import com.formkiq.stacks.client.models.TagSchema;

/**
 * Creates POST /tagSchemas Request.
 *
 */
public class AddTagSchemaRequest implements ApiRequest {

  /** Request Parameters. */
  private Map<String, String> parameters = new HashMap<>();

  /** {@link TagSchema}. */
  private TagSchema tagSchema;

  /**
   * constructor.
   */
  public AddTagSchemaRequest() {}

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
    return "tagSchemas";
  }

  /**
   * Site Identifier.
   * 
   * @param siteId {@link String}
   * @return {@link AddTagSchemaRequest}
   */
  public AddTagSchemaRequest siteId(final String siteId) {
    this.parameters.put("siteId", siteId);
    return this;
  }

  /**
   * Get {@link TagSchema}.
   * 
   * @return {@link TagSchema}
   */
  public TagSchema tagSchema() {
    return this.tagSchema;
  }

  /**
   * Set {@link TagSchema}.
   * 
   * @param schema {@link TagSchema}
   * @return {@link AddTagSchemaRequest}
   */
  public AddTagSchemaRequest tagSchema(final TagSchema schema) {
    this.tagSchema = schema;
    return this;
  }

  @Override
  public void validate() {
    Validate.notNull(this.tagSchema, "TagSchema is required.");
  }
}