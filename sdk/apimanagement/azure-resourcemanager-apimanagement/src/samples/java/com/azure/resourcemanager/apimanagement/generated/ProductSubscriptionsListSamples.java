// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.Context;

/** Samples for ProductSubscriptions List. */
public final class ProductSubscriptionsListSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2021-08-01/examples/ApiManagementListProductSubscriptions.json
     */
    /**
     * Sample code: ApiManagementListProductSubscriptions.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementListProductSubscriptions(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .productSubscriptions()
            .list("rg1", "apimService1", "5600b57e7e8880006a060002", null, null, null, Context.NONE);
    }
}
