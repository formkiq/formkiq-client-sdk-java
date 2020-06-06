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

import java.io.IOException;
import java.net.http.HttpHeaders;
import java.net.http.HttpResponse;
import java.util.Optional;
import software.amazon.awssdk.auth.credentials.AwsCredentials;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.regions.Region;

/**
 * Http Service.
 *
 */
public interface HttpService {

  /**
   * Gets {@link AwsCredentials}.
   * 
   * @return {@link AwsCredentials}
   */
  Optional<AwsCredentials> credentials();

  /**
   * Set {@link AwsCredentials}.
   * 
   * @param cred {@link AwsCredentials}
   * @return {@link HttpServiceJava}
   */
  HttpServiceJava credentials(AwsCredentials cred);

  /**
   * Perform 'DELETE' Request.
   * 
   * @param uri {@link String}
   * @param headers {@link Optional} {@link HttpHeaders}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  HttpResponse<String> delete(String uri, Optional<HttpHeaders> headers)
      throws IOException, InterruptedException;

  /**
   * Perform 'GET' Request.
   * 
   * @param uri {@link String}
   * @param headers {@link HttpHeaders}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  HttpResponse<String> get(String uri, Optional<HttpHeaders> headers)
      throws IOException, InterruptedException;

  /**
   * Perform 'OPTIONS' Request.
   * 
   * @param uri {@link String}
   * @param headers {@link HttpHeaders}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  HttpResponse<String> options(String uri, Optional<HttpHeaders> headers)
      throws IOException, InterruptedException;

  /**
   * Perform 'PATCH' Request.
   * 
   * @param uri {@link String}
   * @param headers {@link HttpHeaders}
   * @param payload {@link RequestBody}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  HttpResponse<String> patch(String uri, Optional<HttpHeaders> headers, RequestBody payload)
      throws IOException, InterruptedException;

  /**
   * Perform 'POST' Request.
   * 
   * @param uri {@link String}
   * @param headers {@link HttpHeaders}
   * @param payload {@link RequestBody}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  HttpResponse<String> post(String uri, Optional<HttpHeaders> headers, RequestBody payload)
      throws IOException, InterruptedException;

  /**
   * Perform 'PUT' Request.
   * 
   * @param uri {@link String}
   * @param headers {@link HttpHeaders}
   * @param payload {@link RequestBody}
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  HttpResponse<String> put(String uri, Optional<HttpHeaders> headers, RequestBody payload)
      throws IOException, InterruptedException;

  /**
   * Gets Signing Region.
   * 
   * @return {@link Region}
   */
  Optional<Region> signingRegion();

  /**
   * Set Aws {@link Region}.
   * 
   * @param region {@link Region}
   * @return {@link HttpServiceJava}
   */
  HttpService signingRegion(Region region);
}
