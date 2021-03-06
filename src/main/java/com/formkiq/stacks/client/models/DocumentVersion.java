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
 * 
 * {@link DocumentVersion} holder.
 *
 */
public class DocumentVersion {

  /** VersionId. */
  private String versionId;
  /** LastModifiedDate. */
  private Date lastModifiedDate;

  /**
   * constructor.
   */
  public DocumentVersion() {}

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
   * Get Version Id.
   * 
   * @return {@link String}
   */
  public String versionId() {
    return this.versionId;
  }

  /**
   * Set Version Id.
   * 
   * @param version {@link String}
   */
  public void versionId(final String version) {
    this.versionId = version;
  }
}
