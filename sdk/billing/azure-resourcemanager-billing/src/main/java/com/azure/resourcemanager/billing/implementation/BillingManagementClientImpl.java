// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.implementation;

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
import com.azure.resourcemanager.billing.fluent.AddressClient;
import com.azure.resourcemanager.billing.fluent.AgreementsClient;
import com.azure.resourcemanager.billing.fluent.AvailableBalancesClient;
import com.azure.resourcemanager.billing.fluent.BillingAccountsClient;
import com.azure.resourcemanager.billing.fluent.BillingManagementClient;
import com.azure.resourcemanager.billing.fluent.BillingPeriodsClient;
import com.azure.resourcemanager.billing.fluent.BillingPermissionsClient;
import com.azure.resourcemanager.billing.fluent.BillingProfilesClient;
import com.azure.resourcemanager.billing.fluent.BillingPropertiesClient;
import com.azure.resourcemanager.billing.fluent.BillingRoleAssignmentsClient;
import com.azure.resourcemanager.billing.fluent.BillingRoleDefinitionsClient;
import com.azure.resourcemanager.billing.fluent.BillingSubscriptionsClient;
import com.azure.resourcemanager.billing.fluent.CustomersClient;
import com.azure.resourcemanager.billing.fluent.EnrollmentAccountsClient;
import com.azure.resourcemanager.billing.fluent.InstructionsClient;
import com.azure.resourcemanager.billing.fluent.InvoiceSectionsClient;
import com.azure.resourcemanager.billing.fluent.InvoicesClient;
import com.azure.resourcemanager.billing.fluent.OperationsClient;
import com.azure.resourcemanager.billing.fluent.PoliciesClient;
import com.azure.resourcemanager.billing.fluent.ProductsClient;
import com.azure.resourcemanager.billing.fluent.ReservationsClient;
import com.azure.resourcemanager.billing.fluent.TransactionsClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the BillingManagementClientImpl type. */
@ServiceClient(builder = BillingManagementClientBuilder.class)
public final class BillingManagementClientImpl implements BillingManagementClient {
    /** The ID that uniquely identifies an Azure subscription. */
    private final String subscriptionId;

    /**
     * Gets The ID that uniquely identifies an Azure subscription.
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

    /** The BillingAccountsClient object to access its operations. */
    private final BillingAccountsClient billingAccounts;

    /**
     * Gets the BillingAccountsClient object to access its operations.
     *
     * @return the BillingAccountsClient object.
     */
    public BillingAccountsClient getBillingAccounts() {
        return this.billingAccounts;
    }

    /** The AddressClient object to access its operations. */
    private final AddressClient address;

    /**
     * Gets the AddressClient object to access its operations.
     *
     * @return the AddressClient object.
     */
    public AddressClient getAddress() {
        return this.address;
    }

    /** The AvailableBalancesClient object to access its operations. */
    private final AvailableBalancesClient availableBalances;

    /**
     * Gets the AvailableBalancesClient object to access its operations.
     *
     * @return the AvailableBalancesClient object.
     */
    public AvailableBalancesClient getAvailableBalances() {
        return this.availableBalances;
    }

    /** The InstructionsClient object to access its operations. */
    private final InstructionsClient instructions;

    /**
     * Gets the InstructionsClient object to access its operations.
     *
     * @return the InstructionsClient object.
     */
    public InstructionsClient getInstructions() {
        return this.instructions;
    }

    /** The BillingProfilesClient object to access its operations. */
    private final BillingProfilesClient billingProfiles;

    /**
     * Gets the BillingProfilesClient object to access its operations.
     *
     * @return the BillingProfilesClient object.
     */
    public BillingProfilesClient getBillingProfiles() {
        return this.billingProfiles;
    }

    /** The CustomersClient object to access its operations. */
    private final CustomersClient customers;

    /**
     * Gets the CustomersClient object to access its operations.
     *
     * @return the CustomersClient object.
     */
    public CustomersClient getCustomers() {
        return this.customers;
    }

    /** The InvoiceSectionsClient object to access its operations. */
    private final InvoiceSectionsClient invoiceSections;

    /**
     * Gets the InvoiceSectionsClient object to access its operations.
     *
     * @return the InvoiceSectionsClient object.
     */
    public InvoiceSectionsClient getInvoiceSections() {
        return this.invoiceSections;
    }

    /** The BillingPermissionsClient object to access its operations. */
    private final BillingPermissionsClient billingPermissions;

    /**
     * Gets the BillingPermissionsClient object to access its operations.
     *
     * @return the BillingPermissionsClient object.
     */
    public BillingPermissionsClient getBillingPermissions() {
        return this.billingPermissions;
    }

    /** The BillingSubscriptionsClient object to access its operations. */
    private final BillingSubscriptionsClient billingSubscriptions;

    /**
     * Gets the BillingSubscriptionsClient object to access its operations.
     *
     * @return the BillingSubscriptionsClient object.
     */
    public BillingSubscriptionsClient getBillingSubscriptions() {
        return this.billingSubscriptions;
    }

    /** The ProductsClient object to access its operations. */
    private final ProductsClient products;

    /**
     * Gets the ProductsClient object to access its operations.
     *
     * @return the ProductsClient object.
     */
    public ProductsClient getProducts() {
        return this.products;
    }

    /** The InvoicesClient object to access its operations. */
    private final InvoicesClient invoices;

    /**
     * Gets the InvoicesClient object to access its operations.
     *
     * @return the InvoicesClient object.
     */
    public InvoicesClient getInvoices() {
        return this.invoices;
    }

    /** The TransactionsClient object to access its operations. */
    private final TransactionsClient transactions;

    /**
     * Gets the TransactionsClient object to access its operations.
     *
     * @return the TransactionsClient object.
     */
    public TransactionsClient getTransactions() {
        return this.transactions;
    }

    /** The PoliciesClient object to access its operations. */
    private final PoliciesClient policies;

    /**
     * Gets the PoliciesClient object to access its operations.
     *
     * @return the PoliciesClient object.
     */
    public PoliciesClient getPolicies() {
        return this.policies;
    }

    /** The BillingPropertiesClient object to access its operations. */
    private final BillingPropertiesClient billingProperties;

    /**
     * Gets the BillingPropertiesClient object to access its operations.
     *
     * @return the BillingPropertiesClient object.
     */
    public BillingPropertiesClient getBillingProperties() {
        return this.billingProperties;
    }

    /** The BillingRoleDefinitionsClient object to access its operations. */
    private final BillingRoleDefinitionsClient billingRoleDefinitions;

    /**
     * Gets the BillingRoleDefinitionsClient object to access its operations.
     *
     * @return the BillingRoleDefinitionsClient object.
     */
    public BillingRoleDefinitionsClient getBillingRoleDefinitions() {
        return this.billingRoleDefinitions;
    }

    /** The BillingRoleAssignmentsClient object to access its operations. */
    private final BillingRoleAssignmentsClient billingRoleAssignments;

    /**
     * Gets the BillingRoleAssignmentsClient object to access its operations.
     *
     * @return the BillingRoleAssignmentsClient object.
     */
    public BillingRoleAssignmentsClient getBillingRoleAssignments() {
        return this.billingRoleAssignments;
    }

    /** The AgreementsClient object to access its operations. */
    private final AgreementsClient agreements;

    /**
     * Gets the AgreementsClient object to access its operations.
     *
     * @return the AgreementsClient object.
     */
    public AgreementsClient getAgreements() {
        return this.agreements;
    }

    /** The ReservationsClient object to access its operations. */
    private final ReservationsClient reservations;

    /**
     * Gets the ReservationsClient object to access its operations.
     *
     * @return the ReservationsClient object.
     */
    public ReservationsClient getReservations() {
        return this.reservations;
    }

    /** The EnrollmentAccountsClient object to access its operations. */
    private final EnrollmentAccountsClient enrollmentAccounts;

    /**
     * Gets the EnrollmentAccountsClient object to access its operations.
     *
     * @return the EnrollmentAccountsClient object.
     */
    public EnrollmentAccountsClient getEnrollmentAccounts() {
        return this.enrollmentAccounts;
    }

    /** The BillingPeriodsClient object to access its operations. */
    private final BillingPeriodsClient billingPeriods;

    /**
     * Gets the BillingPeriodsClient object to access its operations.
     *
     * @return the BillingPeriodsClient object.
     */
    public BillingPeriodsClient getBillingPeriods() {
        return this.billingPeriods;
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
     * Initializes an instance of BillingManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The ID that uniquely identifies an Azure subscription.
     * @param endpoint server parameter.
     */
    BillingManagementClientImpl(
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
        this.billingAccounts = new BillingAccountsClientImpl(this);
        this.address = new AddressClientImpl(this);
        this.availableBalances = new AvailableBalancesClientImpl(this);
        this.instructions = new InstructionsClientImpl(this);
        this.billingProfiles = new BillingProfilesClientImpl(this);
        this.customers = new CustomersClientImpl(this);
        this.invoiceSections = new InvoiceSectionsClientImpl(this);
        this.billingPermissions = new BillingPermissionsClientImpl(this);
        this.billingSubscriptions = new BillingSubscriptionsClientImpl(this);
        this.products = new ProductsClientImpl(this);
        this.invoices = new InvoicesClientImpl(this);
        this.transactions = new TransactionsClientImpl(this);
        this.policies = new PoliciesClientImpl(this);
        this.billingProperties = new BillingPropertiesClientImpl(this);
        this.billingRoleDefinitions = new BillingRoleDefinitionsClientImpl(this);
        this.billingRoleAssignments = new BillingRoleAssignmentsClientImpl(this);
        this.agreements = new AgreementsClientImpl(this);
        this.reservations = new ReservationsClientImpl(this);
        this.enrollmentAccounts = new EnrollmentAccountsClientImpl(this);
        this.billingPeriods = new BillingPeriodsClientImpl(this);
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

    private static final ClientLogger LOGGER = new ClientLogger(BillingManagementClientImpl.class);
}
