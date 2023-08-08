// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/** Samples for WebApps GetScmAllowed. */
public final class WebAppsGetScmAllowedSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-09-01/examples/GetPublishingCredentialsPolicy.json
     */
    /**
     * Sample code: Get SCM Allowed.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getSCMAllowed(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getWebApps()
            .getScmAllowedWithResponse("rg", "testSite", com.azure.core.util.Context.NONE);
    }
}
