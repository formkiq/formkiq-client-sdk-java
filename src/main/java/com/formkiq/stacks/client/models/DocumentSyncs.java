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
 * Document Actions holder.
 *
 */
public class DocumentSyncs {

  /** {@link List} {@link DocumentSync}. */
  private List<DocumentSync> syncs;

  /**
   * constructor.
   */
  public DocumentSyncs() {}

  /**
   * Get Document Syncs.
   * 
   * @return {@link List} {@link Document}
   */
  public List<DocumentSync> syncs() {
    return this.syncs;
  }

  /**
   * Set Document Syncs.
   * 
   * @param list {@link List} {@link DocumentSync}
   * @return {@link DocumentSyncs}
   */
  public DocumentSyncs syncs(final List<DocumentSync> list) {
    this.syncs = list;
    return this;
  }
}