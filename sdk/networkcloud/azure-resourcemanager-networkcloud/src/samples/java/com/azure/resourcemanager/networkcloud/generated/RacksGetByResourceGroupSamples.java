// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

/** Samples for Racks GetByResourceGroup. */
public final class RacksGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2023-05-01-preview/examples/Racks_Get.json
     */
    /**
     * Sample code: Get rack.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void getRack(com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager
            .racks()
            .getByResourceGroupWithResponse("resourceGroupName", "rackName", com.azure.core.util.Context.NONE);
    }
}
