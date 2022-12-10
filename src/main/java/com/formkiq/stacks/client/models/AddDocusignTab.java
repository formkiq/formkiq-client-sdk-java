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
 * Add DocumentAction holder.
 *
 */
public class AddDocusignTab {

  /** Signer Name. */
  private String pageNumber;
  /** Position X. */
  private String positionX;
  /** Position Y. */
  private String positionY;
  /** Tab Type. */
  private String type = "signHere";

  /**
   * constructor.
   */
  public AddDocusignTab() {

  }

  /**
   * Get Page Number.
   * 
   * @return {@link String}
   */
  public String pageNumber() {
    return this.pageNumber;
  }

  /**
   * Set Page Number.
   * 
   * @param s {@link String}
   * @return {@link AddDocusignTab}
   */
  public AddDocusignTab pageNumber(final String s) {
    this.pageNumber = s;
    return this;
  }

  /**
   * Get Position X.
   * 
   * @return {@link String}
   */
  public String positionX() {
    return this.positionX;
  }

  /**
   * Set Position X.
   * 
   * @param s {@link String}
   * @return {@link AddDocusignTab}
   */
  public AddDocusignTab positionX(final String s) {
    this.pageNumber = s;
    return this;
  }

  /**
   * Get Position Y.
   * 
   * @return {@link String}
   */
  public String positionY() {
    return this.positionY;
  }

  /**
   * Set Position Y.
   * 
   * @param s {@link String}
   * @return {@link AddDocusignTab}
   */
  public AddDocusignTab positionY(final String s) {
    this.pageNumber = s;
    return this;
  }

  /**
   * Get Tab Type.
   * 
   * @return {@link String}
   */
  public String type() {
    return this.type;
  }

  /**
   * Set Tab Type.
   * 
   * @param s {@link String}
   * @return {@link AddDocusignTab}
   */
  public AddDocusignTab type(final String s) {
    this.type = s;
    return this;
  }
}
