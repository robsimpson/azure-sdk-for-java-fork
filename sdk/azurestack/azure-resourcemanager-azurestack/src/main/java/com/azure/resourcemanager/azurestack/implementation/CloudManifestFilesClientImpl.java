// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.implementation;

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
import com.azure.resourcemanager.azurestack.fluent.CloudManifestFilesClient;
import com.azure.resourcemanager.azurestack.fluent.models.CloudManifestFileResponseInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in CloudManifestFilesClient. */
public final class CloudManifestFilesClientImpl implements CloudManifestFilesClient {
    /** The proxy service used to perform REST calls. */
    private final CloudManifestFilesService service;

    /** The service client containing this operation class. */
    private final AzureStackManagementClientImpl client;

    /**
     * Initializes an instance of CloudManifestFilesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    CloudManifestFilesClientImpl(AzureStackManagementClientImpl client) {
        this.service =
            RestProxy.create(CloudManifestFilesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureStackManagementClientCloudManifestFiles to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AzureStackManagement")
    public interface CloudManifestFilesService {
        @Headers({"Content-Type: application/json"})
        @Get("/providers/Microsoft.AzureStack/cloudManifestFiles")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CloudManifestFileResponseInner>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/providers/Microsoft.AzureStack/cloudManifestFiles/{verificationVersion}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CloudManifestFileResponseInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("verificationVersion") String verificationVersion,
            @QueryParam("versionCreationDate") String versionCreationDate,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Returns a cloud specific manifest JSON file with latest version.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cloud specific manifest GET response along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CloudManifestFileResponseInner>> listWithResponseAsync() {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.list(this.client.getEndpoint(), this.client.getApiVersion(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Returns a cloud specific manifest JSON file with latest version.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cloud specific manifest GET response along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CloudManifestFileResponseInner>> listWithResponseAsync(Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.list(this.client.getEndpoint(), this.client.getApiVersion(), accept, context);
    }

    /**
     * Returns a cloud specific manifest JSON file with latest version.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cloud specific manifest GET response on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CloudManifestFileResponseInner> listAsync() {
        return listWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Returns a cloud specific manifest JSON file with latest version.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cloud specific manifest GET response along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CloudManifestFileResponseInner> listWithResponse(Context context) {
        return listWithResponseAsync(context).block();
    }

    /**
     * Returns a cloud specific manifest JSON file with latest version.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cloud specific manifest GET response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CloudManifestFileResponseInner list() {
        return listWithResponse(Context.NONE).getValue();
    }

    /**
     * Returns a cloud specific manifest JSON file.
     *
     * @param verificationVersion Signing verification key version.
     * @param versionCreationDate Signing verification key version creation date.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cloud specific manifest GET response along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CloudManifestFileResponseInner>> getWithResponseAsync(
        String verificationVersion, String versionCreationDate) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (verificationVersion == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter verificationVersion is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            verificationVersion,
                            versionCreationDate,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Returns a cloud specific manifest JSON file.
     *
     * @param verificationVersion Signing verification key version.
     * @param versionCreationDate Signing verification key version creation date.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cloud specific manifest GET response along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CloudManifestFileResponseInner>> getWithResponseAsync(
        String verificationVersion, String versionCreationDate, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (verificationVersion == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter verificationVersion is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                verificationVersion,
                versionCreationDate,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Returns a cloud specific manifest JSON file.
     *
     * @param verificationVersion Signing verification key version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cloud specific manifest GET response on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CloudManifestFileResponseInner> getAsync(String verificationVersion) {
        final String versionCreationDate = null;
        return getWithResponseAsync(verificationVersion, versionCreationDate)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Returns a cloud specific manifest JSON file.
     *
     * @param verificationVersion Signing verification key version.
     * @param versionCreationDate Signing verification key version creation date.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cloud specific manifest GET response along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CloudManifestFileResponseInner> getWithResponse(
        String verificationVersion, String versionCreationDate, Context context) {
        return getWithResponseAsync(verificationVersion, versionCreationDate, context).block();
    }

    /**
     * Returns a cloud specific manifest JSON file.
     *
     * @param verificationVersion Signing verification key version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cloud specific manifest GET response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CloudManifestFileResponseInner get(String verificationVersion) {
        final String versionCreationDate = null;
        return getWithResponse(verificationVersion, versionCreationDate, Context.NONE).getValue();
    }
}
