// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

/** Samples for AttachedDatabaseConfigurations Get. */
public final class AttachedDatabaseConfigurationsGetSamples {
    /*
     * x-ms-original-file: specification/azure-kusto/resource-manager/Microsoft.Kusto/stable/2023-05-02/examples/KustoAttachedDatabaseConfigurationsGet.json
     */
    /**
     * Sample code: AttachedDatabaseConfigurationsGet.
     *
     * @param manager Entry point to KustoManager.
     */
    public static void attachedDatabaseConfigurationsGet(com.azure.resourcemanager.kusto.KustoManager manager) {
        manager
            .attachedDatabaseConfigurations()
            .getWithResponse(
                "kustorptest", "kustoCluster2", "attachedDatabaseConfigurationsTest", com.azure.core.util.Context.NONE);
    }
}
