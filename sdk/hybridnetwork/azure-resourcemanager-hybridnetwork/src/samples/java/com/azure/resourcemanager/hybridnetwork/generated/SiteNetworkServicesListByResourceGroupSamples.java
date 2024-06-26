// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

/**
 * Samples for SiteNetworkServices ListByResourceGroup.
 */
public final class SiteNetworkServicesListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/hybridnetwork/resource-manager/Microsoft.HybridNetwork/stable/2023-09-01/examples/
     * SiteNetworkServiceListByResourceGroup.json
     */
    /**
     * Sample code: List all network sites.
     * 
     * @param manager Entry point to HybridNetworkManager.
     */
    public static void listAllNetworkSites(com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager) {
        manager.siteNetworkServices().listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
