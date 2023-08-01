// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

/** Samples for PrivateClouds RotateNsxtPassword. */
public final class PrivateCloudsRotateNsxtPasswordSamples {
    /*
     * x-ms-original-file: specification/vmware/resource-manager/Microsoft.AVS/stable/2022-05-01/examples/PrivateClouds_RotateNsxtPassword.json
     */
    /**
     * Sample code: PrivateClouds_RotateNsxtPassword.
     *
     * @param manager Entry point to AvsManager.
     */
    public static void privateCloudsRotateNsxtPassword(com.azure.resourcemanager.avs.AvsManager manager) {
        manager.privateClouds().rotateNsxtPassword("group1", "cloud1", com.azure.core.util.Context.NONE);
    }
}
