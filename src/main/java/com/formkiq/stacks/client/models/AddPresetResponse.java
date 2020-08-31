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
 * Response object for POST /documents.
 *
 */
public class AddPresetResponse {

  /** Identifier. */
  private String id;

  /** Site Identifier. */
  private String siteId;

  /**
   * constructor.
   */
  public AddPresetResponse() {}

  /**
   * Get Identifier.
   * 
   * @return {@link String}
   */
  public String id() {
    return this.id;
  }

  /**
   * Set Identifier.
   * 
   * @param identifier {@link String}
   */
  public void id(final String identifier) {
    this.id = identifier;
  }

  /**
   * Get SiteId.
   * 
   * @return {@link String}
   */
  public String siteId() {
    return this.siteId;
  }

  /**
   * Set SiteId.
   * 
   * @param identifier {@link String}
   */
  public void siteId(final String identifier) {
    this.siteId = identifier;
  }
}
