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
 * Version holder.
 *
 */
public class Version {

  /** {@link List} {@link String}. */
  private List<String> modules;
  /** Type. */
  private String type;
  /** Version. */
  private String version;

  /**
   * constructor.
   */
  public Version() {}

  /**
   * Get Modules.
   * 
   * @return {@link String}
   */
  public List<String> modules() {
    return this.modules;
  }

  /**
   * Set Modules.
   * 
   * @param list {@link List} {@link String}
   * @return {@link Version}
   */
  public Version modules(final List<String> list) {
    this.modules = list;
    return this;
  }

  /**
   * Get Type.
   * 
   * @return {@link String}
   */
  public String type() {
    return this.type;
  }

  /**
   * Set Type.
   * 
   * @param v {@link String}
   * @return {@link String}
   */
  public Version type(final String v) {
    this.type = v;
    return this;
  }

  /**
   * Get Version.
   * 
   * @return {@link String}
   */
  public String version() {
    return this.version;
  }

  /**
   * Set Version.
   * 
   * @param v {@link String}
   * @return {@link String}
   */
  public Version version(final String v) {
    this.version = v;
    return this;
  }
}
