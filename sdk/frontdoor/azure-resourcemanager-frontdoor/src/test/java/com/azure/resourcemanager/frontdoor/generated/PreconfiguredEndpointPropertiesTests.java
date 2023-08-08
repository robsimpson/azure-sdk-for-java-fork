// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.fluent.models.PreconfiguredEndpointProperties;
import com.azure.resourcemanager.frontdoor.models.EndpointType;
import org.junit.jupiter.api.Assertions;

public final class PreconfiguredEndpointPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PreconfiguredEndpointProperties model =
            BinaryData
                .fromString(
                    "{\"description\":\"rncsdtclu\",\"endpoint\":\"ypbsfgytguslfead\",\"endpointType\":\"AFD\",\"backend\":\"ukyhejhzis\"}")
                .toObject(PreconfiguredEndpointProperties.class);
        Assertions.assertEquals("rncsdtclu", model.description());
        Assertions.assertEquals("ypbsfgytguslfead", model.endpoint());
        Assertions.assertEquals(EndpointType.AFD, model.endpointType());
        Assertions.assertEquals("ukyhejhzis", model.backend());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PreconfiguredEndpointProperties model =
            new PreconfiguredEndpointProperties()
                .withDescription("rncsdtclu")
                .withEndpoint("ypbsfgytguslfead")
                .withEndpointType(EndpointType.AFD)
                .withBackend("ukyhejhzis");
        model = BinaryData.fromObject(model).toObject(PreconfiguredEndpointProperties.class);
        Assertions.assertEquals("rncsdtclu", model.description());
        Assertions.assertEquals("ypbsfgytguslfead", model.endpoint());
        Assertions.assertEquals(EndpointType.AFD, model.endpointType());
        Assertions.assertEquals("ukyhejhzis", model.backend());
    }
}
