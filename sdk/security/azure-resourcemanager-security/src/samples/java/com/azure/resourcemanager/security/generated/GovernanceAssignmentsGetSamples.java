// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.Context;

/** Samples for GovernanceAssignments Get. */
public final class GovernanceAssignmentsGetSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2022-01-01-preview/examples/GovernanceAssignments/GetGovernanceAssignment_example.json
     */
    /**
     * Sample code: Get security governanceAssignment by specific governanceAssignmentKey.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getSecurityGovernanceAssignmentBySpecificGovernanceAssignmentKey(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .governanceAssignments()
            .getWithResponse(
                "subscriptions/c32e05d9-7207-4e22-bdf4-4f7d9c72e5fd/resourceGroups/compute_servers/providers/Microsoft.Compute/virtualMachines/win2012",
                "6b9421dd-5555-2251-9b3d-2be58e2f82cd",
                "6634ff9f-127b-4bf2-8e6e-b1737f5e789c",
                Context.NONE);
    }
}