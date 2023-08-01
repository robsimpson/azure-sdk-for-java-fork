// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated;

/** Samples for Exports Get. */
public final class ExportsGetSamples {
    /*
     * x-ms-original-file: specification/cost-management/resource-manager/Microsoft.CostManagement/stable/2022-10-01/examples/ExportGetByEnrollmentAccount.json
     */
    /**
     * Sample code: ExportGetByEnrollmentAccount.
     *
     * @param manager Entry point to CostManagementManager.
     */
    public static void exportGetByEnrollmentAccount(
        com.azure.resourcemanager.costmanagement.CostManagementManager manager) {
        manager
            .exports()
            .getWithResponse(
                "providers/Microsoft.Billing/billingAccounts/100/enrollmentAccounts/456",
                "TestExport",
                null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/cost-management/resource-manager/Microsoft.CostManagement/stable/2022-10-01/examples/ExportGetByManagementGroup.json
     */
    /**
     * Sample code: ExportGetByManagementGroup.
     *
     * @param manager Entry point to CostManagementManager.
     */
    public static void exportGetByManagementGroup(
        com.azure.resourcemanager.costmanagement.CostManagementManager manager) {
        manager
            .exports()
            .getWithResponse(
                "providers/Microsoft.Management/managementGroups/TestMG",
                "TestExport",
                null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/cost-management/resource-manager/Microsoft.CostManagement/stable/2022-10-01/examples/ExportGetByDepartment.json
     */
    /**
     * Sample code: ExportGetByDepartment.
     *
     * @param manager Entry point to CostManagementManager.
     */
    public static void exportGetByDepartment(com.azure.resourcemanager.costmanagement.CostManagementManager manager) {
        manager
            .exports()
            .getWithResponse(
                "providers/Microsoft.Billing/billingAccounts/12/departments/1234",
                "TestExport",
                null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/cost-management/resource-manager/Microsoft.CostManagement/stable/2022-10-01/examples/ExportGetBySubscription.json
     */
    /**
     * Sample code: ExportGetBySubscription.
     *
     * @param manager Entry point to CostManagementManager.
     */
    public static void exportGetBySubscription(com.azure.resourcemanager.costmanagement.CostManagementManager manager) {
        manager
            .exports()
            .getWithResponse(
                "subscriptions/00000000-0000-0000-0000-000000000000",
                "TestExport",
                null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/cost-management/resource-manager/Microsoft.CostManagement/stable/2022-10-01/examples/ExportGetByBillingAccount.json
     */
    /**
     * Sample code: ExportGetByBillingAccount.
     *
     * @param manager Entry point to CostManagementManager.
     */
    public static void exportGetByBillingAccount(
        com.azure.resourcemanager.costmanagement.CostManagementManager manager) {
        manager
            .exports()
            .getWithResponse(
                "providers/Microsoft.Billing/billingAccounts/123456",
                "TestExport",
                null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/cost-management/resource-manager/Microsoft.CostManagement/stable/2022-10-01/examples/ExportGetByResourceGroup.json
     */
    /**
     * Sample code: ExportGetByResourceGroup.
     *
     * @param manager Entry point to CostManagementManager.
     */
    public static void exportGetByResourceGroup(
        com.azure.resourcemanager.costmanagement.CostManagementManager manager) {
        manager
            .exports()
            .getWithResponse(
                "subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/MYDEVTESTRG",
                "TestExport",
                null,
                com.azure.core.util.Context.NONE);
    }
}
