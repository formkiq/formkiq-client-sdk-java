package com.formkiq.stacks.client.models;

import java.util.List;

/**
 * 
 * TagSchemaTags.
 *
 */
public class TagSchemaTags {

  /** {@link List} {@link TagSchemaCompositeKey}. */
  private List<TagSchemaCompositeKey> compositeKeys;
  /** {@link List} {@link TagSchemaRequired}. */
  private List<TagSchemaRequired> required;
  /** {@link List} {@link TagSchemaOptional}. */
  private List<TagSchemaOptional> optional;
  /** Whether Schema allows additional tags. */
  private boolean allowAdditionalTags;

  /**
   * constructor.
   */
  public TagSchemaTags() {}

  /**
   * Get Allow Additional Tags.
   * 
   * @return boolean
   */
  public boolean allowAdditionalTags() {
    return this.allowAdditionalTags;
  }

  /**
   * Set Allow Additional Tags.
   * 
   * @param allowed boolean
   * @return {@link TagSchemaTags}
   */
  public TagSchemaTags allowAdditionalTags(final boolean allowed) {
    this.allowAdditionalTags = allowed;
    return this;
  }

  /**
   * Get {@link List} {@link TagSchemaCompositeKey}.
   * 
   * @return {@link List} {@link TagSchemaCompositeKey}
   */
  public List<TagSchemaCompositeKey> compositeKeys() {
    return this.compositeKeys;
  }

  /**
   * Set {@link List} {@link TagSchemaCompositeKey}.
   * 
   * @param tagSchemaCompositeKey {@link List} {@link TagSchemaCompositeKey}
   * @return {@link TagSchemaTags}
   */
  public TagSchemaTags compositeKeys(final List<TagSchemaCompositeKey> tagSchemaCompositeKey) {
    this.compositeKeys = tagSchemaCompositeKey;
    return this;
  }

  /**
   * Get {@link List} {@link TagSchemaOptional}.
   * 
   * @return {@link List} {@link TagSchemaOptional}
   */
  public List<TagSchemaOptional> optional() {
    return this.optional;
  }

  /**
   * Set {@link List} {@link TagSchemaOptional}.
   * 
   * @param tagSchemaOptional {@link List} {@link TagSchemaOptional}
   */
  public void optional(final List<TagSchemaOptional> tagSchemaOptional) {
    this.optional = tagSchemaOptional;
  }

  /**
   * Get {@link List} {@link TagSchemaRequired}.
   * 
   * @return {@link List} {@link TagSchemaRequired}
   */
  public List<TagSchemaRequired> required() {
    return this.required;
  }

  /**
   * Set {@link List} {@link TagSchemaRequired}.
   * 
   * @param tagSchemaRequired {@link List} {@link TagSchemaRequired}.
   * @return {@link TagSchemaTags}
   */
  public TagSchemaTags required(final List<TagSchemaRequired> tagSchemaRequired) {
    this.required = tagSchemaRequired;
    return this;
  }
}
