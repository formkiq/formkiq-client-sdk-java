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
 * Documents holder.
 *
 */
public class Documents {

  /** Next Results Token. */
  private String next;
  /** Previous Results Token. */
  private String previous;
  /** {@link List} {@link Document}. */
  private List<Document> documents;

  /**
   * constructor.
   */
  public Documents() {}

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
   * Get Documents.
   * 
   * @return {@link List} {@link Document}
   */
  public List<Document> documents() {
    return this.documents;
  }

  /**
   * Set Documents.
   * 
   * @param list {@link List} {@link Document}
   */
  public void documents(final List<Document> list) {
    this.documents = list;
  }
}
