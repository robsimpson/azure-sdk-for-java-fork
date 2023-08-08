// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.synapse.fluent.SparkConfigurationsOperationsClient;
import com.azure.resourcemanager.synapse.fluent.models.SparkConfigurationResourceInner;
import com.azure.resourcemanager.synapse.models.SparkConfigurationListResponse;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in SparkConfigurationsOperationsClient. */
public final class SparkConfigurationsOperationsClientImpl implements SparkConfigurationsOperationsClient {
    /** The proxy service used to perform REST calls. */
    private final SparkConfigurationsOperationsService service;

    /** The service client containing this operation class. */
    private final SynapseManagementClientImpl client;

    /**
     * Initializes an instance of SparkConfigurationsOperationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    SparkConfigurationsOperationsClientImpl(SynapseManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    SparkConfigurationsOperationsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SynapseManagementClientSparkConfigurationsOperations to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SynapseManagementCli")
    public interface SparkConfigurationsOperationsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces"
                + "/{workspaceName}/sparkconfigurations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SparkConfigurationListResponse>> listByWorkspace(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SparkConfigurationListResponse>> listByWorkspaceNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * List the sparkConfigurations in a workspace.
     *
     * <p>List sparkConfigurations in a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of SparkConfiguration resources along with {@link PagedResponse} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SparkConfigurationResourceInner>> listByWorkspaceSinglePageAsync(
        String resourceGroupName, String workspaceName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        final String apiVersion = "2021-06-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByWorkspace(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            workspaceName,
                            accept,
                            context))
            .<PagedResponse<SparkConfigurationResourceInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List the sparkConfigurations in a workspace.
     *
     * <p>List sparkConfigurations in a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of SparkConfiguration resources along with {@link PagedResponse} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SparkConfigurationResourceInner>> listByWorkspaceSinglePageAsync(
        String resourceGroupName, String workspaceName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        final String apiVersion = "2021-06-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByWorkspace(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                resourceGroupName,
                workspaceName,
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * List the sparkConfigurations in a workspace.
     *
     * <p>List sparkConfigurations in a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of SparkConfiguration resources as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SparkConfigurationResourceInner> listByWorkspaceAsync(
        String resourceGroupName, String workspaceName) {
        return new PagedFlux<>(
            () -> listByWorkspaceSinglePageAsync(resourceGroupName, workspaceName),
            nextLink -> listByWorkspaceNextSinglePageAsync(nextLink));
    }

    /**
     * List the sparkConfigurations in a workspace.
     *
     * <p>List sparkConfigurations in a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of SparkConfiguration resources as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SparkConfigurationResourceInner> listByWorkspaceAsync(
        String resourceGroupName, String workspaceName, Context context) {
        return new PagedFlux<>(
            () -> listByWorkspaceSinglePageAsync(resourceGroupName, workspaceName, context),
            nextLink -> listByWorkspaceNextSinglePageAsync(nextLink, context));
    }

    /**
     * List the sparkConfigurations in a workspace.
     *
     * <p>List sparkConfigurations in a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of SparkConfiguration resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SparkConfigurationResourceInner> listByWorkspace(
        String resourceGroupName, String workspaceName) {
        return new PagedIterable<>(listByWorkspaceAsync(resourceGroupName, workspaceName));
    }

    /**
     * List the sparkConfigurations in a workspace.
     *
     * <p>List sparkConfigurations in a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of SparkConfiguration resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SparkConfigurationResourceInner> listByWorkspace(
        String resourceGroupName, String workspaceName, Context context) {
        return new PagedIterable<>(listByWorkspaceAsync(resourceGroupName, workspaceName, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of SparkConfiguration resources along with {@link PagedResponse} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SparkConfigurationResourceInner>> listByWorkspaceNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByWorkspaceNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<SparkConfigurationResourceInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of SparkConfiguration resources along with {@link PagedResponse} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SparkConfigurationResourceInner>> listByWorkspaceNextSinglePageAsync(
        String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByWorkspaceNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
