// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.PrivateEndpointProperty;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointPropertyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointProperty model =
            BinaryData.fromString("{\"id\":\"nhwlrsffrzpwvl\"}").toObject(PrivateEndpointProperty.class);
        Assertions.assertEquals("nhwlrsffrzpwvl", model.id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointProperty model = new PrivateEndpointProperty().withId("nhwlrsffrzpwvl");
        model = BinaryData.fromObject(model).toObject(PrivateEndpointProperty.class);
        Assertions.assertEquals("nhwlrsffrzpwvl", model.id());
    }
}
