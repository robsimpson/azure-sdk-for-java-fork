// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.models.ServiceEndpointPolicyDefinitionInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ServiceEndpointPolicyDefinitionsClient.
 */
public interface ServiceEndpointPolicyDefinitionsClient {
    /**
     * Deletes the specified ServiceEndpoint policy definitions.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the Service Endpoint Policy.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String serviceEndpointPolicyName, String serviceEndpointPolicyDefinitionName);

    /**
     * Deletes the specified ServiceEndpoint policy definitions.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the Service Endpoint Policy.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(
        String resourceGroupName, String serviceEndpointPolicyName, String serviceEndpointPolicyDefinitionName);

    /**
     * Deletes the specified ServiceEndpoint policy definitions.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the Service Endpoint Policy.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String serviceEndpointPolicyName, String serviceEndpointPolicyDefinitionName);

    /**
     * Deletes the specified ServiceEndpoint policy definitions.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the Service Endpoint Policy.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName,
        String serviceEndpointPolicyName,
        String serviceEndpointPolicyDefinitionName,
        Context context);

    /**
     * Deletes the specified ServiceEndpoint policy definitions.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the Service Endpoint Policy.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(
        String resourceGroupName, String serviceEndpointPolicyName, String serviceEndpointPolicyDefinitionName);

    /**
     * Deletes the specified ServiceEndpoint policy definitions.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the Service Endpoint Policy.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceEndpointPolicyName, String serviceEndpointPolicyDefinitionName);

    /**
     * Deletes the specified ServiceEndpoint policy definitions.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the Service Endpoint Policy.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName,
        String serviceEndpointPolicyName,
        String serviceEndpointPolicyDefinitionName,
        Context context);

    /**
     * Get the specified service endpoint policy definitions from service endpoint policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy name.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified service endpoint policy definitions from service endpoint policy along with {@link
     *     Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ServiceEndpointPolicyDefinitionInner>> getWithResponseAsync(
        String resourceGroupName, String serviceEndpointPolicyName, String serviceEndpointPolicyDefinitionName);

    /**
     * Get the specified service endpoint policy definitions from service endpoint policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy name.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified service endpoint policy definitions from service endpoint policy on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ServiceEndpointPolicyDefinitionInner> getAsync(
        String resourceGroupName, String serviceEndpointPolicyName, String serviceEndpointPolicyDefinitionName);

    /**
     * Get the specified service endpoint policy definitions from service endpoint policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy name.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified service endpoint policy definitions from service endpoint policy along with {@link
     *     Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ServiceEndpointPolicyDefinitionInner> getWithResponse(
        String resourceGroupName,
        String serviceEndpointPolicyName,
        String serviceEndpointPolicyDefinitionName,
        Context context);

    /**
     * Get the specified service endpoint policy definitions from service endpoint policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy name.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified service endpoint policy definitions from service endpoint policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServiceEndpointPolicyDefinitionInner get(
        String resourceGroupName, String serviceEndpointPolicyName, String serviceEndpointPolicyDefinitionName);

    /**
     * Creates or updates a service endpoint policy definition in the specified service endpoint policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition name.
     * @param serviceEndpointPolicyDefinitions Parameters supplied to the create or update service endpoint policy
     *     operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service Endpoint policy definitions along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String serviceEndpointPolicyName,
        String serviceEndpointPolicyDefinitionName,
        ServiceEndpointPolicyDefinitionInner serviceEndpointPolicyDefinitions);

    /**
     * Creates or updates a service endpoint policy definition in the specified service endpoint policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition name.
     * @param serviceEndpointPolicyDefinitions Parameters supplied to the create or update service endpoint policy
     *     operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of service Endpoint policy definitions.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<ServiceEndpointPolicyDefinitionInner>, ServiceEndpointPolicyDefinitionInner>
        beginCreateOrUpdateAsync(
            String resourceGroupName,
            String serviceEndpointPolicyName,
            String serviceEndpointPolicyDefinitionName,
            ServiceEndpointPolicyDefinitionInner serviceEndpointPolicyDefinitions);

    /**
     * Creates or updates a service endpoint policy definition in the specified service endpoint policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition name.
     * @param serviceEndpointPolicyDefinitions Parameters supplied to the create or update service endpoint policy
     *     operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of service Endpoint policy definitions.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ServiceEndpointPolicyDefinitionInner>, ServiceEndpointPolicyDefinitionInner>
        beginCreateOrUpdate(
            String resourceGroupName,
            String serviceEndpointPolicyName,
            String serviceEndpointPolicyDefinitionName,
            ServiceEndpointPolicyDefinitionInner serviceEndpointPolicyDefinitions);

    /**
     * Creates or updates a service endpoint policy definition in the specified service endpoint policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition name.
     * @param serviceEndpointPolicyDefinitions Parameters supplied to the create or update service endpoint policy
     *     operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of service Endpoint policy definitions.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ServiceEndpointPolicyDefinitionInner>, ServiceEndpointPolicyDefinitionInner>
        beginCreateOrUpdate(
            String resourceGroupName,
            String serviceEndpointPolicyName,
            String serviceEndpointPolicyDefinitionName,
            ServiceEndpointPolicyDefinitionInner serviceEndpointPolicyDefinitions,
            Context context);

    /**
     * Creates or updates a service endpoint policy definition in the specified service endpoint policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition name.
     * @param serviceEndpointPolicyDefinitions Parameters supplied to the create or update service endpoint policy
     *     operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service Endpoint policy definitions on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ServiceEndpointPolicyDefinitionInner> createOrUpdateAsync(
        String resourceGroupName,
        String serviceEndpointPolicyName,
        String serviceEndpointPolicyDefinitionName,
        ServiceEndpointPolicyDefinitionInner serviceEndpointPolicyDefinitions);

    /**
     * Creates or updates a service endpoint policy definition in the specified service endpoint policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition name.
     * @param serviceEndpointPolicyDefinitions Parameters supplied to the create or update service endpoint policy
     *     operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service Endpoint policy definitions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServiceEndpointPolicyDefinitionInner createOrUpdate(
        String resourceGroupName,
        String serviceEndpointPolicyName,
        String serviceEndpointPolicyDefinitionName,
        ServiceEndpointPolicyDefinitionInner serviceEndpointPolicyDefinitions);

    /**
     * Creates or updates a service endpoint policy definition in the specified service endpoint policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition name.
     * @param serviceEndpointPolicyDefinitions Parameters supplied to the create or update service endpoint policy
     *     operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service Endpoint policy definitions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServiceEndpointPolicyDefinitionInner createOrUpdate(
        String resourceGroupName,
        String serviceEndpointPolicyName,
        String serviceEndpointPolicyDefinitionName,
        ServiceEndpointPolicyDefinitionInner serviceEndpointPolicyDefinitions,
        Context context);

    /**
     * Gets all service endpoint policy definitions in a service end point policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all service endpoint policy definitions in a service end point policy as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ServiceEndpointPolicyDefinitionInner> listByResourceGroupAsync(
        String resourceGroupName, String serviceEndpointPolicyName);

    /**
     * Gets all service endpoint policy definitions in a service end point policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all service endpoint policy definitions in a service end point policy as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServiceEndpointPolicyDefinitionInner> listByResourceGroup(
        String resourceGroupName, String serviceEndpointPolicyName);

    /**
     * Gets all service endpoint policy definitions in a service end point policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all service endpoint policy definitions in a service end point policy as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServiceEndpointPolicyDefinitionInner> listByResourceGroup(
        String resourceGroupName, String serviceEndpointPolicyName, Context context);
}
