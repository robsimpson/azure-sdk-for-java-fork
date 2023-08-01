// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.resourcemanager.networkcloud.models.BareMetalMachineCordonParameters;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineEvacuate;

/** Samples for BareMetalMachines Cordon. */
public final class BareMetalMachinesCordonSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2023-05-01-preview/examples/BareMetalMachines_Cordon.json
     */
    /**
     * Sample code: Cordon bare metal machine.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void cordonBareMetalMachine(com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager
            .bareMetalMachines()
            .cordon(
                "resourceGroupName",
                "bareMetalMachineName",
                new BareMetalMachineCordonParameters().withEvacuate(BareMetalMachineEvacuate.TRUE),
                com.azure.core.util.Context.NONE);
    }
}
