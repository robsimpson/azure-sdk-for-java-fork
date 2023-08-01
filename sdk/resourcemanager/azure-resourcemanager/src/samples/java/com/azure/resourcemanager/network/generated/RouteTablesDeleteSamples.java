// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for RouteTables Delete. */
public final class RouteTablesDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-02-01/examples/RouteTableDelete.json
     */
    /**
     * Sample code: Delete route table.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteRouteTable(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getRouteTables()
            .delete("rg1", "testrt", com.azure.core.util.Context.NONE);
    }
}
