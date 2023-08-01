// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

/** Samples for SqlPoolBlobAuditingPolicies Get. */
public final class SqlPoolBlobAuditingPoliciesGetSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/stable/2021-06-01/examples/GetSqlPoolBlobAuditing.json
     */
    /**
     * Sample code: Get blob auditing policy of a SQL Analytics pool.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void getBlobAuditingPolicyOfASQLAnalyticsPool(
        com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .sqlPoolBlobAuditingPolicies()
            .getWithResponse(
                "blobauditingtest-6852", "blobauditingtest-2080", "testdb", com.azure.core.util.Context.NONE);
    }
}
