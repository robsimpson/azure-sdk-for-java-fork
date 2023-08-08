// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.fluent.models.DistributedAvailabilityGroupInner;
import com.azure.resourcemanager.sql.models.ReplicationMode;

/** Samples for DistributedAvailabilityGroups Update. */
public final class DistributedAvailabilityGroupsUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/DistributedAvailabilityGroupsUpdate.json
     */
    /**
     * Sample code: Update the distributed availability group replication mode before deleting it.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateTheDistributedAvailabilityGroupReplicationModeBeforeDeletingIt(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getDistributedAvailabilityGroups()
            .update(
                "testrg",
                "testcl",
                "dag",
                new DistributedAvailabilityGroupInner().withReplicationMode(ReplicationMode.SYNC),
                Context.NONE);
    }
}
