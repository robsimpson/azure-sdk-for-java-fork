// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

/** Samples for IntegrationRuntimes EnableInteractiveQuery. */
public final class IntegrationRuntimesEnableInteractiveQuerySamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/preview/2021-06-01-preview/examples/IntegrationRuntimes_EnableInteractiveQuery.json
     */
    /**
     * Sample code: Stop integration runtime.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void stopIntegrationRuntime(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .integrationRuntimes()
            .enableInteractiveQuery(
                "exampleResourceGroup",
                "exampleWorkspace",
                "exampleManagedIntegrationRuntime",
                com.azure.core.util.Context.NONE);
    }
}
