// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.Context;

/** Samples for PortalRevision Get. */
public final class PortalRevisionGetSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2021-08-01/examples/ApiManagementGetPortalRevision.json
     */
    /**
     * Sample code: ApiManagementGetPortalRevision.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementGetPortalRevision(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.portalRevisions().getWithResponse("rg1", "apimService1", "20201112101010", Context.NONE);
    }
}
