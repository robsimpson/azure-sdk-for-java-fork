// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated;

import com.azure.core.util.Context;

/** Samples for ServerKeys Get. */
public final class ServerKeysGetSamples {
    /*
     * x-ms-original-file: specification/mysql/resource-manager/Microsoft.DBforMySQL/stable/2020-01-01/examples/ServerKeyGet.json
     */
    /**
     * Sample code: Get the MySQL Server key.
     *
     * @param manager Entry point to MySqlManager.
     */
    public static void getTheMySQLServerKey(com.azure.resourcemanager.mysql.MySqlManager manager) {
        manager
            .serverKeys()
            .getWithResponse(
                "testrg", "testserver", "someVault_someKey_01234567890123456789012345678901", Context.NONE);
    }
}
