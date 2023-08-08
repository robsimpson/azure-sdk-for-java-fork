// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

/** Samples for ProviderInstances List. */
public final class ProviderInstancesListSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/stable/2023-04-01/examples/workloadmonitor/ProviderInstances_List.json
     */
    /**
     * Sample code: List all SAP monitors providers in a subscription.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void listAllSAPMonitorsProvidersInASubscription(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.providerInstances().list("myResourceGroup", "mySapMonitor", com.azure.core.util.Context.NONE);
    }
}
