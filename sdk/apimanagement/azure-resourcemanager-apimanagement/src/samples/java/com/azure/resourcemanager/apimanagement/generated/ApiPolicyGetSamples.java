// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.models.PolicyIdName;

/** Samples for ApiPolicy Get. */
public final class ApiPolicyGetSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2021-08-01/examples/ApiManagementGetApiPolicy.json
     */
    /**
     * Sample code: ApiManagementGetApiPolicy.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementGetApiPolicy(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .apiPolicies()
            .getWithResponse(
                "rg1", "apimService1", "5600b59475ff190048040001", PolicyIdName.POLICY, null, Context.NONE);
    }
}
