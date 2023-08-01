// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.generated;

/** Samples for Hubs ListByResourceGroup. */
public final class HubsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/customer-insights/resource-manager/Microsoft.CustomerInsights/stable/2017-04-26/examples/HubsListByResourceGroup.json
     */
    /**
     * Sample code: Hubs_ListByResourceGroup.
     *
     * @param manager Entry point to CustomerInsightsManager.
     */
    public static void hubsListByResourceGroup(
        com.azure.resourcemanager.customerinsights.CustomerInsightsManager manager) {
        manager.hubs().listByResourceGroup("TestHubRG", com.azure.core.util.Context.NONE);
    }
}
