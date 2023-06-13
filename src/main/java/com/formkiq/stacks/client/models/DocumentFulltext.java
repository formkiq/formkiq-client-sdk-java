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

import java.util.Map;

/**
 * Document Fulltext holder.
 *
 */
public class DocumentFulltext {

  /** Document Data. */
  private String content;
  /** Document Content Length. */
  private long contentLength;
  /** Document Create By User. */
  private String createdBy;
  /** Document Id. */
  private String documentId;
  /** Document Tag InsertedDate. */
  private Long insertedDate;
  /** Document Metadata. */
  private Map<String, Object> metadata;
  /** Document Path. */
  private String path;
  /** Site Id. */
  private String siteId;
  /** Document Tags. */
  private Map<String, Object> tags;

  /**
   * constructor.
   */
  public DocumentFulltext() {

  }

  /**
   * Get Content.
   * 
   * @return {@link String}
   */
  public String content() {
    return this.content;
  }

  /**
   * Set Content.
   * 
   * @param s {@link String}
   * @return {@link DocumentFulltext}
   */
  public DocumentFulltext content(final String s) {
    this.content = s;
    return this;
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
   * @return {@link DocumentFulltext}
   */
  public DocumentFulltext contentLength(final long cl) {
    this.contentLength = cl;
    return this;
  }

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
   * @param s {@link String}
   * @return {@link DocumentFulltext}
   */
  public DocumentFulltext createdBy(final String s) {
    this.createdBy = s;
    return this;
  }

  /**
   * Get DocumentId.
   * 
   * @return {@link String}
   */
  public String documentId() {
    return this.documentId;
  }

  /**
   * Set Document Id.
   * 
   * @param s {@link String}
   * @return {@link DocumentFulltext}
   */
  public DocumentFulltext documentId(final String s) {
    this.documentId = s;
    return this;
  }

  /**
   * Get Tag Inserted Date.
   * 
   * @return {@link Long}
   */
  public Long insertedDate() {
    return this.insertedDate;
  }

  /**
   * Set Inserted Date.
   * 
   * @param date {@link Long}
   * @return {@link DocumentFulltext}
   */
  public DocumentFulltext insertedDate(final Long date) {
    this.insertedDate = date;
    return this;
  }

  /**
   * Get Document Metadata {@link Map}.
   * 
   * @return {@link Map}
   */
  public Map<String, Object> metadata() {
    return this.metadata;
  }

  /**
   * Set Document Metadata.
   * 
   * @param map {@link Map}
   * @return {@link DocumentFulltext}
   */
  public DocumentFulltext metadata(final Map<String, Object> map) {
    this.metadata = map;
    return this;
  }

  /**
   * Get Path.
   * 
   * @return {@link String}
   */
  public String path() {
    return this.path;
  }

  /**
   * Set Path.
   * 
   * @param s {@link String}
   * @return {@link DocumentFulltext}
   */
  public DocumentFulltext path(final String s) {
    this.path = s;
    return this;
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
   * Set SiteId.
   * 
   * @param s {@link String}
   * @return {@link DocumentFulltext}
   */
  public DocumentFulltext siteId(final String s) {
    this.siteId = s;
    return this;
  }

  /**
   * Get Document Tags {@link Map}.
   * 
   * @return {@link Map}
   */
  public Map<String, Object> tags() {
    return this.tags;
  }

  /**
   * Set Document Tags.
   * 
   * @param map {@link Map}
   * @return {@link DocumentFulltext}
   */
  public DocumentFulltext tags(final Map<String, Object> map) {
    this.tags = map;
    return this;
  }
}
