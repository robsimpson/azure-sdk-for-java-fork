// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.cdn.models.AfdOriginUpdateParameters;
import com.azure.resourcemanager.cdn.models.EnabledState;

/** Samples for AfdOrigins Update. */
public final class AfdOriginsUpdateSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2021-06-01/examples/AFDOrigins_Update.json
     */
    /**
     * Sample code: AFDOrigins_Update.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void aFDOriginsUpdate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cdnProfiles()
            .manager()
            .serviceClient()
            .getAfdOrigins()
            .update(
                "RG",
                "profile1",
                "origingroup1",
                "origin1",
                new AfdOriginUpdateParameters()
                    .withHostname("host1.blob.core.windows.net")
                    .withHttpPort(80)
                    .withHttpsPort(443)
                    .withEnabledState(EnabledState.ENABLED),
                Context.NONE);
    }
}
