// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

/** Samples for KustoPoolDatabasePrincipalAssignments List. */
public final class KustoPoolDatabasePrincipalAssignmentsListSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/preview/2021-06-01-preview/examples/KustoPoolDatabasePrincipalAssignmentsList.json
     */
    /**
     * Sample code: KustoPoolDatabasePrincipalAssignmentsList.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void kustoPoolDatabasePrincipalAssignmentsList(
        com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .kustoPoolDatabasePrincipalAssignments()
            .list(
                "synapseWorkspaceName",
                "kustoclusterrptest4",
                "Kustodatabase8",
                "kustorptest",
                com.azure.core.util.Context.NONE);
    }
}
