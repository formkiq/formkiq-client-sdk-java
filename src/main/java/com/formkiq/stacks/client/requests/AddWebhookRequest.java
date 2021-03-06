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
 * POST /webhooks.
 *
 */
public class AddWebhookRequest implements ApiRequest {

  /** Request Parameters. */
  private Map<String, String> parameters = new HashMap<>();

  /** {@link String}. */
  private String name;

  /**
   * constructor.
   */
  public AddWebhookRequest() {}

  /**
   * Set Name.
   * 
   * @return {@link String}
   */
  public String name() {
    return this.name;
  }

  /**
   * Set {@link String}.
   * 
   * @param s {@link String}
   * @return {@link AddWebhookRequest}
   */
  public AddWebhookRequest name(final String s) {
    this.name = s;
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
    return "webhooks";
  }

  /**
   * Site Identifier.
   * 
   * @param siteId {@link String}
   * @return {@link AddWebhookRequest}
   */
  public AddWebhookRequest siteId(final String siteId) {
    this.parameters.put("siteId", siteId);
    return this;
  }

  @Override
  public void validate() {
    Validate.notNull(this.name, "Document is required.");
  }

  /**
   * WebNotify.
   * 
   * @param webnotify boolean
   * @return {@link AddWebhookRequest}
   */
  public AddWebhookRequest webnotify(final boolean webnotify) {
    this.parameters.put("webnotify", String.valueOf(webnotify));
    return this;
  }
}
