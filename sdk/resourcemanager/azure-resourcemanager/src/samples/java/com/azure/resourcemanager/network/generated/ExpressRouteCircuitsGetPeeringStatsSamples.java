// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for ExpressRouteCircuits GetPeeringStats. */
public final class ExpressRouteCircuitsGetPeeringStatsSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-04-01/examples/ExpressRouteCircuitPeeringStats.json
     */
    /**
     * Sample code: Get ExpressRoute Circuit Peering Traffic Stats.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getExpressRouteCircuitPeeringTrafficStats(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getExpressRouteCircuits()
            .getPeeringStatsWithResponse("rg1", "circuitName", "peeringName", com.azure.core.util.Context.NONE);
    }
}
