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
 * PresetTagBody holder.
 *
 */
public class PresetsBody {

  /** Preset Name. */
  private String name;

  /** Tags. */
  private List<PresetTagBody> tags;

  /**
   * constructor.
   */
  public PresetsBody() {}

  /**
   * Get Name.
   * 
   * @return {@link String}
   */
  public String name() {
    return this.name;
  }

  /**
   * Set Name.
   * 
   * @param s {@link String}
   * @return {@link PresetsBody}
   */
  public PresetsBody name(final String s) {
    this.name = s;
    return this;
  }

  /**
   * Get {@link PresetTagBody}.
   * 
   * @return {@link List} {@link PresetTagBody}
   */
  public List<PresetTagBody> tags() {
    return this.tags;
  }

  /**
   * Set {@link PresetTagBody}.
   * 
   * @param list {@link List} {@link PresetTagBody}
   * @return {@link PresetsBody}
   */
  public PresetsBody tags(final List<PresetTagBody> list) {
    this.tags = list;
    return this;
  }
}
