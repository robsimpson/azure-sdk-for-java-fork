// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

/** Samples for Devices GetByResourceGroup. */
public final class DevicesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/databoxedge/resource-manager/Microsoft.DataBoxEdge/stable/2019-08-01/examples/DataBoxEdgeDeviceGetByName.json
     */
    /**
     * Sample code: DataBoxEdgeDeviceGetByName.
     *
     * @param manager Entry point to DataBoxEdgeManager.
     */
    public static void dataBoxEdgeDeviceGetByName(com.azure.resourcemanager.databoxedge.DataBoxEdgeManager manager) {
        manager
            .devices()
            .getByResourceGroupWithResponse(
                "GroupForEdgeAutomation", "testedgedevice", com.azure.core.util.Context.NONE);
    }
}
