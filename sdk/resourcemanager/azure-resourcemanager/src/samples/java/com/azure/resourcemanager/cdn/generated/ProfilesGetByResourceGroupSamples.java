// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

import com.azure.core.util.Context;

/** Samples for Profiles GetByResourceGroup. */
public final class ProfilesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2021-06-01/examples/Profiles_Get.json
     */
    /**
     * Sample code: Profiles_Get.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void profilesGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cdnProfiles()
            .manager()
            .serviceClient()
            .getProfiles()
            .getByResourceGroupWithResponse("RG", "profile1", Context.NONE);
    }
}
