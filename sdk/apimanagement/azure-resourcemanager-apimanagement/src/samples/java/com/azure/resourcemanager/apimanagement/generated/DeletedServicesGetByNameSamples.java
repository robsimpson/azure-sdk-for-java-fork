// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.Context;

/** Samples for DeletedServices GetByName. */
public final class DeletedServicesGetByNameSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2021-08-01/examples/ApiManagementGetDeletedServiceByName.json
     */
    /**
     * Sample code: ApiManagementGetDeletedServiceByName.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementGetDeletedServiceByName(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.deletedServices().getByNameWithResponse("apimService3", "westus", Context.NONE);
    }
}
