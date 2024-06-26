// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.TieringCostRehydrationInfo;
import org.junit.jupiter.api.Assertions;

public final class TieringCostRehydrationInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TieringCostRehydrationInfo model = BinaryData.fromString(
            "{\"objectType\":\"TieringCostRehydrationInfo\",\"rehydrationSizeInBytes\":1068598055053483626,\"retailRehydrationCostPerGBPerMonth\":63.147314650239416}")
            .toObject(TieringCostRehydrationInfo.class);
        Assertions.assertEquals(1068598055053483626L, model.rehydrationSizeInBytes());
        Assertions.assertEquals(63.147314650239416, model.retailRehydrationCostPerGBPerMonth());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TieringCostRehydrationInfo model
            = new TieringCostRehydrationInfo().withRehydrationSizeInBytes(1068598055053483626L)
                .withRetailRehydrationCostPerGBPerMonth(63.147314650239416);
        model = BinaryData.fromObject(model).toObject(TieringCostRehydrationInfo.class);
        Assertions.assertEquals(1068598055053483626L, model.rehydrationSizeInBytes());
        Assertions.assertEquals(63.147314650239416, model.retailRehydrationCostPerGBPerMonth());
    }
}
