package com.formkiq.stacks.client.models;

/**
 * 
 * TagSchema.
 *
 */
public class TagSchema {
  /** Tag Schema Name. */
  private String name;
  /** {@link TagSchemaTags}. */
  private TagSchemaTags tags;

  /**
   * constructor.
   */
  public TagSchema() {}

  /**
   * Get Name.
   * 
   * @return {@link String}
   */
  public String name() {
    return this.name;
  }

  /**
   * Set Name.
   * 
   * @param s {@link String}
   * @return {@link TagSchema}
   */
  public TagSchema name(final String s) {
    this.name = s;
    return this;
  }

  /**
   * Get {@link TagSchemaTags}.
   * 
   * @return {@link TagSchemaTags}
   */
  public TagSchemaTags tags() {
    return this.tags;
  }

  /**
   * Set {@link TagSchemaTags}.
   * 
   * @param tagSchema {@link TagSchemaTags}
   * @return {@link TagSchema}
   */
  public TagSchema tags(final TagSchemaTags tagSchema) {
    this.tags = tagSchema;
    return this;
  }
}
