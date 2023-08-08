// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.Context;

/** Samples for TenantAccess ListByService. */
public final class TenantAccessListByServiceSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2021-08-01/examples/ApiManagementListTenantAccess.json
     */
    /**
     * Sample code: ApiManagementListTenantAccess.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementListTenantAccess(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.tenantAccess().listByService("rg1", "apimService1", null, Context.NONE);
    }
}
