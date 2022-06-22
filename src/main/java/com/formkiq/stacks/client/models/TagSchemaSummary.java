package com.formkiq.stacks.client.models;

import java.util.Date;

/**
 * 
 * Tag Schema Summary.
 *
 */
public class TagSchemaSummary {

  /** Tag Identifier. */
  private String tagSchemaId;
  /** Tag Schema Name. */
  private String name;
  /** Created by User. */
  private String userId;
  /** Document Inserted Date. */
  private Date insertedDate;

  /**
   * constructor.
   */
  public TagSchemaSummary() {}

  /**
   * Get Inserted Date.
   * 
   * @return {@link Date}
   */
  public Date insertedDate() {
    return this.insertedDate;
  }

  /**
   * Set Inserted Date.
   * 
   * @param date {@link Date}
   * @return {@link TagSchemaSummary}
   */
  public TagSchemaSummary insertedDate(final Date date) {
    this.insertedDate = date;
    return this;
  }

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
   * @return {@link TagSchemaSummary}
   */
  public TagSchemaSummary name(final String s) {
    this.name = s;
    return this;
  }

  /**
   * Get Tag Schema Id.
   * 
   * @return {@link String}
   */
  public String tagSchemaId() {
    return this.tagSchemaId;
  }

  /**
   * Set Tag Schema Id.
   * 
   * @param id {@link String}
   * @return {@link TagSchemaSummary}
   */
  public TagSchemaSummary tagSchemaId(final String id) {
    this.tagSchemaId = id;
    return this;
  }

  /**
   * Get User Id.
   * 
   * @return {@link String}
   */
  public String userId() {
    return this.userId;
  }

  /**
   * Set User Id.
   * 
   * @param user {@link String}
   * @return {@link TagSchemaSummary}
   */
  public TagSchemaSummary userId(final String user) {
    this.userId = user;
    return this;
  }
}
