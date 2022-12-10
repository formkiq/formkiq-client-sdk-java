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
 * {@link AddDocusign} holder.
 *
 */
public class AddDocusign {

  /** {@link List} {@link AddDocusignSigner}. */
  private List<AddDocusignSigner> carbonCopies;
  /** Is Development Mode. */
  private boolean developmentMode = false;
  /** Email Subject. */
  private String emailSubject;
  /** {@link List} {@link AddDocusignTab}. */
  private List<AddDocusignTab> recipientTabs;
  /** {@link List} {@link AddDocusignSigner}. */
  private List<AddDocusignSigner> signers;
  /** Docusign Status. */
  private String status;

  /**
   * constructor.
   */
  public AddDocusign() {}

  /**
   * Get {@link List} {@link AddDocusignSigner}.
   * 
   * @return {@link List} {@link AddDocusignSigner}
   */
  public List<AddDocusignSigner> carbonCopies() {
    return this.carbonCopies;
  }

  /**
   * Set {@link List} {@link AddDocusignSigner}.
   * 
   * @param documentSigners {@link List} {@link AddDocusignSigner}
   * @return {@link AddDocusign}
   */
  public AddDocusign carbonCopies(final List<AddDocusignSigner> documentSigners) {
    this.carbonCopies = documentSigners;
    return this;
  }

  /**
   * Get Development Mode.
   * 
   * @return boolean
   */
  public boolean developmentMode() {
    return this.developmentMode;
  }

  /**
   * Set Development Mode.
   * 
   * @param docusignDevelopmentMode boolean
   * @return {@link AddDocusign}
   */
  public AddDocusign developmentMode(final boolean docusignDevelopmentMode) {
    this.developmentMode = docusignDevelopmentMode;
    return this;
  }

  /**
   * Get Email Subject.
   * 
   * @return {@link String}
   */
  public String emailSubject() {
    return this.emailSubject;
  }

  /**
   * Set Email Subject.
   * 
   * @param s {@link String}
   * @return {@link AddDocusign}
   */
  public AddDocusign emailSubject(final String s) {
    this.emailSubject = s;
    return this;
  }

  /**
   * Get {@link List} {@link AddDocusignTab}.
   * 
   * @return {@link List} {@link AddDocusignTab}
   */
  public List<AddDocusignTab> recipientTabs() {
    return this.recipientTabs;
  }

  /**
   * Set {@link List} {@link AddDocusignSigner}.
   * 
   * @param docusignTabs {@link List} {@link AddDocusignTab}
   * @return {@link AddDocusign}
   */
  public AddDocusign recipientTabs(final List<AddDocusignTab> docusignTabs) {
    this.recipientTabs = docusignTabs;
    return this;
  }

  /**
   * Get {@link List} {@link AddDocusignSigner}.
   * 
   * @return {@link List} {@link AddDocusignSigner}
   */
  public List<AddDocusignSigner> signers() {
    return this.signers;
  }

  /**
   * Set {@link List} {@link AddDocusignSigner}.
   * 
   * @param documentSigners {@link List} {@link AddDocusignSigner}
   * @return {@link AddDocusign}
   */
  public AddDocusign signers(final List<AddDocusignSigner> documentSigners) {
    this.signers = documentSigners;
    return this;
  }

  /**
   * Get Status.
   * 
   * @return {@link String}
   */
  public String status() {
    return this.status;
  }

  /**
   * Set Status.
   * 
   * @param s {@link String}
   * @return {@link AddDocusign}
   */
  public AddDocusign status(final String s) {
    this.status = s;
    return this;
  }
}
