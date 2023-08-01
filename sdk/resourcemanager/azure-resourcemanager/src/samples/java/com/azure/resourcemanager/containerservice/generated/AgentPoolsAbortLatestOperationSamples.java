// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

/** Samples for AgentPools AbortLatestOperation. */
public final class AgentPoolsAbortLatestOperationSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2023-06-01/examples/AgentPoolsAbortOperation.json
     */
    /**
     * Sample code: Abort operation on agent pool.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void abortOperationOnAgentPool(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .kubernetesClusters()
            .manager()
            .serviceClient()
            .getAgentPools()
            .abortLatestOperation("rg1", "clustername1", "agentpool1", com.azure.core.util.Context.NONE);
    }
}
