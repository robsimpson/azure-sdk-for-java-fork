// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.resourcemanager.apimanagement.models.AccessIdName;

/** Samples for TenantAccess Create. */
public final class TenantAccessCreateSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2021-08-01/examples/ApiManagementCreateTenantAccess.json
     */
    /**
     * Sample code: ApiManagementCreateTenantAccess.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementCreateTenantAccess(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .tenantAccess()
            .define(AccessIdName.ACCESS)
            .withExistingService("rg1", "apimService1")
            .withEnabled(true)
            .withIfMatch("*")
            .create();
    }
}
