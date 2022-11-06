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
 * Document Metadata holder.
 *
 */
public class DocumentMetadata {

  /** Document Tag Key. */
  private String key;
  /** Document Tag Value. */
  private String value;
  /** Document Tag Values. */
  private List<String> values;

  /**
   * constructor.
   */
  public DocumentMetadata() {

  }

  /**
   * Get Tag Key.
   * 
   * @return {@link String}
   */
  public String key() {
    return this.key;
  }

  /**
   * Set Key.
   * 
   * @param tagkey {@link String}
   * @return {@link DocumentMetadata}
   */
  public DocumentMetadata key(final String tagkey) {
    this.key = tagkey;
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
   * @param tagValue {@link String}
   * @return {@link DocumentMetadata}
   */
  public DocumentMetadata value(final String tagValue) {
    this.value = tagValue;
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
   * @param tagValues {@link List} {@link String}
   * @return {@link DocumentMetadata}
   */
  public DocumentMetadata values(final List<String> tagValues) {
    this.values = tagValues;
    return this;
  }
}
