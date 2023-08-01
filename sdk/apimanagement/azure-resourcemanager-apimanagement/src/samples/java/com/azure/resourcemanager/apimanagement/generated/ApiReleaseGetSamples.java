// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.Context;

/** Samples for ApiRelease Get. */
public final class ApiReleaseGetSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2021-08-01/examples/ApiManagementGetApiRelease.json
     */
    /**
     * Sample code: ApiManagementGetApiRelease.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementGetApiRelease(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.apiReleases().getWithResponse("rg1", "apimService1", "a1", "5a7cb545298324c53224a799", Context.NONE);
    }
}
