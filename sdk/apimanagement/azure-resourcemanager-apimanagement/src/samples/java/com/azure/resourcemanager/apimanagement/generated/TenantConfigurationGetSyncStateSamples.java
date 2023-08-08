// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.models.ConfigurationIdName;

/** Samples for TenantConfiguration GetSyncState. */
public final class TenantConfigurationGetSyncStateSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2021-08-01/examples/ApiManagementTenantAccessSyncState.json
     */
    /**
     * Sample code: ApiManagementTenantAccessSyncState.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementTenantAccessSyncState(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .tenantConfigurations()
            .getSyncStateWithResponse("rg1", "apimService1", ConfigurationIdName.CONFIGURATION, Context.NONE);
    }
}
