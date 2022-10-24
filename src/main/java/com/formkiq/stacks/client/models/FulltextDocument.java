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
import java.util.Map;

/**
 * Document holder.
 *
 */
public class FulltextDocument {

  /** UserId. */
  private String createdBy;
  /** Document Identifier. */
  private String documentId;
  /** Document Inserted Date. */
  private Date insertedDate;
  /** Last Modified Date. */
  private Date lastModifiedDate;
  /** Document Path. */
  private String path;
  /** Document Site Id. */
  private String siteId;
  /** Tags. */
  private Map<String, String> tags;

  /**
   * constructor.
   */
  public FulltextDocument() {}

  /**
   * Get Created By.
   * 
   * @return {@link String}
   */
  public String createdBy() {
    return this.createdBy;
  }

  /**
   * Set Created By.
   * 
   * @param created {@link String}
   * @return {@link FulltextDocument}
   */
  public FulltextDocument createdBy(final String created) {
    this.createdBy = created;
    return this;
  }

  /**
   * Get Document Identifier.
   * 
   * @return {@link String}
   */
  public String documentId() {
    return this.documentId;
  }

  /**
   * Set DocumentId.
   * 
   * @param s {@link String}
   */
  public void documentId(final String s) {
    this.documentId = s;
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
   * Get Last Modified Date.
   * 
   * @return {@link Date}
   */
  public Date lastModifiedDate() {
    return this.lastModifiedDate;
  }

  /**
   * Set Last Modified Date.
   * 
   * @param date {@link Date}
   */
  public void lastModifiedDate(final Date date) {
    this.lastModifiedDate = date;
  }

  /**
   * Get Document Path.
   * 
   * @return {@link String}
   */
  public String path() {
    return this.path;
  }

  /**
   * Set Document Path.
   * 
   * @param s {@link String}
   */
  public void path(final String s) {
    this.path = s;
  }

  /**
   * Get Site Id.
   * 
   * @return {@link String}
   */
  public String siteId() {
    return this.siteId;
  }

  /**
   * Set Site Id.
   * 
   * @param id {@link String}
   * @return {@link FulltextDocument}
   */
  public FulltextDocument siteId(final String id) {
    this.siteId = id;
    return this;
  }

  /**
   * Get Document Tags.
   * 
   * @return {@link Map}
   */
  public Map<String, String> tags() {
    return this.tags;
  }

  /**
   * Set Document Tags.
   * 
   * @param map {@link Map}
   * @return {@link FulltextDocument}
   */
  public FulltextDocument tags(final Map<String, String> map) {
    this.tags = map;
    return this;
  }
}
