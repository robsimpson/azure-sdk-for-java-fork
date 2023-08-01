// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated;

import com.azure.core.util.Context;

/** Samples for LogProfiles Get. */
public final class LogProfilesGetSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/stable/2016-03-01/examples/getLogProfile.json
     */
    /**
     * Sample code: Get log profile.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getLogProfile(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.diagnosticSettings().manager().serviceClient().getLogProfiles().getWithResponse("default", Context.NONE);
    }
}
