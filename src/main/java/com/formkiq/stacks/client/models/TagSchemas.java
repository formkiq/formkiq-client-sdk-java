package com.formkiq.stacks.client.models;

/**
 * 
 * TagSchemas.
 *
 */
public class TagSchemas {

  /** {@link TagSchema}. */
  private TagSchema schema;

  /**
   * constructor.
   */
  public TagSchemas() {

  }

  /**
   * Get {@link TagSchema}.
   * 
   * @return {@link TagSchema}
   */
  public TagSchema schema() {
    return this.schema;
  }

  /**
   * Set {@link TagSchema}.
   * 
   * @param tagSchema {@link TagSchema}
   * @return {@link TagSchemas}
   */
  public TagSchemas schema(final TagSchema tagSchema) {
    this.schema = tagSchema;
    return this;
  }
}
