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
 * Presets holder.
 *
 */
public class Presets {

  /** Next Results Token. */
  private String next;
  /** Previous Results Token. */
  private String previous;
  /** {@link List} {@link Preset}. */
  private List<Preset> presets;

  /**
   * constructor.
   */
  public Presets() {}

  /**
   * Get Next Token.
   * 
   * @return {@link String}
   */
  public String next() {
    return this.next;
  }

  /**
   * Set Next Token.
   * 
   * @param token {@link String}
   */
  public void next(final String token) {
    this.next = token;
  }

  /**
   * Get Previous Token.
   * 
   * @return {@link String}
   */
  public String previous() {
    return this.previous;
  }

  /**
   * Set Previous Token.
   * 
   * @param token {@link String}
   */
  public void previous(final String token) {
    this.previous = token;
  }

  /**
   * Get Presets.
   * 
   * @return {@link List} {@link Preset}
   */
  public List<Preset> presets() {
    return this.presets;
  }

  /**
   * Set Presets.
   * 
   * @param list {@link List} {@link Preset}
   */
  public void presets(final List<Preset> list) {
    this.presets = list;
  }
}
