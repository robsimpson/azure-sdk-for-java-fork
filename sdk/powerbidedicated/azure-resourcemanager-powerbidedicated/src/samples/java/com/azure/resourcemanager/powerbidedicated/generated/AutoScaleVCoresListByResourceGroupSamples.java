// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerbidedicated.generated;

/** Samples for AutoScaleVCores ListByResourceGroup. */
public final class AutoScaleVCoresListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/powerbidedicated/resource-manager/Microsoft.PowerBIdedicated/stable/2021-01-01/examples/listAutoScaleVCoresInResourceGroup.json
     */
    /**
     * Sample code: List auto scale v-cores in resource group.
     *
     * @param manager Entry point to PowerBIDedicatedManager.
     */
    public static void listAutoScaleVCoresInResourceGroup(
        com.azure.resourcemanager.powerbidedicated.PowerBIDedicatedManager manager) {
        manager.autoScaleVCores().listByResourceGroup("TestRG", com.azure.core.util.Context.NONE);
    }
}
