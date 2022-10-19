// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.RunQueryFilter;
import com.azure.resourcemanager.datafactory.models.RunQueryFilterOperand;
import com.azure.resourcemanager.datafactory.models.RunQueryFilterOperator;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class RunQueryFilterTests {
    @Test
    public void testDeserialize() {
        RunQueryFilter model =
            BinaryData
                .fromString(
                    "{\"operand\":\"RunEnd\",\"operator\":\"NotEquals\",\"values\":[\"oujmkcjhwqytj\",\"ybn\",\"jewgdrjerv\"]}")
                .toObject(RunQueryFilter.class);
        Assertions.assertEquals(RunQueryFilterOperand.RUN_END, model.operand());
        Assertions.assertEquals(RunQueryFilterOperator.NOT_EQUALS, model.operator());
        Assertions.assertEquals("oujmkcjhwqytj", model.values().get(0));
    }

    @Test
    public void testSerialize() {
        RunQueryFilter model =
            new RunQueryFilter()
                .withOperand(RunQueryFilterOperand.RUN_END)
                .withOperator(RunQueryFilterOperator.NOT_EQUALS)
                .withValues(Arrays.asList("oujmkcjhwqytj", "ybn", "jewgdrjerv"));
        model = BinaryData.fromObject(model).toObject(RunQueryFilter.class);
        Assertions.assertEquals(RunQueryFilterOperand.RUN_END, model.operand());
        Assertions.assertEquals(RunQueryFilterOperator.NOT_EQUALS, model.operator());
        Assertions.assertEquals("oujmkcjhwqytj", model.values().get(0));
    }
}