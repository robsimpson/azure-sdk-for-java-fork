// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.models.NotificationName;

/** Samples for Notification Get. */
public final class NotificationGetSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2021-08-01/examples/ApiManagementGetNotification.json
     */
    /**
     * Sample code: ApiManagementGetNotification.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementGetNotification(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .notifications()
            .getWithResponse(
                "rg1", "apimService1", NotificationName.REQUEST_PUBLISHER_NOTIFICATION_MESSAGE, Context.NONE);
    }
}
