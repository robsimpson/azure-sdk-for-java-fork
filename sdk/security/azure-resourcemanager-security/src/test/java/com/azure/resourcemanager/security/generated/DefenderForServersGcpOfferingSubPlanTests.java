// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.DefenderForServersGcpOfferingSubPlan;
import com.azure.resourcemanager.security.models.SubPlan;
import org.junit.jupiter.api.Assertions;

public final class DefenderForServersGcpOfferingSubPlanTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DefenderForServersGcpOfferingSubPlan model =
            BinaryData.fromString("{\"type\":\"P1\"}").toObject(DefenderForServersGcpOfferingSubPlan.class);
        Assertions.assertEquals(SubPlan.P1, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DefenderForServersGcpOfferingSubPlan model = new DefenderForServersGcpOfferingSubPlan().withType(SubPlan.P1);
        model = BinaryData.fromObject(model).toObject(DefenderForServersGcpOfferingSubPlan.class);
        Assertions.assertEquals(SubPlan.P1, model.type());
    }
}
