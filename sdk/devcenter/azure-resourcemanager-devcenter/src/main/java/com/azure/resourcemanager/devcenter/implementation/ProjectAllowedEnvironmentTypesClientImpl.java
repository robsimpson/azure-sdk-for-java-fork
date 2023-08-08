// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.implementation;

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
import com.azure.resourcemanager.devcenter.fluent.ProjectAllowedEnvironmentTypesClient;
import com.azure.resourcemanager.devcenter.fluent.models.AllowedEnvironmentTypeInner;
import com.azure.resourcemanager.devcenter.models.AllowedEnvironmentTypeListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ProjectAllowedEnvironmentTypesClient. */
public final class ProjectAllowedEnvironmentTypesClientImpl implements ProjectAllowedEnvironmentTypesClient {
    /** The proxy service used to perform REST calls. */
    private final ProjectAllowedEnvironmentTypesService service;

    /** The service client containing this operation class. */
    private final DevCenterManagementClientImpl client;

    /**
     * Initializes an instance of ProjectAllowedEnvironmentTypesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ProjectAllowedEnvironmentTypesClientImpl(DevCenterManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    ProjectAllowedEnvironmentTypesService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DevCenterManagementClientProjectAllowedEnvironmentTypes to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DevCenterManagementC")
    public interface ProjectAllowedEnvironmentTypesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DevCenter/projects/{projectName}/allowedEnvironmentTypes")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AllowedEnvironmentTypeListResult>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("projectName") String projectName,
            @QueryParam("$top") Integer top,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DevCenter/projects/{projectName}/allowedEnvironmentTypes/{environmentTypeName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AllowedEnvironmentTypeInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("projectName") String projectName,
            @PathParam("environmentTypeName") String environmentTypeName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AllowedEnvironmentTypeListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Lists allowed environment types for a project.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName The name of the project.
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the allowed environment type list operation along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AllowedEnvironmentTypeInner>> listSinglePageAsync(
        String resourceGroupName, String projectName, Integer top) {
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
        if (projectName == null) {
            return Mono.error(new IllegalArgumentException("Parameter projectName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            projectName,
                            top,
                            accept,
                            context))
            .<PagedResponse<AllowedEnvironmentTypeInner>>map(
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
     * Lists allowed environment types for a project.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName The name of the project.
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the allowed environment type list operation along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AllowedEnvironmentTypeInner>> listSinglePageAsync(
        String resourceGroupName, String projectName, Integer top, Context context) {
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
        if (projectName == null) {
            return Mono.error(new IllegalArgumentException("Parameter projectName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                projectName,
                top,
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
     * Lists allowed environment types for a project.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName The name of the project.
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the allowed environment type list operation as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<AllowedEnvironmentTypeInner> listAsync(
        String resourceGroupName, String projectName, Integer top) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, projectName, top),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists allowed environment types for a project.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName The name of the project.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the allowed environment type list operation as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<AllowedEnvironmentTypeInner> listAsync(String resourceGroupName, String projectName) {
        final Integer top = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, projectName, top),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists allowed environment types for a project.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName The name of the project.
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the allowed environment type list operation as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<AllowedEnvironmentTypeInner> listAsync(
        String resourceGroupName, String projectName, Integer top, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, projectName, top, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Lists allowed environment types for a project.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName The name of the project.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the allowed environment type list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AllowedEnvironmentTypeInner> list(String resourceGroupName, String projectName) {
        final Integer top = null;
        return new PagedIterable<>(listAsync(resourceGroupName, projectName, top));
    }

    /**
     * Lists allowed environment types for a project.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName The name of the project.
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the allowed environment type list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AllowedEnvironmentTypeInner> list(
        String resourceGroupName, String projectName, Integer top, Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, projectName, top, context));
    }

    /**
     * Gets an allowed environment type.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName The name of the project.
     * @param environmentTypeName The name of the environment type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an allowed environment type along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AllowedEnvironmentTypeInner>> getWithResponseAsync(
        String resourceGroupName, String projectName, String environmentTypeName) {
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
        if (projectName == null) {
            return Mono.error(new IllegalArgumentException("Parameter projectName is required and cannot be null."));
        }
        if (environmentTypeName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter environmentTypeName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            projectName,
                            environmentTypeName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets an allowed environment type.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName The name of the project.
     * @param environmentTypeName The name of the environment type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an allowed environment type along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AllowedEnvironmentTypeInner>> getWithResponseAsync(
        String resourceGroupName, String projectName, String environmentTypeName, Context context) {
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
        if (projectName == null) {
            return Mono.error(new IllegalArgumentException("Parameter projectName is required and cannot be null."));
        }
        if (environmentTypeName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter environmentTypeName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                projectName,
                environmentTypeName,
                accept,
                context);
    }

    /**
     * Gets an allowed environment type.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName The name of the project.
     * @param environmentTypeName The name of the environment type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an allowed environment type on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<AllowedEnvironmentTypeInner> getAsync(
        String resourceGroupName, String projectName, String environmentTypeName) {
        return getWithResponseAsync(resourceGroupName, projectName, environmentTypeName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets an allowed environment type.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName The name of the project.
     * @param environmentTypeName The name of the environment type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an allowed environment type along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AllowedEnvironmentTypeInner> getWithResponse(
        String resourceGroupName, String projectName, String environmentTypeName, Context context) {
        return getWithResponseAsync(resourceGroupName, projectName, environmentTypeName, context).block();
    }

    /**
     * Gets an allowed environment type.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName The name of the project.
     * @param environmentTypeName The name of the environment type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an allowed environment type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AllowedEnvironmentTypeInner get(String resourceGroupName, String projectName, String environmentTypeName) {
        return getWithResponse(resourceGroupName, projectName, environmentTypeName, Context.NONE).getValue();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the allowed environment type list operation along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AllowedEnvironmentTypeInner>> listNextSinglePageAsync(String nextLink) {
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
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<AllowedEnvironmentTypeInner>>map(
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
     * @return result of the allowed environment type list operation along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AllowedEnvironmentTypeInner>> listNextSinglePageAsync(String nextLink, Context context) {
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
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
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
