// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

/** Samples for ApplicationPackage List. */
public final class ApplicationPackageListSamples {
    /*
     * x-ms-original-file: specification/batch/resource-manager/Microsoft.Batch/stable/2023-05-01/examples/ApplicationPackageList.json
     */
    /**
     * Sample code: ApplicationPackageList.
     *
     * @param manager Entry point to BatchManager.
     */
    public static void applicationPackageList(com.azure.resourcemanager.batch.BatchManager manager) {
        manager
            .applicationPackages()
            .list("default-azurebatch-japaneast", "sampleacct", "app1", null, com.azure.core.util.Context.NONE);
    }
}
