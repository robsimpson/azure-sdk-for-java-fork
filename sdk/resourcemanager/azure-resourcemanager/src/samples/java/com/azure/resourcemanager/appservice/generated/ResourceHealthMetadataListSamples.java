// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/** Samples for ResourceHealthMetadata List. */
public final class ResourceHealthMetadataListSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-09-01/examples/ListResourceHealthMetadataBySubscription.json
     */
    /**
     * Sample code: List ResourceHealthMetadata for a subscription.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listResourceHealthMetadataForASubscription(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps().manager().serviceClient().getResourceHealthMetadatas().list(com.azure.core.util.Context.NONE);
    }
}
