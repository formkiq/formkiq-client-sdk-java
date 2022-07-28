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
 * FulltextSearchTag holder.
 *
 */
public class FulltextSearchTag {

  /** Search Key. */
  private String key;
  /** Eq criteria. */
  private String eq;
  /** EqOr criteria. */
  private Collection<String> eqOr;

  /**
   * constructor.
   */
  public FulltextSearchTag() {

  }

  /**
   * Get Search Equals criteria.
   * 
   * @return {@link String}
   */
  public String eq() {
    return this.eq;
  }

  /**
   * Set Search Equals criteria.
   * 
   * @param searchEq {@link String}
   * @return {@link FulltextSearchTag}
   */
  public FulltextSearchTag eq(final String searchEq) {
    this.eq = searchEq;
    return this;
  }

  /**
   * Get Search Equals criteria.
   * 
   * @return {@link Collection} {@link String}
   */
  public Collection<String> eqOr() {
    return this.eqOr;
  }

  /**
   * Set Search Equals criteria.
   * 
   * @param searchEqs {@link String}
   * @return {@link FulltextSearchTag}
   */
  public FulltextSearchTag eqOr(final Collection<String> searchEqs) {
    this.eqOr = searchEqs;
    return this;
  }

  /**
   * Get Search Key.
   * 
   * @return {@link String}
   */
  public String key() {
    return this.key;
  }

  /**
   * Set Search Key.
   * 
   * @param searchkey {@link String}
   * @return {@link FulltextSearchTag}
   */
  public FulltextSearchTag key(final String searchkey) {
    this.key = searchkey;
    return this;
  }
}