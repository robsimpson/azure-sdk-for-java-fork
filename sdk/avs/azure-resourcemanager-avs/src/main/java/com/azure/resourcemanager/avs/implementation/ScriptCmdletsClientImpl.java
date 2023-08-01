// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.implementation;

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
import com.azure.resourcemanager.avs.fluent.ScriptCmdletsClient;
import com.azure.resourcemanager.avs.fluent.models.ScriptCmdletInner;
import com.azure.resourcemanager.avs.models.ScriptCmdletsList;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ScriptCmdletsClient. */
public final class ScriptCmdletsClientImpl implements ScriptCmdletsClient {
    /** The proxy service used to perform REST calls. */
    private final ScriptCmdletsService service;

    /** The service client containing this operation class. */
    private final AvsClientImpl client;

    /**
     * Initializes an instance of ScriptCmdletsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ScriptCmdletsClientImpl(AvsClientImpl client) {
        this.service =
            RestProxy.create(ScriptCmdletsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AvsClientScriptCmdlets to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AvsClientScriptCmdle")
    public interface ScriptCmdletsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.AVS/privateClouds"
                + "/{privateCloudName}/scriptPackages/{scriptPackageName}/scriptCmdlets")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ScriptCmdletsList>> list(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("privateCloudName") String privateCloudName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("scriptPackageName") String scriptPackageName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.AVS/privateClouds"
                + "/{privateCloudName}/scriptPackages/{scriptPackageName}/scriptCmdlets/{scriptCmdletName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ScriptCmdletInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("privateCloudName") String privateCloudName,
            @PathParam("scriptPackageName") String scriptPackageName,
            @PathParam("scriptCmdletName") String scriptCmdletName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ScriptCmdletsList>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * List script cmdlet resources available for a private cloud to create a script execution resource on a private
     * cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param scriptPackageName Name of the script package in the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pageable list of scripts/cmdlets along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ScriptCmdletInner>> listSinglePageAsync(
        String resourceGroupName, String privateCloudName, String scriptPackageName) {
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
        if (privateCloudName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter privateCloudName is required and cannot be null."));
        }
        if (scriptPackageName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter scriptPackageName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            privateCloudName,
                            this.client.getApiVersion(),
                            scriptPackageName,
                            accept,
                            context))
            .<PagedResponse<ScriptCmdletInner>>map(
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
     * List script cmdlet resources available for a private cloud to create a script execution resource on a private
     * cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param scriptPackageName Name of the script package in the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pageable list of scripts/cmdlets along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ScriptCmdletInner>> listSinglePageAsync(
        String resourceGroupName, String privateCloudName, String scriptPackageName, Context context) {
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
        if (privateCloudName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter privateCloudName is required and cannot be null."));
        }
        if (scriptPackageName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter scriptPackageName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                privateCloudName,
                this.client.getApiVersion(),
                scriptPackageName,
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
     * List script cmdlet resources available for a private cloud to create a script execution resource on a private
     * cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param scriptPackageName Name of the script package in the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pageable list of scripts/cmdlets as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ScriptCmdletInner> listAsync(
        String resourceGroupName, String privateCloudName, String scriptPackageName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, privateCloudName, scriptPackageName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * List script cmdlet resources available for a private cloud to create a script execution resource on a private
     * cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param scriptPackageName Name of the script package in the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pageable list of scripts/cmdlets as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ScriptCmdletInner> listAsync(
        String resourceGroupName, String privateCloudName, String scriptPackageName, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, privateCloudName, scriptPackageName, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * List script cmdlet resources available for a private cloud to create a script execution resource on a private
     * cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param scriptPackageName Name of the script package in the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pageable list of scripts/cmdlets as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ScriptCmdletInner> list(
        String resourceGroupName, String privateCloudName, String scriptPackageName) {
        return new PagedIterable<>(listAsync(resourceGroupName, privateCloudName, scriptPackageName));
    }

    /**
     * List script cmdlet resources available for a private cloud to create a script execution resource on a private
     * cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param scriptPackageName Name of the script package in the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pageable list of scripts/cmdlets as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ScriptCmdletInner> list(
        String resourceGroupName, String privateCloudName, String scriptPackageName, Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, privateCloudName, scriptPackageName, context));
    }

    /**
     * Return information about a script cmdlet resource in a specific package on a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param scriptPackageName Name of the script package in the private cloud.
     * @param scriptCmdletName Name of the script cmdlet resource in the script package in the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a cmdlet available for script execution along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ScriptCmdletInner>> getWithResponseAsync(
        String resourceGroupName, String privateCloudName, String scriptPackageName, String scriptCmdletName) {
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
        if (privateCloudName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter privateCloudName is required and cannot be null."));
        }
        if (scriptPackageName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter scriptPackageName is required and cannot be null."));
        }
        if (scriptCmdletName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter scriptCmdletName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            privateCloudName,
                            scriptPackageName,
                            scriptCmdletName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Return information about a script cmdlet resource in a specific package on a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param scriptPackageName Name of the script package in the private cloud.
     * @param scriptCmdletName Name of the script cmdlet resource in the script package in the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a cmdlet available for script execution along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ScriptCmdletInner>> getWithResponseAsync(
        String resourceGroupName,
        String privateCloudName,
        String scriptPackageName,
        String scriptCmdletName,
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
        if (privateCloudName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter privateCloudName is required and cannot be null."));
        }
        if (scriptPackageName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter scriptPackageName is required and cannot be null."));
        }
        if (scriptCmdletName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter scriptCmdletName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                privateCloudName,
                scriptPackageName,
                scriptCmdletName,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Return information about a script cmdlet resource in a specific package on a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param scriptPackageName Name of the script package in the private cloud.
     * @param scriptCmdletName Name of the script cmdlet resource in the script package in the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a cmdlet available for script execution on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ScriptCmdletInner> getAsync(
        String resourceGroupName, String privateCloudName, String scriptPackageName, String scriptCmdletName) {
        return getWithResponseAsync(resourceGroupName, privateCloudName, scriptPackageName, scriptCmdletName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Return information about a script cmdlet resource in a specific package on a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param scriptPackageName Name of the script package in the private cloud.
     * @param scriptCmdletName Name of the script cmdlet resource in the script package in the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a cmdlet available for script execution along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ScriptCmdletInner> getWithResponse(
        String resourceGroupName,
        String privateCloudName,
        String scriptPackageName,
        String scriptCmdletName,
        Context context) {
        return getWithResponseAsync(resourceGroupName, privateCloudName, scriptPackageName, scriptCmdletName, context)
            .block();
    }

    /**
     * Return information about a script cmdlet resource in a specific package on a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param scriptPackageName Name of the script package in the private cloud.
     * @param scriptCmdletName Name of the script cmdlet resource in the script package in the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a cmdlet available for script execution.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ScriptCmdletInner get(
        String resourceGroupName, String privateCloudName, String scriptPackageName, String scriptCmdletName) {
        return getWithResponse(resourceGroupName, privateCloudName, scriptPackageName, scriptCmdletName, Context.NONE)
            .getValue();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pageable list of scripts/cmdlets along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ScriptCmdletInner>> listNextSinglePageAsync(String nextLink) {
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
            .<PagedResponse<ScriptCmdletInner>>map(
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
     * @return pageable list of scripts/cmdlets along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ScriptCmdletInner>> listNextSinglePageAsync(String nextLink, Context context) {
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
