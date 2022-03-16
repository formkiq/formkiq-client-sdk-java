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
package com.formkiq.stacks.client.requests;

import java.util.List;

/**
 * Document Tag object.
 *
 */
public class AddDocumentTag {

  /** Tag Key. */
  private String key;
  /** Tag Value. */
  private String value;
  /** Tag Values. */
  private List<String> values;

  /**
   * constructor.
   */
  public AddDocumentTag() {}

  /**
   * Get Tag Key.
   * 
   * @return {@link String}
   */
  public String key() {
    return this.key;
  }

  /**
   * Set Tag Key.
   * 
   * @param s {@link String}
   * @return {@link AddDocumentTag}
   */
  public AddDocumentTag key(final String s) {
    this.key = s;
    return this;
  }

  /**
   * Get Tag Value.
   * 
   * @return {@link String}
   */
  public String value() {
    return this.value;
  }

  /**
   * Set Tag Value.
   * 
   * @param s {@link String}
   * @return {@link AddDocumentTag}
   */
  public AddDocumentTag value(final String s) {
    this.value = s;
    return this;
  }

  /**
   * Get Tag Values.
   * 
   * @return {@link String}
   */
  public List<String> values() {
    return this.values;
  }

  /**
   * Set Tag Values.
   * 
   * @param list {@link List} {@link String}
   * @return {@link AddDocumentTag}
   */
  public AddDocumentTag values(final List<String> list) {
    this.values = list;
    return this;
  }
}
