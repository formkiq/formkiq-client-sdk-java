package com.formkiq.stacks.client.models;

/**
 * 
 * Add Tag Schema Response.
 *
 */
public class AddTagSchemaResponse {

  /** Tag Schema Identifier. */
  private String tagSchemaId;

  /**
   * constructor.
   */
  public AddTagSchemaResponse() {

  }

  /**
   * Get TagSchema Id.
   * 
   * @return {@link String}
   */
  public String tagSchemaId() {
    return this.tagSchemaId;
  }

  /**
   * Set TagSchema Id.
   * 
   * @param id {@link String}
   * @return {@link AddTagSchemaResponse}
   */
  public AddTagSchemaResponse tagSchemaId(final String id) {
    this.tagSchemaId = id;
    return this;
  }
}
