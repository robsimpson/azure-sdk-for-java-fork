// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.models.AssociationContract;
import com.azure.resourcemanager.apimanagement.models.ProvisioningState;

/** Samples for GatewayApi CreateOrUpdate. */
public final class GatewayApiCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2021-08-01/examples/ApiManagementCreateGatewayApi.json
     */
    /**
     * Sample code: ApiManagementCreateGatewayApi.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementCreateGatewayApi(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .gatewayApis()
            .createOrUpdateWithResponse(
                "rg1",
                "apimService1",
                "gw1",
                "echo-api",
                new AssociationContract().withProvisioningState(ProvisioningState.CREATED),
                Context.NONE);
    }
}
