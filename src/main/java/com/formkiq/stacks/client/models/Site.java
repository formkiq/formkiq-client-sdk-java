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
 * Site holder.
 *
 */
public class Site {

  /** Uplooad Email. */
  private String uploadEmail;
  /** Preset SiteId. */
  private String siteId;

  /**
   * constructor.
   */
  public Site() {}

  /**
   * Get SiteId.
   * 
   * @return {@link String}
   */
  public String siteId() {
    return this.siteId;
  }

  /**
   * Set Site Id.
   * 
   * @param s {@link String}
   */
  public void siteId(final String s) {
    this.siteId = s;
  }

  /**
   * Get Upload Email.
   * 
   * @return {@link String}
   */
  public String uploadEmail() {
    return this.uploadEmail;
  }

  /**
   * Set Upload Email.
   * 
   * @param email {@link String}
   */
  public void uploadEmail(final String email) {
    this.uploadEmail = email;
  }

}
