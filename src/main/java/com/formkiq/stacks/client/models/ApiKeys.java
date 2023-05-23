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
package com.formkiq.stacks.client.models;

import java.util.List;

/**
 * Configs holder.
 *
 */
public class ApiKeys {

  /** {@link List} {@link ApiKey}. */
  private List<ApiKey> apiKeys;

  /**
   * constructor.
   */
  public ApiKeys() {}

  /**
   * Get Api Keys.
   * 
   * @return {@link List} {@link ApiKey}
   */
  public List<ApiKey> apiKeys() {
    return this.apiKeys;
  }

  /**
   * Set Api Keys.
   * 
   * @param keys {@link List} {@link ApiKey}
   * @return {@link ApiKeys}
   */
  public ApiKeys apiKeys(final List<ApiKey> keys) {
    this.apiKeys = keys;
    return this;
  }


}
