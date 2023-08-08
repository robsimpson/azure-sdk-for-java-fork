// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.models.OptimizedAutoscale;
import org.junit.jupiter.api.Assertions;

public final class OptimizedAutoscaleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OptimizedAutoscale model =
            BinaryData
                .fromString("{\"version\":246878783,\"isEnabled\":false,\"minimum\":1628568580,\"maximum\":88405242}")
                .toObject(OptimizedAutoscale.class);
        Assertions.assertEquals(246878783, model.version());
        Assertions.assertEquals(false, model.isEnabled());
        Assertions.assertEquals(1628568580, model.minimum());
        Assertions.assertEquals(88405242, model.maximum());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OptimizedAutoscale model =
            new OptimizedAutoscale()
                .withVersion(246878783)
                .withIsEnabled(false)
                .withMinimum(1628568580)
                .withMaximum(88405242);
        model = BinaryData.fromObject(model).toObject(OptimizedAutoscale.class);
        Assertions.assertEquals(246878783, model.version());
        Assertions.assertEquals(false, model.isEnabled());
        Assertions.assertEquals(1628568580, model.minimum());
        Assertions.assertEquals(88405242, model.maximum());
    }
}
