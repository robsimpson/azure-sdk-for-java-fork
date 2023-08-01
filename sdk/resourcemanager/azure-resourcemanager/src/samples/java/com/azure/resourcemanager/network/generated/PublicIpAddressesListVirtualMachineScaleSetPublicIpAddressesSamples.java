// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for PublicIpAddresses ListVirtualMachineScaleSetPublicIpAddresses. */
public final class PublicIpAddressesListVirtualMachineScaleSetPublicIpAddressesSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-02-01/examples/VmssPublicIpListAll.json
     */
    /**
     * Sample code: ListVMSSPublicIP.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listVMSSPublicIP(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getPublicIpAddresses()
            .listVirtualMachineScaleSetPublicIpAddresses("vmss-tester", "vmss1", com.azure.core.util.Context.NONE);
    }
}
