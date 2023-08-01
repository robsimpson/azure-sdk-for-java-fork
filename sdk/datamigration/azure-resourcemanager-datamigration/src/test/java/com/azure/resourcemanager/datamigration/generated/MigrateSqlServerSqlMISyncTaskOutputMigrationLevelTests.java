// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datamigration.models.MigrateSqlServerSqlMISyncTaskOutputMigrationLevel;

public final class MigrateSqlServerSqlMISyncTaskOutputMigrationLevelTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MigrateSqlServerSqlMISyncTaskOutputMigrationLevel model =
            BinaryData
                .fromString(
                    "{\"resultType\":\"MigrationLevelOutput\",\"databaseCount\":316735321,\"state\":\"Skipped\",\"startedOn\":\"2021-07-27T23:48:23Z\",\"endedOn\":\"2021-05-11T04:04:50Z\",\"sourceServerName\":\"nbixxrti\",\"sourceServerVersion\":\"cpwpg\",\"sourceServerBrandVersion\":\"rc\",\"targetServerName\":\"tso\",\"targetServerVersion\":\"rkenx\",\"targetServerBrandVersion\":\"yyefrpmpdnqqs\",\"databaseErrorCount\":2132020384,\"id\":\"oqvm\"}")
                .toObject(MigrateSqlServerSqlMISyncTaskOutputMigrationLevel.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MigrateSqlServerSqlMISyncTaskOutputMigrationLevel model =
            new MigrateSqlServerSqlMISyncTaskOutputMigrationLevel();
        model = BinaryData.fromObject(model).toObject(MigrateSqlServerSqlMISyncTaskOutputMigrationLevel.class);
    }
}
