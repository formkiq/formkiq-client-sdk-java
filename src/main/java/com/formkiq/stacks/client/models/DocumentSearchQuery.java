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
import java.util.List;

/**
 * DocumentSearchQuery holder.
 *
 */
public class DocumentSearchQuery {
  /** {@link Collection} {@link String}. */
  private Collection<String> documentIds;
  /** {@link DocumentSearchMetadata}. */
  private DocumentSearchMetadata meta;
  /** {@link DocumentSearchTag}. */
  private DocumentSearchTag tag;
  /** {@link List} {@link DocumentSearchTag}. */
  private List<DocumentSearchTag> tags;
  /** Text Search. */
  private String text;

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
   * @return {@link DocumentSearchQuery}
   */
  public DocumentSearchQuery documentIds(final Collection<String> list) {
    this.documentIds = list;
    return this;
  }

  /**
   * Get {@link List} {@link DocumentSearchMetadata}.
   * 
   * @return {@link List} {@link DocumentSearchMetadata}
   */
  public DocumentSearchMetadata meta() {
    return this.meta;
  }

  /**
   * Set {@link List} {@link DocumentSearchMetadata}.
   * 
   * @param data {@link DocumentSearchMetadata}
   * @return {@link DocumentSearchQuery}
   */
  public DocumentSearchQuery meta(final DocumentSearchMetadata data) {
    this.meta = data;
    return this;
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
   * @return {@link DocumentSearchQuery}
   */
  public DocumentSearchQuery tag(final DocumentSearchTag searchTag) {
    this.tag = searchTag;
    return this;
  }

  /**
   * Get {@link List} {@link DocumentSearchTag}.
   * 
   * @return {@link List} {@link DocumentSearchTag}
   */
  public List<DocumentSearchTag> tags() {
    return this.tags;
  }

  /**
   * Set {@link List} {@link DocumentSearchTag}.
   * 
   * @param list {@link List} {@link DocumentSearchTag}
   * @return {@link DocumentSearchQuery}
   */
  public DocumentSearchQuery tags(final List<DocumentSearchTag> list) {
    this.tags = list;
    return this;
  }

  /**
   * Get Search Text.
   * 
   * @return {@link String}
   */
  public String text() {
    return this.text;
  }

  /**
   * Set DocumentIds.
   * 
   * @param s {@link String}
   * @return {@link DocumentSearchQuery}
   */
  public DocumentSearchQuery text(final String s) {
    this.text = s;
    return this;
  }
}
