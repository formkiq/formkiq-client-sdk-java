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
 * 
 * {@link UpdateFulltext} holder.
 *
 */
public class UpdateFulltext {

  /** Document Content. */
  private String content;
  /** Document Content Url. */
  private List<String> contentUrls;
  /** Path. */
  private String path;
  /** Document Tags. */
  private List<UpdateFulltextTag> tags;

  /**
   * constructor.
   */
  public UpdateFulltext() {}

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
   * @param s {@link String}
   * @return {@link UpdateFulltext}
   */
  public UpdateFulltext content(final String s) {
    this.content = s;
    return this;
  }

  /**
   * Get Content Urls.
   * 
   * @return {@link List} {@link String}
   */
  public List<String> contentUrls() {
    return this.contentUrls;
  }

  /**
   * Set Content url.
   * 
   * @param urls {@link List} {@link String}
   * @return {@link UpdateFulltext}
   */
  public UpdateFulltext contentUrls(final List<String> urls) {
    this.contentUrls = urls;
    return this;
  }

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
   * @return {@link UpdateFulltext}
   */
  public UpdateFulltext path(final String s) {
    this.path = s;
    return this;
  }

  /**
   * Get Tags.
   * 
   * @return {@link List} {@link UpdateFulltextTag}
   */
  public List<UpdateFulltextTag> tags() {
    return this.tags;
  }

  /**
   * Set Tags.
   * 
   * @param list {@link List} {@link UpdateFulltextTag}
   * @return {@link UpdateFulltext}
   */
  public UpdateFulltext tags(final List<UpdateFulltextTag> list) {
    this.tags = list;
    return this;
  }
}
