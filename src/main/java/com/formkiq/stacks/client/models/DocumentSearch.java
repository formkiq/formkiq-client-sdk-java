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
 * Document Search holder.
 *
 */
public class DocumentSearch {

  /** {@link DocumentSearchQuery}. */
  private DocumentSearchQuery query;

  /**
   * constructor.
   */
  public DocumentSearch() {

  }

  /**
   * Get Query.
   * 
   * @return {@link DocumentSearchQuery}
   */
  public DocumentSearchQuery query() {
    return this.query;
  }

  /**
   * Set Query.
   * 
   * @param q {@link DocumentSearchQuery}
   * @return {@link DocumentSearchQuery}
   */
  public DocumentSearch query(final DocumentSearchQuery q) {
    this.query = q;
    return this;
  }
}
