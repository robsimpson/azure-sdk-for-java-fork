// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.models.PolicyIdName;

/** Samples for Policy GetEntityTag. */
public final class PolicyGetEntityTagSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2021-08-01/examples/ApiManagementHeadPolicy.json
     */
    /**
     * Sample code: ApiManagementHeadPolicy.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementHeadPolicy(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.policies().getEntityTagWithResponse("rg1", "apimService1", PolicyIdName.POLICY, Context.NONE);
    }
}
