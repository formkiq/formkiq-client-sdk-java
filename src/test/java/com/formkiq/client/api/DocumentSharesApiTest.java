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
import com.formkiq.client.model.AddFolderShareRequest;
import com.formkiq.client.model.AddFolderShareResponse;
import com.formkiq.client.model.DeleteShareResponse;
import com.formkiq.client.model.GetUserShares;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DocumentSharesApi
 */
@Disabled
public class DocumentSharesApiTest {

    private final DocumentSharesApi api = new DocumentSharesApi();

    /**
     * Creates a new folder share; ONLY available with FormKiQ Enterprise
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addFolderShareTest() throws ApiException {
        String indexKey = null;
        AddFolderShareRequest addFolderShareRequest = null;
        String siteId = null;
        AddFolderShareResponse response = api.addFolderShare(indexKey, addFolderShareRequest, siteId);
        // TODO: test validations
    }

    /**
     * Delete a specific document share; ONLY available with FormKiQ Enterprise
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteShareTest() throws ApiException {
        String shareKey = null;
        DeleteShareResponse response = api.deleteShare(shareKey);
        // TODO: test validations
    }

    /**
     * Get a listing of user folder/document shares; ONLY available with FormKiQ Enterprise
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserSharesTest() throws ApiException {
        GetUserShares response = api.getUserShares();
        // TODO: test validations
    }

}
