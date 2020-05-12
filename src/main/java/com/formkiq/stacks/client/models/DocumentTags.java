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

import java.util.List;

/**
 * DocumentTags holder.
 *
 */
public class DocumentTags {

  /** Next Result Set Token. */
  private String next;
  /** Previous Result Set Token. */
  private String previous;
  /** {@link List} {@link DocumentTag}. */
  private List<DocumentTag> tags;

  /**
   * constructor.
   */
  public DocumentTags() {

  }

  /**
   * Get Next Result Token.
   * 
   * @return {@link String}
   */
  public String next() {
    return this.next;
  }

  /**
   * Set Next Result Token.
   * 
   * @param token {@link String}
   */
  public void next(final String token) {
    this.next = token;
  }

  /**
   * Get Previous Result Token.
   * 
   * @return {@link String}
   */
  public String previous() {
    return this.previous;
  }

  /**
   * Set Preivous Result Token.
   * 
   * @param token {@link String}
   */
  public void previous(final String token) {
    this.previous = token;
  }

  /**
   * Get Document Tags.
   * 
   * @return {@link List} {@link DocumentTag}
   */
  public List<DocumentTag> tags() {
    return this.tags;
  }

  /**
   * Set Document Tags.
   * 
   * @param documentTags {@link List} {@link DocumentTag}
   */
  public void tags(final List<DocumentTag> documentTags) {
    this.tags = documentTags;
  }
}
