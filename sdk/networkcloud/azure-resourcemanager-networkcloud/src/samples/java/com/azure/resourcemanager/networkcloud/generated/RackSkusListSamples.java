// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

/** Samples for RackSkus List. */
public final class RackSkusListSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2023-05-01-preview/examples/RackSkus_ListBySubscription.json
     */
    /**
     * Sample code: List rack SKUs for subscription.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void listRackSKUsForSubscription(com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager.rackSkus().list(com.azure.core.util.Context.NONE);
    }
}
