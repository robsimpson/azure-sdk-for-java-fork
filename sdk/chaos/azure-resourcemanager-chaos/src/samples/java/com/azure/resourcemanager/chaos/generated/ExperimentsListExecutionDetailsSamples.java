// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

/** Samples for Experiments ListExecutionDetails. */
public final class ExperimentsListExecutionDetailsSamples {
    /*
     * x-ms-original-file: specification/chaos/resource-manager/Microsoft.Chaos/preview/2023-04-15-preview/examples/ListExperimentExecutionsDetails.json
     */
    /**
     * Sample code: List experiment executions details.
     *
     * @param manager Entry point to ChaosManager.
     */
    public static void listExperimentExecutionsDetails(com.azure.resourcemanager.chaos.ChaosManager manager) {
        manager.experiments().listExecutionDetails("exampleRG", "exampleExperiment", com.azure.core.util.Context.NONE);
    }
}
