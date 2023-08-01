// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

/** Samples for BigDataPools ListByWorkspace. */
public final class BigDataPoolsListByWorkspaceSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/preview/2021-06-01-preview/examples/ListBigDataPoolsInWorkspace.json
     */
    /**
     * Sample code: List Big Data pools in a workspace.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void listBigDataPoolsInAWorkspace(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .bigDataPools()
            .listByWorkspace("ExampleResourceGroup", "ExampleWorkspace", com.azure.core.util.Context.NONE);
    }
}
