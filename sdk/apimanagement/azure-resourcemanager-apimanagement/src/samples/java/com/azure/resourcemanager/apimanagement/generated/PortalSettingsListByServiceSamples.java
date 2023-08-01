// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.Context;

/** Samples for PortalSettings ListByService. */
public final class PortalSettingsListByServiceSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2021-08-01/examples/ApiManagementListPortalSettings.json
     */
    /**
     * Sample code: ApiManagementListPortalSettings.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementListPortalSettings(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.portalSettings().listByServiceWithResponse("rg1", "apimService1", Context.NONE);
    }
}
