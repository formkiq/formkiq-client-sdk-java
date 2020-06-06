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
import java.net.http.HttpResponse;
import com.formkiq.stacks.client.models.AddDocumentResponse;
import com.formkiq.stacks.client.models.Document;
import com.formkiq.stacks.client.models.DocumentTag;
import com.formkiq.stacks.client.models.DocumentTags;
import com.formkiq.stacks.client.models.DocumentUrl;
import com.formkiq.stacks.client.models.Documents;
import com.formkiq.stacks.client.models.UpdateDocumentResponse;
import com.formkiq.stacks.client.requests.AddDocumentRequest;
import com.formkiq.stacks.client.requests.AddDocumentTagRequest;
import com.formkiq.stacks.client.requests.DeleteDocumentRequest;
import com.formkiq.stacks.client.requests.DeleteDocumentTagRequest;
import com.formkiq.stacks.client.requests.GetDocumentContentUrlRequest;
import com.formkiq.stacks.client.requests.GetDocumentRequest;
import com.formkiq.stacks.client.requests.GetDocumentTagsKeyRequest;
import com.formkiq.stacks.client.requests.GetDocumentTagsRequest;
import com.formkiq.stacks.client.requests.GetDocumentUploadRequest;
import com.formkiq.stacks.client.requests.GetDocumentsRequest;
import com.formkiq.stacks.client.requests.SearchDocumentsRequest;
import com.formkiq.stacks.client.requests.UpdateDocumentRequest;
import com.formkiq.stacks.client.requests.UpdateDocumentTagKeyRequest;

/**
 * Http Client for interacting with the FormKiQ API.
 *
 */
public interface FormKiqClient {

  /** Http Status OK. */
  int HTTP_STATUS_OK = 200;
  /** Http Status Created. */
  int HTTP_STATUS_CREATED = 201;
  /** Date Format. */
  String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ssZ";

  /**
   * POST(Add) /documents.
   * 
   * @param request {@link AddDocumentRequest}
   * @return {@link AddDocumentResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  AddDocumentResponse addDocument(AddDocumentRequest request)
      throws IOException, InterruptedException;

  /**
   * POST /documents/{documentId}/tags.
   * 
   * @param request {@link AddDocumentTagRequest}
   * @return boolean
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  boolean addDocumentTag(AddDocumentTagRequest request) throws IOException, InterruptedException;

  /**
   * DELETE /documents/{documentId}.
   * 
   * @param request {@link DeleteDocumentRequest}
   * @return boolean - Whether the document was successfully deleted
   * 
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  boolean deleteDocument(DeleteDocumentRequest request) throws IOException, InterruptedException;

  /**
   * DELETE /documents/{documentId}/tags/{tagKey}.
   * 
   * @param request {@link DeleteDocumentTagRequest}
   * @return {@link HttpResponse} {@link String}
   * 
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  boolean deleteDocumentTag(DeleteDocumentTagRequest request)
      throws IOException, InterruptedException;

  /**
   * GET /documents/{documentId}.
   * 
   * @param request {@link GetDocumentRequest}
   * @return {@link Document}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  Document getDocument(GetDocumentRequest request) throws IOException, InterruptedException;

  /**
   * GET /documents/{documentId}/url.
   * 
   * @param request {@link GetDocumentContentUrlRequest}
   * @return {@link DocumentUrl}
   * 
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  DocumentUrl getDocumentContentUrl(GetDocumentContentUrlRequest request)
      throws IOException, InterruptedException;

  /**
   * GET /documents.
   * 
   * @param request {@link GetDocumentsRequest}
   * 
   * @return {@link Documents}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  Documents getDocuments(GetDocumentsRequest request) throws IOException, InterruptedException;

  /**
   * GET /documents/{documentId}/tags/{tagKey}.
   * 
   * @param request {@link GetDocumentTagsKeyRequest}
   * @return {@link DocumentTag}
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  DocumentTag getDocumentTag(GetDocumentTagsKeyRequest request)
      throws IOException, InterruptedException;

  /**
   * GET /documents/{documentId}/tags.
   * 
   * @param request {@link GetDocumentTagsRequest}
   * @return {@link DocumentTags}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  DocumentTags getDocumentTags(GetDocumentTagsRequest request)
      throws IOException, InterruptedException;

  /**
   * GET /documents/upload or /documents/{documentId}/upload.
   * 
   * @param request {@link GetDocumentUploadRequest}
   * @return {@link DocumentUrl}
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  DocumentUrl getDocumentUpload(GetDocumentUploadRequest request)
      throws IOException, InterruptedException;

  /**
   * GET /version.
   * 
   * @return {@link HttpResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  String getVersion() throws IOException, InterruptedException;

  /**
   * POST /search.
   * 
   * @param request {@link SearchDocumentsRequest}
   * @return {@link Documents}
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  Documents search(SearchDocumentsRequest request) throws IOException, InterruptedException;

  /**
   * PATCH(Update) /documents/{documentId}.
   * 
   * @param request {@link UpdateDocumentRequest}
   * @return {@link UpdateDocumentResponse}
   * @throws IOException IOException
   * @throws InterruptedException InterruptedException
   */
  UpdateDocumentResponse updateDocument(UpdateDocumentRequest request)
      throws IOException, InterruptedException;

  /**
   * PUT /documents/{documentId}/tags/{tagKey}.
   * 
   * @param request {@link UpdateDocumentTagKeyRequest}
   * @return boolean
   * 
   * @throws InterruptedException InterruptedException
   * @throws IOException IOException
   */
  boolean updateDocumentTag(UpdateDocumentTagKeyRequest request)
      throws IOException, InterruptedException;
}
