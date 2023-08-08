// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devspaces.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devspaces.models.Sku;
import com.azure.resourcemanager.devspaces.models.SkuName;
import com.azure.resourcemanager.devspaces.models.SkuTier;
import org.junit.jupiter.api.Assertions;

public final class SkuTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Sku model = BinaryData.fromString("{\"name\":\"S1\",\"tier\":\"Standard\"}").toObject(Sku.class);
        Assertions.assertEquals(SkuName.S1, model.name());
        Assertions.assertEquals(SkuTier.STANDARD, model.tier());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Sku model = new Sku().withName(SkuName.S1).withTier(SkuTier.STANDARD);
        model = BinaryData.fromObject(model).toObject(Sku.class);
        Assertions.assertEquals(SkuName.S1, model.name());
        Assertions.assertEquals(SkuTier.STANDARD, model.tier());
    }
}
