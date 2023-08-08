// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.generated;

/** Samples for SpatialAnchorsAccounts List. */
public final class SpatialAnchorsAccountsListSamples {
    /*
     * x-ms-original-file: specification/mixedreality/resource-manager/Microsoft.MixedReality/stable/2021-01-01/examples/spatial-anchors/GetBySubscription.json
     */
    /**
     * Sample code: List spatial anchors accounts by subscription.
     *
     * @param manager Entry point to MixedRealityManager.
     */
    public static void listSpatialAnchorsAccountsBySubscription(
        com.azure.resourcemanager.mixedreality.MixedRealityManager manager) {
        manager.spatialAnchorsAccounts().list(com.azure.core.util.Context.NONE);
    }
}
