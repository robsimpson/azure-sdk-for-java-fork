// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datamigration.models.ConnectToTargetAzureDbForPostgreSqlSyncTaskOutput;

public final class ConnectToTargetAzureDbForPostgreSqlSyncTaskOutputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConnectToTargetAzureDbForPostgreSqlSyncTaskOutput model =
            BinaryData
                .fromString(
                    "{\"id\":\"pp\",\"targetServerVersion\":\"lcxog\",\"databases\":[\"onz\",\"nsikvmkqzeqqkdl\",\"fzxmhhvhgureodkw\"],\"targetServerBrandVersion\":\"dagxtibqd\",\"validationErrors\":[{\"message\":\"akbogqxndlkzgxh\",\"actionableMessage\":\"iplbpodxunkbebxm\",\"filePath\":\"yyntwl\",\"lineNumber\":\"qtkoievs\",\"hResult\":921402224,\"stackTrace\":\"q\"}]}")
                .toObject(ConnectToTargetAzureDbForPostgreSqlSyncTaskOutput.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConnectToTargetAzureDbForPostgreSqlSyncTaskOutput model =
            new ConnectToTargetAzureDbForPostgreSqlSyncTaskOutput();
        model = BinaryData.fromObject(model).toObject(ConnectToTargetAzureDbForPostgreSqlSyncTaskOutput.class);
    }
}
