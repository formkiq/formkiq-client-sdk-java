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
public class DocumentSync {

  /** Document Identifier. */
  private String documentId;
  /** Sync Service. */
  private String service;
  /** Sync Status. */
  private String status;
  /** Document Sync Date. */
  private Date syncDate;
  /** Sync Type. */
  private String type;
  /** Document Sync User Id. */
  private String userId;

  /**
   * constructor.
   */
  public DocumentSync() {}

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
   * Get Sync Service.
   * 
   * @return {@link String}
   */
  public String service() {
    return this.service;
  }

  /**
   * Set Sync Service.
   * 
   * @param documentSyncService {@link String}
   */
  public void service(final String documentSyncService) {
    this.service = documentSyncService;
  }

  /**
   * Get Sync Status.
   * 
   * @return {@link String}
   */
  public String status() {
    return this.status;
  }

  /**
   * Set Sync Status.
   * 
   * @param documentSyncStatus {@link String}
   */
  public void status(final String documentSyncStatus) {
    this.status = documentSyncStatus;
  }

  /**
   * Get Sync Date.
   * 
   * @return {@link Date}
   */
  public Date syncDate() {
    return this.syncDate;
  }

  /**
   * Set Sync Date.
   * 
   * @param documentSyncDate {@link Date}
   */
  public void syncDate(final Date documentSyncDate) {
    this.syncDate = documentSyncDate;
  }

  /**
   * Get Sync Type.
   * 
   * @return {@link String}
   */
  public String type() {
    return this.type;
  }

  /**
   * Set Sync Type.
   * 
   * @param documentSyncType {@link String}
   */
  public void type(final String documentSyncType) {
    this.type = documentSyncType;
  }

  /**
   * Get User Id.
   * 
   * @return {@link String}
   */
  public String userId() {
    return this.userId;
  }

  /**
   * Set User Id.
   * 
   * @param documentSyncUser {@link String}
   */
  public void userId(final String documentSyncUser) {
    this.userId = documentSyncUser;
  }
}
