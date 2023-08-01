// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.util.Context;

/** Samples for Components ListByResourceGroup. */
public final class ComponentsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2020-02-02/examples/ComponentsListByResourceGroup.json
     */
    /**
     * Sample code: ComponentListByResourceGroup.
     *
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void componentListByResourceGroup(
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager.components().listByResourceGroup("my-resource-group", Context.NONE);
    }
}
