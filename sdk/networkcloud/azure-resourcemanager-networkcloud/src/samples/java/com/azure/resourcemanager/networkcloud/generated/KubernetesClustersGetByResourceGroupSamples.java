// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

/** Samples for KubernetesClusters GetByResourceGroup. */
public final class KubernetesClustersGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2023-05-01-preview/examples/KubernetesClusters_Get.json
     */
    /**
     * Sample code: Get Kubernetes cluster.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void getKubernetesCluster(com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager
            .kubernetesClusters()
            .getByResourceGroupWithResponse(
                "resourceGroupName", "kubernetesClusterName", com.azure.core.util.Context.NONE);
    }
}
