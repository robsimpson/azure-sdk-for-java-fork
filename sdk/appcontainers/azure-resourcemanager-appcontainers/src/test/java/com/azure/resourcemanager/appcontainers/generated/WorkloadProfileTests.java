// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.WorkloadProfile;
import org.junit.jupiter.api.Assertions;

public final class WorkloadProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkloadProfile model =
            BinaryData
                .fromString(
                    "{\"name\":\"oylaxxul\",\"workloadProfileType\":\"disdosfjbjsvgj\",\"minimumCount\":1257369093,\"maximumCount\":1647149514}")
                .toObject(WorkloadProfile.class);
        Assertions.assertEquals("oylaxxul", model.name());
        Assertions.assertEquals("disdosfjbjsvgj", model.workloadProfileType());
        Assertions.assertEquals(1257369093, model.minimumCount());
        Assertions.assertEquals(1647149514, model.maximumCount());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkloadProfile model =
            new WorkloadProfile()
                .withName("oylaxxul")
                .withWorkloadProfileType("disdosfjbjsvgj")
                .withMinimumCount(1257369093)
                .withMaximumCount(1647149514);
        model = BinaryData.fromObject(model).toObject(WorkloadProfile.class);
        Assertions.assertEquals("oylaxxul", model.name());
        Assertions.assertEquals("disdosfjbjsvgj", model.workloadProfileType());
        Assertions.assertEquals(1257369093, model.minimumCount());
        Assertions.assertEquals(1647149514, model.maximumCount());
    }
}
