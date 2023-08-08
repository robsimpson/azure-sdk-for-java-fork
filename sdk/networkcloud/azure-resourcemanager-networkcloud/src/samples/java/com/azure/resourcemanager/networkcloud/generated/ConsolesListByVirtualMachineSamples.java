// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

/** Samples for Consoles ListByVirtualMachine. */
public final class ConsolesListByVirtualMachineSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2023-05-01-preview/examples/Consoles_ListByVirtualMachine.json
     */
    /**
     * Sample code: List consoles of the virtual machine.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void listConsolesOfTheVirtualMachine(
        com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager
            .consoles()
            .listByVirtualMachine("resourceGroupName", "virtualMachineName", com.azure.core.util.Context.NONE);
    }
}
