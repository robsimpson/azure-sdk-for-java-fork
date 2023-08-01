// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.generated;

/** Samples for Skus GetNestedResourceTypeThird. */
public final class SkusGetNestedResourceTypeThirdSamples {
    /*
     * x-ms-original-file: specification/providerhub/resource-manager/Microsoft.ProviderHub/stable/2020-11-20/examples/Skus_GetNestedResourceTypeThird.json
     */
    /**
     * Sample code: Skus_GetNestedResourceTypeThird.
     *
     * @param manager Entry point to ProviderHubManager.
     */
    public static void skusGetNestedResourceTypeThird(
        com.azure.resourcemanager.providerhub.ProviderHubManager manager) {
        manager
            .skus()
            .getNestedResourceTypeThirdWithResponse(
                "Microsoft.Contoso",
                "testResourceType",
                "nestedResourceTypeFirst",
                "nestedResourceTypeSecond",
                "nestedResourceTypeThird",
                "testSku",
                com.azure.core.util.Context.NONE);
    }
}
