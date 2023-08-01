// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for ReplicationLinks Failover. */
public final class ReplicationLinksFailoverSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ReplicationLinkFailover.json
     */
    /**
     * Sample code: Planned failover of a replication link.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void plannedFailoverOfAReplicationLink(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getReplicationLinks()
            .failover("Default", "sourcesvr", "gamma-db", "4891ca10-ebd0-47d7-9182-c722651780fb", Context.NONE);
    }
}
