// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/** Samples for DedicatedHosts Delete. */
public final class DedicatedHostsDeleteSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2023-03-01/examples/dedicatedHostExamples/DedicatedHost_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: DedicatedHost_Delete_MaximumSet_Gen.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void dedicatedHostDeleteMaximumSetGen(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getDedicatedHosts()
            .delete("rgcompute", "aaaaaa", "aaaaaaaaaaaaaaa", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2023-03-01/examples/dedicatedHostExamples/DedicatedHost_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: DedicatedHost_Delete_MinimumSet_Gen.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void dedicatedHostDeleteMinimumSetGen(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getDedicatedHosts()
            .delete("rgcompute", "aaaaaaaaaaaaaaa", "aaaaa", com.azure.core.util.Context.NONE);
    }
}
