// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/** Samples for SqlResources DeleteSqlTrigger. */
public final class SqlResourcesDeleteSqlTriggerSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-04-15/examples/CosmosDBSqlTriggerDelete.json
     */
    /**
     * Sample code: CosmosDBSqlTriggerDelete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBSqlTriggerDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getSqlResources()
            .deleteSqlTrigger(
                "rg1", "ddb1", "databaseName", "containerName", "triggerName", com.azure.core.util.Context.NONE);
    }
}
