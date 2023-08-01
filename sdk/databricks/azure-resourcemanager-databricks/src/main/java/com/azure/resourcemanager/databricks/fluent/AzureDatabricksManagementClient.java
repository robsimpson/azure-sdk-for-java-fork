// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for AzureDatabricksManagementClient class. */
public interface AzureDatabricksManagementClient {
    /**
     * Gets The ID of the target subscription.
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
     * Gets the WorkspacesClient object to access its operations.
     *
     * @return the WorkspacesClient object.
     */
    WorkspacesClient getWorkspaces();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     *
     * @return the PrivateLinkResourcesClient object.
     */
    PrivateLinkResourcesClient getPrivateLinkResources();

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the PrivateEndpointConnectionsClient object.
     */
    PrivateEndpointConnectionsClient getPrivateEndpointConnections();

    /**
     * Gets the OutboundNetworkDependenciesEndpointsClient object to access its operations.
     *
     * @return the OutboundNetworkDependenciesEndpointsClient object.
     */
    OutboundNetworkDependenciesEndpointsClient getOutboundNetworkDependenciesEndpoints();

    /**
     * Gets the VNetPeeringsClient object to access its operations.
     *
     * @return the VNetPeeringsClient object.
     */
    VNetPeeringsClient getVNetPeerings();

    /**
     * Gets the AccessConnectorsClient object to access its operations.
     *
     * @return the AccessConnectorsClient object.
     */
    AccessConnectorsClient getAccessConnectors();
}
