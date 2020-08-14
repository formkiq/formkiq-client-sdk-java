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
package com.formkiq.stacks.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Interface for all FormKiQ Api Requests.
 *
 */
public interface ApiRequest {
  /**
   * Build Parameter {@link Map} to Query Parameter.
   * 
   * @return {@link String}
   */
  default String buildRequestUrl() {

    validate();

    final List<String> params = new ArrayList<>();
    getQueryParameters().entrySet().stream().filter(e -> e.getValue() != null)
        .forEach(e -> params.add(e.getKey() + "=" + e.getValue()));
    return getUrlPath() + (params.size() > 0 ? "?" + String.join("&", params) : "");
  }

  /**
   * Get Http Headers.
   * 
   * @return {@link Map}
   */
  Optional<Map<String, List<String>>> getHttpHeaders();

  /**
   * Get Query Parameters.
   * 
   * @return {@link Map}
   */
  Map<String, String> getQueryParameters();

  /**
   * Get Request Url Path.
   * 
   * @return {@link String}
   */
  String getUrlPath();

  /**
   * Validates the Api Request has all required fields.
   */
  void validate();
}
