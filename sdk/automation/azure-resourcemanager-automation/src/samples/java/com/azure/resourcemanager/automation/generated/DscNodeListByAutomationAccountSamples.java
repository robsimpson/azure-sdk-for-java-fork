// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.util.Context;

/** Samples for DscNode ListByAutomationAccount. */
public final class DscNodeListByAutomationAccountSamples {
    /*
     * x-ms-original-file: specification/automation/resource-manager/Microsoft.Automation/preview/2020-01-13-preview/examples/listAllDscNodesByAutomationAccount.json
     */
    /**
     * Sample code: List DSC nodes by Automation Account.
     *
     * @param manager Entry point to AutomationManager.
     */
    public static void listDSCNodesByAutomationAccount(com.azure.resourcemanager.automation.AutomationManager manager) {
        manager.dscNodes().listByAutomationAccount("rg", "myAutomationAccount33", null, null, null, null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/automation/resource-manager/Microsoft.Automation/preview/2020-01-13-preview/examples/listPagedDscNodesByAutomationAccountWithNodeConfigurationCustomFilter.json
     */
    /**
     * Sample code: List Paged DSC nodes by Automation Account with Node Configuration Custom filter.
     *
     * @param manager Entry point to AutomationManager.
     */
    public static void listPagedDSCNodesByAutomationAccountWithNodeConfigurationCustomFilter(
        com.azure.resourcemanager.automation.AutomationManager manager) {
        manager
            .dscNodes()
            .listByAutomationAccount(
                "rg",
                "myAutomationAccount33",
                "contains(properties/nodeConfiguration/name,'SetupServer.localhost,SetupClient.localhost,$$Not$$Configured$$')",
                0,
                4,
                "allpages",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/automation/resource-manager/Microsoft.Automation/preview/2020-01-13-preview/examples/listPagedDscNodesByAutomationAccountWithNoFilter.json
     */
    /**
     * Sample code: List Paged DSC nodes by Automation Account with no filters.
     *
     * @param manager Entry point to AutomationManager.
     */
    public static void listPagedDSCNodesByAutomationAccountWithNoFilters(
        com.azure.resourcemanager.automation.AutomationManager manager) {
        manager.dscNodes().listByAutomationAccount("rg", "myAutomationAccount33", null, 0, 2, "allpages", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/automation/resource-manager/Microsoft.Automation/preview/2020-01-13-preview/examples/listPagedDscNodesByAutomationAccountWithStatusFilter.json
     */
    /**
     * Sample code: List Paged DSC nodes by Automation Account with node status filter.
     *
     * @param manager Entry point to AutomationManager.
     */
    public static void listPagedDSCNodesByAutomationAccountWithNodeStatusFilter(
        com.azure.resourcemanager.automation.AutomationManager manager) {
        manager
            .dscNodes()
            .listByAutomationAccount(
                "rg",
                "myAutomationAccount33",
                "contains(properties/status,'Compliant,NotCompliant')",
                0,
                4,
                "allpages",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/automation/resource-manager/Microsoft.Automation/preview/2020-01-13-preview/examples/listPagedDscNodesByAutomationAccountWithVersionFilter.json
     */
    /**
     * Sample code: List Paged DSC nodes by Automation Account with version filter.
     *
     * @param manager Entry point to AutomationManager.
     */
    public static void listPagedDSCNodesByAutomationAccountWithVersionFilter(
        com.azure.resourcemanager.automation.AutomationManager manager) {
        manager
            .dscNodes()
            .listByAutomationAccount(
                "rg",
                "myAutomationAccount33",
                "properties/extensionHandler/any(eh: eh/version le '2.70')",
                0,
                4,
                "allpages",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/automation/resource-manager/Microsoft.Automation/preview/2020-01-13-preview/examples/listPagedDscNodesByAutomationAccountWithCompositeFilter.json
     */
    /**
     * Sample code: List Paged DSC nodes with filters separated by 'and'.
     *
     * @param manager Entry point to AutomationManager.
     */
    public static void listPagedDSCNodesWithFiltersSeparatedByAnd(
        com.azure.resourcemanager.automation.AutomationManager manager) {
        manager
            .dscNodes()
            .listByAutomationAccount(
                "rg",
                "myAutomationAccount33",
                "properties/extensionHandler/any(eh: eh/version gt '2.70') and contains(name,'sql') and"
                    + " contains(properties/nodeConfiguration/name,'$$Not$$Configured$$')",
                0,
                10,
                "allpages",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/automation/resource-manager/Microsoft.Automation/preview/2020-01-13-preview/examples/listPagedDscNodesByAutomationAccountWithNodeConfigurationNotAssignedFilter.json
     */
    /**
     * Sample code: List Paged DSC nodes by Automation Account where Node Configurations are not assigned filter.
     *
     * @param manager Entry point to AutomationManager.
     */
    public static void listPagedDSCNodesByAutomationAccountWhereNodeConfigurationsAreNotAssignedFilter(
        com.azure.resourcemanager.automation.AutomationManager manager) {
        manager
            .dscNodes()
            .listByAutomationAccount(
                "rg",
                "myAutomationAccount33",
                "properties/nodeConfiguration/name eq ''",
                0,
                20,
                "allpages",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/automation/resource-manager/Microsoft.Automation/preview/2020-01-13-preview/examples/listPagedDscNodesByAutomationAccountWithNameFilter.json
     */
    /**
     * Sample code: List Paged DSC nodes by Automation Account with name filter.
     *
     * @param manager Entry point to AutomationManager.
     */
    public static void listPagedDSCNodesByAutomationAccountWithNameFilter(
        com.azure.resourcemanager.automation.AutomationManager manager) {
        manager
            .dscNodes()
            .listByAutomationAccount(
                "rg", "myAutomationAccount33", "contains('DSCCOMP',name)", 0, 6, "allpages", Context.NONE);
    }
}
