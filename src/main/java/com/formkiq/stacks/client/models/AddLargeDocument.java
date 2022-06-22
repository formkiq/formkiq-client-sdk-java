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
 * 
 * {@link AddLargeDocument} holder.
 *
 */
public class AddLargeDocument {

  /** TagSchema Id. */
  private String tagSchemaId;
  /** Path. */
  private String path;
  /** Document Tags. */
  private List<DocumentTag> tags;
  /** Document Actions. */
  private List<DocumentAction> actions;

  /**
   * constructor.
   */
  public AddLargeDocument() {}

  /**
   * Get {@link List} {@link DocumentAction}.
   * 
   * @return {@link List} {@link DocumentAction}
   */
  public List<DocumentAction> actions() {
    return this.actions;
  }

  /**
   * Set {@link List} {@link DocumentAction}.
   * 
   * @param documentActions {@link List} {@link DocumentAction}
   * @return {@link AddLargeDocument}
   */
  public AddLargeDocument actions(final List<DocumentAction> documentActions) {
    this.actions = documentActions;
    return this;
  }

  /**
   * Get Path.
   * 
   * @return {@link String}
   */
  public String path() {
    return this.path;
  }

  /**
   * Set Path.
   * 
   * @param s {@link String}
   * @return {@link AddLargeDocument}
   */
  public AddLargeDocument path(final String s) {
    this.path = s;
    return this;
  }

  /**
   * Get Tags.
   * 
   * @return {@link List} {@link DocumentTag}
   */
  public List<DocumentTag> tags() {
    return this.tags;
  }

  /**
   * Set Tags.
   * 
   * @param list {@link List} {@link DocumentTag}
   * @return {@link AddLargeDocument}
   */
  public AddLargeDocument tags(final List<DocumentTag> list) {
    this.tags = list;
    return this;
  }

  /**
   * Get Tag Schema Id.
   * 
   * @return {@link String}
   */
  public String tagSchemaId() {
    return this.tagSchemaId;
  }

  /**
   * Set Tag Schema Id.
   * 
   * @param id {@link String}
   * @return {@link AddLargeDocument}
   */
  public AddLargeDocument tagSchemaId(final String id) {
    this.tagSchemaId = id;
    return this;
  }
}
