// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.generated;

/** Samples for FirewallRules ListByAccount. */
public final class FirewallRulesListByAccountSamples {
    /*
     * x-ms-original-file: specification/datalake-analytics/resource-manager/Microsoft.DataLakeAnalytics/stable/2016-11-01/examples/FirewallRules_ListByAccount.json
     */
    /**
     * Sample code: Lists the Data Lake Analytics firewall rules.
     *
     * @param manager Entry point to DataLakeAnalyticsManager.
     */
    public static void listsTheDataLakeAnalyticsFirewallRules(
        com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager manager) {
        manager.firewallRules().listByAccount("contosorg", "contosoadla", com.azure.core.util.Context.NONE);
    }
}
