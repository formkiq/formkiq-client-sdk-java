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

import static org.junit.Assert.assertEquals;
import java.util.Optional;
import org.junit.Test;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentials;
import software.amazon.awssdk.regions.Region;

/**
 * 
 * Unit Test for {@link HttpServiceJava}.
 *
 */
public class HttpServiceTest {

  /** {@link HttpServiceJava}. */
  private HttpServiceJava http = new HttpServiceJava();

  /**
   * Test region().
   */
  @Test
  public void testRegion() {
    assertEquals(Optional.empty(), this.http.signingRegion(null).signingRegion());
    assertEquals(Region.US_EAST_1, this.http.signingRegion(Region.US_EAST_1).signingRegion().get());
  }

  /**
   * Test credentials().
   */
  @Test
  public void testCredentials() {
    AwsCredentials basic = AwsBasicCredentials.create("123", "456");
    assertEquals(Optional.empty(), this.http.credentials(null).credentials());
    assertEquals("123", this.http.credentials(basic).credentials().get().accessKeyId());
  }
}
