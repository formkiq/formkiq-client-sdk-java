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
 * Creates GET /webhooks/{webhookId}/tags.
 *
 */
public class GetWebhookTagsRequest implements ApiRequest {

  /** Request Paths. */
  private Map<String, String> paths = new HashMap<>();

  /** Request Parameters. */
  private Map<String, String> parameters = new HashMap<>();

  /**
   * constructor.
   */
  public GetWebhookTagsRequest() {}

  /**
   * Set the DocumentId.
   * 
   * @param webhookId {@link String}
   * @return {@link GetWebhookTagsRequest}
   */
  public GetWebhookTagsRequest webhookId(final String webhookId) {
    this.paths.put("webhookId", webhookId);
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
    return "webhooks/" + this.paths.get("webhookId") + "/tags";
  }

  /**
   * Site Identifier.
   * 
   * @param siteId {@link String}
   * @return {@link GetWebhookTagsRequest}
   */
  public GetWebhookTagsRequest siteId(final String siteId) {
    this.parameters.put("siteId", siteId);
    return this;
  }

  @Override
  public void validate() {
    Validate.notNull(this.paths.get("webhookId"), "webhookId is required.");
  }
}
