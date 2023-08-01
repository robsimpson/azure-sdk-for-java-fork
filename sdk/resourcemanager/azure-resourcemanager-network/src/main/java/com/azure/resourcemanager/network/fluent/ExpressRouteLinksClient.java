// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.ExpressRouteLinkInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ExpressRouteLinksClient. */
public interface ExpressRouteLinksClient {
    /**
     * Retrieves the specified ExpressRouteLink resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the ExpressRoutePort resource.
     * @param linkName The name of the ExpressRouteLink resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteLink along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ExpressRouteLinkInner>> getWithResponseAsync(
        String resourceGroupName, String expressRoutePortName, String linkName);

    /**
     * Retrieves the specified ExpressRouteLink resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the ExpressRoutePort resource.
     * @param linkName The name of the ExpressRouteLink resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteLink on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ExpressRouteLinkInner> getAsync(String resourceGroupName, String expressRoutePortName, String linkName);

    /**
     * Retrieves the specified ExpressRouteLink resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the ExpressRoutePort resource.
     * @param linkName The name of the ExpressRouteLink resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteLink along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExpressRouteLinkInner> getWithResponse(
        String resourceGroupName, String expressRoutePortName, String linkName, Context context);

    /**
     * Retrieves the specified ExpressRouteLink resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the ExpressRoutePort resource.
     * @param linkName The name of the ExpressRouteLink resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteLink.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteLinkInner get(String resourceGroupName, String expressRoutePortName, String linkName);

    /**
     * Retrieve the ExpressRouteLink sub-resources of the specified ExpressRoutePort resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the ExpressRoutePort resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteLink List Result as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ExpressRouteLinkInner> listAsync(String resourceGroupName, String expressRoutePortName);

    /**
     * Retrieve the ExpressRouteLink sub-resources of the specified ExpressRoutePort resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the ExpressRoutePort resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteLink List Result as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExpressRouteLinkInner> list(String resourceGroupName, String expressRoutePortName);

    /**
     * Retrieve the ExpressRouteLink sub-resources of the specified ExpressRoutePort resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the ExpressRoutePort resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteLink List Result as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExpressRouteLinkInner> list(String resourceGroupName, String expressRoutePortName, Context context);
}
