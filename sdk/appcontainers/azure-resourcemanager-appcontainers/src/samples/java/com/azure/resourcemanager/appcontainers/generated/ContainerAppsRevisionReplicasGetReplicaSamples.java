// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

/** Samples for ContainerAppsRevisionReplicas GetReplica. */
public final class ContainerAppsRevisionReplicasGetReplicaSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/preview/2022-11-01-preview/examples/Replicas_Get.json
     */
    /**
     * Sample code: Get Container App's revision replica.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getContainerAppSRevisionReplica(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .containerAppsRevisionReplicas()
            .getReplicaWithResponse(
                "workerapps-rg-xj",
                "myapp",
                "myapp--0wlqy09",
                "myapp--0wlqy09-5d9774cff-5wnd8",
                com.azure.core.util.Context.NONE);
    }
}
