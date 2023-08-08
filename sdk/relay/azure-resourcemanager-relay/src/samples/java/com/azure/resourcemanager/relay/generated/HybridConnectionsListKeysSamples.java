// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated;

import com.azure.core.util.Context;

/** Samples for HybridConnections ListKeys. */
public final class HybridConnectionsListKeysSamples {
    /*
     * x-ms-original-file: specification/relay/resource-manager/Microsoft.Relay/stable/2017-04-01/examples/HybridConnection/RelayHybridConnectionAuthorizationRuleListKey.json
     */
    /**
     * Sample code: RelayHybridConnectionAuthorizationRuleListKey.
     *
     * @param manager Entry point to RelayManager.
     */
    public static void relayHybridConnectionAuthorizationRuleListKey(
        com.azure.resourcemanager.relay.RelayManager manager) {
        manager
            .hybridConnections()
            .listKeysWithResponse(
                "resourcegroup",
                "example-RelayNamespace-01",
                "example-Relay-Hybrid-01",
                "example-RelayAuthRules-01",
                Context.NONE);
    }
}
