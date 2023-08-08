// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

/** Samples for PrivateLinkHubPrivateLinkResources Get. */
public final class PrivateLinkHubPrivateLinkResourcesGetSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/stable/2021-06-01/examples/GetPrivateLinkHubPrivateLinkResource.json
     */
    /**
     * Sample code: Get private link resources for private link hub.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void getPrivateLinkResourcesForPrivateLinkHub(
        com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .privateLinkHubPrivateLinkResources()
            .getWithResponse("ExampleResourceGroup", "ExamplePrivateLinkHub", "sql", com.azure.core.util.Context.NONE);
    }
}
