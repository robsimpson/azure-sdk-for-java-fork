// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

/** Samples for WorkspaceManagedSqlServerDedicatedSqlMinimalTlsSettings List. */
public final class WorkspaceManagedSqlServerDedicatedSqlMinimalTlsSettingsListSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/stable/2021-06-01/examples/ListWorkspaceManagedSqlServerDedicatedSQLminimalTlsSettings.json
     */
    /**
     * Sample code: List dedicated sql minimal tls settings of the workspace managed sql server.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void listDedicatedSqlMinimalTlsSettingsOfTheWorkspaceManagedSqlServer(
        com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .workspaceManagedSqlServerDedicatedSqlMinimalTlsSettings()
            .list("workspace-6852", "workspace-2080", com.azure.core.util.Context.NONE);
    }
}
