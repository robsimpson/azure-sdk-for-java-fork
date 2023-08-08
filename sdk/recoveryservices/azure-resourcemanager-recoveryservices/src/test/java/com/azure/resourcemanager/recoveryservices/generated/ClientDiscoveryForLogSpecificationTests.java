// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservices.models.ClientDiscoveryForLogSpecification;
import org.junit.jupiter.api.Assertions;

public final class ClientDiscoveryForLogSpecificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClientDiscoveryForLogSpecification model =
            BinaryData
                .fromString("{\"name\":\"yvshxmz\",\"displayName\":\"bzoggigrx\",\"blobDuration\":\"ur\"}")
                .toObject(ClientDiscoveryForLogSpecification.class);
        Assertions.assertEquals("yvshxmz", model.name());
        Assertions.assertEquals("bzoggigrx", model.displayName());
        Assertions.assertEquals("ur", model.blobDuration());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClientDiscoveryForLogSpecification model =
            new ClientDiscoveryForLogSpecification()
                .withName("yvshxmz")
                .withDisplayName("bzoggigrx")
                .withBlobDuration("ur");
        model = BinaryData.fromObject(model).toObject(ClientDiscoveryForLogSpecification.class);
        Assertions.assertEquals("yvshxmz", model.name());
        Assertions.assertEquals("bzoggigrx", model.displayName());
        Assertions.assertEquals("ur", model.blobDuration());
    }
}
