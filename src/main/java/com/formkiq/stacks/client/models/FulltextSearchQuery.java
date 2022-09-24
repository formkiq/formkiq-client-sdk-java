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
 * DocumentSearchQuery holder.
 *
 */
public class FulltextSearchQuery {
  /** Result page to return (starting at 1). */
  private Integer page;
  /** {@link List} {@link FulltextSearchTag}. */
  private List<FulltextSearchTag> tags;

  /** {@link String}. */
  private String text;

  /** constructor. */
  public FulltextSearchQuery() {

  }

  /**
   * Get Search Result Page.
   * 
   * @return {@link Integer}
   */
  public Integer getPage() {
    return this.page;
  }

  /**
   * Set Search Results Page.
   * 
   * @param pageNumber {@link Integer}
   * @return {@link FulltextSearchQuery}
   */
  public FulltextSearchQuery page(final Integer pageNumber) {
    this.page = pageNumber;
    return this;
  }


  /**
   * Get {@link List} {@link FulltextSearchTag}.
   * 
   * @return {@link List} {@link FulltextSearchTag}
   */
  public List<FulltextSearchTag> tags() {
    return this.tags;
  }

  /**
   * Set {@link List} {@link FulltextSearchTag}.
   * 
   * @param list {@link List} {@link FulltextSearchTag}
   * @return {@link FulltextSearchQuery}
   */
  public FulltextSearchQuery tags(final List<FulltextSearchTag> list) {
    this.tags = list;
    return this;
  }

  /**
   * Get Full text search.
   * 
   * @return {@link String}
   */
  public String text() {
    return this.text;
  }

  /**
   * Set Full Text.
   * 
   * @param fulltext {@link String}
   * @return {@link FulltextSearchQuery}
   */
  public FulltextSearchQuery text(final String fulltext) {
    this.text = fulltext;
    return this;
  }
}
