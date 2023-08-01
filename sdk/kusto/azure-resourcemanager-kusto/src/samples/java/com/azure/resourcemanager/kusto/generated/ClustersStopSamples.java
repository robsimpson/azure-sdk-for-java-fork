// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

/** Samples for Clusters Stop. */
public final class ClustersStopSamples {
    /*
     * x-ms-original-file: specification/azure-kusto/resource-manager/Microsoft.Kusto/stable/2023-05-02/examples/KustoClustersStop.json
     */
    /**
     * Sample code: KustoClustersStop.
     *
     * @param manager Entry point to KustoManager.
     */
    public static void kustoClustersStop(com.azure.resourcemanager.kusto.KustoManager manager) {
        manager.clusters().stop("kustorptest", "kustoCluster2", com.azure.core.util.Context.NONE);
    }
}
