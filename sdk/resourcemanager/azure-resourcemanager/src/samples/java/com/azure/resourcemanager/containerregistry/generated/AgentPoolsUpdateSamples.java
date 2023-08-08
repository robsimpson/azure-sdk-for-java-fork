// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

import com.azure.resourcemanager.containerregistry.models.AgentPoolUpdateParameters;

/** Samples for AgentPools Update. */
public final class AgentPoolsUpdateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/AgentPoolsUpdate.json
     */
    /**
     * Sample code: AgentPools_Update.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void agentPoolsUpdate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .containerRegistries()
            .manager()
            .serviceClient()
            .getAgentPools()
            .update(
                "myResourceGroup",
                "myRegistry",
                "myAgentPool",
                new AgentPoolUpdateParameters().withCount(1),
                com.azure.core.util.Context.NONE);
    }
}
