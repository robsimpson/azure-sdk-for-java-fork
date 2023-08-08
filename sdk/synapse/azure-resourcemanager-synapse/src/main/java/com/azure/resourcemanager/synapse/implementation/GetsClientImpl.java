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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.synapse.fluent.GetsClient;
import com.azure.resourcemanager.synapse.fluent.models.IntegrationRuntimeEnableinteractivequeryInner;
import com.azure.resourcemanager.synapse.fluent.models.IntegrationRuntimeOperationStatusInner;
import com.azure.resourcemanager.synapse.fluent.models.IntegrationRuntimeStopOperationStatusInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in GetsClient. */
public final class GetsClientImpl implements GetsClient {
    /** The proxy service used to perform REST calls. */
    private final GetsService service;

    /** The service client containing this operation class. */
    private final SynapseManagementClientImpl client;

    /**
     * Initializes an instance of GetsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    GetsClientImpl(SynapseManagementClientImpl client) {
        this.service = RestProxy.create(GetsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SynapseManagementClientGets to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SynapseManagementCli")
    public interface GetsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces"
                + "/{workspaceName}/integrationRuntimes/{integrationRuntimeName}/start/operationstatuses"
                + "/{integrationRuntimeOperationId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<IntegrationRuntimeOperationStatusInner>> integrationRuntimeStart(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @PathParam("integrationRuntimeName") String integrationRuntimeName,
            @PathParam("integrationRuntimeOperationId") String integrationRuntimeOperationId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces"
                + "/{workspaceName}/integrationRuntimes/{integrationRuntimeName}/stop/operationstatuses"
                + "/{integrationRuntimeOperationId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<IntegrationRuntimeStopOperationStatusInner>> integrationRuntimeStop(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @PathParam("integrationRuntimeName") String integrationRuntimeName,
            @PathParam("integrationRuntimeOperationId") String integrationRuntimeOperationId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces"
                + "/{workspaceName}/integrationRuntimes/{integrationRuntimeName}/enableinteractivequery"
                + "/operationstatuses/{integrationRuntimeOperationId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<IntegrationRuntimeEnableinteractivequeryInner>> integrationRuntimeEnableInteractivequery(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @PathParam("integrationRuntimeName") String integrationRuntimeName,
            @PathParam("integrationRuntimeOperationId") String integrationRuntimeOperationId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get integration runtime start operation status
     *
     * <p>Get an integration runtime start operation status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param integrationRuntimeOperationId Integration runtime Operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration runtime start operation status along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<IntegrationRuntimeOperationStatusInner>> integrationRuntimeStartWithResponseAsync(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String integrationRuntimeOperationId) {
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
        if (integrationRuntimeName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter integrationRuntimeName is required and cannot be null."));
        }
        if (integrationRuntimeOperationId == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter integrationRuntimeOperationId is required and cannot be null."));
        }
        final String apiVersion = "2021-06-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .integrationRuntimeStart(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            workspaceName,
                            integrationRuntimeName,
                            integrationRuntimeOperationId,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get integration runtime start operation status
     *
     * <p>Get an integration runtime start operation status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param integrationRuntimeOperationId Integration runtime Operation Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration runtime start operation status along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<IntegrationRuntimeOperationStatusInner>> integrationRuntimeStartWithResponseAsync(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String integrationRuntimeOperationId,
        Context context) {
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
        if (integrationRuntimeName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter integrationRuntimeName is required and cannot be null."));
        }
        if (integrationRuntimeOperationId == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter integrationRuntimeOperationId is required and cannot be null."));
        }
        final String apiVersion = "2021-06-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .integrationRuntimeStart(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                resourceGroupName,
                workspaceName,
                integrationRuntimeName,
                integrationRuntimeOperationId,
                accept,
                context);
    }

    /**
     * Get integration runtime start operation status
     *
     * <p>Get an integration runtime start operation status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param integrationRuntimeOperationId Integration runtime Operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration runtime start operation status on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<IntegrationRuntimeOperationStatusInner> integrationRuntimeStartAsync(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String integrationRuntimeOperationId) {
        return integrationRuntimeStartWithResponseAsync(
                resourceGroupName, workspaceName, integrationRuntimeName, integrationRuntimeOperationId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get integration runtime start operation status
     *
     * <p>Get an integration runtime start operation status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param integrationRuntimeOperationId Integration runtime Operation Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration runtime start operation status along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<IntegrationRuntimeOperationStatusInner> integrationRuntimeStartWithResponse(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String integrationRuntimeOperationId,
        Context context) {
        return integrationRuntimeStartWithResponseAsync(
                resourceGroupName, workspaceName, integrationRuntimeName, integrationRuntimeOperationId, context)
            .block();
    }

    /**
     * Get integration runtime start operation status
     *
     * <p>Get an integration runtime start operation status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param integrationRuntimeOperationId Integration runtime Operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration runtime start operation status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public IntegrationRuntimeOperationStatusInner integrationRuntimeStart(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String integrationRuntimeOperationId) {
        return integrationRuntimeStartWithResponse(
                resourceGroupName, workspaceName, integrationRuntimeName, integrationRuntimeOperationId, Context.NONE)
            .getValue();
    }

    /**
     * Get integration runtime stop operation status
     *
     * <p>Get an integration runtime stop operation status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param integrationRuntimeOperationId Integration runtime Operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration runtime stop operation status along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<IntegrationRuntimeStopOperationStatusInner>> integrationRuntimeStopWithResponseAsync(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String integrationRuntimeOperationId) {
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
        if (integrationRuntimeName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter integrationRuntimeName is required and cannot be null."));
        }
        if (integrationRuntimeOperationId == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter integrationRuntimeOperationId is required and cannot be null."));
        }
        final String apiVersion = "2021-06-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .integrationRuntimeStop(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            workspaceName,
                            integrationRuntimeName,
                            integrationRuntimeOperationId,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get integration runtime stop operation status
     *
     * <p>Get an integration runtime stop operation status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param integrationRuntimeOperationId Integration runtime Operation Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration runtime stop operation status along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<IntegrationRuntimeStopOperationStatusInner>> integrationRuntimeStopWithResponseAsync(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String integrationRuntimeOperationId,
        Context context) {
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
        if (integrationRuntimeName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter integrationRuntimeName is required and cannot be null."));
        }
        if (integrationRuntimeOperationId == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter integrationRuntimeOperationId is required and cannot be null."));
        }
        final String apiVersion = "2021-06-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .integrationRuntimeStop(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                resourceGroupName,
                workspaceName,
                integrationRuntimeName,
                integrationRuntimeOperationId,
                accept,
                context);
    }

    /**
     * Get integration runtime stop operation status
     *
     * <p>Get an integration runtime stop operation status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param integrationRuntimeOperationId Integration runtime Operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration runtime stop operation status on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<IntegrationRuntimeStopOperationStatusInner> integrationRuntimeStopAsync(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String integrationRuntimeOperationId) {
        return integrationRuntimeStopWithResponseAsync(
                resourceGroupName, workspaceName, integrationRuntimeName, integrationRuntimeOperationId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get integration runtime stop operation status
     *
     * <p>Get an integration runtime stop operation status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param integrationRuntimeOperationId Integration runtime Operation Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration runtime stop operation status along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<IntegrationRuntimeStopOperationStatusInner> integrationRuntimeStopWithResponse(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String integrationRuntimeOperationId,
        Context context) {
        return integrationRuntimeStopWithResponseAsync(
                resourceGroupName, workspaceName, integrationRuntimeName, integrationRuntimeOperationId, context)
            .block();
    }

    /**
     * Get integration runtime stop operation status
     *
     * <p>Get an integration runtime stop operation status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param integrationRuntimeOperationId Integration runtime Operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration runtime stop operation status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public IntegrationRuntimeStopOperationStatusInner integrationRuntimeStop(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String integrationRuntimeOperationId) {
        return integrationRuntimeStopWithResponse(
                resourceGroupName, workspaceName, integrationRuntimeName, integrationRuntimeOperationId, Context.NONE)
            .getValue();
    }

    /**
     * Get integration runtime enable interactivequery operation status
     *
     * <p>Get an integration runtime enable interactivequery operation status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param integrationRuntimeOperationId Integration runtime Operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration runtime enable interactivequery operation status along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<IntegrationRuntimeEnableinteractivequeryInner>>
        integrationRuntimeEnableInteractivequeryWithResponseAsync(
            String resourceGroupName,
            String workspaceName,
            String integrationRuntimeName,
            String integrationRuntimeOperationId) {
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
        if (integrationRuntimeName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter integrationRuntimeName is required and cannot be null."));
        }
        if (integrationRuntimeOperationId == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter integrationRuntimeOperationId is required and cannot be null."));
        }
        final String apiVersion = "2021-06-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .integrationRuntimeEnableInteractivequery(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            workspaceName,
                            integrationRuntimeName,
                            integrationRuntimeOperationId,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get integration runtime enable interactivequery operation status
     *
     * <p>Get an integration runtime enable interactivequery operation status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param integrationRuntimeOperationId Integration runtime Operation Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration runtime enable interactivequery operation status along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<IntegrationRuntimeEnableinteractivequeryInner>>
        integrationRuntimeEnableInteractivequeryWithResponseAsync(
            String resourceGroupName,
            String workspaceName,
            String integrationRuntimeName,
            String integrationRuntimeOperationId,
            Context context) {
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
        if (integrationRuntimeName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter integrationRuntimeName is required and cannot be null."));
        }
        if (integrationRuntimeOperationId == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter integrationRuntimeOperationId is required and cannot be null."));
        }
        final String apiVersion = "2021-06-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .integrationRuntimeEnableInteractivequery(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                resourceGroupName,
                workspaceName,
                integrationRuntimeName,
                integrationRuntimeOperationId,
                accept,
                context);
    }

    /**
     * Get integration runtime enable interactivequery operation status
     *
     * <p>Get an integration runtime enable interactivequery operation status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param integrationRuntimeOperationId Integration runtime Operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration runtime enable interactivequery operation status on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<IntegrationRuntimeEnableinteractivequeryInner> integrationRuntimeEnableInteractivequeryAsync(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String integrationRuntimeOperationId) {
        return integrationRuntimeEnableInteractivequeryWithResponseAsync(
                resourceGroupName, workspaceName, integrationRuntimeName, integrationRuntimeOperationId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get integration runtime enable interactivequery operation status
     *
     * <p>Get an integration runtime enable interactivequery operation status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param integrationRuntimeOperationId Integration runtime Operation Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration runtime enable interactivequery operation status along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<IntegrationRuntimeEnableinteractivequeryInner> integrationRuntimeEnableInteractivequeryWithResponse(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String integrationRuntimeOperationId,
        Context context) {
        return integrationRuntimeEnableInteractivequeryWithResponseAsync(
                resourceGroupName, workspaceName, integrationRuntimeName, integrationRuntimeOperationId, context)
            .block();
    }

    /**
     * Get integration runtime enable interactivequery operation status
     *
     * <p>Get an integration runtime enable interactivequery operation status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param integrationRuntimeOperationId Integration runtime Operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration runtime enable interactivequery operation status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public IntegrationRuntimeEnableinteractivequeryInner integrationRuntimeEnableInteractivequery(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String integrationRuntimeOperationId) {
        return integrationRuntimeEnableInteractivequeryWithResponse(
                resourceGroupName, workspaceName, integrationRuntimeName, integrationRuntimeOperationId, Context.NONE)
            .getValue();
    }
}
