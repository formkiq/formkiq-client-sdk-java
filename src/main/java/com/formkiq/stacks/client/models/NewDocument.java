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

import java.nio.charset.Charset;
import java.util.Base64;
import java.util.List;

/**
 * 
 * {@link NewDocument} holder.
 *
 */
public class NewDocument {

  /** Path. */
  private String path;
  /** Content Type. */
  private String contentType;
  /** Document Content. */
  private String content;
  /** Document Tags. */
  private List<DocumentTag> tags;

  /**
   * constructor.
   */
  public NewDocument() {}

  /**
   * Get Path.
   * 
   * @return {@link String}
   */
  public String path() {
    return this.path;
  }

  /**
   * Set Path.
   * 
   * @param s {@link String}
   * @return {@link NewDocument}
   */
  public NewDocument path(final String s) {
    this.path = s;
    return this;
  }

  /**
   * Get Content Type.
   * 
   * @return {@link String}
   */
  public String contentType() {
    return this.contentType;
  }

  /**
   * Set Content Type.
   * 
   * @param s {@link String}
   * @return {@link NewDocument}
   */
  public NewDocument contentType(final String s) {
    this.contentType = s;
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
   * Set Content and converts to Base64.
   * 
   * @param s {@link String}
   * @param charset {@link Charset}
   * @return {@link NewDocument}
   */
  public NewDocument content(final String s, final Charset charset) {
    return contentAsBase64(Base64.getEncoder().encodeToString(s.getBytes(charset)));
  }

  /**
   * Set Content.
   * 
   * @param s Base64 encoded string.
   * @return {@link NewDocument}
   */
  public NewDocument contentAsBase64(final String s) {
    this.content = s;
    return this;
  }

  /**
   * Get Tags.
   * 
   * @return {@link List} {@link DocumentTag}
   */
  public List<DocumentTag> tags() {
    return this.tags;
  }

  /**
   * Set Tags.
   * 
   * @param list {@link List} {@link DocumentTag}
   * @return {@link NewDocument}
   */
  public NewDocument tags(final List<DocumentTag> list) {
    this.tags = list;
    return this;
  }
}
