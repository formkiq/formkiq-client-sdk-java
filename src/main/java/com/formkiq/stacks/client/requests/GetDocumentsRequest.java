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

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.formkiq.stacks.client.ApiRequest;

/**
 * GET /documents.
 *
 */
public class GetDocumentsRequest implements ApiRequest {

  /** DateFormat Formatter for DocumentsRequest. */
  private SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

  /** Request Parameters. */
  private Map<String, String> parameters = new HashMap<>();

  /**
   * constructor.
   */
  public GetDocumentsRequest() {}

  /**
   * Get Documents for {@link Date}.
   * 
   * @param date {@link Date}
   * @return {@link GetDocumentsRequest}
   */
  public GetDocumentsRequest date(final Date date) {
    this.parameters.put("date", this.df.format(date));
    return this;
  }

  @Override
  public Map<String, String> getQueryParameters() {
    return this.parameters;
  }

  @Override
  public String getUrlPath() {
    return "documents";
  }

  /**
   * Limit the number of results returned.
   * 
   * @param limit {@link String}
   * @return {@link GetDocumentsRequest}
   */
  public GetDocumentsRequest limit(final int limit) {
    this.parameters.put("limit", "" + limit);
    return this;
  }

  /**
   * set Next Results Token.
   * 
   * @param next {@link String}
   * @return {@link GetDocumentsRequest}
   */
  public GetDocumentsRequest next(final String next) {
    this.parameters.put("next", next);
    return this;
  }

  /**
   * set Previous Results Token.
   * 
   * @param previous {@link String}
   * @return {@link GetDocumentsRequest}
   */
  public GetDocumentsRequest previous(final String previous) {
    this.parameters.put("previous", previous);
    return this;
  }

  /**
   * Site Identifier.
   * 
   * @param siteId {@link String}
   * @return {@link GetDocumentsRequest}
   */
  public GetDocumentsRequest siteId(final String siteId) {
    this.parameters.put("siteId", siteId);
    return this;
  }

  /**
   * set Timezone.
   * 
   * @param tz {@link String}
   * @return {@link GetDocumentsRequest}
   */
  public GetDocumentsRequest tz(final String tz) {
    this.parameters.put("tz", tz);
    return this;
  }
}
