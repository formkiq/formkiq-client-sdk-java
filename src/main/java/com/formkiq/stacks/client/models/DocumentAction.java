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
 * Add DocumentAction holder.
 *
 */
public class DocumentAction {

  /** Action Parameters. */
  private Map<String, String> parameters;
  /** Document Tag Key. */
  private DocumentActionStatus status;
  /** Document Tag Key. */
  private DocumentActionType type;
  /** User Id. */
  private String userId;

  /**
   * constructor.
   */
  public DocumentAction() {

  }

  /**
   * Get Action Parameters.
   * 
   * @return {@link Map}
   */
  public Map<String, String> parameters() {
    return this.parameters;
  }

  /**
   * Set Action Parameters.
   * 
   * @param map {@link Map}
   * @return {@link DocumentAction}
   */
  public DocumentAction parameters(final Map<String, String> map) {
    this.parameters = map;
    return this;
  }

  /**
   * Get {@link DocumentActionStatus}.
   * 
   * @return {@link DocumentActionStatus}
   */
  public DocumentActionStatus status() {
    return this.status;
  }

  /**
   * Set {@link DocumentActionStatus}.
   * 
   * @param actionStatus {@link DocumentActionStatus}
   * @return {@link DocumentAction}
   */
  public DocumentAction status(final DocumentActionStatus actionStatus) {
    this.status = actionStatus;
    return this;
  }

  /**
   * Get {@link DocumentActionType}.
   * 
   * @return {@link DocumentActionType}
   */
  public DocumentActionType type() {
    return this.type;
  }

  /**
   * Set {@link DocumentActionType}.
   * 
   * @param actionType {@link DocumentActionType}
   * @return {@link DocumentAction}
   */
  public DocumentAction type(final DocumentActionType actionType) {
    this.type = actionType;
    return this;
  }

  /**
   * Get Created By UserId.
   * 
   * @return {@link String}
   */
  public String userId() {
    return this.userId;
  }

  /**
   * Set User Id.
   * 
   * @param user {@link String}
   * @return {@link DocumentAction}
   */
  public DocumentAction userId(final String user) {
    this.userId = user;
    return this;
  }
}
