// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.baremetalinfrastructure.generated;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/baremetalinfrastructure/resource-manager/Microsoft.BareMetalInfrastructure/stable/2021-08-09/examples/AzureBareMetalOperations_List.json
     */
    /**
     * Sample code: List all management operations supported by the AzureBareMetal RP.
     *
     * @param manager Entry point to BareMetalInfrastructureManager.
     */
    public static void listAllManagementOperationsSupportedByTheAzureBareMetalRP(
        com.azure.resourcemanager.baremetalinfrastructure.BareMetalInfrastructureManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
