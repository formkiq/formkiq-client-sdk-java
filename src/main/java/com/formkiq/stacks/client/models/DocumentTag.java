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

import java.util.Collection;
import java.util.Date;

/**
 * DocumentTag holder.
 *
 */
public class DocumentTag {

  /** Document Tag DocumentId. */
  private String documentId;
  /** Document Tag InsertedDate. */
  private Date insertedDate;
  /** Document Tag Key. */
  private String key;
  /** Document Tag Type. */
  private String type;
  /** Document Tag UserId. */
  private String userId;
  /** Document Tag Value. */
  private String value;
  /** Document Tag Value. */
  private Collection<String> values;

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
   * @return {@link DocumentTag}
   */
  public DocumentTag documentId(final String tagDocumentId) {
    this.documentId = tagDocumentId;
    return this;
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
   * @return {@link DocumentTag}
   */
  public DocumentTag insertedDate(final Date date) {
    this.insertedDate = date;
    return this;
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
   * @return {@link DocumentTag}
   */
  public DocumentTag key(final String tagkey) {
    this.key = tagkey;
    return this;
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
   * @return {@link DocumentTag}
   */
  public DocumentTag type(final String tagType) {
    this.type = tagType;
    return this;
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
   * @return {@link DocumentTag}
   */
  public DocumentTag userId(final String tagUserId) {
    this.userId = tagUserId;
    return this;
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
   * @return {@link DocumentTag}
   */
  public DocumentTag value(final String tagValue) {
    this.value = tagValue;
    return this;
  }

  /**
   * Get Tag Values.
   * 
   * @return {@link Collection} {@link String}
   */
  public Collection<String> values() {
    return this.values;
  }

  /**
   * Set Tag Value.
   * 
   * @param tagValues {@link Collection} {@link String}
   * @return {@link DocumentTag}
   */
  public DocumentTag values(final Collection<String> tagValues) {
    this.values = tagValues;
    return this;
  }
}
