// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated;

/** Samples for SqlVirtualMachines GetByResourceGroup. */
public final class SqlVirtualMachinesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/sqlvirtualmachine/resource-manager/Microsoft.SqlVirtualMachine/preview/2022-08-01-preview/examples/GetSqlVirtualMachine.json
     */
    /**
     * Sample code: Gets a SQL virtual machine.
     *
     * @param manager Entry point to SqlVirtualMachineManager.
     */
    public static void getsASQLVirtualMachine(
        com.azure.resourcemanager.sqlvirtualmachine.SqlVirtualMachineManager manager) {
        manager
            .sqlVirtualMachines()
            .getByResourceGroupWithResponse("testrg", "testvm", null, com.azure.core.util.Context.NONE);
    }
}
