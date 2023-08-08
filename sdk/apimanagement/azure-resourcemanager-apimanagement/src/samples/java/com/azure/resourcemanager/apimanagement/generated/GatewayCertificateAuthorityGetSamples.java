// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.Context;

/** Samples for GatewayCertificateAuthority Get. */
public final class GatewayCertificateAuthorityGetSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2021-08-01/examples/ApiManagementGetGatewayCertificateAuthority.json
     */
    /**
     * Sample code: ApiManagementGetGatewayCertificateAuthority.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementGetGatewayCertificateAuthority(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.gatewayCertificateAuthorities().getWithResponse("rg1", "apimService1", "gw1", "cert1", Context.NONE);
    }
}
