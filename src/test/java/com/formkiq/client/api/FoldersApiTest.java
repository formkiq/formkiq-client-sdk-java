/*
 * FormKiQ HTTP API
 * FormKiQ HTTP API
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
import com.formkiq.client.model.AddFolderRequest;
import com.formkiq.client.model.AddFolderResponse;
import com.formkiq.client.model.DeleteFolderResponse;
import com.formkiq.client.model.GetFoldersResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FoldersApi
 */
@Disabled
public class FoldersApiTest {

    private final FoldersApi api = new FoldersApi();

    /**
     * Creates a new folder
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addFolderTest() throws ApiException {
        AddFolderRequest addFolderRequest = null;
        String siteId = null;
        String shareKey = null;
        AddFolderResponse response = api.addFolder(addFolderRequest, siteId, shareKey);
        // TODO: test validations
    }

    /**
     * Delete a specific folder; folder must be empty
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteFolderTest() throws ApiException {
        String indexKey = null;
        String shareKey = null;
        DeleteFolderResponse response = api.deleteFolder(indexKey, shareKey);
        // TODO: test validations
    }

    /**
     * Get list of documents in a folder
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFolderDocumentsTest() throws ApiException {
        String siteId = null;
        String indexKey = null;
        String limit = null;
        String shareKey = null;
        String next = null;
        GetFoldersResponse response = api.getFolderDocuments(siteId, indexKey, limit, shareKey, next);
        // TODO: test validations
    }

}
