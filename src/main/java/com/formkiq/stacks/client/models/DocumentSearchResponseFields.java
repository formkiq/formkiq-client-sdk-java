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
 * {@link DocumentSearchResponseFields} holder.
 *
 */
public class DocumentSearchResponseFields {
  /** {@link Collection} {@link String}. */
  private Collection<String> tags;

  /** constructor. */
  public DocumentSearchResponseFields() {

  }

  /**
   * Get {@link Collection} Tags.
   * 
   * @return {@link Collection} {@link String}
   */
  public Collection<String> tags() {
    return this.tags;
  }

  /**
   * Set {@link Collection} Tags.
   * 
   * @param list {@link Collection} {@link String}
   * @return {@link DocumentSearchResponseFields}
   */
  public DocumentSearchResponseFields tags(final Collection<String> list) {
    this.tags = list;
    return this;
  }
}
