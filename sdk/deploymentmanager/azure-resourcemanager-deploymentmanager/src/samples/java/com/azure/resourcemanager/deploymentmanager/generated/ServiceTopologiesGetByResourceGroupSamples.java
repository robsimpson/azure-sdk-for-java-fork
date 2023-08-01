// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.generated;

/** Samples for ServiceTopologies GetByResourceGroup. */
public final class ServiceTopologiesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/deploymentmanager/resource-manager/Microsoft.DeploymentManager/preview/2019-11-01-preview/examples/servicetopology_get.json
     */
    /**
     * Sample code: Get topology.
     *
     * @param manager Entry point to DeploymentManager.
     */
    public static void getTopology(com.azure.resourcemanager.deploymentmanager.DeploymentManager manager) {
        manager
            .serviceTopologies()
            .getByResourceGroupWithResponse("myResourceGroup", "myTopology", com.azure.core.util.Context.NONE);
    }
}
