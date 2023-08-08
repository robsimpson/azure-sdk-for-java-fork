// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

import com.azure.resourcemanager.cosmos.models.ContinuousBackupRestoreLocation;

/** Samples for SqlResources RetrieveContinuousBackupInformation. */
public final class SqlResourcesRetrieveContinuousBackupInformationSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-04-15/examples/CosmosDBSqlContainerBackupInformation.json
     */
    /**
     * Sample code: CosmosDBSqlContainerBackupInformation.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBSqlContainerBackupInformation(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getSqlResources()
            .retrieveContinuousBackupInformation(
                "rgName",
                "ddb1",
                "databaseName",
                "containerName",
                new ContinuousBackupRestoreLocation().withLocation("North Europe"),
                com.azure.core.util.Context.NONE);
    }
}
