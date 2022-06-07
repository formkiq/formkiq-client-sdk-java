package com.formkiq.stacks.client.models;

import java.util.List;

/**
 *
 * Tag Schemas Summaries.
 *
 */
public class TagSchemaSummaries {

  /** {@link List} {@link TagSchemaSummary}. */
  private List<TagSchemaSummary> schemas;
  /** Next Token. */
  private String next;
  /** Previous Token. */
  private String previous;

  /**
   * constructor.
   */
  public TagSchemaSummaries() {}

  /**
   * Get Next Token.
   * 
   * @return {@link String}
   */
  public String next() {
    return this.next;
  }

  /**
   * Set Next Token.
   * 
   * @param token {@link String}
   * @return {@link TagSchemaSummaries}
   */
  public TagSchemaSummaries next(final String token) {
    this.next = token;
    return this;
  }

  /**
   * Get Previous Token.
   * 
   * @return {@link String}
   */
  public String previous() {
    return this.previous;
  }

  /**
   * Set Previous Token.
   * 
   * @param token {@link String}
   * @return {@link TagSchemaSummaries}
   */
  public TagSchemaSummaries previous(final String token) {
    this.previous = token;
    return this;
  }

  /**
   * Get {@link List} {@link TagSchemaSummary}.
   * 
   * @return {@link List} {@link TagSchemaSummary}
   */
  public List<TagSchemaSummary> schemas() {
    return this.schemas;
  }

  /**
   * Set {@link List} {@link TagSchemaSummary}.
   * 
   * @param list {@link List} {@link TagSchemaSummary}
   * @return {@link TagSchemaSummaries}
   */
  public TagSchemaSummaries schemas(final List<TagSchemaSummary> list) {
    this.schemas = list;
    return this;
  }
}
