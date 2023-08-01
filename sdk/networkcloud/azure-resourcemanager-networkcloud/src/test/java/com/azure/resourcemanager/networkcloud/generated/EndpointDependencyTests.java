// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.EndpointDependency;
import org.junit.jupiter.api.Assertions;

public final class EndpointDependencyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EndpointDependency model =
            BinaryData
                .fromString("{\"domainName\":\"twhrdxwzywqsm\",\"port\":5342463007448617537}")
                .toObject(EndpointDependency.class);
        Assertions.assertEquals("twhrdxwzywqsm", model.domainName());
        Assertions.assertEquals(5342463007448617537L, model.port());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EndpointDependency model =
            new EndpointDependency().withDomainName("twhrdxwzywqsm").withPort(5342463007448617537L);
        model = BinaryData.fromObject(model).toObject(EndpointDependency.class);
        Assertions.assertEquals("twhrdxwzywqsm", model.domainName());
        Assertions.assertEquals(5342463007448617537L, model.port());
    }
}
