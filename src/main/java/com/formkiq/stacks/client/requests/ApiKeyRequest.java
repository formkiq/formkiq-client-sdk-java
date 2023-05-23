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
import java.util.List;
import java.util.Map;
import java.util.Optional;
import com.formkiq.stacks.client.ApiRequest;

/**
 * Creates GET /configs/apiKey.
 *
 */
public class ApiKeyRequest implements ApiRequest {

  /**
   * constructor.
   */
  public ApiKeyRequest() {}

  @Override
  public void addQueryParameter(final String key, final String value) {
    // empty
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
    return "configs/apiKey";
  }

  @Override
  public void validate() {
    // empty
  }
}
