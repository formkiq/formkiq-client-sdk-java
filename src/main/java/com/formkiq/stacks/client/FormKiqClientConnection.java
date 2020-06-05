/**
 * Copyright [2020] FormKiQ Inc. Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You may obtain a copy of the License
 * at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.formkiq.stacks.client;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import software.amazon.awssdk.auth.credentials.AwsCredentials;
import software.amazon.awssdk.regions.Region;

/**
 * Class for creating connections to {@link FormKiqClient}.
 *
 */
public class FormKiqClientConnection {

  /** FormKiQ Rest API Url. */
  private String apiRestUrl;
  /** Aws Region. */
  private Optional<Region> awsregion = Optional.empty();
  /** Aws Credentials. */
  private Optional<AwsCredentials> awscredentials = Optional.empty();
  /** Http Headers. */
  private Map<String, List<String>> headers = new HashMap<>();

  /**
   * constructor.
   * 
   * @param restUrl The Rest URL (can be found in SSM
   *        /formkiq/&lt;appenvironment&gt;/api/DocumentsRestUrl)
   */
  public FormKiqClientConnection(final String restUrl) {
    this.apiRestUrl = restUrl;
  }

  /**
   * Cognito Id Token.
   * 
   * @param token {@link String}
   * @return {@link FormKiqClientConnection}
   */
  public FormKiqClientConnection cognitoIdToken(final String token) {
    this.headers.put("Authorization", Arrays.asList(token));
    return this;
  }

  /**
   * Set {@link AwsCredentials}.
   * 
   * @param region {@link Region}
   * @return {@link FormKiqClientConnection}
   */
  public FormKiqClientConnection region(final Region region) {
    this.awsregion = Optional.of(region);
    return this;
  }

  /**
   * Set {@link AwsCredentials}.
   * 
   * @param credentials {@link AwsCredentials}
   * @return {@link FormKiqClientConnection}
   */
  public FormKiqClientConnection credentials(final AwsCredentials credentials) {
    this.awscredentials = Optional.of(credentials);
    return this;
  }

  /**
   * Build {@link HttpService}.
   * 
   * @return {@link HttpService}
   */
  public HttpService build() {

    HttpService http = new HttpServiceJava().headers(this.headers);

    this.awsregion.ifPresent(r -> http.signingRegion(r));
    this.awscredentials.ifPresent(c -> http.credentials(c));

    return http;
  }

  /**
   * Set Origin Http Header.
   * 
   * @param key {@link String}
   * @param values {@link List} {@link String}
   * @return {@link FormKiqClientConnection}
   */
  public FormKiqClientConnection header(final String key, final List<String> values) {
    this.headers.put(key, values);
    return this;
  }

  /**
   * Get Api Rest Url.
   * 
   * @return {@link String}
   */
  public String apiRestUrl() {
    return this.apiRestUrl;
  }
}
