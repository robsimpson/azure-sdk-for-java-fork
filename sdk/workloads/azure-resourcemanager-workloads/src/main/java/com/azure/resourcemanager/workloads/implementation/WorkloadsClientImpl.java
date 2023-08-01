// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.management.polling.PollerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.workloads.fluent.MonitorsClient;
import com.azure.resourcemanager.workloads.fluent.OperationsClient;
import com.azure.resourcemanager.workloads.fluent.ProviderInstancesClient;
import com.azure.resourcemanager.workloads.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.workloads.fluent.SapApplicationServerInstancesClient;
import com.azure.resourcemanager.workloads.fluent.SapCentralInstancesClient;
import com.azure.resourcemanager.workloads.fluent.SapDatabaseInstancesClient;
import com.azure.resourcemanager.workloads.fluent.SapLandscapeMonitorsClient;
import com.azure.resourcemanager.workloads.fluent.SapVirtualInstancesClient;
import com.azure.resourcemanager.workloads.fluent.WorkloadsClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the WorkloadsClientImpl type. */
@ServiceClient(builder = WorkloadsClientBuilder.class)
public final class WorkloadsClientImpl implements WorkloadsClient {
    /** The ID of the target subscription. */
    private final String subscriptionId;

    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The default poll interval for long-running operation. */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /** The ResourceProvidersClient object to access its operations. */
    private final ResourceProvidersClient resourceProviders;

    /**
     * Gets the ResourceProvidersClient object to access its operations.
     *
     * @return the ResourceProvidersClient object.
     */
    public ResourceProvidersClient getResourceProviders() {
        return this.resourceProviders;
    }

    /** The SapVirtualInstancesClient object to access its operations. */
    private final SapVirtualInstancesClient sapVirtualInstances;

    /**
     * Gets the SapVirtualInstancesClient object to access its operations.
     *
     * @return the SapVirtualInstancesClient object.
     */
    public SapVirtualInstancesClient getSapVirtualInstances() {
        return this.sapVirtualInstances;
    }

    /** The SapCentralInstancesClient object to access its operations. */
    private final SapCentralInstancesClient sapCentralInstances;

    /**
     * Gets the SapCentralInstancesClient object to access its operations.
     *
     * @return the SapCentralInstancesClient object.
     */
    public SapCentralInstancesClient getSapCentralInstances() {
        return this.sapCentralInstances;
    }

    /** The SapDatabaseInstancesClient object to access its operations. */
    private final SapDatabaseInstancesClient sapDatabaseInstances;

    /**
     * Gets the SapDatabaseInstancesClient object to access its operations.
     *
     * @return the SapDatabaseInstancesClient object.
     */
    public SapDatabaseInstancesClient getSapDatabaseInstances() {
        return this.sapDatabaseInstances;
    }

    /** The SapApplicationServerInstancesClient object to access its operations. */
    private final SapApplicationServerInstancesClient sapApplicationServerInstances;

    /**
     * Gets the SapApplicationServerInstancesClient object to access its operations.
     *
     * @return the SapApplicationServerInstancesClient object.
     */
    public SapApplicationServerInstancesClient getSapApplicationServerInstances() {
        return this.sapApplicationServerInstances;
    }

    /** The MonitorsClient object to access its operations. */
    private final MonitorsClient monitors;

    /**
     * Gets the MonitorsClient object to access its operations.
     *
     * @return the MonitorsClient object.
     */
    public MonitorsClient getMonitors() {
        return this.monitors;
    }

    /** The ProviderInstancesClient object to access its operations. */
    private final ProviderInstancesClient providerInstances;

    /**
     * Gets the ProviderInstancesClient object to access its operations.
     *
     * @return the ProviderInstancesClient object.
     */
    public ProviderInstancesClient getProviderInstances() {
        return this.providerInstances;
    }

    /** The SapLandscapeMonitorsClient object to access its operations. */
    private final SapLandscapeMonitorsClient sapLandscapeMonitors;

    /**
     * Gets the SapLandscapeMonitorsClient object to access its operations.
     *
     * @return the SapLandscapeMonitorsClient object.
     */
    public SapLandscapeMonitorsClient getSapLandscapeMonitors() {
        return this.sapLandscapeMonitors;
    }

    /** The OperationsClient object to access its operations. */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /**
     * Initializes an instance of WorkloadsClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The ID of the target subscription.
     * @param endpoint server parameter.
     */
    WorkloadsClientImpl(
        HttpPipeline httpPipeline,
        SerializerAdapter serializerAdapter,
        Duration defaultPollInterval,
        AzureEnvironment environment,
        String subscriptionId,
        String endpoint) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2023-04-01";
        this.resourceProviders = new ResourceProvidersClientImpl(this);
        this.sapVirtualInstances = new SapVirtualInstancesClientImpl(this);
        this.sapCentralInstances = new SapCentralInstancesClientImpl(this);
        this.sapDatabaseInstances = new SapDatabaseInstancesClientImpl(this);
        this.sapApplicationServerInstances = new SapApplicationServerInstancesClientImpl(this);
        this.monitors = new MonitorsClientImpl(this);
        this.providerInstances = new ProviderInstancesClientImpl(this);
        this.sapLandscapeMonitors = new SapLandscapeMonitorsClientImpl(this);
        this.operations = new OperationsClientImpl(this);
    }

    /**
     * Gets default client context.
     *
     * @return the default client context.
     */
    public Context getContext() {
        return Context.NONE;
    }

    /**
     * Merges default client context with provided context.
     *
     * @param context the context to be merged with default client context.
     * @return the merged context.
     */
    public Context mergeContext(Context context) {
        return CoreUtils.mergeContexts(this.getContext(), context);
    }

    /**
     * Gets long running operation result.
     *
     * @param activationResponse the response of activation operation.
     * @param httpPipeline the http pipeline.
     * @param pollResultType type of poll result.
     * @param finalResultType type of final result.
     * @param context the context shared by all requests.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return poller flux for poll result and final result.
     */
    public <T, U> PollerFlux<PollResult<T>, U> getLroResult(
        Mono<Response<Flux<ByteBuffer>>> activationResponse,
        HttpPipeline httpPipeline,
        Type pollResultType,
        Type finalResultType,
        Context context) {
        return PollerFactory
            .create(
                serializerAdapter,
                httpPipeline,
                pollResultType,
                finalResultType,
                defaultPollInterval,
                activationResponse,
                context);
    }

    /**
     * Gets the final result, or an error, based on last async poll response.
     *
     * @param response the last async poll response.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return the final result, or an error.
     */
    public <T, U> Mono<U> getLroFinalResultOrError(AsyncPollResponse<PollResult<T>, U> response) {
        if (response.getStatus() != LongRunningOperationStatus.SUCCESSFULLY_COMPLETED) {
            String errorMessage;
            ManagementError managementError = null;
            HttpResponse errorResponse = null;
            PollResult.Error lroError = response.getValue().getError();
            if (lroError != null) {
                errorResponse =
                    new HttpResponseImpl(
                        lroError.getResponseStatusCode(), lroError.getResponseHeaders(), lroError.getResponseBody());

                errorMessage = response.getValue().getError().getMessage();
                String errorBody = response.getValue().getError().getResponseBody();
                if (errorBody != null) {
                    // try to deserialize error body to ManagementError
                    try {
                        managementError =
                            this
                                .getSerializerAdapter()
                                .deserialize(errorBody, ManagementError.class, SerializerEncoding.JSON);
                        if (managementError.getCode() == null || managementError.getMessage() == null) {
                            managementError = null;
                        }
                    } catch (IOException | RuntimeException ioe) {
                        LOGGER.logThrowableAsWarning(ioe);
                    }
                }
            } else {
                // fallback to default error message
                errorMessage = "Long running operation failed.";
            }
            if (managementError == null) {
                // fallback to default ManagementError
                managementError = new ManagementError(response.getStatus().toString(), errorMessage);
            }
            return Mono.error(new ManagementException(errorMessage, errorResponse, managementError));
        } else {
            return response.getFinalResult();
        }
    }

    private static final class HttpResponseImpl extends HttpResponse {
        private final int statusCode;

        private final byte[] responseBody;

        private final HttpHeaders httpHeaders;

        HttpResponseImpl(int statusCode, HttpHeaders httpHeaders, String responseBody) {
            super(null);
            this.statusCode = statusCode;
            this.httpHeaders = httpHeaders;
            this.responseBody = responseBody == null ? null : responseBody.getBytes(StandardCharsets.UTF_8);
        }

        public int getStatusCode() {
            return statusCode;
        }

        public String getHeaderValue(String s) {
            return httpHeaders.getValue(s);
        }

        public HttpHeaders getHeaders() {
            return httpHeaders;
        }

        public Flux<ByteBuffer> getBody() {
            return Flux.just(ByteBuffer.wrap(responseBody));
        }

        public Mono<byte[]> getBodyAsByteArray() {
            return Mono.just(responseBody);
        }

        public Mono<String> getBodyAsString() {
            return Mono.just(new String(responseBody, StandardCharsets.UTF_8));
        }

        public Mono<String> getBodyAsString(Charset charset) {
            return Mono.just(new String(responseBody, charset));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WorkloadsClientImpl.class);
}
