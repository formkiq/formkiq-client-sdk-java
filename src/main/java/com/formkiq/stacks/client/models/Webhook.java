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

import java.util.Date;

/**
 * Webhook holder.
 *
 */
public class Webhook {

  /** Webhook Id. */
  private String id;
  /** Webhook Inserted Date. */
  private Date insertedDate;
  /** Webhook SiteId. */
  private String siteId;
  /** Webhook name. */
  private String name;
  /** Webhook Type. */
  private String url;
  /** UserId. */
  private String userId;

  /**
   * constructor.
   */
  public Webhook() {}

  /**
   * Get Identifier.
   * 
   * @return {@link String}
   */
  public String id() {
    return this.id;
  }

  /**
   * Set Id.
   * 
   * @param s {@link String}
   */
  public void id(final String s) {
    this.id = s;
  }

  /**
   * Get Inserted Date.
   * 
   * @return {@link Date}
   */
  public Date insertedDate() {
    return this.insertedDate;
  }

  /**
   * Set Inserted Date.
   * 
   * @param date {@link Date}
   */
  public void insertedDate(final Date date) {
    this.insertedDate = date;
  }

  /**
   * Get Name.
   * 
   * @return {@link String}
   */
  public String name() {
    return this.name;
  }

  /**
   * Set Name.
   * 
   * @param s {@link String}
   */
  public void name(final String s) {
    this.name = s;
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
   * Set Site Id.
   * 
   * @param s {@link String}
   */
  public void siteId(final String s) {
    this.siteId = s;
  }

  /**
   * Get Url.
   * 
   * @return {@link String}
   */
  public String url() {
    return this.url;
  }

  /**
   * Set Url.
   * 
   * @param s {@link String}
   */
  public void url(final String s) {
    this.url = s;
  }

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
}
