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
 * Sites holder.
 *
 */
public class Sites {

  /** {@link List} {@link Preset}. */
  private List<Site> sites;

  /**
   * constructor.
   */
  public Sites() {}

  /**
   * Get Sites.
   * 
   * @return {@link List} {@link Site}
   */
  public List<Site> sites() {
    return this.sites;
  }

  /**
   * Set Sites.
   * 
   * @param list {@link List} {@link Site}
   */
  public void sites(final List<Site> list) {
    this.sites = list;
  }
}
