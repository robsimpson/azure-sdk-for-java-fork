// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.resourcemanager.apimanagement.models.ResourceLocationDataContract;

/** Samples for Gateway CreateOrUpdate. */
public final class GatewayCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2021-08-01/examples/ApiManagementCreateGateway.json
     */
    /**
     * Sample code: ApiManagementCreateGateway.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementCreateGateway(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .gateways()
            .define("gw1")
            .withExistingService("rg1", "apimService1")
            .withLocationData(new ResourceLocationDataContract().withName("my location"))
            .withDescription("my gateway 1")
            .create();
    }
}
