// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.fluent.models.DataCollectionRuleAssociationProxyOnlyResourceInner;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DataCollectionRuleAssociationsClient. */
public interface DataCollectionRuleAssociationsClient extends InnerSupportsDelete<Void> {
    /**
     * Lists associations for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pageable list of resources as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<DataCollectionRuleAssociationProxyOnlyResourceInner> listByResourceAsync(String resourceUri);

    /**
     * Lists associations for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pageable list of resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataCollectionRuleAssociationProxyOnlyResourceInner> listByResource(String resourceUri);

    /**
     * Lists associations for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pageable list of resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataCollectionRuleAssociationProxyOnlyResourceInner> listByResource(
        String resourceUri, Context context);

    /**
     * Lists associations for the specified data collection rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dataCollectionRuleName The name of the data collection rule. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pageable list of resources as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<DataCollectionRuleAssociationProxyOnlyResourceInner> listByRuleAsync(
        String resourceGroupName, String dataCollectionRuleName);

    /**
     * Lists associations for the specified data collection rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dataCollectionRuleName The name of the data collection rule. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pageable list of resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataCollectionRuleAssociationProxyOnlyResourceInner> listByRule(
        String resourceGroupName, String dataCollectionRuleName);

    /**
     * Lists associations for the specified data collection rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dataCollectionRuleName The name of the data collection rule. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pageable list of resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataCollectionRuleAssociationProxyOnlyResourceInner> listByRule(
        String resourceGroupName, String dataCollectionRuleName, Context context);

    /**
     * Lists associations for the specified data collection endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dataCollectionEndpointName The name of the data collection endpoint. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pageable list of resources as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<DataCollectionRuleAssociationProxyOnlyResourceInner> listByDataCollectionEndpointAsync(
        String resourceGroupName, String dataCollectionEndpointName);

    /**
     * Lists associations for the specified data collection endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dataCollectionEndpointName The name of the data collection endpoint. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pageable list of resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataCollectionRuleAssociationProxyOnlyResourceInner> listByDataCollectionEndpoint(
        String resourceGroupName, String dataCollectionEndpointName);

    /**
     * Lists associations for the specified data collection endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dataCollectionEndpointName The name of the data collection endpoint. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pageable list of resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataCollectionRuleAssociationProxyOnlyResourceInner> listByDataCollectionEndpoint(
        String resourceGroupName, String dataCollectionEndpointName, Context context);

    /**
     * Returns the specified association.
     *
     * @param resourceUri The identifier of the resource.
     * @param associationName The name of the association. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of generic ARM proxy resource along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<DataCollectionRuleAssociationProxyOnlyResourceInner>> getWithResponseAsync(
        String resourceUri, String associationName);

    /**
     * Returns the specified association.
     *
     * @param resourceUri The identifier of the resource.
     * @param associationName The name of the association. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of generic ARM proxy resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DataCollectionRuleAssociationProxyOnlyResourceInner> getAsync(String resourceUri, String associationName);

    /**
     * Returns the specified association.
     *
     * @param resourceUri The identifier of the resource.
     * @param associationName The name of the association. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of generic ARM proxy resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataCollectionRuleAssociationProxyOnlyResourceInner> getWithResponse(
        String resourceUri, String associationName, Context context);

    /**
     * Returns the specified association.
     *
     * @param resourceUri The identifier of the resource.
     * @param associationName The name of the association. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of generic ARM proxy resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataCollectionRuleAssociationProxyOnlyResourceInner get(String resourceUri, String associationName);

    /**
     * Creates or updates an association.
     *
     * @param resourceUri The identifier of the resource.
     * @param associationName The name of the association. The name is case insensitive.
     * @param body The payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of generic ARM proxy resource along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<DataCollectionRuleAssociationProxyOnlyResourceInner>> createWithResponseAsync(
        String resourceUri, String associationName, DataCollectionRuleAssociationProxyOnlyResourceInner body);

    /**
     * Creates or updates an association.
     *
     * @param resourceUri The identifier of the resource.
     * @param associationName The name of the association. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of generic ARM proxy resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DataCollectionRuleAssociationProxyOnlyResourceInner> createAsync(String resourceUri, String associationName);

    /**
     * Creates or updates an association.
     *
     * @param resourceUri The identifier of the resource.
     * @param associationName The name of the association. The name is case insensitive.
     * @param body The payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of generic ARM proxy resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataCollectionRuleAssociationProxyOnlyResourceInner> createWithResponse(
        String resourceUri,
        String associationName,
        DataCollectionRuleAssociationProxyOnlyResourceInner body,
        Context context);

    /**
     * Creates or updates an association.
     *
     * @param resourceUri The identifier of the resource.
     * @param associationName The name of the association. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of generic ARM proxy resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataCollectionRuleAssociationProxyOnlyResourceInner create(String resourceUri, String associationName);

    /**
     * Deletes an association.
     *
     * @param resourceUri The identifier of the resource.
     * @param associationName The name of the association. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(String resourceUri, String associationName);

    /**
     * Deletes an association.
     *
     * @param resourceUri The identifier of the resource.
     * @param associationName The name of the association. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceUri, String associationName);

    /**
     * Deletes an association.
     *
     * @param resourceUri The identifier of the resource.
     * @param associationName The name of the association. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceUri, String associationName, Context context);

    /**
     * Deletes an association.
     *
     * @param resourceUri The identifier of the resource.
     * @param associationName The name of the association. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceUri, String associationName);
}
