// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

/** Samples for JobOperationResults Get. */
public final class JobOperationResultsGetSamples {
    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2023-02-01/examples/Common/CancelJobOperationResult.json
     */
    /**
     * Sample code: Cancel Job Operation Result.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void cancelJobOperationResult(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .jobOperationResults()
            .getWithResponse(
                "NetSDKTestRsVault",
                "SwaggerTestRg",
                "00000000-0000-0000-0000-000000000000",
                "00000000-0000-0000-0000-000000000000",
                com.azure.core.util.Context.NONE);
    }
}
