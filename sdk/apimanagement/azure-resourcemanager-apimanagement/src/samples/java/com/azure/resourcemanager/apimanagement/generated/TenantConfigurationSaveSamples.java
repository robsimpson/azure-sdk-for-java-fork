// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.models.ConfigurationIdName;
import com.azure.resourcemanager.apimanagement.models.SaveConfigurationParameter;

/** Samples for TenantConfiguration Save. */
public final class TenantConfigurationSaveSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2021-08-01/examples/ApiManagementTenantConfigurationSave.json
     */
    /**
     * Sample code: ApiManagementTenantConfigurationSave.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementTenantConfigurationSave(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .tenantConfigurations()
            .save(
                "rg1",
                "apimService1",
                ConfigurationIdName.CONFIGURATION,
                new SaveConfigurationParameter().withBranch("master"),
                Context.NONE);
    }
}
