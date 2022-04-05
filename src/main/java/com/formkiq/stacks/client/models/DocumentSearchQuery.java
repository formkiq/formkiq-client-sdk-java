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

/**
 * DocumentSearchQuery holder.
 *
 */
public class DocumentSearchQuery {
  /** {@link DocumentSearchTag}. */
  private DocumentSearchTag tag;
  /** {@link Collection} {@link String}. */
  private Collection<String> documentIds;

  /** constructor. */
  public DocumentSearchQuery() {

  }

  /**
   * Get Document Ids.
   * 
   * @return {@link Collection} {@link String}
   */
  public Collection<String> documentIds() {
    return this.documentIds;
  }

  /**
   * Set DocumentIds.
   * 
   * @param list {@link Collection} {@link String}
   */
  public void documentIds(final Collection<String> list) {
    this.documentIds = list;
  }

  /**
   * Get {@link DocumentSearchTag}.
   * 
   * @return {@link DocumentSearchTag}
   */
  public DocumentSearchTag tag() {
    return this.tag;
  }

  /**
   * Set {@link DocumentSearchTag}.
   * 
   * @param searchTag {@link DocumentSearchTag}
   */
  public void tag(final DocumentSearchTag searchTag) {
    this.tag = searchTag;
  }
}
