// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

/** Samples for ReplicationJobs Cancel. */
public final class ReplicationJobsCancelSamples {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-10-01/examples/ReplicationJobs_Cancel.json
     */
    /**
     * Sample code: Cancels the specified job.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void cancelsTheSpecifiedJob(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager
            .replicationJobs()
            .cancel(
                "vault1", "resourceGroupPS1", "2653c648-fc72-4316-86f3-fdf8eaa0066b", com.azure.core.util.Context.NONE);
    }
}
