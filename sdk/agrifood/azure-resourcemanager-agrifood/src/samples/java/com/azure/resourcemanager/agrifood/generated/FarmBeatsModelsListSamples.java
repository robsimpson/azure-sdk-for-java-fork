// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.generated;

import com.azure.core.util.Context;

/** Samples for FarmBeatsModels List. */
public final class FarmBeatsModelsListSamples {
    /*
     * x-ms-original-file: specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2021-09-01-preview/examples/FarmBeatsModels_ListBySubscription.json
     */
    /**
     * Sample code: FarmBeatsModels_ListBySubscription.
     *
     * @param manager Entry point to AgriFoodManager.
     */
    public static void farmBeatsModelsListBySubscription(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.farmBeatsModels().list(null, null, Context.NONE);
    }
}
