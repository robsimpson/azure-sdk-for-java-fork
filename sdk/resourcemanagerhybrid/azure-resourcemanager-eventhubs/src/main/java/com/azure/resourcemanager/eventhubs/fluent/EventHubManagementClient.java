// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for EventHubManagementClient class. */
public interface EventHubManagementClient {
    /**
     * Gets Subscription credentials that uniquely identify a Microsoft Azure subscription. The subscription ID forms
     * part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the ClustersClient object to access its operations.
     *
     * @return the ClustersClient object.
     */
    ClustersClient getClusters();

    /**
     * Gets the NamespacesClient object to access its operations.
     *
     * @return the NamespacesClient object.
     */
    NamespacesClient getNamespaces();

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the PrivateEndpointConnectionsClient object.
     */
    PrivateEndpointConnectionsClient getPrivateEndpointConnections();

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     *
     * @return the PrivateLinkResourcesClient object.
     */
    PrivateLinkResourcesClient getPrivateLinkResources();

    /**
     * Gets the DisasterRecoveryConfigsClient object to access its operations.
     *
     * @return the DisasterRecoveryConfigsClient object.
     */
    DisasterRecoveryConfigsClient getDisasterRecoveryConfigs();

    /**
     * Gets the EventHubsClient object to access its operations.
     *
     * @return the EventHubsClient object.
     */
    EventHubsClient getEventHubs();

    /**
     * Gets the ConsumerGroupsClient object to access its operations.
     *
     * @return the ConsumerGroupsClient object.
     */
    ConsumerGroupsClient getConsumerGroups();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the RegionsClient object to access its operations.
     *
     * @return the RegionsClient object.
     */
    RegionsClient getRegions();
}
