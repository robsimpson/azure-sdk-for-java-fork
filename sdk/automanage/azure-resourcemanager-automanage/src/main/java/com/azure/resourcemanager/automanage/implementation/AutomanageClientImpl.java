// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automanage.implementation;

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
import com.azure.resourcemanager.automanage.fluent.AutomanageClient;
import com.azure.resourcemanager.automanage.fluent.BestPracticesClient;
import com.azure.resourcemanager.automanage.fluent.BestPracticesVersionsClient;
import com.azure.resourcemanager.automanage.fluent.ConfigurationProfileAssignmentsClient;
import com.azure.resourcemanager.automanage.fluent.ConfigurationProfileHciAssignmentsClient;
import com.azure.resourcemanager.automanage.fluent.ConfigurationProfileHcrpAssignmentsClient;
import com.azure.resourcemanager.automanage.fluent.ConfigurationProfilesClient;
import com.azure.resourcemanager.automanage.fluent.ConfigurationProfilesVersionsClient;
import com.azure.resourcemanager.automanage.fluent.HciReportsClient;
import com.azure.resourcemanager.automanage.fluent.HcrpReportsClient;
import com.azure.resourcemanager.automanage.fluent.OperationsClient;
import com.azure.resourcemanager.automanage.fluent.ReportsClient;
import com.azure.resourcemanager.automanage.fluent.ServicePrincipalsClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the AutomanageClientImpl type. */
@ServiceClient(builder = AutomanageClientBuilder.class)
public final class AutomanageClientImpl implements AutomanageClient {
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

    /** The BestPracticesClient object to access its operations. */
    private final BestPracticesClient bestPractices;

    /**
     * Gets the BestPracticesClient object to access its operations.
     *
     * @return the BestPracticesClient object.
     */
    public BestPracticesClient getBestPractices() {
        return this.bestPractices;
    }

    /** The BestPracticesVersionsClient object to access its operations. */
    private final BestPracticesVersionsClient bestPracticesVersions;

    /**
     * Gets the BestPracticesVersionsClient object to access its operations.
     *
     * @return the BestPracticesVersionsClient object.
     */
    public BestPracticesVersionsClient getBestPracticesVersions() {
        return this.bestPracticesVersions;
    }

    /** The ConfigurationProfilesClient object to access its operations. */
    private final ConfigurationProfilesClient configurationProfiles;

    /**
     * Gets the ConfigurationProfilesClient object to access its operations.
     *
     * @return the ConfigurationProfilesClient object.
     */
    public ConfigurationProfilesClient getConfigurationProfiles() {
        return this.configurationProfiles;
    }

    /** The ConfigurationProfilesVersionsClient object to access its operations. */
    private final ConfigurationProfilesVersionsClient configurationProfilesVersions;

    /**
     * Gets the ConfigurationProfilesVersionsClient object to access its operations.
     *
     * @return the ConfigurationProfilesVersionsClient object.
     */
    public ConfigurationProfilesVersionsClient getConfigurationProfilesVersions() {
        return this.configurationProfilesVersions;
    }

    /** The ConfigurationProfileAssignmentsClient object to access its operations. */
    private final ConfigurationProfileAssignmentsClient configurationProfileAssignments;

    /**
     * Gets the ConfigurationProfileAssignmentsClient object to access its operations.
     *
     * @return the ConfigurationProfileAssignmentsClient object.
     */
    public ConfigurationProfileAssignmentsClient getConfigurationProfileAssignments() {
        return this.configurationProfileAssignments;
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

    /** The ReportsClient object to access its operations. */
    private final ReportsClient reports;

    /**
     * Gets the ReportsClient object to access its operations.
     *
     * @return the ReportsClient object.
     */
    public ReportsClient getReports() {
        return this.reports;
    }

    /** The ServicePrincipalsClient object to access its operations. */
    private final ServicePrincipalsClient servicePrincipals;

    /**
     * Gets the ServicePrincipalsClient object to access its operations.
     *
     * @return the ServicePrincipalsClient object.
     */
    public ServicePrincipalsClient getServicePrincipals() {
        return this.servicePrincipals;
    }

    /** The ConfigurationProfileHcrpAssignmentsClient object to access its operations. */
    private final ConfigurationProfileHcrpAssignmentsClient configurationProfileHcrpAssignments;

    /**
     * Gets the ConfigurationProfileHcrpAssignmentsClient object to access its operations.
     *
     * @return the ConfigurationProfileHcrpAssignmentsClient object.
     */
    public ConfigurationProfileHcrpAssignmentsClient getConfigurationProfileHcrpAssignments() {
        return this.configurationProfileHcrpAssignments;
    }

    /** The HcrpReportsClient object to access its operations. */
    private final HcrpReportsClient hcrpReports;

    /**
     * Gets the HcrpReportsClient object to access its operations.
     *
     * @return the HcrpReportsClient object.
     */
    public HcrpReportsClient getHcrpReports() {
        return this.hcrpReports;
    }

    /** The ConfigurationProfileHciAssignmentsClient object to access its operations. */
    private final ConfigurationProfileHciAssignmentsClient configurationProfileHciAssignments;

    /**
     * Gets the ConfigurationProfileHciAssignmentsClient object to access its operations.
     *
     * @return the ConfigurationProfileHciAssignmentsClient object.
     */
    public ConfigurationProfileHciAssignmentsClient getConfigurationProfileHciAssignments() {
        return this.configurationProfileHciAssignments;
    }

    /** The HciReportsClient object to access its operations. */
    private final HciReportsClient hciReports;

    /**
     * Gets the HciReportsClient object to access its operations.
     *
     * @return the HciReportsClient object.
     */
    public HciReportsClient getHciReports() {
        return this.hciReports;
    }

    /**
     * Initializes an instance of AutomanageClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The ID of the target subscription.
     * @param endpoint server parameter.
     */
    AutomanageClientImpl(
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
        this.apiVersion = "2022-05-04";
        this.bestPractices = new BestPracticesClientImpl(this);
        this.bestPracticesVersions = new BestPracticesVersionsClientImpl(this);
        this.configurationProfiles = new ConfigurationProfilesClientImpl(this);
        this.configurationProfilesVersions = new ConfigurationProfilesVersionsClientImpl(this);
        this.configurationProfileAssignments = new ConfigurationProfileAssignmentsClientImpl(this);
        this.operations = new OperationsClientImpl(this);
        this.reports = new ReportsClientImpl(this);
        this.servicePrincipals = new ServicePrincipalsClientImpl(this);
        this.configurationProfileHcrpAssignments = new ConfigurationProfileHcrpAssignmentsClientImpl(this);
        this.hcrpReports = new HcrpReportsClientImpl(this);
        this.configurationProfileHciAssignments = new ConfigurationProfileHciAssignmentsClientImpl(this);
        this.hciReports = new HciReportsClientImpl(this);
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

    private static final ClientLogger LOGGER = new ClientLogger(AutomanageClientImpl.class);
}
