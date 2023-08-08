// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.implementation;

import com.azure.analytics.synapse.artifacts.models.ErrorContractException;
import com.azure.analytics.synapse.artifacts.models.Workspace;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Workspaces. */
public final class WorkspacesImpl {
    /** The proxy service used to perform REST calls. */
    private final WorkspacesService service;

    /** The service client containing this operation class. */
    private final ArtifactsClientImpl client;

    /**
     * Initializes an instance of WorkspacesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    WorkspacesImpl(ArtifactsClientImpl client) {
        this.service =
                RestProxy.create(WorkspacesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ArtifactsClientWorkspaces to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "ArtifactsClientWorks")
    public interface WorkspacesService {
        @Get("/workspace")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorContractException.class)
        Mono<Response<Workspace>> get(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Get Workspace.
     *
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workspace along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Workspace>> getWithResponseAsync() {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.get(this.client.getEndpoint(), apiVersion, accept, context));
    }

    /**
     * Get Workspace.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workspace along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Workspace>> getWithResponseAsync(Context context) {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return service.get(this.client.getEndpoint(), apiVersion, accept, context);
    }

    /**
     * Get Workspace.
     *
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workspace on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Workspace> getAsync() {
        return getWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get Workspace.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workspace on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Workspace> getAsync(Context context) {
        return getWithResponseAsync(context).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get Workspace.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workspace along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Workspace> getWithResponse(Context context) {
        return getWithResponseAsync(context).block();
    }

    /**
     * Get Workspace.
     *
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Workspace get() {
        return getWithResponse(Context.NONE).getValue();
    }
}
