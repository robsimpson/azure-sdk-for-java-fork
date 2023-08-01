// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersFromContextPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryOptions;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.http.policy.ArmChallengeAuthenticationPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.maintenance.fluent.MaintenanceManagementClient;
import com.azure.resourcemanager.maintenance.implementation.ApplyUpdateForResourceGroupsImpl;
import com.azure.resourcemanager.maintenance.implementation.ApplyUpdatesImpl;
import com.azure.resourcemanager.maintenance.implementation.ConfigurationAssignmentsImpl;
import com.azure.resourcemanager.maintenance.implementation.MaintenanceConfigurationsForResourceGroupsImpl;
import com.azure.resourcemanager.maintenance.implementation.MaintenanceConfigurationsImpl;
import com.azure.resourcemanager.maintenance.implementation.MaintenanceManagementClientBuilder;
import com.azure.resourcemanager.maintenance.implementation.OperationsImpl;
import com.azure.resourcemanager.maintenance.implementation.PublicMaintenanceConfigurationsImpl;
import com.azure.resourcemanager.maintenance.implementation.UpdatesImpl;
import com.azure.resourcemanager.maintenance.models.ApplyUpdateForResourceGroups;
import com.azure.resourcemanager.maintenance.models.ApplyUpdates;
import com.azure.resourcemanager.maintenance.models.ConfigurationAssignments;
import com.azure.resourcemanager.maintenance.models.MaintenanceConfigurations;
import com.azure.resourcemanager.maintenance.models.MaintenanceConfigurationsForResourceGroups;
import com.azure.resourcemanager.maintenance.models.Operations;
import com.azure.resourcemanager.maintenance.models.PublicMaintenanceConfigurations;
import com.azure.resourcemanager.maintenance.models.Updates;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/** Entry point to MaintenanceManager. Azure Maintenance Management Client. */
public final class MaintenanceManager {
    private PublicMaintenanceConfigurations publicMaintenanceConfigurations;

    private ApplyUpdates applyUpdates;

    private ConfigurationAssignments configurationAssignments;

    private MaintenanceConfigurations maintenanceConfigurations;

    private MaintenanceConfigurationsForResourceGroups maintenanceConfigurationsForResourceGroups;

    private ApplyUpdateForResourceGroups applyUpdateForResourceGroups;

    private Operations operations;

    private Updates updates;

    private final MaintenanceManagementClient clientObject;

    private MaintenanceManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new MaintenanceManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of Maintenance service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the Maintenance service API instance.
     */
    public static MaintenanceManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of Maintenance service API entry point.
     *
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the Maintenance service API instance.
     */
    public static MaintenanceManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new MaintenanceManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create MaintenanceManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new MaintenanceManager.Configurable();
    }

    /** The Configurable allowing configurations to be set. */
    public static final class Configurable {
        private static final ClientLogger LOGGER = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private final List<String> scopes = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private RetryOptions retryOptions;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Adds the scope to permission sets.
         *
         * @param scope the scope.
         * @return the configurable object itself.
         */
        public Configurable withScope(String scope) {
            this.scopes.add(Objects.requireNonNull(scope, "'scope' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the retry options for the HTTP pipeline retry policy.
         *
         * <p>This setting has no effect, if retry policy is set via {@link #withRetryPolicy(RetryPolicy)}.
         *
         * @param retryOptions the retry options for the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryOptions(RetryOptions retryOptions) {
            this.retryOptions = Objects.requireNonNull(retryOptions, "'retryOptions' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval =
                Objects.requireNonNull(defaultPollInterval, "'defaultPollInterval' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw LOGGER
                    .logExceptionAsError(new IllegalArgumentException("'defaultPollInterval' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of Maintenance service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the Maintenance service API instance.
         */
        public MaintenanceManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.maintenance")
                .append("/")
                .append("1.0.0-beta.3");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder
                    .append(" (")
                    .append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.name"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version"))
                    .append("; auto-generated)");
            } else {
                userAgentBuilder.append(" (auto-generated)");
            }

            if (scopes.isEmpty()) {
                scopes.add(profile.getEnvironment().getManagementEndpoint() + "/.default");
            }
            if (retryPolicy == null) {
                if (retryOptions != null) {
                    retryPolicy = new RetryPolicy(retryOptions);
                } else {
                    retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
                }
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
            policies.add(new AddHeadersFromContextPolicy());
            policies.add(new RequestIdPolicy());
            policies
                .addAll(
                    this
                        .policies
                        .stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
                        .collect(Collectors.toList()));
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies.add(new ArmChallengeAuthenticationPolicy(credential, scopes.toArray(new String[0])));
            policies
                .addAll(
                    this
                        .policies
                        .stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
                        .collect(Collectors.toList()));
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                    .httpClient(httpClient)
                    .policies(policies.toArray(new HttpPipelinePolicy[0]))
                    .build();
            return new MaintenanceManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /**
     * Gets the resource collection API of PublicMaintenanceConfigurations.
     *
     * @return Resource collection API of PublicMaintenanceConfigurations.
     */
    public PublicMaintenanceConfigurations publicMaintenanceConfigurations() {
        if (this.publicMaintenanceConfigurations == null) {
            this.publicMaintenanceConfigurations =
                new PublicMaintenanceConfigurationsImpl(clientObject.getPublicMaintenanceConfigurations(), this);
        }
        return publicMaintenanceConfigurations;
    }

    /**
     * Gets the resource collection API of ApplyUpdates.
     *
     * @return Resource collection API of ApplyUpdates.
     */
    public ApplyUpdates applyUpdates() {
        if (this.applyUpdates == null) {
            this.applyUpdates = new ApplyUpdatesImpl(clientObject.getApplyUpdates(), this);
        }
        return applyUpdates;
    }

    /**
     * Gets the resource collection API of ConfigurationAssignments.
     *
     * @return Resource collection API of ConfigurationAssignments.
     */
    public ConfigurationAssignments configurationAssignments() {
        if (this.configurationAssignments == null) {
            this.configurationAssignments =
                new ConfigurationAssignmentsImpl(clientObject.getConfigurationAssignments(), this);
        }
        return configurationAssignments;
    }

    /**
     * Gets the resource collection API of MaintenanceConfigurations. It manages MaintenanceConfiguration.
     *
     * @return Resource collection API of MaintenanceConfigurations.
     */
    public MaintenanceConfigurations maintenanceConfigurations() {
        if (this.maintenanceConfigurations == null) {
            this.maintenanceConfigurations =
                new MaintenanceConfigurationsImpl(clientObject.getMaintenanceConfigurations(), this);
        }
        return maintenanceConfigurations;
    }

    /**
     * Gets the resource collection API of MaintenanceConfigurationsForResourceGroups.
     *
     * @return Resource collection API of MaintenanceConfigurationsForResourceGroups.
     */
    public MaintenanceConfigurationsForResourceGroups maintenanceConfigurationsForResourceGroups() {
        if (this.maintenanceConfigurationsForResourceGroups == null) {
            this.maintenanceConfigurationsForResourceGroups =
                new MaintenanceConfigurationsForResourceGroupsImpl(
                    clientObject.getMaintenanceConfigurationsForResourceGroups(), this);
        }
        return maintenanceConfigurationsForResourceGroups;
    }

    /**
     * Gets the resource collection API of ApplyUpdateForResourceGroups.
     *
     * @return Resource collection API of ApplyUpdateForResourceGroups.
     */
    public ApplyUpdateForResourceGroups applyUpdateForResourceGroups() {
        if (this.applyUpdateForResourceGroups == null) {
            this.applyUpdateForResourceGroups =
                new ApplyUpdateForResourceGroupsImpl(clientObject.getApplyUpdateForResourceGroups(), this);
        }
        return applyUpdateForResourceGroups;
    }

    /**
     * Gets the resource collection API of Operations.
     *
     * @return Resource collection API of Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /**
     * Gets the resource collection API of Updates.
     *
     * @return Resource collection API of Updates.
     */
    public Updates updates() {
        if (this.updates == null) {
            this.updates = new UpdatesImpl(clientObject.getUpdates(), this);
        }
        return updates;
    }

    /**
     * @return Wrapped service client MaintenanceManagementClient providing direct access to the underlying
     *     auto-generated API implementation, based on Azure REST API.
     */
    public MaintenanceManagementClient serviceClient() {
        return this.clientObject;
    }
}
