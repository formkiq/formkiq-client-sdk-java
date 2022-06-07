package com.formkiq.stacks.client.models;

import java.util.Date;

/**
 * 
 * TagSchema.
 *
 */
public class TagSchema {
  /** Tag Schema Id. */
  private String tagSchemaId;
  /** Tag Schema Name. */
  private String name;
  /** User Id. */
  private String userId;
  /** Inserted Date. */
  private Date insertedDate;
  /** {@link TagSchemaTags}. */
  private TagSchemaTags tags;

  /**
   * constructor.
   */
  public TagSchema() {}

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
   * @return {@link TagSchema}
   */
  public TagSchema insertedDate(final Date date) {
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
   * @return {@link TagSchema}
   */
  public TagSchema tagSchemaId(final String id) {
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
   * @return {@link TagSchema}
   */
  public TagSchema userId(final String user) {
    this.userId = user;
    return this;
  }
}
