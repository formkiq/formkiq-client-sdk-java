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
 * Set Document Config holder.
 *
 */
public class SetDocusignConfig {

  /** Docusign ClientId. */
  private String clientId;
  /** Docusign Private Key. */
  private String privateKey;
  /** Docusign UserId. */
  private String userId;

  /**
   * constructor.
   */
  public SetDocusignConfig() {

  }

  /**
   * Get clientId.
   * 
   * @return {@link String}
   */
  public String clientId() {
    return this.clientId;
  }

  /**
   * Set privateKey.
   * 
   * @param data {@link String}
   * @return {@link SetDocusignConfig}
   */
  public SetDocusignConfig clientId(final String data) {
    this.clientId = data;
    return this;
  }

  /**
   * Get privateKey.
   * 
   * @return {@link String}
   */
  public String privateKey() {
    return this.privateKey;
  }

  /**
   * Set privateKey.
   * 
   * @param data {@link String}
   * @return {@link SetDocusignConfig}
   */
  public SetDocusignConfig privateKey(final String data) {
    this.privateKey = data;
    return this;
  }

  /**
   * Get userId.
   * 
   * @return {@link String}
   */
  public String userId() {
    return this.userId;
  }

  /**
   * Set userId.
   * 
   * @param data {@link String}
   * @return {@link SetDocusignConfig}
   */
  public SetDocusignConfig userId(final String data) {
    this.userId = data;
    return this;
  }
}
