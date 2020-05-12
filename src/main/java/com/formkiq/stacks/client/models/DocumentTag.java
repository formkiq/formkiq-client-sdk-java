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
 * DocumentTag holder.
 *
 */
public class DocumentTag {

  /** Document Tag Key. */
  private String key;
  /** Document Tag Value. */
  private String value;
  /** Document Tag DocumentId. */
  private String documentId;
  /** Document Tag Type. */
  private String type;
  /** Document Tag UserId. */
  private String userId;
  /** Document Tag InsertedDate. */
  private Date insertedDate;

  /**
   * constructor.
   */
  public DocumentTag() {

  }

  /**
   * Get Tag DocumentId.
   * 
   * @return {@link String}
   */
  public String documentId() {
    return this.documentId;
  }

  /**
   * Set Tag DocumentId.
   * 
   * @param tagDocumentId {@link String}
   */
  public void documentId(final String tagDocumentId) {
    this.documentId = tagDocumentId;
  }

  /**
   * Get Tag Inserted Date.
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
   * Get Tag Key.
   * 
   * @return {@link String}
   */
  public String key() {
    return this.key;
  }

  /**
   * Set Key.
   * 
   * @param tagkey {@link String}
   */
  public void key(final String tagkey) {
    this.key = tagkey;
  }

  /**
   * Get Tag Type.
   * 
   * @return {@link String}
   */
  public String type() {
    return this.type;
  }

  /**
   * Set Tag Type.
   * 
   * @param tagType {@link String}
   */
  public void type(final String tagType) {
    this.type = tagType;
  }

  /**
   * Get Tag UserId.
   * 
   * @return {@link String}
   */
  public String userId() {
    return this.userId;
  }

  /**
   * Set Tag UserId.
   * 
   * @param tagUserId {@link String}
   */
  public void userId(final String tagUserId) {
    this.userId = tagUserId;
  }

  /**
   * Get Tag Value.
   * 
   * @return {@link String}
   */
  public String value() {
    return this.value;
  }

  /**
   * Set Tag Value.
   * 
   * @param tagValue {@link String}
   */
  public void value(final String tagValue) {
    this.value = tagValue;
  }
}
