// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datalakestore.fluent.models.UsageInner;

public final class UsageInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UsageInner model =
            BinaryData
                .fromString(
                    "{\"unit\":\"Bytes\",\"id\":\"bpxjmfl\",\"currentValue\":178812834,\"limit\":1423802799,\"name\":{\"value\":\"kcciwwzjuqkhr\",\"localizedValue\":\"jiwkuofoskghsau\"}}")
                .toObject(UsageInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UsageInner model = new UsageInner();
        model = BinaryData.fromObject(model).toObject(UsageInner.class);
    }
}
