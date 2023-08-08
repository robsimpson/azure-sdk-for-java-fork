// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

/** Samples for L2Networks Delete. */
public final class L2NetworksDeleteSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2023-05-01-preview/examples/L2Networks_Delete.json
     */
    /**
     * Sample code: Delete L2 network.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void deleteL2Network(com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager.l2Networks().delete("resourceGroupName", "l2NetworkName", com.azure.core.util.Context.NONE);
    }
}
