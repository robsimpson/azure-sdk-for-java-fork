// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for NatRules ListByVpnGateway. */
public final class NatRulesListByVpnGatewaySamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-04-01/examples/NatRuleList.json
     */
    /**
     * Sample code: NatRuleList.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void natRuleList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getNatRules()
            .listByVpnGateway("rg1", "gateway1", com.azure.core.util.Context.NONE);
    }
}
