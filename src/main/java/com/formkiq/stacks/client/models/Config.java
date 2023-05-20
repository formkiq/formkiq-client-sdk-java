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

/**
 * Configs holder.
 *
 */
public class Config {

  /** {@link String}. */
  private String chatGptApiKey;

  /**
   * constructor.
   */
  public Config() {}

  /**
   * Get ChatGPT Api Key.
   * 
   * @return {@link String}
   */
  public String chatGptApiKey() {
    return this.chatGptApiKey;
  }

  /**
   * Set ChatGPT Api Key.
   * 
   * @param apiKey {@link String}
   */
  public void chatGptApiKey(final String apiKey) {
    this.chatGptApiKey = apiKey;
  }
}
