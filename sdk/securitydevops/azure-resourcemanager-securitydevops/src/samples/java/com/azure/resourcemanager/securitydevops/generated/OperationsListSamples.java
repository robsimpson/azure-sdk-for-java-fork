// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securitydevops.generated;

import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/securitydevops/resource-manager/Microsoft.SecurityDevOps/preview/2022-09-01-preview/examples/OperationsList.json
     */
    /**
     * Sample code: Operations_List.
     *
     * @param manager Entry point to SecurityDevOpsManager.
     */
    public static void operationsList(com.azure.resourcemanager.securitydevops.SecurityDevOpsManager manager) {
        manager.operations().list(Context.NONE);
    }
}
