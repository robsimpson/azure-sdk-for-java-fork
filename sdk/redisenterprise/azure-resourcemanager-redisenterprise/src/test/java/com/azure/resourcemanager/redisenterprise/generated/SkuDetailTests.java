// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.redisenterprise.models.SkuDetail;
import com.azure.resourcemanager.redisenterprise.models.SkuName;
import org.junit.jupiter.api.Assertions;

public final class SkuDetailTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SkuDetail model = BinaryData.fromString("{\"name\":\"Enterprise_E100\"}").toObject(SkuDetail.class);
        Assertions.assertEquals(SkuName.ENTERPRISE_E100, model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SkuDetail model = new SkuDetail().withName(SkuName.ENTERPRISE_E100);
        model = BinaryData.fromObject(model).toObject(SkuDetail.class);
        Assertions.assertEquals(SkuName.ENTERPRISE_E100, model.name());
    }
}
