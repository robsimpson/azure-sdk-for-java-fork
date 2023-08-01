// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.generated;

import com.azure.resourcemanager.azurearcdata.models.ArcSqlServerLicenseType;
import com.azure.resourcemanager.azurearcdata.models.ConnectionStatus;
import com.azure.resourcemanager.azurearcdata.models.DefenderStatus;
import com.azure.resourcemanager.azurearcdata.models.EditionType;
import com.azure.resourcemanager.azurearcdata.models.SqlServerInstanceProperties;
import com.azure.resourcemanager.azurearcdata.models.SqlVersion;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** Samples for SqlServerInstances Create. */
public final class SqlServerInstancesCreateSamples {
    /*
     * x-ms-original-file: specification/azurearcdata/resource-manager/Microsoft.AzureArcData/stable/2021-08-01/examples/CreateOrUpdateSqlServerInstance.json
     */
    /**
     * Sample code: Updates a SQL Server Instance tags.
     *
     * @param manager Entry point to AzureArcDataManager.
     */
    public static void updatesASQLServerInstanceTags(
        com.azure.resourcemanager.azurearcdata.AzureArcDataManager manager) {
        manager
            .sqlServerInstances()
            .define("testsqlServerInstance")
            .withRegion("northeurope")
            .withExistingResourceGroup("testrg")
            .withTags(mapOf("mytag", "myval"))
            .withProperties(
                new SqlServerInstanceProperties()
                    .withVersion(SqlVersion.SQL_SERVER_2017)
                    .withEdition(EditionType.DEVELOPER)
                    .withContainerResourceId("Arc Machine Name")
                    .withVCore("4")
                    .withStatus(ConnectionStatus.CONNECTED)
                    .withPatchLevel("patchlevel")
                    .withCollation("collation")
                    .withCurrentVersion("2008 R2")
                    .withInstanceName("name of instance")
                    .withTcpDynamicPorts("1433")
                    .withTcpStaticPorts("1433")
                    .withProductId("sql id")
                    .withLicenseType(ArcSqlServerLicenseType.FREE)
                    .withAzureDefenderStatusLastUpdated(OffsetDateTime.parse("2020-01-02T17:18:19.1234567Z"))
                    .withAzureDefenderStatus(DefenderStatus.PROTECTED))
            .create();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
