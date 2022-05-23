package com.formkiq.stacks.client.requests;

/**
 * 
 * Document OCR Parse Types.
 *
 */
public enum OcrParseType {
  /** Text only. */
  TEXT,
  /** Form data (key-value pairs). */
  FORMS,
  /** Table and table cell data. */
  TABLES;
}
