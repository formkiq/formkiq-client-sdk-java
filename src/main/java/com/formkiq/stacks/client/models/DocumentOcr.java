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
 * DocumentOcr holder.
 *
 */
public class DocumentOcr {

  /** Document Id. */
  private String documentId;
  /** Document Ocr Data. */
  private String data;
  /** Ocr Engine Used. */
  private String ocrEngine;
  /** Ocr Status. */
  private String ocrStatus;
  /** Document Ocr Content Type. */
  private String contentType;
  /** Is Content Base 64 Encoded. */
  private boolean isBase64;
  /** Document Tag UserId. */
  private String userId;
  /** Document Tag InsertedDate. */
  private Date insertedDate;

  /**
   * constructor.
   */
  public DocumentOcr() {

  }

  /**
   * Get Content-Type.
   * 
   * @return {@link String}
   */
  public String contentType() {
    return this.contentType;
  }

  /**
   * Set Content-Type.
   * 
   * @param type {@link String}
   * @return {@link DocumentOcr}
   */
  public DocumentOcr contentType(final String type) {
    this.contentType = type;
    return this;
  }

  /**
   * Get Ocr Data.
   * 
   * @return {@link String}
   */
  public String data() {
    return this.data;
  }

  /**
   * Set Ocr Data.
   * 
   * @param s {@link String}
   * @return {@link DocumentOcr}
   */
  public DocumentOcr data(final String s) {
    this.data = s;
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
   * @return {@link DocumentOcr}
   */
  public DocumentOcr documentId(final String s) {
    this.documentId = s;
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
   * @return {@link DocumentOcr}
   */
  public DocumentOcr insertedDate(final Date date) {
    this.insertedDate = date;
    return this;
  }

  /**
   * Is Content Base64 Encoded.
   * 
   * @return boolean
   */
  public boolean isBase64() {
    return this.isBase64;
  }

  /**
   * Set Content as Base64 Encoded.
   * 
   * @param base64 boolean
   * @return {@link AddDocument}
   */
  public DocumentOcr isBase64(final boolean base64) {
    this.isBase64 = base64;
    return this;
  }

  /**
   * Get Ocr Engine.
   * 
   * @return {@link String}
   */
  public String ocrEngine() {
    return this.ocrEngine;
  }

  /**
   * Set Ocr Engine.
   * 
   * @param engine {@link String}
   * @return {@link DocumentOcr}
   */
  public DocumentOcr ocrEngine(final String engine) {
    this.ocrEngine = engine;
    return this;
  }

  /**
   * Get Ocr Status.
   * 
   * @return {@link String}
   */
  public String ocrStatus() {
    return this.ocrStatus;
  }

  /**
   * Set Ocr Status.
   * 
   * @param status {@link String}
   * @return {@link DocumentOcr}
   */
  public DocumentOcr ocrStatus(final String status) {
    this.ocrStatus = status;
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
   * @return {@link DocumentOcr}
   */
  public DocumentOcr userId(final String tagUserId) {
    this.userId = tagUserId;
    return this;
  }
}
