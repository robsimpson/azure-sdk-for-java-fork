// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

/** Samples for Workspaces ListOutboundNetworkDependenciesEndpoints. */
public final class WorkspacesListOutboundNetworkDependenciesEndpointsSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/stable/2022-10-01/examples/ExternalFQDN/get.json
     */
    /**
     * Sample code: ListOutboundNetworkDependenciesEndpoints.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void listOutboundNetworkDependenciesEndpoints(
        com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager
            .workspaces()
            .listOutboundNetworkDependenciesEndpointsWithResponse(
                "workspace-1234", "testworkspace", com.azure.core.util.Context.NONE);
    }
}
