/*
 * FormKiQ HTTP API
 * Formkiq API: Document Management Platform API using JWT Authentication
 *
 * The version of the OpenAPI document: 1.12.0
 * Contact: support@formkiq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.formkiq.client.api;

import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.model.DeleteIndicesResponse;
import com.formkiq.client.model.IndexFolderMoveRequest;
import com.formkiq.client.model.IndexFolderMoveResponse;
import com.formkiq.client.model.IndexSearchRequest;
import com.formkiq.client.model.IndexSearchResponse;
import com.formkiq.client.model.ValidationErrorsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomIndexApi
 */
@Disabled
public class CustomIndexApiTest {

    private final CustomIndexApi api = new CustomIndexApi();

    /**
     * Perform a delete on the Folder Index
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteIndexTest() throws ApiException {
        String indexKey = null;
        String indexType = null;
        String siteId = null;
        DeleteIndicesResponse response = api.deleteIndex(indexKey, indexType, siteId);
        // TODO: test validations
    }

    /**
     * Perform an Folder Index Move
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void indexFolderMoveTest() throws ApiException {
        String indexType = null;
        IndexFolderMoveRequest indexFolderMoveRequest = null;
        String siteId = null;
        IndexFolderMoveResponse response = api.indexFolderMove(indexType, indexFolderMoveRequest, siteId);
        // TODO: test validations
    }

    /**
     * Perform a search on a index; this is currently available for both folder and tag indices
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void indexSearchTest() throws ApiException {
        IndexSearchRequest indexSearchRequest = null;
        String siteId = null;
        String limit = null;
        String next = null;
        String previous = null;
        IndexSearchResponse response = api.indexSearch(indexSearchRequest, siteId, limit, next, previous);
        // TODO: test validations
    }

}
