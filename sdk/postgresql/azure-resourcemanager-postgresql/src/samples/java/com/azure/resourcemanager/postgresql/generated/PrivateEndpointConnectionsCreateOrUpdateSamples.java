// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated;

import com.azure.resourcemanager.postgresql.models.PrivateLinkServiceConnectionStateProperty;

/** Samples for PrivateEndpointConnections CreateOrUpdate. */
public final class PrivateEndpointConnectionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/postgresql/resource-manager/Microsoft.DBforPostgreSQL/stable/2018-06-01/examples/PrivateEndpointConnectionUpdate.json
     */
    /**
     * Sample code: Approve or reject a private endpoint connection with a given name.
     *
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void approveOrRejectAPrivateEndpointConnectionWithAGivenName(
        com.azure.resourcemanager.postgresql.PostgreSqlManager manager) {
        manager
            .privateEndpointConnections()
            .define("private-endpoint-connection-name")
            .withExistingServer("Default", "test-svr")
            .withPrivateLinkServiceConnectionState(
                new PrivateLinkServiceConnectionStateProperty()
                    .withStatus("Approved")
                    .withDescription("Approved by johndoe@contoso.com"))
            .create();
    }
}
