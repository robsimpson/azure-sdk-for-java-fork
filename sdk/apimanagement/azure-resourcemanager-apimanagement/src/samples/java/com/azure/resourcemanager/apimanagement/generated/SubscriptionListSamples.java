// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.Context;

/** Samples for Subscription List. */
public final class SubscriptionListSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2021-08-01/examples/ApiManagementListSubscriptions.json
     */
    /**
     * Sample code: ApiManagementListSubscriptions.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementListSubscriptions(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.subscriptions().list("rg1", "apimService1", null, null, null, Context.NONE);
    }
}
