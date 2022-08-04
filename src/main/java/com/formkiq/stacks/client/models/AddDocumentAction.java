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
public class AddDocumentAction {

  /** Action Parameters. */
  private Map<String, String> parameters;
  /** Document Tag Key. */
  private DocumentActionStatus status = null;
  /** Document Tag Key. */
  private DocumentActionType type;

  /**
   * constructor.
   */
  public AddDocumentAction() {

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
   * @return {@link AddDocumentAction}
   */
  public AddDocumentAction parameters(final Map<String, String> map) {
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
   * @return {@link AddDocumentAction}
   */
  public AddDocumentAction status(final DocumentActionStatus actionStatus) {
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
   * @return {@link AddDocumentAction}
   */
  public AddDocumentAction type(final DocumentActionType actionType) {
    this.type = actionType;
    return this;
  }
}
