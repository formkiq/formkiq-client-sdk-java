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
package com.formkiq.stacks.client.requests;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import com.formkiq.stacks.client.ApiRequest;
import com.formkiq.stacks.client.Validate;

/**
 * OPTIONS /presets/{presetId}/tags and /presets/{presetId}/tags/{tagKey}.
 *
 */
public class OptionsPresetTagsRequest implements ApiRequest {

  /** Request Paths. */
  private Map<String, String> paths = new HashMap<>();

  /**
   * constructor.
   */
  public OptionsPresetTagsRequest() {}

  @Override
  public Optional<Map<String, List<String>>> getHttpHeaders() {
    return Optional.empty();
  }

  @Override
  public Map<String, String> getQueryParameters() {
    return Collections.emptyMap();
  }

  @Override
  public String getUrlPath() {
    return this.paths.containsKey("tag")
        ? "presets/" + this.paths.get("presetId") + "/tags/"
            + URLEncoder.encode(this.paths.get("tag"), StandardCharsets.UTF_8)
        : "presets/" + this.paths.get("presetId") + "/tags";
  }

  /**
   * Set the presetId.
   * 
   * @param presetId {@link String}
   * @return {@link OptionsPresetTagsRequest}
   */
  public OptionsPresetTagsRequest presetId(final String presetId) {
    this.paths.put("presetId", presetId);
    return this;
  }

  /**
   * Set the Tag.
   * 
   * @param tag {@link String}
   * @return {@link OptionsPresetTagsRequest}
   */
  public OptionsPresetTagsRequest tag(final String tag) {
    this.paths.put("tag", tag);
    return this;
  }

  @Override
  public void validate() {
    Validate.notNull(this.paths.get("presetId"), "presetId is required.");
  }
}
