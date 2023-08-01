// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.models.EventHubProperties;
import org.junit.jupiter.api.Assertions;

public final class EventHubPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EventHubProperties model =
            BinaryData
                .fromString(
                    "{\"retentionTimeInDays\":6730920882568093114,\"partitionCount\":230645799,\"partitionIds\":[\"ej\"],\"path\":\"vwryoqpso\",\"endpoint\":\"ctazakljlahbcryf\"}")
                .toObject(EventHubProperties.class);
        Assertions.assertEquals(6730920882568093114L, model.retentionTimeInDays());
        Assertions.assertEquals(230645799, model.partitionCount());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EventHubProperties model =
            new EventHubProperties().withRetentionTimeInDays(6730920882568093114L).withPartitionCount(230645799);
        model = BinaryData.fromObject(model).toObject(EventHubProperties.class);
        Assertions.assertEquals(6730920882568093114L, model.retentionTimeInDays());
        Assertions.assertEquals(230645799, model.partitionCount());
    }
}
