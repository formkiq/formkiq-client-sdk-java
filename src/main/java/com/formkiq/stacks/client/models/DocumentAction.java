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

/**
 * DocumentAction holder.
 *
 */
public class DocumentAction {

  /** Document Tag Key. */
  private DocumentActionType type;

  /**
   * constructor.
   */
  public DocumentAction() {

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
}
