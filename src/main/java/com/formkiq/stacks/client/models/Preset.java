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
 * Preset holder.
 *
 */
public class Preset {

  /** Preset Id. */
  private String id;
  /** Preset Inserted Date. */
  private Date insertedDate;
  /** Preset SiteId. */
  private String siteId;
  /** Preset name. */
  private String name;
  /** Preset Type. */
  private String type;
  /** UserId. */
  private String userId;

  /**
   * constructor.
   */
  public Preset() {}

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
   * Get Type.
   * 
   * @return {@link String}
   */
  public String type() {
    return this.type;
  }

  /**
   * Set Type.
   * 
   * @param s {@link String}
   */
  public void type(final String s) {
    this.type = s;
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
