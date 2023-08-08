// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.ForwardProxy;
import com.azure.resourcemanager.appcontainers.models.ForwardProxyConvention;
import org.junit.jupiter.api.Assertions;

public final class ForwardProxyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ForwardProxy model =
            BinaryData
                .fromString(
                    "{\"convention\":\"NoProxy\",\"customHostHeaderName\":\"bdxkqpxokaj\",\"customProtoHeaderName\":\"npime\"}")
                .toObject(ForwardProxy.class);
        Assertions.assertEquals(ForwardProxyConvention.NO_PROXY, model.convention());
        Assertions.assertEquals("bdxkqpxokaj", model.customHostHeaderName());
        Assertions.assertEquals("npime", model.customProtoHeaderName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ForwardProxy model =
            new ForwardProxy()
                .withConvention(ForwardProxyConvention.NO_PROXY)
                .withCustomHostHeaderName("bdxkqpxokaj")
                .withCustomProtoHeaderName("npime");
        model = BinaryData.fromObject(model).toObject(ForwardProxy.class);
        Assertions.assertEquals(ForwardProxyConvention.NO_PROXY, model.convention());
        Assertions.assertEquals("bdxkqpxokaj", model.customHostHeaderName());
        Assertions.assertEquals("npime", model.customProtoHeaderName());
    }
}
