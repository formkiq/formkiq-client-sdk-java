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
 * Document holder.
 *
 */
public class DocusignConfig {

  /** Is Docusign Configured. */
  private boolean configured;
  /** Docusign UserId. */
  private String userId;
  /** Docusign ClientId. */
  private String clientId;

  /**
   * constructor.
   */
  public DocusignConfig() {}

  /**
   * Get UserId.
   * 
   * @return {@link String}
   */
  public String userId() {
    return this.userId;
  }

  /**
   * Set UserId.
   * 
   * @param s {@link String}
   */
  public void userId(final String s) {
    this.userId = s;
  }

  /**
   * Get Configured.
   * 
   * @return boolean
   */
  public boolean configured() {
    return this.configured;
  }

  /**
   * Set Configured.
   * 
   * @param b {@link String}
   */
  public void configured(final boolean b) {
    this.configured = b;
  }

  /**
   * Get ClientId.
   * 
   * @return {@link String}
   */
  public String clientId() {
    return this.clientId;
  }

  /**
   * Set ClientId.
   * 
   * @param s {@link String}
   */
  public void clientId(final String s) {
    this.clientId = s;
  }
}
