// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.models.RoutingTwin;
import com.azure.resourcemanager.iothub.models.RoutingTwinProperties;

public final class RoutingTwinTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RoutingTwin model =
            BinaryData
                .fromString(
                    "{\"tags\":\"dataqtaruoujmkcjhwq\",\"properties\":{\"desired\":\"datar\",\"reported\":\"datan\"}}")
                .toObject(RoutingTwin.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RoutingTwin model =
            new RoutingTwin()
                .withTags("dataqtaruoujmkcjhwq")
                .withProperties(new RoutingTwinProperties().withDesired("datar").withReported("datan"));
        model = BinaryData.fromObject(model).toObject(RoutingTwin.class);
    }
}
