// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.generated;

/** Samples for Monitors ListByResourceGroup. */
public final class MonitorsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/logz/resource-manager/Microsoft.Logz/stable/2020-10-01/examples/Monitors_ListByResourceGroup.json
     */
    /**
     * Sample code: Monitors_ListByResourceGroup.
     *
     * @param manager Entry point to LogzManager.
     */
    public static void monitorsListByResourceGroup(com.azure.resourcemanager.logz.LogzManager manager) {
        manager.monitors().listByResourceGroup("myResourceGroup", com.azure.core.util.Context.NONE);
    }
}
