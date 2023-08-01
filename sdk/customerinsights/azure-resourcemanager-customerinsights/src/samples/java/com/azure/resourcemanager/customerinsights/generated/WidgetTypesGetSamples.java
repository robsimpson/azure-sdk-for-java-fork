// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.generated;

/** Samples for WidgetTypes Get. */
public final class WidgetTypesGetSamples {
    /*
     * x-ms-original-file: specification/customer-insights/resource-manager/Microsoft.CustomerInsights/stable/2017-04-26/examples/WidgetTypesGet.json
     */
    /**
     * Sample code: WidgetTypes_Get.
     *
     * @param manager Entry point to CustomerInsightsManager.
     */
    public static void widgetTypesGet(com.azure.resourcemanager.customerinsights.CustomerInsightsManager manager) {
        manager
            .widgetTypes()
            .getWithResponse("TestHubRG", "sdkTestHub", "ActivityGauge", com.azure.core.util.Context.NONE);
    }
}
