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
 * PresetTagBody holder.
 *
 */
public class PresetTagBody {

  /** PresetTag Key. */
  private String key;

  /**
   * constructor.
   */
  public PresetTagBody() {}

  /**
   * Get Key.
   * 
   * @return {@link String}
   */
  public String key() {
    return this.key;
  }

  /**
   * Set Key.
   * 
   * @param s {@link String}
   * @return {@link PresetTagBody}
   */
  public PresetTagBody key(final String s) {
    this.key = s;
    return this;
  }
}
