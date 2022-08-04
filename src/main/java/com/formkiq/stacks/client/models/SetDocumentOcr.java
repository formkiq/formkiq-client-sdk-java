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
 * SetDocumentOcr holder.
 *
 */
public class SetDocumentOcr {

  /** Document Ocr Content Type. */
  private String contentType;
  /** Document Content. */
  private String content;

  /**
   * constructor.
   */
  public SetDocumentOcr() {

  }

  /**
   * Get Content-Type.
   * 
   * @return {@link String}
   */
  public String contentType() {
    return this.contentType;
  }

  /**
   * Set Content-Type.
   * 
   * @param type {@link String}
   * @return {@link SetDocumentOcr}
   */
  public SetDocumentOcr contentType(final String type) {
    this.contentType = type;
    return this;
  }

  /**
   * Get Content.
   * 
   * @return {@link String}
   */
  public String content() {
    return this.content;
  }

  /**
   * Set Content.
   * 
   * @param data {@link String}
   * @return {@link SetDocumentOcr}
   */
  public SetDocumentOcr content(final String data) {
    this.content = data;
    return this;
  }
}
