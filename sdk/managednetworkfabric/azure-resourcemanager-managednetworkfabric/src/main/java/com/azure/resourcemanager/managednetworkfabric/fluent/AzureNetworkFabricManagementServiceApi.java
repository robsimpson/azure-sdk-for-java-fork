// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for AzureNetworkFabricManagementServiceApi class. */
public interface AzureNetworkFabricManagementServiceApi {
    /**
     * Gets The ID of the target subscription. The value must be an UUID.
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
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

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
     * Gets the AccessControlListsClient object to access its operations.
     *
     * @return the AccessControlListsClient object.
     */
    AccessControlListsClient getAccessControlLists();

    /**
     * Gets the InternetGatewaysClient object to access its operations.
     *
     * @return the InternetGatewaysClient object.
     */
    InternetGatewaysClient getInternetGateways();

    /**
     * Gets the InternetGatewayRulesClient object to access its operations.
     *
     * @return the InternetGatewayRulesClient object.
     */
    InternetGatewayRulesClient getInternetGatewayRules();

    /**
     * Gets the IpCommunitiesClient object to access its operations.
     *
     * @return the IpCommunitiesClient object.
     */
    IpCommunitiesClient getIpCommunities();

    /**
     * Gets the IpExtendedCommunitiesClient object to access its operations.
     *
     * @return the IpExtendedCommunitiesClient object.
     */
    IpExtendedCommunitiesClient getIpExtendedCommunities();

    /**
     * Gets the IpPrefixesClient object to access its operations.
     *
     * @return the IpPrefixesClient object.
     */
    IpPrefixesClient getIpPrefixes();

    /**
     * Gets the L2IsolationDomainsClient object to access its operations.
     *
     * @return the L2IsolationDomainsClient object.
     */
    L2IsolationDomainsClient getL2IsolationDomains();

    /**
     * Gets the L3IsolationDomainsClient object to access its operations.
     *
     * @return the L3IsolationDomainsClient object.
     */
    L3IsolationDomainsClient getL3IsolationDomains();

    /**
     * Gets the InternalNetworksClient object to access its operations.
     *
     * @return the InternalNetworksClient object.
     */
    InternalNetworksClient getInternalNetworks();

    /**
     * Gets the ExternalNetworksClient object to access its operations.
     *
     * @return the ExternalNetworksClient object.
     */
    ExternalNetworksClient getExternalNetworks();

    /**
     * Gets the NeighborGroupsClient object to access its operations.
     *
     * @return the NeighborGroupsClient object.
     */
    NeighborGroupsClient getNeighborGroups();

    /**
     * Gets the NetworkDeviceSkusClient object to access its operations.
     *
     * @return the NetworkDeviceSkusClient object.
     */
    NetworkDeviceSkusClient getNetworkDeviceSkus();

    /**
     * Gets the NetworkDevicesClient object to access its operations.
     *
     * @return the NetworkDevicesClient object.
     */
    NetworkDevicesClient getNetworkDevices();

    /**
     * Gets the NetworkInterfacesClient object to access its operations.
     *
     * @return the NetworkInterfacesClient object.
     */
    NetworkInterfacesClient getNetworkInterfaces();

    /**
     * Gets the NetworkFabricControllersClient object to access its operations.
     *
     * @return the NetworkFabricControllersClient object.
     */
    NetworkFabricControllersClient getNetworkFabricControllers();

    /**
     * Gets the NetworkFabricSkusClient object to access its operations.
     *
     * @return the NetworkFabricSkusClient object.
     */
    NetworkFabricSkusClient getNetworkFabricSkus();

    /**
     * Gets the NetworkFabricsClient object to access its operations.
     *
     * @return the NetworkFabricsClient object.
     */
    NetworkFabricsClient getNetworkFabrics();

    /**
     * Gets the NetworkToNetworkInterconnectsClient object to access its operations.
     *
     * @return the NetworkToNetworkInterconnectsClient object.
     */
    NetworkToNetworkInterconnectsClient getNetworkToNetworkInterconnects();

    /**
     * Gets the NetworkPacketBrokersClient object to access its operations.
     *
     * @return the NetworkPacketBrokersClient object.
     */
    NetworkPacketBrokersClient getNetworkPacketBrokers();

    /**
     * Gets the NetworkRacksClient object to access its operations.
     *
     * @return the NetworkRacksClient object.
     */
    NetworkRacksClient getNetworkRacks();

    /**
     * Gets the NetworkTapRulesClient object to access its operations.
     *
     * @return the NetworkTapRulesClient object.
     */
    NetworkTapRulesClient getNetworkTapRules();

    /**
     * Gets the NetworkTapsClient object to access its operations.
     *
     * @return the NetworkTapsClient object.
     */
    NetworkTapsClient getNetworkTaps();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the RoutePoliciesClient object to access its operations.
     *
     * @return the RoutePoliciesClient object.
     */
    RoutePoliciesClient getRoutePolicies();
}
