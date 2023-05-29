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
  /** {@link String}. */
  private String maxContentLengthBytes;
  /** {@link String}. */
  private String maxDocuments;
  /** {@link String}. */
  private String maxWebhooks;

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
   * @return {@link Config}
   */
  public Config chatGptApiKey(final String apiKey) {
    this.chatGptApiKey = apiKey;
    return this;
  }

  /**
   * Get Max Content Length in Bytes.
   * 
   * @return {@link String}
   */
  public String maxContentLengthBytes() {
    return this.maxContentLengthBytes;
  }

  /**
   * Set Max Content Length in Bytes.
   * 
   * @param maxContentLength {@link String}
   */
  public void maxContentLengthBytes(final String maxContentLength) {
    this.maxContentLengthBytes = maxContentLength;
  }

  /**
   * Get Max Documents.
   * 
   * @return {@link String}
   */
  public String maxDocuments() {
    return this.maxDocuments;
  }

  /**
   * Set Max Documents.
   * 
   * @param max {@link String}
   * @return {@link Config}
   */
  public Config maxDocuments(final String max) {
    this.maxDocuments = max;
    return this;
  }

  /**
   * Get Max Webhooks.
   * 
   * @return {@link String}
   */
  public String maxWebhooks() {
    return this.maxWebhooks;
  }

  /**
   * Set Max Webhooks.
   * 
   * @param max {@link String}
   * @return {@link Config}
   */
  public Config maxWebhooks(final String max) {
    this.maxWebhooks = max;
    return this;
  }
}
