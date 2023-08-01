// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.verticals.agrifood.farming;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.SyncPoller;

/** Initializes a new instance of the synchronous FarmBeatsClient type. */
@ServiceClient(builder = FarmsClientBuilder.class)
public final class FarmsClient {
    @Generated private final FarmsAsyncClient client;

    /**
     * Initializes an instance of FarmsClient class.
     *
     * @param client the async client.
     */
    @Generated
    FarmsClient(FarmsAsyncClient client) {
        this.client = client;
    }

    /**
     * Returns a paginated list of farm resources across all parties.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>ids</td><td>List&lt;String&gt;</td><td>No</td><td>Ids of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>names</td><td>List&lt;String&gt;</td><td>No</td><td>Names of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>propertyFilters</td><td>List&lt;String&gt;</td><td>No</td><td>Filters on key-value pairs within the Properties object.
     * eg. "{testKey} eq {testValue}". Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>statuses</td><td>List&lt;String&gt;</td><td>No</td><td>Statuses of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>minCreatedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Minimum creation date of resource (inclusive).</td></tr>
     *     <tr><td>maxCreatedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Maximum creation date of resource (inclusive).</td></tr>
     *     <tr><td>minLastModifiedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Minimum last modified date of resource (inclusive).</td></tr>
     *     <tr><td>maxLastModifiedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Maximum last modified date of resource (inclusive).</td></tr>
     *     <tr><td>maxPageSize</td><td>Integer</td><td>No</td><td>Maximum number of items needed (inclusive).
     * Minimum = 10, Maximum = 1000, Default value = 50.</td></tr>
     *     <tr><td>skipToken</td><td>String</td><td>No</td><td>Skip token for getting next set of results.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     partyId: String (Optional)
     *     id: String (Optional)
     *     eTag: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     source: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return paged response contains list of requested objects and a URL link to get the next set of results as
     *     paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> list(RequestOptions requestOptions) {
        return new PagedIterable<>(this.client.list(requestOptions));
    }

    /**
     * Create a cascade delete job for specified farm.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     partyId: String (Required)
     *     resourceId: String (Required)
     *     resourceType: String (Required)
     *     id: String (Optional)
     *     status: String(Waiting/Running/Succeeded/Failed/Cancelled) (Optional)
     *     durationInSeconds: Double (Optional)
     *     message: String (Optional)
     *     errorCode: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     lastActionDateTime: OffsetDateTime (Optional)
     *     startTime: OffsetDateTime (Optional)
     *     endTime: OffsetDateTime (Optional)
     * }
     * }</pre>
     *
     * @param jobId Job ID supplied by end user.
     * @param partyId ID of the associated party.
     * @param farmId ID of the farm to be deleted.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link SyncPoller} for polling of schema of cascade delete job.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BinaryData, BinaryData> beginCreateCascadeDeleteJob(
            String jobId, String partyId, String farmId, RequestOptions requestOptions) {
        return this.client.beginCreateCascadeDeleteJob(jobId, partyId, farmId, requestOptions).getSyncPoller();
    }

    /**
     * Get a cascade delete job for specified farm.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     partyId: String (Required)
     *     resourceId: String (Required)
     *     resourceType: String (Required)
     *     id: String (Optional)
     *     status: String(Waiting/Running/Succeeded/Failed/Cancelled) (Optional)
     *     durationInSeconds: Double (Optional)
     *     message: String (Optional)
     *     errorCode: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     lastActionDateTime: OffsetDateTime (Optional)
     *     startTime: OffsetDateTime (Optional)
     *     endTime: OffsetDateTime (Optional)
     * }
     * }</pre>
     *
     * @param jobId Id of the job.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a cascade delete job for specified farm along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getCascadeDeleteJobDetailsWithResponse(String jobId, RequestOptions requestOptions) {
        return this.client.getCascadeDeleteJobDetailsWithResponse(jobId, requestOptions).block();
    }

    /**
     * Returns a paginated list of farm resources under a particular party.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>ids</td><td>List&lt;String&gt;</td><td>No</td><td>Ids of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>names</td><td>List&lt;String&gt;</td><td>No</td><td>Names of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>propertyFilters</td><td>List&lt;String&gt;</td><td>No</td><td>Filters on key-value pairs within the Properties object.
     * eg. "{testKey} eq {testValue}". Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>statuses</td><td>List&lt;String&gt;</td><td>No</td><td>Statuses of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>minCreatedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Minimum creation date of resource (inclusive).</td></tr>
     *     <tr><td>maxCreatedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Maximum creation date of resource (inclusive).</td></tr>
     *     <tr><td>minLastModifiedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Minimum last modified date of resource (inclusive).</td></tr>
     *     <tr><td>maxLastModifiedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Maximum last modified date of resource (inclusive).</td></tr>
     *     <tr><td>maxPageSize</td><td>Integer</td><td>No</td><td>Maximum number of items needed (inclusive).
     * Minimum = 10, Maximum = 1000, Default value = 50.</td></tr>
     *     <tr><td>skipToken</td><td>String</td><td>No</td><td>Skip token for getting next set of results.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     partyId: String (Optional)
     *     id: String (Optional)
     *     eTag: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     source: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param partyId Id of the associated party.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return paged response contains list of requested objects and a URL link to get the next set of results as
     *     paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listByPartyId(String partyId, RequestOptions requestOptions) {
        return new PagedIterable<>(this.client.listByPartyId(partyId, requestOptions));
    }

    /**
     * Gets a specified farm resource under a particular party.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     partyId: String (Optional)
     *     id: String (Optional)
     *     eTag: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     source: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param partyId ID of the associated party resource.
     * @param farmId ID of the farm resource.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a specified farm resource under a particular party along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(String partyId, String farmId, RequestOptions requestOptions) {
        return this.client.getWithResponse(partyId, farmId, requestOptions).block();
    }

    /**
     * Creates or updates a farm resource under a particular party.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     partyId: String (Optional)
     *     id: String (Optional)
     *     eTag: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     source: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     partyId: String (Optional)
     *     id: String (Optional)
     *     eTag: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     source: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param partyId Id of the associated party resource.
     * @param farmId Id of the farm resource.
     * @param farm Farm resource payload to create or update.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return schema of farm resource along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createOrUpdateWithResponse(
            String partyId, String farmId, BinaryData farm, RequestOptions requestOptions) {
        return this.client.createOrUpdateWithResponse(partyId, farmId, farm, requestOptions).block();
    }

    /**
     * Deletes a specified farm resource under a particular party.
     *
     * @param partyId Id of the party.
     * @param farmId Id of the farm.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(String partyId, String farmId, RequestOptions requestOptions) {
        return this.client.deleteWithResponse(partyId, farmId, requestOptions).block();
    }
}
