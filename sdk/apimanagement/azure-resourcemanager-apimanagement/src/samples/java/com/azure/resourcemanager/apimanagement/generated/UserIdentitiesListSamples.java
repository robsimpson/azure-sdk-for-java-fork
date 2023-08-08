// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.Context;

/** Samples for UserIdentities List. */
public final class UserIdentitiesListSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2021-08-01/examples/ApiManagementListUserIdentities.json
     */
    /**
     * Sample code: ApiManagementListUserIdentities.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementListUserIdentities(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.userIdentities().list("rg1", "apimService1", "57f2af53bb17172280f44057", Context.NONE);
    }
}
