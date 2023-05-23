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
 * Creates DELETE /configs/apiKey.
 *
 */
public class DeleteApiKeyRequest implements ApiRequest {

  /** Request Parameters. */
  private Map<String, String> parameters = new HashMap<>();

  /** Request Paths. */
  private Map<String, String> paths = new HashMap<>();

  /**
   * constructor.
   */
  public DeleteApiKeyRequest() {}

  @Override
  public void addQueryParameter(final String key, final String value) {
    this.parameters.put(key, value);
  }

  /**
   * Set the Api Key.
   * 
   * @param apiKey {@link String}
   * @return {@link DeleteApiKeyRequest}
   */
  public DeleteApiKeyRequest apiKey(final String apiKey) {
    this.paths.put("apiKey", apiKey);
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
    return "configs/apiKey/" + this.paths.get("apiKey");
  }

  /**
   * Site Identifier.
   * 
   * @param siteId {@link String}
   * @return {@link DeleteApiKeyRequest}
   */
  public DeleteApiKeyRequest siteId(final String siteId) {
    this.parameters.put("siteId", siteId);
    return this;
  }

  @Override
  public void validate() {
    Validate.notNull(this.paths.get("apiKey"), "Api Key is required.");
  }
}
