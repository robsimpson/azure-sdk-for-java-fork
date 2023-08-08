// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog;

import com.azure.analytics.purview.catalog.implementation.LineagesImpl;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous PurviewCatalogClient type. */
@ServiceClient(builder = LineageClientBuilder.class, isAsync = true)
public final class LineageAsyncClient {
    @Generated private final LineagesImpl serviceClient;

    /**
     * Initializes an instance of LineageAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    LineageAsyncClient(LineagesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get lineage info of the entity specified by GUID.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>depth</td><td>Integer</td><td>No</td><td>The number of hops for lineage.</td></tr>
     *     <tr><td>width</td><td>Integer</td><td>No</td><td>The number of max expanding width in lineage.</td></tr>
     *     <tr><td>includeParent</td><td>Boolean</td><td>No</td><td>True to include the parent chain in the response.</td></tr>
     *     <tr><td>getDerivedLineage</td><td>Boolean</td><td>No</td><td>True to include derived lineage in the response</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     baseEntityGuid: String (Optional)
     *     guidEntityMap (Optional): {
     *         String (Optional): {
     *             attributes (Optional): {
     *                 String: Object (Optional)
     *             }
     *             typeName: String (Optional)
     *             lastModifiedTS: String (Optional)
     *             classificationNames (Optional): [
     *                 String (Optional)
     *             ]
     *             classifications (Optional): [
     *                  (Optional){
     *                     attributes (Optional): {
     *                         String: Object (Optional)
     *                     }
     *                     typeName: String (Optional)
     *                     lastModifiedTS: String (Optional)
     *                     entityGuid: String (Optional)
     *                     entityStatus: String(ACTIVE/DELETED) (Optional)
     *                     removePropagationsOnEntityDelete: Boolean (Optional)
     *                     validityPeriods (Optional): [
     *                          (Optional){
     *                             endTime: String (Optional)
     *                             startTime: String (Optional)
     *                             timeZone: String (Optional)
     *                         }
     *                     ]
     *                     source: String (Optional)
     *                     sourceDetails (Optional): {
     *                         String: Object (Optional)
     *                     }
     *                 }
     *             ]
     *             displayText: String (Optional)
     *             guid: String (Optional)
     *             isIncomplete: Boolean (Optional)
     *             labels (Optional): [
     *                 String (Optional)
     *             ]
     *             meaningNames (Optional): [
     *                 String (Optional)
     *             ]
     *             meanings (Optional): [
     *                  (Optional){
     *                     confidence: Integer (Optional)
     *                     createdBy: String (Optional)
     *                     description: String (Optional)
     *                     displayText: String (Optional)
     *                     expression: String (Optional)
     *                     relationGuid: String (Optional)
     *                     source: String (Optional)
     *                     status: String(DISCOVERED/PROPOSED/IMPORTED/VALIDATED/DEPRECATED/OBSOLETE/OTHER) (Optional)
     *                     steward: String (Optional)
     *                     termGuid: String (Optional)
     *                 }
     *             ]
     *             status: String(ACTIVE/DELETED) (Optional)
     *         }
     *     }
     *     widthCounts (Optional): {
     *         String (Optional): {
     *             String: Object (Optional)
     *         }
     *     }
     *     lineageDepth: Integer (Optional)
     *     lineageWidth: Integer (Optional)
     *     includeParent: Boolean (Optional)
     *     childrenCount: Integer (Optional)
     *     lineageDirection: String(INPUT/OUTPUT/BOTH) (Optional)
     *     parentRelations (Optional): [
     *          (Optional){
     *             childEntityId: String (Optional)
     *             relationshipId: String (Optional)
     *             parentEntityId: String (Optional)
     *         }
     *     ]
     *     relations (Optional): [
     *          (Optional){
     *             fromEntityId: String (Optional)
     *             relationshipId: String (Optional)
     *             toEntityId: String (Optional)
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param guid The globally unique identifier of the entity.
     * @param direction The direction of the lineage, which could be INPUT, OUTPUT or BOTH. Allowed values: "BOTH",
     *     "INPUT", "OUTPUT".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return lineage info of the entity specified by GUID along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getLineageGraphWithResponse(
            String guid, String direction, RequestOptions requestOptions) {
        return this.serviceClient.getLineageGraphWithResponseAsync(guid, direction, requestOptions);
    }

    /**
     * Return immediate next page lineage info about entity with pagination.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>getDerivedLineage</td><td>Boolean</td><td>No</td><td>True to include derived lineage in the response</td></tr>
     *     <tr><td>offset</td><td>Integer</td><td>No</td><td>The offset for pagination purpose.</td></tr>
     *     <tr><td>limit</td><td>Integer</td><td>No</td><td>The page size - by default there is no paging.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     baseEntityGuid: String (Optional)
     *     guidEntityMap (Optional): {
     *         String (Optional): {
     *             attributes (Optional): {
     *                 String: Object (Optional)
     *             }
     *             typeName: String (Optional)
     *             lastModifiedTS: String (Optional)
     *             classificationNames (Optional): [
     *                 String (Optional)
     *             ]
     *             classifications (Optional): [
     *                  (Optional){
     *                     attributes (Optional): {
     *                         String: Object (Optional)
     *                     }
     *                     typeName: String (Optional)
     *                     lastModifiedTS: String (Optional)
     *                     entityGuid: String (Optional)
     *                     entityStatus: String(ACTIVE/DELETED) (Optional)
     *                     removePropagationsOnEntityDelete: Boolean (Optional)
     *                     validityPeriods (Optional): [
     *                          (Optional){
     *                             endTime: String (Optional)
     *                             startTime: String (Optional)
     *                             timeZone: String (Optional)
     *                         }
     *                     ]
     *                     source: String (Optional)
     *                     sourceDetails (Optional): {
     *                         String: Object (Optional)
     *                     }
     *                 }
     *             ]
     *             displayText: String (Optional)
     *             guid: String (Optional)
     *             isIncomplete: Boolean (Optional)
     *             labels (Optional): [
     *                 String (Optional)
     *             ]
     *             meaningNames (Optional): [
     *                 String (Optional)
     *             ]
     *             meanings (Optional): [
     *                  (Optional){
     *                     confidence: Integer (Optional)
     *                     createdBy: String (Optional)
     *                     description: String (Optional)
     *                     displayText: String (Optional)
     *                     expression: String (Optional)
     *                     relationGuid: String (Optional)
     *                     source: String (Optional)
     *                     status: String(DISCOVERED/PROPOSED/IMPORTED/VALIDATED/DEPRECATED/OBSOLETE/OTHER) (Optional)
     *                     steward: String (Optional)
     *                     termGuid: String (Optional)
     *                 }
     *             ]
     *             status: String(ACTIVE/DELETED) (Optional)
     *         }
     *     }
     *     widthCounts (Optional): {
     *         String (Optional): {
     *             String: Object (Optional)
     *         }
     *     }
     *     lineageDepth: Integer (Optional)
     *     lineageWidth: Integer (Optional)
     *     includeParent: Boolean (Optional)
     *     childrenCount: Integer (Optional)
     *     lineageDirection: String(INPUT/OUTPUT/BOTH) (Optional)
     *     parentRelations (Optional): [
     *          (Optional){
     *             childEntityId: String (Optional)
     *             relationshipId: String (Optional)
     *             parentEntityId: String (Optional)
     *         }
     *     ]
     *     relations (Optional): [
     *          (Optional){
     *             fromEntityId: String (Optional)
     *             relationshipId: String (Optional)
     *             toEntityId: String (Optional)
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param guid The globally unique identifier of the entity.
     * @param direction The direction of the lineage, which could be INPUT, OUTPUT or BOTH. Allowed values: "BOTH",
     *     "INPUT", "OUTPUT".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return atlasLineageInfo along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> nextPageLineageWithResponse(
            String guid, String direction, RequestOptions requestOptions) {
        return this.serviceClient.nextPageLineageWithResponseAsync(guid, direction, requestOptions);
    }

    /**
     * Returns lineage info about entity.
     *
     * <p>In addition to the typeName path parameter, attribute key-value pair(s) can be provided in the following
     * format
     *
     * <p>attr:[attrName]=[attrValue]
     *
     * <p>NOTE: The attrName and attrValue should be unique across entities, eg. qualifiedName.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>depth</td><td>Integer</td><td>No</td><td>The number of hops for lineage.</td></tr>
     *     <tr><td>width</td><td>Integer</td><td>No</td><td>The number of max expanding width in lineage.</td></tr>
     *     <tr><td>includeParent</td><td>Boolean</td><td>No</td><td>True to include the parent chain in the response.</td></tr>
     *     <tr><td>getDerivedLineage</td><td>Boolean</td><td>No</td><td>True to include derived lineage in the response</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     baseEntityGuid: String (Optional)
     *     guidEntityMap (Optional): {
     *         String (Optional): {
     *             attributes (Optional): {
     *                 String: Object (Optional)
     *             }
     *             typeName: String (Optional)
     *             lastModifiedTS: String (Optional)
     *             classificationNames (Optional): [
     *                 String (Optional)
     *             ]
     *             classifications (Optional): [
     *                  (Optional){
     *                     attributes (Optional): {
     *                         String: Object (Optional)
     *                     }
     *                     typeName: String (Optional)
     *                     lastModifiedTS: String (Optional)
     *                     entityGuid: String (Optional)
     *                     entityStatus: String(ACTIVE/DELETED) (Optional)
     *                     removePropagationsOnEntityDelete: Boolean (Optional)
     *                     validityPeriods (Optional): [
     *                          (Optional){
     *                             endTime: String (Optional)
     *                             startTime: String (Optional)
     *                             timeZone: String (Optional)
     *                         }
     *                     ]
     *                     source: String (Optional)
     *                     sourceDetails (Optional): {
     *                         String: Object (Optional)
     *                     }
     *                 }
     *             ]
     *             displayText: String (Optional)
     *             guid: String (Optional)
     *             isIncomplete: Boolean (Optional)
     *             labels (Optional): [
     *                 String (Optional)
     *             ]
     *             meaningNames (Optional): [
     *                 String (Optional)
     *             ]
     *             meanings (Optional): [
     *                  (Optional){
     *                     confidence: Integer (Optional)
     *                     createdBy: String (Optional)
     *                     description: String (Optional)
     *                     displayText: String (Optional)
     *                     expression: String (Optional)
     *                     relationGuid: String (Optional)
     *                     source: String (Optional)
     *                     status: String(DISCOVERED/PROPOSED/IMPORTED/VALIDATED/DEPRECATED/OBSOLETE/OTHER) (Optional)
     *                     steward: String (Optional)
     *                     termGuid: String (Optional)
     *                 }
     *             ]
     *             status: String(ACTIVE/DELETED) (Optional)
     *         }
     *     }
     *     widthCounts (Optional): {
     *         String (Optional): {
     *             String: Object (Optional)
     *         }
     *     }
     *     lineageDepth: Integer (Optional)
     *     lineageWidth: Integer (Optional)
     *     includeParent: Boolean (Optional)
     *     childrenCount: Integer (Optional)
     *     lineageDirection: String(INPUT/OUTPUT/BOTH) (Optional)
     *     parentRelations (Optional): [
     *          (Optional){
     *             childEntityId: String (Optional)
     *             relationshipId: String (Optional)
     *             parentEntityId: String (Optional)
     *         }
     *     ]
     *     relations (Optional): [
     *          (Optional){
     *             fromEntityId: String (Optional)
     *             relationshipId: String (Optional)
     *             toEntityId: String (Optional)
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param typeName The name of the type.
     * @param direction The direction of the lineage, which could be INPUT, OUTPUT or BOTH. Allowed values: "BOTH",
     *     "INPUT", "OUTPUT".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return atlasLineageInfo along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getLineageByUniqueAttributeWithResponse(
            String typeName, String direction, RequestOptions requestOptions) {
        return this.serviceClient.getLineageByUniqueAttributeWithResponseAsync(typeName, direction, requestOptions);
    }
}
