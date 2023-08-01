// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

/** Samples for Consoles Get. */
public final class ConsolesGetSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2023-05-01-preview/examples/Consoles_Get.json
     */
    /**
     * Sample code: Get virtual machine console.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void getVirtualMachineConsole(com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager
            .consoles()
            .getWithResponse("resourceGroupName", "virtualMachineName", "default", com.azure.core.util.Context.NONE);
    }
}
