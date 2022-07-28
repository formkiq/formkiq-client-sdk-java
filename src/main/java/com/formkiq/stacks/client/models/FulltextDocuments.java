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
public class FulltextDocuments {

  /** {@link List} {@link Document}. */
  private List<FulltextDocument> documents;

  /**
   * constructor.
   */
  public FulltextDocuments() {}

  /**
   * Get Documents.
   * 
   * @return {@link List} {@link FulltextDocument}
   */
  public List<FulltextDocument> documents() {
    return this.documents;
  }

  /**
   * Set Documents.
   * 
   * @param list {@link List} {@link FulltextDocument}
   */
  public void documents(final List<FulltextDocument> list) {
    this.documents = list;
  }
}