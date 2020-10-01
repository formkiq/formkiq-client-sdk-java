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
 * DocumentContent holder.
 *
 */
public class DocumentContent {

  /** Content. */
  private String content;
  /** Content Url. */
  private String contentUrl;
  /** Content Type. */
  private String contentType;
  /** Is Base 64. */
  private boolean isBase64;

  /**
   * constructor.
   */
  public DocumentContent() {}

  /**
   * Get Document Content.
   * 
   * @return {@link String}
   */
  public String content() {
    return this.content;
  }

  /**
   * Set Content.
   * 
   * @param documentContent {@link String}
   * @return {@link String}
   */
  public DocumentContent content(final String documentContent) {
    this.content = documentContent;
    return this;
  }

  /**
   * Get Content Url.
   * 
   * @return {@link String}
   */
  public String contentUrl() {
    return this.contentUrl;
  }

  /**
   * Set Content Url.
   * 
   * @param url {@link String}
   * @return {@link String}
   */
  public DocumentContent contentUrl(final String url) {
    this.contentUrl = url;
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
   * @param type {@link String}
   */
  public void contentType(final String type) {
    this.contentType = type;
  }

  /**
   * Is Content Base64 Encoded.
   * 
   * @return boolean
   */
  public boolean isBase64() {
    return this.isBase64;
  }

  /**
   * Set Base 64.
   * 
   * @param base64 boolean
   */
  public void isBase64(final boolean base64) {
    this.isBase64 = base64;
  }

}
