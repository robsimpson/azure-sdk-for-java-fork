// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestack.models.ProductProperties;
import org.junit.jupiter.api.Assertions;

public final class ProductPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProductProperties model =
            BinaryData.fromString("{\"version\":\"ienjbdlwtgr\"}").toObject(ProductProperties.class);
        Assertions.assertEquals("ienjbdlwtgr", model.version());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProductProperties model = new ProductProperties().withVersion("ienjbdlwtgr");
        model = BinaryData.fromObject(model).toObject(ProductProperties.class);
        Assertions.assertEquals("ienjbdlwtgr", model.version());
    }
}
