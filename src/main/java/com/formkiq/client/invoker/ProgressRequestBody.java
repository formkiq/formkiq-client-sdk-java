/*
 * FormKiQ API Formkiq API: Document Management Platform API using OAuth(JWT) Authentication You can
 * find out more about FormKiQ at [https://formkiq.com](http://formkiq.com). ## Introduction FormKiQ
 * is an API-first (head-less), battle-tested document management API. The FormKiQ API provides all
 * the API endpoints to build your Perfect Document Management Platform. FormKiQ API was built on
 * top of [OpenAPI specification](https://www.openapis.org), so it is easy to use the API spec file
 * with any application that supports the OpenAPI specification. Open API OAuth Specification -
 * https://raw.githubusercontent.com/formkiq/formkiq-core/master/docs/openapi/openapi-jwt.yaml Open
 * API IAM Specification -
 * https://raw.githubusercontent.com/formkiq/formkiq-core/master/docs/openapi/openapi-iam.yaml ##
 * Authentication FormKiQ offers three forms of authentication: - OAuth(JWT) - AWS IAM - API Key
 *
 * The version of the OpenAPI document: 1.14.0 Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */


package com.formkiq.client.invoker;

import okhttp3.MediaType;
import okhttp3.RequestBody;

import java.io.IOException;

import okio.Buffer;
import okio.BufferedSink;
import okio.ForwardingSink;
import okio.Okio;
import okio.Sink;

public class ProgressRequestBody extends RequestBody {

  private final RequestBody requestBody;

  private final ApiCallback callback;

  public ProgressRequestBody(RequestBody requestBody, ApiCallback callback) {
    this.requestBody = requestBody;
    this.callback = callback;
  }

  @Override
  public MediaType contentType() {
    return requestBody.contentType();
  }

  @Override
  public long contentLength() throws IOException {
    return requestBody.contentLength();
  }

  @Override
  public void writeTo(BufferedSink sink) throws IOException {
    BufferedSink bufferedSink = Okio.buffer(sink(sink));
    requestBody.writeTo(bufferedSink);
    bufferedSink.flush();
  }

  private Sink sink(Sink sink) {
    return new ForwardingSink(sink) {

      long bytesWritten = 0L;
      long contentLength = 0L;

      @Override
      public void write(Buffer source, long byteCount) throws IOException {
        super.write(source, byteCount);
        if (contentLength == 0) {
          contentLength = contentLength();
        }

        bytesWritten += byteCount;
        callback.onUploadProgress(bytesWritten, contentLength, bytesWritten == contentLength);
      }
    };
  }
}
