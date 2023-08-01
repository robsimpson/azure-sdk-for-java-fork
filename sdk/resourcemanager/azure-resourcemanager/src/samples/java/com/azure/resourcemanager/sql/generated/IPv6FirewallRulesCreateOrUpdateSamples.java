// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.fluent.models.IPv6FirewallRuleInner;

/** Samples for IPv6FirewallRules CreateOrUpdate. */
public final class IPv6FirewallRulesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/IPv6FirewallRuleUpdate.json
     */
    /**
     * Sample code: Update an IPv6 firewall rule max/min.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateAnIPv6FirewallRuleMaxMin(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getIPv6FirewallRules()
            .createOrUpdateWithResponse(
                "firewallrulecrudtest-12",
                "firewallrulecrudtest-6285",
                "firewallrulecrudtest-3927",
                new IPv6FirewallRuleInner()
                    .withStartIPv6Address("0000:0000:0000:0000:0000:ffff:0000:0001")
                    .withEndIPv6Address("0000:0000:0000:0000:0000:ffff:0000:0001"),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/IPv6FirewallRuleCreate.json
     */
    /**
     * Sample code: Create an IPv6 firewall rule max/min.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createAnIPv6FirewallRuleMaxMin(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getIPv6FirewallRules()
            .createOrUpdateWithResponse(
                "firewallrulecrudtest-12",
                "firewallrulecrudtest-6285",
                "firewallrulecrudtest-5370",
                new IPv6FirewallRuleInner()
                    .withStartIPv6Address("0000:0000:0000:0000:0000:ffff:0000:0003")
                    .withEndIPv6Address("0000:0000:0000:0000:0000:ffff:0000:0003"),
                Context.NONE);
    }
}
