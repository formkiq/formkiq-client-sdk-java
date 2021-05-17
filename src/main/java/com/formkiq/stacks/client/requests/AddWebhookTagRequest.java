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
 * Creates POST /webhooks/{webhookId}/tags Request.
 *
 */
public class AddWebhookTagRequest implements ApiRequest {

  /** Tag Key. */
  private String tagKey;
  /** Tag Value. */
  private String tagValue;
  /** Request Parameters. */
  private Map<String, String> paths = new HashMap<>();
  /** Request Parameters. */
  private Map<String, String> parameters = new HashMap<>();

  /**
   * constructor.
   */
  public AddWebhookTagRequest() {}

  /**
   * Set the WebhookId.
   * 
   * @param webhookId {@link String}
   * @return {@link AddWebhookTagRequest}
   */
  public AddWebhookTagRequest webhookId(final String webhookId) {
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
   * @return {@link AddWebhookTagRequest}
   */
  public AddWebhookTagRequest siteId(final String siteId) {
    this.parameters.put("siteId", siteId);
    return this;
  }

  /**
   * Get Tag Key.
   * 
   * @return {@link String}
   */
  public String tagKey() {
    return this.tagKey;
  }

  /**
   * Set Tag Key.
   * 
   * @param s {@link String}
   * @return {@link AddWebhookTagRequest}
   */
  public AddWebhookTagRequest tagKey(final String s) {
    this.tagKey = s;
    return this;
  }

  /**
   * Get Tag Value.
   * 
   * @return {@link String}
   */
  public String tagValue() {
    return this.tagValue;
  }

  /**
   * Set Tag Value.
   * 
   * @param s {@link String}
   * @return {@link AddWebhookTagRequest}
   */
  public AddWebhookTagRequest tagValue(final String s) {
    this.tagValue = s;
    return this;
  }

  @Override
  public void validate() {
    Validate.notNull(this.paths.get("webhookId"), "WebhookId is required.");
    Validate.notNull(this.tagKey, "TagKey is required.");
    Validate.notNull(this.tagValue, "TagValue is required.");
  }

  /**
   * WebNotify.
   * 
   * @param webnotify boolean
   * @return {@link AddWebhookTagRequest}
   */
  public AddWebhookTagRequest webnotify(final boolean webnotify) {
    this.parameters.put("webnotify", String.valueOf(webnotify));
    return this;
  }
}
