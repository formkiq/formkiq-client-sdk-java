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
 * Configs holder.
 *
 */
public class ApiKey {

  /** Api Key. */
  private String apiKey;
  /** Document Inserted Date. */
  private Date insertedDate;
  /** Api Key Name. */
  private String name;

  /**
   * constructor.
   */
  public ApiKey() {}

  /**
   * Get Api Key.
   * 
   * @return {@link String}
   */
  public String apiKey() {
    return this.apiKey;
  }

  /**
   * Set Api Key.
   * 
   * @param key {@link String}
   * @return {@link ApiKey}
   */
  public ApiKey apiKey(final String key) {
    this.apiKey = key;
    return this;
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
   * @return {@link ApiKey}
   */
  public ApiKey insertedDate(final Date date) {
    this.insertedDate = date;
    return this;
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
   * @param apiName {@link String}
   * @return {@link ApiKey}
   */
  public ApiKey name(final String apiName) {
    this.name = apiName;
    return this;
  }
}
