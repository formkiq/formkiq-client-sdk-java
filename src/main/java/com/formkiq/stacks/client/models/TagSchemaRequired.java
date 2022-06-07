package com.formkiq.stacks.client.models;

import java.util.List;

/**
 * 
 * TagSchemaRequired.
 *
 */
public class TagSchemaRequired {

  /** Tag Schema Key. */
  private String key;
  /** Default Values. */
  private List<String> defaultValues;
  /** Allowed Values. */
  private List<String> allowedValues;

  /**
   * constructor.
   */
  public TagSchemaRequired() {}

  /**
   * Get Allowed Values.
   * 
   * @return {@link List} {@link String}
   */
  public List<String> allowedValues() {
    return this.allowedValues;
  }

  /**
   * Set Allowed Values.
   * 
   * @param list {@link List} {@link String}
   * @return {@link TagSchemaRequired}
   */
  public TagSchemaRequired allowedValues(final List<String> list) {
    this.allowedValues = list;
    return this;
  }

  /**
   * Get Default Values.
   * 
   * @return {@link List} {@link String}
   */
  public List<String> defaultValues() {
    return this.defaultValues;
  }

  /**
   * Set Default Values.
   * 
   * @param list {@link List} {@link String}
   * @return {@link TagSchemaRequired}
   */
  public TagSchemaRequired defaultValues(final List<String> list) {
    this.defaultValues = list;
    return this;
  }

  /**
   * Get Key.
   * 
   * @return {@link String}
   */
  public String key() {
    return this.key;
  }

  /**
   * Set Key.
   * 
   * @param s {@link String}
   * @return {@link TagSchemaRequired}
   */
  public TagSchemaRequired key(final String s) {
    this.key = s;
    return this;
  }
}
