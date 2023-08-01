// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated;

import com.azure.core.util.Context;

/** Samples for DenyAssignments GetById. */
public final class DenyAssignmentsGetByIdSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2022-04-01/examples/GetDenyAssignmentById.json
     */
    /**
     * Sample code: Get deny assignment by ID.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getDenyAssignmentByID(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .accessManagement()
            .roleAssignments()
            .manager()
            .roleServiceClient()
            .getDenyAssignments()
            .getByIdWithResponse(
                "subscriptions/subId/resourcegroups/rgname/providers/Microsoft.Authorization/denyAssignments/daId",
                Context.NONE);
    }
}
