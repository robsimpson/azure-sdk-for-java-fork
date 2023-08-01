// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for RouteFilters Delete. */
public final class RouteFiltersDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-02-01/examples/RouteFilterDelete.json
     */
    /**
     * Sample code: RouteFilterDelete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void routeFilterDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getRouteFilters()
            .delete("rg1", "filterName", com.azure.core.util.Context.NONE);
    }
}
