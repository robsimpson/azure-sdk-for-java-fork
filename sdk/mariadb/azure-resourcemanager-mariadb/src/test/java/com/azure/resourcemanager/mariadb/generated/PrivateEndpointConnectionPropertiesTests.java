// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mariadb.fluent.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.mariadb.models.PrivateEndpointProperty;
import com.azure.resourcemanager.mariadb.models.PrivateLinkServiceConnectionStateProperty;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionProperties model =
            BinaryData
                .fromString(
                    "{\"privateEndpoint\":{\"id\":\"nayqi\"},\"privateLinkServiceConnectionState\":{\"status\":\"nduhavhqlkthum\",\"description\":\"qolbgyc\",\"actionsRequired\":\"iertgccymvaolp\"},\"provisioningState\":\"lqlfm\"}")
                .toObject(PrivateEndpointConnectionProperties.class);
        Assertions.assertEquals("nayqi", model.privateEndpoint().id());
        Assertions.assertEquals("nduhavhqlkthum", model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("qolbgyc", model.privateLinkServiceConnectionState().description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionProperties model =
            new PrivateEndpointConnectionProperties()
                .withPrivateEndpoint(new PrivateEndpointProperty().withId("nayqi"))
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionStateProperty()
                        .withStatus("nduhavhqlkthum")
                        .withDescription("qolbgyc"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionProperties.class);
        Assertions.assertEquals("nayqi", model.privateEndpoint().id());
        Assertions.assertEquals("nduhavhqlkthum", model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("qolbgyc", model.privateLinkServiceConnectionState().description());
    }
}
