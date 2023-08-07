package com.formkiq.client.invoker.auth;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import software.amazon.awssdk.http.ContentStreamProvider;

/**
 * 
 * {@link String} implementation of {@link ContentStreamProvider}.
 *
 */
public class StringContentStreamProvider implements ContentStreamProvider {

  /** {@link String}. */
  private String body;

  /**
   * constructor.
   * 
   * @param s {@link String}
   */
  public StringContentStreamProvider(final String s) {
    this.body = s;
  }

  @Override
  public InputStream newStream() {
    InputStream is = new ByteArrayInputStream(this.body.getBytes(StandardCharsets.UTF_8));
    return is;
  }
}
