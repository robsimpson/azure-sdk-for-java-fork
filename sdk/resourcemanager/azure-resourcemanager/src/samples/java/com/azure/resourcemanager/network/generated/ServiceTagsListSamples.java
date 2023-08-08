// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for ServiceTags List. */
public final class ServiceTagsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-04-01/examples/ServiceTagsList.json
     */
    /**
     * Sample code: Get list of service tags.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getListOfServiceTags(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getServiceTags()
            .listWithResponse("westcentralus", com.azure.core.util.Context.NONE);
    }
}
