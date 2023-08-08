// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appconfiguration.fluent.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.appconfiguration.models.ConnectionStatus;
import com.azure.resourcemanager.appconfiguration.models.PrivateEndpoint;
import com.azure.resourcemanager.appconfiguration.models.PrivateLinkServiceConnectionState;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionProperties model =
            BinaryData
                .fromString(
                    "{\"provisioningState\":\"Canceled\",\"privateEndpoint\":{\"id\":\"ypnddhsgcb\"},\"privateLinkServiceConnectionState\":{\"status\":\"Disconnected\",\"description\":\"ejk\",\"actionsRequired\":\"Recreate\"}}")
                .toObject(PrivateEndpointConnectionProperties.class);
        Assertions.assertEquals("ypnddhsgcb", model.privateEndpoint().id());
        Assertions.assertEquals(ConnectionStatus.DISCONNECTED, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("ejk", model.privateLinkServiceConnectionState().description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionProperties model =
            new PrivateEndpointConnectionProperties()
                .withPrivateEndpoint(new PrivateEndpoint().withId("ypnddhsgcb"))
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionState()
                        .withStatus(ConnectionStatus.DISCONNECTED)
                        .withDescription("ejk"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionProperties.class);
        Assertions.assertEquals("ypnddhsgcb", model.privateEndpoint().id());
        Assertions.assertEquals(ConnectionStatus.DISCONNECTED, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("ejk", model.privateLinkServiceConnectionState().description());
    }
}
