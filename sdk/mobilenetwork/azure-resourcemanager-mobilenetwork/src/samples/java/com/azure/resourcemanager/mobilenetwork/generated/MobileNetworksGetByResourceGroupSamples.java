// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

/** Samples for MobileNetworks GetByResourceGroup. */
public final class MobileNetworksGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/mobilenetwork/resource-manager/Microsoft.MobileNetwork/stable/2023-06-01/examples/MobileNetworkGet.json
     */
    /**
     * Sample code: Get mobile network.
     *
     * @param manager Entry point to MobileNetworkManager.
     */
    public static void getMobileNetwork(com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager) {
        manager
            .mobileNetworks()
            .getByResourceGroupWithResponse("rg1", "testMobileNetwork", com.azure.core.util.Context.NONE);
    }
}
