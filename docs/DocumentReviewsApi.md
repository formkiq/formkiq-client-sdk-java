# DocumentReviewsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDocumentReview**](DocumentReviewsApi.md#addDocumentReview) | **POST** /documents/{documentId}/reviews | Add document review |
| [**addDocumentReviewDecision**](DocumentReviewsApi.md#addDocumentReviewDecision) | **POST** /documents/{documentId}/reviews/{reviewId}/decisions | Add document review decision |
| [**getDocumentReview**](DocumentReviewsApi.md#getDocumentReview) | **GET** /documents/{documentId}/reviews/{reviewId} | Get document review |
| [**getDocumentReviewDecisions**](DocumentReviewsApi.md#getDocumentReviewDecisions) | **GET** /documents/{documentId}/reviews/{reviewId}/decisions | Get document review decisions |
| [**getDocumentReviews**](DocumentReviewsApi.md#getDocumentReviews) | **GET** /documents/{documentId}/reviews | Get document reviews |
| [**updateDocumentReview**](DocumentReviewsApi.md#updateDocumentReview) | **PATCH** /documents/{documentId}/reviews/{reviewId} | Update document review |


<a id="addDocumentReview"></a>
# **addDocumentReview**
> AddDocumentReviewResponse addDocumentReview(documentId, addDocumentReviewRequest, siteId, artifactId)

Add document review

Add a review to a document. When notifications are supplied, queue each notification for delivery when the review is created. Omitted or null countedDecisionTypes defaults to [APPROVAL]. Only decision records of the configured types count toward requiredDecisions; other supported types may still be submitted. The same counting policy applies to document-level and artifact-scoped reviews.

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentReviewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentReviewsApi apiInstance = new DocumentReviewsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    AddDocumentReviewRequest addDocumentReviewRequest = new AddDocumentReviewRequest(); // AddDocumentReviewRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    String artifactId = "artifactId_example"; // String | Artifact Document Identifier
    try {
      AddDocumentReviewResponse result = apiInstance.addDocumentReview(documentId, addDocumentReviewRequest, siteId, artifactId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentReviewsApi#addDocumentReview");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentId** | **String**| Document Identifier | |
| **addDocumentReviewRequest** | [**AddDocumentReviewRequest**](AddDocumentReviewRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |
| **artifactId** | **String**| Artifact Document Identifier | [optional] |

### Return type

[**AddDocumentReviewResponse**](AddDocumentReviewResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 CREATED |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | Invalid review configuration, including empty, duplicate, unknown, or non-string countedDecisionTypes entries. |  -  |

<a id="addDocumentReviewDecision"></a>
# **addDocumentReviewDecision**
> AddDocumentReviewDecisionResponse addDocumentReviewDecision(documentId, reviewId, addDocumentReviewDecisionRequest, siteId, artifactId)

Add document review decision

Add a decision to a document review. When approvalGroups is set on the review, the caller must belong to at least one of those groups, in addition to satisfying the existing authorization requirements, before the decision is added. Every accepted submission is retained with its own decision ID, author, timestamp, and content. countedDecisionTypes selects records that contribute to requiredDecisions; it does not restrict which supported types may be submitted. Counting uses decision records, not distinct reviewers. APPROVAL records count regardless of their decision value. With the default [APPROVAL] policy, COMMENT, RECOMMENDATION, and ACKNOWLEDGMENT may be submitted repeatedly by the same authorized user while the review is open. A non-counting submission may move PENDING to IN_PROGRESS, but cannot complete the review or trigger completion-dependent processing. It does not automatically create a follow-up review or downstream action; an explicitly supplied follow-up review uses the same counting-policy defaults and validation as ordinary review creation. Completion occurs when the qualifying count reaches or exceeds requiredDecisions. Decisions submitted to a review that is already COMPLETED return 409 Conflict without creating a decision, follow-up review, notification, or activity record.

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentReviewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentReviewsApi apiInstance = new DocumentReviewsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String reviewId = "reviewId_example"; // String | Review Identifier
    AddDocumentReviewDecisionRequest addDocumentReviewDecisionRequest = new AddDocumentReviewDecisionRequest(); // AddDocumentReviewDecisionRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    String artifactId = "artifactId_example"; // String | Artifact Document Identifier
    try {
      AddDocumentReviewDecisionResponse result = apiInstance.addDocumentReviewDecision(documentId, reviewId, addDocumentReviewDecisionRequest, siteId, artifactId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentReviewsApi#addDocumentReviewDecision");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentId** | **String**| Document Identifier | |
| **reviewId** | **String**| Review Identifier | |
| **addDocumentReviewDecisionRequest** | [**AddDocumentReviewDecisionRequest**](AddDocumentReviewDecisionRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |
| **artifactId** | **String**| Artifact Document Identifier | [optional] |

### Return type

[**AddDocumentReviewDecisionResponse**](AddDocumentReviewDecisionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 CREATED |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | Invalid decision or explicitly requested follow-up review configuration. |  -  |
| **409** | The review is already complete. No decision was created. |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getDocumentReview"></a>
# **getDocumentReview**
> GetDocumentReviewResponse getDocumentReview(documentId, reviewId, siteId, artifactId)

Get document review

Get a document review by review id, including its effective countedDecisionTypes policy. Reviews stored without an explicit policy return [APPROVAL]; historical completed reviews retain their status.

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentReviewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentReviewsApi apiInstance = new DocumentReviewsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String reviewId = "reviewId_example"; // String | Review Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    String artifactId = "artifactId_example"; // String | Artifact Document Identifier
    try {
      GetDocumentReviewResponse result = apiInstance.getDocumentReview(documentId, reviewId, siteId, artifactId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentReviewsApi#getDocumentReview");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentId** | **String**| Document Identifier | |
| **reviewId** | **String**| Review Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |
| **artifactId** | **String**| Artifact Document Identifier | [optional] |

### Return type

[**GetDocumentReviewResponse**](GetDocumentReviewResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getDocumentReviewDecisions"></a>
# **getDocumentReviewDecisions**
> GetDocumentReviewDecisionsResponse getDocumentReviewDecisions(documentId, reviewId, siteId, artifactId, limit, next)

Get document review decisions

Get a listing of all decisions for a document review, including records whose types do not count toward completion.

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentReviewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentReviewsApi apiInstance = new DocumentReviewsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String reviewId = "reviewId_example"; // String | Review Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    String artifactId = "artifactId_example"; // String | Artifact Document Identifier
    String limit = "10"; // String | Limit Results
    String next = "next_example"; // String | Next page of results token
    try {
      GetDocumentReviewDecisionsResponse result = apiInstance.getDocumentReviewDecisions(documentId, reviewId, siteId, artifactId, limit, next);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentReviewsApi#getDocumentReviewDecisions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentId** | **String**| Document Identifier | |
| **reviewId** | **String**| Review Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |
| **artifactId** | **String**| Artifact Document Identifier | [optional] |
| **limit** | **String**| Limit Results | [optional] [default to 10] |
| **next** | **String**| Next page of results token | [optional] |

### Return type

[**GetDocumentReviewDecisionsResponse**](GetDocumentReviewDecisionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getDocumentReviews"></a>
# **getDocumentReviews**
> GetDocumentReviewsResponse getDocumentReviews(documentId, siteId, artifactId, limit, next)

Get document reviews

Get a listing of reviews for a document, including the effective countedDecisionTypes policy for each review.

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentReviewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentReviewsApi apiInstance = new DocumentReviewsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String siteId = "siteId_example"; // String | Site Identifier
    String artifactId = "artifactId_example"; // String | Artifact Document Identifier
    String limit = "10"; // String | Limit Results
    String next = "next_example"; // String | Next page of results token
    try {
      GetDocumentReviewsResponse result = apiInstance.getDocumentReviews(documentId, siteId, artifactId, limit, next);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentReviewsApi#getDocumentReviews");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentId** | **String**| Document Identifier | |
| **siteId** | **String**| Site Identifier | [optional] |
| **artifactId** | **String**| Artifact Document Identifier | [optional] |
| **limit** | **String**| Limit Results | [optional] [default to 10] |
| **next** | **String**| Next page of results token | [optional] |

### Return type

[**GetDocumentReviewsResponse**](GetDocumentReviewsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="updateDocumentReview"></a>
# **updateDocumentReview**
> UpdateResponse updateDocumentReview(documentId, reviewId, updateDocumentReviewRequest, siteId, artifactId)

Update document review

Update a document review by review id. Omitted properties retain their existing values. Changes to countedDecisionTypes or requiredDecisions apply when subsequent counted decisions are submitted. Updating the counting configuration does not change reviewStatus.

### Example
```java
// Import classes:
import com.formkiq.client.invoker.ApiClient;
import com.formkiq.client.invoker.ApiException;
import com.formkiq.client.invoker.Configuration;
import com.formkiq.client.invoker.auth.*;
import com.formkiq.client.invoker.models.*;
import com.formkiq.client.api.DocumentReviewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    DocumentReviewsApi apiInstance = new DocumentReviewsApi(defaultClient);
    String documentId = "documentId_example"; // String | Document Identifier
    String reviewId = "reviewId_example"; // String | Review Identifier
    UpdateDocumentReviewRequest updateDocumentReviewRequest = new UpdateDocumentReviewRequest(); // UpdateDocumentReviewRequest | 
    String siteId = "siteId_example"; // String | Site Identifier
    String artifactId = "artifactId_example"; // String | Artifact Document Identifier
    try {
      UpdateResponse result = apiInstance.updateDocumentReview(documentId, reviewId, updateDocumentReviewRequest, siteId, artifactId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentReviewsApi#updateDocumentReview");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentId** | **String**| Document Identifier | |
| **reviewId** | **String**| Review Identifier | |
| **updateDocumentReviewRequest** | [**UpdateDocumentReviewRequest**](UpdateDocumentReviewRequest.md)|  | |
| **siteId** | **String**| Site Identifier | [optional] |
| **artifactId** | **String**| Artifact Document Identifier | [optional] |

### Return type

[**UpdateResponse**](UpdateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | Invalid review configuration, including empty, duplicate, unknown, or non-string countedDecisionTypes entries. |  -  |

