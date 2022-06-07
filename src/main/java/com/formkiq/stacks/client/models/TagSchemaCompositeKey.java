package com.formkiq.stacks.client.models;

import java.util.List;

/**
 * 
 * Tag Schema Composite Key.
 *
 */
public class TagSchemaCompositeKey {

  /** {@link List} {@link String}. */
  private List<String> key;

  /**
   * constructor.
   */
  public TagSchemaCompositeKey() {

  }

  /**
   * Get {@link List} {@link String}.
   * 
   * @return {@link List} {@link String}
   */
  public List<String> key() {
    return this.key;
  }

  /**
   * Set {@link List} {@link String}.
   * 
   * @param list {@link List} {@link String}
   * @return {@link TagSchemaCompositeKey}
   */
  public TagSchemaCompositeKey key(final List<String> list) {
    this.key = list;
    return this;
  }
}
