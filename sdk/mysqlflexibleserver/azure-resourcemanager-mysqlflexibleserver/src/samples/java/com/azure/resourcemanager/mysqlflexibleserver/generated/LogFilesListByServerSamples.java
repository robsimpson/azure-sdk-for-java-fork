// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

/** Samples for LogFiles ListByServer. */
public final class LogFilesListByServerSamples {
    /*
     * x-ms-original-file: specification/mysql/resource-manager/Microsoft.DBforMySQL/LogFiles/preview/2021-12-01-preview/examples/LogFilesListByServer.json
     */
    /**
     * Sample code: List all server log files for a server.
     *
     * @param manager Entry point to MySqlManager.
     */
    public static void listAllServerLogFilesForAServer(
        com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager) {
        manager.logFiles().listByServer("testrg", "mysqltestsvc1", com.azure.core.util.Context.NONE);
    }
}
