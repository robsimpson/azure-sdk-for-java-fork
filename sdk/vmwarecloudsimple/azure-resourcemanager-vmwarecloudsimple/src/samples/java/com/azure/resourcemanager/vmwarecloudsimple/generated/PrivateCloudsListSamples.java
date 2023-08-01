// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.generated;

/** Samples for PrivateClouds List. */
public final class PrivateCloudsListSamples {
    /*
     * x-ms-original-file: specification/vmwarecloudsimple/resource-manager/Microsoft.VMwareCloudSimple/stable/2019-04-01/examples/ListPrivateCloudInLocation.json
     */
    /**
     * Sample code: ListPrivateCloudInLocation.
     *
     * @param manager Entry point to VMwareCloudSimpleManager.
     */
    public static void listPrivateCloudInLocation(
        com.azure.resourcemanager.vmwarecloudsimple.VMwareCloudSimpleManager manager) {
        manager.privateClouds().list("eastus", com.azure.core.util.Context.NONE);
    }
}
