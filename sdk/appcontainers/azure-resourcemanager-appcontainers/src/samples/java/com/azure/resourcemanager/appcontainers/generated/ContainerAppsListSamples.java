// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

/** Samples for ContainerApps List. */
public final class ContainerAppsListSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/preview/2022-11-01-preview/examples/ContainerApps_ListBySubscription.json
     */
    /**
     * Sample code: List Container Apps by subscription.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listContainerAppsBySubscription(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.containerApps().list(com.azure.core.util.Context.NONE);
    }
}
