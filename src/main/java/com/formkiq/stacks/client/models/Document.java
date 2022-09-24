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
 * Document holder.
 *
 */
public class Document {

  /** Document Id this document belongs to. */
  private String belongsToDocumentId;
  /** Document Checksum. */
  private String checksum;
  /** Document Content Length. */
  private long contentLength;
  /** Document Content Type. */
  private String contentType;
  /** Document Identifier. */
  private String documentId;
  /** Document Inserted Date. */
  private Date insertedDate;
  /** Document Last Modified Date. */
  private Date lastModifiedDate;
  /** Document Path. */
  private String path;
  /** UserId. */
  private String userId;

  /**
   * constructor.
   */
  public Document() {}

  /**
   * Get Belongs To DocumentId.
   * 
   * @return {@link String}
   */
  public String belongsToDocumentId() {
    return this.belongsToDocumentId;
  }

  /**
   * Sets Belongs To DocumentId.
   * 
   * @param id {@link String}
   * @return {@link String}
   */
  public Document belongsToDocumentId(final String id) {
    this.belongsToDocumentId = id;
    return this;
  }

  /**
   * Get Checksum.
   * 
   * @return {@link String}
   */
  public String checksum() {
    return this.checksum;
  }

  /**
   * Set Checksum.
   * 
   * @param s {@link String}
   */
  public void checksum(final String s) {
    this.checksum = s;
  }

  /**
   * Get Content Length.
   * 
   * @return {@link String}
   */
  public long contentLength() {
    return this.contentLength;
  }

  /**
   * Set Content Length.
   * 
   * @param cl long
   */
  public void contentLength(final long cl) {
    this.contentLength = cl;
  }

  /**
   * Get Content Type.
   * 
   * @return {@link String}
   */
  public String contentType() {
    return this.contentType;
  }

  /**
   * Set Content Type.
   * 
   * @param s {@link String}
   */
  public void contentType(final String s) {
    this.contentType = s;
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
